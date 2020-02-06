package pers.tandy.chis.modules.doctorworkstation.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SellPrescriptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SellPrescriptionExample() {
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

        public Criteria andSysSellTypeIdIsNull() {
            addCriterion("sys_sell_type_id is null");
            return (Criteria) this;
        }

        public Criteria andSysSellTypeIdIsNotNull() {
            addCriterion("sys_sell_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysSellTypeIdEqualTo(Integer value) {
            addCriterion("sys_sell_type_id =", value, "sysSellTypeId");
            return (Criteria) this;
        }

        public Criteria andSysSellTypeIdNotEqualTo(Integer value) {
            addCriterion("sys_sell_type_id <>", value, "sysSellTypeId");
            return (Criteria) this;
        }

        public Criteria andSysSellTypeIdGreaterThan(Integer value) {
            addCriterion("sys_sell_type_id >", value, "sysSellTypeId");
            return (Criteria) this;
        }

        public Criteria andSysSellTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_sell_type_id >=", value, "sysSellTypeId");
            return (Criteria) this;
        }

        public Criteria andSysSellTypeIdLessThan(Integer value) {
            addCriterion("sys_sell_type_id <", value, "sysSellTypeId");
            return (Criteria) this;
        }

        public Criteria andSysSellTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("sys_sell_type_id <=", value, "sysSellTypeId");
            return (Criteria) this;
        }

        public Criteria andSysSellTypeIdIn(List<Integer> values) {
            addCriterion("sys_sell_type_id in", values, "sysSellTypeId");
            return (Criteria) this;
        }

        public Criteria andSysSellTypeIdNotIn(List<Integer> values) {
            addCriterion("sys_sell_type_id not in", values, "sysSellTypeId");
            return (Criteria) this;
        }

        public Criteria andSysSellTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("sys_sell_type_id between", value1, value2, "sysSellTypeId");
            return (Criteria) this;
        }

        public Criteria andSysSellTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_sell_type_id not between", value1, value2, "sysSellTypeId");
            return (Criteria) this;
        }

        public Criteria andDwtClinicalHistoryIdIsNull() {
            addCriterion("dwt_clinical_history_id is null");
            return (Criteria) this;
        }

        public Criteria andDwtClinicalHistoryIdIsNotNull() {
            addCriterion("dwt_clinical_history_id is not null");
            return (Criteria) this;
        }

        public Criteria andDwtClinicalHistoryIdEqualTo(Integer value) {
            addCriterion("dwt_clinical_history_id =", value, "dwtClinicalHistoryId");
            return (Criteria) this;
        }

        public Criteria andDwtClinicalHistoryIdNotEqualTo(Integer value) {
            addCriterion("dwt_clinical_history_id <>", value, "dwtClinicalHistoryId");
            return (Criteria) this;
        }

        public Criteria andDwtClinicalHistoryIdGreaterThan(Integer value) {
            addCriterion("dwt_clinical_history_id >", value, "dwtClinicalHistoryId");
            return (Criteria) this;
        }

        public Criteria andDwtClinicalHistoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dwt_clinical_history_id >=", value, "dwtClinicalHistoryId");
            return (Criteria) this;
        }

        public Criteria andDwtClinicalHistoryIdLessThan(Integer value) {
            addCriterion("dwt_clinical_history_id <", value, "dwtClinicalHistoryId");
            return (Criteria) this;
        }

        public Criteria andDwtClinicalHistoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("dwt_clinical_history_id <=", value, "dwtClinicalHistoryId");
            return (Criteria) this;
        }

        public Criteria andDwtClinicalHistoryIdIn(List<Integer> values) {
            addCriterion("dwt_clinical_history_id in", values, "dwtClinicalHistoryId");
            return (Criteria) this;
        }

        public Criteria andDwtClinicalHistoryIdNotIn(List<Integer> values) {
            addCriterion("dwt_clinical_history_id not in", values, "dwtClinicalHistoryId");
            return (Criteria) this;
        }

        public Criteria andDwtClinicalHistoryIdBetween(Integer value1, Integer value2) {
            addCriterion("dwt_clinical_history_id between", value1, value2, "dwtClinicalHistoryId");
            return (Criteria) this;
        }

        public Criteria andDwtClinicalHistoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dwt_clinical_history_id not between", value1, value2, "dwtClinicalHistoryId");
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

        public Criteria andEntityTypeIdIsNull() {
            addCriterion("entity_type_id is null");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIdIsNotNull() {
            addCriterion("entity_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIdEqualTo(Integer value) {
            addCriterion("entity_type_id =", value, "entityTypeId");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIdNotEqualTo(Integer value) {
            addCriterion("entity_type_id <>", value, "entityTypeId");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIdGreaterThan(Integer value) {
            addCriterion("entity_type_id >", value, "entityTypeId");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("entity_type_id >=", value, "entityTypeId");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIdLessThan(Integer value) {
            addCriterion("entity_type_id <", value, "entityTypeId");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("entity_type_id <=", value, "entityTypeId");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIdIn(List<Integer> values) {
            addCriterion("entity_type_id in", values, "entityTypeId");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIdNotIn(List<Integer> values) {
            addCriterion("entity_type_id not in", values, "entityTypeId");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("entity_type_id between", value1, value2, "entityTypeId");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("entity_type_id not between", value1, value2, "entityTypeId");
            return (Criteria) this;
        }

        public Criteria andEntityIdIsNull() {
            addCriterion("entity_id is null");
            return (Criteria) this;
        }

        public Criteria andEntityIdIsNotNull() {
            addCriterion("entity_id is not null");
            return (Criteria) this;
        }

        public Criteria andEntityIdEqualTo(Integer value) {
            addCriterion("entity_id =", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotEqualTo(Integer value) {
            addCriterion("entity_id <>", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThan(Integer value) {
            addCriterion("entity_id >", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("entity_id >=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThan(Integer value) {
            addCriterion("entity_id <", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThanOrEqualTo(Integer value) {
            addCriterion("entity_id <=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdIn(List<Integer> values) {
            addCriterion("entity_id in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotIn(List<Integer> values) {
            addCriterion("entity_id not in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdBetween(Integer value1, Integer value2) {
            addCriterion("entity_id between", value1, value2, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("entity_id not between", value1, value2, "entityId");
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

        public Criteria andSpecsIsNull() {
            addCriterion("specs is null");
            return (Criteria) this;
        }

        public Criteria andSpecsIsNotNull() {
            addCriterion("specs is not null");
            return (Criteria) this;
        }

        public Criteria andSpecsEqualTo(String value) {
            addCriterion("specs =", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsNotEqualTo(String value) {
            addCriterion("specs <>", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsGreaterThan(String value) {
            addCriterion("specs >", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsGreaterThanOrEqualTo(String value) {
            addCriterion("specs >=", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsLessThan(String value) {
            addCriterion("specs <", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsLessThanOrEqualTo(String value) {
            addCriterion("specs <=", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsLike(String value) {
            addCriterion("specs like", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsNotLike(String value) {
            addCriterion("specs not like", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsIn(List<String> values) {
            addCriterion("specs in", values, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsNotIn(List<String> values) {
            addCriterion("specs not in", values, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsBetween(String value1, String value2) {
            addCriterion("specs between", value1, value2, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsNotBetween(String value1, String value2) {
            addCriterion("specs not between", value1, value2, "specs");
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

        public Criteria andUnitsNameIsNull() {
            addCriterion("units_name is null");
            return (Criteria) this;
        }

        public Criteria andUnitsNameIsNotNull() {
            addCriterion("units_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnitsNameEqualTo(String value) {
            addCriterion("units_name =", value, "unitsName");
            return (Criteria) this;
        }

        public Criteria andUnitsNameNotEqualTo(String value) {
            addCriterion("units_name <>", value, "unitsName");
            return (Criteria) this;
        }

        public Criteria andUnitsNameGreaterThan(String value) {
            addCriterion("units_name >", value, "unitsName");
            return (Criteria) this;
        }

        public Criteria andUnitsNameGreaterThanOrEqualTo(String value) {
            addCriterion("units_name >=", value, "unitsName");
            return (Criteria) this;
        }

        public Criteria andUnitsNameLessThan(String value) {
            addCriterion("units_name <", value, "unitsName");
            return (Criteria) this;
        }

        public Criteria andUnitsNameLessThanOrEqualTo(String value) {
            addCriterion("units_name <=", value, "unitsName");
            return (Criteria) this;
        }

        public Criteria andUnitsNameLike(String value) {
            addCriterion("units_name like", value, "unitsName");
            return (Criteria) this;
        }

        public Criteria andUnitsNameNotLike(String value) {
            addCriterion("units_name not like", value, "unitsName");
            return (Criteria) this;
        }

        public Criteria andUnitsNameIn(List<String> values) {
            addCriterion("units_name in", values, "unitsName");
            return (Criteria) this;
        }

        public Criteria andUnitsNameNotIn(List<String> values) {
            addCriterion("units_name not in", values, "unitsName");
            return (Criteria) this;
        }

        public Criteria andUnitsNameBetween(String value1, String value2) {
            addCriterion("units_name between", value1, value2, "unitsName");
            return (Criteria) this;
        }

        public Criteria andUnitsNameNotBetween(String value1, String value2) {
            addCriterion("units_name not between", value1, value2, "unitsName");
            return (Criteria) this;
        }

        public Criteria andFoldQuantityIsNull() {
            addCriterion("fold_quantity is null");
            return (Criteria) this;
        }

        public Criteria andFoldQuantityIsNotNull() {
            addCriterion("fold_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andFoldQuantityEqualTo(Integer value) {
            addCriterion("fold_quantity =", value, "foldQuantity");
            return (Criteria) this;
        }

        public Criteria andFoldQuantityNotEqualTo(Integer value) {
            addCriterion("fold_quantity <>", value, "foldQuantity");
            return (Criteria) this;
        }

        public Criteria andFoldQuantityGreaterThan(Integer value) {
            addCriterion("fold_quantity >", value, "foldQuantity");
            return (Criteria) this;
        }

        public Criteria andFoldQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("fold_quantity >=", value, "foldQuantity");
            return (Criteria) this;
        }

        public Criteria andFoldQuantityLessThan(Integer value) {
            addCriterion("fold_quantity <", value, "foldQuantity");
            return (Criteria) this;
        }

        public Criteria andFoldQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("fold_quantity <=", value, "foldQuantity");
            return (Criteria) this;
        }

        public Criteria andFoldQuantityIn(List<Integer> values) {
            addCriterion("fold_quantity in", values, "foldQuantity");
            return (Criteria) this;
        }

        public Criteria andFoldQuantityNotIn(List<Integer> values) {
            addCriterion("fold_quantity not in", values, "foldQuantity");
            return (Criteria) this;
        }

        public Criteria andFoldQuantityBetween(Integer value1, Integer value2) {
            addCriterion("fold_quantity between", value1, value2, "foldQuantity");
            return (Criteria) this;
        }

        public Criteria andFoldQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("fold_quantity not between", value1, value2, "foldQuantity");
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

        public Criteria andSigJsonIsNull() {
            addCriterion("sig_json is null");
            return (Criteria) this;
        }

        public Criteria andSigJsonIsNotNull() {
            addCriterion("sig_json is not null");
            return (Criteria) this;
        }

        public Criteria andSigJsonEqualTo(String value) {
            addCriterion("sig_json =", value, "sigJson");
            return (Criteria) this;
        }

        public Criteria andSigJsonNotEqualTo(String value) {
            addCriterion("sig_json <>", value, "sigJson");
            return (Criteria) this;
        }

        public Criteria andSigJsonGreaterThan(String value) {
            addCriterion("sig_json >", value, "sigJson");
            return (Criteria) this;
        }

        public Criteria andSigJsonGreaterThanOrEqualTo(String value) {
            addCriterion("sig_json >=", value, "sigJson");
            return (Criteria) this;
        }

        public Criteria andSigJsonLessThan(String value) {
            addCriterion("sig_json <", value, "sigJson");
            return (Criteria) this;
        }

        public Criteria andSigJsonLessThanOrEqualTo(String value) {
            addCriterion("sig_json <=", value, "sigJson");
            return (Criteria) this;
        }

        public Criteria andSigJsonLike(String value) {
            addCriterion("sig_json like", value, "sigJson");
            return (Criteria) this;
        }

        public Criteria andSigJsonNotLike(String value) {
            addCriterion("sig_json not like", value, "sigJson");
            return (Criteria) this;
        }

        public Criteria andSigJsonIn(List<String> values) {
            addCriterion("sig_json in", values, "sigJson");
            return (Criteria) this;
        }

        public Criteria andSigJsonNotIn(List<String> values) {
            addCriterion("sig_json not in", values, "sigJson");
            return (Criteria) this;
        }

        public Criteria andSigJsonBetween(String value1, String value2) {
            addCriterion("sig_json between", value1, value2, "sigJson");
            return (Criteria) this;
        }

        public Criteria andSigJsonNotBetween(String value1, String value2) {
            addCriterion("sig_json not between", value1, value2, "sigJson");
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

        public Criteria andSysDoctorIdIsNull() {
            addCriterion("sys_doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andSysDoctorIdIsNotNull() {
            addCriterion("sys_doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysDoctorIdEqualTo(Integer value) {
            addCriterion("sys_doctor_id =", value, "sysDoctorId");
            return (Criteria) this;
        }

        public Criteria andSysDoctorIdNotEqualTo(Integer value) {
            addCriterion("sys_doctor_id <>", value, "sysDoctorId");
            return (Criteria) this;
        }

        public Criteria andSysDoctorIdGreaterThan(Integer value) {
            addCriterion("sys_doctor_id >", value, "sysDoctorId");
            return (Criteria) this;
        }

        public Criteria andSysDoctorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_doctor_id >=", value, "sysDoctorId");
            return (Criteria) this;
        }

        public Criteria andSysDoctorIdLessThan(Integer value) {
            addCriterion("sys_doctor_id <", value, "sysDoctorId");
            return (Criteria) this;
        }

        public Criteria andSysDoctorIdLessThanOrEqualTo(Integer value) {
            addCriterion("sys_doctor_id <=", value, "sysDoctorId");
            return (Criteria) this;
        }

        public Criteria andSysDoctorIdIn(List<Integer> values) {
            addCriterion("sys_doctor_id in", values, "sysDoctorId");
            return (Criteria) this;
        }

        public Criteria andSysDoctorIdNotIn(List<Integer> values) {
            addCriterion("sys_doctor_id not in", values, "sysDoctorId");
            return (Criteria) this;
        }

        public Criteria andSysDoctorIdBetween(Integer value1, Integer value2) {
            addCriterion("sys_doctor_id between", value1, value2, "sysDoctorId");
            return (Criteria) this;
        }

        public Criteria andSysDoctorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_doctor_id not between", value1, value2, "sysDoctorId");
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