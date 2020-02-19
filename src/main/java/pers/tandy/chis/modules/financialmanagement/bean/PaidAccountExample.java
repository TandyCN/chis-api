package pers.tandy.chis.modules.financialmanagement.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaidAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaidAccountExample() {
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

        public Criteria andFlmPayableAccountIdIsNull() {
            addCriterion("flm_payable_account_id is null");
            return (Criteria) this;
        }

        public Criteria andFlmPayableAccountIdIsNotNull() {
            addCriterion("flm_payable_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlmPayableAccountIdEqualTo(Integer value) {
            addCriterion("flm_payable_account_id =", value, "flmPayableAccountId");
            return (Criteria) this;
        }

        public Criteria andFlmPayableAccountIdNotEqualTo(Integer value) {
            addCriterion("flm_payable_account_id <>", value, "flmPayableAccountId");
            return (Criteria) this;
        }

        public Criteria andFlmPayableAccountIdGreaterThan(Integer value) {
            addCriterion("flm_payable_account_id >", value, "flmPayableAccountId");
            return (Criteria) this;
        }

        public Criteria andFlmPayableAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("flm_payable_account_id >=", value, "flmPayableAccountId");
            return (Criteria) this;
        }

        public Criteria andFlmPayableAccountIdLessThan(Integer value) {
            addCriterion("flm_payable_account_id <", value, "flmPayableAccountId");
            return (Criteria) this;
        }

        public Criteria andFlmPayableAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("flm_payable_account_id <=", value, "flmPayableAccountId");
            return (Criteria) this;
        }

        public Criteria andFlmPayableAccountIdIn(List<Integer> values) {
            addCriterion("flm_payable_account_id in", values, "flmPayableAccountId");
            return (Criteria) this;
        }

        public Criteria andFlmPayableAccountIdNotIn(List<Integer> values) {
            addCriterion("flm_payable_account_id not in", values, "flmPayableAccountId");
            return (Criteria) this;
        }

        public Criteria andFlmPayableAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("flm_payable_account_id between", value1, value2, "flmPayableAccountId");
            return (Criteria) this;
        }

        public Criteria andFlmPayableAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("flm_payable_account_id not between", value1, value2, "flmPayableAccountId");
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

        public Criteria andPaidQuantityIsNull() {
            addCriterion("paid_quantity is null");
            return (Criteria) this;
        }

        public Criteria andPaidQuantityIsNotNull() {
            addCriterion("paid_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andPaidQuantityEqualTo(Short value) {
            addCriterion("paid_quantity =", value, "paidQuantity");
            return (Criteria) this;
        }

        public Criteria andPaidQuantityNotEqualTo(Short value) {
            addCriterion("paid_quantity <>", value, "paidQuantity");
            return (Criteria) this;
        }

        public Criteria andPaidQuantityGreaterThan(Short value) {
            addCriterion("paid_quantity >", value, "paidQuantity");
            return (Criteria) this;
        }

        public Criteria andPaidQuantityGreaterThanOrEqualTo(Short value) {
            addCriterion("paid_quantity >=", value, "paidQuantity");
            return (Criteria) this;
        }

        public Criteria andPaidQuantityLessThan(Short value) {
            addCriterion("paid_quantity <", value, "paidQuantity");
            return (Criteria) this;
        }

        public Criteria andPaidQuantityLessThanOrEqualTo(Short value) {
            addCriterion("paid_quantity <=", value, "paidQuantity");
            return (Criteria) this;
        }

        public Criteria andPaidQuantityIn(List<Short> values) {
            addCriterion("paid_quantity in", values, "paidQuantity");
            return (Criteria) this;
        }

        public Criteria andPaidQuantityNotIn(List<Short> values) {
            addCriterion("paid_quantity not in", values, "paidQuantity");
            return (Criteria) this;
        }

        public Criteria andPaidQuantityBetween(Short value1, Short value2) {
            addCriterion("paid_quantity between", value1, value2, "paidQuantity");
            return (Criteria) this;
        }

        public Criteria andPaidQuantityNotBetween(Short value1, Short value2) {
            addCriterion("paid_quantity not between", value1, value2, "paidQuantity");
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

        public Criteria andPaymentNoIsNull() {
            addCriterion("payment_no is null");
            return (Criteria) this;
        }

        public Criteria andPaymentNoIsNotNull() {
            addCriterion("payment_no is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentNoEqualTo(String value) {
            addCriterion("payment_no =", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotEqualTo(String value) {
            addCriterion("payment_no <>", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoGreaterThan(String value) {
            addCriterion("payment_no >", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoGreaterThanOrEqualTo(String value) {
            addCriterion("payment_no >=", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLessThan(String value) {
            addCriterion("payment_no <", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLessThanOrEqualTo(String value) {
            addCriterion("payment_no <=", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLike(String value) {
            addCriterion("payment_no like", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotLike(String value) {
            addCriterion("payment_no not like", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoIn(List<String> values) {
            addCriterion("payment_no in", values, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotIn(List<String> values) {
            addCriterion("payment_no not in", values, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoBetween(String value1, String value2) {
            addCriterion("payment_no between", value1, value2, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotBetween(String value1, String value2) {
            addCriterion("payment_no not between", value1, value2, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPayerIdIsNull() {
            addCriterion("payer_id is null");
            return (Criteria) this;
        }

        public Criteria andPayerIdIsNotNull() {
            addCriterion("payer_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayerIdEqualTo(Integer value) {
            addCriterion("payer_id =", value, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdNotEqualTo(Integer value) {
            addCriterion("payer_id <>", value, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdGreaterThan(Integer value) {
            addCriterion("payer_id >", value, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("payer_id >=", value, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdLessThan(Integer value) {
            addCriterion("payer_id <", value, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdLessThanOrEqualTo(Integer value) {
            addCriterion("payer_id <=", value, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdIn(List<Integer> values) {
            addCriterion("payer_id in", values, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdNotIn(List<Integer> values) {
            addCriterion("payer_id not in", values, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdBetween(Integer value1, Integer value2) {
            addCriterion("payer_id between", value1, value2, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("payer_id not between", value1, value2, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNull() {
            addCriterion("pay_date is null");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNotNull() {
            addCriterion("pay_date is not null");
            return (Criteria) this;
        }

        public Criteria andPayDateEqualTo(Date value) {
            addCriterion("pay_date =", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotEqualTo(Date value) {
            addCriterion("pay_date <>", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThan(Date value) {
            addCriterion("pay_date >", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_date >=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThan(Date value) {
            addCriterion("pay_date <", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThanOrEqualTo(Date value) {
            addCriterion("pay_date <=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateIn(List<Date> values) {
            addCriterion("pay_date in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotIn(List<Date> values) {
            addCriterion("pay_date not in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateBetween(Date value1, Date value2) {
            addCriterion("pay_date between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotBetween(Date value1, Date value2) {
            addCriterion("pay_date not between", value1, value2, "payDate");
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
            addCriterion("approve_date =", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateNotEqualTo(Date value) {
            addCriterion("approve_date <>", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateGreaterThan(Date value) {
            addCriterion("approve_date >", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("approve_date >=", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateLessThan(Date value) {
            addCriterion("approve_date <", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateLessThanOrEqualTo(Date value) {
            addCriterion("approve_date <=", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateIn(List<Date> values) {
            addCriterion("approve_date in", values, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateNotIn(List<Date> values) {
            addCriterion("approve_date not in", values, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateBetween(Date value1, Date value2) {
            addCriterion("approve_date between", value1, value2, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateNotBetween(Date value1, Date value2) {
            addCriterion("approve_date not between", value1, value2, "approveDate");
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