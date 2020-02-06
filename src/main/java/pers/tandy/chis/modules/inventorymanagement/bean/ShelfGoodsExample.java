package pers.tandy.chis.modules.inventorymanagement.bean;

import java.util.ArrayList;
import java.util.List;

public class ShelfGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShelfGoodsExample() {
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

        public Criteria andIymShelfPositionIdIsNull() {
            addCriterion("iym_shelf_position_id is null");
            return (Criteria) this;
        }

        public Criteria andIymShelfPositionIdIsNotNull() {
            addCriterion("iym_shelf_position_id is not null");
            return (Criteria) this;
        }

        public Criteria andIymShelfPositionIdEqualTo(Integer value) {
            addCriterion("iym_shelf_position_id =", value, "iymShelfPositionId");
            return (Criteria) this;
        }

        public Criteria andIymShelfPositionIdNotEqualTo(Integer value) {
            addCriterion("iym_shelf_position_id <>", value, "iymShelfPositionId");
            return (Criteria) this;
        }

        public Criteria andIymShelfPositionIdGreaterThan(Integer value) {
            addCriterion("iym_shelf_position_id >", value, "iymShelfPositionId");
            return (Criteria) this;
        }

        public Criteria andIymShelfPositionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iym_shelf_position_id >=", value, "iymShelfPositionId");
            return (Criteria) this;
        }

        public Criteria andIymShelfPositionIdLessThan(Integer value) {
            addCriterion("iym_shelf_position_id <", value, "iymShelfPositionId");
            return (Criteria) this;
        }

        public Criteria andIymShelfPositionIdLessThanOrEqualTo(Integer value) {
            addCriterion("iym_shelf_position_id <=", value, "iymShelfPositionId");
            return (Criteria) this;
        }

        public Criteria andIymShelfPositionIdIn(List<Integer> values) {
            addCriterion("iym_shelf_position_id in", values, "iymShelfPositionId");
            return (Criteria) this;
        }

        public Criteria andIymShelfPositionIdNotIn(List<Integer> values) {
            addCriterion("iym_shelf_position_id not in", values, "iymShelfPositionId");
            return (Criteria) this;
        }

        public Criteria andIymShelfPositionIdBetween(Integer value1, Integer value2) {
            addCriterion("iym_shelf_position_id between", value1, value2, "iymShelfPositionId");
            return (Criteria) this;
        }

        public Criteria andIymShelfPositionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iym_shelf_position_id not between", value1, value2, "iymShelfPositionId");
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

        public Criteria andMaxQuantityIsNull() {
            addCriterion("max_quantity is null");
            return (Criteria) this;
        }

        public Criteria andMaxQuantityIsNotNull() {
            addCriterion("max_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andMaxQuantityEqualTo(Integer value) {
            addCriterion("max_quantity =", value, "maxQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxQuantityNotEqualTo(Integer value) {
            addCriterion("max_quantity <>", value, "maxQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxQuantityGreaterThan(Integer value) {
            addCriterion("max_quantity >", value, "maxQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_quantity >=", value, "maxQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxQuantityLessThan(Integer value) {
            addCriterion("max_quantity <", value, "maxQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("max_quantity <=", value, "maxQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxQuantityIn(List<Integer> values) {
            addCriterion("max_quantity in", values, "maxQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxQuantityNotIn(List<Integer> values) {
            addCriterion("max_quantity not in", values, "maxQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxQuantityBetween(Integer value1, Integer value2) {
            addCriterion("max_quantity between", value1, value2, "maxQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("max_quantity not between", value1, value2, "maxQuantity");
            return (Criteria) this;
        }

        public Criteria andMinQuantityIsNull() {
            addCriterion("min_quantity is null");
            return (Criteria) this;
        }

        public Criteria andMinQuantityIsNotNull() {
            addCriterion("min_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andMinQuantityEqualTo(Integer value) {
            addCriterion("min_quantity =", value, "minQuantity");
            return (Criteria) this;
        }

        public Criteria andMinQuantityNotEqualTo(Integer value) {
            addCriterion("min_quantity <>", value, "minQuantity");
            return (Criteria) this;
        }

        public Criteria andMinQuantityGreaterThan(Integer value) {
            addCriterion("min_quantity >", value, "minQuantity");
            return (Criteria) this;
        }

        public Criteria andMinQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_quantity >=", value, "minQuantity");
            return (Criteria) this;
        }

        public Criteria andMinQuantityLessThan(Integer value) {
            addCriterion("min_quantity <", value, "minQuantity");
            return (Criteria) this;
        }

        public Criteria andMinQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("min_quantity <=", value, "minQuantity");
            return (Criteria) this;
        }

        public Criteria andMinQuantityIn(List<Integer> values) {
            addCriterion("min_quantity in", values, "minQuantity");
            return (Criteria) this;
        }

        public Criteria andMinQuantityNotIn(List<Integer> values) {
            addCriterion("min_quantity not in", values, "minQuantity");
            return (Criteria) this;
        }

        public Criteria andMinQuantityBetween(Integer value1, Integer value2) {
            addCriterion("min_quantity between", value1, value2, "minQuantity");
            return (Criteria) this;
        }

        public Criteria andMinQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("min_quantity not between", value1, value2, "minQuantity");
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