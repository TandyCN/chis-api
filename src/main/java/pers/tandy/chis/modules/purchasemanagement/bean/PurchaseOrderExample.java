package pers.tandy.chis.modules.purchasemanagement.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchaseOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseOrderExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andMxhIsNull() {
            addCriterion("mxh is null");
            return (Criteria) this;
        }

        public Criteria andMxhIsNotNull() {
            addCriterion("mxh is not null");
            return (Criteria) this;
        }

        public Criteria andMxhEqualTo(String value) {
            addCriterion("mxh =", value, "mxh");
            return (Criteria) this;
        }

        public Criteria andMxhNotEqualTo(String value) {
            addCriterion("mxh <>", value, "mxh");
            return (Criteria) this;
        }

        public Criteria andMxhGreaterThan(String value) {
            addCriterion("mxh >", value, "mxh");
            return (Criteria) this;
        }

        public Criteria andMxhGreaterThanOrEqualTo(String value) {
            addCriterion("mxh >=", value, "mxh");
            return (Criteria) this;
        }

        public Criteria andMxhLessThan(String value) {
            addCriterion("mxh <", value, "mxh");
            return (Criteria) this;
        }

        public Criteria andMxhLessThanOrEqualTo(String value) {
            addCriterion("mxh <=", value, "mxh");
            return (Criteria) this;
        }

        public Criteria andMxhLike(String value) {
            addCriterion("mxh like", value, "mxh");
            return (Criteria) this;
        }

        public Criteria andMxhNotLike(String value) {
            addCriterion("mxh not like", value, "mxh");
            return (Criteria) this;
        }

        public Criteria andMxhIn(List<String> values) {
            addCriterion("mxh in", values, "mxh");
            return (Criteria) this;
        }

        public Criteria andMxhNotIn(List<String> values) {
            addCriterion("mxh not in", values, "mxh");
            return (Criteria) this;
        }

        public Criteria andMxhBetween(String value1, String value2) {
            addCriterion("mxh between", value1, value2, "mxh");
            return (Criteria) this;
        }

        public Criteria andMxhNotBetween(String value1, String value2) {
            addCriterion("mxh not between", value1, value2, "mxh");
            return (Criteria) this;
        }

        public Criteria andGsmGoodsIdIsNull() {
            addCriterion("gsm_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGsmGoodsIdIsNotNull() {
            addCriterion("gsm_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGsmGoodsIdEqualTo(Integer value) {
            addCriterion("gsm_goods_id =", value, "gsmGoodsId");
            return (Criteria) this;
        }

        public Criteria andGsmGoodsIdNotEqualTo(Integer value) {
            addCriterion("gsm_goods_id <>", value, "gsmGoodsId");
            return (Criteria) this;
        }

        public Criteria andGsmGoodsIdGreaterThan(Integer value) {
            addCriterion("gsm_goods_id >", value, "gsmGoodsId");
            return (Criteria) this;
        }

        public Criteria andGsmGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gsm_goods_id >=", value, "gsmGoodsId");
            return (Criteria) this;
        }

        public Criteria andGsmGoodsIdLessThan(Integer value) {
            addCriterion("gsm_goods_id <", value, "gsmGoodsId");
            return (Criteria) this;
        }

        public Criteria andGsmGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("gsm_goods_id <=", value, "gsmGoodsId");
            return (Criteria) this;
        }

        public Criteria andGsmGoodsIdIn(List<Integer> values) {
            addCriterion("gsm_goods_id in", values, "gsmGoodsId");
            return (Criteria) this;
        }

        public Criteria andGsmGoodsIdNotIn(List<Integer> values) {
            addCriterion("gsm_goods_id not in", values, "gsmGoodsId");
            return (Criteria) this;
        }

        public Criteria andGsmGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("gsm_goods_id between", value1, value2, "gsmGoodsId");
            return (Criteria) this;
        }

        public Criteria andGsmGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gsm_goods_id not between", value1, value2, "gsmGoodsId");
            return (Criteria) this;
        }

        public Criteria andPlanQuantityIsNull() {
            addCriterion("plan_quantity is null");
            return (Criteria) this;
        }

        public Criteria andPlanQuantityIsNotNull() {
            addCriterion("plan_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andPlanQuantityEqualTo(Short value) {
            addCriterion("plan_quantity =", value, "planQuantity");
            return (Criteria) this;
        }

        public Criteria andPlanQuantityNotEqualTo(Short value) {
            addCriterion("plan_quantity <>", value, "planQuantity");
            return (Criteria) this;
        }

        public Criteria andPlanQuantityGreaterThan(Short value) {
            addCriterion("plan_quantity >", value, "planQuantity");
            return (Criteria) this;
        }

        public Criteria andPlanQuantityGreaterThanOrEqualTo(Short value) {
            addCriterion("plan_quantity >=", value, "planQuantity");
            return (Criteria) this;
        }

        public Criteria andPlanQuantityLessThan(Short value) {
            addCriterion("plan_quantity <", value, "planQuantity");
            return (Criteria) this;
        }

        public Criteria andPlanQuantityLessThanOrEqualTo(Short value) {
            addCriterion("plan_quantity <=", value, "planQuantity");
            return (Criteria) this;
        }

        public Criteria andPlanQuantityIn(List<Short> values) {
            addCriterion("plan_quantity in", values, "planQuantity");
            return (Criteria) this;
        }

        public Criteria andPlanQuantityNotIn(List<Short> values) {
            addCriterion("plan_quantity not in", values, "planQuantity");
            return (Criteria) this;
        }

        public Criteria andPlanQuantityBetween(Short value1, Short value2) {
            addCriterion("plan_quantity between", value1, value2, "planQuantity");
            return (Criteria) this;
        }

        public Criteria andPlanQuantityNotBetween(Short value1, Short value2) {
            addCriterion("plan_quantity not between", value1, value2, "planQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseQuantityIsNull() {
            addCriterion("purchase_quantity is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseQuantityIsNotNull() {
            addCriterion("purchase_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseQuantityEqualTo(Short value) {
            addCriterion("purchase_quantity =", value, "purchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseQuantityNotEqualTo(Short value) {
            addCriterion("purchase_quantity <>", value, "purchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseQuantityGreaterThan(Short value) {
            addCriterion("purchase_quantity >", value, "purchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseQuantityGreaterThanOrEqualTo(Short value) {
            addCriterion("purchase_quantity >=", value, "purchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseQuantityLessThan(Short value) {
            addCriterion("purchase_quantity <", value, "purchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseQuantityLessThanOrEqualTo(Short value) {
            addCriterion("purchase_quantity <=", value, "purchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseQuantityIn(List<Short> values) {
            addCriterion("purchase_quantity in", values, "purchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseQuantityNotIn(List<Short> values) {
            addCriterion("purchase_quantity not in", values, "purchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseQuantityBetween(Short value1, Short value2) {
            addCriterion("purchase_quantity between", value1, value2, "purchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseQuantityNotBetween(Short value1, Short value2) {
            addCriterion("purchase_quantity not between", value1, value2, "purchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIsNull() {
            addCriterion("purchase_price is null");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIsNotNull() {
            addCriterion("purchase_price is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceEqualTo(Float value) {
            addCriterion("purchase_price =", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotEqualTo(Float value) {
            addCriterion("purchase_price <>", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceGreaterThan(Float value) {
            addCriterion("purchase_price >", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceGreaterThanOrEqualTo(Float value) {
            addCriterion("purchase_price >=", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceLessThan(Float value) {
            addCriterion("purchase_price <", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceLessThanOrEqualTo(Float value) {
            addCriterion("purchase_price <=", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIn(List<Float> values) {
            addCriterion("purchase_price in", values, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotIn(List<Float> values) {
            addCriterion("purchase_price not in", values, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceBetween(Float value1, Float value2) {
            addCriterion("purchase_price between", value1, value2, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotBetween(Float value1, Float value2) {
            addCriterion("purchase_price not between", value1, value2, "purchasePrice");
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

        public Criteria andPemSupplierIdIsNull() {
            addCriterion("pem_supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andPemSupplierIdIsNotNull() {
            addCriterion("pem_supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andPemSupplierIdEqualTo(Integer value) {
            addCriterion("pem_supplier_id =", value, "pemSupplierId");
            return (Criteria) this;
        }

        public Criteria andPemSupplierIdNotEqualTo(Integer value) {
            addCriterion("pem_supplier_id <>", value, "pemSupplierId");
            return (Criteria) this;
        }

        public Criteria andPemSupplierIdGreaterThan(Integer value) {
            addCriterion("pem_supplier_id >", value, "pemSupplierId");
            return (Criteria) this;
        }

        public Criteria andPemSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pem_supplier_id >=", value, "pemSupplierId");
            return (Criteria) this;
        }

        public Criteria andPemSupplierIdLessThan(Integer value) {
            addCriterion("pem_supplier_id <", value, "pemSupplierId");
            return (Criteria) this;
        }

        public Criteria andPemSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("pem_supplier_id <=", value, "pemSupplierId");
            return (Criteria) this;
        }

        public Criteria andPemSupplierIdIn(List<Integer> values) {
            addCriterion("pem_supplier_id in", values, "pemSupplierId");
            return (Criteria) this;
        }

        public Criteria andPemSupplierIdNotIn(List<Integer> values) {
            addCriterion("pem_supplier_id not in", values, "pemSupplierId");
            return (Criteria) this;
        }

        public Criteria andPemSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("pem_supplier_id between", value1, value2, "pemSupplierId");
            return (Criteria) this;
        }

        public Criteria andPemSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pem_supplier_id not between", value1, value2, "pemSupplierId");
            return (Criteria) this;
        }

        public Criteria andPemPurchasePlanIdIsNull() {
            addCriterion("pem_purchase_plan_id is null");
            return (Criteria) this;
        }

        public Criteria andPemPurchasePlanIdIsNotNull() {
            addCriterion("pem_purchase_plan_id is not null");
            return (Criteria) this;
        }

        public Criteria andPemPurchasePlanIdEqualTo(Integer value) {
            addCriterion("pem_purchase_plan_id =", value, "pemPurchasePlanId");
            return (Criteria) this;
        }

        public Criteria andPemPurchasePlanIdNotEqualTo(Integer value) {
            addCriterion("pem_purchase_plan_id <>", value, "pemPurchasePlanId");
            return (Criteria) this;
        }

        public Criteria andPemPurchasePlanIdGreaterThan(Integer value) {
            addCriterion("pem_purchase_plan_id >", value, "pemPurchasePlanId");
            return (Criteria) this;
        }

        public Criteria andPemPurchasePlanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pem_purchase_plan_id >=", value, "pemPurchasePlanId");
            return (Criteria) this;
        }

        public Criteria andPemPurchasePlanIdLessThan(Integer value) {
            addCriterion("pem_purchase_plan_id <", value, "pemPurchasePlanId");
            return (Criteria) this;
        }

        public Criteria andPemPurchasePlanIdLessThanOrEqualTo(Integer value) {
            addCriterion("pem_purchase_plan_id <=", value, "pemPurchasePlanId");
            return (Criteria) this;
        }

        public Criteria andPemPurchasePlanIdIn(List<Integer> values) {
            addCriterion("pem_purchase_plan_id in", values, "pemPurchasePlanId");
            return (Criteria) this;
        }

        public Criteria andPemPurchasePlanIdNotIn(List<Integer> values) {
            addCriterion("pem_purchase_plan_id not in", values, "pemPurchasePlanId");
            return (Criteria) this;
        }

        public Criteria andPemPurchasePlanIdBetween(Integer value1, Integer value2) {
            addCriterion("pem_purchase_plan_id between", value1, value2, "pemPurchasePlanId");
            return (Criteria) this;
        }

        public Criteria andPemPurchasePlanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pem_purchase_plan_id not between", value1, value2, "pemPurchasePlanId");
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
            addCriterionForJDBCDate("creation_date =", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("creation_date <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("creation_date >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creation_date >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterionForJDBCDate("creation_date <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creation_date <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateIn(List<Date> values) {
            addCriterionForJDBCDate("creation_date in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("creation_date not in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creation_date between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creation_date not between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andApproverIdIsNull() {
            addCriterion("approver_id is null");
            return (Criteria) this;
        }

        public Criteria andApproverIdIsNotNull() {
            addCriterion("approver_id is not null");
            return (Criteria) this;
        }

        public Criteria andApproverIdEqualTo(Integer value) {
            addCriterion("approver_id =", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdNotEqualTo(Integer value) {
            addCriterion("approver_id <>", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdGreaterThan(Integer value) {
            addCriterion("approver_id >", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("approver_id >=", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdLessThan(Integer value) {
            addCriterion("approver_id <", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdLessThanOrEqualTo(Integer value) {
            addCriterion("approver_id <=", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdIn(List<Integer> values) {
            addCriterion("approver_id in", values, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdNotIn(List<Integer> values) {
            addCriterion("approver_id not in", values, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdBetween(Integer value1, Integer value2) {
            addCriterion("approver_id between", value1, value2, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdNotBetween(Integer value1, Integer value2) {
            addCriterion("approver_id not between", value1, value2, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproveDateIsNull() {
            addCriterion("approve_date is null");
            return (Criteria) this;
        }

        public Criteria andApproveDateIsNotNull() {
            addCriterion("approve_date is not null");
            return (Criteria) this;
        }

        public Criteria andApproveDateEqualTo(Date value) {
            addCriterionForJDBCDate("approve_date =", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("approve_date <>", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateGreaterThan(Date value) {
            addCriterionForJDBCDate("approve_date >", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("approve_date >=", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateLessThan(Date value) {
            addCriterionForJDBCDate("approve_date <", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("approve_date <=", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateIn(List<Date> values) {
            addCriterionForJDBCDate("approve_date in", values, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("approve_date not in", values, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("approve_date between", value1, value2, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("approve_date not between", value1, value2, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveStateIsNull() {
            addCriterion("approve_state is null");
            return (Criteria) this;
        }

        public Criteria andApproveStateIsNotNull() {
            addCriterion("approve_state is not null");
            return (Criteria) this;
        }

        public Criteria andApproveStateEqualTo(Byte value) {
            addCriterion("approve_state =", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateNotEqualTo(Byte value) {
            addCriterion("approve_state <>", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateGreaterThan(Byte value) {
            addCriterion("approve_state >", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("approve_state >=", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateLessThan(Byte value) {
            addCriterion("approve_state <", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateLessThanOrEqualTo(Byte value) {
            addCriterion("approve_state <=", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateIn(List<Byte> values) {
            addCriterion("approve_state in", values, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateNotIn(List<Byte> values) {
            addCriterion("approve_state not in", values, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateBetween(Byte value1, Byte value2) {
            addCriterion("approve_state between", value1, value2, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateNotBetween(Byte value1, Byte value2) {
            addCriterion("approve_state not between", value1, value2, "approveState");
            return (Criteria) this;
        }

        public Criteria andInventoryStateIsNull() {
            addCriterion("inventory_state is null");
            return (Criteria) this;
        }

        public Criteria andInventoryStateIsNotNull() {
            addCriterion("inventory_state is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryStateEqualTo(Boolean value) {
            addCriterion("inventory_state =", value, "inventoryState");
            return (Criteria) this;
        }

        public Criteria andInventoryStateNotEqualTo(Boolean value) {
            addCriterion("inventory_state <>", value, "inventoryState");
            return (Criteria) this;
        }

        public Criteria andInventoryStateGreaterThan(Boolean value) {
            addCriterion("inventory_state >", value, "inventoryState");
            return (Criteria) this;
        }

        public Criteria andInventoryStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("inventory_state >=", value, "inventoryState");
            return (Criteria) this;
        }

        public Criteria andInventoryStateLessThan(Boolean value) {
            addCriterion("inventory_state <", value, "inventoryState");
            return (Criteria) this;
        }

        public Criteria andInventoryStateLessThanOrEqualTo(Boolean value) {
            addCriterion("inventory_state <=", value, "inventoryState");
            return (Criteria) this;
        }

        public Criteria andInventoryStateIn(List<Boolean> values) {
            addCriterion("inventory_state in", values, "inventoryState");
            return (Criteria) this;
        }

        public Criteria andInventoryStateNotIn(List<Boolean> values) {
            addCriterion("inventory_state not in", values, "inventoryState");
            return (Criteria) this;
        }

        public Criteria andInventoryStateBetween(Boolean value1, Boolean value2) {
            addCriterion("inventory_state between", value1, value2, "inventoryState");
            return (Criteria) this;
        }

        public Criteria andInventoryStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("inventory_state not between", value1, value2, "inventoryState");
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