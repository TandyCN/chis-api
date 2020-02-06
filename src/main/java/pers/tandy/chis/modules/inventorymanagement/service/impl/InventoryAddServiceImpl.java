package pers.tandy.chis.modules.inventorymanagement.service.impl;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.tandy.chis.main.common.enums.ApproveStateEnum;
import pers.tandy.chis.main.component.DecimalUtils;
import pers.tandy.chis.main.component.KeyUtils;
import pers.tandy.chis.modules.inventorymanagement.bean.Inventory;
import pers.tandy.chis.modules.inventorymanagement.bean.InventoryAdd;
import pers.tandy.chis.modules.inventorymanagement.dao.InventoryAddMapper;
import pers.tandy.chis.modules.inventorymanagement.service.InventoryAddService;
import pers.tandy.chis.modules.inventorymanagement.service.InventoryService;
import pers.tandy.chis.modules.purchasemanagement.service.PurchaseOrderService;
import pers.tandy.chis.modules.systemmanagement.bean.User;

import java.util.*;

/**
 * @Author: Tandy
 * @Date: 2019/9/21 21:52
 * @Version 1.0
 */
@Service
public class InventoryAddServiceImpl implements InventoryAddService {

    private InventoryAddMapper inventoryAddMapper;
    @Autowired
    public void setInventoryAddMapper(InventoryAddMapper inventoryAddMapper) {
        this.inventoryAddMapper = inventoryAddMapper;
    }

    private PurchaseOrderService purchaseOrderService;
    @Autowired
    public void setPurchaseOrderService(PurchaseOrderService purchaseOrderService) {
        this.purchaseOrderService = purchaseOrderService;
    }

    private InventoryService inventoryService;
    @Autowired
    public void setInventoryService(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    /*----------------------------------------------------------------------------------------------------------------*/

    @Override
    public void save(List<InventoryAdd> inventoryAddList, String orderLsh, Byte actionType) {
        // 获取用户信息
        User user = (User) SecurityUtils.getSubject().getPrincipal();

        // 将订单设置为已入库状态(此操作不通过则不继续执行)
        List<Map<String, Object>> clinicOrderList = purchaseOrderService.getClinicListByLsh(orderLsh, user.getSysClinicId());
        purchaseOrderService.updateInventoryStateByCriteria(true, purchaseOrderService.convertToObjectList(clinicOrderList));

        // 对同一商品、相同批号、相同成本价、相同有效期进行合并
        Map<String, InventoryAdd> distinctMap = new HashMap<>();
        for (InventoryAdd inventoryAdd : inventoryAddList) {
            float costPrice = DecimalUtils.roundHalfUp(inventoryAdd.getCostPrice(), 4);
            String key = inventoryAdd.getGsmGoodsId() + inventoryAdd.getPh() + costPrice + inventoryAdd.getExpiryDate();
            InventoryAdd distinctIa = distinctMap.get(key);

            if (distinctIa != null && // 如果不为 null
                inventoryAdd.getGsmGoodsId().intValue() == distinctIa.getGsmGoodsId().intValue() && // 商品ID相同
                inventoryAdd.getPh().equals(distinctIa.getPh()) && // 商品批号相同
                costPrice == DecimalUtils.roundHalfUp(distinctIa.getCostPrice(), 4) && // 商品进价相同
                inventoryAdd.getExpiryDate().compareTo(distinctIa.getExpiryDate()) == 0 // 有效期相同
            ) {
                short quantity = (short)(inventoryAdd.getQuantity() + distinctIa.getQuantity()); // 合并数量
                inventoryAdd.setQuantity(quantity); // 进行赋值
            }

            distinctMap.put(key, inventoryAdd);
        }

        // 获取流水号、 明细号
        String lsh = KeyUtils.getLSH(user.getId());
        int mxh = 1;

        // 清空 addList 用于放置提交保存的数据
        inventoryAddList.clear();

        // 获取合并后的数据 并填充部分需要提交的信息
        for (String key : distinctMap.keySet()) {
            InventoryAdd inventoryAdd = distinctMap.get(key);

            inventoryAdd.setLsh(lsh); // 设置流水号
            inventoryAdd.setMxh(String.valueOf(mxh++)); // 设置明细号
            inventoryAdd.setPch(KeyUtils.getPch()); // 设置批次号
            inventoryAdd.setActionType(actionType); // 操作类型
            inventoryAdd.setSysClinicId(user.getSysClinicId()); // 机构ID
            inventoryAdd.setCreatorId(user.getId()); // 创建人ID
            inventoryAdd.setCreationDate(new Date()); // 创建时间
            inventoryAdd.setApproveState(ApproveStateEnum.PENDING.getIndex()); // 设置审批状态

            inventoryAddList.add(inventoryAdd);
        }

        // 提交数据(添加入库记录)
        inventoryAddMapper.insertList(inventoryAddList);
    }

    @Override
    public void unapproved(String lsh) {
        List<InventoryAdd> inventoryAddList = this.parseToObjectList(this.getByLsh(lsh));
        if (!this.examineApproveState(inventoryAddList, ApproveStateEnum.PENDING.getIndex())) {
            throw new RuntimeException("操作未被允许, 单据明细需为待审批状态");
        }

        // 获取创建人信息
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        inventoryAddMapper.updateApproveStateByLsh(
                user.getId(), new Date(), ApproveStateEnum.UNAPPROVED.getIndex(), lsh, ApproveStateEnum.PENDING.getIndex());
    }

    @Override
    public void approved(String lsh) {
        List<InventoryAdd> inventoryAddList = this.parseToObjectList(this.getByLsh(lsh));
        if (!this.examineApproveState(inventoryAddList, ApproveStateEnum.PENDING.getIndex())) {
            throw new RuntimeException("操作未被允许, 单据明细需为待审批状态");
        }
        // 获取创建人信息
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        inventoryAddMapper.updateApproveStateByLsh(user.getId(), new Date(), ApproveStateEnum.APPROVED.getIndex(),
                lsh, ApproveStateEnum.PENDING.getIndex());

        // 添加库存
        List<Inventory> inventoryList = new ArrayList<>();
        for (InventoryAdd inventoryAdd : inventoryAddList) {
            Inventory inventory = new Inventory();

            inventory.setSysClinicId(user.getSysClinicId()); // 机构ID
            inventory.setIymInventoryTypeId(inventoryAdd.getIymInventoryTypeId()); // 仓库ID
            inventory.setGsmGoodsId(inventoryAdd.getGsmGoodsId()); // 商品ID
            inventory.setPh(inventoryAdd.getPh()); // 批号
            inventory.setPch(inventoryAdd.getPch()); // 批次号
            inventory.setQuantity(inventoryAdd.getQuantity()); // 入库数量
            inventory.setCostPrice(inventoryAdd.getCostPrice()); // 成本价
            inventory.setPurchaseTaxRate(inventoryAdd.getPurchaseTaxRate()); // 进货税率
            inventory.setSellTaxRate(inventoryAdd.getSellTaxRate()); // 销售税率
            inventory.setProducedDate(inventoryAdd.getProducedDate()); // 生产日期
            inventory.setExpiryDate(inventoryAdd.getExpiryDate()); // 有效期至
            inventory.setPemSupplierId(inventoryAdd.getPemSupplierId()); // 供应商ID
            inventory.setIymInventoryAddId(inventoryAdd.getId());

            inventoryList.add(inventory);
        }
        inventoryService.save(inventoryList);
    }

    @Override
    public List<Map<String, Object>> getClinicListByCriteria(String[] creationDate,
                                                             Integer sysClinicId,
                                                             Byte approveState,
                                                             String pemSupplierName) {
        return inventoryAddMapper.selectClinicListByCriteria(creationDate, sysClinicId, approveState, pemSupplierName);
    }

    @Override
    public List<Map<String, Object>> getClinicLshGroupListByCriteria(String[] creationDate,
                                                                     Integer sysClinicId,
                                                                     Byte approveState,
                                                                     String pemSupplierName) {
        return inventoryAddMapper.selectClinicLshGroupListByCriteria(creationDate, sysClinicId, approveState, pemSupplierName);
    }

    @Override
    public List<Map<String, Object>> getByLsh(String lsh) {
        return inventoryAddMapper.selectByLsh(lsh);
    }


}
