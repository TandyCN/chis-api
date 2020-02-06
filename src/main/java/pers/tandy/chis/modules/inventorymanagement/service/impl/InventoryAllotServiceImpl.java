package pers.tandy.chis.modules.inventorymanagement.service.impl;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.tandy.chis.main.common.enums.ApproveStateEnum;
import pers.tandy.chis.main.component.KeyUtils;
import pers.tandy.chis.modules.inventorymanagement.bean.Inventory;
import pers.tandy.chis.modules.inventorymanagement.bean.InventoryAllot;
import pers.tandy.chis.modules.inventorymanagement.dao.InventoryAllotMapper;
import pers.tandy.chis.modules.inventorymanagement.service.InventoryAllotService;
import pers.tandy.chis.modules.inventorymanagement.service.InventoryService;
import pers.tandy.chis.modules.systemmanagement.bean.User;

import java.util.*;

/**
 * @Author: Tandy
 * @Date: 2019/10/15 17:55
 * @Version 1.0
 */
@Service
public class InventoryAllotServiceImpl implements InventoryAllotService {

    private InventoryAllotMapper inventoryAllotMapper;
    @Autowired
    public void setInventoryAllotMapper(InventoryAllotMapper inventoryAllotMapper) {
        this.inventoryAllotMapper = inventoryAllotMapper;
    }

    private InventoryService inventoryService;
    @Autowired
    public void setInventoryService(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    /*----------------------------------------------------------------------------------------------------------------*/

    @Override
    public void save(List<InventoryAllot> allotList) {
        // 获取用户信息、 流水号、 明细号
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        String lsh = KeyUtils.getLSH(user.getId());
        Integer mxh = 1;

        // 填写要保存的数据
        ListIterator<InventoryAllot> listIterator = allotList.listIterator();
        while (listIterator.hasNext()) {
            InventoryAllot allot = listIterator.next();

            allot.setLsh(lsh);
            allot.setMxh((mxh++).toString());
            allot.setSysClinicId(user.getSysClinicId());
            allot.setCreatorId(user.getId());
            allot.setCreationDate(new Date());
            allot.setApproveState(ApproveStateEnum.PENDING.getIndex());
        }

        // 提交保存
        inventoryAllotMapper.insertList(allotList);
    }

    @Override
    public void unapproved(String lsh) {
        List<InventoryAllot> inventoryAllotList = this.parseToObjectList(this.getByLsh(lsh));
        if (!this.examineApproveState(inventoryAllotList, ApproveStateEnum.PENDING.getIndex())) {
            throw new RuntimeException("操作未被允许, 单据明细需为待审批状态");
        }

        User user = (User) SecurityUtils.getSubject().getPrincipal(); // 获取用户信息
        inventoryAllotMapper.updateApproveStateByLsh(user.getId(), new Date(), ApproveStateEnum.UNAPPROVED.getIndex(), lsh);
    }

    @Override
    public void approved(String lsh) {
        List<InventoryAllot> inventoryAllotList = this.parseToObjectList(this.getByLsh(lsh));
        if (!this.examineApproveState(inventoryAllotList, ApproveStateEnum.PENDING.getIndex())) {
            throw new RuntimeException("操作未被允许, 单据明细需为待审批状态");
        }
        // 获取用户信息
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        // 更新单据为通过状态
        inventoryAllotMapper.updateApproveStateByLsh(user.getId(), new Date(), ApproveStateEnum.APPROVED.getIndex(), lsh);

        // 获取要进行调拨的库存
        List<Integer> inventoryIdList = new ArrayList<>();
        Map<Integer, InventoryAllot> inventoryAllotMap = new HashMap<>();
        for (InventoryAllot inventoryAllot : inventoryAllotList) {
            inventoryIdList.add(inventoryAllot.getIymInventoryId()); // 要进行调拨的库存ID集合
            inventoryAllotMap.put(inventoryAllot.getIymInventoryId(), inventoryAllot);  // 封装可以根据库存ID 获取对应调拨对象的 Map
        }
        // 获取调拨库存集合
        List<Inventory> inventoryList = inventoryService.getByIdList(inventoryIdList);

        // 调出操作(减库存)
        for (Inventory inventory : inventoryList) {
            int inventoryId = inventory.getId();
            short allotQuantity = inventoryAllotMap.get(inventoryId).getQuantity(); // 获取调拨数量
            // 判断库存是否足够
            if ((inventory.getQuantity() - allotQuantity) < 0) {
                throw new RuntimeException("商品编码:【" + inventory.getGsmGoodsOid() + "】" +
                        " 商品名称:【" + inventory.getGsmGoodsName() + "】" +
                        " 批号:【" + inventory.getPh() + "】" +
                        " 批次号:【" + inventory.getPch() + "】" +
                        " 库存数量不足");
            }
            inventory.setQuantity(allotQuantity); // 修改数量为调拨数量进行扣减
        }
        // 进行库存数量扣减
        inventoryService.updateQuantityByList(inventoryList);

        // 调入操作(将库存复制到目标仓库)
        for (Inventory inventory : inventoryList) {
            int inventoryId = inventory.getId();
            // short allotQuantity = inventoryAllotMap.get(inventoryId).getQuantity();  // 获取调拨数量
            inventory.setId(null); // 重置对象ID
            inventory.setIymInventoryTypeId(inventoryAllotMap.get(inventoryId).getToIymInventoryTypeId());  // 修改对象仓库ID
            // inventory.setQuantity(allotQuantity); // 修改数量为调拨数量 (在调出操作时已经对其赋值)
        }
        // 保存调入库存到目标仓库
        inventoryService.save(inventoryList);
    }

    @Override
    public List<Map<String, Object>> getClinicListByCriteria(String[] creationDate,
                                                             Integer sysClinicId,
                                                             Byte approveState,
                                                             String gsmGoodsName) {
        return inventoryAllotMapper.selectClinicListByCriteria(creationDate, sysClinicId, approveState, gsmGoodsName);
    }

    @Override
    public List<Map<String, Object>> getClinicLshGroupListByCriteria(String[] creationDate,
                                                                     Integer sysClinicId,
                                                                     Byte approveState) {
        return inventoryAllotMapper.selectClinicLshGroupListByCriteria(creationDate, sysClinicId, approveState);
    }

    @Override
    public List<Map<String, Object>> getByLsh(String lsh) {
        return inventoryAllotMapper.selectByLsh(lsh);
    }


}
