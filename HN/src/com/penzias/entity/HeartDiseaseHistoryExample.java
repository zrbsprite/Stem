package com.penzias.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HeartDiseaseHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HeartDiseaseHistoryExample() {
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

        public Criteria andHeartdiseasehistoryidIsNull() {
            addCriterion("HeartDiseaseHistoryID is null");
            return (Criteria) this;
        }

        public Criteria andHeartdiseasehistoryidIsNotNull() {
            addCriterion("HeartDiseaseHistoryID is not null");
            return (Criteria) this;
        }

        public Criteria andHeartdiseasehistoryidEqualTo(Integer value) {
            addCriterion("HeartDiseaseHistoryID =", value, "heartdiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andHeartdiseasehistoryidNotEqualTo(Integer value) {
            addCriterion("HeartDiseaseHistoryID <>", value, "heartdiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andHeartdiseasehistoryidGreaterThan(Integer value) {
            addCriterion("HeartDiseaseHistoryID >", value, "heartdiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andHeartdiseasehistoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("HeartDiseaseHistoryID >=", value, "heartdiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andHeartdiseasehistoryidLessThan(Integer value) {
            addCriterion("HeartDiseaseHistoryID <", value, "heartdiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andHeartdiseasehistoryidLessThanOrEqualTo(Integer value) {
            addCriterion("HeartDiseaseHistoryID <=", value, "heartdiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andHeartdiseasehistoryidIn(List<Integer> values) {
            addCriterion("HeartDiseaseHistoryID in", values, "heartdiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andHeartdiseasehistoryidNotIn(List<Integer> values) {
            addCriterion("HeartDiseaseHistoryID not in", values, "heartdiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andHeartdiseasehistoryidBetween(Integer value1, Integer value2) {
            addCriterion("HeartDiseaseHistoryID between", value1, value2, "heartdiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andHeartdiseasehistoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("HeartDiseaseHistoryID not between", value1, value2, "heartdiseasehistoryid");
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

        public Criteria andIsheartdiseaseIsNull() {
            addCriterion("IsHeartDisease is null");
            return (Criteria) this;
        }

        public Criteria andIsheartdiseaseIsNotNull() {
            addCriterion("IsHeartDisease is not null");
            return (Criteria) this;
        }

        public Criteria andIsheartdiseaseEqualTo(String value) {
            addCriterion("IsHeartDisease =", value, "isheartdisease");
            return (Criteria) this;
        }

        public Criteria andIsheartdiseaseNotEqualTo(String value) {
            addCriterion("IsHeartDisease <>", value, "isheartdisease");
            return (Criteria) this;
        }

        public Criteria andIsheartdiseaseGreaterThan(String value) {
            addCriterion("IsHeartDisease >", value, "isheartdisease");
            return (Criteria) this;
        }

        public Criteria andIsheartdiseaseGreaterThanOrEqualTo(String value) {
            addCriterion("IsHeartDisease >=", value, "isheartdisease");
            return (Criteria) this;
        }

        public Criteria andIsheartdiseaseLessThan(String value) {
            addCriterion("IsHeartDisease <", value, "isheartdisease");
            return (Criteria) this;
        }

        public Criteria andIsheartdiseaseLessThanOrEqualTo(String value) {
            addCriterion("IsHeartDisease <=", value, "isheartdisease");
            return (Criteria) this;
        }

        public Criteria andIsheartdiseaseLike(String value) {
            addCriterion("IsHeartDisease like", value, "isheartdisease");
            return (Criteria) this;
        }

        public Criteria andIsheartdiseaseNotLike(String value) {
            addCriterion("IsHeartDisease not like", value, "isheartdisease");
            return (Criteria) this;
        }

        public Criteria andIsheartdiseaseIn(List<String> values) {
            addCriterion("IsHeartDisease in", values, "isheartdisease");
            return (Criteria) this;
        }

        public Criteria andIsheartdiseaseNotIn(List<String> values) {
            addCriterion("IsHeartDisease not in", values, "isheartdisease");
            return (Criteria) this;
        }

        public Criteria andIsheartdiseaseBetween(String value1, String value2) {
            addCriterion("IsHeartDisease between", value1, value2, "isheartdisease");
            return (Criteria) this;
        }

        public Criteria andIsheartdiseaseNotBetween(String value1, String value2) {
            addCriterion("IsHeartDisease not between", value1, value2, "isheartdisease");
            return (Criteria) this;
        }

        public Criteria andCoronarydiseaseIsNull() {
            addCriterion("CoronaryDisease is null");
            return (Criteria) this;
        }

        public Criteria andCoronarydiseaseIsNotNull() {
            addCriterion("CoronaryDisease is not null");
            return (Criteria) this;
        }

        public Criteria andCoronarydiseaseEqualTo(String value) {
            addCriterion("CoronaryDisease =", value, "coronarydisease");
            return (Criteria) this;
        }

        public Criteria andCoronarydiseaseNotEqualTo(String value) {
            addCriterion("CoronaryDisease <>", value, "coronarydisease");
            return (Criteria) this;
        }

        public Criteria andCoronarydiseaseGreaterThan(String value) {
            addCriterion("CoronaryDisease >", value, "coronarydisease");
            return (Criteria) this;
        }

        public Criteria andCoronarydiseaseGreaterThanOrEqualTo(String value) {
            addCriterion("CoronaryDisease >=", value, "coronarydisease");
            return (Criteria) this;
        }

        public Criteria andCoronarydiseaseLessThan(String value) {
            addCriterion("CoronaryDisease <", value, "coronarydisease");
            return (Criteria) this;
        }

        public Criteria andCoronarydiseaseLessThanOrEqualTo(String value) {
            addCriterion("CoronaryDisease <=", value, "coronarydisease");
            return (Criteria) this;
        }

        public Criteria andCoronarydiseaseLike(String value) {
            addCriterion("CoronaryDisease like", value, "coronarydisease");
            return (Criteria) this;
        }

        public Criteria andCoronarydiseaseNotLike(String value) {
            addCriterion("CoronaryDisease not like", value, "coronarydisease");
            return (Criteria) this;
        }

        public Criteria andCoronarydiseaseIn(List<String> values) {
            addCriterion("CoronaryDisease in", values, "coronarydisease");
            return (Criteria) this;
        }

        public Criteria andCoronarydiseaseNotIn(List<String> values) {
            addCriterion("CoronaryDisease not in", values, "coronarydisease");
            return (Criteria) this;
        }

        public Criteria andCoronarydiseaseBetween(String value1, String value2) {
            addCriterion("CoronaryDisease between", value1, value2, "coronarydisease");
            return (Criteria) this;
        }

        public Criteria andCoronarydiseaseNotBetween(String value1, String value2) {
            addCriterion("CoronaryDisease not between", value1, value2, "coronarydisease");
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

        public Criteria andVhdIsNull() {
            addCriterion("VHD is null");
            return (Criteria) this;
        }

        public Criteria andVhdIsNotNull() {
            addCriterion("VHD is not null");
            return (Criteria) this;
        }

        public Criteria andVhdEqualTo(String value) {
            addCriterion("VHD =", value, "vhd");
            return (Criteria) this;
        }

        public Criteria andVhdNotEqualTo(String value) {
            addCriterion("VHD <>", value, "vhd");
            return (Criteria) this;
        }

        public Criteria andVhdGreaterThan(String value) {
            addCriterion("VHD >", value, "vhd");
            return (Criteria) this;
        }

        public Criteria andVhdGreaterThanOrEqualTo(String value) {
            addCriterion("VHD >=", value, "vhd");
            return (Criteria) this;
        }

        public Criteria andVhdLessThan(String value) {
            addCriterion("VHD <", value, "vhd");
            return (Criteria) this;
        }

        public Criteria andVhdLessThanOrEqualTo(String value) {
            addCriterion("VHD <=", value, "vhd");
            return (Criteria) this;
        }

        public Criteria andVhdLike(String value) {
            addCriterion("VHD like", value, "vhd");
            return (Criteria) this;
        }

        public Criteria andVhdNotLike(String value) {
            addCriterion("VHD not like", value, "vhd");
            return (Criteria) this;
        }

        public Criteria andVhdIn(List<String> values) {
            addCriterion("VHD in", values, "vhd");
            return (Criteria) this;
        }

        public Criteria andVhdNotIn(List<String> values) {
            addCriterion("VHD not in", values, "vhd");
            return (Criteria) this;
        }

        public Criteria andVhdBetween(String value1, String value2) {
            addCriterion("VHD between", value1, value2, "vhd");
            return (Criteria) this;
        }

        public Criteria andVhdNotBetween(String value1, String value2) {
            addCriterion("VHD not between", value1, value2, "vhd");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("Other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("Other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("Other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("Other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("Other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("Other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("Other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("Other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("Other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("Other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("Other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("Other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("Other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("Other not between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("Number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("Number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("Number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("Number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("Number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("Number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("Number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("Number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("Number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("Number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("Number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("Number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("Number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNull() {
            addCriterion("LastTime is null");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNotNull() {
            addCriterion("LastTime is not null");
            return (Criteria) this;
        }

        public Criteria andLasttimeEqualTo(Date value) {
            addCriterionForJDBCDate("LastTime =", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("LastTime <>", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("LastTime >", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LastTime >=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThan(Date value) {
            addCriterionForJDBCDate("LastTime <", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LastTime <=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeIn(List<Date> values) {
            addCriterionForJDBCDate("LastTime in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("LastTime not in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LastTime between", value1, value2, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LastTime not between", value1, value2, "lasttime");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIsNull() {
            addCriterion("Diagnosis is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIsNotNull() {
            addCriterion("Diagnosis is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisEqualTo(String value) {
            addCriterion("Diagnosis =", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNotEqualTo(String value) {
            addCriterion("Diagnosis <>", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisGreaterThan(String value) {
            addCriterion("Diagnosis >", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisGreaterThanOrEqualTo(String value) {
            addCriterion("Diagnosis >=", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisLessThan(String value) {
            addCriterion("Diagnosis <", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisLessThanOrEqualTo(String value) {
            addCriterion("Diagnosis <=", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisLike(String value) {
            addCriterion("Diagnosis like", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNotLike(String value) {
            addCriterion("Diagnosis not like", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIn(List<String> values) {
            addCriterion("Diagnosis in", values, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNotIn(List<String> values) {
            addCriterion("Diagnosis not in", values, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisBetween(String value1, String value2) {
            addCriterion("Diagnosis between", value1, value2, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNotBetween(String value1, String value2) {
            addCriterion("Diagnosis not between", value1, value2, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andBasismyocardialenzymesIsNull() {
            addCriterion("BasisMyocardialEnzymes is null");
            return (Criteria) this;
        }

        public Criteria andBasismyocardialenzymesIsNotNull() {
            addCriterion("BasisMyocardialEnzymes is not null");
            return (Criteria) this;
        }

        public Criteria andBasismyocardialenzymesEqualTo(String value) {
            addCriterion("BasisMyocardialEnzymes =", value, "basismyocardialenzymes");
            return (Criteria) this;
        }

        public Criteria andBasismyocardialenzymesNotEqualTo(String value) {
            addCriterion("BasisMyocardialEnzymes <>", value, "basismyocardialenzymes");
            return (Criteria) this;
        }

        public Criteria andBasismyocardialenzymesGreaterThan(String value) {
            addCriterion("BasisMyocardialEnzymes >", value, "basismyocardialenzymes");
            return (Criteria) this;
        }

        public Criteria andBasismyocardialenzymesGreaterThanOrEqualTo(String value) {
            addCriterion("BasisMyocardialEnzymes >=", value, "basismyocardialenzymes");
            return (Criteria) this;
        }

        public Criteria andBasismyocardialenzymesLessThan(String value) {
            addCriterion("BasisMyocardialEnzymes <", value, "basismyocardialenzymes");
            return (Criteria) this;
        }

        public Criteria andBasismyocardialenzymesLessThanOrEqualTo(String value) {
            addCriterion("BasisMyocardialEnzymes <=", value, "basismyocardialenzymes");
            return (Criteria) this;
        }

        public Criteria andBasismyocardialenzymesLike(String value) {
            addCriterion("BasisMyocardialEnzymes like", value, "basismyocardialenzymes");
            return (Criteria) this;
        }

        public Criteria andBasismyocardialenzymesNotLike(String value) {
            addCriterion("BasisMyocardialEnzymes not like", value, "basismyocardialenzymes");
            return (Criteria) this;
        }

        public Criteria andBasismyocardialenzymesIn(List<String> values) {
            addCriterion("BasisMyocardialEnzymes in", values, "basismyocardialenzymes");
            return (Criteria) this;
        }

        public Criteria andBasismyocardialenzymesNotIn(List<String> values) {
            addCriterion("BasisMyocardialEnzymes not in", values, "basismyocardialenzymes");
            return (Criteria) this;
        }

        public Criteria andBasismyocardialenzymesBetween(String value1, String value2) {
            addCriterion("BasisMyocardialEnzymes between", value1, value2, "basismyocardialenzymes");
            return (Criteria) this;
        }

        public Criteria andBasismyocardialenzymesNotBetween(String value1, String value2) {
            addCriterion("BasisMyocardialEnzymes not between", value1, value2, "basismyocardialenzymes");
            return (Criteria) this;
        }

        public Criteria andBasisecgIsNull() {
            addCriterion("BasisECG is null");
            return (Criteria) this;
        }

        public Criteria andBasisecgIsNotNull() {
            addCriterion("BasisECG is not null");
            return (Criteria) this;
        }

        public Criteria andBasisecgEqualTo(String value) {
            addCriterion("BasisECG =", value, "basisecg");
            return (Criteria) this;
        }

        public Criteria andBasisecgNotEqualTo(String value) {
            addCriterion("BasisECG <>", value, "basisecg");
            return (Criteria) this;
        }

        public Criteria andBasisecgGreaterThan(String value) {
            addCriterion("BasisECG >", value, "basisecg");
            return (Criteria) this;
        }

        public Criteria andBasisecgGreaterThanOrEqualTo(String value) {
            addCriterion("BasisECG >=", value, "basisecg");
            return (Criteria) this;
        }

        public Criteria andBasisecgLessThan(String value) {
            addCriterion("BasisECG <", value, "basisecg");
            return (Criteria) this;
        }

        public Criteria andBasisecgLessThanOrEqualTo(String value) {
            addCriterion("BasisECG <=", value, "basisecg");
            return (Criteria) this;
        }

        public Criteria andBasisecgLike(String value) {
            addCriterion("BasisECG like", value, "basisecg");
            return (Criteria) this;
        }

        public Criteria andBasisecgNotLike(String value) {
            addCriterion("BasisECG not like", value, "basisecg");
            return (Criteria) this;
        }

        public Criteria andBasisecgIn(List<String> values) {
            addCriterion("BasisECG in", values, "basisecg");
            return (Criteria) this;
        }

        public Criteria andBasisecgNotIn(List<String> values) {
            addCriterion("BasisECG not in", values, "basisecg");
            return (Criteria) this;
        }

        public Criteria andBasisecgBetween(String value1, String value2) {
            addCriterion("BasisECG between", value1, value2, "basisecg");
            return (Criteria) this;
        }

        public Criteria andBasisecgNotBetween(String value1, String value2) {
            addCriterion("BasisECG not between", value1, value2, "basisecg");
            return (Criteria) this;
        }

        public Criteria andBasiscoronaryangiographyIsNull() {
            addCriterion("BasisCoronaryAngiography is null");
            return (Criteria) this;
        }

        public Criteria andBasiscoronaryangiographyIsNotNull() {
            addCriterion("BasisCoronaryAngiography is not null");
            return (Criteria) this;
        }

        public Criteria andBasiscoronaryangiographyEqualTo(String value) {
            addCriterion("BasisCoronaryAngiography =", value, "basiscoronaryangiography");
            return (Criteria) this;
        }

        public Criteria andBasiscoronaryangiographyNotEqualTo(String value) {
            addCriterion("BasisCoronaryAngiography <>", value, "basiscoronaryangiography");
            return (Criteria) this;
        }

        public Criteria andBasiscoronaryangiographyGreaterThan(String value) {
            addCriterion("BasisCoronaryAngiography >", value, "basiscoronaryangiography");
            return (Criteria) this;
        }

        public Criteria andBasiscoronaryangiographyGreaterThanOrEqualTo(String value) {
            addCriterion("BasisCoronaryAngiography >=", value, "basiscoronaryangiography");
            return (Criteria) this;
        }

        public Criteria andBasiscoronaryangiographyLessThan(String value) {
            addCriterion("BasisCoronaryAngiography <", value, "basiscoronaryangiography");
            return (Criteria) this;
        }

        public Criteria andBasiscoronaryangiographyLessThanOrEqualTo(String value) {
            addCriterion("BasisCoronaryAngiography <=", value, "basiscoronaryangiography");
            return (Criteria) this;
        }

        public Criteria andBasiscoronaryangiographyLike(String value) {
            addCriterion("BasisCoronaryAngiography like", value, "basiscoronaryangiography");
            return (Criteria) this;
        }

        public Criteria andBasiscoronaryangiographyNotLike(String value) {
            addCriterion("BasisCoronaryAngiography not like", value, "basiscoronaryangiography");
            return (Criteria) this;
        }

        public Criteria andBasiscoronaryangiographyIn(List<String> values) {
            addCriterion("BasisCoronaryAngiography in", values, "basiscoronaryangiography");
            return (Criteria) this;
        }

        public Criteria andBasiscoronaryangiographyNotIn(List<String> values) {
            addCriterion("BasisCoronaryAngiography not in", values, "basiscoronaryangiography");
            return (Criteria) this;
        }

        public Criteria andBasiscoronaryangiographyBetween(String value1, String value2) {
            addCriterion("BasisCoronaryAngiography between", value1, value2, "basiscoronaryangiography");
            return (Criteria) this;
        }

        public Criteria andBasiscoronaryangiographyNotBetween(String value1, String value2) {
            addCriterion("BasisCoronaryAngiography not between", value1, value2, "basiscoronaryangiography");
            return (Criteria) this;
        }

        public Criteria andClinicalIsNull() {
            addCriterion("Clinical is null");
            return (Criteria) this;
        }

        public Criteria andClinicalIsNotNull() {
            addCriterion("Clinical is not null");
            return (Criteria) this;
        }

        public Criteria andClinicalEqualTo(String value) {
            addCriterion("Clinical =", value, "clinical");
            return (Criteria) this;
        }

        public Criteria andClinicalNotEqualTo(String value) {
            addCriterion("Clinical <>", value, "clinical");
            return (Criteria) this;
        }

        public Criteria andClinicalGreaterThan(String value) {
            addCriterion("Clinical >", value, "clinical");
            return (Criteria) this;
        }

        public Criteria andClinicalGreaterThanOrEqualTo(String value) {
            addCriterion("Clinical >=", value, "clinical");
            return (Criteria) this;
        }

        public Criteria andClinicalLessThan(String value) {
            addCriterion("Clinical <", value, "clinical");
            return (Criteria) this;
        }

        public Criteria andClinicalLessThanOrEqualTo(String value) {
            addCriterion("Clinical <=", value, "clinical");
            return (Criteria) this;
        }

        public Criteria andClinicalLike(String value) {
            addCriterion("Clinical like", value, "clinical");
            return (Criteria) this;
        }

        public Criteria andClinicalNotLike(String value) {
            addCriterion("Clinical not like", value, "clinical");
            return (Criteria) this;
        }

        public Criteria andClinicalIn(List<String> values) {
            addCriterion("Clinical in", values, "clinical");
            return (Criteria) this;
        }

        public Criteria andClinicalNotIn(List<String> values) {
            addCriterion("Clinical not in", values, "clinical");
            return (Criteria) this;
        }

        public Criteria andClinicalBetween(String value1, String value2) {
            addCriterion("Clinical between", value1, value2, "clinical");
            return (Criteria) this;
        }

        public Criteria andClinicalNotBetween(String value1, String value2) {
            addCriterion("Clinical not between", value1, value2, "clinical");
            return (Criteria) this;
        }

        public Criteria andFirsttimeIsNull() {
            addCriterion("FirstTime is null");
            return (Criteria) this;
        }

        public Criteria andFirsttimeIsNotNull() {
            addCriterion("FirstTime is not null");
            return (Criteria) this;
        }

        public Criteria andFirsttimeEqualTo(Date value) {
            addCriterionForJDBCDate("FirstTime =", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("FirstTime <>", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("FirstTime >", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FirstTime >=", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeLessThan(Date value) {
            addCriterionForJDBCDate("FirstTime <", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FirstTime <=", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeIn(List<Date> values) {
            addCriterionForJDBCDate("FirstTime in", values, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("FirstTime not in", values, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FirstTime between", value1, value2, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FirstTime not between", value1, value2, "firsttime");
            return (Criteria) this;
        }

        public Criteria andIsplateletIsNull() {
            addCriterion("IsPlatelet is null");
            return (Criteria) this;
        }

        public Criteria andIsplateletIsNotNull() {
            addCriterion("IsPlatelet is not null");
            return (Criteria) this;
        }

        public Criteria andIsplateletEqualTo(String value) {
            addCriterion("IsPlatelet =", value, "isplatelet");
            return (Criteria) this;
        }

        public Criteria andIsplateletNotEqualTo(String value) {
            addCriterion("IsPlatelet <>", value, "isplatelet");
            return (Criteria) this;
        }

        public Criteria andIsplateletGreaterThan(String value) {
            addCriterion("IsPlatelet >", value, "isplatelet");
            return (Criteria) this;
        }

        public Criteria andIsplateletGreaterThanOrEqualTo(String value) {
            addCriterion("IsPlatelet >=", value, "isplatelet");
            return (Criteria) this;
        }

        public Criteria andIsplateletLessThan(String value) {
            addCriterion("IsPlatelet <", value, "isplatelet");
            return (Criteria) this;
        }

        public Criteria andIsplateletLessThanOrEqualTo(String value) {
            addCriterion("IsPlatelet <=", value, "isplatelet");
            return (Criteria) this;
        }

        public Criteria andIsplateletLike(String value) {
            addCriterion("IsPlatelet like", value, "isplatelet");
            return (Criteria) this;
        }

        public Criteria andIsplateletNotLike(String value) {
            addCriterion("IsPlatelet not like", value, "isplatelet");
            return (Criteria) this;
        }

        public Criteria andIsplateletIn(List<String> values) {
            addCriterion("IsPlatelet in", values, "isplatelet");
            return (Criteria) this;
        }

        public Criteria andIsplateletNotIn(List<String> values) {
            addCriterion("IsPlatelet not in", values, "isplatelet");
            return (Criteria) this;
        }

        public Criteria andIsplateletBetween(String value1, String value2) {
            addCriterion("IsPlatelet between", value1, value2, "isplatelet");
            return (Criteria) this;
        }

        public Criteria andIsplateletNotBetween(String value1, String value2) {
            addCriterion("IsPlatelet not between", value1, value2, "isplatelet");
            return (Criteria) this;
        }

        public Criteria andIsanticoagulantIsNull() {
            addCriterion("IsAnticoagulant is null");
            return (Criteria) this;
        }

        public Criteria andIsanticoagulantIsNotNull() {
            addCriterion("IsAnticoagulant is not null");
            return (Criteria) this;
        }

        public Criteria andIsanticoagulantEqualTo(String value) {
            addCriterion("IsAnticoagulant =", value, "isanticoagulant");
            return (Criteria) this;
        }

        public Criteria andIsanticoagulantNotEqualTo(String value) {
            addCriterion("IsAnticoagulant <>", value, "isanticoagulant");
            return (Criteria) this;
        }

        public Criteria andIsanticoagulantGreaterThan(String value) {
            addCriterion("IsAnticoagulant >", value, "isanticoagulant");
            return (Criteria) this;
        }

        public Criteria andIsanticoagulantGreaterThanOrEqualTo(String value) {
            addCriterion("IsAnticoagulant >=", value, "isanticoagulant");
            return (Criteria) this;
        }

        public Criteria andIsanticoagulantLessThan(String value) {
            addCriterion("IsAnticoagulant <", value, "isanticoagulant");
            return (Criteria) this;
        }

        public Criteria andIsanticoagulantLessThanOrEqualTo(String value) {
            addCriterion("IsAnticoagulant <=", value, "isanticoagulant");
            return (Criteria) this;
        }

        public Criteria andIsanticoagulantLike(String value) {
            addCriterion("IsAnticoagulant like", value, "isanticoagulant");
            return (Criteria) this;
        }

        public Criteria andIsanticoagulantNotLike(String value) {
            addCriterion("IsAnticoagulant not like", value, "isanticoagulant");
            return (Criteria) this;
        }

        public Criteria andIsanticoagulantIn(List<String> values) {
            addCriterion("IsAnticoagulant in", values, "isanticoagulant");
            return (Criteria) this;
        }

        public Criteria andIsanticoagulantNotIn(List<String> values) {
            addCriterion("IsAnticoagulant not in", values, "isanticoagulant");
            return (Criteria) this;
        }

        public Criteria andIsanticoagulantBetween(String value1, String value2) {
            addCriterion("IsAnticoagulant between", value1, value2, "isanticoagulant");
            return (Criteria) this;
        }

        public Criteria andIsanticoagulantNotBetween(String value1, String value2) {
            addCriterion("IsAnticoagulant not between", value1, value2, "isanticoagulant");
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