package pers.tandy.chis.modules.chargesitemmanagement.service.impl;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.tandy.chis.main.common.enums.ApproveStateEnum;
import pers.tandy.chis.modules.chargesitemmanagement.bean.Item;
import pers.tandy.chis.modules.chargesitemmanagement.bean.ItemApply;
import pers.tandy.chis.modules.chargesitemmanagement.dao.ItemApplyMapper;
import pers.tandy.chis.modules.chargesitemmanagement.service.ItemApplyService;
import pers.tandy.chis.modules.chargesitemmanagement.service.ItemService;
import pers.tandy.chis.modules.systemmanagement.bean.User;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: Tandy
 * @Date: 2019/8/7 15:45
 * @Version 1.0
 */
@Service
public class ItemApplyServiceImpl implements ItemApplyService {

    private ItemApplyMapper itemApplyMapper;
    @Autowired
    public void setItemApplyMapper(ItemApplyMapper itemApplyMapper) {
        this.itemApplyMapper = itemApplyMapper;
    }

    private ItemService itemService;
    @Autowired
    public void setItemService(ItemService itemService) {
        this.itemService = itemService;
    }

    /* -------------------------------------------------------------------------------------------------------------- */

    @Override
    public void save(ItemApply itemApply) {
        // 获取操作人信息
        User user = (User) SecurityUtils.getSubject().getPrincipal();

        itemApply.setCreatorId(user.getId());
        itemApply.setCreationDate(new Date());
        itemApply.setApproveState(ApproveStateEnum.PRICING.getIndex());

        itemApplyMapper.insert(itemApply);
    }

    @Override
    public void cancel(ItemApply itemApply) {
        if (itemApply.getApproveState() != ApproveStateEnum.PRICING.getIndex()) {
            throw new RuntimeException("操作未被允许, 单据需为待定价状态");
        }

        itemApply.setApproveState(ApproveStateEnum.CANCEL.getIndex());
        itemApplyMapper.updateByPrimaryKey(itemApply);
    }

    @Override
    public void pricing(ItemApply itemApply) {
        if (itemApply.getApproveState() != ApproveStateEnum.PRICING.getIndex()) {
            throw new RuntimeException("操作未被允许, 单据需为待定价状态");
        }

        User user = (User) SecurityUtils.getSubject().getPrincipal();
        itemApply.setPricerId(user.getId());
        itemApply.setPricingDate(new Date());
        itemApply.setApproveState(ApproveStateEnum.PENDING.getIndex());
        itemApplyMapper.updateByPrimaryKey(itemApply);
    }

    @Override
    public void cancelPricing(ItemApply itemApply) {
        if (itemApply.getApproveState() != ApproveStateEnum.PENDING.getIndex()) {
            throw new RuntimeException("操作未被允许, 单据需为待审批状态");
        }

        User user = (User) SecurityUtils.getSubject().getPrincipal();
        itemApply.setApproverId(user.getId());
        itemApply.setApproveDate(new Date());
        itemApply.setApproveState(ApproveStateEnum.PRICING.getIndex());
        itemApplyMapper.updateByPrimaryKey(itemApply);
    }

    @Override
    public void unapproved(ItemApply itemApply) {
        if (itemApply.getApproveState() == ApproveStateEnum.APPROVED.getIndex()) {
            throw new RuntimeException("操作未被允许, 单据不能为通过状态");
        }

        User user = (User) SecurityUtils.getSubject().getPrincipal();
        itemApply.setApproverId(user.getId());
        itemApply.setApproveDate(new Date());
        itemApply.setApproveState(ApproveStateEnum.UNAPPROVED.getIndex());
        itemApplyMapper.updateByPrimaryKey(itemApply);
    }

    @Override
    public void approved(ItemApply itemApply) {
        if (itemApply.getApproveState() != ApproveStateEnum.PENDING.getIndex()) {
            throw new RuntimeException("操作未被允许, 单据需为待审批状态");
        }

        User user = (User) SecurityUtils.getSubject().getPrincipal();
        itemApply.setApproverId(user.getId());
        itemApply.setApproveDate(new Date());
        itemApply.setApproveState(ApproveStateEnum.APPROVED.getIndex());
        itemApplyMapper.updateByPrimaryKey(itemApply);

        Item item = new Item();
        BeanUtils.copyProperties(itemApply, item);
        item.setId(null); // 重置 ID, 以便重新生成ID
        itemService.save(item);
    }

    @Override
    public ItemApply getById(Integer id) {
        return itemApplyMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Map<String, Object>> getByCriteria(String[] creationDate, Byte approveState, String name) {
        return itemApplyMapper.selectByCriteria(creationDate, approveState, name);
    }
}
