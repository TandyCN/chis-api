package pers.tandy.chis.modules.doctorworkstation.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PerformItemRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PerformItemRecordExample() {
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

        public Criteria andDwtPerformItemIdIsNull() {
            addCriterion("dwt_perform_item_id is null");
            return (Criteria) this;
        }

        public Criteria andDwtPerformItemIdIsNotNull() {
            addCriterion("dwt_perform_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andDwtPerformItemIdEqualTo(Integer value) {
            addCriterion("dwt_perform_item_id =", value, "dwtPerformItemId");
            return (Criteria) this;
        }

        public Criteria andDwtPerformItemIdNotEqualTo(Integer value) {
            addCriterion("dwt_perform_item_id <>", value, "dwtPerformItemId");
            return (Criteria) this;
        }

        public Criteria andDwtPerformItemIdGreaterThan(Integer value) {
            addCriterion("dwt_perform_item_id >", value, "dwtPerformItemId");
            return (Criteria) this;
        }

        public Criteria andDwtPerformItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dwt_perform_item_id >=", value, "dwtPerformItemId");
            return (Criteria) this;
        }

        public Criteria andDwtPerformItemIdLessThan(Integer value) {
            addCriterion("dwt_perform_item_id <", value, "dwtPerformItemId");
            return (Criteria) this;
        }

        public Criteria andDwtPerformItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("dwt_perform_item_id <=", value, "dwtPerformItemId");
            return (Criteria) this;
        }

        public Criteria andDwtPerformItemIdIn(List<Integer> values) {
            addCriterion("dwt_perform_item_id in", values, "dwtPerformItemId");
            return (Criteria) this;
        }

        public Criteria andDwtPerformItemIdNotIn(List<Integer> values) {
            addCriterion("dwt_perform_item_id not in", values, "dwtPerformItemId");
            return (Criteria) this;
        }

        public Criteria andDwtPerformItemIdBetween(Integer value1, Integer value2) {
            addCriterion("dwt_perform_item_id between", value1, value2, "dwtPerformItemId");
            return (Criteria) this;
        }

        public Criteria andDwtPerformItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dwt_perform_item_id not between", value1, value2, "dwtPerformItemId");
            return (Criteria) this;
        }

        public Criteria andPerformQuantityIsNull() {
            addCriterion("perform_quantity is null");
            return (Criteria) this;
        }

        public Criteria andPerformQuantityIsNotNull() {
            addCriterion("perform_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andPerformQuantityEqualTo(Integer value) {
            addCriterion("perform_quantity =", value, "performQuantity");
            return (Criteria) this;
        }

        public Criteria andPerformQuantityNotEqualTo(Integer value) {
            addCriterion("perform_quantity <>", value, "performQuantity");
            return (Criteria) this;
        }

        public Criteria andPerformQuantityGreaterThan(Integer value) {
            addCriterion("perform_quantity >", value, "performQuantity");
            return (Criteria) this;
        }

        public Criteria andPerformQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("perform_quantity >=", value, "performQuantity");
            return (Criteria) this;
        }

        public Criteria andPerformQuantityLessThan(Integer value) {
            addCriterion("perform_quantity <", value, "performQuantity");
            return (Criteria) this;
        }

        public Criteria andPerformQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("perform_quantity <=", value, "performQuantity");
            return (Criteria) this;
        }

        public Criteria andPerformQuantityIn(List<Integer> values) {
            addCriterion("perform_quantity in", values, "performQuantity");
            return (Criteria) this;
        }

        public Criteria andPerformQuantityNotIn(List<Integer> values) {
            addCriterion("perform_quantity not in", values, "performQuantity");
            return (Criteria) this;
        }

        public Criteria andPerformQuantityBetween(Integer value1, Integer value2) {
            addCriterion("perform_quantity between", value1, value2, "performQuantity");
            return (Criteria) this;
        }

        public Criteria andPerformQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("perform_quantity not between", value1, value2, "performQuantity");
            return (Criteria) this;
        }

        public Criteria andResidueQuantityIsNull() {
            addCriterion("residue_quantity is null");
            return (Criteria) this;
        }

        public Criteria andResidueQuantityIsNotNull() {
            addCriterion("residue_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andResidueQuantityEqualTo(Integer value) {
            addCriterion("residue_quantity =", value, "residueQuantity");
            return (Criteria) this;
        }

        public Criteria andResidueQuantityNotEqualTo(Integer value) {
            addCriterion("residue_quantity <>", value, "residueQuantity");
            return (Criteria) this;
        }

        public Criteria andResidueQuantityGreaterThan(Integer value) {
            addCriterion("residue_quantity >", value, "residueQuantity");
            return (Criteria) this;
        }

        public Criteria andResidueQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("residue_quantity >=", value, "residueQuantity");
            return (Criteria) this;
        }

        public Criteria andResidueQuantityLessThan(Integer value) {
            addCriterion("residue_quantity <", value, "residueQuantity");
            return (Criteria) this;
        }

        public Criteria andResidueQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("residue_quantity <=", value, "residueQuantity");
            return (Criteria) this;
        }

        public Criteria andResidueQuantityIn(List<Integer> values) {
            addCriterion("residue_quantity in", values, "residueQuantity");
            return (Criteria) this;
        }

        public Criteria andResidueQuantityNotIn(List<Integer> values) {
            addCriterion("residue_quantity not in", values, "residueQuantity");
            return (Criteria) this;
        }

        public Criteria andResidueQuantityBetween(Integer value1, Integer value2) {
            addCriterion("residue_quantity between", value1, value2, "residueQuantity");
            return (Criteria) this;
        }

        public Criteria andResidueQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("residue_quantity not between", value1, value2, "residueQuantity");
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

        public Criteria andOperatorIdIsNull() {
            addCriterion("operator_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(Integer value) {
            addCriterion("operator_id =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(Integer value) {
            addCriterion("operator_id <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(Integer value) {
            addCriterion("operator_id >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("operator_id >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(Integer value) {
            addCriterion("operator_id <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("operator_id <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<Integer> values) {
            addCriterion("operator_id in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<Integer> values) {
            addCriterion("operator_id not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(Integer value1, Integer value2) {
            addCriterion("operator_id between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("operator_id not between", value1, value2, "operatorId");
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