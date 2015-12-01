package com.penzias.entity;

import java.util.ArrayList;
import java.util.List;

public class ApoplexyConclusionInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApoplexyConclusionInfoExample() {
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

        public Criteria andApoplexyconclusionidIsNull() {
            addCriterion("ApoplexyConclusionID is null");
            return (Criteria) this;
        }

        public Criteria andApoplexyconclusionidIsNotNull() {
            addCriterion("ApoplexyConclusionID is not null");
            return (Criteria) this;
        }

        public Criteria andApoplexyconclusionidEqualTo(Integer value) {
            addCriterion("ApoplexyConclusionID =", value, "apoplexyconclusionid");
            return (Criteria) this;
        }

        public Criteria andApoplexyconclusionidNotEqualTo(Integer value) {
            addCriterion("ApoplexyConclusionID <>", value, "apoplexyconclusionid");
            return (Criteria) this;
        }

        public Criteria andApoplexyconclusionidGreaterThan(Integer value) {
            addCriterion("ApoplexyConclusionID >", value, "apoplexyconclusionid");
            return (Criteria) this;
        }

        public Criteria andApoplexyconclusionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ApoplexyConclusionID >=", value, "apoplexyconclusionid");
            return (Criteria) this;
        }

        public Criteria andApoplexyconclusionidLessThan(Integer value) {
            addCriterion("ApoplexyConclusionID <", value, "apoplexyconclusionid");
            return (Criteria) this;
        }

        public Criteria andApoplexyconclusionidLessThanOrEqualTo(Integer value) {
            addCriterion("ApoplexyConclusionID <=", value, "apoplexyconclusionid");
            return (Criteria) this;
        }

        public Criteria andApoplexyconclusionidIn(List<Integer> values) {
            addCriterion("ApoplexyConclusionID in", values, "apoplexyconclusionid");
            return (Criteria) this;
        }

        public Criteria andApoplexyconclusionidNotIn(List<Integer> values) {
            addCriterion("ApoplexyConclusionID not in", values, "apoplexyconclusionid");
            return (Criteria) this;
        }

        public Criteria andApoplexyconclusionidBetween(Integer value1, Integer value2) {
            addCriterion("ApoplexyConclusionID between", value1, value2, "apoplexyconclusionid");
            return (Criteria) this;
        }

        public Criteria andApoplexyconclusionidNotBetween(Integer value1, Integer value2) {
            addCriterion("ApoplexyConclusionID not between", value1, value2, "apoplexyconclusionid");
            return (Criteria) this;
        }

        public Criteria andCrowdidIsNull() {
            addCriterion("CrowdID is null");
            return (Criteria) this;
        }

        public Criteria andCrowdidIsNotNull() {
            addCriterion("CrowdID is not null");
            return (Criteria) this;
        }

        public Criteria andCrowdidEqualTo(Integer value) {
            addCriterion("CrowdID =", value, "crowdid");
            return (Criteria) this;
        }

        public Criteria andCrowdidNotEqualTo(Integer value) {
            addCriterion("CrowdID <>", value, "crowdid");
            return (Criteria) this;
        }

        public Criteria andCrowdidGreaterThan(Integer value) {
            addCriterion("CrowdID >", value, "crowdid");
            return (Criteria) this;
        }

        public Criteria andCrowdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CrowdID >=", value, "crowdid");
            return (Criteria) this;
        }

        public Criteria andCrowdidLessThan(Integer value) {
            addCriterion("CrowdID <", value, "crowdid");
            return (Criteria) this;
        }

        public Criteria andCrowdidLessThanOrEqualTo(Integer value) {
            addCriterion("CrowdID <=", value, "crowdid");
            return (Criteria) this;
        }

        public Criteria andCrowdidIn(List<Integer> values) {
            addCriterion("CrowdID in", values, "crowdid");
            return (Criteria) this;
        }

        public Criteria andCrowdidNotIn(List<Integer> values) {
            addCriterion("CrowdID not in", values, "crowdid");
            return (Criteria) this;
        }

        public Criteria andCrowdidBetween(Integer value1, Integer value2) {
            addCriterion("CrowdID between", value1, value2, "crowdid");
            return (Criteria) this;
        }

        public Criteria andCrowdidNotBetween(Integer value1, Integer value2) {
            addCriterion("CrowdID not between", value1, value2, "crowdid");
            return (Criteria) this;
        }

        public Criteria andHypertensionIsNull() {
            addCriterion("Hypertension is null");
            return (Criteria) this;
        }

        public Criteria andHypertensionIsNotNull() {
            addCriterion("Hypertension is not null");
            return (Criteria) this;
        }

        public Criteria andHypertensionEqualTo(String value) {
            addCriterion("Hypertension =", value, "hypertension");
            return (Criteria) this;
        }

        public Criteria andHypertensionNotEqualTo(String value) {
            addCriterion("Hypertension <>", value, "hypertension");
            return (Criteria) this;
        }

        public Criteria andHypertensionGreaterThan(String value) {
            addCriterion("Hypertension >", value, "hypertension");
            return (Criteria) this;
        }

        public Criteria andHypertensionGreaterThanOrEqualTo(String value) {
            addCriterion("Hypertension >=", value, "hypertension");
            return (Criteria) this;
        }

        public Criteria andHypertensionLessThan(String value) {
            addCriterion("Hypertension <", value, "hypertension");
            return (Criteria) this;
        }

        public Criteria andHypertensionLessThanOrEqualTo(String value) {
            addCriterion("Hypertension <=", value, "hypertension");
            return (Criteria) this;
        }

        public Criteria andHypertensionLike(String value) {
            addCriterion("Hypertension like", value, "hypertension");
            return (Criteria) this;
        }

        public Criteria andHypertensionNotLike(String value) {
            addCriterion("Hypertension not like", value, "hypertension");
            return (Criteria) this;
        }

        public Criteria andHypertensionIn(List<String> values) {
            addCriterion("Hypertension in", values, "hypertension");
            return (Criteria) this;
        }

        public Criteria andHypertensionNotIn(List<String> values) {
            addCriterion("Hypertension not in", values, "hypertension");
            return (Criteria) this;
        }

        public Criteria andHypertensionBetween(String value1, String value2) {
            addCriterion("Hypertension between", value1, value2, "hypertension");
            return (Criteria) this;
        }

        public Criteria andHypertensionNotBetween(String value1, String value2) {
            addCriterion("Hypertension not between", value1, value2, "hypertension");
            return (Criteria) this;
        }

        public Criteria andDyslipidemiaIsNull() {
            addCriterion("Dyslipidemia is null");
            return (Criteria) this;
        }

        public Criteria andDyslipidemiaIsNotNull() {
            addCriterion("Dyslipidemia is not null");
            return (Criteria) this;
        }

        public Criteria andDyslipidemiaEqualTo(String value) {
            addCriterion("Dyslipidemia =", value, "dyslipidemia");
            return (Criteria) this;
        }

        public Criteria andDyslipidemiaNotEqualTo(String value) {
            addCriterion("Dyslipidemia <>", value, "dyslipidemia");
            return (Criteria) this;
        }

        public Criteria andDyslipidemiaGreaterThan(String value) {
            addCriterion("Dyslipidemia >", value, "dyslipidemia");
            return (Criteria) this;
        }

        public Criteria andDyslipidemiaGreaterThanOrEqualTo(String value) {
            addCriterion("Dyslipidemia >=", value, "dyslipidemia");
            return (Criteria) this;
        }

        public Criteria andDyslipidemiaLessThan(String value) {
            addCriterion("Dyslipidemia <", value, "dyslipidemia");
            return (Criteria) this;
        }

        public Criteria andDyslipidemiaLessThanOrEqualTo(String value) {
            addCriterion("Dyslipidemia <=", value, "dyslipidemia");
            return (Criteria) this;
        }

        public Criteria andDyslipidemiaLike(String value) {
            addCriterion("Dyslipidemia like", value, "dyslipidemia");
            return (Criteria) this;
        }

        public Criteria andDyslipidemiaNotLike(String value) {
            addCriterion("Dyslipidemia not like", value, "dyslipidemia");
            return (Criteria) this;
        }

        public Criteria andDyslipidemiaIn(List<String> values) {
            addCriterion("Dyslipidemia in", values, "dyslipidemia");
            return (Criteria) this;
        }

        public Criteria andDyslipidemiaNotIn(List<String> values) {
            addCriterion("Dyslipidemia not in", values, "dyslipidemia");
            return (Criteria) this;
        }

        public Criteria andDyslipidemiaBetween(String value1, String value2) {
            addCriterion("Dyslipidemia between", value1, value2, "dyslipidemia");
            return (Criteria) this;
        }

        public Criteria andDyslipidemiaNotBetween(String value1, String value2) {
            addCriterion("Dyslipidemia not between", value1, value2, "dyslipidemia");
            return (Criteria) this;
        }

        public Criteria andDiabetesIsNull() {
            addCriterion("Diabetes is null");
            return (Criteria) this;
        }

        public Criteria andDiabetesIsNotNull() {
            addCriterion("Diabetes is not null");
            return (Criteria) this;
        }

        public Criteria andDiabetesEqualTo(String value) {
            addCriterion("Diabetes =", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesNotEqualTo(String value) {
            addCriterion("Diabetes <>", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesGreaterThan(String value) {
            addCriterion("Diabetes >", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesGreaterThanOrEqualTo(String value) {
            addCriterion("Diabetes >=", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesLessThan(String value) {
            addCriterion("Diabetes <", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesLessThanOrEqualTo(String value) {
            addCriterion("Diabetes <=", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesLike(String value) {
            addCriterion("Diabetes like", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesNotLike(String value) {
            addCriterion("Diabetes not like", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesIn(List<String> values) {
            addCriterion("Diabetes in", values, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesNotIn(List<String> values) {
            addCriterion("Diabetes not in", values, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesBetween(String value1, String value2) {
            addCriterion("Diabetes between", value1, value2, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesNotBetween(String value1, String value2) {
            addCriterion("Diabetes not between", value1, value2, "diabetes");
            return (Criteria) this;
        }

        public Criteria andAtrialfibrillationIsNull() {
            addCriterion("AtrialFibrillation is null");
            return (Criteria) this;
        }

        public Criteria andAtrialfibrillationIsNotNull() {
            addCriterion("AtrialFibrillation is not null");
            return (Criteria) this;
        }

        public Criteria andAtrialfibrillationEqualTo(String value) {
            addCriterion("AtrialFibrillation =", value, "atrialfibrillation");
            return (Criteria) this;
        }

        public Criteria andAtrialfibrillationNotEqualTo(String value) {
            addCriterion("AtrialFibrillation <>", value, "atrialfibrillation");
            return (Criteria) this;
        }

        public Criteria andAtrialfibrillationGreaterThan(String value) {
            addCriterion("AtrialFibrillation >", value, "atrialfibrillation");
            return (Criteria) this;
        }

        public Criteria andAtrialfibrillationGreaterThanOrEqualTo(String value) {
            addCriterion("AtrialFibrillation >=", value, "atrialfibrillation");
            return (Criteria) this;
        }

        public Criteria andAtrialfibrillationLessThan(String value) {
            addCriterion("AtrialFibrillation <", value, "atrialfibrillation");
            return (Criteria) this;
        }

        public Criteria andAtrialfibrillationLessThanOrEqualTo(String value) {
            addCriterion("AtrialFibrillation <=", value, "atrialfibrillation");
            return (Criteria) this;
        }

        public Criteria andAtrialfibrillationLike(String value) {
            addCriterion("AtrialFibrillation like", value, "atrialfibrillation");
            return (Criteria) this;
        }

        public Criteria andAtrialfibrillationNotLike(String value) {
            addCriterion("AtrialFibrillation not like", value, "atrialfibrillation");
            return (Criteria) this;
        }

        public Criteria andAtrialfibrillationIn(List<String> values) {
            addCriterion("AtrialFibrillation in", values, "atrialfibrillation");
            return (Criteria) this;
        }

        public Criteria andAtrialfibrillationNotIn(List<String> values) {
            addCriterion("AtrialFibrillation not in", values, "atrialfibrillation");
            return (Criteria) this;
        }

        public Criteria andAtrialfibrillationBetween(String value1, String value2) {
            addCriterion("AtrialFibrillation between", value1, value2, "atrialfibrillation");
            return (Criteria) this;
        }

        public Criteria andAtrialfibrillationNotBetween(String value1, String value2) {
            addCriterion("AtrialFibrillation not between", value1, value2, "atrialfibrillation");
            return (Criteria) this;
        }

        public Criteria andSmokinghistoryIsNull() {
            addCriterion("SmokingHistory is null");
            return (Criteria) this;
        }

        public Criteria andSmokinghistoryIsNotNull() {
            addCriterion("SmokingHistory is not null");
            return (Criteria) this;
        }

        public Criteria andSmokinghistoryEqualTo(String value) {
            addCriterion("SmokingHistory =", value, "smokinghistory");
            return (Criteria) this;
        }

        public Criteria andSmokinghistoryNotEqualTo(String value) {
            addCriterion("SmokingHistory <>", value, "smokinghistory");
            return (Criteria) this;
        }

        public Criteria andSmokinghistoryGreaterThan(String value) {
            addCriterion("SmokingHistory >", value, "smokinghistory");
            return (Criteria) this;
        }

        public Criteria andSmokinghistoryGreaterThanOrEqualTo(String value) {
            addCriterion("SmokingHistory >=", value, "smokinghistory");
            return (Criteria) this;
        }

        public Criteria andSmokinghistoryLessThan(String value) {
            addCriterion("SmokingHistory <", value, "smokinghistory");
            return (Criteria) this;
        }

        public Criteria andSmokinghistoryLessThanOrEqualTo(String value) {
            addCriterion("SmokingHistory <=", value, "smokinghistory");
            return (Criteria) this;
        }

        public Criteria andSmokinghistoryLike(String value) {
            addCriterion("SmokingHistory like", value, "smokinghistory");
            return (Criteria) this;
        }

        public Criteria andSmokinghistoryNotLike(String value) {
            addCriterion("SmokingHistory not like", value, "smokinghistory");
            return (Criteria) this;
        }

        public Criteria andSmokinghistoryIn(List<String> values) {
            addCriterion("SmokingHistory in", values, "smokinghistory");
            return (Criteria) this;
        }

        public Criteria andSmokinghistoryNotIn(List<String> values) {
            addCriterion("SmokingHistory not in", values, "smokinghistory");
            return (Criteria) this;
        }

        public Criteria andSmokinghistoryBetween(String value1, String value2) {
            addCriterion("SmokingHistory between", value1, value2, "smokinghistory");
            return (Criteria) this;
        }

        public Criteria andSmokinghistoryNotBetween(String value1, String value2) {
            addCriterion("SmokingHistory not between", value1, value2, "smokinghistory");
            return (Criteria) this;
        }

        public Criteria andOverweightIsNull() {
            addCriterion("Overweight is null");
            return (Criteria) this;
        }

        public Criteria andOverweightIsNotNull() {
            addCriterion("Overweight is not null");
            return (Criteria) this;
        }

        public Criteria andOverweightEqualTo(String value) {
            addCriterion("Overweight =", value, "overweight");
            return (Criteria) this;
        }

        public Criteria andOverweightNotEqualTo(String value) {
            addCriterion("Overweight <>", value, "overweight");
            return (Criteria) this;
        }

        public Criteria andOverweightGreaterThan(String value) {
            addCriterion("Overweight >", value, "overweight");
            return (Criteria) this;
        }

        public Criteria andOverweightGreaterThanOrEqualTo(String value) {
            addCriterion("Overweight >=", value, "overweight");
            return (Criteria) this;
        }

        public Criteria andOverweightLessThan(String value) {
            addCriterion("Overweight <", value, "overweight");
            return (Criteria) this;
        }

        public Criteria andOverweightLessThanOrEqualTo(String value) {
            addCriterion("Overweight <=", value, "overweight");
            return (Criteria) this;
        }

        public Criteria andOverweightLike(String value) {
            addCriterion("Overweight like", value, "overweight");
            return (Criteria) this;
        }

        public Criteria andOverweightNotLike(String value) {
            addCriterion("Overweight not like", value, "overweight");
            return (Criteria) this;
        }

        public Criteria andOverweightIn(List<String> values) {
            addCriterion("Overweight in", values, "overweight");
            return (Criteria) this;
        }

        public Criteria andOverweightNotIn(List<String> values) {
            addCriterion("Overweight not in", values, "overweight");
            return (Criteria) this;
        }

        public Criteria andOverweightBetween(String value1, String value2) {
            addCriterion("Overweight between", value1, value2, "overweight");
            return (Criteria) this;
        }

        public Criteria andOverweightNotBetween(String value1, String value2) {
            addCriterion("Overweight not between", value1, value2, "overweight");
            return (Criteria) this;
        }

        public Criteria andSportslackIsNull() {
            addCriterion("SportsLack is null");
            return (Criteria) this;
        }

        public Criteria andSportslackIsNotNull() {
            addCriterion("SportsLack is not null");
            return (Criteria) this;
        }

        public Criteria andSportslackEqualTo(String value) {
            addCriterion("SportsLack =", value, "sportslack");
            return (Criteria) this;
        }

        public Criteria andSportslackNotEqualTo(String value) {
            addCriterion("SportsLack <>", value, "sportslack");
            return (Criteria) this;
        }

        public Criteria andSportslackGreaterThan(String value) {
            addCriterion("SportsLack >", value, "sportslack");
            return (Criteria) this;
        }

        public Criteria andSportslackGreaterThanOrEqualTo(String value) {
            addCriterion("SportsLack >=", value, "sportslack");
            return (Criteria) this;
        }

        public Criteria andSportslackLessThan(String value) {
            addCriterion("SportsLack <", value, "sportslack");
            return (Criteria) this;
        }

        public Criteria andSportslackLessThanOrEqualTo(String value) {
            addCriterion("SportsLack <=", value, "sportslack");
            return (Criteria) this;
        }

        public Criteria andSportslackLike(String value) {
            addCriterion("SportsLack like", value, "sportslack");
            return (Criteria) this;
        }

        public Criteria andSportslackNotLike(String value) {
            addCriterion("SportsLack not like", value, "sportslack");
            return (Criteria) this;
        }

        public Criteria andSportslackIn(List<String> values) {
            addCriterion("SportsLack in", values, "sportslack");
            return (Criteria) this;
        }

        public Criteria andSportslackNotIn(List<String> values) {
            addCriterion("SportsLack not in", values, "sportslack");
            return (Criteria) this;
        }

        public Criteria andSportslackBetween(String value1, String value2) {
            addCriterion("SportsLack between", value1, value2, "sportslack");
            return (Criteria) this;
        }

        public Criteria andSportslackNotBetween(String value1, String value2) {
            addCriterion("SportsLack not between", value1, value2, "sportslack");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryIsNull() {
            addCriterion("FamilyHistory is null");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryIsNotNull() {
            addCriterion("FamilyHistory is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryEqualTo(String value) {
            addCriterion("FamilyHistory =", value, "familyhistory");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryNotEqualTo(String value) {
            addCriterion("FamilyHistory <>", value, "familyhistory");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryGreaterThan(String value) {
            addCriterion("FamilyHistory >", value, "familyhistory");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryGreaterThanOrEqualTo(String value) {
            addCriterion("FamilyHistory >=", value, "familyhistory");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryLessThan(String value) {
            addCriterion("FamilyHistory <", value, "familyhistory");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryLessThanOrEqualTo(String value) {
            addCriterion("FamilyHistory <=", value, "familyhistory");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryLike(String value) {
            addCriterion("FamilyHistory like", value, "familyhistory");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryNotLike(String value) {
            addCriterion("FamilyHistory not like", value, "familyhistory");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryIn(List<String> values) {
            addCriterion("FamilyHistory in", values, "familyhistory");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryNotIn(List<String> values) {
            addCriterion("FamilyHistory not in", values, "familyhistory");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryBetween(String value1, String value2) {
            addCriterion("FamilyHistory between", value1, value2, "familyhistory");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryNotBetween(String value1, String value2) {
            addCriterion("FamilyHistory not between", value1, value2, "familyhistory");
            return (Criteria) this;
        }

        public Criteria andPaststrokeIsNull() {
            addCriterion("PastStroke is null");
            return (Criteria) this;
        }

        public Criteria andPaststrokeIsNotNull() {
            addCriterion("PastStroke is not null");
            return (Criteria) this;
        }

        public Criteria andPaststrokeEqualTo(String value) {
            addCriterion("PastStroke =", value, "paststroke");
            return (Criteria) this;
        }

        public Criteria andPaststrokeNotEqualTo(String value) {
            addCriterion("PastStroke <>", value, "paststroke");
            return (Criteria) this;
        }

        public Criteria andPaststrokeGreaterThan(String value) {
            addCriterion("PastStroke >", value, "paststroke");
            return (Criteria) this;
        }

        public Criteria andPaststrokeGreaterThanOrEqualTo(String value) {
            addCriterion("PastStroke >=", value, "paststroke");
            return (Criteria) this;
        }

        public Criteria andPaststrokeLessThan(String value) {
            addCriterion("PastStroke <", value, "paststroke");
            return (Criteria) this;
        }

        public Criteria andPaststrokeLessThanOrEqualTo(String value) {
            addCriterion("PastStroke <=", value, "paststroke");
            return (Criteria) this;
        }

        public Criteria andPaststrokeLike(String value) {
            addCriterion("PastStroke like", value, "paststroke");
            return (Criteria) this;
        }

        public Criteria andPaststrokeNotLike(String value) {
            addCriterion("PastStroke not like", value, "paststroke");
            return (Criteria) this;
        }

        public Criteria andPaststrokeIn(List<String> values) {
            addCriterion("PastStroke in", values, "paststroke");
            return (Criteria) this;
        }

        public Criteria andPaststrokeNotIn(List<String> values) {
            addCriterion("PastStroke not in", values, "paststroke");
            return (Criteria) this;
        }

        public Criteria andPaststrokeBetween(String value1, String value2) {
            addCriterion("PastStroke between", value1, value2, "paststroke");
            return (Criteria) this;
        }

        public Criteria andPaststrokeNotBetween(String value1, String value2) {
            addCriterion("PastStroke not between", value1, value2, "paststroke");
            return (Criteria) this;
        }

        public Criteria andPasttiaIsNull() {
            addCriterion("PastTIA is null");
            return (Criteria) this;
        }

        public Criteria andPasttiaIsNotNull() {
            addCriterion("PastTIA is not null");
            return (Criteria) this;
        }

        public Criteria andPasttiaEqualTo(String value) {
            addCriterion("PastTIA =", value, "pasttia");
            return (Criteria) this;
        }

        public Criteria andPasttiaNotEqualTo(String value) {
            addCriterion("PastTIA <>", value, "pasttia");
            return (Criteria) this;
        }

        public Criteria andPasttiaGreaterThan(String value) {
            addCriterion("PastTIA >", value, "pasttia");
            return (Criteria) this;
        }

        public Criteria andPasttiaGreaterThanOrEqualTo(String value) {
            addCriterion("PastTIA >=", value, "pasttia");
            return (Criteria) this;
        }

        public Criteria andPasttiaLessThan(String value) {
            addCriterion("PastTIA <", value, "pasttia");
            return (Criteria) this;
        }

        public Criteria andPasttiaLessThanOrEqualTo(String value) {
            addCriterion("PastTIA <=", value, "pasttia");
            return (Criteria) this;
        }

        public Criteria andPasttiaLike(String value) {
            addCriterion("PastTIA like", value, "pasttia");
            return (Criteria) this;
        }

        public Criteria andPasttiaNotLike(String value) {
            addCriterion("PastTIA not like", value, "pasttia");
            return (Criteria) this;
        }

        public Criteria andPasttiaIn(List<String> values) {
            addCriterion("PastTIA in", values, "pasttia");
            return (Criteria) this;
        }

        public Criteria andPasttiaNotIn(List<String> values) {
            addCriterion("PastTIA not in", values, "pasttia");
            return (Criteria) this;
        }

        public Criteria andPasttiaBetween(String value1, String value2) {
            addCriterion("PastTIA between", value1, value2, "pasttia");
            return (Criteria) this;
        }

        public Criteria andPasttiaNotBetween(String value1, String value2) {
            addCriterion("PastTIA not between", value1, value2, "pasttia");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("Grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("Grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("Grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("Grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("Grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("Grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("Grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("Grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("Grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("Grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("Grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("Grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("Grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("Grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("Mark is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("Mark is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(String value) {
            addCriterion("Mark =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(String value) {
            addCriterion("Mark <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(String value) {
            addCriterion("Mark >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(String value) {
            addCriterion("Mark >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(String value) {
            addCriterion("Mark <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(String value) {
            addCriterion("Mark <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLike(String value) {
            addCriterion("Mark like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotLike(String value) {
            addCriterion("Mark not like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<String> values) {
            addCriterion("Mark in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<String> values) {
            addCriterion("Mark not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(String value1, String value2) {
            addCriterion("Mark between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(String value1, String value2) {
            addCriterion("Mark not between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andManagelevelIsNull() {
            addCriterion("ManageLevel is null");
            return (Criteria) this;
        }

        public Criteria andManagelevelIsNotNull() {
            addCriterion("ManageLevel is not null");
            return (Criteria) this;
        }

        public Criteria andManagelevelEqualTo(String value) {
            addCriterion("ManageLevel =", value, "managelevel");
            return (Criteria) this;
        }

        public Criteria andManagelevelNotEqualTo(String value) {
            addCriterion("ManageLevel <>", value, "managelevel");
            return (Criteria) this;
        }

        public Criteria andManagelevelGreaterThan(String value) {
            addCriterion("ManageLevel >", value, "managelevel");
            return (Criteria) this;
        }

        public Criteria andManagelevelGreaterThanOrEqualTo(String value) {
            addCriterion("ManageLevel >=", value, "managelevel");
            return (Criteria) this;
        }

        public Criteria andManagelevelLessThan(String value) {
            addCriterion("ManageLevel <", value, "managelevel");
            return (Criteria) this;
        }

        public Criteria andManagelevelLessThanOrEqualTo(String value) {
            addCriterion("ManageLevel <=", value, "managelevel");
            return (Criteria) this;
        }

        public Criteria andManagelevelLike(String value) {
            addCriterion("ManageLevel like", value, "managelevel");
            return (Criteria) this;
        }

        public Criteria andManagelevelNotLike(String value) {
            addCriterion("ManageLevel not like", value, "managelevel");
            return (Criteria) this;
        }

        public Criteria andManagelevelIn(List<String> values) {
            addCriterion("ManageLevel in", values, "managelevel");
            return (Criteria) this;
        }

        public Criteria andManagelevelNotIn(List<String> values) {
            addCriterion("ManageLevel not in", values, "managelevel");
            return (Criteria) this;
        }

        public Criteria andManagelevelBetween(String value1, String value2) {
            addCriterion("ManageLevel between", value1, value2, "managelevel");
            return (Criteria) this;
        }

        public Criteria andManagelevelNotBetween(String value1, String value2) {
            addCriterion("ManageLevel not between", value1, value2, "managelevel");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("Flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("Flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("Flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("Flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("Flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("Flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("Flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("Flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("Flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("Flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("Flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("Flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("Flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("Flag not between", value1, value2, "flag");
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