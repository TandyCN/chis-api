package pers.tandy.chis.modules.systemmanagement.bean;

import java.util.ArrayList;
import java.util.List;

public class AuthcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthcExample() {
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

        public Criteria andModuleOrderIsNull() {
            addCriterion("module_order is null");
            return (Criteria) this;
        }

        public Criteria andModuleOrderIsNotNull() {
            addCriterion("module_order is not null");
            return (Criteria) this;
        }

        public Criteria andModuleOrderEqualTo(Integer value) {
            addCriterion("module_order =", value, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderNotEqualTo(Integer value) {
            addCriterion("module_order <>", value, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderGreaterThan(Integer value) {
            addCriterion("module_order >", value, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("module_order >=", value, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderLessThan(Integer value) {
            addCriterion("module_order <", value, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderLessThanOrEqualTo(Integer value) {
            addCriterion("module_order <=", value, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderIn(List<Integer> values) {
            addCriterion("module_order in", values, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderNotIn(List<Integer> values) {
            addCriterion("module_order not in", values, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderBetween(Integer value1, Integer value2) {
            addCriterion("module_order between", value1, value2, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("module_order not between", value1, value2, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNull() {
            addCriterion("module_name is null");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNotNull() {
            addCriterion("module_name is not null");
            return (Criteria) this;
        }

        public Criteria andModuleNameEqualTo(String value) {
            addCriterion("module_name =", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotEqualTo(String value) {
            addCriterion("module_name <>", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThan(String value) {
            addCriterion("module_name >", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("module_name >=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThan(String value) {
            addCriterion("module_name <", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThanOrEqualTo(String value) {
            addCriterion("module_name <=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLike(String value) {
            addCriterion("module_name like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotLike(String value) {
            addCriterion("module_name not like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameIn(List<String> values) {
            addCriterion("module_name in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotIn(List<String> values) {
            addCriterion("module_name not in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameBetween(String value1, String value2) {
            addCriterion("module_name between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotBetween(String value1, String value2) {
            addCriterion("module_name not between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleIndexIsNull() {
            addCriterion("module_index is null");
            return (Criteria) this;
        }

        public Criteria andModuleIndexIsNotNull() {
            addCriterion("module_index is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIndexEqualTo(String value) {
            addCriterion("module_index =", value, "moduleIndex");
            return (Criteria) this;
        }

        public Criteria andModuleIndexNotEqualTo(String value) {
            addCriterion("module_index <>", value, "moduleIndex");
            return (Criteria) this;
        }

        public Criteria andModuleIndexGreaterThan(String value) {
            addCriterion("module_index >", value, "moduleIndex");
            return (Criteria) this;
        }

        public Criteria andModuleIndexGreaterThanOrEqualTo(String value) {
            addCriterion("module_index >=", value, "moduleIndex");
            return (Criteria) this;
        }

        public Criteria andModuleIndexLessThan(String value) {
            addCriterion("module_index <", value, "moduleIndex");
            return (Criteria) this;
        }

        public Criteria andModuleIndexLessThanOrEqualTo(String value) {
            addCriterion("module_index <=", value, "moduleIndex");
            return (Criteria) this;
        }

        public Criteria andModuleIndexLike(String value) {
            addCriterion("module_index like", value, "moduleIndex");
            return (Criteria) this;
        }

        public Criteria andModuleIndexNotLike(String value) {
            addCriterion("module_index not like", value, "moduleIndex");
            return (Criteria) this;
        }

        public Criteria andModuleIndexIn(List<String> values) {
            addCriterion("module_index in", values, "moduleIndex");
            return (Criteria) this;
        }

        public Criteria andModuleIndexNotIn(List<String> values) {
            addCriterion("module_index not in", values, "moduleIndex");
            return (Criteria) this;
        }

        public Criteria andModuleIndexBetween(String value1, String value2) {
            addCriterion("module_index between", value1, value2, "moduleIndex");
            return (Criteria) this;
        }

        public Criteria andModuleIndexNotBetween(String value1, String value2) {
            addCriterion("module_index not between", value1, value2, "moduleIndex");
            return (Criteria) this;
        }

        public Criteria andMenuOrderIsNull() {
            addCriterion("menu_order is null");
            return (Criteria) this;
        }

        public Criteria andMenuOrderIsNotNull() {
            addCriterion("menu_order is not null");
            return (Criteria) this;
        }

        public Criteria andMenuOrderEqualTo(Integer value) {
            addCriterion("menu_order =", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderNotEqualTo(Integer value) {
            addCriterion("menu_order <>", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderGreaterThan(Integer value) {
            addCriterion("menu_order >", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_order >=", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderLessThan(Integer value) {
            addCriterion("menu_order <", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderLessThanOrEqualTo(Integer value) {
            addCriterion("menu_order <=", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderIn(List<Integer> values) {
            addCriterion("menu_order in", values, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderNotIn(List<Integer> values) {
            addCriterion("menu_order not in", values, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderBetween(Integer value1, Integer value2) {
            addCriterion("menu_order between", value1, value2, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_order not between", value1, value2, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("menu_name is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("menu_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("menu_name =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("menu_name <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("menu_name >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("menu_name >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("menu_name <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("menu_name <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("menu_name like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("menu_name not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("menu_name in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("menu_name not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("menu_name between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("menu_name not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuIndexIsNull() {
            addCriterion("menu_index is null");
            return (Criteria) this;
        }

        public Criteria andMenuIndexIsNotNull() {
            addCriterion("menu_index is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIndexEqualTo(String value) {
            addCriterion("menu_index =", value, "menuIndex");
            return (Criteria) this;
        }

        public Criteria andMenuIndexNotEqualTo(String value) {
            addCriterion("menu_index <>", value, "menuIndex");
            return (Criteria) this;
        }

        public Criteria andMenuIndexGreaterThan(String value) {
            addCriterion("menu_index >", value, "menuIndex");
            return (Criteria) this;
        }

        public Criteria andMenuIndexGreaterThanOrEqualTo(String value) {
            addCriterion("menu_index >=", value, "menuIndex");
            return (Criteria) this;
        }

        public Criteria andMenuIndexLessThan(String value) {
            addCriterion("menu_index <", value, "menuIndex");
            return (Criteria) this;
        }

        public Criteria andMenuIndexLessThanOrEqualTo(String value) {
            addCriterion("menu_index <=", value, "menuIndex");
            return (Criteria) this;
        }

        public Criteria andMenuIndexLike(String value) {
            addCriterion("menu_index like", value, "menuIndex");
            return (Criteria) this;
        }

        public Criteria andMenuIndexNotLike(String value) {
            addCriterion("menu_index not like", value, "menuIndex");
            return (Criteria) this;
        }

        public Criteria andMenuIndexIn(List<String> values) {
            addCriterion("menu_index in", values, "menuIndex");
            return (Criteria) this;
        }

        public Criteria andMenuIndexNotIn(List<String> values) {
            addCriterion("menu_index not in", values, "menuIndex");
            return (Criteria) this;
        }

        public Criteria andMenuIndexBetween(String value1, String value2) {
            addCriterion("menu_index between", value1, value2, "menuIndex");
            return (Criteria) this;
        }

        public Criteria andMenuIndexNotBetween(String value1, String value2) {
            addCriterion("menu_index not between", value1, value2, "menuIndex");
            return (Criteria) this;
        }

        public Criteria andPathOrderIsNull() {
            addCriterion("path_order is null");
            return (Criteria) this;
        }

        public Criteria andPathOrderIsNotNull() {
            addCriterion("path_order is not null");
            return (Criteria) this;
        }

        public Criteria andPathOrderEqualTo(Integer value) {
            addCriterion("path_order =", value, "pathOrder");
            return (Criteria) this;
        }

        public Criteria andPathOrderNotEqualTo(Integer value) {
            addCriterion("path_order <>", value, "pathOrder");
            return (Criteria) this;
        }

        public Criteria andPathOrderGreaterThan(Integer value) {
            addCriterion("path_order >", value, "pathOrder");
            return (Criteria) this;
        }

        public Criteria andPathOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("path_order >=", value, "pathOrder");
            return (Criteria) this;
        }

        public Criteria andPathOrderLessThan(Integer value) {
            addCriterion("path_order <", value, "pathOrder");
            return (Criteria) this;
        }

        public Criteria andPathOrderLessThanOrEqualTo(Integer value) {
            addCriterion("path_order <=", value, "pathOrder");
            return (Criteria) this;
        }

        public Criteria andPathOrderIn(List<Integer> values) {
            addCriterion("path_order in", values, "pathOrder");
            return (Criteria) this;
        }

        public Criteria andPathOrderNotIn(List<Integer> values) {
            addCriterion("path_order not in", values, "pathOrder");
            return (Criteria) this;
        }

        public Criteria andPathOrderBetween(Integer value1, Integer value2) {
            addCriterion("path_order between", value1, value2, "pathOrder");
            return (Criteria) this;
        }

        public Criteria andPathOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("path_order not between", value1, value2, "pathOrder");
            return (Criteria) this;
        }

        public Criteria andPathNameIsNull() {
            addCriterion("path_name is null");
            return (Criteria) this;
        }

        public Criteria andPathNameIsNotNull() {
            addCriterion("path_name is not null");
            return (Criteria) this;
        }

        public Criteria andPathNameEqualTo(String value) {
            addCriterion("path_name =", value, "pathName");
            return (Criteria) this;
        }

        public Criteria andPathNameNotEqualTo(String value) {
            addCriterion("path_name <>", value, "pathName");
            return (Criteria) this;
        }

        public Criteria andPathNameGreaterThan(String value) {
            addCriterion("path_name >", value, "pathName");
            return (Criteria) this;
        }

        public Criteria andPathNameGreaterThanOrEqualTo(String value) {
            addCriterion("path_name >=", value, "pathName");
            return (Criteria) this;
        }

        public Criteria andPathNameLessThan(String value) {
            addCriterion("path_name <", value, "pathName");
            return (Criteria) this;
        }

        public Criteria andPathNameLessThanOrEqualTo(String value) {
            addCriterion("path_name <=", value, "pathName");
            return (Criteria) this;
        }

        public Criteria andPathNameLike(String value) {
            addCriterion("path_name like", value, "pathName");
            return (Criteria) this;
        }

        public Criteria andPathNameNotLike(String value) {
            addCriterion("path_name not like", value, "pathName");
            return (Criteria) this;
        }

        public Criteria andPathNameIn(List<String> values) {
            addCriterion("path_name in", values, "pathName");
            return (Criteria) this;
        }

        public Criteria andPathNameNotIn(List<String> values) {
            addCriterion("path_name not in", values, "pathName");
            return (Criteria) this;
        }

        public Criteria andPathNameBetween(String value1, String value2) {
            addCriterion("path_name between", value1, value2, "pathName");
            return (Criteria) this;
        }

        public Criteria andPathNameNotBetween(String value1, String value2) {
            addCriterion("path_name not between", value1, value2, "pathName");
            return (Criteria) this;
        }

        public Criteria andPathIndexIsNull() {
            addCriterion("path_index is null");
            return (Criteria) this;
        }

        public Criteria andPathIndexIsNotNull() {
            addCriterion("path_index is not null");
            return (Criteria) this;
        }

        public Criteria andPathIndexEqualTo(String value) {
            addCriterion("path_index =", value, "pathIndex");
            return (Criteria) this;
        }

        public Criteria andPathIndexNotEqualTo(String value) {
            addCriterion("path_index <>", value, "pathIndex");
            return (Criteria) this;
        }

        public Criteria andPathIndexGreaterThan(String value) {
            addCriterion("path_index >", value, "pathIndex");
            return (Criteria) this;
        }

        public Criteria andPathIndexGreaterThanOrEqualTo(String value) {
            addCriterion("path_index >=", value, "pathIndex");
            return (Criteria) this;
        }

        public Criteria andPathIndexLessThan(String value) {
            addCriterion("path_index <", value, "pathIndex");
            return (Criteria) this;
        }

        public Criteria andPathIndexLessThanOrEqualTo(String value) {
            addCriterion("path_index <=", value, "pathIndex");
            return (Criteria) this;
        }

        public Criteria andPathIndexLike(String value) {
            addCriterion("path_index like", value, "pathIndex");
            return (Criteria) this;
        }

        public Criteria andPathIndexNotLike(String value) {
            addCriterion("path_index not like", value, "pathIndex");
            return (Criteria) this;
        }

        public Criteria andPathIndexIn(List<String> values) {
            addCriterion("path_index in", values, "pathIndex");
            return (Criteria) this;
        }

        public Criteria andPathIndexNotIn(List<String> values) {
            addCriterion("path_index not in", values, "pathIndex");
            return (Criteria) this;
        }

        public Criteria andPathIndexBetween(String value1, String value2) {
            addCriterion("path_index between", value1, value2, "pathIndex");
            return (Criteria) this;
        }

        public Criteria andPathIndexNotBetween(String value1, String value2) {
            addCriterion("path_index not between", value1, value2, "pathIndex");
            return (Criteria) this;
        }

        public Criteria andRoleNamesIsNull() {
            addCriterion("role_names is null");
            return (Criteria) this;
        }

        public Criteria andRoleNamesIsNotNull() {
            addCriterion("role_names is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNamesEqualTo(String value) {
            addCriterion("role_names =", value, "roleNames");
            return (Criteria) this;
        }

        public Criteria andRoleNamesNotEqualTo(String value) {
            addCriterion("role_names <>", value, "roleNames");
            return (Criteria) this;
        }

        public Criteria andRoleNamesGreaterThan(String value) {
            addCriterion("role_names >", value, "roleNames");
            return (Criteria) this;
        }

        public Criteria andRoleNamesGreaterThanOrEqualTo(String value) {
            addCriterion("role_names >=", value, "roleNames");
            return (Criteria) this;
        }

        public Criteria andRoleNamesLessThan(String value) {
            addCriterion("role_names <", value, "roleNames");
            return (Criteria) this;
        }

        public Criteria andRoleNamesLessThanOrEqualTo(String value) {
            addCriterion("role_names <=", value, "roleNames");
            return (Criteria) this;
        }

        public Criteria andRoleNamesLike(String value) {
            addCriterion("role_names like", value, "roleNames");
            return (Criteria) this;
        }

        public Criteria andRoleNamesNotLike(String value) {
            addCriterion("role_names not like", value, "roleNames");
            return (Criteria) this;
        }

        public Criteria andRoleNamesIn(List<String> values) {
            addCriterion("role_names in", values, "roleNames");
            return (Criteria) this;
        }

        public Criteria andRoleNamesNotIn(List<String> values) {
            addCriterion("role_names not in", values, "roleNames");
            return (Criteria) this;
        }

        public Criteria andRoleNamesBetween(String value1, String value2) {
            addCriterion("role_names between", value1, value2, "roleNames");
            return (Criteria) this;
        }

        public Criteria andRoleNamesNotBetween(String value1, String value2) {
            addCriterion("role_names not between", value1, value2, "roleNames");
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