package pers.tandy.chis.modules.nurseworkstation.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLshIsNull() {
            addCriterion("lsh is null");
            return (Criteria) this;
        }

        public Criteria andLshIsNotNull() {
            addCriterion("lsh is not null");
            return (Criteria) this;
        }

        public Criteria andLshEqualTo(String value) {
            addCriterion("lsh =", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshNotEqualTo(String value) {
            addCriterion("lsh <>", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshGreaterThan(String value) {
            addCriterion("lsh >", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshGreaterThanOrEqualTo(String value) {
            addCriterion("lsh >=", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshLessThan(String value) {
            addCriterion("lsh <", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshLessThanOrEqualTo(String value) {
            addCriterion("lsh <=", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshLike(String value) {
            addCriterion("lsh like", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshNotLike(String value) {
            addCriterion("lsh not like", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshIn(List<String> values) {
            addCriterion("lsh in", values, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshNotIn(List<String> values) {
            addCriterion("lsh not in", values, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshBetween(String value1, String value2) {
            addCriterion("lsh between", value1, value2, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshNotBetween(String value1, String value2) {
            addCriterion("lsh not between", value1, value2, "lsh");
            return (Criteria) this;
        }

        public Criteria andCashIsNull() {
            addCriterion("cash is null");
            return (Criteria) this;
        }

        public Criteria andCashIsNotNull() {
            addCriterion("cash is not null");
            return (Criteria) this;
        }

        public Criteria andCashEqualTo(Float value) {
            addCriterion("cash =", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotEqualTo(Float value) {
            addCriterion("cash <>", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashGreaterThan(Float value) {
            addCriterion("cash >", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashGreaterThanOrEqualTo(Float value) {
            addCriterion("cash >=", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashLessThan(Float value) {
            addCriterion("cash <", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashLessThanOrEqualTo(Float value) {
            addCriterion("cash <=", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashIn(List<Float> values) {
            addCriterion("cash in", values, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotIn(List<Float> values) {
            addCriterion("cash not in", values, "cash");
            return (Criteria) this;
        }

        public Criteria andCashBetween(Float value1, Float value2) {
            addCriterion("cash between", value1, value2, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotBetween(Float value1, Float value2) {
            addCriterion("cash not between", value1, value2, "cash");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceIsNull() {
            addCriterion("member_balance is null");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceIsNotNull() {
            addCriterion("member_balance is not null");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceEqualTo(Float value) {
            addCriterion("member_balance =", value, "memberBalance");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceNotEqualTo(Float value) {
            addCriterion("member_balance <>", value, "memberBalance");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceGreaterThan(Float value) {
            addCriterion("member_balance >", value, "memberBalance");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceGreaterThanOrEqualTo(Float value) {
            addCriterion("member_balance >=", value, "memberBalance");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceLessThan(Float value) {
            addCriterion("member_balance <", value, "memberBalance");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceLessThanOrEqualTo(Float value) {
            addCriterion("member_balance <=", value, "memberBalance");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceIn(List<Float> values) {
            addCriterion("member_balance in", values, "memberBalance");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceNotIn(List<Float> values) {
            addCriterion("member_balance not in", values, "memberBalance");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceBetween(Float value1, Float value2) {
            addCriterion("member_balance between", value1, value2, "memberBalance");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceNotBetween(Float value1, Float value2) {
            addCriterion("member_balance not between", value1, value2, "memberBalance");
            return (Criteria) this;
        }

        public Criteria andUnionpayIsNull() {
            addCriterion("unionpay is null");
            return (Criteria) this;
        }

        public Criteria andUnionpayIsNotNull() {
            addCriterion("unionpay is not null");
            return (Criteria) this;
        }

        public Criteria andUnionpayEqualTo(Float value) {
            addCriterion("unionpay =", value, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayNotEqualTo(Float value) {
            addCriterion("unionpay <>", value, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayGreaterThan(Float value) {
            addCriterion("unionpay >", value, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayGreaterThanOrEqualTo(Float value) {
            addCriterion("unionpay >=", value, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayLessThan(Float value) {
            addCriterion("unionpay <", value, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayLessThanOrEqualTo(Float value) {
            addCriterion("unionpay <=", value, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayIn(List<Float> values) {
            addCriterion("unionpay in", values, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayNotIn(List<Float> values) {
            addCriterion("unionpay not in", values, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayBetween(Float value1, Float value2) {
            addCriterion("unionpay between", value1, value2, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayNotBetween(Float value1, Float value2) {
            addCriterion("unionpay not between", value1, value2, "unionpay");
            return (Criteria) this;
        }

        public Criteria andAlipayIsNull() {
            addCriterion("alipay is null");
            return (Criteria) this;
        }

        public Criteria andAlipayIsNotNull() {
            addCriterion("alipay is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayEqualTo(Float value) {
            addCriterion("alipay =", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotEqualTo(Float value) {
            addCriterion("alipay <>", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayGreaterThan(Float value) {
            addCriterion("alipay >", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayGreaterThanOrEqualTo(Float value) {
            addCriterion("alipay >=", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayLessThan(Float value) {
            addCriterion("alipay <", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayLessThanOrEqualTo(Float value) {
            addCriterion("alipay <=", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayIn(List<Float> values) {
            addCriterion("alipay in", values, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotIn(List<Float> values) {
            addCriterion("alipay not in", values, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayBetween(Float value1, Float value2) {
            addCriterion("alipay between", value1, value2, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotBetween(Float value1, Float value2) {
            addCriterion("alipay not between", value1, value2, "alipay");
            return (Criteria) this;
        }

        public Criteria andWechatpayIsNull() {
            addCriterion("wechatpay is null");
            return (Criteria) this;
        }

        public Criteria andWechatpayIsNotNull() {
            addCriterion("wechatpay is not null");
            return (Criteria) this;
        }

        public Criteria andWechatpayEqualTo(Float value) {
            addCriterion("wechatpay =", value, "wechatpay");
            return (Criteria) this;
        }

        public Criteria andWechatpayNotEqualTo(Float value) {
            addCriterion("wechatpay <>", value, "wechatpay");
            return (Criteria) this;
        }

        public Criteria andWechatpayGreaterThan(Float value) {
            addCriterion("wechatpay >", value, "wechatpay");
            return (Criteria) this;
        }

        public Criteria andWechatpayGreaterThanOrEqualTo(Float value) {
            addCriterion("wechatpay >=", value, "wechatpay");
            return (Criteria) this;
        }

        public Criteria andWechatpayLessThan(Float value) {
            addCriterion("wechatpay <", value, "wechatpay");
            return (Criteria) this;
        }

        public Criteria andWechatpayLessThanOrEqualTo(Float value) {
            addCriterion("wechatpay <=", value, "wechatpay");
            return (Criteria) this;
        }

        public Criteria andWechatpayIn(List<Float> values) {
            addCriterion("wechatpay in", values, "wechatpay");
            return (Criteria) this;
        }

        public Criteria andWechatpayNotIn(List<Float> values) {
            addCriterion("wechatpay not in", values, "wechatpay");
            return (Criteria) this;
        }

        public Criteria andWechatpayBetween(Float value1, Float value2) {
            addCriterion("wechatpay between", value1, value2, "wechatpay");
            return (Criteria) this;
        }

        public Criteria andWechatpayNotBetween(Float value1, Float value2) {
            addCriterion("wechatpay not between", value1, value2, "wechatpay");
            return (Criteria) this;
        }

        public Criteria andSysPaymentWayIdIsNull() {
            addCriterion("sys_payment_way_id is null");
            return (Criteria) this;
        }

        public Criteria andSysPaymentWayIdIsNotNull() {
            addCriterion("sys_payment_way_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysPaymentWayIdEqualTo(Integer value) {
            addCriterion("sys_payment_way_id =", value, "sysPaymentWayId");
            return (Criteria) this;
        }

        public Criteria andSysPaymentWayIdNotEqualTo(Integer value) {
            addCriterion("sys_payment_way_id <>", value, "sysPaymentWayId");
            return (Criteria) this;
        }

        public Criteria andSysPaymentWayIdGreaterThan(Integer value) {
            addCriterion("sys_payment_way_id >", value, "sysPaymentWayId");
            return (Criteria) this;
        }

        public Criteria andSysPaymentWayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_payment_way_id >=", value, "sysPaymentWayId");
            return (Criteria) this;
        }

        public Criteria andSysPaymentWayIdLessThan(Integer value) {
            addCriterion("sys_payment_way_id <", value, "sysPaymentWayId");
            return (Criteria) this;
        }

        public Criteria andSysPaymentWayIdLessThanOrEqualTo(Integer value) {
            addCriterion("sys_payment_way_id <=", value, "sysPaymentWayId");
            return (Criteria) this;
        }

        public Criteria andSysPaymentWayIdIn(List<Integer> values) {
            addCriterion("sys_payment_way_id in", values, "sysPaymentWayId");
            return (Criteria) this;
        }

        public Criteria andSysPaymentWayIdNotIn(List<Integer> values) {
            addCriterion("sys_payment_way_id not in", values, "sysPaymentWayId");
            return (Criteria) this;
        }

        public Criteria andSysPaymentWayIdBetween(Integer value1, Integer value2) {
            addCriterion("sys_payment_way_id between", value1, value2, "sysPaymentWayId");
            return (Criteria) this;
        }

        public Criteria andSysPaymentWayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_payment_way_id not between", value1, value2, "sysPaymentWayId");
            return (Criteria) this;
        }

        public Criteria andSysPaymentWayAmountIsNull() {
            addCriterion("sys_payment_way_amount is null");
            return (Criteria) this;
        }

        public Criteria andSysPaymentWayAmountIsNotNull() {
            addCriterion("sys_payment_way_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSysPaymentWayAmountEqualTo(Float value) {
            addCriterion("sys_payment_way_amount =", value, "sysPaymentWayAmount");
            return (Criteria) this;
        }

        public Criteria andSysPaymentWayAmountNotEqualTo(Float value) {
            addCriterion("sys_payment_way_amount <>", value, "sysPaymentWayAmount");
            return (Criteria) this;
        }

        public Criteria andSysPaymentWayAmountGreaterThan(Float value) {
            addCriterion("sys_payment_way_amount >", value, "sysPaymentWayAmount");
            return (Criteria) this;
        }

        public Criteria andSysPaymentWayAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("sys_payment_way_amount >=", value, "sysPaymentWayAmount");
            return (Criteria) this;
        }

        public Criteria andSysPaymentWayAmountLessThan(Float value) {
            addCriterion("sys_payment_way_amount <", value, "sysPaymentWayAmount");
            return (Criteria) this;
        }

        public Criteria andSysPaymentWayAmountLessThanOrEqualTo(Float value) {
            addCriterion("sys_payment_way_amount <=", value, "sysPaymentWayAmount");
            return (Criteria) this;
        }

        public Criteria andSysPaymentWayAmountIn(List<Float> values) {
            addCriterion("sys_payment_way_amount in", values, "sysPaymentWayAmount");
            return (Criteria) this;
        }

        public Criteria andSysPaymentWayAmountNotIn(List<Float> values) {
            addCriterion("sys_payment_way_amount not in", values, "sysPaymentWayAmount");
            return (Criteria) this;
        }

        public Criteria andSysPaymentWayAmountBetween(Float value1, Float value2) {
            addCriterion("sys_payment_way_amount between", value1, value2, "sysPaymentWayAmount");
            return (Criteria) this;
        }

        public Criteria andSysPaymentWayAmountNotBetween(Float value1, Float value2) {
            addCriterion("sys_payment_way_amount not between", value1, value2, "sysPaymentWayAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountIsNull() {
            addCriterion("actual_amount is null");
            return (Criteria) this;
        }

        public Criteria andActualAmountIsNotNull() {
            addCriterion("actual_amount is not null");
            return (Criteria) this;
        }

        public Criteria andActualAmountEqualTo(Float value) {
            addCriterion("actual_amount =", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountNotEqualTo(Float value) {
            addCriterion("actual_amount <>", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountGreaterThan(Float value) {
            addCriterion("actual_amount >", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("actual_amount >=", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountLessThan(Float value) {
            addCriterion("actual_amount <", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountLessThanOrEqualTo(Float value) {
            addCriterion("actual_amount <=", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountIn(List<Float> values) {
            addCriterion("actual_amount in", values, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountNotIn(List<Float> values) {
            addCriterion("actual_amount not in", values, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountBetween(Float value1, Float value2) {
            addCriterion("actual_amount between", value1, value2, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountNotBetween(Float value1, Float value2) {
            addCriterion("actual_amount not between", value1, value2, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andDisparityAmountIsNull() {
            addCriterion("disparity_amount is null");
            return (Criteria) this;
        }

        public Criteria andDisparityAmountIsNotNull() {
            addCriterion("disparity_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDisparityAmountEqualTo(Float value) {
            addCriterion("disparity_amount =", value, "disparityAmount");
            return (Criteria) this;
        }

        public Criteria andDisparityAmountNotEqualTo(Float value) {
            addCriterion("disparity_amount <>", value, "disparityAmount");
            return (Criteria) this;
        }

        public Criteria andDisparityAmountGreaterThan(Float value) {
            addCriterion("disparity_amount >", value, "disparityAmount");
            return (Criteria) this;
        }

        public Criteria andDisparityAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("disparity_amount >=", value, "disparityAmount");
            return (Criteria) this;
        }

        public Criteria andDisparityAmountLessThan(Float value) {
            addCriterion("disparity_amount <", value, "disparityAmount");
            return (Criteria) this;
        }

        public Criteria andDisparityAmountLessThanOrEqualTo(Float value) {
            addCriterion("disparity_amount <=", value, "disparityAmount");
            return (Criteria) this;
        }

        public Criteria andDisparityAmountIn(List<Float> values) {
            addCriterion("disparity_amount in", values, "disparityAmount");
            return (Criteria) this;
        }

        public Criteria andDisparityAmountNotIn(List<Float> values) {
            addCriterion("disparity_amount not in", values, "disparityAmount");
            return (Criteria) this;
        }

        public Criteria andDisparityAmountBetween(Float value1, Float value2) {
            addCriterion("disparity_amount between", value1, value2, "disparityAmount");
            return (Criteria) this;
        }

        public Criteria andDisparityAmountNotBetween(Float value1, Float value2) {
            addCriterion("disparity_amount not between", value1, value2, "disparityAmount");
            return (Criteria) this;
        }

        public Criteria andSysClinicIdIsNull() {
            addCriterion("sys_clinic_id is null");
            return (Criteria) this;
        }

        public Criteria andSysClinicIdIsNotNull() {
            addCriterion("sys_clinic_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysClinicIdEqualTo(Integer value) {
            addCriterion("sys_clinic_id =", value, "sysClinicId");
            return (Criteria) this;
        }

        public Criteria andSysClinicIdNotEqualTo(Integer value) {
            addCriterion("sys_clinic_id <>", value, "sysClinicId");
            return (Criteria) this;
        }

        public Criteria andSysClinicIdGreaterThan(Integer value) {
            addCriterion("sys_clinic_id >", value, "sysClinicId");
            return (Criteria) this;
        }

        public Criteria andSysClinicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_clinic_id >=", value, "sysClinicId");
            return (Criteria) this;
        }

        public Criteria andSysClinicIdLessThan(Integer value) {
            addCriterion("sys_clinic_id <", value, "sysClinicId");
            return (Criteria) this;
        }

        public Criteria andSysClinicIdLessThanOrEqualTo(Integer value) {
            addCriterion("sys_clinic_id <=", value, "sysClinicId");
            return (Criteria) this;
        }

        public Criteria andSysClinicIdIn(List<Integer> values) {
            addCriterion("sys_clinic_id in", values, "sysClinicId");
            return (Criteria) this;
        }

        public Criteria andSysClinicIdNotIn(List<Integer> values) {
            addCriterion("sys_clinic_id not in", values, "sysClinicId");
            return (Criteria) this;
        }

        public Criteria andSysClinicIdBetween(Integer value1, Integer value2) {
            addCriterion("sys_clinic_id between", value1, value2, "sysClinicId");
            return (Criteria) this;
        }

        public Criteria andSysClinicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_clinic_id not between", value1, value2, "sysClinicId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("creator_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Integer value) {
            addCriterion("creator_id =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Integer value) {
            addCriterion("creator_id <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Integer value) {
            addCriterion("creator_id >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("creator_id >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Integer value) {
            addCriterion("creator_id <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("creator_id <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Integer> values) {
            addCriterion("creator_id in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Integer> values) {
            addCriterion("creator_id not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Integer value1, Integer value2) {
            addCriterion("creator_id between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("creator_id not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNull() {
            addCriterion("creation_date is null");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNotNull() {
            addCriterion("creation_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreationDateEqualTo(Date value) {
            addCriterion("creation_date =", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterion("creation_date <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterion("creation_date >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("creation_date >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterion("creation_date <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterion("creation_date <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateIn(List<Date> values) {
            addCriterion("creation_date in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotIn(List<Date> values) {
            addCriterion("creation_date not in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateBetween(Date value1, Date value2) {
            addCriterion("creation_date between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotBetween(Date value1, Date value2) {
            addCriterion("creation_date not between", value1, value2, "creationDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}