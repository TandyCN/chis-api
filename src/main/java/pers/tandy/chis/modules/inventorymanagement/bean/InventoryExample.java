package pers.tandy.chis.modules.inventorymanagement.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InventoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InventoryExample() {
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

        public Criteria andIymInventoryTypeIdIsNull() {
            addCriterion("iym_inventory_type_id is null");
            return (Criteria) this;
        }

        public Criteria andIymInventoryTypeIdIsNotNull() {
            addCriterion("iym_inventory_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andIymInventoryTypeIdEqualTo(Integer value) {
            addCriterion("iym_inventory_type_id =", value, "iymInventoryTypeId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryTypeIdNotEqualTo(Integer value) {
            addCriterion("iym_inventory_type_id <>", value, "iymInventoryTypeId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryTypeIdGreaterThan(Integer value) {
            addCriterion("iym_inventory_type_id >", value, "iymInventoryTypeId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iym_inventory_type_id >=", value, "iymInventoryTypeId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryTypeIdLessThan(Integer value) {
            addCriterion("iym_inventory_type_id <", value, "iymInventoryTypeId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("iym_inventory_type_id <=", value, "iymInventoryTypeId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryTypeIdIn(List<Integer> values) {
            addCriterion("iym_inventory_type_id in", values, "iymInventoryTypeId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryTypeIdNotIn(List<Integer> values) {
            addCriterion("iym_inventory_type_id not in", values, "iymInventoryTypeId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("iym_inventory_type_id between", value1, value2, "iymInventoryTypeId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iym_inventory_type_id not between", value1, value2, "iymInventoryTypeId");
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

        public Criteria andPhIsNull() {
            addCriterion("ph is null");
            return (Criteria) this;
        }

        public Criteria andPhIsNotNull() {
            addCriterion("ph is not null");
            return (Criteria) this;
        }

        public Criteria andPhEqualTo(String value) {
            addCriterion("ph =", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotEqualTo(String value) {
            addCriterion("ph <>", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThan(String value) {
            addCriterion("ph >", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThanOrEqualTo(String value) {
            addCriterion("ph >=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThan(String value) {
            addCriterion("ph <", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThanOrEqualTo(String value) {
            addCriterion("ph <=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLike(String value) {
            addCriterion("ph like", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotLike(String value) {
            addCriterion("ph not like", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhIn(List<String> values) {
            addCriterion("ph in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotIn(List<String> values) {
            addCriterion("ph not in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhBetween(String value1, String value2) {
            addCriterion("ph between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotBetween(String value1, String value2) {
            addCriterion("ph not between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andPchIsNull() {
            addCriterion("pch is null");
            return (Criteria) this;
        }

        public Criteria andPchIsNotNull() {
            addCriterion("pch is not null");
            return (Criteria) this;
        }

        public Criteria andPchEqualTo(String value) {
            addCriterion("pch =", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchNotEqualTo(String value) {
            addCriterion("pch <>", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchGreaterThan(String value) {
            addCriterion("pch >", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchGreaterThanOrEqualTo(String value) {
            addCriterion("pch >=", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchLessThan(String value) {
            addCriterion("pch <", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchLessThanOrEqualTo(String value) {
            addCriterion("pch <=", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchLike(String value) {
            addCriterion("pch like", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchNotLike(String value) {
            addCriterion("pch not like", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchIn(List<String> values) {
            addCriterion("pch in", values, "pch");
            return (Criteria) this;
        }

        public Criteria andPchNotIn(List<String> values) {
            addCriterion("pch not in", values, "pch");
            return (Criteria) this;
        }

        public Criteria andPchBetween(String value1, String value2) {
            addCriterion("pch between", value1, value2, "pch");
            return (Criteria) this;
        }

        public Criteria andPchNotBetween(String value1, String value2) {
            addCriterion("pch not between", value1, value2, "pch");
            return (Criteria) this;
        }

        public Criteria andSplitQuantityIsNull() {
            addCriterion("split_quantity is null");
            return (Criteria) this;
        }

        public Criteria andSplitQuantityIsNotNull() {
            addCriterion("split_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andSplitQuantityEqualTo(Integer value) {
            addCriterion("split_quantity =", value, "splitQuantity");
            return (Criteria) this;
        }

        public Criteria andSplitQuantityNotEqualTo(Integer value) {
            addCriterion("split_quantity <>", value, "splitQuantity");
            return (Criteria) this;
        }

        public Criteria andSplitQuantityGreaterThan(Integer value) {
            addCriterion("split_quantity >", value, "splitQuantity");
            return (Criteria) this;
        }

        public Criteria andSplitQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("split_quantity >=", value, "splitQuantity");
            return (Criteria) this;
        }

        public Criteria andSplitQuantityLessThan(Integer value) {
            addCriterion("split_quantity <", value, "splitQuantity");
            return (Criteria) this;
        }

        public Criteria andSplitQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("split_quantity <=", value, "splitQuantity");
            return (Criteria) this;
        }

        public Criteria andSplitQuantityIn(List<Integer> values) {
            addCriterion("split_quantity in", values, "splitQuantity");
            return (Criteria) this;
        }

        public Criteria andSplitQuantityNotIn(List<Integer> values) {
            addCriterion("split_quantity not in", values, "splitQuantity");
            return (Criteria) this;
        }

        public Criteria andSplitQuantityBetween(Integer value1, Integer value2) {
            addCriterion("split_quantity between", value1, value2, "splitQuantity");
            return (Criteria) this;
        }

        public Criteria andSplitQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("split_quantity not between", value1, value2, "splitQuantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Short value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Short value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Short value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Short value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Short value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Short value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Short> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Short> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Short value1, Short value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Short value1, Short value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("cost_price is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(Float value) {
            addCriterion("cost_price =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(Float value) {
            addCriterion("cost_price <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(Float value) {
            addCriterion("cost_price >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("cost_price >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(Float value) {
            addCriterion("cost_price <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(Float value) {
            addCriterion("cost_price <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<Float> values) {
            addCriterion("cost_price in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<Float> values) {
            addCriterion("cost_price not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(Float value1, Float value2) {
            addCriterion("cost_price between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(Float value1, Float value2) {
            addCriterion("cost_price not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andAverageCostPriceIsNull() {
            addCriterion("average_cost_price is null");
            return (Criteria) this;
        }

        public Criteria andAverageCostPriceIsNotNull() {
            addCriterion("average_cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andAverageCostPriceEqualTo(Float value) {
            addCriterion("average_cost_price =", value, "averageCostPrice");
            return (Criteria) this;
        }

        public Criteria andAverageCostPriceNotEqualTo(Float value) {
            addCriterion("average_cost_price <>", value, "averageCostPrice");
            return (Criteria) this;
        }

        public Criteria andAverageCostPriceGreaterThan(Float value) {
            addCriterion("average_cost_price >", value, "averageCostPrice");
            return (Criteria) this;
        }

        public Criteria andAverageCostPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("average_cost_price >=", value, "averageCostPrice");
            return (Criteria) this;
        }

        public Criteria andAverageCostPriceLessThan(Float value) {
            addCriterion("average_cost_price <", value, "averageCostPrice");
            return (Criteria) this;
        }

        public Criteria andAverageCostPriceLessThanOrEqualTo(Float value) {
            addCriterion("average_cost_price <=", value, "averageCostPrice");
            return (Criteria) this;
        }

        public Criteria andAverageCostPriceIn(List<Float> values) {
            addCriterion("average_cost_price in", values, "averageCostPrice");
            return (Criteria) this;
        }

        public Criteria andAverageCostPriceNotIn(List<Float> values) {
            addCriterion("average_cost_price not in", values, "averageCostPrice");
            return (Criteria) this;
        }

        public Criteria andAverageCostPriceBetween(Float value1, Float value2) {
            addCriterion("average_cost_price between", value1, value2, "averageCostPrice");
            return (Criteria) this;
        }

        public Criteria andAverageCostPriceNotBetween(Float value1, Float value2) {
            addCriterion("average_cost_price not between", value1, value2, "averageCostPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseTaxRateIsNull() {
            addCriterion("purchase_tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTaxRateIsNotNull() {
            addCriterion("purchase_tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTaxRateEqualTo(Byte value) {
            addCriterion("purchase_tax_rate =", value, "purchaseTaxRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseTaxRateNotEqualTo(Byte value) {
            addCriterion("purchase_tax_rate <>", value, "purchaseTaxRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseTaxRateGreaterThan(Byte value) {
            addCriterion("purchase_tax_rate >", value, "purchaseTaxRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseTaxRateGreaterThanOrEqualTo(Byte value) {
            addCriterion("purchase_tax_rate >=", value, "purchaseTaxRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseTaxRateLessThan(Byte value) {
            addCriterion("purchase_tax_rate <", value, "purchaseTaxRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseTaxRateLessThanOrEqualTo(Byte value) {
            addCriterion("purchase_tax_rate <=", value, "purchaseTaxRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseTaxRateIn(List<Byte> values) {
            addCriterion("purchase_tax_rate in", values, "purchaseTaxRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseTaxRateNotIn(List<Byte> values) {
            addCriterion("purchase_tax_rate not in", values, "purchaseTaxRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseTaxRateBetween(Byte value1, Byte value2) {
            addCriterion("purchase_tax_rate between", value1, value2, "purchaseTaxRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseTaxRateNotBetween(Byte value1, Byte value2) {
            addCriterion("purchase_tax_rate not between", value1, value2, "purchaseTaxRate");
            return (Criteria) this;
        }

        public Criteria andSellTaxRateIsNull() {
            addCriterion("sell_tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andSellTaxRateIsNotNull() {
            addCriterion("sell_tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andSellTaxRateEqualTo(Byte value) {
            addCriterion("sell_tax_rate =", value, "sellTaxRate");
            return (Criteria) this;
        }

        public Criteria andSellTaxRateNotEqualTo(Byte value) {
            addCriterion("sell_tax_rate <>", value, "sellTaxRate");
            return (Criteria) this;
        }

        public Criteria andSellTaxRateGreaterThan(Byte value) {
            addCriterion("sell_tax_rate >", value, "sellTaxRate");
            return (Criteria) this;
        }

        public Criteria andSellTaxRateGreaterThanOrEqualTo(Byte value) {
            addCriterion("sell_tax_rate >=", value, "sellTaxRate");
            return (Criteria) this;
        }

        public Criteria andSellTaxRateLessThan(Byte value) {
            addCriterion("sell_tax_rate <", value, "sellTaxRate");
            return (Criteria) this;
        }

        public Criteria andSellTaxRateLessThanOrEqualTo(Byte value) {
            addCriterion("sell_tax_rate <=", value, "sellTaxRate");
            return (Criteria) this;
        }

        public Criteria andSellTaxRateIn(List<Byte> values) {
            addCriterion("sell_tax_rate in", values, "sellTaxRate");
            return (Criteria) this;
        }

        public Criteria andSellTaxRateNotIn(List<Byte> values) {
            addCriterion("sell_tax_rate not in", values, "sellTaxRate");
            return (Criteria) this;
        }

        public Criteria andSellTaxRateBetween(Byte value1, Byte value2) {
            addCriterion("sell_tax_rate between", value1, value2, "sellTaxRate");
            return (Criteria) this;
        }

        public Criteria andSellTaxRateNotBetween(Byte value1, Byte value2) {
            addCriterion("sell_tax_rate not between", value1, value2, "sellTaxRate");
            return (Criteria) this;
        }

        public Criteria andProducedDateIsNull() {
            addCriterion("produced_date is null");
            return (Criteria) this;
        }

        public Criteria andProducedDateIsNotNull() {
            addCriterion("produced_date is not null");
            return (Criteria) this;
        }

        public Criteria andProducedDateEqualTo(Date value) {
            addCriterionForJDBCDate("produced_date =", value, "producedDate");
            return (Criteria) this;
        }

        public Criteria andProducedDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("produced_date <>", value, "producedDate");
            return (Criteria) this;
        }

        public Criteria andProducedDateGreaterThan(Date value) {
            addCriterionForJDBCDate("produced_date >", value, "producedDate");
            return (Criteria) this;
        }

        public Criteria andProducedDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("produced_date >=", value, "producedDate");
            return (Criteria) this;
        }

        public Criteria andProducedDateLessThan(Date value) {
            addCriterionForJDBCDate("produced_date <", value, "producedDate");
            return (Criteria) this;
        }

        public Criteria andProducedDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("produced_date <=", value, "producedDate");
            return (Criteria) this;
        }

        public Criteria andProducedDateIn(List<Date> values) {
            addCriterionForJDBCDate("produced_date in", values, "producedDate");
            return (Criteria) this;
        }

        public Criteria andProducedDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("produced_date not in", values, "producedDate");
            return (Criteria) this;
        }

        public Criteria andProducedDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("produced_date between", value1, value2, "producedDate");
            return (Criteria) this;
        }

        public Criteria andProducedDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("produced_date not between", value1, value2, "producedDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIsNull() {
            addCriterion("expiry_date is null");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIsNotNull() {
            addCriterion("expiry_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpiryDateEqualTo(Date value) {
            addCriterionForJDBCDate("expiry_date =", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("expiry_date <>", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("expiry_date >", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expiry_date >=", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateLessThan(Date value) {
            addCriterionForJDBCDate("expiry_date <", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expiry_date <=", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIn(List<Date> values) {
            addCriterionForJDBCDate("expiry_date in", values, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("expiry_date not in", values, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expiry_date between", value1, value2, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expiry_date not between", value1, value2, "expiryDate");
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

        public Criteria andIymInventoryAddIdIsNull() {
            addCriterion("iym_inventory_add_id is null");
            return (Criteria) this;
        }

        public Criteria andIymInventoryAddIdIsNotNull() {
            addCriterion("iym_inventory_add_id is not null");
            return (Criteria) this;
        }

        public Criteria andIymInventoryAddIdEqualTo(Integer value) {
            addCriterion("iym_inventory_add_id =", value, "iymInventoryAddId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryAddIdNotEqualTo(Integer value) {
            addCriterion("iym_inventory_add_id <>", value, "iymInventoryAddId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryAddIdGreaterThan(Integer value) {
            addCriterion("iym_inventory_add_id >", value, "iymInventoryAddId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryAddIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iym_inventory_add_id >=", value, "iymInventoryAddId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryAddIdLessThan(Integer value) {
            addCriterion("iym_inventory_add_id <", value, "iymInventoryAddId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryAddIdLessThanOrEqualTo(Integer value) {
            addCriterion("iym_inventory_add_id <=", value, "iymInventoryAddId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryAddIdIn(List<Integer> values) {
            addCriterion("iym_inventory_add_id in", values, "iymInventoryAddId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryAddIdNotIn(List<Integer> values) {
            addCriterion("iym_inventory_add_id not in", values, "iymInventoryAddId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryAddIdBetween(Integer value1, Integer value2) {
            addCriterion("iym_inventory_add_id between", value1, value2, "iymInventoryAddId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryAddIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iym_inventory_add_id not between", value1, value2, "iymInventoryAddId");
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