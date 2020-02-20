package pers.tandy.chis.modules.inventorymanagement.service.impl;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.tandy.chis.main.common.enums.ApproveStateEnum;
import pers.tandy.chis.main.component.DecimalUtils;
import pers.tandy.chis.main.component.KeyUtils;
import pers.tandy.chis.modules.financialmanagement.bean.PayableAccount;
import pers.tandy.chis.modules.financialmanagement.service.PayableAccountService;
import pers.tandy.chis.modules.inventorymanagement.bean.Inventory;
import pers.tandy.chis.modules.inventorymanagement.bean.InventorySubtract;
import pers.tandy.chis.modules.inventorymanagement.dao.InventorySubtractMapper;
import pers.tandy.chis.modules.inventorymanagement.service.InventoryService;
import pers.tandy.chis.modules.inventorymanagement.service.InventorySubtractService;
import pers.tandy.chis.modules.purchasemanagement.service.SupplierService;
import pers.tandy.chis.modules.systemmanagement.bean.User;

import java.util.*;

/**
 * @Author: Tandy
 * @Date: 2019/10/9 17:27
 * @Version 1.0
 */
@Service
public class InventorySubtractServiceImpl implements InventorySubtractService {

    private InventorySubtractMapper inventorySubtractMapper;
    @Autowired
    public void setInventorySubtractMapper(InventorySubtractMapper inventorySubtractMapper) {
        this.inventorySubtractMapper = inventorySubtractMapper;
    }

    private InventoryService inventoryService;
    @Autowired
    public void setInventoryService(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    private PayableAccountService payableAccountService;
    @Autowired
    public void setPayableAccountService(PayableAccountService payableAccountService) {
        this.payableAccountService = payableAccountService;
    }

    private SupplierService supplierService;
    @Autowired
    public void setSupplierService(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    /*----------------------------------------------------------------------------------------------------------------*/

    @Override
    public void save(List<InventorySubtract> subtractList, Byte actionType) {
        // 获取要操作库存数据
        List<Integer> inventoryIdList = new ArrayList<>(); // 库存ID集合
        Map<Integer, InventorySubtract> subtractMap = new HashMap<>(); // 库存ID + 退货记录
        for (InventorySubtract subtract : subtractList) {
            inventoryIdList.add(subtract.getIymInventoryId());
            subtractMap.put(subtract.getIymInventoryId(), subtract);
        }
        // 根据库存ID集合获取对应的库存集合
        List<Inventory> inventoryList = inventoryService.getByIdList(inventoryIdList);

        // 获取用户信息、获取流水号、 明细号
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        String lsh = KeyUtils.getLSH(user.getId());
        int mxh = 1;

        // 准备提交的信息
        subtractList.clear();
        // 遍历库存集合
        for (Inventory inventory: inventoryList) {
            // 获取对应的退货记录
            InventorySubtract subtract = subtractMap.get(inventory.getId());

            // 将退货记录的部分属性使用库存属性赋值
            subtract.setLsh(lsh);
            subtract.setMxh(String.valueOf(mxh++));
            subtract.setSysClinicId(user.getSysClinicId());
            subtract.setIymInventoryTypeId(inventory.getIymInventoryTypeId());
            subtract.setGsmGoodsId(inventory.getGsmGoodsId());
            subtract.setCostPrice(inventory.getCostPrice());
            subtract.setPurchaseTaxRate(inventory.getPurchaseTaxRate());
            subtract.setSellTaxRate(inventory.getSellTaxRate());
            subtract.setPh(inventory.getPh());
            subtract.setPch(inventory.getPch());
            subtract.setProducedDate(inventory.getProducedDate());
            subtract.setExpiryDate(inventory.getExpiryDate());
            subtract.setPemSupplierId(inventory.getPemSupplierId());
            subtract.setIymInventoryAddId(inventory.getIymInventoryAddId());
            subtract.setActionType(actionType);
            subtract.setCreatorId(user.getId());
            subtract.setCreationDate(new Date());
            subtract.setApproveState(ApproveStateEnum.PENDING.getIndex());

            subtractList.add(subtract);
        }

        inventorySubtractMapper.insertList(subtractList);
    }

    @Override
    public void unapproved(String lsh) {
        List<InventorySubtract> inventorySubtractList = this.parseToObjectList(this.getByLsh(lsh));
        if (!this.examineApproveState(inventorySubtractList, ApproveStateEnum.PENDING.getIndex())) {
            throw new RuntimeException("操作未被允许, 单据明细需为待审批状态");
        }

        // 获取创建人信息
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        inventorySubtractMapper.updateApproveStateByLsh(user.getId(), new Date(), ApproveStateEnum.UNAPPROVED.getIndex(), lsh);
    }

    @Override
    public void approved(String lsh) {
        List<InventorySubtract> inventorySubtractList = this.parseToObjectList(this.getByLsh(lsh));
        if (!this.examineApproveState(inventorySubtractList, ApproveStateEnum.PENDING.getIndex())) {
            throw new RuntimeException("操作未被允许, 单据明细需为待审批状态");
        }
        // 获取创建人信息
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        inventorySubtractMapper.updateApproveStateByLsh(user.getId(), new Date(), ApproveStateEnum.APPROVED.getIndex(), lsh);

        // 更新库存
        // 获取要操作库存数据
        List<Integer> inventoryIdList = new ArrayList<>();
        Map<Integer, InventorySubtract> subtractMap = new HashMap<>();
        for (InventorySubtract subtract : inventorySubtractList) {
            inventoryIdList.add(subtract.getIymInventoryId());
            subtractMap.put(subtract.getIymInventoryId(), subtract);
        }
        List<Inventory> inventoryList = inventoryService.getByIdList(inventoryIdList);

        // 准备提交的数据
        for (Inventory inventory : inventoryList) {
            InventorySubtract subtract = subtractMap.get(inventory.getId());
            // 判断库存数量是否足够
            if ((inventory.getQuantity() - subtract.getQuantity()) < 0) {
                throw new RuntimeException("商品编码:【" + inventory.getGsmGoodsOid() + "】" +
                        " 商品名称:【" + inventory.getGsmGoodsName() + "】" +
                        " 批号:【" + inventory.getPh() + "】" +
                        " 批次号:【" + inventory.getPch() + "】" +
                        " 库存数量不足");
            }
            inventory.setQuantity(subtract.getQuantity());
        }
        // 更新库存数量
        inventoryService.updateQuantityByList(inventoryList);

        // 供应商应付账款记账
        this.savePayableAccount(inventorySubtractList);
    }

    private void savePayableAccount(List<InventorySubtract> inventorySubtractList) {
        Integer pemSupplierId = null;
        float payableAmount = 0;
        PayableAccount payableAccount;
        List<PayableAccount> payableAccountList = new ArrayList<>();

        for (InventorySubtract inventorySubtract : inventorySubtractList) {
            // 获取本次供应商应付总金额
            if (pemSupplierId == null) {
                pemSupplierId = inventorySubtract.getPemSupplierId();
            }
            payableAmount += inventorySubtract.getQuantity() * inventorySubtract.getCostPrice();

            // 获取供应商应付账款明细
            payableAccount = new PayableAccount();
            payableAccount.setLsh(inventorySubtract.getLsh());
            payableAccount.setMxh(inventorySubtract.getMxh());
            payableAccount.setGsmGoodsId(inventorySubtract.getGsmGoodsId());
            payableAccount.setPh(inventorySubtract.getPh());
            payableAccount.setPch(inventorySubtract.getPch());
            payableAccount.setCostPrice(inventorySubtract.getCostPrice());
            payableAccount.setQuantity((short) (inventorySubtract.getQuantity() * -1)); // 将数量改为负数
            payableAccount.setPurchaseTaxRate(inventorySubtract.getPurchaseTaxRate());
            payableAccount.setSellTaxRate(inventorySubtract.getSellTaxRate());
            payableAccount.setPemSupplierId(inventorySubtract.getPemSupplierId());
            payableAccount.setIymInventoryAddId(inventorySubtract.getIymInventoryAddId());
            payableAccount.setSysClinicId(inventorySubtract.getSysClinicId());
            payableAccount.setCreatorId(inventorySubtract.getCreatorId());
            payableAccount.setCreationDate(inventorySubtract.getCreationDate());

            payableAccountList.add(payableAccount);
        }

        // 将应付金额四舍五入保留2位小数
        payableAmount = DecimalUtils.roundHalfUp(payableAmount, 2);
        // 扣减供应商应付账款金额
        supplierService.subtractArrearagesAmount(pemSupplierId, payableAmount);
        // 保存应付账款记录
        payableAccountService.saveList(payableAccountList);
    }

    @Override
    public List<Map<String, Object>> getClinicListByCriteria(String[] creationDate, Integer sysClinicId, Byte approveState, String pemSupplierName) {
        return inventorySubtractMapper.selectClinicListByCriteria(creationDate, sysClinicId, approveState, pemSupplierName);
    }

    @Override
    public List<Map<String, Object>> getClinicLshGroupListByCriteria(
            String[] creationDate, Integer sysClinicId, Byte approveState, String pemSupplierName) {
        return inventorySubtractMapper.selectClinicLshGroupListByCriteria(creationDate, sysClinicId, approveState, pemSupplierName);
    }

    @Override
    public List<Map<String, Object>> getByLsh(String lsh) {
        return inventorySubtractMapper.selectByLsh(lsh);
    }


}
