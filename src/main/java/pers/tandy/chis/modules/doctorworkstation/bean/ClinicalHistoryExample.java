package pers.tandy.chis.modules.doctorworkstation.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClinicalHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClinicalHistoryExample() {
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

        public Criteria andChiefComplaintIsNull() {
            addCriterion("chief_complaint is null");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintIsNotNull() {
            addCriterion("chief_complaint is not null");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintEqualTo(String value) {
            addCriterion("chief_complaint =", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintNotEqualTo(String value) {
            addCriterion("chief_complaint <>", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintGreaterThan(String value) {
            addCriterion("chief_complaint >", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintGreaterThanOrEqualTo(String value) {
            addCriterion("chief_complaint >=", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintLessThan(String value) {
            addCriterion("chief_complaint <", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintLessThanOrEqualTo(String value) {
            addCriterion("chief_complaint <=", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintLike(String value) {
            addCriterion("chief_complaint like", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintNotLike(String value) {
            addCriterion("chief_complaint not like", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintIn(List<String> values) {
            addCriterion("chief_complaint in", values, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintNotIn(List<String> values) {
            addCriterion("chief_complaint not in", values, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintBetween(String value1, String value2) {
            addCriterion("chief_complaint between", value1, value2, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintNotBetween(String value1, String value2) {
            addCriterion("chief_complaint not between", value1, value2, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andPresentIllnessIsNull() {
            addCriterion("present_illness is null");
            return (Criteria) this;
        }

        public Criteria andPresentIllnessIsNotNull() {
            addCriterion("present_illness is not null");
            return (Criteria) this;
        }

        public Criteria andPresentIllnessEqualTo(String value) {
            addCriterion("present_illness =", value, "presentIllness");
            return (Criteria) this;
        }

        public Criteria andPresentIllnessNotEqualTo(String value) {
            addCriterion("present_illness <>", value, "presentIllness");
            return (Criteria) this;
        }

        public Criteria andPresentIllnessGreaterThan(String value) {
            addCriterion("present_illness >", value, "presentIllness");
            return (Criteria) this;
        }

        public Criteria andPresentIllnessGreaterThanOrEqualTo(String value) {
            addCriterion("present_illness >=", value, "presentIllness");
            return (Criteria) this;
        }

        public Criteria andPresentIllnessLessThan(String value) {
            addCriterion("present_illness <", value, "presentIllness");
            return (Criteria) this;
        }

        public Criteria andPresentIllnessLessThanOrEqualTo(String value) {
            addCriterion("present_illness <=", value, "presentIllness");
            return (Criteria) this;
        }

        public Criteria andPresentIllnessLike(String value) {
            addCriterion("present_illness like", value, "presentIllness");
            return (Criteria) this;
        }

        public Criteria andPresentIllnessNotLike(String value) {
            addCriterion("present_illness not like", value, "presentIllness");
            return (Criteria) this;
        }

        public Criteria andPresentIllnessIn(List<String> values) {
            addCriterion("present_illness in", values, "presentIllness");
            return (Criteria) this;
        }

        public Criteria andPresentIllnessNotIn(List<String> values) {
            addCriterion("present_illness not in", values, "presentIllness");
            return (Criteria) this;
        }

        public Criteria andPresentIllnessBetween(String value1, String value2) {
            addCriterion("present_illness between", value1, value2, "presentIllness");
            return (Criteria) this;
        }

        public Criteria andPresentIllnessNotBetween(String value1, String value2) {
            addCriterion("present_illness not between", value1, value2, "presentIllness");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationIsNull() {
            addCriterion("physical_examination is null");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationIsNotNull() {
            addCriterion("physical_examination is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationEqualTo(String value) {
            addCriterion("physical_examination =", value, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationNotEqualTo(String value) {
            addCriterion("physical_examination <>", value, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationGreaterThan(String value) {
            addCriterion("physical_examination >", value, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationGreaterThanOrEqualTo(String value) {
            addCriterion("physical_examination >=", value, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationLessThan(String value) {
            addCriterion("physical_examination <", value, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationLessThanOrEqualTo(String value) {
            addCriterion("physical_examination <=", value, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationLike(String value) {
            addCriterion("physical_examination like", value, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationNotLike(String value) {
            addCriterion("physical_examination not like", value, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationIn(List<String> values) {
            addCriterion("physical_examination in", values, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationNotIn(List<String> values) {
            addCriterion("physical_examination not in", values, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationBetween(String value1, String value2) {
            addCriterion("physical_examination between", value1, value2, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationNotBetween(String value1, String value2) {
            addCriterion("physical_examination not between", value1, value2, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPastHistoryIsNull() {
            addCriterion("past_history is null");
            return (Criteria) this;
        }

        public Criteria andPastHistoryIsNotNull() {
            addCriterion("past_history is not null");
            return (Criteria) this;
        }

        public Criteria andPastHistoryEqualTo(String value) {
            addCriterion("past_history =", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryNotEqualTo(String value) {
            addCriterion("past_history <>", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryGreaterThan(String value) {
            addCriterion("past_history >", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("past_history >=", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryLessThan(String value) {
            addCriterion("past_history <", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryLessThanOrEqualTo(String value) {
            addCriterion("past_history <=", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryLike(String value) {
            addCriterion("past_history like", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryNotLike(String value) {
            addCriterion("past_history not like", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryIn(List<String> values) {
            addCriterion("past_history in", values, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryNotIn(List<String> values) {
            addCriterion("past_history not in", values, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryBetween(String value1, String value2) {
            addCriterion("past_history between", value1, value2, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryNotBetween(String value1, String value2) {
            addCriterion("past_history not between", value1, value2, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andAllergenHistoryIsNull() {
            addCriterion("allergen_history is null");
            return (Criteria) this;
        }

        public Criteria andAllergenHistoryIsNotNull() {
            addCriterion("allergen_history is not null");
            return (Criteria) this;
        }

        public Criteria andAllergenHistoryEqualTo(String value) {
            addCriterion("allergen_history =", value, "allergenHistory");
            return (Criteria) this;
        }

        public Criteria andAllergenHistoryNotEqualTo(String value) {
            addCriterion("allergen_history <>", value, "allergenHistory");
            return (Criteria) this;
        }

        public Criteria andAllergenHistoryGreaterThan(String value) {
            addCriterion("allergen_history >", value, "allergenHistory");
            return (Criteria) this;
        }

        public Criteria andAllergenHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("allergen_history >=", value, "allergenHistory");
            return (Criteria) this;
        }

        public Criteria andAllergenHistoryLessThan(String value) {
            addCriterion("allergen_history <", value, "allergenHistory");
            return (Criteria) this;
        }

        public Criteria andAllergenHistoryLessThanOrEqualTo(String value) {
            addCriterion("allergen_history <=", value, "allergenHistory");
            return (Criteria) this;
        }

        public Criteria andAllergenHistoryLike(String value) {
            addCriterion("allergen_history like", value, "allergenHistory");
            return (Criteria) this;
        }

        public Criteria andAllergenHistoryNotLike(String value) {
            addCriterion("allergen_history not like", value, "allergenHistory");
            return (Criteria) this;
        }

        public Criteria andAllergenHistoryIn(List<String> values) {
            addCriterion("allergen_history in", values, "allergenHistory");
            return (Criteria) this;
        }

        public Criteria andAllergenHistoryNotIn(List<String> values) {
            addCriterion("allergen_history not in", values, "allergenHistory");
            return (Criteria) this;
        }

        public Criteria andAllergenHistoryBetween(String value1, String value2) {
            addCriterion("allergen_history between", value1, value2, "allergenHistory");
            return (Criteria) this;
        }

        public Criteria andAllergenHistoryNotBetween(String value1, String value2) {
            addCriterion("allergen_history not between", value1, value2, "allergenHistory");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExaminationIsNull() {
            addCriterion("auxiliary_examination is null");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExaminationIsNotNull() {
            addCriterion("auxiliary_examination is not null");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExaminationEqualTo(String value) {
            addCriterion("auxiliary_examination =", value, "auxiliaryExamination");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExaminationNotEqualTo(String value) {
            addCriterion("auxiliary_examination <>", value, "auxiliaryExamination");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExaminationGreaterThan(String value) {
            addCriterion("auxiliary_examination >", value, "auxiliaryExamination");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExaminationGreaterThanOrEqualTo(String value) {
            addCriterion("auxiliary_examination >=", value, "auxiliaryExamination");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExaminationLessThan(String value) {
            addCriterion("auxiliary_examination <", value, "auxiliaryExamination");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExaminationLessThanOrEqualTo(String value) {
            addCriterion("auxiliary_examination <=", value, "auxiliaryExamination");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExaminationLike(String value) {
            addCriterion("auxiliary_examination like", value, "auxiliaryExamination");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExaminationNotLike(String value) {
            addCriterion("auxiliary_examination not like", value, "auxiliaryExamination");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExaminationIn(List<String> values) {
            addCriterion("auxiliary_examination in", values, "auxiliaryExamination");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExaminationNotIn(List<String> values) {
            addCriterion("auxiliary_examination not in", values, "auxiliaryExamination");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExaminationBetween(String value1, String value2) {
            addCriterion("auxiliary_examination between", value1, value2, "auxiliaryExamination");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExaminationNotBetween(String value1, String value2) {
            addCriterion("auxiliary_examination not between", value1, value2, "auxiliaryExamination");
            return (Criteria) this;
        }

        public Criteria andDialecticalIsNull() {
            addCriterion("dialectical is null");
            return (Criteria) this;
        }

        public Criteria andDialecticalIsNotNull() {
            addCriterion("dialectical is not null");
            return (Criteria) this;
        }

        public Criteria andDialecticalEqualTo(String value) {
            addCriterion("dialectical =", value, "dialectical");
            return (Criteria) this;
        }

        public Criteria andDialecticalNotEqualTo(String value) {
            addCriterion("dialectical <>", value, "dialectical");
            return (Criteria) this;
        }

        public Criteria andDialecticalGreaterThan(String value) {
            addCriterion("dialectical >", value, "dialectical");
            return (Criteria) this;
        }

        public Criteria andDialecticalGreaterThanOrEqualTo(String value) {
            addCriterion("dialectical >=", value, "dialectical");
            return (Criteria) this;
        }

        public Criteria andDialecticalLessThan(String value) {
            addCriterion("dialectical <", value, "dialectical");
            return (Criteria) this;
        }

        public Criteria andDialecticalLessThanOrEqualTo(String value) {
            addCriterion("dialectical <=", value, "dialectical");
            return (Criteria) this;
        }

        public Criteria andDialecticalLike(String value) {
            addCriterion("dialectical like", value, "dialectical");
            return (Criteria) this;
        }

        public Criteria andDialecticalNotLike(String value) {
            addCriterion("dialectical not like", value, "dialectical");
            return (Criteria) this;
        }

        public Criteria andDialecticalIn(List<String> values) {
            addCriterion("dialectical in", values, "dialectical");
            return (Criteria) this;
        }

        public Criteria andDialecticalNotIn(List<String> values) {
            addCriterion("dialectical not in", values, "dialectical");
            return (Criteria) this;
        }

        public Criteria andDialecticalBetween(String value1, String value2) {
            addCriterion("dialectical between", value1, value2, "dialectical");
            return (Criteria) this;
        }

        public Criteria andDialecticalNotBetween(String value1, String value2) {
            addCriterion("dialectical not between", value1, value2, "dialectical");
            return (Criteria) this;
        }

        public Criteria andDiagnoseJsonIsNull() {
            addCriterion("diagnose_json is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseJsonIsNotNull() {
            addCriterion("diagnose_json is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseJsonEqualTo(String value) {
            addCriterion("diagnose_json =", value, "diagnoseJson");
            return (Criteria) this;
        }

        public Criteria andDiagnoseJsonNotEqualTo(String value) {
            addCriterion("diagnose_json <>", value, "diagnoseJson");
            return (Criteria) this;
        }

        public Criteria andDiagnoseJsonGreaterThan(String value) {
            addCriterion("diagnose_json >", value, "diagnoseJson");
            return (Criteria) this;
        }

        public Criteria andDiagnoseJsonGreaterThanOrEqualTo(String value) {
            addCriterion("diagnose_json >=", value, "diagnoseJson");
            return (Criteria) this;
        }

        public Criteria andDiagnoseJsonLessThan(String value) {
            addCriterion("diagnose_json <", value, "diagnoseJson");
            return (Criteria) this;
        }

        public Criteria andDiagnoseJsonLessThanOrEqualTo(String value) {
            addCriterion("diagnose_json <=", value, "diagnoseJson");
            return (Criteria) this;
        }

        public Criteria andDiagnoseJsonLike(String value) {
            addCriterion("diagnose_json like", value, "diagnoseJson");
            return (Criteria) this;
        }

        public Criteria andDiagnoseJsonNotLike(String value) {
            addCriterion("diagnose_json not like", value, "diagnoseJson");
            return (Criteria) this;
        }

        public Criteria andDiagnoseJsonIn(List<String> values) {
            addCriterion("diagnose_json in", values, "diagnoseJson");
            return (Criteria) this;
        }

        public Criteria andDiagnoseJsonNotIn(List<String> values) {
            addCriterion("diagnose_json not in", values, "diagnoseJson");
            return (Criteria) this;
        }

        public Criteria andDiagnoseJsonBetween(String value1, String value2) {
            addCriterion("diagnose_json between", value1, value2, "diagnoseJson");
            return (Criteria) this;
        }

        public Criteria andDiagnoseJsonNotBetween(String value1, String value2) {
            addCriterion("diagnose_json not between", value1, value2, "diagnoseJson");
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

        public Criteria andFinishedIsNull() {
            addCriterion("finished is null");
            return (Criteria) this;
        }

        public Criteria andFinishedIsNotNull() {
            addCriterion("finished is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedEqualTo(Boolean value) {
            addCriterion("finished =", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotEqualTo(Boolean value) {
            addCriterion("finished <>", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedGreaterThan(Boolean value) {
            addCriterion("finished >", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("finished >=", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedLessThan(Boolean value) {
            addCriterion("finished <", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedLessThanOrEqualTo(Boolean value) {
            addCriterion("finished <=", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedIn(List<Boolean> values) {
            addCriterion("finished in", values, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotIn(List<Boolean> values) {
            addCriterion("finished not in", values, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedBetween(Boolean value1, Boolean value2) {
            addCriterion("finished between", value1, value2, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("finished not between", value1, value2, "finished");
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