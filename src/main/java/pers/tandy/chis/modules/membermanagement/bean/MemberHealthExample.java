package pers.tandy.chis.modules.membermanagement.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberHealthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberHealthExample() {
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

        public Criteria andSysDictTypeIdIsNull() {
            addCriterion("sys_dict_type_id is null");
            return (Criteria) this;
        }

        public Criteria andSysDictTypeIdIsNotNull() {
            addCriterion("sys_dict_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysDictTypeIdEqualTo(Integer value) {
            addCriterion("sys_dict_type_id =", value, "sysDictTypeId");
            return (Criteria) this;
        }

        public Criteria andSysDictTypeIdNotEqualTo(Integer value) {
            addCriterion("sys_dict_type_id <>", value, "sysDictTypeId");
            return (Criteria) this;
        }

        public Criteria andSysDictTypeIdGreaterThan(Integer value) {
            addCriterion("sys_dict_type_id >", value, "sysDictTypeId");
            return (Criteria) this;
        }

        public Criteria andSysDictTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_dict_type_id >=", value, "sysDictTypeId");
            return (Criteria) this;
        }

        public Criteria andSysDictTypeIdLessThan(Integer value) {
            addCriterion("sys_dict_type_id <", value, "sysDictTypeId");
            return (Criteria) this;
        }

        public Criteria andSysDictTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("sys_dict_type_id <=", value, "sysDictTypeId");
            return (Criteria) this;
        }

        public Criteria andSysDictTypeIdIn(List<Integer> values) {
            addCriterion("sys_dict_type_id in", values, "sysDictTypeId");
            return (Criteria) this;
        }

        public Criteria andSysDictTypeIdNotIn(List<Integer> values) {
            addCriterion("sys_dict_type_id not in", values, "sysDictTypeId");
            return (Criteria) this;
        }

        public Criteria andSysDictTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("sys_dict_type_id between", value1, value2, "sysDictTypeId");
            return (Criteria) this;
        }

        public Criteria andSysDictTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_dict_type_id not between", value1, value2, "sysDictTypeId");
            return (Criteria) this;
        }

        public Criteria andSysDictIdIsNull() {
            addCriterion("sys_dict_id is null");
            return (Criteria) this;
        }

        public Criteria andSysDictIdIsNotNull() {
            addCriterion("sys_dict_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysDictIdEqualTo(Integer value) {
            addCriterion("sys_dict_id =", value, "sysDictId");
            return (Criteria) this;
        }

        public Criteria andSysDictIdNotEqualTo(Integer value) {
            addCriterion("sys_dict_id <>", value, "sysDictId");
            return (Criteria) this;
        }

        public Criteria andSysDictIdGreaterThan(Integer value) {
            addCriterion("sys_dict_id >", value, "sysDictId");
            return (Criteria) this;
        }

        public Criteria andSysDictIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_dict_id >=", value, "sysDictId");
            return (Criteria) this;
        }

        public Criteria andSysDictIdLessThan(Integer value) {
            addCriterion("sys_dict_id <", value, "sysDictId");
            return (Criteria) this;
        }

        public Criteria andSysDictIdLessThanOrEqualTo(Integer value) {
            addCriterion("sys_dict_id <=", value, "sysDictId");
            return (Criteria) this;
        }

        public Criteria andSysDictIdIn(List<Integer> values) {
            addCriterion("sys_dict_id in", values, "sysDictId");
            return (Criteria) this;
        }

        public Criteria andSysDictIdNotIn(List<Integer> values) {
            addCriterion("sys_dict_id not in", values, "sysDictId");
            return (Criteria) this;
        }

        public Criteria andSysDictIdBetween(Integer value1, Integer value2) {
            addCriterion("sys_dict_id between", value1, value2, "sysDictId");
            return (Criteria) this;
        }

        public Criteria andSysDictIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_dict_id not between", value1, value2, "sysDictId");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDetailIsNull() {
            addCriterion("diagnosis_detail is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDetailIsNotNull() {
            addCriterion("diagnosis_detail is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDetailEqualTo(String value) {
            addCriterion("diagnosis_detail =", value, "diagnosisDetail");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDetailNotEqualTo(String value) {
            addCriterion("diagnosis_detail <>", value, "diagnosisDetail");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDetailGreaterThan(String value) {
            addCriterion("diagnosis_detail >", value, "diagnosisDetail");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDetailGreaterThanOrEqualTo(String value) {
            addCriterion("diagnosis_detail >=", value, "diagnosisDetail");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDetailLessThan(String value) {
            addCriterion("diagnosis_detail <", value, "diagnosisDetail");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDetailLessThanOrEqualTo(String value) {
            addCriterion("diagnosis_detail <=", value, "diagnosisDetail");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDetailLike(String value) {
            addCriterion("diagnosis_detail like", value, "diagnosisDetail");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDetailNotLike(String value) {
            addCriterion("diagnosis_detail not like", value, "diagnosisDetail");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDetailIn(List<String> values) {
            addCriterion("diagnosis_detail in", values, "diagnosisDetail");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDetailNotIn(List<String> values) {
            addCriterion("diagnosis_detail not in", values, "diagnosisDetail");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDetailBetween(String value1, String value2) {
            addCriterion("diagnosis_detail between", value1, value2, "diagnosisDetail");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDetailNotBetween(String value1, String value2) {
            addCriterion("diagnosis_detail not between", value1, value2, "diagnosisDetail");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDateIsNull() {
            addCriterion("diagnosis_date is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDateIsNotNull() {
            addCriterion("diagnosis_date is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDateEqualTo(Date value) {
            addCriterionForJDBCDate("diagnosis_date =", value, "diagnosisDate");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("diagnosis_date <>", value, "diagnosisDate");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDateGreaterThan(Date value) {
            addCriterionForJDBCDate("diagnosis_date >", value, "diagnosisDate");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("diagnosis_date >=", value, "diagnosisDate");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDateLessThan(Date value) {
            addCriterionForJDBCDate("diagnosis_date <", value, "diagnosisDate");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("diagnosis_date <=", value, "diagnosisDate");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDateIn(List<Date> values) {
            addCriterionForJDBCDate("diagnosis_date in", values, "diagnosisDate");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("diagnosis_date not in", values, "diagnosisDate");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("diagnosis_date between", value1, value2, "diagnosisDate");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("diagnosis_date not between", value1, value2, "diagnosisDate");
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