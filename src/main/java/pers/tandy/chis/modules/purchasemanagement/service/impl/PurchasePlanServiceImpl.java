package pers.tandy.chis.modules.purchasemanagement.service.impl;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.tandy.chis.main.common.enums.ApproveStateEnum;
import pers.tandy.chis.main.component.KeyUtils;
import pers.tandy.chis.modules.chargesitemmanagement.bean.Item;
import pers.tandy.chis.modules.purchasemanagement.bean.PurchasePlan;
import pers.tandy.chis.modules.purchasemanagement.bean.PurchasePlanExample;
import pers.tandy.chis.modules.purchasemanagement.dao.PurchasePlanMapper;
import pers.tandy.chis.modules.purchasemanagement.service.PurchasePlanService;
import pers.tandy.chis.modules.systemmanagement.bean.User;

import java.util.*;

/**
 * @Author: Tandy
 * @Date: 2019/8/28 14:00
 * @Version 1.0
 */
@Service
public class PurchasePlanServiceImpl implements PurchasePlanService {

    private PurchasePlanMapper purchasePlanMapper;
    @Autowired
    public void setPurchasePlanMapper(PurchasePlanMapper purchasePlanMapper) {
        this.purchasePlanMapper = purchasePlanMapper;
    }

    private SqlSessionFactory sqlSessionFactory;
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    /* -------------------------------------------------------------------------------------------------------------- */

    @Override
    public void save(List<PurchasePlan> purchasePlanList) {
        // 获取创建人信息
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        // 获取流水号
        String lsh = KeyUtils.getLSH(user.getId());
        // 初始化明细号
        int mxh = 1;

        SqlSession batchSqlSession = sqlSessionFactory.openSession(ExecutorType.BATCH);
        PurchasePlanMapper mapper = batchSqlSession.getMapper(PurchasePlanMapper.class);
        try {
            for (PurchasePlan plan : purchasePlanList) {
                plan.setLsh(lsh);
                plan.setMxh(String.valueOf(mxh++));
                plan.setSysClinicId(user.getSysClinicId());
                plan.setCreatorId(user.getId());
                plan.setCreationDate(new Date());
                plan.setApproveState(ApproveStateEnum.PENDING.getIndex());

                mapper.insert(plan);
            }
            batchSqlSession.commit();
        } finally {
            batchSqlSession.close();
        }
    }

    @Override
    public void cancel(List<PurchasePlan> planList) {
        if (!this.examineApproveState(planList, ApproveStateEnum.PENDING.getIndex())) {
            throw new RuntimeException("操作未被允许, 明细审批状态已发生改变");
        }

        purchasePlanMapper.updateApproveStateByPlanIdList(
                ApproveStateEnum.CANCEL.getIndex(), null, null, planList);
    }

    @Override
    public void unapproved(List<PurchasePlan> planList) {
        if (!this.examineApproveState(planList, ApproveStateEnum.PENDING.getIndex())) {
            throw new RuntimeException("操作未被允许, 单据明细需为待审批状态");
        }

        // 获取用户信息
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        purchasePlanMapper.updateApproveStateByPlanIdList(
                ApproveStateEnum.UNAPPROVED.getIndex(), user.getId(), new Date(), planList);
    }

    @Override
    public void purchasing(List<PurchasePlan> planList) {
        if (!this.examineApproveState(planList, ApproveStateEnum.PENDING.getIndex())) {
            throw new RuntimeException("操作未被允许, 单据明细需为待审批状态");
        }

        // 获取用户信息
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        purchasePlanMapper.updateApproveStateByPlanIdList(
                ApproveStateEnum.PURCHASING.getIndex(), user.getId(), new Date(), planList);
    }

    @Override
    public void approved(List<PurchasePlan> planList) {
        if (!this.examineApproveState(planList, ApproveStateEnum.PURCHASING.getIndex())) {
            throw new RuntimeException("操作未被允许, 单据明细需为待采购状态");
        }
        // 获取用户信息
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        purchasePlanMapper.updateApproveStateByPlanIdList(
                ApproveStateEnum.APPROVED.getIndex(), user.getId(), new Date(), planList);
    }

    @Override
    public List<Map<String, Object>> getClinicListByCriteria(String[] creationDate, Integer sysClinicId, Byte approveState, String gsmGoodsName) {
        return purchasePlanMapper.selectByCriteria(creationDate,null,null,approveState, sysClinicId,null, gsmGoodsName);
    }

    @Override
    public List<Map<String, Object>> getByCriteria(String[] creationDate, Byte approveState, String sysClinicName, String gsmGoodsName) {
        return purchasePlanMapper.selectByCriteria(creationDate,null,null, approveState,null, sysClinicName, gsmGoodsName);
    }

    @Override
    public List<Map<String, Object>> getPendingGroupListByCriteria(String[] creationDate, String gsmGoodsName) {
        List<Map<String, Object>> mapList =
                purchasePlanMapper.selectByCriteria(creationDate, null, null, ApproveStateEnum.PENDING.getIndex(), null, null, gsmGoodsName);
        return this.getGroupList(mapList, new String[]{"gsmGoodsId"});
    }

    @Override
    public List<Map<String, Object>> getPurchasingGroupListByCriteria(String[] approveDate) {
        // 获取用户信息
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        List<Map<String, Object>> mapList =
                purchasePlanMapper.selectByCriteria(null, approveDate, user.getId(), ApproveStateEnum.PURCHASING.getIndex(), null, null, null);
        return this.getGroupList(mapList, new String[]{"gsmGoodsId"});
    }

    @Override
    public List<Map<String, Object>> getClinicGroupListByPlanIdList(List<Integer> planIdList) {
        List<Map<String, Object>> mapList = purchasePlanMapper.selectByPlanIdList(planIdList);
        return this.getGroupList(mapList, new String[]{"gsmGoodsId","sysClinicId"});
    }

    @Override
    public List<PurchasePlan> getByPlanIdList(List<Integer> planIdList) {
        PurchasePlanExample example = new PurchasePlanExample();
        example.createCriteria().andIdIn(planIdList);
        return purchasePlanMapper.selectByExample(example);
    }
}
