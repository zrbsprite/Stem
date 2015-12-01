package com.penzias.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DiabetesHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiabetesHistoryExample() {
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

        public Criteria andDiabeteshistoryidIsNull() {
            addCriterion("DiabetesHistoryID is null");
            return (Criteria) this;
        }

        public Criteria andDiabeteshistoryidIsNotNull() {
            addCriterion("DiabetesHistoryID is not null");
            return (Criteria) this;
        }

        public Criteria andDiabeteshistoryidEqualTo(Integer value) {
            addCriterion("DiabetesHistoryID =", value, "diabeteshistoryid");
            return (Criteria) this;
        }

        public Criteria andDiabeteshistoryidNotEqualTo(Integer value) {
            addCriterion("DiabetesHistoryID <>", value, "diabeteshistoryid");
            return (Criteria) this;
        }

        public Criteria andDiabeteshistoryidGreaterThan(Integer value) {
            addCriterion("DiabetesHistoryID >", value, "diabeteshistoryid");
            return (Criteria) this;
        }

        public Criteria andDiabeteshistoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DiabetesHistoryID >=", value, "diabeteshistoryid");
            return (Criteria) this;
        }

        public Criteria andDiabeteshistoryidLessThan(Integer value) {
            addCriterion("DiabetesHistoryID <", value, "diabeteshistoryid");
            return (Criteria) this;
        }

        public Criteria andDiabeteshistoryidLessThanOrEqualTo(Integer value) {
            addCriterion("DiabetesHistoryID <=", value, "diabeteshistoryid");
            return (Criteria) this;
        }

        public Criteria andDiabeteshistoryidIn(List<Integer> values) {
            addCriterion("DiabetesHistoryID in", values, "diabeteshistoryid");
            return (Criteria) this;
        }

        public Criteria andDiabeteshistoryidNotIn(List<Integer> values) {
            addCriterion("DiabetesHistoryID not in", values, "diabeteshistoryid");
            return (Criteria) this;
        }

        public Criteria andDiabeteshistoryidBetween(Integer value1, Integer value2) {
            addCriterion("DiabetesHistoryID between", value1, value2, "diabeteshistoryid");
            return (Criteria) this;
        }

        public Criteria andDiabeteshistoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("DiabetesHistoryID not between", value1, value2, "diabeteshistoryid");
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

        public Criteria andIsdiabetesIsNull() {
            addCriterion("IsDiabetes is null");
            return (Criteria) this;
        }

        public Criteria andIsdiabetesIsNotNull() {
            addCriterion("IsDiabetes is not null");
            return (Criteria) this;
        }

        public Criteria andIsdiabetesEqualTo(String value) {
            addCriterion("IsDiabetes =", value, "isdiabetes");
            return (Criteria) this;
        }

        public Criteria andIsdiabetesNotEqualTo(String value) {
            addCriterion("IsDiabetes <>", value, "isdiabetes");
            return (Criteria) this;
        }

        public Criteria andIsdiabetesGreaterThan(String value) {
            addCriterion("IsDiabetes >", value, "isdiabetes");
            return (Criteria) this;
        }

        public Criteria andIsdiabetesGreaterThanOrEqualTo(String value) {
            addCriterion("IsDiabetes >=", value, "isdiabetes");
            return (Criteria) this;
        }

        public Criteria andIsdiabetesLessThan(String value) {
            addCriterion("IsDiabetes <", value, "isdiabetes");
            return (Criteria) this;
        }

        public Criteria andIsdiabetesLessThanOrEqualTo(String value) {
            addCriterion("IsDiabetes <=", value, "isdiabetes");
            return (Criteria) this;
        }

        public Criteria andIsdiabetesLike(String value) {
            addCriterion("IsDiabetes like", value, "isdiabetes");
            return (Criteria) this;
        }

        public Criteria andIsdiabetesNotLike(String value) {
            addCriterion("IsDiabetes not like", value, "isdiabetes");
            return (Criteria) this;
        }

        public Criteria andIsdiabetesIn(List<String> values) {
            addCriterion("IsDiabetes in", values, "isdiabetes");
            return (Criteria) this;
        }

        public Criteria andIsdiabetesNotIn(List<String> values) {
            addCriterion("IsDiabetes not in", values, "isdiabetes");
            return (Criteria) this;
        }

        public Criteria andIsdiabetesBetween(String value1, String value2) {
            addCriterion("IsDiabetes between", value1, value2, "isdiabetes");
            return (Criteria) this;
        }

        public Criteria andIsdiabetesNotBetween(String value1, String value2) {
            addCriterion("IsDiabetes not between", value1, value2, "isdiabetes");
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

        public Criteria andIshypoglycemicIsNull() {
            addCriterion("IsHypoglycemic is null");
            return (Criteria) this;
        }

        public Criteria andIshypoglycemicIsNotNull() {
            addCriterion("IsHypoglycemic is not null");
            return (Criteria) this;
        }

        public Criteria andIshypoglycemicEqualTo(String value) {
            addCriterion("IsHypoglycemic =", value, "ishypoglycemic");
            return (Criteria) this;
        }

        public Criteria andIshypoglycemicNotEqualTo(String value) {
            addCriterion("IsHypoglycemic <>", value, "ishypoglycemic");
            return (Criteria) this;
        }

        public Criteria andIshypoglycemicGreaterThan(String value) {
            addCriterion("IsHypoglycemic >", value, "ishypoglycemic");
            return (Criteria) this;
        }

        public Criteria andIshypoglycemicGreaterThanOrEqualTo(String value) {
            addCriterion("IsHypoglycemic >=", value, "ishypoglycemic");
            return (Criteria) this;
        }

        public Criteria andIshypoglycemicLessThan(String value) {
            addCriterion("IsHypoglycemic <", value, "ishypoglycemic");
            return (Criteria) this;
        }

        public Criteria andIshypoglycemicLessThanOrEqualTo(String value) {
            addCriterion("IsHypoglycemic <=", value, "ishypoglycemic");
            return (Criteria) this;
        }

        public Criteria andIshypoglycemicLike(String value) {
            addCriterion("IsHypoglycemic like", value, "ishypoglycemic");
            return (Criteria) this;
        }

        public Criteria andIshypoglycemicNotLike(String value) {
            addCriterion("IsHypoglycemic not like", value, "ishypoglycemic");
            return (Criteria) this;
        }

        public Criteria andIshypoglycemicIn(List<String> values) {
            addCriterion("IsHypoglycemic in", values, "ishypoglycemic");
            return (Criteria) this;
        }

        public Criteria andIshypoglycemicNotIn(List<String> values) {
            addCriterion("IsHypoglycemic not in", values, "ishypoglycemic");
            return (Criteria) this;
        }

        public Criteria andIshypoglycemicBetween(String value1, String value2) {
            addCriterion("IsHypoglycemic between", value1, value2, "ishypoglycemic");
            return (Criteria) this;
        }

        public Criteria andIshypoglycemicNotBetween(String value1, String value2) {
            addCriterion("IsHypoglycemic not between", value1, value2, "ishypoglycemic");
            return (Criteria) this;
        }

        public Criteria andIsinsulinIsNull() {
            addCriterion("IsInsulin is null");
            return (Criteria) this;
        }

        public Criteria andIsinsulinIsNotNull() {
            addCriterion("IsInsulin is not null");
            return (Criteria) this;
        }

        public Criteria andIsinsulinEqualTo(String value) {
            addCriterion("IsInsulin =", value, "isinsulin");
            return (Criteria) this;
        }

        public Criteria andIsinsulinNotEqualTo(String value) {
            addCriterion("IsInsulin <>", value, "isinsulin");
            return (Criteria) this;
        }

        public Criteria andIsinsulinGreaterThan(String value) {
            addCriterion("IsInsulin >", value, "isinsulin");
            return (Criteria) this;
        }

        public Criteria andIsinsulinGreaterThanOrEqualTo(String value) {
            addCriterion("IsInsulin >=", value, "isinsulin");
            return (Criteria) this;
        }

        public Criteria andIsinsulinLessThan(String value) {
            addCriterion("IsInsulin <", value, "isinsulin");
            return (Criteria) this;
        }

        public Criteria andIsinsulinLessThanOrEqualTo(String value) {
            addCriterion("IsInsulin <=", value, "isinsulin");
            return (Criteria) this;
        }

        public Criteria andIsinsulinLike(String value) {
            addCriterion("IsInsulin like", value, "isinsulin");
            return (Criteria) this;
        }

        public Criteria andIsinsulinNotLike(String value) {
            addCriterion("IsInsulin not like", value, "isinsulin");
            return (Criteria) this;
        }

        public Criteria andIsinsulinIn(List<String> values) {
            addCriterion("IsInsulin in", values, "isinsulin");
            return (Criteria) this;
        }

        public Criteria andIsinsulinNotIn(List<String> values) {
            addCriterion("IsInsulin not in", values, "isinsulin");
            return (Criteria) this;
        }

        public Criteria andIsinsulinBetween(String value1, String value2) {
            addCriterion("IsInsulin between", value1, value2, "isinsulin");
            return (Criteria) this;
        }

        public Criteria andIsinsulinNotBetween(String value1, String value2) {
            addCriterion("IsInsulin not between", value1, value2, "isinsulin");
            return (Criteria) this;
        }

        public Criteria andPharmacysituationIsNull() {
            addCriterion("PharmacySituation is null");
            return (Criteria) this;
        }

        public Criteria andPharmacysituationIsNotNull() {
            addCriterion("PharmacySituation is not null");
            return (Criteria) this;
        }

        public Criteria andPharmacysituationEqualTo(String value) {
            addCriterion("PharmacySituation =", value, "pharmacysituation");
            return (Criteria) this;
        }

        public Criteria andPharmacysituationNotEqualTo(String value) {
            addCriterion("PharmacySituation <>", value, "pharmacysituation");
            return (Criteria) this;
        }

        public Criteria andPharmacysituationGreaterThan(String value) {
            addCriterion("PharmacySituation >", value, "pharmacysituation");
            return (Criteria) this;
        }

        public Criteria andPharmacysituationGreaterThanOrEqualTo(String value) {
            addCriterion("PharmacySituation >=", value, "pharmacysituation");
            return (Criteria) this;
        }

        public Criteria andPharmacysituationLessThan(String value) {
            addCriterion("PharmacySituation <", value, "pharmacysituation");
            return (Criteria) this;
        }

        public Criteria andPharmacysituationLessThanOrEqualTo(String value) {
            addCriterion("PharmacySituation <=", value, "pharmacysituation");
            return (Criteria) this;
        }

        public Criteria andPharmacysituationLike(String value) {
            addCriterion("PharmacySituation like", value, "pharmacysituation");
            return (Criteria) this;
        }

        public Criteria andPharmacysituationNotLike(String value) {
            addCriterion("PharmacySituation not like", value, "pharmacysituation");
            return (Criteria) this;
        }

        public Criteria andPharmacysituationIn(List<String> values) {
            addCriterion("PharmacySituation in", values, "pharmacysituation");
            return (Criteria) this;
        }

        public Criteria andPharmacysituationNotIn(List<String> values) {
            addCriterion("PharmacySituation not in", values, "pharmacysituation");
            return (Criteria) this;
        }

        public Criteria andPharmacysituationBetween(String value1, String value2) {
            addCriterion("PharmacySituation between", value1, value2, "pharmacysituation");
            return (Criteria) this;
        }

        public Criteria andPharmacysituationNotBetween(String value1, String value2) {
            addCriterion("PharmacySituation not between", value1, value2, "pharmacysituation");
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

        public Criteria andControlyeatIsNull() {
            addCriterion("ControlYeat is null");
            return (Criteria) this;
        }

        public Criteria andControlyeatIsNotNull() {
            addCriterion("ControlYeat is not null");
            return (Criteria) this;
        }

        public Criteria andControlyeatEqualTo(String value) {
            addCriterion("ControlYeat =", value, "controlyeat");
            return (Criteria) this;
        }

        public Criteria andControlyeatNotEqualTo(String value) {
            addCriterion("ControlYeat <>", value, "controlyeat");
            return (Criteria) this;
        }

        public Criteria andControlyeatGreaterThan(String value) {
            addCriterion("ControlYeat >", value, "controlyeat");
            return (Criteria) this;
        }

        public Criteria andControlyeatGreaterThanOrEqualTo(String value) {
            addCriterion("ControlYeat >=", value, "controlyeat");
            return (Criteria) this;
        }

        public Criteria andControlyeatLessThan(String value) {
            addCriterion("ControlYeat <", value, "controlyeat");
            return (Criteria) this;
        }

        public Criteria andControlyeatLessThanOrEqualTo(String value) {
            addCriterion("ControlYeat <=", value, "controlyeat");
            return (Criteria) this;
        }

        public Criteria andControlyeatLike(String value) {
            addCriterion("ControlYeat like", value, "controlyeat");
            return (Criteria) this;
        }

        public Criteria andControlyeatNotLike(String value) {
            addCriterion("ControlYeat not like", value, "controlyeat");
            return (Criteria) this;
        }

        public Criteria andControlyeatIn(List<String> values) {
            addCriterion("ControlYeat in", values, "controlyeat");
            return (Criteria) this;
        }

        public Criteria andControlyeatNotIn(List<String> values) {
            addCriterion("ControlYeat not in", values, "controlyeat");
            return (Criteria) this;
        }

        public Criteria andControlyeatBetween(String value1, String value2) {
            addCriterion("ControlYeat between", value1, value2, "controlyeat");
            return (Criteria) this;
        }

        public Criteria andControlyeatNotBetween(String value1, String value2) {
            addCriterion("ControlYeat not between", value1, value2, "controlyeat");
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