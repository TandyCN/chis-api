package pers.tandy.chis.modules.membermanagement.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(String value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(String value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(String value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(String value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(String value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(String value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLike(String value) {
            addCriterion("oid like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotLike(String value) {
            addCriterion("oid not like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<String> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<String> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(String value1, String value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(String value1, String value2) {
            addCriterion("oid not between", value1, value2, "oid");
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

        public Criteria andGenderIdIsNull() {
            addCriterion("gender_id is null");
            return (Criteria) this;
        }

        public Criteria andGenderIdIsNotNull() {
            addCriterion("gender_id is not null");
            return (Criteria) this;
        }

        public Criteria andGenderIdEqualTo(Integer value) {
            addCriterion("gender_id =", value, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdNotEqualTo(Integer value) {
            addCriterion("gender_id <>", value, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdGreaterThan(Integer value) {
            addCriterion("gender_id >", value, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender_id >=", value, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdLessThan(Integer value) {
            addCriterion("gender_id <", value, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdLessThanOrEqualTo(Integer value) {
            addCriterion("gender_id <=", value, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdIn(List<Integer> values) {
            addCriterion("gender_id in", values, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdNotIn(List<Integer> values) {
            addCriterion("gender_id not in", values, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdBetween(Integer value1, Integer value2) {
            addCriterion("gender_id between", value1, value2, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gender_id not between", value1, value2, "genderId");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIsNull() {
            addCriterion("id_card_no is null");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIsNotNull() {
            addCriterion("id_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardNoEqualTo(String value) {
            addCriterion("id_card_no =", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotEqualTo(String value) {
            addCriterion("id_card_no <>", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoGreaterThan(String value) {
            addCriterion("id_card_no >", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_no >=", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLessThan(String value) {
            addCriterion("id_card_no <", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLessThanOrEqualTo(String value) {
            addCriterion("id_card_no <=", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLike(String value) {
            addCriterion("id_card_no like", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotLike(String value) {
            addCriterion("id_card_no not like", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIn(List<String> values) {
            addCriterion("id_card_no in", values, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotIn(List<String> values) {
            addCriterion("id_card_no not in", values, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoBetween(String value1, String value2) {
            addCriterion("id_card_no between", value1, value2, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotBetween(String value1, String value2) {
            addCriterion("id_card_no not between", value1, value2, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andBirthIsNull() {
            addCriterion("birth is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("birth is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(Date value) {
            addCriterionForJDBCDate("birth =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("birth <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("birth >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birth >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(Date value) {
            addCriterionForJDBCDate("birth <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birth <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<Date> values) {
            addCriterionForJDBCDate("birth in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("birth not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birth between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birth not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andNationalityIdIsNull() {
            addCriterion("nationality_id is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIdIsNotNull() {
            addCriterion("nationality_id is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityIdEqualTo(Integer value) {
            addCriterion("nationality_id =", value, "nationalityId");
            return (Criteria) this;
        }

        public Criteria andNationalityIdNotEqualTo(Integer value) {
            addCriterion("nationality_id <>", value, "nationalityId");
            return (Criteria) this;
        }

        public Criteria andNationalityIdGreaterThan(Integer value) {
            addCriterion("nationality_id >", value, "nationalityId");
            return (Criteria) this;
        }

        public Criteria andNationalityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("nationality_id >=", value, "nationalityId");
            return (Criteria) this;
        }

        public Criteria andNationalityIdLessThan(Integer value) {
            addCriterion("nationality_id <", value, "nationalityId");
            return (Criteria) this;
        }

        public Criteria andNationalityIdLessThanOrEqualTo(Integer value) {
            addCriterion("nationality_id <=", value, "nationalityId");
            return (Criteria) this;
        }

        public Criteria andNationalityIdIn(List<Integer> values) {
            addCriterion("nationality_id in", values, "nationalityId");
            return (Criteria) this;
        }

        public Criteria andNationalityIdNotIn(List<Integer> values) {
            addCriterion("nationality_id not in", values, "nationalityId");
            return (Criteria) this;
        }

        public Criteria andNationalityIdBetween(Integer value1, Integer value2) {
            addCriterion("nationality_id between", value1, value2, "nationalityId");
            return (Criteria) this;
        }

        public Criteria andNationalityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("nationality_id not between", value1, value2, "nationalityId");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andMaritalIdIsNull() {
            addCriterion("marital_id is null");
            return (Criteria) this;
        }

        public Criteria andMaritalIdIsNotNull() {
            addCriterion("marital_id is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalIdEqualTo(Integer value) {
            addCriterion("marital_id =", value, "maritalId");
            return (Criteria) this;
        }

        public Criteria andMaritalIdNotEqualTo(Integer value) {
            addCriterion("marital_id <>", value, "maritalId");
            return (Criteria) this;
        }

        public Criteria andMaritalIdGreaterThan(Integer value) {
            addCriterion("marital_id >", value, "maritalId");
            return (Criteria) this;
        }

        public Criteria andMaritalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("marital_id >=", value, "maritalId");
            return (Criteria) this;
        }

        public Criteria andMaritalIdLessThan(Integer value) {
            addCriterion("marital_id <", value, "maritalId");
            return (Criteria) this;
        }

        public Criteria andMaritalIdLessThanOrEqualTo(Integer value) {
            addCriterion("marital_id <=", value, "maritalId");
            return (Criteria) this;
        }

        public Criteria andMaritalIdIn(List<Integer> values) {
            addCriterion("marital_id in", values, "maritalId");
            return (Criteria) this;
        }

        public Criteria andMaritalIdNotIn(List<Integer> values) {
            addCriterion("marital_id not in", values, "maritalId");
            return (Criteria) this;
        }

        public Criteria andMaritalIdBetween(Integer value1, Integer value2) {
            addCriterion("marital_id between", value1, value2, "maritalId");
            return (Criteria) this;
        }

        public Criteria andMaritalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("marital_id not between", value1, value2, "maritalId");
            return (Criteria) this;
        }

        public Criteria andEducationIdIsNull() {
            addCriterion("education_id is null");
            return (Criteria) this;
        }

        public Criteria andEducationIdIsNotNull() {
            addCriterion("education_id is not null");
            return (Criteria) this;
        }

        public Criteria andEducationIdEqualTo(Integer value) {
            addCriterion("education_id =", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotEqualTo(Integer value) {
            addCriterion("education_id <>", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdGreaterThan(Integer value) {
            addCriterion("education_id >", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("education_id >=", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdLessThan(Integer value) {
            addCriterion("education_id <", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdLessThanOrEqualTo(Integer value) {
            addCriterion("education_id <=", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdIn(List<Integer> values) {
            addCriterion("education_id in", values, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotIn(List<Integer> values) {
            addCriterion("education_id not in", values, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdBetween(Integer value1, Integer value2) {
            addCriterion("education_id between", value1, value2, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("education_id not between", value1, value2, "educationId");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceIsNull() {
            addCriterion("domicile_place is null");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceIsNotNull() {
            addCriterion("domicile_place is not null");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceEqualTo(Boolean value) {
            addCriterion("domicile_place =", value, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceNotEqualTo(Boolean value) {
            addCriterion("domicile_place <>", value, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceGreaterThan(Boolean value) {
            addCriterion("domicile_place >", value, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("domicile_place >=", value, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceLessThan(Boolean value) {
            addCriterion("domicile_place <", value, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceLessThanOrEqualTo(Boolean value) {
            addCriterion("domicile_place <=", value, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceIn(List<Boolean> values) {
            addCriterion("domicile_place in", values, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceNotIn(List<Boolean> values) {
            addCriterion("domicile_place not in", values, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceBetween(Boolean value1, Boolean value2) {
            addCriterion("domicile_place between", value1, value2, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("domicile_place not between", value1, value2, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIdIsNull() {
            addCriterion("blood_type_id is null");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIdIsNotNull() {
            addCriterion("blood_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIdEqualTo(Integer value) {
            addCriterion("blood_type_id =", value, "bloodTypeId");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIdNotEqualTo(Integer value) {
            addCriterion("blood_type_id <>", value, "bloodTypeId");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIdGreaterThan(Integer value) {
            addCriterion("blood_type_id >", value, "bloodTypeId");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blood_type_id >=", value, "bloodTypeId");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIdLessThan(Integer value) {
            addCriterion("blood_type_id <", value, "bloodTypeId");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("blood_type_id <=", value, "bloodTypeId");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIdIn(List<Integer> values) {
            addCriterion("blood_type_id in", values, "bloodTypeId");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIdNotIn(List<Integer> values) {
            addCriterion("blood_type_id not in", values, "bloodTypeId");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("blood_type_id between", value1, value2, "bloodTypeId");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blood_type_id not between", value1, value2, "bloodTypeId");
            return (Criteria) this;
        }

        public Criteria andRhIdIsNull() {
            addCriterion("rh_id is null");
            return (Criteria) this;
        }

        public Criteria andRhIdIsNotNull() {
            addCriterion("rh_id is not null");
            return (Criteria) this;
        }

        public Criteria andRhIdEqualTo(Integer value) {
            addCriterion("rh_id =", value, "rhId");
            return (Criteria) this;
        }

        public Criteria andRhIdNotEqualTo(Integer value) {
            addCriterion("rh_id <>", value, "rhId");
            return (Criteria) this;
        }

        public Criteria andRhIdGreaterThan(Integer value) {
            addCriterion("rh_id >", value, "rhId");
            return (Criteria) this;
        }

        public Criteria andRhIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rh_id >=", value, "rhId");
            return (Criteria) this;
        }

        public Criteria andRhIdLessThan(Integer value) {
            addCriterion("rh_id <", value, "rhId");
            return (Criteria) this;
        }

        public Criteria andRhIdLessThanOrEqualTo(Integer value) {
            addCriterion("rh_id <=", value, "rhId");
            return (Criteria) this;
        }

        public Criteria andRhIdIn(List<Integer> values) {
            addCriterion("rh_id in", values, "rhId");
            return (Criteria) this;
        }

        public Criteria andRhIdNotIn(List<Integer> values) {
            addCriterion("rh_id not in", values, "rhId");
            return (Criteria) this;
        }

        public Criteria andRhIdBetween(Integer value1, Integer value2) {
            addCriterion("rh_id between", value1, value2, "rhId");
            return (Criteria) this;
        }

        public Criteria andRhIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rh_id not between", value1, value2, "rhId");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andProfessionIdIsNull() {
            addCriterion("profession_id is null");
            return (Criteria) this;
        }

        public Criteria andProfessionIdIsNotNull() {
            addCriterion("profession_id is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionIdEqualTo(Integer value) {
            addCriterion("profession_id =", value, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdNotEqualTo(Integer value) {
            addCriterion("profession_id <>", value, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdGreaterThan(Integer value) {
            addCriterion("profession_id >", value, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("profession_id >=", value, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdLessThan(Integer value) {
            addCriterion("profession_id <", value, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdLessThanOrEqualTo(Integer value) {
            addCriterion("profession_id <=", value, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdIn(List<Integer> values) {
            addCriterion("profession_id in", values, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdNotIn(List<Integer> values) {
            addCriterion("profession_id not in", values, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdBetween(Integer value1, Integer value2) {
            addCriterion("profession_id between", value1, value2, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("profession_id not between", value1, value2, "professionId");
            return (Criteria) this;
        }

        public Criteria andMrmTownshipIdIsNull() {
            addCriterion("mrm_township_id is null");
            return (Criteria) this;
        }

        public Criteria andMrmTownshipIdIsNotNull() {
            addCriterion("mrm_township_id is not null");
            return (Criteria) this;
        }

        public Criteria andMrmTownshipIdEqualTo(Integer value) {
            addCriterion("mrm_township_id =", value, "mrmTownshipId");
            return (Criteria) this;
        }

        public Criteria andMrmTownshipIdNotEqualTo(Integer value) {
            addCriterion("mrm_township_id <>", value, "mrmTownshipId");
            return (Criteria) this;
        }

        public Criteria andMrmTownshipIdGreaterThan(Integer value) {
            addCriterion("mrm_township_id >", value, "mrmTownshipId");
            return (Criteria) this;
        }

        public Criteria andMrmTownshipIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mrm_township_id >=", value, "mrmTownshipId");
            return (Criteria) this;
        }

        public Criteria andMrmTownshipIdLessThan(Integer value) {
            addCriterion("mrm_township_id <", value, "mrmTownshipId");
            return (Criteria) this;
        }

        public Criteria andMrmTownshipIdLessThanOrEqualTo(Integer value) {
            addCriterion("mrm_township_id <=", value, "mrmTownshipId");
            return (Criteria) this;
        }

        public Criteria andMrmTownshipIdIn(List<Integer> values) {
            addCriterion("mrm_township_id in", values, "mrmTownshipId");
            return (Criteria) this;
        }

        public Criteria andMrmTownshipIdNotIn(List<Integer> values) {
            addCriterion("mrm_township_id not in", values, "mrmTownshipId");
            return (Criteria) this;
        }

        public Criteria andMrmTownshipIdBetween(Integer value1, Integer value2) {
            addCriterion("mrm_township_id between", value1, value2, "mrmTownshipId");
            return (Criteria) this;
        }

        public Criteria andMrmTownshipIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mrm_township_id not between", value1, value2, "mrmTownshipId");
            return (Criteria) this;
        }

        public Criteria andMrmCommitteeIdIsNull() {
            addCriterion("mrm_committee_id is null");
            return (Criteria) this;
        }

        public Criteria andMrmCommitteeIdIsNotNull() {
            addCriterion("mrm_committee_id is not null");
            return (Criteria) this;
        }

        public Criteria andMrmCommitteeIdEqualTo(Integer value) {
            addCriterion("mrm_committee_id =", value, "mrmCommitteeId");
            return (Criteria) this;
        }

        public Criteria andMrmCommitteeIdNotEqualTo(Integer value) {
            addCriterion("mrm_committee_id <>", value, "mrmCommitteeId");
            return (Criteria) this;
        }

        public Criteria andMrmCommitteeIdGreaterThan(Integer value) {
            addCriterion("mrm_committee_id >", value, "mrmCommitteeId");
            return (Criteria) this;
        }

        public Criteria andMrmCommitteeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mrm_committee_id >=", value, "mrmCommitteeId");
            return (Criteria) this;
        }

        public Criteria andMrmCommitteeIdLessThan(Integer value) {
            addCriterion("mrm_committee_id <", value, "mrmCommitteeId");
            return (Criteria) this;
        }

        public Criteria andMrmCommitteeIdLessThanOrEqualTo(Integer value) {
            addCriterion("mrm_committee_id <=", value, "mrmCommitteeId");
            return (Criteria) this;
        }

        public Criteria andMrmCommitteeIdIn(List<Integer> values) {
            addCriterion("mrm_committee_id in", values, "mrmCommitteeId");
            return (Criteria) this;
        }

        public Criteria andMrmCommitteeIdNotIn(List<Integer> values) {
            addCriterion("mrm_committee_id not in", values, "mrmCommitteeId");
            return (Criteria) this;
        }

        public Criteria andMrmCommitteeIdBetween(Integer value1, Integer value2) {
            addCriterion("mrm_committee_id between", value1, value2, "mrmCommitteeId");
            return (Criteria) this;
        }

        public Criteria andMrmCommitteeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mrm_committee_id not between", value1, value2, "mrmCommitteeId");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andDpAddressIsNull() {
            addCriterion("dp_address is null");
            return (Criteria) this;
        }

        public Criteria andDpAddressIsNotNull() {
            addCriterion("dp_address is not null");
            return (Criteria) this;
        }

        public Criteria andDpAddressEqualTo(String value) {
            addCriterion("dp_address =", value, "dpAddress");
            return (Criteria) this;
        }

        public Criteria andDpAddressNotEqualTo(String value) {
            addCriterion("dp_address <>", value, "dpAddress");
            return (Criteria) this;
        }

        public Criteria andDpAddressGreaterThan(String value) {
            addCriterion("dp_address >", value, "dpAddress");
            return (Criteria) this;
        }

        public Criteria andDpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("dp_address >=", value, "dpAddress");
            return (Criteria) this;
        }

        public Criteria andDpAddressLessThan(String value) {
            addCriterion("dp_address <", value, "dpAddress");
            return (Criteria) this;
        }

        public Criteria andDpAddressLessThanOrEqualTo(String value) {
            addCriterion("dp_address <=", value, "dpAddress");
            return (Criteria) this;
        }

        public Criteria andDpAddressLike(String value) {
            addCriterion("dp_address like", value, "dpAddress");
            return (Criteria) this;
        }

        public Criteria andDpAddressNotLike(String value) {
            addCriterion("dp_address not like", value, "dpAddress");
            return (Criteria) this;
        }

        public Criteria andDpAddressIn(List<String> values) {
            addCriterion("dp_address in", values, "dpAddress");
            return (Criteria) this;
        }

        public Criteria andDpAddressNotIn(List<String> values) {
            addCriterion("dp_address not in", values, "dpAddress");
            return (Criteria) this;
        }

        public Criteria andDpAddressBetween(String value1, String value2) {
            addCriterion("dp_address between", value1, value2, "dpAddress");
            return (Criteria) this;
        }

        public Criteria andDpAddressNotBetween(String value1, String value2) {
            addCriterion("dp_address not between", value1, value2, "dpAddress");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNull() {
            addCriterion("contact_name is null");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNotNull() {
            addCriterion("contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactNameEqualTo(String value) {
            addCriterion("contact_name =", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotEqualTo(String value) {
            addCriterion("contact_name <>", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThan(String value) {
            addCriterion("contact_name >", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("contact_name >=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThan(String value) {
            addCriterion("contact_name <", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThanOrEqualTo(String value) {
            addCriterion("contact_name <=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLike(String value) {
            addCriterion("contact_name like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotLike(String value) {
            addCriterion("contact_name not like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameIn(List<String> values) {
            addCriterion("contact_name in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotIn(List<String> values) {
            addCriterion("contact_name not in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameBetween(String value1, String value2) {
            addCriterion("contact_name between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotBetween(String value1, String value2) {
            addCriterion("contact_name not between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("contact_phone =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("contact_phone <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("contact_phone >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("contact_phone <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("contact_phone <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("contact_phone like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("contact_phone not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("contact_phone in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("contact_phone not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("contact_phone between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("contact_phone not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNull() {
            addCriterion("doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNotNull() {
            addCriterion("doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdEqualTo(Integer value) {
            addCriterion("doctor_id =", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotEqualTo(Integer value) {
            addCriterion("doctor_id <>", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThan(Integer value) {
            addCriterion("doctor_id >", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_id >=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThan(Integer value) {
            addCriterion("doctor_id <", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_id <=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIn(List<Integer> values) {
            addCriterion("doctor_id in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotIn(List<Integer> values) {
            addCriterion("doctor_id not in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdBetween(Integer value1, Integer value2) {
            addCriterion("doctor_id between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_id not between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneIsNull() {
            addCriterion("doctor_phone is null");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneIsNotNull() {
            addCriterion("doctor_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneEqualTo(String value) {
            addCriterion("doctor_phone =", value, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneNotEqualTo(String value) {
            addCriterion("doctor_phone <>", value, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneGreaterThan(String value) {
            addCriterion("doctor_phone >", value, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_phone >=", value, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneLessThan(String value) {
            addCriterion("doctor_phone <", value, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneLessThanOrEqualTo(String value) {
            addCriterion("doctor_phone <=", value, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneLike(String value) {
            addCriterion("doctor_phone like", value, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneNotLike(String value) {
            addCriterion("doctor_phone not like", value, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneIn(List<String> values) {
            addCriterion("doctor_phone in", values, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneNotIn(List<String> values) {
            addCriterion("doctor_phone not in", values, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneBetween(String value1, String value2) {
            addCriterion("doctor_phone between", value1, value2, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneNotBetween(String value1, String value2) {
            addCriterion("doctor_phone not between", value1, value2, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andMrmMemberTypeIdIsNull() {
            addCriterion("mrm_member_type_id is null");
            return (Criteria) this;
        }

        public Criteria andMrmMemberTypeIdIsNotNull() {
            addCriterion("mrm_member_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andMrmMemberTypeIdEqualTo(Integer value) {
            addCriterion("mrm_member_type_id =", value, "mrmMemberTypeId");
            return (Criteria) this;
        }

        public Criteria andMrmMemberTypeIdNotEqualTo(Integer value) {
            addCriterion("mrm_member_type_id <>", value, "mrmMemberTypeId");
            return (Criteria) this;
        }

        public Criteria andMrmMemberTypeIdGreaterThan(Integer value) {
            addCriterion("mrm_member_type_id >", value, "mrmMemberTypeId");
            return (Criteria) this;
        }

        public Criteria andMrmMemberTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mrm_member_type_id >=", value, "mrmMemberTypeId");
            return (Criteria) this;
        }

        public Criteria andMrmMemberTypeIdLessThan(Integer value) {
            addCriterion("mrm_member_type_id <", value, "mrmMemberTypeId");
            return (Criteria) this;
        }

        public Criteria andMrmMemberTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("mrm_member_type_id <=", value, "mrmMemberTypeId");
            return (Criteria) this;
        }

        public Criteria andMrmMemberTypeIdIn(List<Integer> values) {
            addCriterion("mrm_member_type_id in", values, "mrmMemberTypeId");
            return (Criteria) this;
        }

        public Criteria andMrmMemberTypeIdNotIn(List<Integer> values) {
            addCriterion("mrm_member_type_id not in", values, "mrmMemberTypeId");
            return (Criteria) this;
        }

        public Criteria andMrmMemberTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("mrm_member_type_id between", value1, value2, "mrmMemberTypeId");
            return (Criteria) this;
        }

        public Criteria andMrmMemberTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mrm_member_type_id not between", value1, value2, "mrmMemberTypeId");
            return (Criteria) this;
        }

        public Criteria andEMailIsNull() {
            addCriterion("e_mail is null");
            return (Criteria) this;
        }

        public Criteria andEMailIsNotNull() {
            addCriterion("e_mail is not null");
            return (Criteria) this;
        }

        public Criteria andEMailEqualTo(String value) {
            addCriterion("e_mail =", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotEqualTo(String value) {
            addCriterion("e_mail <>", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThan(String value) {
            addCriterion("e_mail >", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThanOrEqualTo(String value) {
            addCriterion("e_mail >=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThan(String value) {
            addCriterion("e_mail <", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThanOrEqualTo(String value) {
            addCriterion("e_mail <=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLike(String value) {
            addCriterion("e_mail like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotLike(String value) {
            addCriterion("e_mail not like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailIn(List<String> values) {
            addCriterion("e_mail in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotIn(List<String> values) {
            addCriterion("e_mail not in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailBetween(String value1, String value2) {
            addCriterion("e_mail between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotBetween(String value1, String value2) {
            addCriterion("e_mail not between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("notes is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("notes is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("notes =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("notes <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("notes >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("notes >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("notes <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("notes <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("notes like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("notes not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("notes in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("notes not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("notes between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("notes not between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Float value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Float value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Float value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Float value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Float value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Float value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Float> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Float> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Float value1, Float value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Float value1, Float value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andGivenBalanceIsNull() {
            addCriterion("given_balance is null");
            return (Criteria) this;
        }

        public Criteria andGivenBalanceIsNotNull() {
            addCriterion("given_balance is not null");
            return (Criteria) this;
        }

        public Criteria andGivenBalanceEqualTo(Float value) {
            addCriterion("given_balance =", value, "givenBalance");
            return (Criteria) this;
        }

        public Criteria andGivenBalanceNotEqualTo(Float value) {
            addCriterion("given_balance <>", value, "givenBalance");
            return (Criteria) this;
        }

        public Criteria andGivenBalanceGreaterThan(Float value) {
            addCriterion("given_balance >", value, "givenBalance");
            return (Criteria) this;
        }

        public Criteria andGivenBalanceGreaterThanOrEqualTo(Float value) {
            addCriterion("given_balance >=", value, "givenBalance");
            return (Criteria) this;
        }

        public Criteria andGivenBalanceLessThan(Float value) {
            addCriterion("given_balance <", value, "givenBalance");
            return (Criteria) this;
        }

        public Criteria andGivenBalanceLessThanOrEqualTo(Float value) {
            addCriterion("given_balance <=", value, "givenBalance");
            return (Criteria) this;
        }

        public Criteria andGivenBalanceIn(List<Float> values) {
            addCriterion("given_balance in", values, "givenBalance");
            return (Criteria) this;
        }

        public Criteria andGivenBalanceNotIn(List<Float> values) {
            addCriterion("given_balance not in", values, "givenBalance");
            return (Criteria) this;
        }

        public Criteria andGivenBalanceBetween(Float value1, Float value2) {
            addCriterion("given_balance between", value1, value2, "givenBalance");
            return (Criteria) this;
        }

        public Criteria andGivenBalanceNotBetween(Float value1, Float value2) {
            addCriterion("given_balance not between", value1, value2, "givenBalance");
            return (Criteria) this;
        }

        public Criteria andPointsIsNull() {
            addCriterion("points is null");
            return (Criteria) this;
        }

        public Criteria andPointsIsNotNull() {
            addCriterion("points is not null");
            return (Criteria) this;
        }

        public Criteria andPointsEqualTo(Integer value) {
            addCriterion("points =", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotEqualTo(Integer value) {
            addCriterion("points <>", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThan(Integer value) {
            addCriterion("points >", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("points >=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThan(Integer value) {
            addCriterion("points <", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThanOrEqualTo(Integer value) {
            addCriterion("points <=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsIn(List<Integer> values) {
            addCriterion("points in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotIn(List<Integer> values) {
            addCriterion("points not in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsBetween(Integer value1, Integer value2) {
            addCriterion("points between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("points not between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNull() {
            addCriterion("image_url is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNotNull() {
            addCriterion("image_url is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlEqualTo(String value) {
            addCriterion("image_url =", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotEqualTo(String value) {
            addCriterion("image_url <>", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThan(String value) {
            addCriterion("image_url >", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("image_url >=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThan(String value) {
            addCriterion("image_url <", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThanOrEqualTo(String value) {
            addCriterion("image_url <=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLike(String value) {
            addCriterion("image_url like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotLike(String value) {
            addCriterion("image_url not like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIn(List<String> values) {
            addCriterion("image_url in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotIn(List<String> values) {
            addCriterion("image_url not in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlBetween(String value1, String value2) {
            addCriterion("image_url between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotBetween(String value1, String value2) {
            addCriterion("image_url not between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andCommitteeArchiveIndexIsNull() {
            addCriterion("committee_archive_index is null");
            return (Criteria) this;
        }

        public Criteria andCommitteeArchiveIndexIsNotNull() {
            addCriterion("committee_archive_index is not null");
            return (Criteria) this;
        }

        public Criteria andCommitteeArchiveIndexEqualTo(Integer value) {
            addCriterion("committee_archive_index =", value, "committeeArchiveIndex");
            return (Criteria) this;
        }

        public Criteria andCommitteeArchiveIndexNotEqualTo(Integer value) {
            addCriterion("committee_archive_index <>", value, "committeeArchiveIndex");
            return (Criteria) this;
        }

        public Criteria andCommitteeArchiveIndexGreaterThan(Integer value) {
            addCriterion("committee_archive_index >", value, "committeeArchiveIndex");
            return (Criteria) this;
        }

        public Criteria andCommitteeArchiveIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("committee_archive_index >=", value, "committeeArchiveIndex");
            return (Criteria) this;
        }

        public Criteria andCommitteeArchiveIndexLessThan(Integer value) {
            addCriterion("committee_archive_index <", value, "committeeArchiveIndex");
            return (Criteria) this;
        }

        public Criteria andCommitteeArchiveIndexLessThanOrEqualTo(Integer value) {
            addCriterion("committee_archive_index <=", value, "committeeArchiveIndex");
            return (Criteria) this;
        }

        public Criteria andCommitteeArchiveIndexIn(List<Integer> values) {
            addCriterion("committee_archive_index in", values, "committeeArchiveIndex");
            return (Criteria) this;
        }

        public Criteria andCommitteeArchiveIndexNotIn(List<Integer> values) {
            addCriterion("committee_archive_index not in", values, "committeeArchiveIndex");
            return (Criteria) this;
        }

        public Criteria andCommitteeArchiveIndexBetween(Integer value1, Integer value2) {
            addCriterion("committee_archive_index between", value1, value2, "committeeArchiveIndex");
            return (Criteria) this;
        }

        public Criteria andCommitteeArchiveIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("committee_archive_index not between", value1, value2, "committeeArchiveIndex");
            return (Criteria) this;
        }

        public Criteria andArchiveNoIsNull() {
            addCriterion("archive_no is null");
            return (Criteria) this;
        }

        public Criteria andArchiveNoIsNotNull() {
            addCriterion("archive_no is not null");
            return (Criteria) this;
        }

        public Criteria andArchiveNoEqualTo(String value) {
            addCriterion("archive_no =", value, "archiveNo");
            return (Criteria) this;
        }

        public Criteria andArchiveNoNotEqualTo(String value) {
            addCriterion("archive_no <>", value, "archiveNo");
            return (Criteria) this;
        }

        public Criteria andArchiveNoGreaterThan(String value) {
            addCriterion("archive_no >", value, "archiveNo");
            return (Criteria) this;
        }

        public Criteria andArchiveNoGreaterThanOrEqualTo(String value) {
            addCriterion("archive_no >=", value, "archiveNo");
            return (Criteria) this;
        }

        public Criteria andArchiveNoLessThan(String value) {
            addCriterion("archive_no <", value, "archiveNo");
            return (Criteria) this;
        }

        public Criteria andArchiveNoLessThanOrEqualTo(String value) {
            addCriterion("archive_no <=", value, "archiveNo");
            return (Criteria) this;
        }

        public Criteria andArchiveNoLike(String value) {
            addCriterion("archive_no like", value, "archiveNo");
            return (Criteria) this;
        }

        public Criteria andArchiveNoNotLike(String value) {
            addCriterion("archive_no not like", value, "archiveNo");
            return (Criteria) this;
        }

        public Criteria andArchiveNoIn(List<String> values) {
            addCriterion("archive_no in", values, "archiveNo");
            return (Criteria) this;
        }

        public Criteria andArchiveNoNotIn(List<String> values) {
            addCriterion("archive_no not in", values, "archiveNo");
            return (Criteria) this;
        }

        public Criteria andArchiveNoBetween(String value1, String value2) {
            addCriterion("archive_no between", value1, value2, "archiveNo");
            return (Criteria) this;
        }

        public Criteria andArchiveNoNotBetween(String value1, String value2) {
            addCriterion("archive_no not between", value1, value2, "archiveNo");
            return (Criteria) this;
        }

        public Criteria andGeneticIllnessIsNull() {
            addCriterion("genetic_illness is null");
            return (Criteria) this;
        }

        public Criteria andGeneticIllnessIsNotNull() {
            addCriterion("genetic_illness is not null");
            return (Criteria) this;
        }

        public Criteria andGeneticIllnessEqualTo(String value) {
            addCriterion("genetic_illness =", value, "geneticIllness");
            return (Criteria) this;
        }

        public Criteria andGeneticIllnessNotEqualTo(String value) {
            addCriterion("genetic_illness <>", value, "geneticIllness");
            return (Criteria) this;
        }

        public Criteria andGeneticIllnessGreaterThan(String value) {
            addCriterion("genetic_illness >", value, "geneticIllness");
            return (Criteria) this;
        }

        public Criteria andGeneticIllnessGreaterThanOrEqualTo(String value) {
            addCriterion("genetic_illness >=", value, "geneticIllness");
            return (Criteria) this;
        }

        public Criteria andGeneticIllnessLessThan(String value) {
            addCriterion("genetic_illness <", value, "geneticIllness");
            return (Criteria) this;
        }

        public Criteria andGeneticIllnessLessThanOrEqualTo(String value) {
            addCriterion("genetic_illness <=", value, "geneticIllness");
            return (Criteria) this;
        }

        public Criteria andGeneticIllnessLike(String value) {
            addCriterion("genetic_illness like", value, "geneticIllness");
            return (Criteria) this;
        }

        public Criteria andGeneticIllnessNotLike(String value) {
            addCriterion("genetic_illness not like", value, "geneticIllness");
            return (Criteria) this;
        }

        public Criteria andGeneticIllnessIn(List<String> values) {
            addCriterion("genetic_illness in", values, "geneticIllness");
            return (Criteria) this;
        }

        public Criteria andGeneticIllnessNotIn(List<String> values) {
            addCriterion("genetic_illness not in", values, "geneticIllness");
            return (Criteria) this;
        }

        public Criteria andGeneticIllnessBetween(String value1, String value2) {
            addCriterion("genetic_illness between", value1, value2, "geneticIllness");
            return (Criteria) this;
        }

        public Criteria andGeneticIllnessNotBetween(String value1, String value2) {
            addCriterion("genetic_illness not between", value1, value2, "geneticIllness");
            return (Criteria) this;
        }

        public Criteria andKitchenExhaustIdIsNull() {
            addCriterion("kitchen_exhaust_id is null");
            return (Criteria) this;
        }

        public Criteria andKitchenExhaustIdIsNotNull() {
            addCriterion("kitchen_exhaust_id is not null");
            return (Criteria) this;
        }

        public Criteria andKitchenExhaustIdEqualTo(Integer value) {
            addCriterion("kitchen_exhaust_id =", value, "kitchenExhaustId");
            return (Criteria) this;
        }

        public Criteria andKitchenExhaustIdNotEqualTo(Integer value) {
            addCriterion("kitchen_exhaust_id <>", value, "kitchenExhaustId");
            return (Criteria) this;
        }

        public Criteria andKitchenExhaustIdGreaterThan(Integer value) {
            addCriterion("kitchen_exhaust_id >", value, "kitchenExhaustId");
            return (Criteria) this;
        }

        public Criteria andKitchenExhaustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("kitchen_exhaust_id >=", value, "kitchenExhaustId");
            return (Criteria) this;
        }

        public Criteria andKitchenExhaustIdLessThan(Integer value) {
            addCriterion("kitchen_exhaust_id <", value, "kitchenExhaustId");
            return (Criteria) this;
        }

        public Criteria andKitchenExhaustIdLessThanOrEqualTo(Integer value) {
            addCriterion("kitchen_exhaust_id <=", value, "kitchenExhaustId");
            return (Criteria) this;
        }

        public Criteria andKitchenExhaustIdIn(List<Integer> values) {
            addCriterion("kitchen_exhaust_id in", values, "kitchenExhaustId");
            return (Criteria) this;
        }

        public Criteria andKitchenExhaustIdNotIn(List<Integer> values) {
            addCriterion("kitchen_exhaust_id not in", values, "kitchenExhaustId");
            return (Criteria) this;
        }

        public Criteria andKitchenExhaustIdBetween(Integer value1, Integer value2) {
            addCriterion("kitchen_exhaust_id between", value1, value2, "kitchenExhaustId");
            return (Criteria) this;
        }

        public Criteria andKitchenExhaustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("kitchen_exhaust_id not between", value1, value2, "kitchenExhaustId");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIdIsNull() {
            addCriterion("fuel_type_id is null");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIdIsNotNull() {
            addCriterion("fuel_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIdEqualTo(Integer value) {
            addCriterion("fuel_type_id =", value, "fuelTypeId");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIdNotEqualTo(Integer value) {
            addCriterion("fuel_type_id <>", value, "fuelTypeId");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIdGreaterThan(Integer value) {
            addCriterion("fuel_type_id >", value, "fuelTypeId");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fuel_type_id >=", value, "fuelTypeId");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIdLessThan(Integer value) {
            addCriterion("fuel_type_id <", value, "fuelTypeId");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("fuel_type_id <=", value, "fuelTypeId");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIdIn(List<Integer> values) {
            addCriterion("fuel_type_id in", values, "fuelTypeId");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIdNotIn(List<Integer> values) {
            addCriterion("fuel_type_id not in", values, "fuelTypeId");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("fuel_type_id between", value1, value2, "fuelTypeId");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fuel_type_id not between", value1, value2, "fuelTypeId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIdIsNull() {
            addCriterion("water_source_id is null");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIdIsNotNull() {
            addCriterion("water_source_id is not null");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIdEqualTo(Integer value) {
            addCriterion("water_source_id =", value, "waterSourceId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIdNotEqualTo(Integer value) {
            addCriterion("water_source_id <>", value, "waterSourceId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIdGreaterThan(Integer value) {
            addCriterion("water_source_id >", value, "waterSourceId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("water_source_id >=", value, "waterSourceId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIdLessThan(Integer value) {
            addCriterion("water_source_id <", value, "waterSourceId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("water_source_id <=", value, "waterSourceId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIdIn(List<Integer> values) {
            addCriterion("water_source_id in", values, "waterSourceId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIdNotIn(List<Integer> values) {
            addCriterion("water_source_id not in", values, "waterSourceId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIdBetween(Integer value1, Integer value2) {
            addCriterion("water_source_id between", value1, value2, "waterSourceId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("water_source_id not between", value1, value2, "waterSourceId");
            return (Criteria) this;
        }

        public Criteria andToiletTypeIdIsNull() {
            addCriterion("toilet_type_id is null");
            return (Criteria) this;
        }

        public Criteria andToiletTypeIdIsNotNull() {
            addCriterion("toilet_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andToiletTypeIdEqualTo(Integer value) {
            addCriterion("toilet_type_id =", value, "toiletTypeId");
            return (Criteria) this;
        }

        public Criteria andToiletTypeIdNotEqualTo(Integer value) {
            addCriterion("toilet_type_id <>", value, "toiletTypeId");
            return (Criteria) this;
        }

        public Criteria andToiletTypeIdGreaterThan(Integer value) {
            addCriterion("toilet_type_id >", value, "toiletTypeId");
            return (Criteria) this;
        }

        public Criteria andToiletTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("toilet_type_id >=", value, "toiletTypeId");
            return (Criteria) this;
        }

        public Criteria andToiletTypeIdLessThan(Integer value) {
            addCriterion("toilet_type_id <", value, "toiletTypeId");
            return (Criteria) this;
        }

        public Criteria andToiletTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("toilet_type_id <=", value, "toiletTypeId");
            return (Criteria) this;
        }

        public Criteria andToiletTypeIdIn(List<Integer> values) {
            addCriterion("toilet_type_id in", values, "toiletTypeId");
            return (Criteria) this;
        }

        public Criteria andToiletTypeIdNotIn(List<Integer> values) {
            addCriterion("toilet_type_id not in", values, "toiletTypeId");
            return (Criteria) this;
        }

        public Criteria andToiletTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("toilet_type_id between", value1, value2, "toiletTypeId");
            return (Criteria) this;
        }

        public Criteria andToiletTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("toilet_type_id not between", value1, value2, "toiletTypeId");
            return (Criteria) this;
        }

        public Criteria andLivestockFenceIdIsNull() {
            addCriterion("livestock_fence_id is null");
            return (Criteria) this;
        }

        public Criteria andLivestockFenceIdIsNotNull() {
            addCriterion("livestock_fence_id is not null");
            return (Criteria) this;
        }

        public Criteria andLivestockFenceIdEqualTo(Integer value) {
            addCriterion("livestock_fence_id =", value, "livestockFenceId");
            return (Criteria) this;
        }

        public Criteria andLivestockFenceIdNotEqualTo(Integer value) {
            addCriterion("livestock_fence_id <>", value, "livestockFenceId");
            return (Criteria) this;
        }

        public Criteria andLivestockFenceIdGreaterThan(Integer value) {
            addCriterion("livestock_fence_id >", value, "livestockFenceId");
            return (Criteria) this;
        }

        public Criteria andLivestockFenceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("livestock_fence_id >=", value, "livestockFenceId");
            return (Criteria) this;
        }

        public Criteria andLivestockFenceIdLessThan(Integer value) {
            addCriterion("livestock_fence_id <", value, "livestockFenceId");
            return (Criteria) this;
        }

        public Criteria andLivestockFenceIdLessThanOrEqualTo(Integer value) {
            addCriterion("livestock_fence_id <=", value, "livestockFenceId");
            return (Criteria) this;
        }

        public Criteria andLivestockFenceIdIn(List<Integer> values) {
            addCriterion("livestock_fence_id in", values, "livestockFenceId");
            return (Criteria) this;
        }

        public Criteria andLivestockFenceIdNotIn(List<Integer> values) {
            addCriterion("livestock_fence_id not in", values, "livestockFenceId");
            return (Criteria) this;
        }

        public Criteria andLivestockFenceIdBetween(Integer value1, Integer value2) {
            addCriterion("livestock_fence_id between", value1, value2, "livestockFenceId");
            return (Criteria) this;
        }

        public Criteria andLivestockFenceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("livestock_fence_id not between", value1, value2, "livestockFenceId");
            return (Criteria) this;
        }

        public Criteria andArchiveStateIsNull() {
            addCriterion("archive_state is null");
            return (Criteria) this;
        }

        public Criteria andArchiveStateIsNotNull() {
            addCriterion("archive_state is not null");
            return (Criteria) this;
        }

        public Criteria andArchiveStateEqualTo(Boolean value) {
            addCriterion("archive_state =", value, "archiveState");
            return (Criteria) this;
        }

        public Criteria andArchiveStateNotEqualTo(Boolean value) {
            addCriterion("archive_state <>", value, "archiveState");
            return (Criteria) this;
        }

        public Criteria andArchiveStateGreaterThan(Boolean value) {
            addCriterion("archive_state >", value, "archiveState");
            return (Criteria) this;
        }

        public Criteria andArchiveStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("archive_state >=", value, "archiveState");
            return (Criteria) this;
        }

        public Criteria andArchiveStateLessThan(Boolean value) {
            addCriterion("archive_state <", value, "archiveState");
            return (Criteria) this;
        }

        public Criteria andArchiveStateLessThanOrEqualTo(Boolean value) {
            addCriterion("archive_state <=", value, "archiveState");
            return (Criteria) this;
        }

        public Criteria andArchiveStateIn(List<Boolean> values) {
            addCriterion("archive_state in", values, "archiveState");
            return (Criteria) this;
        }

        public Criteria andArchiveStateNotIn(List<Boolean> values) {
            addCriterion("archive_state not in", values, "archiveState");
            return (Criteria) this;
        }

        public Criteria andArchiveStateBetween(Boolean value1, Boolean value2) {
            addCriterion("archive_state between", value1, value2, "archiveState");
            return (Criteria) this;
        }

        public Criteria andArchiveStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("archive_state not between", value1, value2, "archiveState");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Boolean value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Boolean value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Boolean value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Boolean value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Boolean value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Boolean> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Boolean> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Boolean value1, Boolean value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("state not between", value1, value2, "state");
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

        public Criteria andLastUpdaterIdIsNull() {
            addCriterion("last_updater_id is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdaterIdIsNotNull() {
            addCriterion("last_updater_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdaterIdEqualTo(Integer value) {
            addCriterion("last_updater_id =", value, "lastUpdaterId");
            return (Criteria) this;
        }

        public Criteria andLastUpdaterIdNotEqualTo(Integer value) {
            addCriterion("last_updater_id <>", value, "lastUpdaterId");
            return (Criteria) this;
        }

        public Criteria andLastUpdaterIdGreaterThan(Integer value) {
            addCriterion("last_updater_id >", value, "lastUpdaterId");
            return (Criteria) this;
        }

        public Criteria andLastUpdaterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_updater_id >=", value, "lastUpdaterId");
            return (Criteria) this;
        }

        public Criteria andLastUpdaterIdLessThan(Integer value) {
            addCriterion("last_updater_id <", value, "lastUpdaterId");
            return (Criteria) this;
        }

        public Criteria andLastUpdaterIdLessThanOrEqualTo(Integer value) {
            addCriterion("last_updater_id <=", value, "lastUpdaterId");
            return (Criteria) this;
        }

        public Criteria andLastUpdaterIdIn(List<Integer> values) {
            addCriterion("last_updater_id in", values, "lastUpdaterId");
            return (Criteria) this;
        }

        public Criteria andLastUpdaterIdNotIn(List<Integer> values) {
            addCriterion("last_updater_id not in", values, "lastUpdaterId");
            return (Criteria) this;
        }

        public Criteria andLastUpdaterIdBetween(Integer value1, Integer value2) {
            addCriterion("last_updater_id between", value1, value2, "lastUpdaterId");
            return (Criteria) this;
        }

        public Criteria andLastUpdaterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("last_updater_id not between", value1, value2, "lastUpdaterId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNull() {
            addCriterion("last_update_date is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNotNull() {
            addCriterion("last_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateEqualTo(Date value) {
            addCriterionForJDBCDate("last_update_date =", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("last_update_date <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("last_update_date >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_update_date >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterionForJDBCDate("last_update_date <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_update_date <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIn(List<Date> values) {
            addCriterionForJDBCDate("last_update_date in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("last_update_date not in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_update_date between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_update_date not between", value1, value2, "lastUpdateDate");
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