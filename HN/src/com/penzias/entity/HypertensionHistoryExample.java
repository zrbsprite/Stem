package com.penzias.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HypertensionHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HypertensionHistoryExample() {
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

        public Criteria andHypertensionhistoryidIsNull() {
            addCriterion("HypertensionHistoryID is null");
            return (Criteria) this;
        }

        public Criteria andHypertensionhistoryidIsNotNull() {
            addCriterion("HypertensionHistoryID is not null");
            return (Criteria) this;
        }

        public Criteria andHypertensionhistoryidEqualTo(Integer value) {
            addCriterion("HypertensionHistoryID =", value, "hypertensionhistoryid");
            return (Criteria) this;
        }

        public Criteria andHypertensionhistoryidNotEqualTo(Integer value) {
            addCriterion("HypertensionHistoryID <>", value, "hypertensionhistoryid");
            return (Criteria) this;
        }

        public Criteria andHypertensionhistoryidGreaterThan(Integer value) {
            addCriterion("HypertensionHistoryID >", value, "hypertensionhistoryid");
            return (Criteria) this;
        }

        public Criteria andHypertensionhistoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("HypertensionHistoryID >=", value, "hypertensionhistoryid");
            return (Criteria) this;
        }

        public Criteria andHypertensionhistoryidLessThan(Integer value) {
            addCriterion("HypertensionHistoryID <", value, "hypertensionhistoryid");
            return (Criteria) this;
        }

        public Criteria andHypertensionhistoryidLessThanOrEqualTo(Integer value) {
            addCriterion("HypertensionHistoryID <=", value, "hypertensionhistoryid");
            return (Criteria) this;
        }

        public Criteria andHypertensionhistoryidIn(List<Integer> values) {
            addCriterion("HypertensionHistoryID in", values, "hypertensionhistoryid");
            return (Criteria) this;
        }

        public Criteria andHypertensionhistoryidNotIn(List<Integer> values) {
            addCriterion("HypertensionHistoryID not in", values, "hypertensionhistoryid");
            return (Criteria) this;
        }

        public Criteria andHypertensionhistoryidBetween(Integer value1, Integer value2) {
            addCriterion("HypertensionHistoryID between", value1, value2, "hypertensionhistoryid");
            return (Criteria) this;
        }

        public Criteria andHypertensionhistoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("HypertensionHistoryID not between", value1, value2, "hypertensionhistoryid");
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

        public Criteria andFrequencyIsNull() {
            addCriterion("Frequency is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNotNull() {
            addCriterion("Frequency is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyEqualTo(String value) {
            addCriterion("Frequency =", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotEqualTo(String value) {
            addCriterion("Frequency <>", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThan(String value) {
            addCriterion("Frequency >", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("Frequency >=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThan(String value) {
            addCriterion("Frequency <", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThanOrEqualTo(String value) {
            addCriterion("Frequency <=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLike(String value) {
            addCriterion("Frequency like", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotLike(String value) {
            addCriterion("Frequency not like", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyIn(List<String> values) {
            addCriterion("Frequency in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotIn(List<String> values) {
            addCriterion("Frequency not in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyBetween(String value1, String value2) {
            addCriterion("Frequency between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotBetween(String value1, String value2) {
            addCriterion("Frequency not between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andIshypertensionIsNull() {
            addCriterion("IsHypertension is null");
            return (Criteria) this;
        }

        public Criteria andIshypertensionIsNotNull() {
            addCriterion("IsHypertension is not null");
            return (Criteria) this;
        }

        public Criteria andIshypertensionEqualTo(String value) {
            addCriterion("IsHypertension =", value, "ishypertension");
            return (Criteria) this;
        }

        public Criteria andIshypertensionNotEqualTo(String value) {
            addCriterion("IsHypertension <>", value, "ishypertension");
            return (Criteria) this;
        }

        public Criteria andIshypertensionGreaterThan(String value) {
            addCriterion("IsHypertension >", value, "ishypertension");
            return (Criteria) this;
        }

        public Criteria andIshypertensionGreaterThanOrEqualTo(String value) {
            addCriterion("IsHypertension >=", value, "ishypertension");
            return (Criteria) this;
        }

        public Criteria andIshypertensionLessThan(String value) {
            addCriterion("IsHypertension <", value, "ishypertension");
            return (Criteria) this;
        }

        public Criteria andIshypertensionLessThanOrEqualTo(String value) {
            addCriterion("IsHypertension <=", value, "ishypertension");
            return (Criteria) this;
        }

        public Criteria andIshypertensionLike(String value) {
            addCriterion("IsHypertension like", value, "ishypertension");
            return (Criteria) this;
        }

        public Criteria andIshypertensionNotLike(String value) {
            addCriterion("IsHypertension not like", value, "ishypertension");
            return (Criteria) this;
        }

        public Criteria andIshypertensionIn(List<String> values) {
            addCriterion("IsHypertension in", values, "ishypertension");
            return (Criteria) this;
        }

        public Criteria andIshypertensionNotIn(List<String> values) {
            addCriterion("IsHypertension not in", values, "ishypertension");
            return (Criteria) this;
        }

        public Criteria andIshypertensionBetween(String value1, String value2) {
            addCriterion("IsHypertension between", value1, value2, "ishypertension");
            return (Criteria) this;
        }

        public Criteria andIshypertensionNotBetween(String value1, String value2) {
            addCriterion("IsHypertension not between", value1, value2, "ishypertension");
            return (Criteria) this;
        }

        public Criteria andDiagnosistimeIsNull() {
            addCriterion("DiagnosisTime is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosistimeIsNotNull() {
            addCriterion("DiagnosisTime is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosistimeEqualTo(Date value) {
            addCriterionForJDBCDate("DiagnosisTime =", value, "diagnosistime");
            return (Criteria) this;
        }

        public Criteria andDiagnosistimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("DiagnosisTime <>", value, "diagnosistime");
            return (Criteria) this;
        }

        public Criteria andDiagnosistimeGreaterThan(Date value) {
            addCriterionForJDBCDate("DiagnosisTime >", value, "diagnosistime");
            return (Criteria) this;
        }

        public Criteria andDiagnosistimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DiagnosisTime >=", value, "diagnosistime");
            return (Criteria) this;
        }

        public Criteria andDiagnosistimeLessThan(Date value) {
            addCriterionForJDBCDate("DiagnosisTime <", value, "diagnosistime");
            return (Criteria) this;
        }

        public Criteria andDiagnosistimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DiagnosisTime <=", value, "diagnosistime");
            return (Criteria) this;
        }

        public Criteria andDiagnosistimeIn(List<Date> values) {
            addCriterionForJDBCDate("DiagnosisTime in", values, "diagnosistime");
            return (Criteria) this;
        }

        public Criteria andDiagnosistimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("DiagnosisTime not in", values, "diagnosistime");
            return (Criteria) this;
        }

        public Criteria andDiagnosistimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DiagnosisTime between", value1, value2, "diagnosistime");
            return (Criteria) this;
        }

        public Criteria andDiagnosistimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DiagnosisTime not between", value1, value2, "diagnosistime");
            return (Criteria) this;
        }

        public Criteria andIshypotensorIsNull() {
            addCriterion("IsHypotensor is null");
            return (Criteria) this;
        }

        public Criteria andIshypotensorIsNotNull() {
            addCriterion("IsHypotensor is not null");
            return (Criteria) this;
        }

        public Criteria andIshypotensorEqualTo(String value) {
            addCriterion("IsHypotensor =", value, "ishypotensor");
            return (Criteria) this;
        }

        public Criteria andIshypotensorNotEqualTo(String value) {
            addCriterion("IsHypotensor <>", value, "ishypotensor");
            return (Criteria) this;
        }

        public Criteria andIshypotensorGreaterThan(String value) {
            addCriterion("IsHypotensor >", value, "ishypotensor");
            return (Criteria) this;
        }

        public Criteria andIshypotensorGreaterThanOrEqualTo(String value) {
            addCriterion("IsHypotensor >=", value, "ishypotensor");
            return (Criteria) this;
        }

        public Criteria andIshypotensorLessThan(String value) {
            addCriterion("IsHypotensor <", value, "ishypotensor");
            return (Criteria) this;
        }

        public Criteria andIshypotensorLessThanOrEqualTo(String value) {
            addCriterion("IsHypotensor <=", value, "ishypotensor");
            return (Criteria) this;
        }

        public Criteria andIshypotensorLike(String value) {
            addCriterion("IsHypotensor like", value, "ishypotensor");
            return (Criteria) this;
        }

        public Criteria andIshypotensorNotLike(String value) {
            addCriterion("IsHypotensor not like", value, "ishypotensor");
            return (Criteria) this;
        }

        public Criteria andIshypotensorIn(List<String> values) {
            addCriterion("IsHypotensor in", values, "ishypotensor");
            return (Criteria) this;
        }

        public Criteria andIshypotensorNotIn(List<String> values) {
            addCriterion("IsHypotensor not in", values, "ishypotensor");
            return (Criteria) this;
        }

        public Criteria andIshypotensorBetween(String value1, String value2) {
            addCriterion("IsHypotensor between", value1, value2, "ishypotensor");
            return (Criteria) this;
        }

        public Criteria andIshypotensorNotBetween(String value1, String value2) {
            addCriterion("IsHypotensor not between", value1, value2, "ishypotensor");
            return (Criteria) this;
        }

        public Criteria andIscysteineIsNull() {
            addCriterion("IsCysteine is null");
            return (Criteria) this;
        }

        public Criteria andIscysteineIsNotNull() {
            addCriterion("IsCysteine is not null");
            return (Criteria) this;
        }

        public Criteria andIscysteineEqualTo(String value) {
            addCriterion("IsCysteine =", value, "iscysteine");
            return (Criteria) this;
        }

        public Criteria andIscysteineNotEqualTo(String value) {
            addCriterion("IsCysteine <>", value, "iscysteine");
            return (Criteria) this;
        }

        public Criteria andIscysteineGreaterThan(String value) {
            addCriterion("IsCysteine >", value, "iscysteine");
            return (Criteria) this;
        }

        public Criteria andIscysteineGreaterThanOrEqualTo(String value) {
            addCriterion("IsCysteine >=", value, "iscysteine");
            return (Criteria) this;
        }

        public Criteria andIscysteineLessThan(String value) {
            addCriterion("IsCysteine <", value, "iscysteine");
            return (Criteria) this;
        }

        public Criteria andIscysteineLessThanOrEqualTo(String value) {
            addCriterion("IsCysteine <=", value, "iscysteine");
            return (Criteria) this;
        }

        public Criteria andIscysteineLike(String value) {
            addCriterion("IsCysteine like", value, "iscysteine");
            return (Criteria) this;
        }

        public Criteria andIscysteineNotLike(String value) {
            addCriterion("IsCysteine not like", value, "iscysteine");
            return (Criteria) this;
        }

        public Criteria andIscysteineIn(List<String> values) {
            addCriterion("IsCysteine in", values, "iscysteine");
            return (Criteria) this;
        }

        public Criteria andIscysteineNotIn(List<String> values) {
            addCriterion("IsCysteine not in", values, "iscysteine");
            return (Criteria) this;
        }

        public Criteria andIscysteineBetween(String value1, String value2) {
            addCriterion("IsCysteine between", value1, value2, "iscysteine");
            return (Criteria) this;
        }

        public Criteria andIscysteineNotBetween(String value1, String value2) {
            addCriterion("IsCysteine not between", value1, value2, "iscysteine");
            return (Criteria) this;
        }

        public Criteria andControlIsNull() {
            addCriterion("Control is null");
            return (Criteria) this;
        }

        public Criteria andControlIsNotNull() {
            addCriterion("Control is not null");
            return (Criteria) this;
        }

        public Criteria andControlEqualTo(String value) {
            addCriterion("Control =", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlNotEqualTo(String value) {
            addCriterion("Control <>", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlGreaterThan(String value) {
            addCriterion("Control >", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlGreaterThanOrEqualTo(String value) {
            addCriterion("Control >=", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlLessThan(String value) {
            addCriterion("Control <", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlLessThanOrEqualTo(String value) {
            addCriterion("Control <=", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlLike(String value) {
            addCriterion("Control like", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlNotLike(String value) {
            addCriterion("Control not like", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlIn(List<String> values) {
            addCriterion("Control in", values, "control");
            return (Criteria) this;
        }

        public Criteria andControlNotIn(List<String> values) {
            addCriterion("Control not in", values, "control");
            return (Criteria) this;
        }

        public Criteria andControlBetween(String value1, String value2) {
            addCriterion("Control between", value1, value2, "control");
            return (Criteria) this;
        }

        public Criteria andControlNotBetween(String value1, String value2) {
            addCriterion("Control not between", value1, value2, "control");
            return (Criteria) this;
        }

        public Criteria andControlyearIsNull() {
            addCriterion("ControlYear is null");
            return (Criteria) this;
        }

        public Criteria andControlyearIsNotNull() {
            addCriterion("ControlYear is not null");
            return (Criteria) this;
        }

        public Criteria andControlyearEqualTo(String value) {
            addCriterion("ControlYear =", value, "controlyear");
            return (Criteria) this;
        }

        public Criteria andControlyearNotEqualTo(String value) {
            addCriterion("ControlYear <>", value, "controlyear");
            return (Criteria) this;
        }

        public Criteria andControlyearGreaterThan(String value) {
            addCriterion("ControlYear >", value, "controlyear");
            return (Criteria) this;
        }

        public Criteria andControlyearGreaterThanOrEqualTo(String value) {
            addCriterion("ControlYear >=", value, "controlyear");
            return (Criteria) this;
        }

        public Criteria andControlyearLessThan(String value) {
            addCriterion("ControlYear <", value, "controlyear");
            return (Criteria) this;
        }

        public Criteria andControlyearLessThanOrEqualTo(String value) {
            addCriterion("ControlYear <=", value, "controlyear");
            return (Criteria) this;
        }

        public Criteria andControlyearLike(String value) {
            addCriterion("ControlYear like", value, "controlyear");
            return (Criteria) this;
        }

        public Criteria andControlyearNotLike(String value) {
            addCriterion("ControlYear not like", value, "controlyear");
            return (Criteria) this;
        }

        public Criteria andControlyearIn(List<String> values) {
            addCriterion("ControlYear in", values, "controlyear");
            return (Criteria) this;
        }

        public Criteria andControlyearNotIn(List<String> values) {
            addCriterion("ControlYear not in", values, "controlyear");
            return (Criteria) this;
        }

        public Criteria andControlyearBetween(String value1, String value2) {
            addCriterion("ControlYear between", value1, value2, "controlyear");
            return (Criteria) this;
        }

        public Criteria andControlyearNotBetween(String value1, String value2) {
            addCriterion("ControlYear not between", value1, value2, "controlyear");
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