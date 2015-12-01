package com.penzias.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class KidneyDiseaseHostoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KidneyDiseaseHostoryExample() {
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

        public Criteria andKidneydiseasehistoryidIsNull() {
            addCriterion("KidneyDiseaseHistoryID is null");
            return (Criteria) this;
        }

        public Criteria andKidneydiseasehistoryidIsNotNull() {
            addCriterion("KidneyDiseaseHistoryID is not null");
            return (Criteria) this;
        }

        public Criteria andKidneydiseasehistoryidEqualTo(Integer value) {
            addCriterion("KidneyDiseaseHistoryID =", value, "kidneydiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andKidneydiseasehistoryidNotEqualTo(Integer value) {
            addCriterion("KidneyDiseaseHistoryID <>", value, "kidneydiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andKidneydiseasehistoryidGreaterThan(Integer value) {
            addCriterion("KidneyDiseaseHistoryID >", value, "kidneydiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andKidneydiseasehistoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("KidneyDiseaseHistoryID >=", value, "kidneydiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andKidneydiseasehistoryidLessThan(Integer value) {
            addCriterion("KidneyDiseaseHistoryID <", value, "kidneydiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andKidneydiseasehistoryidLessThanOrEqualTo(Integer value) {
            addCriterion("KidneyDiseaseHistoryID <=", value, "kidneydiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andKidneydiseasehistoryidIn(List<Integer> values) {
            addCriterion("KidneyDiseaseHistoryID in", values, "kidneydiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andKidneydiseasehistoryidNotIn(List<Integer> values) {
            addCriterion("KidneyDiseaseHistoryID not in", values, "kidneydiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andKidneydiseasehistoryidBetween(Integer value1, Integer value2) {
            addCriterion("KidneyDiseaseHistoryID between", value1, value2, "kidneydiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andKidneydiseasehistoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("KidneyDiseaseHistoryID not between", value1, value2, "kidneydiseasehistoryid");
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

        public Criteria andIskidneydiseaseIsNull() {
            addCriterion("IsKidneyDisease is null");
            return (Criteria) this;
        }

        public Criteria andIskidneydiseaseIsNotNull() {
            addCriterion("IsKidneyDisease is not null");
            return (Criteria) this;
        }

        public Criteria andIskidneydiseaseEqualTo(String value) {
            addCriterion("IsKidneyDisease =", value, "iskidneydisease");
            return (Criteria) this;
        }

        public Criteria andIskidneydiseaseNotEqualTo(String value) {
            addCriterion("IsKidneyDisease <>", value, "iskidneydisease");
            return (Criteria) this;
        }

        public Criteria andIskidneydiseaseGreaterThan(String value) {
            addCriterion("IsKidneyDisease >", value, "iskidneydisease");
            return (Criteria) this;
        }

        public Criteria andIskidneydiseaseGreaterThanOrEqualTo(String value) {
            addCriterion("IsKidneyDisease >=", value, "iskidneydisease");
            return (Criteria) this;
        }

        public Criteria andIskidneydiseaseLessThan(String value) {
            addCriterion("IsKidneyDisease <", value, "iskidneydisease");
            return (Criteria) this;
        }

        public Criteria andIskidneydiseaseLessThanOrEqualTo(String value) {
            addCriterion("IsKidneyDisease <=", value, "iskidneydisease");
            return (Criteria) this;
        }

        public Criteria andIskidneydiseaseLike(String value) {
            addCriterion("IsKidneyDisease like", value, "iskidneydisease");
            return (Criteria) this;
        }

        public Criteria andIskidneydiseaseNotLike(String value) {
            addCriterion("IsKidneyDisease not like", value, "iskidneydisease");
            return (Criteria) this;
        }

        public Criteria andIskidneydiseaseIn(List<String> values) {
            addCriterion("IsKidneyDisease in", values, "iskidneydisease");
            return (Criteria) this;
        }

        public Criteria andIskidneydiseaseNotIn(List<String> values) {
            addCriterion("IsKidneyDisease not in", values, "iskidneydisease");
            return (Criteria) this;
        }

        public Criteria andIskidneydiseaseBetween(String value1, String value2) {
            addCriterion("IsKidneyDisease between", value1, value2, "iskidneydisease");
            return (Criteria) this;
        }

        public Criteria andIskidneydiseaseNotBetween(String value1, String value2) {
            addCriterion("IsKidneyDisease not between", value1, value2, "iskidneydisease");
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

        public Criteria andRenalfailureIsNull() {
            addCriterion("RenalFailure is null");
            return (Criteria) this;
        }

        public Criteria andRenalfailureIsNotNull() {
            addCriterion("RenalFailure is not null");
            return (Criteria) this;
        }

        public Criteria andRenalfailureEqualTo(String value) {
            addCriterion("RenalFailure =", value, "renalfailure");
            return (Criteria) this;
        }

        public Criteria andRenalfailureNotEqualTo(String value) {
            addCriterion("RenalFailure <>", value, "renalfailure");
            return (Criteria) this;
        }

        public Criteria andRenalfailureGreaterThan(String value) {
            addCriterion("RenalFailure >", value, "renalfailure");
            return (Criteria) this;
        }

        public Criteria andRenalfailureGreaterThanOrEqualTo(String value) {
            addCriterion("RenalFailure >=", value, "renalfailure");
            return (Criteria) this;
        }

        public Criteria andRenalfailureLessThan(String value) {
            addCriterion("RenalFailure <", value, "renalfailure");
            return (Criteria) this;
        }

        public Criteria andRenalfailureLessThanOrEqualTo(String value) {
            addCriterion("RenalFailure <=", value, "renalfailure");
            return (Criteria) this;
        }

        public Criteria andRenalfailureLike(String value) {
            addCriterion("RenalFailure like", value, "renalfailure");
            return (Criteria) this;
        }

        public Criteria andRenalfailureNotLike(String value) {
            addCriterion("RenalFailure not like", value, "renalfailure");
            return (Criteria) this;
        }

        public Criteria andRenalfailureIn(List<String> values) {
            addCriterion("RenalFailure in", values, "renalfailure");
            return (Criteria) this;
        }

        public Criteria andRenalfailureNotIn(List<String> values) {
            addCriterion("RenalFailure not in", values, "renalfailure");
            return (Criteria) this;
        }

        public Criteria andRenalfailureBetween(String value1, String value2) {
            addCriterion("RenalFailure between", value1, value2, "renalfailure");
            return (Criteria) this;
        }

        public Criteria andRenalfailureNotBetween(String value1, String value2) {
            addCriterion("RenalFailure not between", value1, value2, "renalfailure");
            return (Criteria) this;
        }

        public Criteria andAcutenephritisIsNull() {
            addCriterion("AcuteNephritis is null");
            return (Criteria) this;
        }

        public Criteria andAcutenephritisIsNotNull() {
            addCriterion("AcuteNephritis is not null");
            return (Criteria) this;
        }

        public Criteria andAcutenephritisEqualTo(String value) {
            addCriterion("AcuteNephritis =", value, "acutenephritis");
            return (Criteria) this;
        }

        public Criteria andAcutenephritisNotEqualTo(String value) {
            addCriterion("AcuteNephritis <>", value, "acutenephritis");
            return (Criteria) this;
        }

        public Criteria andAcutenephritisGreaterThan(String value) {
            addCriterion("AcuteNephritis >", value, "acutenephritis");
            return (Criteria) this;
        }

        public Criteria andAcutenephritisGreaterThanOrEqualTo(String value) {
            addCriterion("AcuteNephritis >=", value, "acutenephritis");
            return (Criteria) this;
        }

        public Criteria andAcutenephritisLessThan(String value) {
            addCriterion("AcuteNephritis <", value, "acutenephritis");
            return (Criteria) this;
        }

        public Criteria andAcutenephritisLessThanOrEqualTo(String value) {
            addCriterion("AcuteNephritis <=", value, "acutenephritis");
            return (Criteria) this;
        }

        public Criteria andAcutenephritisLike(String value) {
            addCriterion("AcuteNephritis like", value, "acutenephritis");
            return (Criteria) this;
        }

        public Criteria andAcutenephritisNotLike(String value) {
            addCriterion("AcuteNephritis not like", value, "acutenephritis");
            return (Criteria) this;
        }

        public Criteria andAcutenephritisIn(List<String> values) {
            addCriterion("AcuteNephritis in", values, "acutenephritis");
            return (Criteria) this;
        }

        public Criteria andAcutenephritisNotIn(List<String> values) {
            addCriterion("AcuteNephritis not in", values, "acutenephritis");
            return (Criteria) this;
        }

        public Criteria andAcutenephritisBetween(String value1, String value2) {
            addCriterion("AcuteNephritis between", value1, value2, "acutenephritis");
            return (Criteria) this;
        }

        public Criteria andAcutenephritisNotBetween(String value1, String value2) {
            addCriterion("AcuteNephritis not between", value1, value2, "acutenephritis");
            return (Criteria) this;
        }

        public Criteria andChronicnephritisIsNull() {
            addCriterion("ChronicNephritis is null");
            return (Criteria) this;
        }

        public Criteria andChronicnephritisIsNotNull() {
            addCriterion("ChronicNephritis is not null");
            return (Criteria) this;
        }

        public Criteria andChronicnephritisEqualTo(String value) {
            addCriterion("ChronicNephritis =", value, "chronicnephritis");
            return (Criteria) this;
        }

        public Criteria andChronicnephritisNotEqualTo(String value) {
            addCriterion("ChronicNephritis <>", value, "chronicnephritis");
            return (Criteria) this;
        }

        public Criteria andChronicnephritisGreaterThan(String value) {
            addCriterion("ChronicNephritis >", value, "chronicnephritis");
            return (Criteria) this;
        }

        public Criteria andChronicnephritisGreaterThanOrEqualTo(String value) {
            addCriterion("ChronicNephritis >=", value, "chronicnephritis");
            return (Criteria) this;
        }

        public Criteria andChronicnephritisLessThan(String value) {
            addCriterion("ChronicNephritis <", value, "chronicnephritis");
            return (Criteria) this;
        }

        public Criteria andChronicnephritisLessThanOrEqualTo(String value) {
            addCriterion("ChronicNephritis <=", value, "chronicnephritis");
            return (Criteria) this;
        }

        public Criteria andChronicnephritisLike(String value) {
            addCriterion("ChronicNephritis like", value, "chronicnephritis");
            return (Criteria) this;
        }

        public Criteria andChronicnephritisNotLike(String value) {
            addCriterion("ChronicNephritis not like", value, "chronicnephritis");
            return (Criteria) this;
        }

        public Criteria andChronicnephritisIn(List<String> values) {
            addCriterion("ChronicNephritis in", values, "chronicnephritis");
            return (Criteria) this;
        }

        public Criteria andChronicnephritisNotIn(List<String> values) {
            addCriterion("ChronicNephritis not in", values, "chronicnephritis");
            return (Criteria) this;
        }

        public Criteria andChronicnephritisBetween(String value1, String value2) {
            addCriterion("ChronicNephritis between", value1, value2, "chronicnephritis");
            return (Criteria) this;
        }

        public Criteria andChronicnephritisNotBetween(String value1, String value2) {
            addCriterion("ChronicNephritis not between", value1, value2, "chronicnephritis");
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