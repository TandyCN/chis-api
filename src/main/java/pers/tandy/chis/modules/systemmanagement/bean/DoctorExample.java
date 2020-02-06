package pers.tandy.chis.modules.systemmanagement.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DoctorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andSysClinicRoomIdIsNull() {
            addCriterion("sys_clinic_room_id is null");
            return (Criteria) this;
        }

        public Criteria andSysClinicRoomIdIsNotNull() {
            addCriterion("sys_clinic_room_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysClinicRoomIdEqualTo(Integer value) {
            addCriterion("sys_clinic_room_id =", value, "sysClinicRoomId");
            return (Criteria) this;
        }

        public Criteria andSysClinicRoomIdNotEqualTo(Integer value) {
            addCriterion("sys_clinic_room_id <>", value, "sysClinicRoomId");
            return (Criteria) this;
        }

        public Criteria andSysClinicRoomIdGreaterThan(Integer value) {
            addCriterion("sys_clinic_room_id >", value, "sysClinicRoomId");
            return (Criteria) this;
        }

        public Criteria andSysClinicRoomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_clinic_room_id >=", value, "sysClinicRoomId");
            return (Criteria) this;
        }

        public Criteria andSysClinicRoomIdLessThan(Integer value) {
            addCriterion("sys_clinic_room_id <", value, "sysClinicRoomId");
            return (Criteria) this;
        }

        public Criteria andSysClinicRoomIdLessThanOrEqualTo(Integer value) {
            addCriterion("sys_clinic_room_id <=", value, "sysClinicRoomId");
            return (Criteria) this;
        }

        public Criteria andSysClinicRoomIdIn(List<Integer> values) {
            addCriterion("sys_clinic_room_id in", values, "sysClinicRoomId");
            return (Criteria) this;
        }

        public Criteria andSysClinicRoomIdNotIn(List<Integer> values) {
            addCriterion("sys_clinic_room_id not in", values, "sysClinicRoomId");
            return (Criteria) this;
        }

        public Criteria andSysClinicRoomIdBetween(Integer value1, Integer value2) {
            addCriterion("sys_clinic_room_id between", value1, value2, "sysClinicRoomId");
            return (Criteria) this;
        }

        public Criteria andSysClinicRoomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_clinic_room_id not between", value1, value2, "sysClinicRoomId");
            return (Criteria) this;
        }

        public Criteria andMonBeginTimeIsNull() {
            addCriterion("mon_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andMonBeginTimeIsNotNull() {
            addCriterion("mon_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andMonBeginTimeEqualTo(Date value) {
            addCriterionForJDBCTime("mon_begin_time =", value, "monBeginTime");
            return (Criteria) this;
        }

        public Criteria andMonBeginTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("mon_begin_time <>", value, "monBeginTime");
            return (Criteria) this;
        }

        public Criteria andMonBeginTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("mon_begin_time >", value, "monBeginTime");
            return (Criteria) this;
        }

        public Criteria andMonBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("mon_begin_time >=", value, "monBeginTime");
            return (Criteria) this;
        }

        public Criteria andMonBeginTimeLessThan(Date value) {
            addCriterionForJDBCTime("mon_begin_time <", value, "monBeginTime");
            return (Criteria) this;
        }

        public Criteria andMonBeginTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("mon_begin_time <=", value, "monBeginTime");
            return (Criteria) this;
        }

        public Criteria andMonBeginTimeIn(List<Date> values) {
            addCriterionForJDBCTime("mon_begin_time in", values, "monBeginTime");
            return (Criteria) this;
        }

        public Criteria andMonBeginTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("mon_begin_time not in", values, "monBeginTime");
            return (Criteria) this;
        }

        public Criteria andMonBeginTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("mon_begin_time between", value1, value2, "monBeginTime");
            return (Criteria) this;
        }

        public Criteria andMonBeginTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("mon_begin_time not between", value1, value2, "monBeginTime");
            return (Criteria) this;
        }

        public Criteria andMonEndTimeIsNull() {
            addCriterion("mon_end_time is null");
            return (Criteria) this;
        }

        public Criteria andMonEndTimeIsNotNull() {
            addCriterion("mon_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andMonEndTimeEqualTo(Date value) {
            addCriterionForJDBCTime("mon_end_time =", value, "monEndTime");
            return (Criteria) this;
        }

        public Criteria andMonEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("mon_end_time <>", value, "monEndTime");
            return (Criteria) this;
        }

        public Criteria andMonEndTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("mon_end_time >", value, "monEndTime");
            return (Criteria) this;
        }

        public Criteria andMonEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("mon_end_time >=", value, "monEndTime");
            return (Criteria) this;
        }

        public Criteria andMonEndTimeLessThan(Date value) {
            addCriterionForJDBCTime("mon_end_time <", value, "monEndTime");
            return (Criteria) this;
        }

        public Criteria andMonEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("mon_end_time <=", value, "monEndTime");
            return (Criteria) this;
        }

        public Criteria andMonEndTimeIn(List<Date> values) {
            addCriterionForJDBCTime("mon_end_time in", values, "monEndTime");
            return (Criteria) this;
        }

        public Criteria andMonEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("mon_end_time not in", values, "monEndTime");
            return (Criteria) this;
        }

        public Criteria andMonEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("mon_end_time between", value1, value2, "monEndTime");
            return (Criteria) this;
        }

        public Criteria andMonEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("mon_end_time not between", value1, value2, "monEndTime");
            return (Criteria) this;
        }

        public Criteria andMonNoIsNull() {
            addCriterion("mon_no is null");
            return (Criteria) this;
        }

        public Criteria andMonNoIsNotNull() {
            addCriterion("mon_no is not null");
            return (Criteria) this;
        }

        public Criteria andMonNoEqualTo(Short value) {
            addCriterion("mon_no =", value, "monNo");
            return (Criteria) this;
        }

        public Criteria andMonNoNotEqualTo(Short value) {
            addCriterion("mon_no <>", value, "monNo");
            return (Criteria) this;
        }

        public Criteria andMonNoGreaterThan(Short value) {
            addCriterion("mon_no >", value, "monNo");
            return (Criteria) this;
        }

        public Criteria andMonNoGreaterThanOrEqualTo(Short value) {
            addCriterion("mon_no >=", value, "monNo");
            return (Criteria) this;
        }

        public Criteria andMonNoLessThan(Short value) {
            addCriterion("mon_no <", value, "monNo");
            return (Criteria) this;
        }

        public Criteria andMonNoLessThanOrEqualTo(Short value) {
            addCriterion("mon_no <=", value, "monNo");
            return (Criteria) this;
        }

        public Criteria andMonNoIn(List<Short> values) {
            addCriterion("mon_no in", values, "monNo");
            return (Criteria) this;
        }

        public Criteria andMonNoNotIn(List<Short> values) {
            addCriterion("mon_no not in", values, "monNo");
            return (Criteria) this;
        }

        public Criteria andMonNoBetween(Short value1, Short value2) {
            addCriterion("mon_no between", value1, value2, "monNo");
            return (Criteria) this;
        }

        public Criteria andMonNoNotBetween(Short value1, Short value2) {
            addCriterion("mon_no not between", value1, value2, "monNo");
            return (Criteria) this;
        }

        public Criteria andTueBeginTimeIsNull() {
            addCriterion("tue_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andTueBeginTimeIsNotNull() {
            addCriterion("tue_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andTueBeginTimeEqualTo(Date value) {
            addCriterionForJDBCTime("tue_begin_time =", value, "tueBeginTime");
            return (Criteria) this;
        }

        public Criteria andTueBeginTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("tue_begin_time <>", value, "tueBeginTime");
            return (Criteria) this;
        }

        public Criteria andTueBeginTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("tue_begin_time >", value, "tueBeginTime");
            return (Criteria) this;
        }

        public Criteria andTueBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("tue_begin_time >=", value, "tueBeginTime");
            return (Criteria) this;
        }

        public Criteria andTueBeginTimeLessThan(Date value) {
            addCriterionForJDBCTime("tue_begin_time <", value, "tueBeginTime");
            return (Criteria) this;
        }

        public Criteria andTueBeginTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("tue_begin_time <=", value, "tueBeginTime");
            return (Criteria) this;
        }

        public Criteria andTueBeginTimeIn(List<Date> values) {
            addCriterionForJDBCTime("tue_begin_time in", values, "tueBeginTime");
            return (Criteria) this;
        }

        public Criteria andTueBeginTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("tue_begin_time not in", values, "tueBeginTime");
            return (Criteria) this;
        }

        public Criteria andTueBeginTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("tue_begin_time between", value1, value2, "tueBeginTime");
            return (Criteria) this;
        }

        public Criteria andTueBeginTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("tue_begin_time not between", value1, value2, "tueBeginTime");
            return (Criteria) this;
        }

        public Criteria andTueEndTimeIsNull() {
            addCriterion("tue_end_time is null");
            return (Criteria) this;
        }

        public Criteria andTueEndTimeIsNotNull() {
            addCriterion("tue_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andTueEndTimeEqualTo(Date value) {
            addCriterionForJDBCTime("tue_end_time =", value, "tueEndTime");
            return (Criteria) this;
        }

        public Criteria andTueEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("tue_end_time <>", value, "tueEndTime");
            return (Criteria) this;
        }

        public Criteria andTueEndTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("tue_end_time >", value, "tueEndTime");
            return (Criteria) this;
        }

        public Criteria andTueEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("tue_end_time >=", value, "tueEndTime");
            return (Criteria) this;
        }

        public Criteria andTueEndTimeLessThan(Date value) {
            addCriterionForJDBCTime("tue_end_time <", value, "tueEndTime");
            return (Criteria) this;
        }

        public Criteria andTueEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("tue_end_time <=", value, "tueEndTime");
            return (Criteria) this;
        }

        public Criteria andTueEndTimeIn(List<Date> values) {
            addCriterionForJDBCTime("tue_end_time in", values, "tueEndTime");
            return (Criteria) this;
        }

        public Criteria andTueEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("tue_end_time not in", values, "tueEndTime");
            return (Criteria) this;
        }

        public Criteria andTueEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("tue_end_time between", value1, value2, "tueEndTime");
            return (Criteria) this;
        }

        public Criteria andTueEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("tue_end_time not between", value1, value2, "tueEndTime");
            return (Criteria) this;
        }

        public Criteria andTueNoIsNull() {
            addCriterion("tue_no is null");
            return (Criteria) this;
        }

        public Criteria andTueNoIsNotNull() {
            addCriterion("tue_no is not null");
            return (Criteria) this;
        }

        public Criteria andTueNoEqualTo(Short value) {
            addCriterion("tue_no =", value, "tueNo");
            return (Criteria) this;
        }

        public Criteria andTueNoNotEqualTo(Short value) {
            addCriterion("tue_no <>", value, "tueNo");
            return (Criteria) this;
        }

        public Criteria andTueNoGreaterThan(Short value) {
            addCriterion("tue_no >", value, "tueNo");
            return (Criteria) this;
        }

        public Criteria andTueNoGreaterThanOrEqualTo(Short value) {
            addCriterion("tue_no >=", value, "tueNo");
            return (Criteria) this;
        }

        public Criteria andTueNoLessThan(Short value) {
            addCriterion("tue_no <", value, "tueNo");
            return (Criteria) this;
        }

        public Criteria andTueNoLessThanOrEqualTo(Short value) {
            addCriterion("tue_no <=", value, "tueNo");
            return (Criteria) this;
        }

        public Criteria andTueNoIn(List<Short> values) {
            addCriterion("tue_no in", values, "tueNo");
            return (Criteria) this;
        }

        public Criteria andTueNoNotIn(List<Short> values) {
            addCriterion("tue_no not in", values, "tueNo");
            return (Criteria) this;
        }

        public Criteria andTueNoBetween(Short value1, Short value2) {
            addCriterion("tue_no between", value1, value2, "tueNo");
            return (Criteria) this;
        }

        public Criteria andTueNoNotBetween(Short value1, Short value2) {
            addCriterion("tue_no not between", value1, value2, "tueNo");
            return (Criteria) this;
        }

        public Criteria andWedBeginTimeIsNull() {
            addCriterion("wed_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andWedBeginTimeIsNotNull() {
            addCriterion("wed_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andWedBeginTimeEqualTo(Date value) {
            addCriterionForJDBCTime("wed_begin_time =", value, "wedBeginTime");
            return (Criteria) this;
        }

        public Criteria andWedBeginTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("wed_begin_time <>", value, "wedBeginTime");
            return (Criteria) this;
        }

        public Criteria andWedBeginTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("wed_begin_time >", value, "wedBeginTime");
            return (Criteria) this;
        }

        public Criteria andWedBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("wed_begin_time >=", value, "wedBeginTime");
            return (Criteria) this;
        }

        public Criteria andWedBeginTimeLessThan(Date value) {
            addCriterionForJDBCTime("wed_begin_time <", value, "wedBeginTime");
            return (Criteria) this;
        }

        public Criteria andWedBeginTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("wed_begin_time <=", value, "wedBeginTime");
            return (Criteria) this;
        }

        public Criteria andWedBeginTimeIn(List<Date> values) {
            addCriterionForJDBCTime("wed_begin_time in", values, "wedBeginTime");
            return (Criteria) this;
        }

        public Criteria andWedBeginTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("wed_begin_time not in", values, "wedBeginTime");
            return (Criteria) this;
        }

        public Criteria andWedBeginTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("wed_begin_time between", value1, value2, "wedBeginTime");
            return (Criteria) this;
        }

        public Criteria andWedBeginTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("wed_begin_time not between", value1, value2, "wedBeginTime");
            return (Criteria) this;
        }

        public Criteria andWedEndTimeIsNull() {
            addCriterion("wed_end_time is null");
            return (Criteria) this;
        }

        public Criteria andWedEndTimeIsNotNull() {
            addCriterion("wed_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andWedEndTimeEqualTo(Date value) {
            addCriterionForJDBCTime("wed_end_time =", value, "wedEndTime");
            return (Criteria) this;
        }

        public Criteria andWedEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("wed_end_time <>", value, "wedEndTime");
            return (Criteria) this;
        }

        public Criteria andWedEndTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("wed_end_time >", value, "wedEndTime");
            return (Criteria) this;
        }

        public Criteria andWedEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("wed_end_time >=", value, "wedEndTime");
            return (Criteria) this;
        }

        public Criteria andWedEndTimeLessThan(Date value) {
            addCriterionForJDBCTime("wed_end_time <", value, "wedEndTime");
            return (Criteria) this;
        }

        public Criteria andWedEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("wed_end_time <=", value, "wedEndTime");
            return (Criteria) this;
        }

        public Criteria andWedEndTimeIn(List<Date> values) {
            addCriterionForJDBCTime("wed_end_time in", values, "wedEndTime");
            return (Criteria) this;
        }

        public Criteria andWedEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("wed_end_time not in", values, "wedEndTime");
            return (Criteria) this;
        }

        public Criteria andWedEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("wed_end_time between", value1, value2, "wedEndTime");
            return (Criteria) this;
        }

        public Criteria andWedEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("wed_end_time not between", value1, value2, "wedEndTime");
            return (Criteria) this;
        }

        public Criteria andWedNoIsNull() {
            addCriterion("wed_no is null");
            return (Criteria) this;
        }

        public Criteria andWedNoIsNotNull() {
            addCriterion("wed_no is not null");
            return (Criteria) this;
        }

        public Criteria andWedNoEqualTo(Short value) {
            addCriterion("wed_no =", value, "wedNo");
            return (Criteria) this;
        }

        public Criteria andWedNoNotEqualTo(Short value) {
            addCriterion("wed_no <>", value, "wedNo");
            return (Criteria) this;
        }

        public Criteria andWedNoGreaterThan(Short value) {
            addCriterion("wed_no >", value, "wedNo");
            return (Criteria) this;
        }

        public Criteria andWedNoGreaterThanOrEqualTo(Short value) {
            addCriterion("wed_no >=", value, "wedNo");
            return (Criteria) this;
        }

        public Criteria andWedNoLessThan(Short value) {
            addCriterion("wed_no <", value, "wedNo");
            return (Criteria) this;
        }

        public Criteria andWedNoLessThanOrEqualTo(Short value) {
            addCriterion("wed_no <=", value, "wedNo");
            return (Criteria) this;
        }

        public Criteria andWedNoIn(List<Short> values) {
            addCriterion("wed_no in", values, "wedNo");
            return (Criteria) this;
        }

        public Criteria andWedNoNotIn(List<Short> values) {
            addCriterion("wed_no not in", values, "wedNo");
            return (Criteria) this;
        }

        public Criteria andWedNoBetween(Short value1, Short value2) {
            addCriterion("wed_no between", value1, value2, "wedNo");
            return (Criteria) this;
        }

        public Criteria andWedNoNotBetween(Short value1, Short value2) {
            addCriterion("wed_no not between", value1, value2, "wedNo");
            return (Criteria) this;
        }

        public Criteria andThuBeginTimeIsNull() {
            addCriterion("thu_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andThuBeginTimeIsNotNull() {
            addCriterion("thu_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andThuBeginTimeEqualTo(Date value) {
            addCriterionForJDBCTime("thu_begin_time =", value, "thuBeginTime");
            return (Criteria) this;
        }

        public Criteria andThuBeginTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("thu_begin_time <>", value, "thuBeginTime");
            return (Criteria) this;
        }

        public Criteria andThuBeginTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("thu_begin_time >", value, "thuBeginTime");
            return (Criteria) this;
        }

        public Criteria andThuBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("thu_begin_time >=", value, "thuBeginTime");
            return (Criteria) this;
        }

        public Criteria andThuBeginTimeLessThan(Date value) {
            addCriterionForJDBCTime("thu_begin_time <", value, "thuBeginTime");
            return (Criteria) this;
        }

        public Criteria andThuBeginTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("thu_begin_time <=", value, "thuBeginTime");
            return (Criteria) this;
        }

        public Criteria andThuBeginTimeIn(List<Date> values) {
            addCriterionForJDBCTime("thu_begin_time in", values, "thuBeginTime");
            return (Criteria) this;
        }

        public Criteria andThuBeginTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("thu_begin_time not in", values, "thuBeginTime");
            return (Criteria) this;
        }

        public Criteria andThuBeginTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("thu_begin_time between", value1, value2, "thuBeginTime");
            return (Criteria) this;
        }

        public Criteria andThuBeginTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("thu_begin_time not between", value1, value2, "thuBeginTime");
            return (Criteria) this;
        }

        public Criteria andThuEndTimeIsNull() {
            addCriterion("thu_end_time is null");
            return (Criteria) this;
        }

        public Criteria andThuEndTimeIsNotNull() {
            addCriterion("thu_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andThuEndTimeEqualTo(Date value) {
            addCriterionForJDBCTime("thu_end_time =", value, "thuEndTime");
            return (Criteria) this;
        }

        public Criteria andThuEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("thu_end_time <>", value, "thuEndTime");
            return (Criteria) this;
        }

        public Criteria andThuEndTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("thu_end_time >", value, "thuEndTime");
            return (Criteria) this;
        }

        public Criteria andThuEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("thu_end_time >=", value, "thuEndTime");
            return (Criteria) this;
        }

        public Criteria andThuEndTimeLessThan(Date value) {
            addCriterionForJDBCTime("thu_end_time <", value, "thuEndTime");
            return (Criteria) this;
        }

        public Criteria andThuEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("thu_end_time <=", value, "thuEndTime");
            return (Criteria) this;
        }

        public Criteria andThuEndTimeIn(List<Date> values) {
            addCriterionForJDBCTime("thu_end_time in", values, "thuEndTime");
            return (Criteria) this;
        }

        public Criteria andThuEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("thu_end_time not in", values, "thuEndTime");
            return (Criteria) this;
        }

        public Criteria andThuEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("thu_end_time between", value1, value2, "thuEndTime");
            return (Criteria) this;
        }

        public Criteria andThuEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("thu_end_time not between", value1, value2, "thuEndTime");
            return (Criteria) this;
        }

        public Criteria andThuNoIsNull() {
            addCriterion("thu_no is null");
            return (Criteria) this;
        }

        public Criteria andThuNoIsNotNull() {
            addCriterion("thu_no is not null");
            return (Criteria) this;
        }

        public Criteria andThuNoEqualTo(Short value) {
            addCriterion("thu_no =", value, "thuNo");
            return (Criteria) this;
        }

        public Criteria andThuNoNotEqualTo(Short value) {
            addCriterion("thu_no <>", value, "thuNo");
            return (Criteria) this;
        }

        public Criteria andThuNoGreaterThan(Short value) {
            addCriterion("thu_no >", value, "thuNo");
            return (Criteria) this;
        }

        public Criteria andThuNoGreaterThanOrEqualTo(Short value) {
            addCriterion("thu_no >=", value, "thuNo");
            return (Criteria) this;
        }

        public Criteria andThuNoLessThan(Short value) {
            addCriterion("thu_no <", value, "thuNo");
            return (Criteria) this;
        }

        public Criteria andThuNoLessThanOrEqualTo(Short value) {
            addCriterion("thu_no <=", value, "thuNo");
            return (Criteria) this;
        }

        public Criteria andThuNoIn(List<Short> values) {
            addCriterion("thu_no in", values, "thuNo");
            return (Criteria) this;
        }

        public Criteria andThuNoNotIn(List<Short> values) {
            addCriterion("thu_no not in", values, "thuNo");
            return (Criteria) this;
        }

        public Criteria andThuNoBetween(Short value1, Short value2) {
            addCriterion("thu_no between", value1, value2, "thuNo");
            return (Criteria) this;
        }

        public Criteria andThuNoNotBetween(Short value1, Short value2) {
            addCriterion("thu_no not between", value1, value2, "thuNo");
            return (Criteria) this;
        }

        public Criteria andFriBeginTimeIsNull() {
            addCriterion("fri_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andFriBeginTimeIsNotNull() {
            addCriterion("fri_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andFriBeginTimeEqualTo(Date value) {
            addCriterionForJDBCTime("fri_begin_time =", value, "friBeginTime");
            return (Criteria) this;
        }

        public Criteria andFriBeginTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("fri_begin_time <>", value, "friBeginTime");
            return (Criteria) this;
        }

        public Criteria andFriBeginTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("fri_begin_time >", value, "friBeginTime");
            return (Criteria) this;
        }

        public Criteria andFriBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("fri_begin_time >=", value, "friBeginTime");
            return (Criteria) this;
        }

        public Criteria andFriBeginTimeLessThan(Date value) {
            addCriterionForJDBCTime("fri_begin_time <", value, "friBeginTime");
            return (Criteria) this;
        }

        public Criteria andFriBeginTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("fri_begin_time <=", value, "friBeginTime");
            return (Criteria) this;
        }

        public Criteria andFriBeginTimeIn(List<Date> values) {
            addCriterionForJDBCTime("fri_begin_time in", values, "friBeginTime");
            return (Criteria) this;
        }

        public Criteria andFriBeginTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("fri_begin_time not in", values, "friBeginTime");
            return (Criteria) this;
        }

        public Criteria andFriBeginTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("fri_begin_time between", value1, value2, "friBeginTime");
            return (Criteria) this;
        }

        public Criteria andFriBeginTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("fri_begin_time not between", value1, value2, "friBeginTime");
            return (Criteria) this;
        }

        public Criteria andFriEndTimeIsNull() {
            addCriterion("fri_end_time is null");
            return (Criteria) this;
        }

        public Criteria andFriEndTimeIsNotNull() {
            addCriterion("fri_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andFriEndTimeEqualTo(Date value) {
            addCriterionForJDBCTime("fri_end_time =", value, "friEndTime");
            return (Criteria) this;
        }

        public Criteria andFriEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("fri_end_time <>", value, "friEndTime");
            return (Criteria) this;
        }

        public Criteria andFriEndTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("fri_end_time >", value, "friEndTime");
            return (Criteria) this;
        }

        public Criteria andFriEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("fri_end_time >=", value, "friEndTime");
            return (Criteria) this;
        }

        public Criteria andFriEndTimeLessThan(Date value) {
            addCriterionForJDBCTime("fri_end_time <", value, "friEndTime");
            return (Criteria) this;
        }

        public Criteria andFriEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("fri_end_time <=", value, "friEndTime");
            return (Criteria) this;
        }

        public Criteria andFriEndTimeIn(List<Date> values) {
            addCriterionForJDBCTime("fri_end_time in", values, "friEndTime");
            return (Criteria) this;
        }

        public Criteria andFriEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("fri_end_time not in", values, "friEndTime");
            return (Criteria) this;
        }

        public Criteria andFriEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("fri_end_time between", value1, value2, "friEndTime");
            return (Criteria) this;
        }

        public Criteria andFriEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("fri_end_time not between", value1, value2, "friEndTime");
            return (Criteria) this;
        }

        public Criteria andFriNoIsNull() {
            addCriterion("fri_no is null");
            return (Criteria) this;
        }

        public Criteria andFriNoIsNotNull() {
            addCriterion("fri_no is not null");
            return (Criteria) this;
        }

        public Criteria andFriNoEqualTo(Short value) {
            addCriterion("fri_no =", value, "friNo");
            return (Criteria) this;
        }

        public Criteria andFriNoNotEqualTo(Short value) {
            addCriterion("fri_no <>", value, "friNo");
            return (Criteria) this;
        }

        public Criteria andFriNoGreaterThan(Short value) {
            addCriterion("fri_no >", value, "friNo");
            return (Criteria) this;
        }

        public Criteria andFriNoGreaterThanOrEqualTo(Short value) {
            addCriterion("fri_no >=", value, "friNo");
            return (Criteria) this;
        }

        public Criteria andFriNoLessThan(Short value) {
            addCriterion("fri_no <", value, "friNo");
            return (Criteria) this;
        }

        public Criteria andFriNoLessThanOrEqualTo(Short value) {
            addCriterion("fri_no <=", value, "friNo");
            return (Criteria) this;
        }

        public Criteria andFriNoIn(List<Short> values) {
            addCriterion("fri_no in", values, "friNo");
            return (Criteria) this;
        }

        public Criteria andFriNoNotIn(List<Short> values) {
            addCriterion("fri_no not in", values, "friNo");
            return (Criteria) this;
        }

        public Criteria andFriNoBetween(Short value1, Short value2) {
            addCriterion("fri_no between", value1, value2, "friNo");
            return (Criteria) this;
        }

        public Criteria andFriNoNotBetween(Short value1, Short value2) {
            addCriterion("fri_no not between", value1, value2, "friNo");
            return (Criteria) this;
        }

        public Criteria andSatBeginTimeIsNull() {
            addCriterion("sat_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andSatBeginTimeIsNotNull() {
            addCriterion("sat_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andSatBeginTimeEqualTo(Date value) {
            addCriterionForJDBCTime("sat_begin_time =", value, "satBeginTime");
            return (Criteria) this;
        }

        public Criteria andSatBeginTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("sat_begin_time <>", value, "satBeginTime");
            return (Criteria) this;
        }

        public Criteria andSatBeginTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("sat_begin_time >", value, "satBeginTime");
            return (Criteria) this;
        }

        public Criteria andSatBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("sat_begin_time >=", value, "satBeginTime");
            return (Criteria) this;
        }

        public Criteria andSatBeginTimeLessThan(Date value) {
            addCriterionForJDBCTime("sat_begin_time <", value, "satBeginTime");
            return (Criteria) this;
        }

        public Criteria andSatBeginTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("sat_begin_time <=", value, "satBeginTime");
            return (Criteria) this;
        }

        public Criteria andSatBeginTimeIn(List<Date> values) {
            addCriterionForJDBCTime("sat_begin_time in", values, "satBeginTime");
            return (Criteria) this;
        }

        public Criteria andSatBeginTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("sat_begin_time not in", values, "satBeginTime");
            return (Criteria) this;
        }

        public Criteria andSatBeginTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("sat_begin_time between", value1, value2, "satBeginTime");
            return (Criteria) this;
        }

        public Criteria andSatBeginTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("sat_begin_time not between", value1, value2, "satBeginTime");
            return (Criteria) this;
        }

        public Criteria andSatEndTimeIsNull() {
            addCriterion("sat_end_time is null");
            return (Criteria) this;
        }

        public Criteria andSatEndTimeIsNotNull() {
            addCriterion("sat_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andSatEndTimeEqualTo(Date value) {
            addCriterionForJDBCTime("sat_end_time =", value, "satEndTime");
            return (Criteria) this;
        }

        public Criteria andSatEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("sat_end_time <>", value, "satEndTime");
            return (Criteria) this;
        }

        public Criteria andSatEndTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("sat_end_time >", value, "satEndTime");
            return (Criteria) this;
        }

        public Criteria andSatEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("sat_end_time >=", value, "satEndTime");
            return (Criteria) this;
        }

        public Criteria andSatEndTimeLessThan(Date value) {
            addCriterionForJDBCTime("sat_end_time <", value, "satEndTime");
            return (Criteria) this;
        }

        public Criteria andSatEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("sat_end_time <=", value, "satEndTime");
            return (Criteria) this;
        }

        public Criteria andSatEndTimeIn(List<Date> values) {
            addCriterionForJDBCTime("sat_end_time in", values, "satEndTime");
            return (Criteria) this;
        }

        public Criteria andSatEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("sat_end_time not in", values, "satEndTime");
            return (Criteria) this;
        }

        public Criteria andSatEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("sat_end_time between", value1, value2, "satEndTime");
            return (Criteria) this;
        }

        public Criteria andSatEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("sat_end_time not between", value1, value2, "satEndTime");
            return (Criteria) this;
        }

        public Criteria andSatNoIsNull() {
            addCriterion("sat_no is null");
            return (Criteria) this;
        }

        public Criteria andSatNoIsNotNull() {
            addCriterion("sat_no is not null");
            return (Criteria) this;
        }

        public Criteria andSatNoEqualTo(Short value) {
            addCriterion("sat_no =", value, "satNo");
            return (Criteria) this;
        }

        public Criteria andSatNoNotEqualTo(Short value) {
            addCriterion("sat_no <>", value, "satNo");
            return (Criteria) this;
        }

        public Criteria andSatNoGreaterThan(Short value) {
            addCriterion("sat_no >", value, "satNo");
            return (Criteria) this;
        }

        public Criteria andSatNoGreaterThanOrEqualTo(Short value) {
            addCriterion("sat_no >=", value, "satNo");
            return (Criteria) this;
        }

        public Criteria andSatNoLessThan(Short value) {
            addCriterion("sat_no <", value, "satNo");
            return (Criteria) this;
        }

        public Criteria andSatNoLessThanOrEqualTo(Short value) {
            addCriterion("sat_no <=", value, "satNo");
            return (Criteria) this;
        }

        public Criteria andSatNoIn(List<Short> values) {
            addCriterion("sat_no in", values, "satNo");
            return (Criteria) this;
        }

        public Criteria andSatNoNotIn(List<Short> values) {
            addCriterion("sat_no not in", values, "satNo");
            return (Criteria) this;
        }

        public Criteria andSatNoBetween(Short value1, Short value2) {
            addCriterion("sat_no between", value1, value2, "satNo");
            return (Criteria) this;
        }

        public Criteria andSatNoNotBetween(Short value1, Short value2) {
            addCriterion("sat_no not between", value1, value2, "satNo");
            return (Criteria) this;
        }

        public Criteria andSunBeginTimeIsNull() {
            addCriterion("sun_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andSunBeginTimeIsNotNull() {
            addCriterion("sun_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andSunBeginTimeEqualTo(Date value) {
            addCriterionForJDBCTime("sun_begin_time =", value, "sunBeginTime");
            return (Criteria) this;
        }

        public Criteria andSunBeginTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("sun_begin_time <>", value, "sunBeginTime");
            return (Criteria) this;
        }

        public Criteria andSunBeginTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("sun_begin_time >", value, "sunBeginTime");
            return (Criteria) this;
        }

        public Criteria andSunBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("sun_begin_time >=", value, "sunBeginTime");
            return (Criteria) this;
        }

        public Criteria andSunBeginTimeLessThan(Date value) {
            addCriterionForJDBCTime("sun_begin_time <", value, "sunBeginTime");
            return (Criteria) this;
        }

        public Criteria andSunBeginTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("sun_begin_time <=", value, "sunBeginTime");
            return (Criteria) this;
        }

        public Criteria andSunBeginTimeIn(List<Date> values) {
            addCriterionForJDBCTime("sun_begin_time in", values, "sunBeginTime");
            return (Criteria) this;
        }

        public Criteria andSunBeginTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("sun_begin_time not in", values, "sunBeginTime");
            return (Criteria) this;
        }

        public Criteria andSunBeginTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("sun_begin_time between", value1, value2, "sunBeginTime");
            return (Criteria) this;
        }

        public Criteria andSunBeginTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("sun_begin_time not between", value1, value2, "sunBeginTime");
            return (Criteria) this;
        }

        public Criteria andSunEndTimeIsNull() {
            addCriterion("sun_end_time is null");
            return (Criteria) this;
        }

        public Criteria andSunEndTimeIsNotNull() {
            addCriterion("sun_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andSunEndTimeEqualTo(Date value) {
            addCriterionForJDBCTime("sun_end_time =", value, "sunEndTime");
            return (Criteria) this;
        }

        public Criteria andSunEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("sun_end_time <>", value, "sunEndTime");
            return (Criteria) this;
        }

        public Criteria andSunEndTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("sun_end_time >", value, "sunEndTime");
            return (Criteria) this;
        }

        public Criteria andSunEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("sun_end_time >=", value, "sunEndTime");
            return (Criteria) this;
        }

        public Criteria andSunEndTimeLessThan(Date value) {
            addCriterionForJDBCTime("sun_end_time <", value, "sunEndTime");
            return (Criteria) this;
        }

        public Criteria andSunEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("sun_end_time <=", value, "sunEndTime");
            return (Criteria) this;
        }

        public Criteria andSunEndTimeIn(List<Date> values) {
            addCriterionForJDBCTime("sun_end_time in", values, "sunEndTime");
            return (Criteria) this;
        }

        public Criteria andSunEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("sun_end_time not in", values, "sunEndTime");
            return (Criteria) this;
        }

        public Criteria andSunEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("sun_end_time between", value1, value2, "sunEndTime");
            return (Criteria) this;
        }

        public Criteria andSunEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("sun_end_time not between", value1, value2, "sunEndTime");
            return (Criteria) this;
        }

        public Criteria andSunNoIsNull() {
            addCriterion("sun_no is null");
            return (Criteria) this;
        }

        public Criteria andSunNoIsNotNull() {
            addCriterion("sun_no is not null");
            return (Criteria) this;
        }

        public Criteria andSunNoEqualTo(Short value) {
            addCriterion("sun_no =", value, "sunNo");
            return (Criteria) this;
        }

        public Criteria andSunNoNotEqualTo(Short value) {
            addCriterion("sun_no <>", value, "sunNo");
            return (Criteria) this;
        }

        public Criteria andSunNoGreaterThan(Short value) {
            addCriterion("sun_no >", value, "sunNo");
            return (Criteria) this;
        }

        public Criteria andSunNoGreaterThanOrEqualTo(Short value) {
            addCriterion("sun_no >=", value, "sunNo");
            return (Criteria) this;
        }

        public Criteria andSunNoLessThan(Short value) {
            addCriterion("sun_no <", value, "sunNo");
            return (Criteria) this;
        }

        public Criteria andSunNoLessThanOrEqualTo(Short value) {
            addCriterion("sun_no <=", value, "sunNo");
            return (Criteria) this;
        }

        public Criteria andSunNoIn(List<Short> values) {
            addCriterion("sun_no in", values, "sunNo");
            return (Criteria) this;
        }

        public Criteria andSunNoNotIn(List<Short> values) {
            addCriterion("sun_no not in", values, "sunNo");
            return (Criteria) this;
        }

        public Criteria andSunNoBetween(Short value1, Short value2) {
            addCriterion("sun_no between", value1, value2, "sunNo");
            return (Criteria) this;
        }

        public Criteria andSunNoNotBetween(Short value1, Short value2) {
            addCriterion("sun_no not between", value1, value2, "sunNo");
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