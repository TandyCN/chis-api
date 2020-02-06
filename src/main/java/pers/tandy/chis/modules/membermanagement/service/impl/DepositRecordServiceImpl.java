package pers.tandy.chis.modules.membermanagement.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.tandy.chis.main.component.JSONUtils;
import pers.tandy.chis.main.component.KeyUtils;
import pers.tandy.chis.modules.membermanagement.bean.DepositRecord;
import pers.tandy.chis.modules.membermanagement.bean.DepositRecordExample;
import pers.tandy.chis.modules.membermanagement.bean.Member;
import pers.tandy.chis.modules.membermanagement.bean.MemberType;
import pers.tandy.chis.modules.membermanagement.dao.DepositRecordMapper;
import pers.tandy.chis.modules.membermanagement.service.DepositRecordService;
import pers.tandy.chis.modules.membermanagement.service.MemberService;
import pers.tandy.chis.modules.membermanagement.service.MemberTypeService;
import pers.tandy.chis.modules.nurseworkstation.bean.PaymentRecord;
import pers.tandy.chis.modules.nurseworkstation.service.PaymentRecordService;
import pers.tandy.chis.modules.systemmanagement.bean.User;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: Tandy
 * @Date: 2019/12/31 11:45
 * @Version 1.0
 */
@Service
public class DepositRecordServiceImpl implements DepositRecordService {

    private DepositRecordMapper depositRecordMapper;
    @Autowired
    public void setDepositRecordMapper(DepositRecordMapper depositRecordMapper) {
        this.depositRecordMapper = depositRecordMapper;
    }

    private MemberService memberService;
    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }

    private MemberTypeService memberTypeService;
    @Autowired
    public void setMemberTypeService(MemberTypeService memberTypeService) {
        this.memberTypeService = memberTypeService;
    }

    private PaymentRecordService paymentRecordService;
    @Autowired
    public void setPaymentRecordService(PaymentRecordService paymentRecordService) {
        this.paymentRecordService = paymentRecordService;
    }

    /*----------------------------------------------------------------------------------------------------------------*/

    @Override
    public void save(Integer mrmMemberId, String paymentRecordJson) {
        User user = (User) SecurityUtils.getSubject().getPrincipal(); // 获取用户信息
        String lsh = KeyUtils.getLSH(user.getId()); // 获取流水号
        Member member = memberService.getById(mrmMemberId); // 获取会员
        if (member == null) {
            throw new RuntimeException("获取会员失败");
        }
        MemberType memberType = memberTypeService.getById(member.getMrmMemberTypeId());
        if (memberType == null) {
            throw new RuntimeException("获取会员类型失败");
        }

        // 将收款记录 JSON 转成对象 并进行赋值
        PaymentRecord paymentRecord = JSONUtils.parseJsonToObject(paymentRecordJson, new TypeReference<PaymentRecord>() {});
        paymentRecord.setLsh(lsh); // 流水号
        paymentRecord.setSysClinicId(user.getSysClinicId()); // 机构ID
        paymentRecord.setCreatorId(user.getId()); // 创建人
        paymentRecord.setCreationDate(new Date()); // 创建日期
        this.paymentRecordService.save(paymentRecord); // 保存收款记录

        // 计算储值金额、赠送金额、剩余金额
        float depositAmount = memberType.getDepositAmount(); // 需满足的储值金额
        float givenAmount = memberType.getGivenAmount(); // 满足条件后赠送的金额
        float totalGivenAmount = 0f; // 合计赠送的金额
        // 如果实收金额 或 需满足的储值金额 或 赠送金额 > 0 [由于精度问题 Float 不能直接比较 = 或 !=]
        if (paymentRecord.getActualAmount() > 0 && depositAmount > 0 && givenAmount > 0) {
            int fold = (int) (paymentRecord.getActualAmount() / depositAmount);
            totalGivenAmount = fold * givenAmount;
        }
        float totalDepositAmount = paymentRecord.getActualAmount() + totalGivenAmount; // 合计储值金额 = 实收金额 + 合计增送金额
        float balance = member.getBalance() + totalDepositAmount; // 会员余额 = 会员余额 + 合计储值金额

        // 创建一条储值记录
        DepositRecord depositRecord = new DepositRecord();
        depositRecord.setLsh(lsh);
        depositRecord.setMrmMemberId(mrmMemberId);
        depositRecord.setDepositAmount(paymentRecord.getActualAmount());
        depositRecord.setGivenAmount(totalGivenAmount);
        depositRecord.setBalance(balance);
        depositRecord.setSysClinicId(user.getSysClinicId());
        depositRecord.setCreatorId(user.getId());
        depositRecord.setCreationDate(new Date());
        depositRecord.setReturned(false);
        // 保存储值记录
        this.depositRecordMapper.insert(depositRecord);

        // 更新会员余额
        this.memberService.updateBalanceForDeposit(mrmMemberId, totalDepositAmount);
    }

    @Override
    public void saveForReturned(String lsh) {
        // 根据流水号获取对应的储值记录
        List<DepositRecord> depositRecordList = this.getByLsh(lsh);
        if (depositRecordList.isEmpty()) {
            throw new RuntimeException("获取储值记录失败");
        }
        for (int i = 0; i < depositRecordList.size(); i++) {
            DepositRecord dr = depositRecordList.get(i);
            if (i > 1 || dr.getReturned()) {
                throw new RuntimeException("该储值可能已被退回");
            }
        }

        // 更新该储值记录为退回状态
        DepositRecord depositRecord = depositRecordList.get(0);
        depositRecord.setReturned(true); // 修改其为已经退回状态
        this.depositRecordMapper.updateByPrimaryKey(depositRecord);

        // 获取用户和会员信息
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        Integer mrmMemberId = depositRecord.getMrmMemberId();
        Member member = this.memberService.getById(mrmMemberId);
        if (member == null) {
            throw new RuntimeException("获取会员失败");
        }

        // 设置退回记录属性
        float depositAmount = depositRecord.getDepositAmount() * -1; // 获取要退的储值金额
        float givenAmount = depositRecord.getGivenAmount() * -1; // 获取要退的赠送金额
        float totalDepositAmount = depositAmount + givenAmount; // 获取合计储值金额
        float balance = member.getBalance() + totalDepositAmount; // 获取退后的余额
        if (balance < 0) {
            throw new RuntimeException("会员余额不足");
        }

        depositRecord.setId(null); // 将 ID 重置为 null
        depositRecord.setDepositAmount(depositAmount); // 储值金额
        depositRecord.setGivenAmount(givenAmount); // 赠送金额
        depositRecord.setBalance(balance); // 剩余余额
        depositRecord.setSysClinicId(user.getSysClinicId()); // 机构ID
        depositRecord.setCreatorId(user.getId()); // 操作人ID
        depositRecord.setCreationDate(new Date()); // 操作日期
        // 保存储值退回记录
        this.depositRecordMapper.insert(depositRecord);

        // 更新会员余额
        this.memberService.updateBalanceForDeposit(mrmMemberId, totalDepositAmount);

        // 根据流水号获取对应的付款记录
        List<PaymentRecord> paymentRecordList = this.paymentRecordService.getByLsh(lsh);
        if (paymentRecordList.isEmpty()) {
            throw new RuntimeException("获取储值的付款方式失败");
        }
        if (paymentRecordList.size() > 1) {
            throw new RuntimeException("该储值可能已被退回");
        }

        // 获取付款记录 并设置退回记录属性
        PaymentRecord paymentRecord = paymentRecordList.get(0);
        if (user.getSysClinicId().intValue() != paymentRecord.getSysClinicId().intValue()) {
            throw new RuntimeException("操作人所在机构与会员储值机构不一致");
        }

        paymentRecord.setId(null); // 将 ID 重置为 null
        paymentRecord.setCash(paymentRecord.getCash() * -1); // 现金
        // paymentRecord.setMemberBalance(); // 不允许使用会员卡余额
        paymentRecord.setUnionpay(paymentRecord.getUnionpay() * -1); // 银联
        paymentRecord.setAlipay(paymentRecord.getAlipay() * -1); // 支付宝
        paymentRecord.setWechatpay(paymentRecord.getWechatpay() * -1); // 微信
        paymentRecord.setSysPaymentWayAmount(paymentRecord.getSysPaymentWayAmount() * -1); // 其他收费方式
        paymentRecord.setActualAmount(paymentRecord.getActualAmount() * -1); // 实收金额
        paymentRecord.setDisparityAmount(paymentRecord.getDisparityAmount() * -1); // 差额
        paymentRecord.setSysClinicId(user.getSysClinicId()); // 机构ID
        paymentRecord.setCreatorId(user.getId()); // 操作人ID
        paymentRecord.setCreationDate(new Date()); // 操作日期
        // 保存付款退回记录
        this.paymentRecordService.save(paymentRecord);

    }

    @Override
    public List<DepositRecord> getByLsh(String lsh) {
        DepositRecordExample example = new DepositRecordExample();
        example.createCriteria().andLshEqualTo(lsh);
        return depositRecordMapper.selectByExample(example);
    }

    @Override
    public List<Map<String, Object>> getByCriteria(Integer sysClinicId, String[] creationDate, String lsh, String mrmMemberName, Boolean returned) {
        return depositRecordMapper.selectByCriteria(sysClinicId, creationDate, lsh, mrmMemberName, returned);
    }
}
