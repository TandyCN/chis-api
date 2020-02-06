package pers.tandy.chis.modules.doctorworkstation.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CommonDiagnoseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommonDiagnoseExample() {
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

        public Criteria andDwtDiagnoseTypeIdIsNull() {
            addCriterion("dwt_diagnose_type_id is null");
            return (Criteria) this;
        }

        public Criteria andDwtDiagnoseTypeIdIsNotNull() {
            addCriterion("dwt_diagnose_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andDwtDiagnoseTypeIdEqualTo(Integer value) {
            addCriterion("dwt_diagnose_type_id =", value, "dwtDiagnoseTypeId");
            return (Criteria) this;
        }

        public Criteria andDwtDiagnoseTypeIdNotEqualTo(Integer value) {
            addCriterion("dwt_diagnose_type_id <>", value, "dwtDiagnoseTypeId");
            return (Criteria) this;
        }

        public Criteria andDwtDiagnoseTypeIdGreaterThan(Integer value) {
            addCriterion("dwt_diagnose_type_id >", value, "dwtDiagnoseTypeId");
            return (Criteria) this;
        }

        public Criteria andDwtDiagnoseTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dwt_diagnose_type_id >=", value, "dwtDiagnoseTypeId");
            return (Criteria) this;
        }

        public Criteria andDwtDiagnoseTypeIdLessThan(Integer value) {
            addCriterion("dwt_diagnose_type_id <", value, "dwtDiagnoseTypeId");
            return (Criteria) this;
        }

        public Criteria andDwtDiagnoseTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("dwt_diagnose_type_id <=", value, "dwtDiagnoseTypeId");
            return (Criteria) this;
        }

        public Criteria andDwtDiagnoseTypeIdIn(List<Integer> values) {
            addCriterion("dwt_diagnose_type_id in", values, "dwtDiagnoseTypeId");
            return (Criteria) this;
        }

        public Criteria andDwtDiagnoseTypeIdNotIn(List<Integer> values) {
            addCriterion("dwt_diagnose_type_id not in", values, "dwtDiagnoseTypeId");
            return (Criteria) this;
        }

        public Criteria andDwtDiagnoseTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("dwt_diagnose_type_id between", value1, value2, "dwtDiagnoseTypeId");
            return (Criteria) this;
        }

        public Criteria andDwtDiagnoseTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dwt_diagnose_type_id not between", value1, value2, "dwtDiagnoseTypeId");
            return (Criteria) this;
        }

        public Criteria andShareStateIsNull() {
            addCriterion("share_state is null");
            return (Criteria) this;
        }

        public Criteria andShareStateIsNotNull() {
            addCriterion("share_state is not null");
            return (Criteria) this;
        }

        public Criteria andShareStateEqualTo(Boolean value) {
            addCriterion("share_state =", value, "shareState");
            return (Criteria) this;
        }

        public Criteria andShareStateNotEqualTo(Boolean value) {
            addCriterion("share_state <>", value, "shareState");
            return (Criteria) this;
        }

        public Criteria andShareStateGreaterThan(Boolean value) {
            addCriterion("share_state >", value, "shareState");
            return (Criteria) this;
        }

        public Criteria andShareStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("share_state >=", value, "shareState");
            return (Criteria) this;
        }

        public Criteria andShareStateLessThan(Boolean value) {
            addCriterion("share_state <", value, "shareState");
            return (Criteria) this;
        }

        public Criteria andShareStateLessThanOrEqualTo(Boolean value) {
            addCriterion("share_state <=", value, "shareState");
            return (Criteria) this;
        }

        public Criteria andShareStateIn(List<Boolean> values) {
            addCriterion("share_state in", values, "shareState");
            return (Criteria) this;
        }

        public Criteria andShareStateNotIn(List<Boolean> values) {
            addCriterion("share_state not in", values, "shareState");
            return (Criteria) this;
        }

        public Criteria andShareStateBetween(Boolean value1, Boolean value2) {
            addCriterion("share_state between", value1, value2, "shareState");
            return (Criteria) this;
        }

        public Criteria andShareStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("share_state not between", value1, value2, "shareState");
            return (Criteria) this;
        }

        public Criteria andNormativeIsNull() {
            addCriterion("normative is null");
            return (Criteria) this;
        }

        public Criteria andNormativeIsNotNull() {
            addCriterion("normative is not null");
            return (Criteria) this;
        }

        public Criteria andNormativeEqualTo(Boolean value) {
            addCriterion("normative =", value, "normative");
            return (Criteria) this;
        }

        public Criteria andNormativeNotEqualTo(Boolean value) {
            addCriterion("normative <>", value, "normative");
            return (Criteria) this;
        }

        public Criteria andNormativeGreaterThan(Boolean value) {
            addCriterion("normative >", value, "normative");
            return (Criteria) this;
        }

        public Criteria andNormativeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("normative >=", value, "normative");
            return (Criteria) this;
        }

        public Criteria andNormativeLessThan(Boolean value) {
            addCriterion("normative <", value, "normative");
            return (Criteria) this;
        }

        public Criteria andNormativeLessThanOrEqualTo(Boolean value) {
            addCriterion("normative <=", value, "normative");
            return (Criteria) this;
        }

        public Criteria andNormativeIn(List<Boolean> values) {
            addCriterion("normative in", values, "normative");
            return (Criteria) this;
        }

        public Criteria andNormativeNotIn(List<Boolean> values) {
            addCriterion("normative not in", values, "normative");
            return (Criteria) this;
        }

        public Criteria andNormativeBetween(Boolean value1, Boolean value2) {
            addCriterion("normative between", value1, value2, "normative");
            return (Criteria) this;
        }

        public Criteria andNormativeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("normative not between", value1, value2, "normative");
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