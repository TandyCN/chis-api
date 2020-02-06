package pers.tandy.chis.modules.doctorworkstation.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PerformItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PerformItemExample() {
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

        public Criteria andMrmMemberIdIsNull() {
            addCriterion("mrm_member_id is null");
            return (Criteria) this;
        }

        public Criteria andMrmMemberIdIsNotNull() {
            addCriterion("mrm_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMrmMemberIdEqualTo(Integer value) {
            addCriterion("mrm_member_id =", value, "mrmMemberId");
            return (Criteria) this;
        }

        public Criteria andMrmMemberIdNotEqualTo(Integer value) {
            addCriterion("mrm_member_id <>", value, "mrmMemberId");
            return (Criteria) this;
        }

        public Criteria andMrmMemberIdGreaterThan(Integer value) {
            addCriterion("mrm_member_id >", value, "mrmMemberId");
            return (Criteria) this;
        }

        public Criteria andMrmMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mrm_member_id >=", value, "mrmMemberId");
            return (Criteria) this;
        }

        public Criteria andMrmMemberIdLessThan(Integer value) {
            addCriterion("mrm_member_id <", value, "mrmMemberId");
            return (Criteria) this;
        }

        public Criteria andMrmMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("mrm_member_id <=", value, "mrmMemberId");
            return (Criteria) this;
        }

        public Criteria andMrmMemberIdIn(List<Integer> values) {
            addCriterion("mrm_member_id in", values, "mrmMemberId");
            return (Criteria) this;
        }

        public Criteria andMrmMemberIdNotIn(List<Integer> values) {
            addCriterion("mrm_member_id not in", values, "mrmMemberId");
            return (Criteria) this;
        }

        public Criteria andMrmMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("mrm_member_id between", value1, value2, "mrmMemberId");
            return (Criteria) this;
        }

        public Criteria andMrmMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mrm_member_id not between", value1, value2, "mrmMemberId");
            return (Criteria) this;
        }

        public Criteria andCimItemIdIsNull() {
            addCriterion("cim_item_id is null");
            return (Criteria) this;
        }

        public Criteria andCimItemIdIsNotNull() {
            addCriterion("cim_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andCimItemIdEqualTo(Integer value) {
            addCriterion("cim_item_id =", value, "cimItemId");
            return (Criteria) this;
        }

        public Criteria andCimItemIdNotEqualTo(Integer value) {
            addCriterion("cim_item_id <>", value, "cimItemId");
            return (Criteria) this;
        }

        public Criteria andCimItemIdGreaterThan(Integer value) {
            addCriterion("cim_item_id >", value, "cimItemId");
            return (Criteria) this;
        }

        public Criteria andCimItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cim_item_id >=", value, "cimItemId");
            return (Criteria) this;
        }

        public Criteria andCimItemIdLessThan(Integer value) {
            addCriterion("cim_item_id <", value, "cimItemId");
            return (Criteria) this;
        }

        public Criteria andCimItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("cim_item_id <=", value, "cimItemId");
            return (Criteria) this;
        }

        public Criteria andCimItemIdIn(List<Integer> values) {
            addCriterion("cim_item_id in", values, "cimItemId");
            return (Criteria) this;
        }

        public Criteria andCimItemIdNotIn(List<Integer> values) {
            addCriterion("cim_item_id not in", values, "cimItemId");
            return (Criteria) this;
        }

        public Criteria andCimItemIdBetween(Integer value1, Integer value2) {
            addCriterion("cim_item_id between", value1, value2, "cimItemId");
            return (Criteria) this;
        }

        public Criteria andCimItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cim_item_id not between", value1, value2, "cimItemId");
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

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andOnceContainQuantityIsNull() {
            addCriterion("once_contain_quantity is null");
            return (Criteria) this;
        }

        public Criteria andOnceContainQuantityIsNotNull() {
            addCriterion("once_contain_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andOnceContainQuantityEqualTo(Integer value) {
            addCriterion("once_contain_quantity =", value, "onceContainQuantity");
            return (Criteria) this;
        }

        public Criteria andOnceContainQuantityNotEqualTo(Integer value) {
            addCriterion("once_contain_quantity <>", value, "onceContainQuantity");
            return (Criteria) this;
        }

        public Criteria andOnceContainQuantityGreaterThan(Integer value) {
            addCriterion("once_contain_quantity >", value, "onceContainQuantity");
            return (Criteria) this;
        }

        public Criteria andOnceContainQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("once_contain_quantity >=", value, "onceContainQuantity");
            return (Criteria) this;
        }

        public Criteria andOnceContainQuantityLessThan(Integer value) {
            addCriterion("once_contain_quantity <", value, "onceContainQuantity");
            return (Criteria) this;
        }

        public Criteria andOnceContainQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("once_contain_quantity <=", value, "onceContainQuantity");
            return (Criteria) this;
        }

        public Criteria andOnceContainQuantityIn(List<Integer> values) {
            addCriterion("once_contain_quantity in", values, "onceContainQuantity");
            return (Criteria) this;
        }

        public Criteria andOnceContainQuantityNotIn(List<Integer> values) {
            addCriterion("once_contain_quantity not in", values, "onceContainQuantity");
            return (Criteria) this;
        }

        public Criteria andOnceContainQuantityBetween(Integer value1, Integer value2) {
            addCriterion("once_contain_quantity between", value1, value2, "onceContainQuantity");
            return (Criteria) this;
        }

        public Criteria andOnceContainQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("once_contain_quantity not between", value1, value2, "onceContainQuantity");
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

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Integer value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Integer value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Integer value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Integer value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Integer value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Integer> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Integer> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(Integer value1, Integer value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
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