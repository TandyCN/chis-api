package pers.tandy.chis.modules.goodsitemmanagement.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GoodsApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsApplyExample() {
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

        public Criteria andGsmGoodsTypeIdIsNull() {
            addCriterion("gsm_goods_type_id is null");
            return (Criteria) this;
        }

        public Criteria andGsmGoodsTypeIdIsNotNull() {
            addCriterion("gsm_goods_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andGsmGoodsTypeIdEqualTo(Integer value) {
            addCriterion("gsm_goods_type_id =", value, "gsmGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGsmGoodsTypeIdNotEqualTo(Integer value) {
            addCriterion("gsm_goods_type_id <>", value, "gsmGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGsmGoodsTypeIdGreaterThan(Integer value) {
            addCriterion("gsm_goods_type_id >", value, "gsmGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGsmGoodsTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gsm_goods_type_id >=", value, "gsmGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGsmGoodsTypeIdLessThan(Integer value) {
            addCriterion("gsm_goods_type_id <", value, "gsmGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGsmGoodsTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("gsm_goods_type_id <=", value, "gsmGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGsmGoodsTypeIdIn(List<Integer> values) {
            addCriterion("gsm_goods_type_id in", values, "gsmGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGsmGoodsTypeIdNotIn(List<Integer> values) {
            addCriterion("gsm_goods_type_id not in", values, "gsmGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGsmGoodsTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("gsm_goods_type_id between", value1, value2, "gsmGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGsmGoodsTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gsm_goods_type_id not between", value1, value2, "gsmGoodsTypeId");
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

        public Criteria andSpNameIsNull() {
            addCriterion("sp_name is null");
            return (Criteria) this;
        }

        public Criteria andSpNameIsNotNull() {
            addCriterion("sp_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpNameEqualTo(String value) {
            addCriterion("sp_name =", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotEqualTo(String value) {
            addCriterion("sp_name <>", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameGreaterThan(String value) {
            addCriterion("sp_name >", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameGreaterThanOrEqualTo(String value) {
            addCriterion("sp_name >=", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameLessThan(String value) {
            addCriterion("sp_name <", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameLessThanOrEqualTo(String value) {
            addCriterion("sp_name <=", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameLike(String value) {
            addCriterion("sp_name like", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotLike(String value) {
            addCriterion("sp_name not like", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameIn(List<String> values) {
            addCriterion("sp_name in", values, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotIn(List<String> values) {
            addCriterion("sp_name not in", values, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameBetween(String value1, String value2) {
            addCriterion("sp_name between", value1, value2, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotBetween(String value1, String value2) {
            addCriterion("sp_name not between", value1, value2, "spName");
            return (Criteria) this;
        }

        public Criteria andSpCodeIsNull() {
            addCriterion("sp_code is null");
            return (Criteria) this;
        }

        public Criteria andSpCodeIsNotNull() {
            addCriterion("sp_code is not null");
            return (Criteria) this;
        }

        public Criteria andSpCodeEqualTo(String value) {
            addCriterion("sp_code =", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeNotEqualTo(String value) {
            addCriterion("sp_code <>", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeGreaterThan(String value) {
            addCriterion("sp_code >", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sp_code >=", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeLessThan(String value) {
            addCriterion("sp_code <", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeLessThanOrEqualTo(String value) {
            addCriterion("sp_code <=", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeLike(String value) {
            addCriterion("sp_code like", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeNotLike(String value) {
            addCriterion("sp_code not like", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeIn(List<String> values) {
            addCriterion("sp_code in", values, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeNotIn(List<String> values) {
            addCriterion("sp_code not in", values, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeBetween(String value1, String value2) {
            addCriterion("sp_code between", value1, value2, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeNotBetween(String value1, String value2) {
            addCriterion("sp_code not between", value1, value2, "spCode");
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

        public Criteria andGoodsUnitsIdIsNull() {
            addCriterion("goods_units_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitsIdIsNotNull() {
            addCriterion("goods_units_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitsIdEqualTo(Integer value) {
            addCriterion("goods_units_id =", value, "goodsUnitsId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitsIdNotEqualTo(Integer value) {
            addCriterion("goods_units_id <>", value, "goodsUnitsId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitsIdGreaterThan(Integer value) {
            addCriterion("goods_units_id >", value, "goodsUnitsId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_units_id >=", value, "goodsUnitsId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitsIdLessThan(Integer value) {
            addCriterion("goods_units_id <", value, "goodsUnitsId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_units_id <=", value, "goodsUnitsId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitsIdIn(List<Integer> values) {
            addCriterion("goods_units_id in", values, "goodsUnitsId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitsIdNotIn(List<Integer> values) {
            addCriterion("goods_units_id not in", values, "goodsUnitsId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_units_id between", value1, value2, "goodsUnitsId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_units_id not between", value1, value2, "goodsUnitsId");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyIdIsNull() {
            addCriterion("goods_classify_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyIdIsNotNull() {
            addCriterion("goods_classify_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyIdEqualTo(Integer value) {
            addCriterion("goods_classify_id =", value, "goodsClassifyId");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyIdNotEqualTo(Integer value) {
            addCriterion("goods_classify_id <>", value, "goodsClassifyId");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyIdGreaterThan(Integer value) {
            addCriterion("goods_classify_id >", value, "goodsClassifyId");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_classify_id >=", value, "goodsClassifyId");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyIdLessThan(Integer value) {
            addCriterion("goods_classify_id <", value, "goodsClassifyId");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_classify_id <=", value, "goodsClassifyId");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyIdIn(List<Integer> values) {
            addCriterion("goods_classify_id in", values, "goodsClassifyId");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyIdNotIn(List<Integer> values) {
            addCriterion("goods_classify_id not in", values, "goodsClassifyId");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_classify_id between", value1, value2, "goodsClassifyId");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_classify_id not between", value1, value2, "goodsClassifyId");
            return (Criteria) this;
        }

        public Criteria andSysSecondClassifyIdIsNull() {
            addCriterion("sys_second_classify_id is null");
            return (Criteria) this;
        }

        public Criteria andSysSecondClassifyIdIsNotNull() {
            addCriterion("sys_second_classify_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysSecondClassifyIdEqualTo(Integer value) {
            addCriterion("sys_second_classify_id =", value, "sysSecondClassifyId");
            return (Criteria) this;
        }

        public Criteria andSysSecondClassifyIdNotEqualTo(Integer value) {
            addCriterion("sys_second_classify_id <>", value, "sysSecondClassifyId");
            return (Criteria) this;
        }

        public Criteria andSysSecondClassifyIdGreaterThan(Integer value) {
            addCriterion("sys_second_classify_id >", value, "sysSecondClassifyId");
            return (Criteria) this;
        }

        public Criteria andSysSecondClassifyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_second_classify_id >=", value, "sysSecondClassifyId");
            return (Criteria) this;
        }

        public Criteria andSysSecondClassifyIdLessThan(Integer value) {
            addCriterion("sys_second_classify_id <", value, "sysSecondClassifyId");
            return (Criteria) this;
        }

        public Criteria andSysSecondClassifyIdLessThanOrEqualTo(Integer value) {
            addCriterion("sys_second_classify_id <=", value, "sysSecondClassifyId");
            return (Criteria) this;
        }

        public Criteria andSysSecondClassifyIdIn(List<Integer> values) {
            addCriterion("sys_second_classify_id in", values, "sysSecondClassifyId");
            return (Criteria) this;
        }

        public Criteria andSysSecondClassifyIdNotIn(List<Integer> values) {
            addCriterion("sys_second_classify_id not in", values, "sysSecondClassifyId");
            return (Criteria) this;
        }

        public Criteria andSysSecondClassifyIdBetween(Integer value1, Integer value2) {
            addCriterion("sys_second_classify_id between", value1, value2, "sysSecondClassifyId");
            return (Criteria) this;
        }

        public Criteria andSysSecondClassifyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_second_classify_id not between", value1, value2, "sysSecondClassifyId");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNull() {
            addCriterion("barcode is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNotNull() {
            addCriterion("barcode is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeEqualTo(String value) {
            addCriterion("barcode =", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("barcode <>", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThan(String value) {
            addCriterion("barcode >", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("barcode >=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThan(String value) {
            addCriterion("barcode <", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("barcode <=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLike(String value) {
            addCriterion("barcode like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotLike(String value) {
            addCriterion("barcode not like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIn(List<String> values) {
            addCriterion("barcode in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("barcode not in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("barcode between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("barcode not between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdIsNull() {
            addCriterion("manufacturer_id is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdIsNotNull() {
            addCriterion("manufacturer_id is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdEqualTo(Integer value) {
            addCriterion("manufacturer_id =", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdNotEqualTo(Integer value) {
            addCriterion("manufacturer_id <>", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdGreaterThan(Integer value) {
            addCriterion("manufacturer_id >", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("manufacturer_id >=", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdLessThan(Integer value) {
            addCriterion("manufacturer_id <", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdLessThanOrEqualTo(Integer value) {
            addCriterion("manufacturer_id <=", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdIn(List<Integer> values) {
            addCriterion("manufacturer_id in", values, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdNotIn(List<Integer> values) {
            addCriterion("manufacturer_id not in", values, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdBetween(Integer value1, Integer value2) {
            addCriterion("manufacturer_id between", value1, value2, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("manufacturer_id not between", value1, value2, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andOriginIdIsNull() {
            addCriterion("origin_id is null");
            return (Criteria) this;
        }

        public Criteria andOriginIdIsNotNull() {
            addCriterion("origin_id is not null");
            return (Criteria) this;
        }

        public Criteria andOriginIdEqualTo(Integer value) {
            addCriterion("origin_id =", value, "originId");
            return (Criteria) this;
        }

        public Criteria andOriginIdNotEqualTo(Integer value) {
            addCriterion("origin_id <>", value, "originId");
            return (Criteria) this;
        }

        public Criteria andOriginIdGreaterThan(Integer value) {
            addCriterion("origin_id >", value, "originId");
            return (Criteria) this;
        }

        public Criteria andOriginIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("origin_id >=", value, "originId");
            return (Criteria) this;
        }

        public Criteria andOriginIdLessThan(Integer value) {
            addCriterion("origin_id <", value, "originId");
            return (Criteria) this;
        }

        public Criteria andOriginIdLessThanOrEqualTo(Integer value) {
            addCriterion("origin_id <=", value, "originId");
            return (Criteria) this;
        }

        public Criteria andOriginIdIn(List<Integer> values) {
            addCriterion("origin_id in", values, "originId");
            return (Criteria) this;
        }

        public Criteria andOriginIdNotIn(List<Integer> values) {
            addCriterion("origin_id not in", values, "originId");
            return (Criteria) this;
        }

        public Criteria andOriginIdBetween(Integer value1, Integer value2) {
            addCriterion("origin_id between", value1, value2, "originId");
            return (Criteria) this;
        }

        public Criteria andOriginIdNotBetween(Integer value1, Integer value2) {
            addCriterion("origin_id not between", value1, value2, "originId");
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

        public Criteria andProfitCommissionRateIsNull() {
            addCriterion("profit_commission_rate is null");
            return (Criteria) this;
        }

        public Criteria andProfitCommissionRateIsNotNull() {
            addCriterion("profit_commission_rate is not null");
            return (Criteria) this;
        }

        public Criteria andProfitCommissionRateEqualTo(Byte value) {
            addCriterion("profit_commission_rate =", value, "profitCommissionRate");
            return (Criteria) this;
        }

        public Criteria andProfitCommissionRateNotEqualTo(Byte value) {
            addCriterion("profit_commission_rate <>", value, "profitCommissionRate");
            return (Criteria) this;
        }

        public Criteria andProfitCommissionRateGreaterThan(Byte value) {
            addCriterion("profit_commission_rate >", value, "profitCommissionRate");
            return (Criteria) this;
        }

        public Criteria andProfitCommissionRateGreaterThanOrEqualTo(Byte value) {
            addCriterion("profit_commission_rate >=", value, "profitCommissionRate");
            return (Criteria) this;
        }

        public Criteria andProfitCommissionRateLessThan(Byte value) {
            addCriterion("profit_commission_rate <", value, "profitCommissionRate");
            return (Criteria) this;
        }

        public Criteria andProfitCommissionRateLessThanOrEqualTo(Byte value) {
            addCriterion("profit_commission_rate <=", value, "profitCommissionRate");
            return (Criteria) this;
        }

        public Criteria andProfitCommissionRateIn(List<Byte> values) {
            addCriterion("profit_commission_rate in", values, "profitCommissionRate");
            return (Criteria) this;
        }

        public Criteria andProfitCommissionRateNotIn(List<Byte> values) {
            addCriterion("profit_commission_rate not in", values, "profitCommissionRate");
            return (Criteria) this;
        }

        public Criteria andProfitCommissionRateBetween(Byte value1, Byte value2) {
            addCriterion("profit_commission_rate between", value1, value2, "profitCommissionRate");
            return (Criteria) this;
        }

        public Criteria andProfitCommissionRateNotBetween(Byte value1, Byte value2) {
            addCriterion("profit_commission_rate not between", value1, value2, "profitCommissionRate");
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

        public Criteria andMinPurchaseQuantityIsNull() {
            addCriterion("min_purchase_quantity is null");
            return (Criteria) this;
        }

        public Criteria andMinPurchaseQuantityIsNotNull() {
            addCriterion("min_purchase_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andMinPurchaseQuantityEqualTo(Short value) {
            addCriterion("min_purchase_quantity =", value, "minPurchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andMinPurchaseQuantityNotEqualTo(Short value) {
            addCriterion("min_purchase_quantity <>", value, "minPurchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andMinPurchaseQuantityGreaterThan(Short value) {
            addCriterion("min_purchase_quantity >", value, "minPurchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andMinPurchaseQuantityGreaterThanOrEqualTo(Short value) {
            addCriterion("min_purchase_quantity >=", value, "minPurchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andMinPurchaseQuantityLessThan(Short value) {
            addCriterion("min_purchase_quantity <", value, "minPurchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andMinPurchaseQuantityLessThanOrEqualTo(Short value) {
            addCriterion("min_purchase_quantity <=", value, "minPurchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andMinPurchaseQuantityIn(List<Short> values) {
            addCriterion("min_purchase_quantity in", values, "minPurchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andMinPurchaseQuantityNotIn(List<Short> values) {
            addCriterion("min_purchase_quantity not in", values, "minPurchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andMinPurchaseQuantityBetween(Short value1, Short value2) {
            addCriterion("min_purchase_quantity between", value1, value2, "minPurchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andMinPurchaseQuantityNotBetween(Short value1, Short value2) {
            addCriterion("min_purchase_quantity not between", value1, value2, "minPurchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andSellClassifyIdIsNull() {
            addCriterion("sell_classify_id is null");
            return (Criteria) this;
        }

        public Criteria andSellClassifyIdIsNotNull() {
            addCriterion("sell_classify_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellClassifyIdEqualTo(Integer value) {
            addCriterion("sell_classify_id =", value, "sellClassifyId");
            return (Criteria) this;
        }

        public Criteria andSellClassifyIdNotEqualTo(Integer value) {
            addCriterion("sell_classify_id <>", value, "sellClassifyId");
            return (Criteria) this;
        }

        public Criteria andSellClassifyIdGreaterThan(Integer value) {
            addCriterion("sell_classify_id >", value, "sellClassifyId");
            return (Criteria) this;
        }

        public Criteria andSellClassifyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sell_classify_id >=", value, "sellClassifyId");
            return (Criteria) this;
        }

        public Criteria andSellClassifyIdLessThan(Integer value) {
            addCriterion("sell_classify_id <", value, "sellClassifyId");
            return (Criteria) this;
        }

        public Criteria andSellClassifyIdLessThanOrEqualTo(Integer value) {
            addCriterion("sell_classify_id <=", value, "sellClassifyId");
            return (Criteria) this;
        }

        public Criteria andSellClassifyIdIn(List<Integer> values) {
            addCriterion("sell_classify_id in", values, "sellClassifyId");
            return (Criteria) this;
        }

        public Criteria andSellClassifyIdNotIn(List<Integer> values) {
            addCriterion("sell_classify_id not in", values, "sellClassifyId");
            return (Criteria) this;
        }

        public Criteria andSellClassifyIdBetween(Integer value1, Integer value2) {
            addCriterion("sell_classify_id between", value1, value2, "sellClassifyId");
            return (Criteria) this;
        }

        public Criteria andSellClassifyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sell_classify_id not between", value1, value2, "sellClassifyId");
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

        public Criteria andReturnableIsNull() {
            addCriterion("returnable is null");
            return (Criteria) this;
        }

        public Criteria andReturnableIsNotNull() {
            addCriterion("returnable is not null");
            return (Criteria) this;
        }

        public Criteria andReturnableEqualTo(Boolean value) {
            addCriterion("returnable =", value, "returnable");
            return (Criteria) this;
        }

        public Criteria andReturnableNotEqualTo(Boolean value) {
            addCriterion("returnable <>", value, "returnable");
            return (Criteria) this;
        }

        public Criteria andReturnableGreaterThan(Boolean value) {
            addCriterion("returnable >", value, "returnable");
            return (Criteria) this;
        }

        public Criteria andReturnableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("returnable >=", value, "returnable");
            return (Criteria) this;
        }

        public Criteria andReturnableLessThan(Boolean value) {
            addCriterion("returnable <", value, "returnable");
            return (Criteria) this;
        }

        public Criteria andReturnableLessThanOrEqualTo(Boolean value) {
            addCriterion("returnable <=", value, "returnable");
            return (Criteria) this;
        }

        public Criteria andReturnableIn(List<Boolean> values) {
            addCriterion("returnable in", values, "returnable");
            return (Criteria) this;
        }

        public Criteria andReturnableNotIn(List<Boolean> values) {
            addCriterion("returnable not in", values, "returnable");
            return (Criteria) this;
        }

        public Criteria andReturnableBetween(Boolean value1, Boolean value2) {
            addCriterion("returnable between", value1, value2, "returnable");
            return (Criteria) this;
        }

        public Criteria andReturnableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("returnable not between", value1, value2, "returnable");
            return (Criteria) this;
        }

        public Criteria andFreeGoodsIsNull() {
            addCriterion("free_goods is null");
            return (Criteria) this;
        }

        public Criteria andFreeGoodsIsNotNull() {
            addCriterion("free_goods is not null");
            return (Criteria) this;
        }

        public Criteria andFreeGoodsEqualTo(Boolean value) {
            addCriterion("free_goods =", value, "freeGoods");
            return (Criteria) this;
        }

        public Criteria andFreeGoodsNotEqualTo(Boolean value) {
            addCriterion("free_goods <>", value, "freeGoods");
            return (Criteria) this;
        }

        public Criteria andFreeGoodsGreaterThan(Boolean value) {
            addCriterion("free_goods >", value, "freeGoods");
            return (Criteria) this;
        }

        public Criteria andFreeGoodsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("free_goods >=", value, "freeGoods");
            return (Criteria) this;
        }

        public Criteria andFreeGoodsLessThan(Boolean value) {
            addCriterion("free_goods <", value, "freeGoods");
            return (Criteria) this;
        }

        public Criteria andFreeGoodsLessThanOrEqualTo(Boolean value) {
            addCriterion("free_goods <=", value, "freeGoods");
            return (Criteria) this;
        }

        public Criteria andFreeGoodsIn(List<Boolean> values) {
            addCriterion("free_goods in", values, "freeGoods");
            return (Criteria) this;
        }

        public Criteria andFreeGoodsNotIn(List<Boolean> values) {
            addCriterion("free_goods not in", values, "freeGoods");
            return (Criteria) this;
        }

        public Criteria andFreeGoodsBetween(Boolean value1, Boolean value2) {
            addCriterion("free_goods between", value1, value2, "freeGoods");
            return (Criteria) this;
        }

        public Criteria andFreeGoodsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("free_goods not between", value1, value2, "freeGoods");
            return (Criteria) this;
        }

        public Criteria andLossableIsNull() {
            addCriterion("lossable is null");
            return (Criteria) this;
        }

        public Criteria andLossableIsNotNull() {
            addCriterion("lossable is not null");
            return (Criteria) this;
        }

        public Criteria andLossableEqualTo(Boolean value) {
            addCriterion("lossable =", value, "lossable");
            return (Criteria) this;
        }

        public Criteria andLossableNotEqualTo(Boolean value) {
            addCriterion("lossable <>", value, "lossable");
            return (Criteria) this;
        }

        public Criteria andLossableGreaterThan(Boolean value) {
            addCriterion("lossable >", value, "lossable");
            return (Criteria) this;
        }

        public Criteria andLossableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lossable >=", value, "lossable");
            return (Criteria) this;
        }

        public Criteria andLossableLessThan(Boolean value) {
            addCriterion("lossable <", value, "lossable");
            return (Criteria) this;
        }

        public Criteria andLossableLessThanOrEqualTo(Boolean value) {
            addCriterion("lossable <=", value, "lossable");
            return (Criteria) this;
        }

        public Criteria andLossableIn(List<Boolean> values) {
            addCriterion("lossable in", values, "lossable");
            return (Criteria) this;
        }

        public Criteria andLossableNotIn(List<Boolean> values) {
            addCriterion("lossable not in", values, "lossable");
            return (Criteria) this;
        }

        public Criteria andLossableBetween(Boolean value1, Boolean value2) {
            addCriterion("lossable between", value1, value2, "lossable");
            return (Criteria) this;
        }

        public Criteria andLossableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lossable not between", value1, value2, "lossable");
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

        public Criteria andSplitableIsNull() {
            addCriterion("splitable is null");
            return (Criteria) this;
        }

        public Criteria andSplitableIsNotNull() {
            addCriterion("splitable is not null");
            return (Criteria) this;
        }

        public Criteria andSplitableEqualTo(Boolean value) {
            addCriterion("splitable =", value, "splitable");
            return (Criteria) this;
        }

        public Criteria andSplitableNotEqualTo(Boolean value) {
            addCriterion("splitable <>", value, "splitable");
            return (Criteria) this;
        }

        public Criteria andSplitableGreaterThan(Boolean value) {
            addCriterion("splitable >", value, "splitable");
            return (Criteria) this;
        }

        public Criteria andSplitableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("splitable >=", value, "splitable");
            return (Criteria) this;
        }

        public Criteria andSplitableLessThan(Boolean value) {
            addCriterion("splitable <", value, "splitable");
            return (Criteria) this;
        }

        public Criteria andSplitableLessThanOrEqualTo(Boolean value) {
            addCriterion("splitable <=", value, "splitable");
            return (Criteria) this;
        }

        public Criteria andSplitableIn(List<Boolean> values) {
            addCriterion("splitable in", values, "splitable");
            return (Criteria) this;
        }

        public Criteria andSplitableNotIn(List<Boolean> values) {
            addCriterion("splitable not in", values, "splitable");
            return (Criteria) this;
        }

        public Criteria andSplitableBetween(Boolean value1, Boolean value2) {
            addCriterion("splitable between", value1, value2, "splitable");
            return (Criteria) this;
        }

        public Criteria andSplitableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("splitable not between", value1, value2, "splitable");
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

        public Criteria andSplitUnitsIdIsNull() {
            addCriterion("split_units_id is null");
            return (Criteria) this;
        }

        public Criteria andSplitUnitsIdIsNotNull() {
            addCriterion("split_units_id is not null");
            return (Criteria) this;
        }

        public Criteria andSplitUnitsIdEqualTo(Integer value) {
            addCriterion("split_units_id =", value, "splitUnitsId");
            return (Criteria) this;
        }

        public Criteria andSplitUnitsIdNotEqualTo(Integer value) {
            addCriterion("split_units_id <>", value, "splitUnitsId");
            return (Criteria) this;
        }

        public Criteria andSplitUnitsIdGreaterThan(Integer value) {
            addCriterion("split_units_id >", value, "splitUnitsId");
            return (Criteria) this;
        }

        public Criteria andSplitUnitsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("split_units_id >=", value, "splitUnitsId");
            return (Criteria) this;
        }

        public Criteria andSplitUnitsIdLessThan(Integer value) {
            addCriterion("split_units_id <", value, "splitUnitsId");
            return (Criteria) this;
        }

        public Criteria andSplitUnitsIdLessThanOrEqualTo(Integer value) {
            addCriterion("split_units_id <=", value, "splitUnitsId");
            return (Criteria) this;
        }

        public Criteria andSplitUnitsIdIn(List<Integer> values) {
            addCriterion("split_units_id in", values, "splitUnitsId");
            return (Criteria) this;
        }

        public Criteria andSplitUnitsIdNotIn(List<Integer> values) {
            addCriterion("split_units_id not in", values, "splitUnitsId");
            return (Criteria) this;
        }

        public Criteria andSplitUnitsIdBetween(Integer value1, Integer value2) {
            addCriterion("split_units_id between", value1, value2, "splitUnitsId");
            return (Criteria) this;
        }

        public Criteria andSplitUnitsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("split_units_id not between", value1, value2, "splitUnitsId");
            return (Criteria) this;
        }

        public Criteria andSplitPriceIsNull() {
            addCriterion("split_price is null");
            return (Criteria) this;
        }

        public Criteria andSplitPriceIsNotNull() {
            addCriterion("split_price is not null");
            return (Criteria) this;
        }

        public Criteria andSplitPriceEqualTo(Float value) {
            addCriterion("split_price =", value, "splitPrice");
            return (Criteria) this;
        }

        public Criteria andSplitPriceNotEqualTo(Float value) {
            addCriterion("split_price <>", value, "splitPrice");
            return (Criteria) this;
        }

        public Criteria andSplitPriceGreaterThan(Float value) {
            addCriterion("split_price >", value, "splitPrice");
            return (Criteria) this;
        }

        public Criteria andSplitPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("split_price >=", value, "splitPrice");
            return (Criteria) this;
        }

        public Criteria andSplitPriceLessThan(Float value) {
            addCriterion("split_price <", value, "splitPrice");
            return (Criteria) this;
        }

        public Criteria andSplitPriceLessThanOrEqualTo(Float value) {
            addCriterion("split_price <=", value, "splitPrice");
            return (Criteria) this;
        }

        public Criteria andSplitPriceIn(List<Float> values) {
            addCriterion("split_price in", values, "splitPrice");
            return (Criteria) this;
        }

        public Criteria andSplitPriceNotIn(List<Float> values) {
            addCriterion("split_price not in", values, "splitPrice");
            return (Criteria) this;
        }

        public Criteria andSplitPriceBetween(Float value1, Float value2) {
            addCriterion("split_price between", value1, value2, "splitPrice");
            return (Criteria) this;
        }

        public Criteria andSplitPriceNotBetween(Float value1, Float value2) {
            addCriterion("split_price not between", value1, value2, "splitPrice");
            return (Criteria) this;
        }

        public Criteria andDoseTypeIdIsNull() {
            addCriterion("dose_type_id is null");
            return (Criteria) this;
        }

        public Criteria andDoseTypeIdIsNotNull() {
            addCriterion("dose_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoseTypeIdEqualTo(Integer value) {
            addCriterion("dose_type_id =", value, "doseTypeId");
            return (Criteria) this;
        }

        public Criteria andDoseTypeIdNotEqualTo(Integer value) {
            addCriterion("dose_type_id <>", value, "doseTypeId");
            return (Criteria) this;
        }

        public Criteria andDoseTypeIdGreaterThan(Integer value) {
            addCriterion("dose_type_id >", value, "doseTypeId");
            return (Criteria) this;
        }

        public Criteria andDoseTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dose_type_id >=", value, "doseTypeId");
            return (Criteria) this;
        }

        public Criteria andDoseTypeIdLessThan(Integer value) {
            addCriterion("dose_type_id <", value, "doseTypeId");
            return (Criteria) this;
        }

        public Criteria andDoseTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("dose_type_id <=", value, "doseTypeId");
            return (Criteria) this;
        }

        public Criteria andDoseTypeIdIn(List<Integer> values) {
            addCriterion("dose_type_id in", values, "doseTypeId");
            return (Criteria) this;
        }

        public Criteria andDoseTypeIdNotIn(List<Integer> values) {
            addCriterion("dose_type_id not in", values, "doseTypeId");
            return (Criteria) this;
        }

        public Criteria andDoseTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("dose_type_id between", value1, value2, "doseTypeId");
            return (Criteria) this;
        }

        public Criteria andDoseTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dose_type_id not between", value1, value2, "doseTypeId");
            return (Criteria) this;
        }

        public Criteria andDoseIsNull() {
            addCriterion("dose is null");
            return (Criteria) this;
        }

        public Criteria andDoseIsNotNull() {
            addCriterion("dose is not null");
            return (Criteria) this;
        }

        public Criteria andDoseEqualTo(Float value) {
            addCriterion("dose =", value, "dose");
            return (Criteria) this;
        }

        public Criteria andDoseNotEqualTo(Float value) {
            addCriterion("dose <>", value, "dose");
            return (Criteria) this;
        }

        public Criteria andDoseGreaterThan(Float value) {
            addCriterion("dose >", value, "dose");
            return (Criteria) this;
        }

        public Criteria andDoseGreaterThanOrEqualTo(Float value) {
            addCriterion("dose >=", value, "dose");
            return (Criteria) this;
        }

        public Criteria andDoseLessThan(Float value) {
            addCriterion("dose <", value, "dose");
            return (Criteria) this;
        }

        public Criteria andDoseLessThanOrEqualTo(Float value) {
            addCriterion("dose <=", value, "dose");
            return (Criteria) this;
        }

        public Criteria andDoseIn(List<Float> values) {
            addCriterion("dose in", values, "dose");
            return (Criteria) this;
        }

        public Criteria andDoseNotIn(List<Float> values) {
            addCriterion("dose not in", values, "dose");
            return (Criteria) this;
        }

        public Criteria andDoseBetween(Float value1, Float value2) {
            addCriterion("dose between", value1, value2, "dose");
            return (Criteria) this;
        }

        public Criteria andDoseNotBetween(Float value1, Float value2) {
            addCriterion("dose not between", value1, value2, "dose");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsIdIsNull() {
            addCriterion("dose_units_id is null");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsIdIsNotNull() {
            addCriterion("dose_units_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsIdEqualTo(Integer value) {
            addCriterion("dose_units_id =", value, "doseUnitsId");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsIdNotEqualTo(Integer value) {
            addCriterion("dose_units_id <>", value, "doseUnitsId");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsIdGreaterThan(Integer value) {
            addCriterion("dose_units_id >", value, "doseUnitsId");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dose_units_id >=", value, "doseUnitsId");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsIdLessThan(Integer value) {
            addCriterion("dose_units_id <", value, "doseUnitsId");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsIdLessThanOrEqualTo(Integer value) {
            addCriterion("dose_units_id <=", value, "doseUnitsId");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsIdIn(List<Integer> values) {
            addCriterion("dose_units_id in", values, "doseUnitsId");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsIdNotIn(List<Integer> values) {
            addCriterion("dose_units_id not in", values, "doseUnitsId");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsIdBetween(Integer value1, Integer value2) {
            addCriterion("dose_units_id between", value1, value2, "doseUnitsId");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dose_units_id not between", value1, value2, "doseUnitsId");
            return (Criteria) this;
        }

        public Criteria andSpecialDrugIdIsNull() {
            addCriterion("special_drug_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecialDrugIdIsNotNull() {
            addCriterion("special_drug_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialDrugIdEqualTo(Integer value) {
            addCriterion("special_drug_id =", value, "specialDrugId");
            return (Criteria) this;
        }

        public Criteria andSpecialDrugIdNotEqualTo(Integer value) {
            addCriterion("special_drug_id <>", value, "specialDrugId");
            return (Criteria) this;
        }

        public Criteria andSpecialDrugIdGreaterThan(Integer value) {
            addCriterion("special_drug_id >", value, "specialDrugId");
            return (Criteria) this;
        }

        public Criteria andSpecialDrugIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("special_drug_id >=", value, "specialDrugId");
            return (Criteria) this;
        }

        public Criteria andSpecialDrugIdLessThan(Integer value) {
            addCriterion("special_drug_id <", value, "specialDrugId");
            return (Criteria) this;
        }

        public Criteria andSpecialDrugIdLessThanOrEqualTo(Integer value) {
            addCriterion("special_drug_id <=", value, "specialDrugId");
            return (Criteria) this;
        }

        public Criteria andSpecialDrugIdIn(List<Integer> values) {
            addCriterion("special_drug_id in", values, "specialDrugId");
            return (Criteria) this;
        }

        public Criteria andSpecialDrugIdNotIn(List<Integer> values) {
            addCriterion("special_drug_id not in", values, "specialDrugId");
            return (Criteria) this;
        }

        public Criteria andSpecialDrugIdBetween(Integer value1, Integer value2) {
            addCriterion("special_drug_id between", value1, value2, "specialDrugId");
            return (Criteria) this;
        }

        public Criteria andSpecialDrugIdNotBetween(Integer value1, Integer value2) {
            addCriterion("special_drug_id not between", value1, value2, "specialDrugId");
            return (Criteria) this;
        }

        public Criteria andDrugUsageIdIsNull() {
            addCriterion("drug_usage_id is null");
            return (Criteria) this;
        }

        public Criteria andDrugUsageIdIsNotNull() {
            addCriterion("drug_usage_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrugUsageIdEqualTo(Integer value) {
            addCriterion("drug_usage_id =", value, "drugUsageId");
            return (Criteria) this;
        }

        public Criteria andDrugUsageIdNotEqualTo(Integer value) {
            addCriterion("drug_usage_id <>", value, "drugUsageId");
            return (Criteria) this;
        }

        public Criteria andDrugUsageIdGreaterThan(Integer value) {
            addCriterion("drug_usage_id >", value, "drugUsageId");
            return (Criteria) this;
        }

        public Criteria andDrugUsageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("drug_usage_id >=", value, "drugUsageId");
            return (Criteria) this;
        }

        public Criteria andDrugUsageIdLessThan(Integer value) {
            addCriterion("drug_usage_id <", value, "drugUsageId");
            return (Criteria) this;
        }

        public Criteria andDrugUsageIdLessThanOrEqualTo(Integer value) {
            addCriterion("drug_usage_id <=", value, "drugUsageId");
            return (Criteria) this;
        }

        public Criteria andDrugUsageIdIn(List<Integer> values) {
            addCriterion("drug_usage_id in", values, "drugUsageId");
            return (Criteria) this;
        }

        public Criteria andDrugUsageIdNotIn(List<Integer> values) {
            addCriterion("drug_usage_id not in", values, "drugUsageId");
            return (Criteria) this;
        }

        public Criteria andDrugUsageIdBetween(Integer value1, Integer value2) {
            addCriterion("drug_usage_id between", value1, value2, "drugUsageId");
            return (Criteria) this;
        }

        public Criteria andDrugUsageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("drug_usage_id not between", value1, value2, "drugUsageId");
            return (Criteria) this;
        }

        public Criteria andOdoredIsNull() {
            addCriterion("odored is null");
            return (Criteria) this;
        }

        public Criteria andOdoredIsNotNull() {
            addCriterion("odored is not null");
            return (Criteria) this;
        }

        public Criteria andOdoredEqualTo(Boolean value) {
            addCriterion("odored =", value, "odored");
            return (Criteria) this;
        }

        public Criteria andOdoredNotEqualTo(Boolean value) {
            addCriterion("odored <>", value, "odored");
            return (Criteria) this;
        }

        public Criteria andOdoredGreaterThan(Boolean value) {
            addCriterion("odored >", value, "odored");
            return (Criteria) this;
        }

        public Criteria andOdoredGreaterThanOrEqualTo(Boolean value) {
            addCriterion("odored >=", value, "odored");
            return (Criteria) this;
        }

        public Criteria andOdoredLessThan(Boolean value) {
            addCriterion("odored <", value, "odored");
            return (Criteria) this;
        }

        public Criteria andOdoredLessThanOrEqualTo(Boolean value) {
            addCriterion("odored <=", value, "odored");
            return (Criteria) this;
        }

        public Criteria andOdoredIn(List<Boolean> values) {
            addCriterion("odored in", values, "odored");
            return (Criteria) this;
        }

        public Criteria andOdoredNotIn(List<Boolean> values) {
            addCriterion("odored not in", values, "odored");
            return (Criteria) this;
        }

        public Criteria andOdoredBetween(Boolean value1, Boolean value2) {
            addCriterion("odored between", value1, value2, "odored");
            return (Criteria) this;
        }

        public Criteria andOdoredNotBetween(Boolean value1, Boolean value2) {
            addCriterion("odored not between", value1, value2, "odored");
            return (Criteria) this;
        }

        public Criteria andStorageTemperatureIdIsNull() {
            addCriterion("storage_temperature_id is null");
            return (Criteria) this;
        }

        public Criteria andStorageTemperatureIdIsNotNull() {
            addCriterion("storage_temperature_id is not null");
            return (Criteria) this;
        }

        public Criteria andStorageTemperatureIdEqualTo(Integer value) {
            addCriterion("storage_temperature_id =", value, "storageTemperatureId");
            return (Criteria) this;
        }

        public Criteria andStorageTemperatureIdNotEqualTo(Integer value) {
            addCriterion("storage_temperature_id <>", value, "storageTemperatureId");
            return (Criteria) this;
        }

        public Criteria andStorageTemperatureIdGreaterThan(Integer value) {
            addCriterion("storage_temperature_id >", value, "storageTemperatureId");
            return (Criteria) this;
        }

        public Criteria andStorageTemperatureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("storage_temperature_id >=", value, "storageTemperatureId");
            return (Criteria) this;
        }

        public Criteria andStorageTemperatureIdLessThan(Integer value) {
            addCriterion("storage_temperature_id <", value, "storageTemperatureId");
            return (Criteria) this;
        }

        public Criteria andStorageTemperatureIdLessThanOrEqualTo(Integer value) {
            addCriterion("storage_temperature_id <=", value, "storageTemperatureId");
            return (Criteria) this;
        }

        public Criteria andStorageTemperatureIdIn(List<Integer> values) {
            addCriterion("storage_temperature_id in", values, "storageTemperatureId");
            return (Criteria) this;
        }

        public Criteria andStorageTemperatureIdNotIn(List<Integer> values) {
            addCriterion("storage_temperature_id not in", values, "storageTemperatureId");
            return (Criteria) this;
        }

        public Criteria andStorageTemperatureIdBetween(Integer value1, Integer value2) {
            addCriterion("storage_temperature_id between", value1, value2, "storageTemperatureId");
            return (Criteria) this;
        }

        public Criteria andStorageTemperatureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("storage_temperature_id not between", value1, value2, "storageTemperatureId");
            return (Criteria) this;
        }

        public Criteria andConservationDaysIsNull() {
            addCriterion("conservation_days is null");
            return (Criteria) this;
        }

        public Criteria andConservationDaysIsNotNull() {
            addCriterion("conservation_days is not null");
            return (Criteria) this;
        }

        public Criteria andConservationDaysEqualTo(Short value) {
            addCriterion("conservation_days =", value, "conservationDays");
            return (Criteria) this;
        }

        public Criteria andConservationDaysNotEqualTo(Short value) {
            addCriterion("conservation_days <>", value, "conservationDays");
            return (Criteria) this;
        }

        public Criteria andConservationDaysGreaterThan(Short value) {
            addCriterion("conservation_days >", value, "conservationDays");
            return (Criteria) this;
        }

        public Criteria andConservationDaysGreaterThanOrEqualTo(Short value) {
            addCriterion("conservation_days >=", value, "conservationDays");
            return (Criteria) this;
        }

        public Criteria andConservationDaysLessThan(Short value) {
            addCriterion("conservation_days <", value, "conservationDays");
            return (Criteria) this;
        }

        public Criteria andConservationDaysLessThanOrEqualTo(Short value) {
            addCriterion("conservation_days <=", value, "conservationDays");
            return (Criteria) this;
        }

        public Criteria andConservationDaysIn(List<Short> values) {
            addCriterion("conservation_days in", values, "conservationDays");
            return (Criteria) this;
        }

        public Criteria andConservationDaysNotIn(List<Short> values) {
            addCriterion("conservation_days not in", values, "conservationDays");
            return (Criteria) this;
        }

        public Criteria andConservationDaysBetween(Short value1, Short value2) {
            addCriterion("conservation_days between", value1, value2, "conservationDays");
            return (Criteria) this;
        }

        public Criteria andConservationDaysNotBetween(Short value1, Short value2) {
            addCriterion("conservation_days not between", value1, value2, "conservationDays");
            return (Criteria) this;
        }

        public Criteria andPrescriptionIsNull() {
            addCriterion("prescription is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionIsNotNull() {
            addCriterion("prescription is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionEqualTo(Boolean value) {
            addCriterion("prescription =", value, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNotEqualTo(Boolean value) {
            addCriterion("prescription <>", value, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionGreaterThan(Boolean value) {
            addCriterion("prescription >", value, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("prescription >=", value, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionLessThan(Boolean value) {
            addCriterion("prescription <", value, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionLessThanOrEqualTo(Boolean value) {
            addCriterion("prescription <=", value, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionIn(List<Boolean> values) {
            addCriterion("prescription in", values, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNotIn(List<Boolean> values) {
            addCriterion("prescription not in", values, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionBetween(Boolean value1, Boolean value2) {
            addCriterion("prescription between", value1, value2, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("prescription not between", value1, value2, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeIdIsNull() {
            addCriterion("prescription_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeIdIsNotNull() {
            addCriterion("prescription_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeIdEqualTo(Integer value) {
            addCriterion("prescription_type_id =", value, "prescriptionTypeId");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeIdNotEqualTo(Integer value) {
            addCriterion("prescription_type_id <>", value, "prescriptionTypeId");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeIdGreaterThan(Integer value) {
            addCriterion("prescription_type_id >", value, "prescriptionTypeId");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prescription_type_id >=", value, "prescriptionTypeId");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeIdLessThan(Integer value) {
            addCriterion("prescription_type_id <", value, "prescriptionTypeId");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("prescription_type_id <=", value, "prescriptionTypeId");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeIdIn(List<Integer> values) {
            addCriterion("prescription_type_id in", values, "prescriptionTypeId");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeIdNotIn(List<Integer> values) {
            addCriterion("prescription_type_id not in", values, "prescriptionTypeId");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("prescription_type_id between", value1, value2, "prescriptionTypeId");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prescription_type_id not between", value1, value2, "prescriptionTypeId");
            return (Criteria) this;
        }

        public Criteria andYbDrugIsNull() {
            addCriterion("yb_drug is null");
            return (Criteria) this;
        }

        public Criteria andYbDrugIsNotNull() {
            addCriterion("yb_drug is not null");
            return (Criteria) this;
        }

        public Criteria andYbDrugEqualTo(Boolean value) {
            addCriterion("yb_drug =", value, "ybDrug");
            return (Criteria) this;
        }

        public Criteria andYbDrugNotEqualTo(Boolean value) {
            addCriterion("yb_drug <>", value, "ybDrug");
            return (Criteria) this;
        }

        public Criteria andYbDrugGreaterThan(Boolean value) {
            addCriterion("yb_drug >", value, "ybDrug");
            return (Criteria) this;
        }

        public Criteria andYbDrugGreaterThanOrEqualTo(Boolean value) {
            addCriterion("yb_drug >=", value, "ybDrug");
            return (Criteria) this;
        }

        public Criteria andYbDrugLessThan(Boolean value) {
            addCriterion("yb_drug <", value, "ybDrug");
            return (Criteria) this;
        }

        public Criteria andYbDrugLessThanOrEqualTo(Boolean value) {
            addCriterion("yb_drug <=", value, "ybDrug");
            return (Criteria) this;
        }

        public Criteria andYbDrugIn(List<Boolean> values) {
            addCriterion("yb_drug in", values, "ybDrug");
            return (Criteria) this;
        }

        public Criteria andYbDrugNotIn(List<Boolean> values) {
            addCriterion("yb_drug not in", values, "ybDrug");
            return (Criteria) this;
        }

        public Criteria andYbDrugBetween(Boolean value1, Boolean value2) {
            addCriterion("yb_drug between", value1, value2, "ybDrug");
            return (Criteria) this;
        }

        public Criteria andYbDrugNotBetween(Boolean value1, Boolean value2) {
            addCriterion("yb_drug not between", value1, value2, "ybDrug");
            return (Criteria) this;
        }

        public Criteria andYbOidIsNull() {
            addCriterion("yb_oid is null");
            return (Criteria) this;
        }

        public Criteria andYbOidIsNotNull() {
            addCriterion("yb_oid is not null");
            return (Criteria) this;
        }

        public Criteria andYbOidEqualTo(String value) {
            addCriterion("yb_oid =", value, "ybOid");
            return (Criteria) this;
        }

        public Criteria andYbOidNotEqualTo(String value) {
            addCriterion("yb_oid <>", value, "ybOid");
            return (Criteria) this;
        }

        public Criteria andYbOidGreaterThan(String value) {
            addCriterion("yb_oid >", value, "ybOid");
            return (Criteria) this;
        }

        public Criteria andYbOidGreaterThanOrEqualTo(String value) {
            addCriterion("yb_oid >=", value, "ybOid");
            return (Criteria) this;
        }

        public Criteria andYbOidLessThan(String value) {
            addCriterion("yb_oid <", value, "ybOid");
            return (Criteria) this;
        }

        public Criteria andYbOidLessThanOrEqualTo(String value) {
            addCriterion("yb_oid <=", value, "ybOid");
            return (Criteria) this;
        }

        public Criteria andYbOidLike(String value) {
            addCriterion("yb_oid like", value, "ybOid");
            return (Criteria) this;
        }

        public Criteria andYbOidNotLike(String value) {
            addCriterion("yb_oid not like", value, "ybOid");
            return (Criteria) this;
        }

        public Criteria andYbOidIn(List<String> values) {
            addCriterion("yb_oid in", values, "ybOid");
            return (Criteria) this;
        }

        public Criteria andYbOidNotIn(List<String> values) {
            addCriterion("yb_oid not in", values, "ybOid");
            return (Criteria) this;
        }

        public Criteria andYbOidBetween(String value1, String value2) {
            addCriterion("yb_oid between", value1, value2, "ybOid");
            return (Criteria) this;
        }

        public Criteria andYbOidNotBetween(String value1, String value2) {
            addCriterion("yb_oid not between", value1, value2, "ybOid");
            return (Criteria) this;
        }

        public Criteria andYbPriceIsNull() {
            addCriterion("yb_price is null");
            return (Criteria) this;
        }

        public Criteria andYbPriceIsNotNull() {
            addCriterion("yb_price is not null");
            return (Criteria) this;
        }

        public Criteria andYbPriceEqualTo(Float value) {
            addCriterion("yb_price =", value, "ybPrice");
            return (Criteria) this;
        }

        public Criteria andYbPriceNotEqualTo(Float value) {
            addCriterion("yb_price <>", value, "ybPrice");
            return (Criteria) this;
        }

        public Criteria andYbPriceGreaterThan(Float value) {
            addCriterion("yb_price >", value, "ybPrice");
            return (Criteria) this;
        }

        public Criteria andYbPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("yb_price >=", value, "ybPrice");
            return (Criteria) this;
        }

        public Criteria andYbPriceLessThan(Float value) {
            addCriterion("yb_price <", value, "ybPrice");
            return (Criteria) this;
        }

        public Criteria andYbPriceLessThanOrEqualTo(Float value) {
            addCriterion("yb_price <=", value, "ybPrice");
            return (Criteria) this;
        }

        public Criteria andYbPriceIn(List<Float> values) {
            addCriterion("yb_price in", values, "ybPrice");
            return (Criteria) this;
        }

        public Criteria andYbPriceNotIn(List<Float> values) {
            addCriterion("yb_price not in", values, "ybPrice");
            return (Criteria) this;
        }

        public Criteria andYbPriceBetween(Float value1, Float value2) {
            addCriterion("yb_price between", value1, value2, "ybPrice");
            return (Criteria) this;
        }

        public Criteria andYbPriceNotBetween(Float value1, Float value2) {
            addCriterion("yb_price not between", value1, value2, "ybPrice");
            return (Criteria) this;
        }

        public Criteria andApprovalNumIsNull() {
            addCriterion("approval_num is null");
            return (Criteria) this;
        }

        public Criteria andApprovalNumIsNotNull() {
            addCriterion("approval_num is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalNumEqualTo(String value) {
            addCriterion("approval_num =", value, "approvalNum");
            return (Criteria) this;
        }

        public Criteria andApprovalNumNotEqualTo(String value) {
            addCriterion("approval_num <>", value, "approvalNum");
            return (Criteria) this;
        }

        public Criteria andApprovalNumGreaterThan(String value) {
            addCriterion("approval_num >", value, "approvalNum");
            return (Criteria) this;
        }

        public Criteria andApprovalNumGreaterThanOrEqualTo(String value) {
            addCriterion("approval_num >=", value, "approvalNum");
            return (Criteria) this;
        }

        public Criteria andApprovalNumLessThan(String value) {
            addCriterion("approval_num <", value, "approvalNum");
            return (Criteria) this;
        }

        public Criteria andApprovalNumLessThanOrEqualTo(String value) {
            addCriterion("approval_num <=", value, "approvalNum");
            return (Criteria) this;
        }

        public Criteria andApprovalNumLike(String value) {
            addCriterion("approval_num like", value, "approvalNum");
            return (Criteria) this;
        }

        public Criteria andApprovalNumNotLike(String value) {
            addCriterion("approval_num not like", value, "approvalNum");
            return (Criteria) this;
        }

        public Criteria andApprovalNumIn(List<String> values) {
            addCriterion("approval_num in", values, "approvalNum");
            return (Criteria) this;
        }

        public Criteria andApprovalNumNotIn(List<String> values) {
            addCriterion("approval_num not in", values, "approvalNum");
            return (Criteria) this;
        }

        public Criteria andApprovalNumBetween(String value1, String value2) {
            addCriterion("approval_num between", value1, value2, "approvalNum");
            return (Criteria) this;
        }

        public Criteria andApprovalNumNotBetween(String value1, String value2) {
            addCriterion("approval_num not between", value1, value2, "approvalNum");
            return (Criteria) this;
        }

        public Criteria andApprovalNumExpiryDateIsNull() {
            addCriterion("approval_num_expiry_date is null");
            return (Criteria) this;
        }

        public Criteria andApprovalNumExpiryDateIsNotNull() {
            addCriterion("approval_num_expiry_date is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalNumExpiryDateEqualTo(Date value) {
            addCriterionForJDBCDate("approval_num_expiry_date =", value, "approvalNumExpiryDate");
            return (Criteria) this;
        }

        public Criteria andApprovalNumExpiryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("approval_num_expiry_date <>", value, "approvalNumExpiryDate");
            return (Criteria) this;
        }

        public Criteria andApprovalNumExpiryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("approval_num_expiry_date >", value, "approvalNumExpiryDate");
            return (Criteria) this;
        }

        public Criteria andApprovalNumExpiryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("approval_num_expiry_date >=", value, "approvalNumExpiryDate");
            return (Criteria) this;
        }

        public Criteria andApprovalNumExpiryDateLessThan(Date value) {
            addCriterionForJDBCDate("approval_num_expiry_date <", value, "approvalNumExpiryDate");
            return (Criteria) this;
        }

        public Criteria andApprovalNumExpiryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("approval_num_expiry_date <=", value, "approvalNumExpiryDate");
            return (Criteria) this;
        }

        public Criteria andApprovalNumExpiryDateIn(List<Date> values) {
            addCriterionForJDBCDate("approval_num_expiry_date in", values, "approvalNumExpiryDate");
            return (Criteria) this;
        }

        public Criteria andApprovalNumExpiryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("approval_num_expiry_date not in", values, "approvalNumExpiryDate");
            return (Criteria) this;
        }

        public Criteria andApprovalNumExpiryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("approval_num_expiry_date between", value1, value2, "approvalNumExpiryDate");
            return (Criteria) this;
        }

        public Criteria andApprovalNumExpiryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("approval_num_expiry_date not between", value1, value2, "approvalNumExpiryDate");
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