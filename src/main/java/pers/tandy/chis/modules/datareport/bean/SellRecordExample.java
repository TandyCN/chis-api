package pers.tandy.chis.modules.datareport.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SellRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SellRecordExample() {
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

        public Criteria andDwtSellPrescriptionLshIsNull() {
            addCriterion("dwt_sell_prescription_lsh is null");
            return (Criteria) this;
        }

        public Criteria andDwtSellPrescriptionLshIsNotNull() {
            addCriterion("dwt_sell_prescription_lsh is not null");
            return (Criteria) this;
        }

        public Criteria andDwtSellPrescriptionLshEqualTo(String value) {
            addCriterion("dwt_sell_prescription_lsh =", value, "dwtSellPrescriptionLsh");
            return (Criteria) this;
        }

        public Criteria andDwtSellPrescriptionLshNotEqualTo(String value) {
            addCriterion("dwt_sell_prescription_lsh <>", value, "dwtSellPrescriptionLsh");
            return (Criteria) this;
        }

        public Criteria andDwtSellPrescriptionLshGreaterThan(String value) {
            addCriterion("dwt_sell_prescription_lsh >", value, "dwtSellPrescriptionLsh");
            return (Criteria) this;
        }

        public Criteria andDwtSellPrescriptionLshGreaterThanOrEqualTo(String value) {
            addCriterion("dwt_sell_prescription_lsh >=", value, "dwtSellPrescriptionLsh");
            return (Criteria) this;
        }

        public Criteria andDwtSellPrescriptionLshLessThan(String value) {
            addCriterion("dwt_sell_prescription_lsh <", value, "dwtSellPrescriptionLsh");
            return (Criteria) this;
        }

        public Criteria andDwtSellPrescriptionLshLessThanOrEqualTo(String value) {
            addCriterion("dwt_sell_prescription_lsh <=", value, "dwtSellPrescriptionLsh");
            return (Criteria) this;
        }

        public Criteria andDwtSellPrescriptionLshLike(String value) {
            addCriterion("dwt_sell_prescription_lsh like", value, "dwtSellPrescriptionLsh");
            return (Criteria) this;
        }

        public Criteria andDwtSellPrescriptionLshNotLike(String value) {
            addCriterion("dwt_sell_prescription_lsh not like", value, "dwtSellPrescriptionLsh");
            return (Criteria) this;
        }

        public Criteria andDwtSellPrescriptionLshIn(List<String> values) {
            addCriterion("dwt_sell_prescription_lsh in", values, "dwtSellPrescriptionLsh");
            return (Criteria) this;
        }

        public Criteria andDwtSellPrescriptionLshNotIn(List<String> values) {
            addCriterion("dwt_sell_prescription_lsh not in", values, "dwtSellPrescriptionLsh");
            return (Criteria) this;
        }

        public Criteria andDwtSellPrescriptionLshBetween(String value1, String value2) {
            addCriterion("dwt_sell_prescription_lsh between", value1, value2, "dwtSellPrescriptionLsh");
            return (Criteria) this;
        }

        public Criteria andDwtSellPrescriptionLshNotBetween(String value1, String value2) {
            addCriterion("dwt_sell_prescription_lsh not between", value1, value2, "dwtSellPrescriptionLsh");
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

        public Criteria andInvoiceNoIsNull() {
            addCriterion("invoice_no is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNotNull() {
            addCriterion("invoice_no is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoEqualTo(String value) {
            addCriterion("invoice_no =", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotEqualTo(String value) {
            addCriterion("invoice_no <>", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThan(String value) {
            addCriterion("invoice_no >", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_no >=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThan(String value) {
            addCriterion("invoice_no <", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThanOrEqualTo(String value) {
            addCriterion("invoice_no <=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLike(String value) {
            addCriterion("invoice_no like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotLike(String value) {
            addCriterion("invoice_no not like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIn(List<String> values) {
            addCriterion("invoice_no in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotIn(List<String> values) {
            addCriterion("invoice_no not in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoBetween(String value1, String value2) {
            addCriterion("invoice_no between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotBetween(String value1, String value2) {
            addCriterion("invoice_no not between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andSysSellWayIdIsNull() {
            addCriterion("sys_sell_way_id is null");
            return (Criteria) this;
        }

        public Criteria andSysSellWayIdIsNotNull() {
            addCriterion("sys_sell_way_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysSellWayIdEqualTo(Integer value) {
            addCriterion("sys_sell_way_id =", value, "sysSellWayId");
            return (Criteria) this;
        }

        public Criteria andSysSellWayIdNotEqualTo(Integer value) {
            addCriterion("sys_sell_way_id <>", value, "sysSellWayId");
            return (Criteria) this;
        }

        public Criteria andSysSellWayIdGreaterThan(Integer value) {
            addCriterion("sys_sell_way_id >", value, "sysSellWayId");
            return (Criteria) this;
        }

        public Criteria andSysSellWayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_sell_way_id >=", value, "sysSellWayId");
            return (Criteria) this;
        }

        public Criteria andSysSellWayIdLessThan(Integer value) {
            addCriterion("sys_sell_way_id <", value, "sysSellWayId");
            return (Criteria) this;
        }

        public Criteria andSysSellWayIdLessThanOrEqualTo(Integer value) {
            addCriterion("sys_sell_way_id <=", value, "sysSellWayId");
            return (Criteria) this;
        }

        public Criteria andSysSellWayIdIn(List<Integer> values) {
            addCriterion("sys_sell_way_id in", values, "sysSellWayId");
            return (Criteria) this;
        }

        public Criteria andSysSellWayIdNotIn(List<Integer> values) {
            addCriterion("sys_sell_way_id not in", values, "sysSellWayId");
            return (Criteria) this;
        }

        public Criteria andSysSellWayIdBetween(Integer value1, Integer value2) {
            addCriterion("sys_sell_way_id between", value1, value2, "sysSellWayId");
            return (Criteria) this;
        }

        public Criteria andSysSellWayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_sell_way_id not between", value1, value2, "sysSellWayId");
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

        public Criteria andActualRetailPriceIsNull() {
            addCriterion("actual_retail_price is null");
            return (Criteria) this;
        }

        public Criteria andActualRetailPriceIsNotNull() {
            addCriterion("actual_retail_price is not null");
            return (Criteria) this;
        }

        public Criteria andActualRetailPriceEqualTo(Float value) {
            addCriterion("actual_retail_price =", value, "actualRetailPrice");
            return (Criteria) this;
        }

        public Criteria andActualRetailPriceNotEqualTo(Float value) {
            addCriterion("actual_retail_price <>", value, "actualRetailPrice");
            return (Criteria) this;
        }

        public Criteria andActualRetailPriceGreaterThan(Float value) {
            addCriterion("actual_retail_price >", value, "actualRetailPrice");
            return (Criteria) this;
        }

        public Criteria andActualRetailPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("actual_retail_price >=", value, "actualRetailPrice");
            return (Criteria) this;
        }

        public Criteria andActualRetailPriceLessThan(Float value) {
            addCriterion("actual_retail_price <", value, "actualRetailPrice");
            return (Criteria) this;
        }

        public Criteria andActualRetailPriceLessThanOrEqualTo(Float value) {
            addCriterion("actual_retail_price <=", value, "actualRetailPrice");
            return (Criteria) this;
        }

        public Criteria andActualRetailPriceIn(List<Float> values) {
            addCriterion("actual_retail_price in", values, "actualRetailPrice");
            return (Criteria) this;
        }

        public Criteria andActualRetailPriceNotIn(List<Float> values) {
            addCriterion("actual_retail_price not in", values, "actualRetailPrice");
            return (Criteria) this;
        }

        public Criteria andActualRetailPriceBetween(Float value1, Float value2) {
            addCriterion("actual_retail_price between", value1, value2, "actualRetailPrice");
            return (Criteria) this;
        }

        public Criteria andActualRetailPriceNotBetween(Float value1, Float value2) {
            addCriterion("actual_retail_price not between", value1, value2, "actualRetailPrice");
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

        public Criteria andIymInventoryIdIsNull() {
            addCriterion("iym_inventory_id is null");
            return (Criteria) this;
        }

        public Criteria andIymInventoryIdIsNotNull() {
            addCriterion("iym_inventory_id is not null");
            return (Criteria) this;
        }

        public Criteria andIymInventoryIdEqualTo(Integer value) {
            addCriterion("iym_inventory_id =", value, "iymInventoryId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryIdNotEqualTo(Integer value) {
            addCriterion("iym_inventory_id <>", value, "iymInventoryId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryIdGreaterThan(Integer value) {
            addCriterion("iym_inventory_id >", value, "iymInventoryId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iym_inventory_id >=", value, "iymInventoryId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryIdLessThan(Integer value) {
            addCriterion("iym_inventory_id <", value, "iymInventoryId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("iym_inventory_id <=", value, "iymInventoryId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryIdIn(List<Integer> values) {
            addCriterion("iym_inventory_id in", values, "iymInventoryId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryIdNotIn(List<Integer> values) {
            addCriterion("iym_inventory_id not in", values, "iymInventoryId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryIdBetween(Integer value1, Integer value2) {
            addCriterion("iym_inventory_id between", value1, value2, "iymInventoryId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iym_inventory_id not between", value1, value2, "iymInventoryId");
            return (Criteria) this;
        }

        public Criteria andPhIsNull() {
            addCriterion("ph is null");
            return (Criteria) this;
        }

        public Criteria andPhIsNotNull() {
            addCriterion("ph is not null");
            return (Criteria) this;
        }

        public Criteria andPhEqualTo(String value) {
            addCriterion("ph =", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotEqualTo(String value) {
            addCriterion("ph <>", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThan(String value) {
            addCriterion("ph >", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThanOrEqualTo(String value) {
            addCriterion("ph >=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThan(String value) {
            addCriterion("ph <", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThanOrEqualTo(String value) {
            addCriterion("ph <=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLike(String value) {
            addCriterion("ph like", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotLike(String value) {
            addCriterion("ph not like", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhIn(List<String> values) {
            addCriterion("ph in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotIn(List<String> values) {
            addCriterion("ph not in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhBetween(String value1, String value2) {
            addCriterion("ph between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotBetween(String value1, String value2) {
            addCriterion("ph not between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andPchIsNull() {
            addCriterion("pch is null");
            return (Criteria) this;
        }

        public Criteria andPchIsNotNull() {
            addCriterion("pch is not null");
            return (Criteria) this;
        }

        public Criteria andPchEqualTo(String value) {
            addCriterion("pch =", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchNotEqualTo(String value) {
            addCriterion("pch <>", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchGreaterThan(String value) {
            addCriterion("pch >", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchGreaterThanOrEqualTo(String value) {
            addCriterion("pch >=", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchLessThan(String value) {
            addCriterion("pch <", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchLessThanOrEqualTo(String value) {
            addCriterion("pch <=", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchLike(String value) {
            addCriterion("pch like", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchNotLike(String value) {
            addCriterion("pch not like", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchIn(List<String> values) {
            addCriterion("pch in", values, "pch");
            return (Criteria) this;
        }

        public Criteria andPchNotIn(List<String> values) {
            addCriterion("pch not in", values, "pch");
            return (Criteria) this;
        }

        public Criteria andPchBetween(String value1, String value2) {
            addCriterion("pch between", value1, value2, "pch");
            return (Criteria) this;
        }

        public Criteria andPchNotBetween(String value1, String value2) {
            addCriterion("pch not between", value1, value2, "pch");
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

        public Criteria andCostPriceIsNull() {
            addCriterion("cost_price is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(Float value) {
            addCriterion("cost_price =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(Float value) {
            addCriterion("cost_price <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(Float value) {
            addCriterion("cost_price >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("cost_price >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(Float value) {
            addCriterion("cost_price <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(Float value) {
            addCriterion("cost_price <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<Float> values) {
            addCriterion("cost_price in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<Float> values) {
            addCriterion("cost_price not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(Float value1, Float value2) {
            addCriterion("cost_price between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(Float value1, Float value2) {
            addCriterion("cost_price not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andProducedDateIsNull() {
            addCriterion("produced_date is null");
            return (Criteria) this;
        }

        public Criteria andProducedDateIsNotNull() {
            addCriterion("produced_date is not null");
            return (Criteria) this;
        }

        public Criteria andProducedDateEqualTo(Date value) {
            addCriterionForJDBCDate("produced_date =", value, "producedDate");
            return (Criteria) this;
        }

        public Criteria andProducedDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("produced_date <>", value, "producedDate");
            return (Criteria) this;
        }

        public Criteria andProducedDateGreaterThan(Date value) {
            addCriterionForJDBCDate("produced_date >", value, "producedDate");
            return (Criteria) this;
        }

        public Criteria andProducedDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("produced_date >=", value, "producedDate");
            return (Criteria) this;
        }

        public Criteria andProducedDateLessThan(Date value) {
            addCriterionForJDBCDate("produced_date <", value, "producedDate");
            return (Criteria) this;
        }

        public Criteria andProducedDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("produced_date <=", value, "producedDate");
            return (Criteria) this;
        }

        public Criteria andProducedDateIn(List<Date> values) {
            addCriterionForJDBCDate("produced_date in", values, "producedDate");
            return (Criteria) this;
        }

        public Criteria andProducedDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("produced_date not in", values, "producedDate");
            return (Criteria) this;
        }

        public Criteria andProducedDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("produced_date between", value1, value2, "producedDate");
            return (Criteria) this;
        }

        public Criteria andProducedDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("produced_date not between", value1, value2, "producedDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIsNull() {
            addCriterion("expiry_date is null");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIsNotNull() {
            addCriterion("expiry_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpiryDateEqualTo(Date value) {
            addCriterionForJDBCDate("expiry_date =", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("expiry_date <>", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("expiry_date >", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expiry_date >=", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateLessThan(Date value) {
            addCriterionForJDBCDate("expiry_date <", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expiry_date <=", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIn(List<Date> values) {
            addCriterionForJDBCDate("expiry_date in", values, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("expiry_date not in", values, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expiry_date between", value1, value2, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expiry_date not between", value1, value2, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andPemSupplierIdIsNull() {
            addCriterion("pem_supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andPemSupplierIdIsNotNull() {
            addCriterion("pem_supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andPemSupplierIdEqualTo(Integer value) {
            addCriterion("pem_supplier_id =", value, "pemSupplierId");
            return (Criteria) this;
        }

        public Criteria andPemSupplierIdNotEqualTo(Integer value) {
            addCriterion("pem_supplier_id <>", value, "pemSupplierId");
            return (Criteria) this;
        }

        public Criteria andPemSupplierIdGreaterThan(Integer value) {
            addCriterion("pem_supplier_id >", value, "pemSupplierId");
            return (Criteria) this;
        }

        public Criteria andPemSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pem_supplier_id >=", value, "pemSupplierId");
            return (Criteria) this;
        }

        public Criteria andPemSupplierIdLessThan(Integer value) {
            addCriterion("pem_supplier_id <", value, "pemSupplierId");
            return (Criteria) this;
        }

        public Criteria andPemSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("pem_supplier_id <=", value, "pemSupplierId");
            return (Criteria) this;
        }

        public Criteria andPemSupplierIdIn(List<Integer> values) {
            addCriterion("pem_supplier_id in", values, "pemSupplierId");
            return (Criteria) this;
        }

        public Criteria andPemSupplierIdNotIn(List<Integer> values) {
            addCriterion("pem_supplier_id not in", values, "pemSupplierId");
            return (Criteria) this;
        }

        public Criteria andPemSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("pem_supplier_id between", value1, value2, "pemSupplierId");
            return (Criteria) this;
        }

        public Criteria andPemSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pem_supplier_id not between", value1, value2, "pemSupplierId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryAddIdIsNull() {
            addCriterion("iym_inventory_add_id is null");
            return (Criteria) this;
        }

        public Criteria andIymInventoryAddIdIsNotNull() {
            addCriterion("iym_inventory_add_id is not null");
            return (Criteria) this;
        }

        public Criteria andIymInventoryAddIdEqualTo(Integer value) {
            addCriterion("iym_inventory_add_id =", value, "iymInventoryAddId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryAddIdNotEqualTo(Integer value) {
            addCriterion("iym_inventory_add_id <>", value, "iymInventoryAddId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryAddIdGreaterThan(Integer value) {
            addCriterion("iym_inventory_add_id >", value, "iymInventoryAddId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryAddIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iym_inventory_add_id >=", value, "iymInventoryAddId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryAddIdLessThan(Integer value) {
            addCriterion("iym_inventory_add_id <", value, "iymInventoryAddId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryAddIdLessThanOrEqualTo(Integer value) {
            addCriterion("iym_inventory_add_id <=", value, "iymInventoryAddId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryAddIdIn(List<Integer> values) {
            addCriterion("iym_inventory_add_id in", values, "iymInventoryAddId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryAddIdNotIn(List<Integer> values) {
            addCriterion("iym_inventory_add_id not in", values, "iymInventoryAddId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryAddIdBetween(Integer value1, Integer value2) {
            addCriterion("iym_inventory_add_id between", value1, value2, "iymInventoryAddId");
            return (Criteria) this;
        }

        public Criteria andIymInventoryAddIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iym_inventory_add_id not between", value1, value2, "iymInventoryAddId");
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

        public Criteria andMemberDiscountRateIsNull() {
            addCriterion("member_discount_rate is null");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountRateIsNotNull() {
            addCriterion("member_discount_rate is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountRateEqualTo(Float value) {
            addCriterion("member_discount_rate =", value, "memberDiscountRate");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountRateNotEqualTo(Float value) {
            addCriterion("member_discount_rate <>", value, "memberDiscountRate");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountRateGreaterThan(Float value) {
            addCriterion("member_discount_rate >", value, "memberDiscountRate");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountRateGreaterThanOrEqualTo(Float value) {
            addCriterion("member_discount_rate >=", value, "memberDiscountRate");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountRateLessThan(Float value) {
            addCriterion("member_discount_rate <", value, "memberDiscountRate");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountRateLessThanOrEqualTo(Float value) {
            addCriterion("member_discount_rate <=", value, "memberDiscountRate");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountRateIn(List<Float> values) {
            addCriterion("member_discount_rate in", values, "memberDiscountRate");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountRateNotIn(List<Float> values) {
            addCriterion("member_discount_rate not in", values, "memberDiscountRate");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountRateBetween(Float value1, Float value2) {
            addCriterion("member_discount_rate between", value1, value2, "memberDiscountRate");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountRateNotBetween(Float value1, Float value2) {
            addCriterion("member_discount_rate not between", value1, value2, "memberDiscountRate");
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

        public Criteria andCashierIdIsNull() {
            addCriterion("cashier_id is null");
            return (Criteria) this;
        }

        public Criteria andCashierIdIsNotNull() {
            addCriterion("cashier_id is not null");
            return (Criteria) this;
        }

        public Criteria andCashierIdEqualTo(Integer value) {
            addCriterion("cashier_id =", value, "cashierId");
            return (Criteria) this;
        }

        public Criteria andCashierIdNotEqualTo(Integer value) {
            addCriterion("cashier_id <>", value, "cashierId");
            return (Criteria) this;
        }

        public Criteria andCashierIdGreaterThan(Integer value) {
            addCriterion("cashier_id >", value, "cashierId");
            return (Criteria) this;
        }

        public Criteria andCashierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cashier_id >=", value, "cashierId");
            return (Criteria) this;
        }

        public Criteria andCashierIdLessThan(Integer value) {
            addCriterion("cashier_id <", value, "cashierId");
            return (Criteria) this;
        }

        public Criteria andCashierIdLessThanOrEqualTo(Integer value) {
            addCriterion("cashier_id <=", value, "cashierId");
            return (Criteria) this;
        }

        public Criteria andCashierIdIn(List<Integer> values) {
            addCriterion("cashier_id in", values, "cashierId");
            return (Criteria) this;
        }

        public Criteria andCashierIdNotIn(List<Integer> values) {
            addCriterion("cashier_id not in", values, "cashierId");
            return (Criteria) this;
        }

        public Criteria andCashierIdBetween(Integer value1, Integer value2) {
            addCriterion("cashier_id between", value1, value2, "cashierId");
            return (Criteria) this;
        }

        public Criteria andCashierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cashier_id not between", value1, value2, "cashierId");
            return (Criteria) this;
        }

        public Criteria andPayStateIsNull() {
            addCriterion("pay_state is null");
            return (Criteria) this;
        }

        public Criteria andPayStateIsNotNull() {
            addCriterion("pay_state is not null");
            return (Criteria) this;
        }

        public Criteria andPayStateEqualTo(Boolean value) {
            addCriterion("pay_state =", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotEqualTo(Boolean value) {
            addCriterion("pay_state <>", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateGreaterThan(Boolean value) {
            addCriterion("pay_state >", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pay_state >=", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLessThan(Boolean value) {
            addCriterion("pay_state <", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLessThanOrEqualTo(Boolean value) {
            addCriterion("pay_state <=", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateIn(List<Boolean> values) {
            addCriterion("pay_state in", values, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotIn(List<Boolean> values) {
            addCriterion("pay_state not in", values, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateBetween(Boolean value1, Boolean value2) {
            addCriterion("pay_state between", value1, value2, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pay_state not between", value1, value2, "payState");
            return (Criteria) this;
        }

        public Criteria andReturnedIsNull() {
            addCriterion("returned is null");
            return (Criteria) this;
        }

        public Criteria andReturnedIsNotNull() {
            addCriterion("returned is not null");
            return (Criteria) this;
        }

        public Criteria andReturnedEqualTo(Boolean value) {
            addCriterion("returned =", value, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedNotEqualTo(Boolean value) {
            addCriterion("returned <>", value, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedGreaterThan(Boolean value) {
            addCriterion("returned >", value, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("returned >=", value, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedLessThan(Boolean value) {
            addCriterion("returned <", value, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedLessThanOrEqualTo(Boolean value) {
            addCriterion("returned <=", value, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedIn(List<Boolean> values) {
            addCriterion("returned in", values, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedNotIn(List<Boolean> values) {
            addCriterion("returned not in", values, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedBetween(Boolean value1, Boolean value2) {
            addCriterion("returned between", value1, value2, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("returned not between", value1, value2, "returned");
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
