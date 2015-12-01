package com.penzias.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PulmonaryDiseaseHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PulmonaryDiseaseHistoryExample() {
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

        public Criteria andPulmonarydiseasehistoryidIsNull() {
            addCriterion("PulmonaryDiseaseHistoryID is null");
            return (Criteria) this;
        }

        public Criteria andPulmonarydiseasehistoryidIsNotNull() {
            addCriterion("PulmonaryDiseaseHistoryID is not null");
            return (Criteria) this;
        }

        public Criteria andPulmonarydiseasehistoryidEqualTo(Integer value) {
            addCriterion("PulmonaryDiseaseHistoryID =", value, "pulmonarydiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andPulmonarydiseasehistoryidNotEqualTo(Integer value) {
            addCriterion("PulmonaryDiseaseHistoryID <>", value, "pulmonarydiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andPulmonarydiseasehistoryidGreaterThan(Integer value) {
            addCriterion("PulmonaryDiseaseHistoryID >", value, "pulmonarydiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andPulmonarydiseasehistoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PulmonaryDiseaseHistoryID >=", value, "pulmonarydiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andPulmonarydiseasehistoryidLessThan(Integer value) {
            addCriterion("PulmonaryDiseaseHistoryID <", value, "pulmonarydiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andPulmonarydiseasehistoryidLessThanOrEqualTo(Integer value) {
            addCriterion("PulmonaryDiseaseHistoryID <=", value, "pulmonarydiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andPulmonarydiseasehistoryidIn(List<Integer> values) {
            addCriterion("PulmonaryDiseaseHistoryID in", values, "pulmonarydiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andPulmonarydiseasehistoryidNotIn(List<Integer> values) {
            addCriterion("PulmonaryDiseaseHistoryID not in", values, "pulmonarydiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andPulmonarydiseasehistoryidBetween(Integer value1, Integer value2) {
            addCriterion("PulmonaryDiseaseHistoryID between", value1, value2, "pulmonarydiseasehistoryid");
            return (Criteria) this;
        }

        public Criteria andPulmonarydiseasehistoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("PulmonaryDiseaseHistoryID not between", value1, value2, "pulmonarydiseasehistoryid");
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

        public Criteria andIspulmonarydiseaseIsNull() {
            addCriterion("IsPulmonaryDisease is null");
            return (Criteria) this;
        }

        public Criteria andIspulmonarydiseaseIsNotNull() {
            addCriterion("IsPulmonaryDisease is not null");
            return (Criteria) this;
        }

        public Criteria andIspulmonarydiseaseEqualTo(String value) {
            addCriterion("IsPulmonaryDisease =", value, "ispulmonarydisease");
            return (Criteria) this;
        }

        public Criteria andIspulmonarydiseaseNotEqualTo(String value) {
            addCriterion("IsPulmonaryDisease <>", value, "ispulmonarydisease");
            return (Criteria) this;
        }

        public Criteria andIspulmonarydiseaseGreaterThan(String value) {
            addCriterion("IsPulmonaryDisease >", value, "ispulmonarydisease");
            return (Criteria) this;
        }

        public Criteria andIspulmonarydiseaseGreaterThanOrEqualTo(String value) {
            addCriterion("IsPulmonaryDisease >=", value, "ispulmonarydisease");
            return (Criteria) this;
        }

        public Criteria andIspulmonarydiseaseLessThan(String value) {
            addCriterion("IsPulmonaryDisease <", value, "ispulmonarydisease");
            return (Criteria) this;
        }

        public Criteria andIspulmonarydiseaseLessThanOrEqualTo(String value) {
            addCriterion("IsPulmonaryDisease <=", value, "ispulmonarydisease");
            return (Criteria) this;
        }

        public Criteria andIspulmonarydiseaseLike(String value) {
            addCriterion("IsPulmonaryDisease like", value, "ispulmonarydisease");
            return (Criteria) this;
        }

        public Criteria andIspulmonarydiseaseNotLike(String value) {
            addCriterion("IsPulmonaryDisease not like", value, "ispulmonarydisease");
            return (Criteria) this;
        }

        public Criteria andIspulmonarydiseaseIn(List<String> values) {
            addCriterion("IsPulmonaryDisease in", values, "ispulmonarydisease");
            return (Criteria) this;
        }

        public Criteria andIspulmonarydiseaseNotIn(List<String> values) {
            addCriterion("IsPulmonaryDisease not in", values, "ispulmonarydisease");
            return (Criteria) this;
        }

        public Criteria andIspulmonarydiseaseBetween(String value1, String value2) {
            addCriterion("IsPulmonaryDisease between", value1, value2, "ispulmonarydisease");
            return (Criteria) this;
        }

        public Criteria andIspulmonarydiseaseNotBetween(String value1, String value2) {
            addCriterion("IsPulmonaryDisease not between", value1, value2, "ispulmonarydisease");
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

        public Criteria andSlowIsNull() {
            addCriterion("Slow is null");
            return (Criteria) this;
        }

        public Criteria andSlowIsNotNull() {
            addCriterion("Slow is not null");
            return (Criteria) this;
        }

        public Criteria andSlowEqualTo(String value) {
            addCriterion("Slow =", value, "slow");
            return (Criteria) this;
        }

        public Criteria andSlowNotEqualTo(String value) {
            addCriterion("Slow <>", value, "slow");
            return (Criteria) this;
        }

        public Criteria andSlowGreaterThan(String value) {
            addCriterion("Slow >", value, "slow");
            return (Criteria) this;
        }

        public Criteria andSlowGreaterThanOrEqualTo(String value) {
            addCriterion("Slow >=", value, "slow");
            return (Criteria) this;
        }

        public Criteria andSlowLessThan(String value) {
            addCriterion("Slow <", value, "slow");
            return (Criteria) this;
        }

        public Criteria andSlowLessThanOrEqualTo(String value) {
            addCriterion("Slow <=", value, "slow");
            return (Criteria) this;
        }

        public Criteria andSlowLike(String value) {
            addCriterion("Slow like", value, "slow");
            return (Criteria) this;
        }

        public Criteria andSlowNotLike(String value) {
            addCriterion("Slow not like", value, "slow");
            return (Criteria) this;
        }

        public Criteria andSlowIn(List<String> values) {
            addCriterion("Slow in", values, "slow");
            return (Criteria) this;
        }

        public Criteria andSlowNotIn(List<String> values) {
            addCriterion("Slow not in", values, "slow");
            return (Criteria) this;
        }

        public Criteria andSlowBetween(String value1, String value2) {
            addCriterion("Slow between", value1, value2, "slow");
            return (Criteria) this;
        }

        public Criteria andSlowNotBetween(String value1, String value2) {
            addCriterion("Slow not between", value1, value2, "slow");
            return (Criteria) this;
        }

        public Criteria andTurtlelungIsNull() {
            addCriterion("TurtleLung is null");
            return (Criteria) this;
        }

        public Criteria andTurtlelungIsNotNull() {
            addCriterion("TurtleLung is not null");
            return (Criteria) this;
        }

        public Criteria andTurtlelungEqualTo(String value) {
            addCriterion("TurtleLung =", value, "turtlelung");
            return (Criteria) this;
        }

        public Criteria andTurtlelungNotEqualTo(String value) {
            addCriterion("TurtleLung <>", value, "turtlelung");
            return (Criteria) this;
        }

        public Criteria andTurtlelungGreaterThan(String value) {
            addCriterion("TurtleLung >", value, "turtlelung");
            return (Criteria) this;
        }

        public Criteria andTurtlelungGreaterThanOrEqualTo(String value) {
            addCriterion("TurtleLung >=", value, "turtlelung");
            return (Criteria) this;
        }

        public Criteria andTurtlelungLessThan(String value) {
            addCriterion("TurtleLung <", value, "turtlelung");
            return (Criteria) this;
        }

        public Criteria andTurtlelungLessThanOrEqualTo(String value) {
            addCriterion("TurtleLung <=", value, "turtlelung");
            return (Criteria) this;
        }

        public Criteria andTurtlelungLike(String value) {
            addCriterion("TurtleLung like", value, "turtlelung");
            return (Criteria) this;
        }

        public Criteria andTurtlelungNotLike(String value) {
            addCriterion("TurtleLung not like", value, "turtlelung");
            return (Criteria) this;
        }

        public Criteria andTurtlelungIn(List<String> values) {
            addCriterion("TurtleLung in", values, "turtlelung");
            return (Criteria) this;
        }

        public Criteria andTurtlelungNotIn(List<String> values) {
            addCriterion("TurtleLung not in", values, "turtlelung");
            return (Criteria) this;
        }

        public Criteria andTurtlelungBetween(String value1, String value2) {
            addCriterion("TurtleLung between", value1, value2, "turtlelung");
            return (Criteria) this;
        }

        public Criteria andTurtlelungNotBetween(String value1, String value2) {
            addCriterion("TurtleLung not between", value1, value2, "turtlelung");
            return (Criteria) this;
        }

        public Criteria andTuberculosisIsNull() {
            addCriterion("Tuberculosis is null");
            return (Criteria) this;
        }

        public Criteria andTuberculosisIsNotNull() {
            addCriterion("Tuberculosis is not null");
            return (Criteria) this;
        }

        public Criteria andTuberculosisEqualTo(String value) {
            addCriterion("Tuberculosis =", value, "tuberculosis");
            return (Criteria) this;
        }

        public Criteria andTuberculosisNotEqualTo(String value) {
            addCriterion("Tuberculosis <>", value, "tuberculosis");
            return (Criteria) this;
        }

        public Criteria andTuberculosisGreaterThan(String value) {
            addCriterion("Tuberculosis >", value, "tuberculosis");
            return (Criteria) this;
        }

        public Criteria andTuberculosisGreaterThanOrEqualTo(String value) {
            addCriterion("Tuberculosis >=", value, "tuberculosis");
            return (Criteria) this;
        }

        public Criteria andTuberculosisLessThan(String value) {
            addCriterion("Tuberculosis <", value, "tuberculosis");
            return (Criteria) this;
        }

        public Criteria andTuberculosisLessThanOrEqualTo(String value) {
            addCriterion("Tuberculosis <=", value, "tuberculosis");
            return (Criteria) this;
        }

        public Criteria andTuberculosisLike(String value) {
            addCriterion("Tuberculosis like", value, "tuberculosis");
            return (Criteria) this;
        }

        public Criteria andTuberculosisNotLike(String value) {
            addCriterion("Tuberculosis not like", value, "tuberculosis");
            return (Criteria) this;
        }

        public Criteria andTuberculosisIn(List<String> values) {
            addCriterion("Tuberculosis in", values, "tuberculosis");
            return (Criteria) this;
        }

        public Criteria andTuberculosisNotIn(List<String> values) {
            addCriterion("Tuberculosis not in", values, "tuberculosis");
            return (Criteria) this;
        }

        public Criteria andTuberculosisBetween(String value1, String value2) {
            addCriterion("Tuberculosis between", value1, value2, "tuberculosis");
            return (Criteria) this;
        }

        public Criteria andTuberculosisNotBetween(String value1, String value2) {
            addCriterion("Tuberculosis not between", value1, value2, "tuberculosis");
            return (Criteria) this;
        }

        public Criteria andLungtumorIsNull() {
            addCriterion("LungTumor is null");
            return (Criteria) this;
        }

        public Criteria andLungtumorIsNotNull() {
            addCriterion("LungTumor is not null");
            return (Criteria) this;
        }

        public Criteria andLungtumorEqualTo(String value) {
            addCriterion("LungTumor =", value, "lungtumor");
            return (Criteria) this;
        }

        public Criteria andLungtumorNotEqualTo(String value) {
            addCriterion("LungTumor <>", value, "lungtumor");
            return (Criteria) this;
        }

        public Criteria andLungtumorGreaterThan(String value) {
            addCriterion("LungTumor >", value, "lungtumor");
            return (Criteria) this;
        }

        public Criteria andLungtumorGreaterThanOrEqualTo(String value) {
            addCriterion("LungTumor >=", value, "lungtumor");
            return (Criteria) this;
        }

        public Criteria andLungtumorLessThan(String value) {
            addCriterion("LungTumor <", value, "lungtumor");
            return (Criteria) this;
        }

        public Criteria andLungtumorLessThanOrEqualTo(String value) {
            addCriterion("LungTumor <=", value, "lungtumor");
            return (Criteria) this;
        }

        public Criteria andLungtumorLike(String value) {
            addCriterion("LungTumor like", value, "lungtumor");
            return (Criteria) this;
        }

        public Criteria andLungtumorNotLike(String value) {
            addCriterion("LungTumor not like", value, "lungtumor");
            return (Criteria) this;
        }

        public Criteria andLungtumorIn(List<String> values) {
            addCriterion("LungTumor in", values, "lungtumor");
            return (Criteria) this;
        }

        public Criteria andLungtumorNotIn(List<String> values) {
            addCriterion("LungTumor not in", values, "lungtumor");
            return (Criteria) this;
        }

        public Criteria andLungtumorBetween(String value1, String value2) {
            addCriterion("LungTumor between", value1, value2, "lungtumor");
            return (Criteria) this;
        }

        public Criteria andLungtumorNotBetween(String value1, String value2) {
            addCriterion("LungTumor not between", value1, value2, "lungtumor");
            return (Criteria) this;
        }

        public Criteria andPulmonaryembolismIsNull() {
            addCriterion("PulmonaryEmbolism is null");
            return (Criteria) this;
        }

        public Criteria andPulmonaryembolismIsNotNull() {
            addCriterion("PulmonaryEmbolism is not null");
            return (Criteria) this;
        }

        public Criteria andPulmonaryembolismEqualTo(String value) {
            addCriterion("PulmonaryEmbolism =", value, "pulmonaryembolism");
            return (Criteria) this;
        }

        public Criteria andPulmonaryembolismNotEqualTo(String value) {
            addCriterion("PulmonaryEmbolism <>", value, "pulmonaryembolism");
            return (Criteria) this;
        }

        public Criteria andPulmonaryembolismGreaterThan(String value) {
            addCriterion("PulmonaryEmbolism >", value, "pulmonaryembolism");
            return (Criteria) this;
        }

        public Criteria andPulmonaryembolismGreaterThanOrEqualTo(String value) {
            addCriterion("PulmonaryEmbolism >=", value, "pulmonaryembolism");
            return (Criteria) this;
        }

        public Criteria andPulmonaryembolismLessThan(String value) {
            addCriterion("PulmonaryEmbolism <", value, "pulmonaryembolism");
            return (Criteria) this;
        }

        public Criteria andPulmonaryembolismLessThanOrEqualTo(String value) {
            addCriterion("PulmonaryEmbolism <=", value, "pulmonaryembolism");
            return (Criteria) this;
        }

        public Criteria andPulmonaryembolismLike(String value) {
            addCriterion("PulmonaryEmbolism like", value, "pulmonaryembolism");
            return (Criteria) this;
        }

        public Criteria andPulmonaryembolismNotLike(String value) {
            addCriterion("PulmonaryEmbolism not like", value, "pulmonaryembolism");
            return (Criteria) this;
        }

        public Criteria andPulmonaryembolismIn(List<String> values) {
            addCriterion("PulmonaryEmbolism in", values, "pulmonaryembolism");
            return (Criteria) this;
        }

        public Criteria andPulmonaryembolismNotIn(List<String> values) {
            addCriterion("PulmonaryEmbolism not in", values, "pulmonaryembolism");
            return (Criteria) this;
        }

        public Criteria andPulmonaryembolismBetween(String value1, String value2) {
            addCriterion("PulmonaryEmbolism between", value1, value2, "pulmonaryembolism");
            return (Criteria) this;
        }

        public Criteria andPulmonaryembolismNotBetween(String value1, String value2) {
            addCriterion("PulmonaryEmbolism not between", value1, value2, "pulmonaryembolism");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("FLAG =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("FLAG <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("FLAG >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("FLAG >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("FLAG <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("FLAG <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("FLAG like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("FLAG not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("FLAG in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("FLAG not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("FLAG between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("FLAG not between", value1, value2, "flag");
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