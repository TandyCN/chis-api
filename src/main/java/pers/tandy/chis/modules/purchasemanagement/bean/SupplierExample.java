package pers.tandy.chis.modules.purchasemanagement.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierExample() {
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

        public Criteria andAccountLicenceIsNull() {
            addCriterion("account_licence is null");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceIsNotNull() {
            addCriterion("account_licence is not null");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceEqualTo(String value) {
            addCriterion("account_licence =", value, "accountLicence");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceNotEqualTo(String value) {
            addCriterion("account_licence <>", value, "accountLicence");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceGreaterThan(String value) {
            addCriterion("account_licence >", value, "accountLicence");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceGreaterThanOrEqualTo(String value) {
            addCriterion("account_licence >=", value, "accountLicence");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceLessThan(String value) {
            addCriterion("account_licence <", value, "accountLicence");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceLessThanOrEqualTo(String value) {
            addCriterion("account_licence <=", value, "accountLicence");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceLike(String value) {
            addCriterion("account_licence like", value, "accountLicence");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceNotLike(String value) {
            addCriterion("account_licence not like", value, "accountLicence");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceIn(List<String> values) {
            addCriterion("account_licence in", values, "accountLicence");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceNotIn(List<String> values) {
            addCriterion("account_licence not in", values, "accountLicence");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceBetween(String value1, String value2) {
            addCriterion("account_licence between", value1, value2, "accountLicence");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceNotBetween(String value1, String value2) {
            addCriterion("account_licence not between", value1, value2, "accountLicence");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNull() {
            addCriterion("card_no is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("card_no is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("card_no =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("card_no <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("card_no >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("card_no >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("card_no <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("card_no <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("card_no like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("card_no not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("card_no in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("card_no not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("card_no between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("card_no not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdIsNull() {
            addCriterion("invoice_type_id is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdIsNotNull() {
            addCriterion("invoice_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdEqualTo(Integer value) {
            addCriterion("invoice_type_id =", value, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdNotEqualTo(Integer value) {
            addCriterion("invoice_type_id <>", value, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdGreaterThan(Integer value) {
            addCriterion("invoice_type_id >", value, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("invoice_type_id >=", value, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdLessThan(Integer value) {
            addCriterion("invoice_type_id <", value, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("invoice_type_id <=", value, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdIn(List<Integer> values) {
            addCriterion("invoice_type_id in", values, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdNotIn(List<Integer> values) {
            addCriterion("invoice_type_id not in", values, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("invoice_type_id between", value1, value2, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("invoice_type_id not between", value1, value2, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdIsNull() {
            addCriterion("payment_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdIsNotNull() {
            addCriterion("payment_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdEqualTo(Integer value) {
            addCriterion("payment_type_id =", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdNotEqualTo(Integer value) {
            addCriterion("payment_type_id <>", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdGreaterThan(Integer value) {
            addCriterion("payment_type_id >", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_type_id >=", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdLessThan(Integer value) {
            addCriterion("payment_type_id <", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("payment_type_id <=", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdIn(List<Integer> values) {
            addCriterion("payment_type_id in", values, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdNotIn(List<Integer> values) {
            addCriterion("payment_type_id not in", values, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("payment_type_id between", value1, value2, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_type_id not between", value1, value2, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andArrearagesLimitIsNull() {
            addCriterion("arrearages_limit is null");
            return (Criteria) this;
        }

        public Criteria andArrearagesLimitIsNotNull() {
            addCriterion("arrearages_limit is not null");
            return (Criteria) this;
        }

        public Criteria andArrearagesLimitEqualTo(Float value) {
            addCriterion("arrearages_limit =", value, "arrearagesLimit");
            return (Criteria) this;
        }

        public Criteria andArrearagesLimitNotEqualTo(Float value) {
            addCriterion("arrearages_limit <>", value, "arrearagesLimit");
            return (Criteria) this;
        }

        public Criteria andArrearagesLimitGreaterThan(Float value) {
            addCriterion("arrearages_limit >", value, "arrearagesLimit");
            return (Criteria) this;
        }

        public Criteria andArrearagesLimitGreaterThanOrEqualTo(Float value) {
            addCriterion("arrearages_limit >=", value, "arrearagesLimit");
            return (Criteria) this;
        }

        public Criteria andArrearagesLimitLessThan(Float value) {
            addCriterion("arrearages_limit <", value, "arrearagesLimit");
            return (Criteria) this;
        }

        public Criteria andArrearagesLimitLessThanOrEqualTo(Float value) {
            addCriterion("arrearages_limit <=", value, "arrearagesLimit");
            return (Criteria) this;
        }

        public Criteria andArrearagesLimitIn(List<Float> values) {
            addCriterion("arrearages_limit in", values, "arrearagesLimit");
            return (Criteria) this;
        }

        public Criteria andArrearagesLimitNotIn(List<Float> values) {
            addCriterion("arrearages_limit not in", values, "arrearagesLimit");
            return (Criteria) this;
        }

        public Criteria andArrearagesLimitBetween(Float value1, Float value2) {
            addCriterion("arrearages_limit between", value1, value2, "arrearagesLimit");
            return (Criteria) this;
        }

        public Criteria andArrearagesLimitNotBetween(Float value1, Float value2) {
            addCriterion("arrearages_limit not between", value1, value2, "arrearagesLimit");
            return (Criteria) this;
        }

        public Criteria andArrearagesDaysIsNull() {
            addCriterion("arrearages_days is null");
            return (Criteria) this;
        }

        public Criteria andArrearagesDaysIsNotNull() {
            addCriterion("arrearages_days is not null");
            return (Criteria) this;
        }

        public Criteria andArrearagesDaysEqualTo(Byte value) {
            addCriterion("arrearages_days =", value, "arrearagesDays");
            return (Criteria) this;
        }

        public Criteria andArrearagesDaysNotEqualTo(Byte value) {
            addCriterion("arrearages_days <>", value, "arrearagesDays");
            return (Criteria) this;
        }

        public Criteria andArrearagesDaysGreaterThan(Byte value) {
            addCriterion("arrearages_days >", value, "arrearagesDays");
            return (Criteria) this;
        }

        public Criteria andArrearagesDaysGreaterThanOrEqualTo(Byte value) {
            addCriterion("arrearages_days >=", value, "arrearagesDays");
            return (Criteria) this;
        }

        public Criteria andArrearagesDaysLessThan(Byte value) {
            addCriterion("arrearages_days <", value, "arrearagesDays");
            return (Criteria) this;
        }

        public Criteria andArrearagesDaysLessThanOrEqualTo(Byte value) {
            addCriterion("arrearages_days <=", value, "arrearagesDays");
            return (Criteria) this;
        }

        public Criteria andArrearagesDaysIn(List<Byte> values) {
            addCriterion("arrearages_days in", values, "arrearagesDays");
            return (Criteria) this;
        }

        public Criteria andArrearagesDaysNotIn(List<Byte> values) {
            addCriterion("arrearages_days not in", values, "arrearagesDays");
            return (Criteria) this;
        }

        public Criteria andArrearagesDaysBetween(Byte value1, Byte value2) {
            addCriterion("arrearages_days between", value1, value2, "arrearagesDays");
            return (Criteria) this;
        }

        public Criteria andArrearagesDaysNotBetween(Byte value1, Byte value2) {
            addCriterion("arrearages_days not between", value1, value2, "arrearagesDays");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNull() {
            addCriterion("legal_person is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNotNull() {
            addCriterion("legal_person is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonEqualTo(String value) {
            addCriterion("legal_person =", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("legal_person <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("legal_person >", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person >=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThan(String value) {
            addCriterion("legal_person <", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("legal_person <=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLike(String value) {
            addCriterion("legal_person like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotLike(String value) {
            addCriterion("legal_person not like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIn(List<String> values) {
            addCriterion("legal_person in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotIn(List<String> values) {
            addCriterion("legal_person not in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("legal_person between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("legal_person not between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("fax not between", value1, value2, "fax");
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

        public Criteria andContacterIsNull() {
            addCriterion("contacter is null");
            return (Criteria) this;
        }

        public Criteria andContacterIsNotNull() {
            addCriterion("contacter is not null");
            return (Criteria) this;
        }

        public Criteria andContacterEqualTo(String value) {
            addCriterion("contacter =", value, "contacter");
            return (Criteria) this;
        }

        public Criteria andContacterNotEqualTo(String value) {
            addCriterion("contacter <>", value, "contacter");
            return (Criteria) this;
        }

        public Criteria andContacterGreaterThan(String value) {
            addCriterion("contacter >", value, "contacter");
            return (Criteria) this;
        }

        public Criteria andContacterGreaterThanOrEqualTo(String value) {
            addCriterion("contacter >=", value, "contacter");
            return (Criteria) this;
        }

        public Criteria andContacterLessThan(String value) {
            addCriterion("contacter <", value, "contacter");
            return (Criteria) this;
        }

        public Criteria andContacterLessThanOrEqualTo(String value) {
            addCriterion("contacter <=", value, "contacter");
            return (Criteria) this;
        }

        public Criteria andContacterLike(String value) {
            addCriterion("contacter like", value, "contacter");
            return (Criteria) this;
        }

        public Criteria andContacterNotLike(String value) {
            addCriterion("contacter not like", value, "contacter");
            return (Criteria) this;
        }

        public Criteria andContacterIn(List<String> values) {
            addCriterion("contacter in", values, "contacter");
            return (Criteria) this;
        }

        public Criteria andContacterNotIn(List<String> values) {
            addCriterion("contacter not in", values, "contacter");
            return (Criteria) this;
        }

        public Criteria andContacterBetween(String value1, String value2) {
            addCriterion("contacter between", value1, value2, "contacter");
            return (Criteria) this;
        }

        public Criteria andContacterNotBetween(String value1, String value2) {
            addCriterion("contacter not between", value1, value2, "contacter");
            return (Criteria) this;
        }

        public Criteria andContacterPhoneIsNull() {
            addCriterion("contacter_phone is null");
            return (Criteria) this;
        }

        public Criteria andContacterPhoneIsNotNull() {
            addCriterion("contacter_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContacterPhoneEqualTo(String value) {
            addCriterion("contacter_phone =", value, "contacterPhone");
            return (Criteria) this;
        }

        public Criteria andContacterPhoneNotEqualTo(String value) {
            addCriterion("contacter_phone <>", value, "contacterPhone");
            return (Criteria) this;
        }

        public Criteria andContacterPhoneGreaterThan(String value) {
            addCriterion("contacter_phone >", value, "contacterPhone");
            return (Criteria) this;
        }

        public Criteria andContacterPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contacter_phone >=", value, "contacterPhone");
            return (Criteria) this;
        }

        public Criteria andContacterPhoneLessThan(String value) {
            addCriterion("contacter_phone <", value, "contacterPhone");
            return (Criteria) this;
        }

        public Criteria andContacterPhoneLessThanOrEqualTo(String value) {
            addCriterion("contacter_phone <=", value, "contacterPhone");
            return (Criteria) this;
        }

        public Criteria andContacterPhoneLike(String value) {
            addCriterion("contacter_phone like", value, "contacterPhone");
            return (Criteria) this;
        }

        public Criteria andContacterPhoneNotLike(String value) {
            addCriterion("contacter_phone not like", value, "contacterPhone");
            return (Criteria) this;
        }

        public Criteria andContacterPhoneIn(List<String> values) {
            addCriterion("contacter_phone in", values, "contacterPhone");
            return (Criteria) this;
        }

        public Criteria andContacterPhoneNotIn(List<String> values) {
            addCriterion("contacter_phone not in", values, "contacterPhone");
            return (Criteria) this;
        }

        public Criteria andContacterPhoneBetween(String value1, String value2) {
            addCriterion("contacter_phone between", value1, value2, "contacterPhone");
            return (Criteria) this;
        }

        public Criteria andContacterPhoneNotBetween(String value1, String value2) {
            addCriterion("contacter_phone not between", value1, value2, "contacterPhone");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNull() {
            addCriterion("business_scope is null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNotNull() {
            addCriterion("business_scope is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeEqualTo(String value) {
            addCriterion("business_scope =", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotEqualTo(String value) {
            addCriterion("business_scope <>", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThan(String value) {
            addCriterion("business_scope >", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThanOrEqualTo(String value) {
            addCriterion("business_scope >=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThan(String value) {
            addCriterion("business_scope <", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThanOrEqualTo(String value) {
            addCriterion("business_scope <=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLike(String value) {
            addCriterion("business_scope like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotLike(String value) {
            addCriterion("business_scope not like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIn(List<String> values) {
            addCriterion("business_scope in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotIn(List<String> values) {
            addCriterion("business_scope not in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeBetween(String value1, String value2) {
            addCriterion("business_scope between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotBetween(String value1, String value2) {
            addCriterion("business_scope not between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceIsNull() {
            addCriterion("business_licence is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceIsNotNull() {
            addCriterion("business_licence is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEqualTo(String value) {
            addCriterion("business_licence =", value, "businessLicence");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNotEqualTo(String value) {
            addCriterion("business_licence <>", value, "businessLicence");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceGreaterThan(String value) {
            addCriterion("business_licence >", value, "businessLicence");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceGreaterThanOrEqualTo(String value) {
            addCriterion("business_licence >=", value, "businessLicence");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceLessThan(String value) {
            addCriterion("business_licence <", value, "businessLicence");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceLessThanOrEqualTo(String value) {
            addCriterion("business_licence <=", value, "businessLicence");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceLike(String value) {
            addCriterion("business_licence like", value, "businessLicence");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNotLike(String value) {
            addCriterion("business_licence not like", value, "businessLicence");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceIn(List<String> values) {
            addCriterion("business_licence in", values, "businessLicence");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNotIn(List<String> values) {
            addCriterion("business_licence not in", values, "businessLicence");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceBetween(String value1, String value2) {
            addCriterion("business_licence between", value1, value2, "businessLicence");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNotBetween(String value1, String value2) {
            addCriterion("business_licence not between", value1, value2, "businessLicence");
            return (Criteria) this;
        }

        public Criteria andBlExpiryDateIsNull() {
            addCriterion("bl_expiry_date is null");
            return (Criteria) this;
        }

        public Criteria andBlExpiryDateIsNotNull() {
            addCriterion("bl_expiry_date is not null");
            return (Criteria) this;
        }

        public Criteria andBlExpiryDateEqualTo(Date value) {
            addCriterionForJDBCDate("bl_expiry_date =", value, "blExpiryDate");
            return (Criteria) this;
        }

        public Criteria andBlExpiryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("bl_expiry_date <>", value, "blExpiryDate");
            return (Criteria) this;
        }

        public Criteria andBlExpiryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("bl_expiry_date >", value, "blExpiryDate");
            return (Criteria) this;
        }

        public Criteria andBlExpiryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bl_expiry_date >=", value, "blExpiryDate");
            return (Criteria) this;
        }

        public Criteria andBlExpiryDateLessThan(Date value) {
            addCriterionForJDBCDate("bl_expiry_date <", value, "blExpiryDate");
            return (Criteria) this;
        }

        public Criteria andBlExpiryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bl_expiry_date <=", value, "blExpiryDate");
            return (Criteria) this;
        }

        public Criteria andBlExpiryDateIn(List<Date> values) {
            addCriterionForJDBCDate("bl_expiry_date in", values, "blExpiryDate");
            return (Criteria) this;
        }

        public Criteria andBlExpiryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("bl_expiry_date not in", values, "blExpiryDate");
            return (Criteria) this;
        }

        public Criteria andBlExpiryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bl_expiry_date between", value1, value2, "blExpiryDate");
            return (Criteria) this;
        }

        public Criteria andBlExpiryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bl_expiry_date not between", value1, value2, "blExpiryDate");
            return (Criteria) this;
        }

        public Criteria andHygienicLicenseIsNull() {
            addCriterion("hygienic_license is null");
            return (Criteria) this;
        }

        public Criteria andHygienicLicenseIsNotNull() {
            addCriterion("hygienic_license is not null");
            return (Criteria) this;
        }

        public Criteria andHygienicLicenseEqualTo(String value) {
            addCriterion("hygienic_license =", value, "hygienicLicense");
            return (Criteria) this;
        }

        public Criteria andHygienicLicenseNotEqualTo(String value) {
            addCriterion("hygienic_license <>", value, "hygienicLicense");
            return (Criteria) this;
        }

        public Criteria andHygienicLicenseGreaterThan(String value) {
            addCriterion("hygienic_license >", value, "hygienicLicense");
            return (Criteria) this;
        }

        public Criteria andHygienicLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("hygienic_license >=", value, "hygienicLicense");
            return (Criteria) this;
        }

        public Criteria andHygienicLicenseLessThan(String value) {
            addCriterion("hygienic_license <", value, "hygienicLicense");
            return (Criteria) this;
        }

        public Criteria andHygienicLicenseLessThanOrEqualTo(String value) {
            addCriterion("hygienic_license <=", value, "hygienicLicense");
            return (Criteria) this;
        }

        public Criteria andHygienicLicenseLike(String value) {
            addCriterion("hygienic_license like", value, "hygienicLicense");
            return (Criteria) this;
        }

        public Criteria andHygienicLicenseNotLike(String value) {
            addCriterion("hygienic_license not like", value, "hygienicLicense");
            return (Criteria) this;
        }

        public Criteria andHygienicLicenseIn(List<String> values) {
            addCriterion("hygienic_license in", values, "hygienicLicense");
            return (Criteria) this;
        }

        public Criteria andHygienicLicenseNotIn(List<String> values) {
            addCriterion("hygienic_license not in", values, "hygienicLicense");
            return (Criteria) this;
        }

        public Criteria andHygienicLicenseBetween(String value1, String value2) {
            addCriterion("hygienic_license between", value1, value2, "hygienicLicense");
            return (Criteria) this;
        }

        public Criteria andHygienicLicenseNotBetween(String value1, String value2) {
            addCriterion("hygienic_license not between", value1, value2, "hygienicLicense");
            return (Criteria) this;
        }

        public Criteria andHlExpiryDateIsNull() {
            addCriterion("hl_expiry_date is null");
            return (Criteria) this;
        }

        public Criteria andHlExpiryDateIsNotNull() {
            addCriterion("hl_expiry_date is not null");
            return (Criteria) this;
        }

        public Criteria andHlExpiryDateEqualTo(Date value) {
            addCriterionForJDBCDate("hl_expiry_date =", value, "hlExpiryDate");
            return (Criteria) this;
        }

        public Criteria andHlExpiryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("hl_expiry_date <>", value, "hlExpiryDate");
            return (Criteria) this;
        }

        public Criteria andHlExpiryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("hl_expiry_date >", value, "hlExpiryDate");
            return (Criteria) this;
        }

        public Criteria andHlExpiryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hl_expiry_date >=", value, "hlExpiryDate");
            return (Criteria) this;
        }

        public Criteria andHlExpiryDateLessThan(Date value) {
            addCriterionForJDBCDate("hl_expiry_date <", value, "hlExpiryDate");
            return (Criteria) this;
        }

        public Criteria andHlExpiryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hl_expiry_date <=", value, "hlExpiryDate");
            return (Criteria) this;
        }

        public Criteria andHlExpiryDateIn(List<Date> values) {
            addCriterionForJDBCDate("hl_expiry_date in", values, "hlExpiryDate");
            return (Criteria) this;
        }

        public Criteria andHlExpiryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("hl_expiry_date not in", values, "hlExpiryDate");
            return (Criteria) this;
        }

        public Criteria andHlExpiryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hl_expiry_date between", value1, value2, "hlExpiryDate");
            return (Criteria) this;
        }

        public Criteria andHlExpiryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hl_expiry_date not between", value1, value2, "hlExpiryDate");
            return (Criteria) this;
        }

        public Criteria andProductionLicenceIsNull() {
            addCriterion("production_licence is null");
            return (Criteria) this;
        }

        public Criteria andProductionLicenceIsNotNull() {
            addCriterion("production_licence is not null");
            return (Criteria) this;
        }

        public Criteria andProductionLicenceEqualTo(String value) {
            addCriterion("production_licence =", value, "productionLicence");
            return (Criteria) this;
        }

        public Criteria andProductionLicenceNotEqualTo(String value) {
            addCriterion("production_licence <>", value, "productionLicence");
            return (Criteria) this;
        }

        public Criteria andProductionLicenceGreaterThan(String value) {
            addCriterion("production_licence >", value, "productionLicence");
            return (Criteria) this;
        }

        public Criteria andProductionLicenceGreaterThanOrEqualTo(String value) {
            addCriterion("production_licence >=", value, "productionLicence");
            return (Criteria) this;
        }

        public Criteria andProductionLicenceLessThan(String value) {
            addCriterion("production_licence <", value, "productionLicence");
            return (Criteria) this;
        }

        public Criteria andProductionLicenceLessThanOrEqualTo(String value) {
            addCriterion("production_licence <=", value, "productionLicence");
            return (Criteria) this;
        }

        public Criteria andProductionLicenceLike(String value) {
            addCriterion("production_licence like", value, "productionLicence");
            return (Criteria) this;
        }

        public Criteria andProductionLicenceNotLike(String value) {
            addCriterion("production_licence not like", value, "productionLicence");
            return (Criteria) this;
        }

        public Criteria andProductionLicenceIn(List<String> values) {
            addCriterion("production_licence in", values, "productionLicence");
            return (Criteria) this;
        }

        public Criteria andProductionLicenceNotIn(List<String> values) {
            addCriterion("production_licence not in", values, "productionLicence");
            return (Criteria) this;
        }

        public Criteria andProductionLicenceBetween(String value1, String value2) {
            addCriterion("production_licence between", value1, value2, "productionLicence");
            return (Criteria) this;
        }

        public Criteria andProductionLicenceNotBetween(String value1, String value2) {
            addCriterion("production_licence not between", value1, value2, "productionLicence");
            return (Criteria) this;
        }

        public Criteria andPlExpiryDateIsNull() {
            addCriterion("pl_expiry_date is null");
            return (Criteria) this;
        }

        public Criteria andPlExpiryDateIsNotNull() {
            addCriterion("pl_expiry_date is not null");
            return (Criteria) this;
        }

        public Criteria andPlExpiryDateEqualTo(Date value) {
            addCriterionForJDBCDate("pl_expiry_date =", value, "plExpiryDate");
            return (Criteria) this;
        }

        public Criteria andPlExpiryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pl_expiry_date <>", value, "plExpiryDate");
            return (Criteria) this;
        }

        public Criteria andPlExpiryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("pl_expiry_date >", value, "plExpiryDate");
            return (Criteria) this;
        }

        public Criteria andPlExpiryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pl_expiry_date >=", value, "plExpiryDate");
            return (Criteria) this;
        }

        public Criteria andPlExpiryDateLessThan(Date value) {
            addCriterionForJDBCDate("pl_expiry_date <", value, "plExpiryDate");
            return (Criteria) this;
        }

        public Criteria andPlExpiryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pl_expiry_date <=", value, "plExpiryDate");
            return (Criteria) this;
        }

        public Criteria andPlExpiryDateIn(List<Date> values) {
            addCriterionForJDBCDate("pl_expiry_date in", values, "plExpiryDate");
            return (Criteria) this;
        }

        public Criteria andPlExpiryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pl_expiry_date not in", values, "plExpiryDate");
            return (Criteria) this;
        }

        public Criteria andPlExpiryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pl_expiry_date between", value1, value2, "plExpiryDate");
            return (Criteria) this;
        }

        public Criteria andPlExpiryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pl_expiry_date not between", value1, value2, "plExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGspLicenceIsNull() {
            addCriterion("gsp_licence is null");
            return (Criteria) this;
        }

        public Criteria andGspLicenceIsNotNull() {
            addCriterion("gsp_licence is not null");
            return (Criteria) this;
        }

        public Criteria andGspLicenceEqualTo(String value) {
            addCriterion("gsp_licence =", value, "gspLicence");
            return (Criteria) this;
        }

        public Criteria andGspLicenceNotEqualTo(String value) {
            addCriterion("gsp_licence <>", value, "gspLicence");
            return (Criteria) this;
        }

        public Criteria andGspLicenceGreaterThan(String value) {
            addCriterion("gsp_licence >", value, "gspLicence");
            return (Criteria) this;
        }

        public Criteria andGspLicenceGreaterThanOrEqualTo(String value) {
            addCriterion("gsp_licence >=", value, "gspLicence");
            return (Criteria) this;
        }

        public Criteria andGspLicenceLessThan(String value) {
            addCriterion("gsp_licence <", value, "gspLicence");
            return (Criteria) this;
        }

        public Criteria andGspLicenceLessThanOrEqualTo(String value) {
            addCriterion("gsp_licence <=", value, "gspLicence");
            return (Criteria) this;
        }

        public Criteria andGspLicenceLike(String value) {
            addCriterion("gsp_licence like", value, "gspLicence");
            return (Criteria) this;
        }

        public Criteria andGspLicenceNotLike(String value) {
            addCriterion("gsp_licence not like", value, "gspLicence");
            return (Criteria) this;
        }

        public Criteria andGspLicenceIn(List<String> values) {
            addCriterion("gsp_licence in", values, "gspLicence");
            return (Criteria) this;
        }

        public Criteria andGspLicenceNotIn(List<String> values) {
            addCriterion("gsp_licence not in", values, "gspLicence");
            return (Criteria) this;
        }

        public Criteria andGspLicenceBetween(String value1, String value2) {
            addCriterion("gsp_licence between", value1, value2, "gspLicence");
            return (Criteria) this;
        }

        public Criteria andGspLicenceNotBetween(String value1, String value2) {
            addCriterion("gsp_licence not between", value1, value2, "gspLicence");
            return (Criteria) this;
        }

        public Criteria andGspExpiryDateIsNull() {
            addCriterion("gsp_expiry_date is null");
            return (Criteria) this;
        }

        public Criteria andGspExpiryDateIsNotNull() {
            addCriterion("gsp_expiry_date is not null");
            return (Criteria) this;
        }

        public Criteria andGspExpiryDateEqualTo(Date value) {
            addCriterionForJDBCDate("gsp_expiry_date =", value, "gspExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGspExpiryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("gsp_expiry_date <>", value, "gspExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGspExpiryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("gsp_expiry_date >", value, "gspExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGspExpiryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gsp_expiry_date >=", value, "gspExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGspExpiryDateLessThan(Date value) {
            addCriterionForJDBCDate("gsp_expiry_date <", value, "gspExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGspExpiryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gsp_expiry_date <=", value, "gspExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGspExpiryDateIn(List<Date> values) {
            addCriterionForJDBCDate("gsp_expiry_date in", values, "gspExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGspExpiryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("gsp_expiry_date not in", values, "gspExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGspExpiryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gsp_expiry_date between", value1, value2, "gspExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGspExpiryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gsp_expiry_date not between", value1, value2, "gspExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGmpLicenceIsNull() {
            addCriterion("gmp_licence is null");
            return (Criteria) this;
        }

        public Criteria andGmpLicenceIsNotNull() {
            addCriterion("gmp_licence is not null");
            return (Criteria) this;
        }

        public Criteria andGmpLicenceEqualTo(String value) {
            addCriterion("gmp_licence =", value, "gmpLicence");
            return (Criteria) this;
        }

        public Criteria andGmpLicenceNotEqualTo(String value) {
            addCriterion("gmp_licence <>", value, "gmpLicence");
            return (Criteria) this;
        }

        public Criteria andGmpLicenceGreaterThan(String value) {
            addCriterion("gmp_licence >", value, "gmpLicence");
            return (Criteria) this;
        }

        public Criteria andGmpLicenceGreaterThanOrEqualTo(String value) {
            addCriterion("gmp_licence >=", value, "gmpLicence");
            return (Criteria) this;
        }

        public Criteria andGmpLicenceLessThan(String value) {
            addCriterion("gmp_licence <", value, "gmpLicence");
            return (Criteria) this;
        }

        public Criteria andGmpLicenceLessThanOrEqualTo(String value) {
            addCriterion("gmp_licence <=", value, "gmpLicence");
            return (Criteria) this;
        }

        public Criteria andGmpLicenceLike(String value) {
            addCriterion("gmp_licence like", value, "gmpLicence");
            return (Criteria) this;
        }

        public Criteria andGmpLicenceNotLike(String value) {
            addCriterion("gmp_licence not like", value, "gmpLicence");
            return (Criteria) this;
        }

        public Criteria andGmpLicenceIn(List<String> values) {
            addCriterion("gmp_licence in", values, "gmpLicence");
            return (Criteria) this;
        }

        public Criteria andGmpLicenceNotIn(List<String> values) {
            addCriterion("gmp_licence not in", values, "gmpLicence");
            return (Criteria) this;
        }

        public Criteria andGmpLicenceBetween(String value1, String value2) {
            addCriterion("gmp_licence between", value1, value2, "gmpLicence");
            return (Criteria) this;
        }

        public Criteria andGmpLicenceNotBetween(String value1, String value2) {
            addCriterion("gmp_licence not between", value1, value2, "gmpLicence");
            return (Criteria) this;
        }

        public Criteria andGmpExpiryDateIsNull() {
            addCriterion("gmp_expiry_date is null");
            return (Criteria) this;
        }

        public Criteria andGmpExpiryDateIsNotNull() {
            addCriterion("gmp_expiry_date is not null");
            return (Criteria) this;
        }

        public Criteria andGmpExpiryDateEqualTo(Date value) {
            addCriterionForJDBCDate("gmp_expiry_date =", value, "gmpExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGmpExpiryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("gmp_expiry_date <>", value, "gmpExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGmpExpiryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("gmp_expiry_date >", value, "gmpExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGmpExpiryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gmp_expiry_date >=", value, "gmpExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGmpExpiryDateLessThan(Date value) {
            addCriterionForJDBCDate("gmp_expiry_date <", value, "gmpExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGmpExpiryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gmp_expiry_date <=", value, "gmpExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGmpExpiryDateIn(List<Date> values) {
            addCriterionForJDBCDate("gmp_expiry_date in", values, "gmpExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGmpExpiryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("gmp_expiry_date not in", values, "gmpExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGmpExpiryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gmp_expiry_date between", value1, value2, "gmpExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGmpExpiryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gmp_expiry_date not between", value1, value2, "gmpExpiryDate");
            return (Criteria) this;
        }

        public Criteria andInstrumentLicenceIsNull() {
            addCriterion("instrument_licence is null");
            return (Criteria) this;
        }

        public Criteria andInstrumentLicenceIsNotNull() {
            addCriterion("instrument_licence is not null");
            return (Criteria) this;
        }

        public Criteria andInstrumentLicenceEqualTo(String value) {
            addCriterion("instrument_licence =", value, "instrumentLicence");
            return (Criteria) this;
        }

        public Criteria andInstrumentLicenceNotEqualTo(String value) {
            addCriterion("instrument_licence <>", value, "instrumentLicence");
            return (Criteria) this;
        }

        public Criteria andInstrumentLicenceGreaterThan(String value) {
            addCriterion("instrument_licence >", value, "instrumentLicence");
            return (Criteria) this;
        }

        public Criteria andInstrumentLicenceGreaterThanOrEqualTo(String value) {
            addCriterion("instrument_licence >=", value, "instrumentLicence");
            return (Criteria) this;
        }

        public Criteria andInstrumentLicenceLessThan(String value) {
            addCriterion("instrument_licence <", value, "instrumentLicence");
            return (Criteria) this;
        }

        public Criteria andInstrumentLicenceLessThanOrEqualTo(String value) {
            addCriterion("instrument_licence <=", value, "instrumentLicence");
            return (Criteria) this;
        }

        public Criteria andInstrumentLicenceLike(String value) {
            addCriterion("instrument_licence like", value, "instrumentLicence");
            return (Criteria) this;
        }

        public Criteria andInstrumentLicenceNotLike(String value) {
            addCriterion("instrument_licence not like", value, "instrumentLicence");
            return (Criteria) this;
        }

        public Criteria andInstrumentLicenceIn(List<String> values) {
            addCriterion("instrument_licence in", values, "instrumentLicence");
            return (Criteria) this;
        }

        public Criteria andInstrumentLicenceNotIn(List<String> values) {
            addCriterion("instrument_licence not in", values, "instrumentLicence");
            return (Criteria) this;
        }

        public Criteria andInstrumentLicenceBetween(String value1, String value2) {
            addCriterion("instrument_licence between", value1, value2, "instrumentLicence");
            return (Criteria) this;
        }

        public Criteria andInstrumentLicenceNotBetween(String value1, String value2) {
            addCriterion("instrument_licence not between", value1, value2, "instrumentLicence");
            return (Criteria) this;
        }

        public Criteria andIlExpiryDateIsNull() {
            addCriterion("il_expiry_date is null");
            return (Criteria) this;
        }

        public Criteria andIlExpiryDateIsNotNull() {
            addCriterion("il_expiry_date is not null");
            return (Criteria) this;
        }

        public Criteria andIlExpiryDateEqualTo(Date value) {
            addCriterionForJDBCDate("il_expiry_date =", value, "ilExpiryDate");
            return (Criteria) this;
        }

        public Criteria andIlExpiryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("il_expiry_date <>", value, "ilExpiryDate");
            return (Criteria) this;
        }

        public Criteria andIlExpiryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("il_expiry_date >", value, "ilExpiryDate");
            return (Criteria) this;
        }

        public Criteria andIlExpiryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("il_expiry_date >=", value, "ilExpiryDate");
            return (Criteria) this;
        }

        public Criteria andIlExpiryDateLessThan(Date value) {
            addCriterionForJDBCDate("il_expiry_date <", value, "ilExpiryDate");
            return (Criteria) this;
        }

        public Criteria andIlExpiryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("il_expiry_date <=", value, "ilExpiryDate");
            return (Criteria) this;
        }

        public Criteria andIlExpiryDateIn(List<Date> values) {
            addCriterionForJDBCDate("il_expiry_date in", values, "ilExpiryDate");
            return (Criteria) this;
        }

        public Criteria andIlExpiryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("il_expiry_date not in", values, "ilExpiryDate");
            return (Criteria) this;
        }

        public Criteria andIlExpiryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("il_expiry_date between", value1, value2, "ilExpiryDate");
            return (Criteria) this;
        }

        public Criteria andIlExpiryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("il_expiry_date not between", value1, value2, "ilExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseIsNull() {
            addCriterion("food_license is null");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseIsNotNull() {
            addCriterion("food_license is not null");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseEqualTo(String value) {
            addCriterion("food_license =", value, "foodLicense");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseNotEqualTo(String value) {
            addCriterion("food_license <>", value, "foodLicense");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseGreaterThan(String value) {
            addCriterion("food_license >", value, "foodLicense");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("food_license >=", value, "foodLicense");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseLessThan(String value) {
            addCriterion("food_license <", value, "foodLicense");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseLessThanOrEqualTo(String value) {
            addCriterion("food_license <=", value, "foodLicense");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseLike(String value) {
            addCriterion("food_license like", value, "foodLicense");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseNotLike(String value) {
            addCriterion("food_license not like", value, "foodLicense");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseIn(List<String> values) {
            addCriterion("food_license in", values, "foodLicense");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseNotIn(List<String> values) {
            addCriterion("food_license not in", values, "foodLicense");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseBetween(String value1, String value2) {
            addCriterion("food_license between", value1, value2, "foodLicense");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseNotBetween(String value1, String value2) {
            addCriterion("food_license not between", value1, value2, "foodLicense");
            return (Criteria) this;
        }

        public Criteria andFlExpiryDateIsNull() {
            addCriterion("fl_expiry_date is null");
            return (Criteria) this;
        }

        public Criteria andFlExpiryDateIsNotNull() {
            addCriterion("fl_expiry_date is not null");
            return (Criteria) this;
        }

        public Criteria andFlExpiryDateEqualTo(Date value) {
            addCriterionForJDBCDate("fl_expiry_date =", value, "flExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFlExpiryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("fl_expiry_date <>", value, "flExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFlExpiryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("fl_expiry_date >", value, "flExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFlExpiryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fl_expiry_date >=", value, "flExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFlExpiryDateLessThan(Date value) {
            addCriterionForJDBCDate("fl_expiry_date <", value, "flExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFlExpiryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fl_expiry_date <=", value, "flExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFlExpiryDateIn(List<Date> values) {
            addCriterionForJDBCDate("fl_expiry_date in", values, "flExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFlExpiryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("fl_expiry_date not in", values, "flExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFlExpiryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fl_expiry_date between", value1, value2, "flExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFlExpiryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fl_expiry_date not between", value1, value2, "flExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFoodProductionLicenceIsNull() {
            addCriterion("food_production_licence is null");
            return (Criteria) this;
        }

        public Criteria andFoodProductionLicenceIsNotNull() {
            addCriterion("food_production_licence is not null");
            return (Criteria) this;
        }

        public Criteria andFoodProductionLicenceEqualTo(String value) {
            addCriterion("food_production_licence =", value, "foodProductionLicence");
            return (Criteria) this;
        }

        public Criteria andFoodProductionLicenceNotEqualTo(String value) {
            addCriterion("food_production_licence <>", value, "foodProductionLicence");
            return (Criteria) this;
        }

        public Criteria andFoodProductionLicenceGreaterThan(String value) {
            addCriterion("food_production_licence >", value, "foodProductionLicence");
            return (Criteria) this;
        }

        public Criteria andFoodProductionLicenceGreaterThanOrEqualTo(String value) {
            addCriterion("food_production_licence >=", value, "foodProductionLicence");
            return (Criteria) this;
        }

        public Criteria andFoodProductionLicenceLessThan(String value) {
            addCriterion("food_production_licence <", value, "foodProductionLicence");
            return (Criteria) this;
        }

        public Criteria andFoodProductionLicenceLessThanOrEqualTo(String value) {
            addCriterion("food_production_licence <=", value, "foodProductionLicence");
            return (Criteria) this;
        }

        public Criteria andFoodProductionLicenceLike(String value) {
            addCriterion("food_production_licence like", value, "foodProductionLicence");
            return (Criteria) this;
        }

        public Criteria andFoodProductionLicenceNotLike(String value) {
            addCriterion("food_production_licence not like", value, "foodProductionLicence");
            return (Criteria) this;
        }

        public Criteria andFoodProductionLicenceIn(List<String> values) {
            addCriterion("food_production_licence in", values, "foodProductionLicence");
            return (Criteria) this;
        }

        public Criteria andFoodProductionLicenceNotIn(List<String> values) {
            addCriterion("food_production_licence not in", values, "foodProductionLicence");
            return (Criteria) this;
        }

        public Criteria andFoodProductionLicenceBetween(String value1, String value2) {
            addCriterion("food_production_licence between", value1, value2, "foodProductionLicence");
            return (Criteria) this;
        }

        public Criteria andFoodProductionLicenceNotBetween(String value1, String value2) {
            addCriterion("food_production_licence not between", value1, value2, "foodProductionLicence");
            return (Criteria) this;
        }

        public Criteria andFplExpiryDateIsNull() {
            addCriterion("fpl_expiry_date is null");
            return (Criteria) this;
        }

        public Criteria andFplExpiryDateIsNotNull() {
            addCriterion("fpl_expiry_date is not null");
            return (Criteria) this;
        }

        public Criteria andFplExpiryDateEqualTo(Date value) {
            addCriterionForJDBCDate("fpl_expiry_date =", value, "fplExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFplExpiryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("fpl_expiry_date <>", value, "fplExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFplExpiryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("fpl_expiry_date >", value, "fplExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFplExpiryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fpl_expiry_date >=", value, "fplExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFplExpiryDateLessThan(Date value) {
            addCriterionForJDBCDate("fpl_expiry_date <", value, "fplExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFplExpiryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fpl_expiry_date <=", value, "fplExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFplExpiryDateIn(List<Date> values) {
            addCriterionForJDBCDate("fpl_expiry_date in", values, "fplExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFplExpiryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("fpl_expiry_date not in", values, "fplExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFplExpiryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fpl_expiry_date between", value1, value2, "fplExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFplExpiryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fpl_expiry_date not between", value1, value2, "fplExpiryDate");
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