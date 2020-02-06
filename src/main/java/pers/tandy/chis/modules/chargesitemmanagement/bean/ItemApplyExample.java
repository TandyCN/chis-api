package pers.tandy.chis.modules.chargesitemmanagement.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ItemApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemApplyExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCimItemTypeIdIsNull() {
            addCriterion("cim_item_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCimItemTypeIdIsNotNull() {
            addCriterion("cim_item_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCimItemTypeIdEqualTo(Integer value) {
            addCriterion("cim_item_type_id =", value, "cimItemTypeId");
            return (Criteria) this;
        }

        public Criteria andCimItemTypeIdNotEqualTo(Integer value) {
            addCriterion("cim_item_type_id <>", value, "cimItemTypeId");
            return (Criteria) this;
        }

        public Criteria andCimItemTypeIdGreaterThan(Integer value) {
            addCriterion("cim_item_type_id >", value, "cimItemTypeId");
            return (Criteria) this;
        }

        public Criteria andCimItemTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cim_item_type_id >=", value, "cimItemTypeId");
            return (Criteria) this;
        }

        public Criteria andCimItemTypeIdLessThan(Integer value) {
            addCriterion("cim_item_type_id <", value, "cimItemTypeId");
            return (Criteria) this;
        }

        public Criteria andCimItemTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("cim_item_type_id <=", value, "cimItemTypeId");
            return (Criteria) this;
        }

        public Criteria andCimItemTypeIdIn(List<Integer> values) {
            addCriterion("cim_item_type_id in", values, "cimItemTypeId");
            return (Criteria) this;
        }

        public Criteria andCimItemTypeIdNotIn(List<Integer> values) {
            addCriterion("cim_item_type_id not in", values, "cimItemTypeId");
            return (Criteria) this;
        }

        public Criteria andCimItemTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("cim_item_type_id between", value1, value2, "cimItemTypeId");
            return (Criteria) this;
        }

        public Criteria andCimItemTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cim_item_type_id not between", value1, value2, "cimItemTypeId");
            return (Criteria) this;
        }

        public Criteria andItemUnitsIdIsNull() {
            addCriterion("item_units_id is null");
            return (Criteria) this;
        }

        public Criteria andItemUnitsIdIsNotNull() {
            addCriterion("item_units_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemUnitsIdEqualTo(Integer value) {
            addCriterion("item_units_id =", value, "itemUnitsId");
            return (Criteria) this;
        }

        public Criteria andItemUnitsIdNotEqualTo(Integer value) {
            addCriterion("item_units_id <>", value, "itemUnitsId");
            return (Criteria) this;
        }

        public Criteria andItemUnitsIdGreaterThan(Integer value) {
            addCriterion("item_units_id >", value, "itemUnitsId");
            return (Criteria) this;
        }

        public Criteria andItemUnitsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_units_id >=", value, "itemUnitsId");
            return (Criteria) this;
        }

        public Criteria andItemUnitsIdLessThan(Integer value) {
            addCriterion("item_units_id <", value, "itemUnitsId");
            return (Criteria) this;
        }

        public Criteria andItemUnitsIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_units_id <=", value, "itemUnitsId");
            return (Criteria) this;
        }

        public Criteria andItemUnitsIdIn(List<Integer> values) {
            addCriterion("item_units_id in", values, "itemUnitsId");
            return (Criteria) this;
        }

        public Criteria andItemUnitsIdNotIn(List<Integer> values) {
            addCriterion("item_units_id not in", values, "itemUnitsId");
            return (Criteria) this;
        }

        public Criteria andItemUnitsIdBetween(Integer value1, Integer value2) {
            addCriterion("item_units_id between", value1, value2, "itemUnitsId");
            return (Criteria) this;
        }

        public Criteria andItemUnitsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_units_id not between", value1, value2, "itemUnitsId");
            return (Criteria) this;
        }

        public Criteria andBefitGenderIdIsNull() {
            addCriterion("befit_gender_id is null");
            return (Criteria) this;
        }

        public Criteria andBefitGenderIdIsNotNull() {
            addCriterion("befit_gender_id is not null");
            return (Criteria) this;
        }

        public Criteria andBefitGenderIdEqualTo(Integer value) {
            addCriterion("befit_gender_id =", value, "befitGenderId");
            return (Criteria) this;
        }

        public Criteria andBefitGenderIdNotEqualTo(Integer value) {
            addCriterion("befit_gender_id <>", value, "befitGenderId");
            return (Criteria) this;
        }

        public Criteria andBefitGenderIdGreaterThan(Integer value) {
            addCriterion("befit_gender_id >", value, "befitGenderId");
            return (Criteria) this;
        }

        public Criteria andBefitGenderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("befit_gender_id >=", value, "befitGenderId");
            return (Criteria) this;
        }

        public Criteria andBefitGenderIdLessThan(Integer value) {
            addCriterion("befit_gender_id <", value, "befitGenderId");
            return (Criteria) this;
        }

        public Criteria andBefitGenderIdLessThanOrEqualTo(Integer value) {
            addCriterion("befit_gender_id <=", value, "befitGenderId");
            return (Criteria) this;
        }

        public Criteria andBefitGenderIdIn(List<Integer> values) {
            addCriterion("befit_gender_id in", values, "befitGenderId");
            return (Criteria) this;
        }

        public Criteria andBefitGenderIdNotIn(List<Integer> values) {
            addCriterion("befit_gender_id not in", values, "befitGenderId");
            return (Criteria) this;
        }

        public Criteria andBefitGenderIdBetween(Integer value1, Integer value2) {
            addCriterion("befit_gender_id between", value1, value2, "befitGenderId");
            return (Criteria) this;
        }

        public Criteria andBefitGenderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("befit_gender_id not between", value1, value2, "befitGenderId");
            return (Criteria) this;
        }

        public Criteria andBillingTypeIdIsNull() {
            addCriterion("billing_type_id is null");
            return (Criteria) this;
        }

        public Criteria andBillingTypeIdIsNotNull() {
            addCriterion("billing_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andBillingTypeIdEqualTo(Integer value) {
            addCriterion("billing_type_id =", value, "billingTypeId");
            return (Criteria) this;
        }

        public Criteria andBillingTypeIdNotEqualTo(Integer value) {
            addCriterion("billing_type_id <>", value, "billingTypeId");
            return (Criteria) this;
        }

        public Criteria andBillingTypeIdGreaterThan(Integer value) {
            addCriterion("billing_type_id >", value, "billingTypeId");
            return (Criteria) this;
        }

        public Criteria andBillingTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("billing_type_id >=", value, "billingTypeId");
            return (Criteria) this;
        }

        public Criteria andBillingTypeIdLessThan(Integer value) {
            addCriterion("billing_type_id <", value, "billingTypeId");
            return (Criteria) this;
        }

        public Criteria andBillingTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("billing_type_id <=", value, "billingTypeId");
            return (Criteria) this;
        }

        public Criteria andBillingTypeIdIn(List<Integer> values) {
            addCriterion("billing_type_id in", values, "billingTypeId");
            return (Criteria) this;
        }

        public Criteria andBillingTypeIdNotIn(List<Integer> values) {
            addCriterion("billing_type_id not in", values, "billingTypeId");
            return (Criteria) this;
        }

        public Criteria andBillingTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("billing_type_id between", value1, value2, "billingTypeId");
            return (Criteria) this;
        }

        public Criteria andBillingTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("billing_type_id not between", value1, value2, "billingTypeId");
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

        public Criteria andQuantityEqualTo(Byte value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Byte value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Byte value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Byte value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Byte value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Byte value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Byte> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Byte> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Byte value1, Byte value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Byte value1, Byte value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andRetailPriceIsNull() {
            addCriterion("retail_price is null");
            return (Criteria) this;
        }

        public Criteria andRetailPriceIsNotNull() {
            addCriterion("retail_price is not null");
            return (Criteria) this;
        }

        public Criteria andRetailPriceEqualTo(Float value) {
            addCriterion("retail_price =", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceNotEqualTo(Float value) {
            addCriterion("retail_price <>", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceGreaterThan(Float value) {
            addCriterion("retail_price >", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("retail_price >=", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceLessThan(Float value) {
            addCriterion("retail_price <", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceLessThanOrEqualTo(Float value) {
            addCriterion("retail_price <=", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceIn(List<Float> values) {
            addCriterion("retail_price in", values, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceNotIn(List<Float> values) {
            addCriterion("retail_price not in", values, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceBetween(Float value1, Float value2) {
            addCriterion("retail_price between", value1, value2, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceNotBetween(Float value1, Float value2) {
            addCriterion("retail_price not between", value1, value2, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andExplainsIsNull() {
            addCriterion("explains is null");
            return (Criteria) this;
        }

        public Criteria andExplainsIsNotNull() {
            addCriterion("explains is not null");
            return (Criteria) this;
        }

        public Criteria andExplainsEqualTo(String value) {
            addCriterion("explains =", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsNotEqualTo(String value) {
            addCriterion("explains <>", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsGreaterThan(String value) {
            addCriterion("explains >", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsGreaterThanOrEqualTo(String value) {
            addCriterion("explains >=", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsLessThan(String value) {
            addCriterion("explains <", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsLessThanOrEqualTo(String value) {
            addCriterion("explains <=", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsLike(String value) {
            addCriterion("explains like", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsNotLike(String value) {
            addCriterion("explains not like", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsIn(List<String> values) {
            addCriterion("explains in", values, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsNotIn(List<String> values) {
            addCriterion("explains not in", values, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsBetween(String value1, String value2) {
            addCriterion("explains between", value1, value2, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsNotBetween(String value1, String value2) {
            addCriterion("explains not between", value1, value2, "explains");
            return (Criteria) this;
        }

        public Criteria andDiscountableIsNull() {
            addCriterion("discountable is null");
            return (Criteria) this;
        }

        public Criteria andDiscountableIsNotNull() {
            addCriterion("discountable is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountableEqualTo(Boolean value) {
            addCriterion("discountable =", value, "discountable");
            return (Criteria) this;
        }

        public Criteria andDiscountableNotEqualTo(Boolean value) {
            addCriterion("discountable <>", value, "discountable");
            return (Criteria) this;
        }

        public Criteria andDiscountableGreaterThan(Boolean value) {
            addCriterion("discountable >", value, "discountable");
            return (Criteria) this;
        }

        public Criteria andDiscountableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("discountable >=", value, "discountable");
            return (Criteria) this;
        }

        public Criteria andDiscountableLessThan(Boolean value) {
            addCriterion("discountable <", value, "discountable");
            return (Criteria) this;
        }

        public Criteria andDiscountableLessThanOrEqualTo(Boolean value) {
            addCriterion("discountable <=", value, "discountable");
            return (Criteria) this;
        }

        public Criteria andDiscountableIn(List<Boolean> values) {
            addCriterion("discountable in", values, "discountable");
            return (Criteria) this;
        }

        public Criteria andDiscountableNotIn(List<Boolean> values) {
            addCriterion("discountable not in", values, "discountable");
            return (Criteria) this;
        }

        public Criteria andDiscountableBetween(Boolean value1, Boolean value2) {
            addCriterion("discountable between", value1, value2, "discountable");
            return (Criteria) this;
        }

        public Criteria andDiscountableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("discountable not between", value1, value2, "discountable");
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

        public Criteria andPricerIdIsNull() {
            addCriterion("pricer_id is null");
            return (Criteria) this;
        }

        public Criteria andPricerIdIsNotNull() {
            addCriterion("pricer_id is not null");
            return (Criteria) this;
        }

        public Criteria andPricerIdEqualTo(Integer value) {
            addCriterion("pricer_id =", value, "pricerId");
            return (Criteria) this;
        }

        public Criteria andPricerIdNotEqualTo(Integer value) {
            addCriterion("pricer_id <>", value, "pricerId");
            return (Criteria) this;
        }

        public Criteria andPricerIdGreaterThan(Integer value) {
            addCriterion("pricer_id >", value, "pricerId");
            return (Criteria) this;
        }

        public Criteria andPricerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pricer_id >=", value, "pricerId");
            return (Criteria) this;
        }

        public Criteria andPricerIdLessThan(Integer value) {
            addCriterion("pricer_id <", value, "pricerId");
            return (Criteria) this;
        }

        public Criteria andPricerIdLessThanOrEqualTo(Integer value) {
            addCriterion("pricer_id <=", value, "pricerId");
            return (Criteria) this;
        }

        public Criteria andPricerIdIn(List<Integer> values) {
            addCriterion("pricer_id in", values, "pricerId");
            return (Criteria) this;
        }

        public Criteria andPricerIdNotIn(List<Integer> values) {
            addCriterion("pricer_id not in", values, "pricerId");
            return (Criteria) this;
        }

        public Criteria andPricerIdBetween(Integer value1, Integer value2) {
            addCriterion("pricer_id between", value1, value2, "pricerId");
            return (Criteria) this;
        }

        public Criteria andPricerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pricer_id not between", value1, value2, "pricerId");
            return (Criteria) this;
        }

        public Criteria andPricingDateIsNull() {
            addCriterion("pricing_date is null");
            return (Criteria) this;
        }

        public Criteria andPricingDateIsNotNull() {
            addCriterion("pricing_date is not null");
            return (Criteria) this;
        }

        public Criteria andPricingDateEqualTo(Date value) {
            addCriterionForJDBCDate("pricing_date =", value, "pricingDate");
            return (Criteria) this;
        }

        public Criteria andPricingDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pricing_date <>", value, "pricingDate");
            return (Criteria) this;
        }

        public Criteria andPricingDateGreaterThan(Date value) {
            addCriterionForJDBCDate("pricing_date >", value, "pricingDate");
            return (Criteria) this;
        }

        public Criteria andPricingDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pricing_date >=", value, "pricingDate");
            return (Criteria) this;
        }

        public Criteria andPricingDateLessThan(Date value) {
            addCriterionForJDBCDate("pricing_date <", value, "pricingDate");
            return (Criteria) this;
        }

        public Criteria andPricingDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pricing_date <=", value, "pricingDate");
            return (Criteria) this;
        }

        public Criteria andPricingDateIn(List<Date> values) {
            addCriterionForJDBCDate("pricing_date in", values, "pricingDate");
            return (Criteria) this;
        }

        public Criteria andPricingDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pricing_date not in", values, "pricingDate");
            return (Criteria) this;
        }

        public Criteria andPricingDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pricing_date between", value1, value2, "pricingDate");
            return (Criteria) this;
        }

        public Criteria andPricingDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pricing_date not between", value1, value2, "pricingDate");
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