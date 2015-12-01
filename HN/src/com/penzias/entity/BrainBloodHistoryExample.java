package com.penzias.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BrainBloodHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrainBloodHistoryExample() {
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

        public Criteria andBrainbloodhistoryidIsNull() {
            addCriterion("BrainBloodHistoryID is null");
            return (Criteria) this;
        }

        public Criteria andBrainbloodhistoryidIsNotNull() {
            addCriterion("BrainBloodHistoryID is not null");
            return (Criteria) this;
        }

        public Criteria andBrainbloodhistoryidEqualTo(Integer value) {
            addCriterion("BrainBloodHistoryID =", value, "brainbloodhistoryid");
            return (Criteria) this;
        }

        public Criteria andBrainbloodhistoryidNotEqualTo(Integer value) {
            addCriterion("BrainBloodHistoryID <>", value, "brainbloodhistoryid");
            return (Criteria) this;
        }

        public Criteria andBrainbloodhistoryidGreaterThan(Integer value) {
            addCriterion("BrainBloodHistoryID >", value, "brainbloodhistoryid");
            return (Criteria) this;
        }

        public Criteria andBrainbloodhistoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BrainBloodHistoryID >=", value, "brainbloodhistoryid");
            return (Criteria) this;
        }

        public Criteria andBrainbloodhistoryidLessThan(Integer value) {
            addCriterion("BrainBloodHistoryID <", value, "brainbloodhistoryid");
            return (Criteria) this;
        }

        public Criteria andBrainbloodhistoryidLessThanOrEqualTo(Integer value) {
            addCriterion("BrainBloodHistoryID <=", value, "brainbloodhistoryid");
            return (Criteria) this;
        }

        public Criteria andBrainbloodhistoryidIn(List<Integer> values) {
            addCriterion("BrainBloodHistoryID in", values, "brainbloodhistoryid");
            return (Criteria) this;
        }

        public Criteria andBrainbloodhistoryidNotIn(List<Integer> values) {
            addCriterion("BrainBloodHistoryID not in", values, "brainbloodhistoryid");
            return (Criteria) this;
        }

        public Criteria andBrainbloodhistoryidBetween(Integer value1, Integer value2) {
            addCriterion("BrainBloodHistoryID between", value1, value2, "brainbloodhistoryid");
            return (Criteria) this;
        }

        public Criteria andBrainbloodhistoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("BrainBloodHistoryID not between", value1, value2, "brainbloodhistoryid");
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

        public Criteria andIsbrainbloodIsNull() {
            addCriterion("IsBrainBlood is null");
            return (Criteria) this;
        }

        public Criteria andIsbrainbloodIsNotNull() {
            addCriterion("IsBrainBlood is not null");
            return (Criteria) this;
        }

        public Criteria andIsbrainbloodEqualTo(String value) {
            addCriterion("IsBrainBlood =", value, "isbrainblood");
            return (Criteria) this;
        }

        public Criteria andIsbrainbloodNotEqualTo(String value) {
            addCriterion("IsBrainBlood <>", value, "isbrainblood");
            return (Criteria) this;
        }

        public Criteria andIsbrainbloodGreaterThan(String value) {
            addCriterion("IsBrainBlood >", value, "isbrainblood");
            return (Criteria) this;
        }

        public Criteria andIsbrainbloodGreaterThanOrEqualTo(String value) {
            addCriterion("IsBrainBlood >=", value, "isbrainblood");
            return (Criteria) this;
        }

        public Criteria andIsbrainbloodLessThan(String value) {
            addCriterion("IsBrainBlood <", value, "isbrainblood");
            return (Criteria) this;
        }

        public Criteria andIsbrainbloodLessThanOrEqualTo(String value) {
            addCriterion("IsBrainBlood <=", value, "isbrainblood");
            return (Criteria) this;
        }

        public Criteria andIsbrainbloodLike(String value) {
            addCriterion("IsBrainBlood like", value, "isbrainblood");
            return (Criteria) this;
        }

        public Criteria andIsbrainbloodNotLike(String value) {
            addCriterion("IsBrainBlood not like", value, "isbrainblood");
            return (Criteria) this;
        }

        public Criteria andIsbrainbloodIn(List<String> values) {
            addCriterion("IsBrainBlood in", values, "isbrainblood");
            return (Criteria) this;
        }

        public Criteria andIsbrainbloodNotIn(List<String> values) {
            addCriterion("IsBrainBlood not in", values, "isbrainblood");
            return (Criteria) this;
        }

        public Criteria andIsbrainbloodBetween(String value1, String value2) {
            addCriterion("IsBrainBlood between", value1, value2, "isbrainblood");
            return (Criteria) this;
        }

        public Criteria andIsbrainbloodNotBetween(String value1, String value2) {
            addCriterion("IsBrainBlood not between", value1, value2, "isbrainblood");
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

        public Criteria andBasisbrainctIsNull() {
            addCriterion("BasisBrainCT is null");
            return (Criteria) this;
        }

        public Criteria andBasisbrainctIsNotNull() {
            addCriterion("BasisBrainCT is not null");
            return (Criteria) this;
        }

        public Criteria andBasisbrainctEqualTo(String value) {
            addCriterion("BasisBrainCT =", value, "basisbrainct");
            return (Criteria) this;
        }

        public Criteria andBasisbrainctNotEqualTo(String value) {
            addCriterion("BasisBrainCT <>", value, "basisbrainct");
            return (Criteria) this;
        }

        public Criteria andBasisbrainctGreaterThan(String value) {
            addCriterion("BasisBrainCT >", value, "basisbrainct");
            return (Criteria) this;
        }

        public Criteria andBasisbrainctGreaterThanOrEqualTo(String value) {
            addCriterion("BasisBrainCT >=", value, "basisbrainct");
            return (Criteria) this;
        }

        public Criteria andBasisbrainctLessThan(String value) {
            addCriterion("BasisBrainCT <", value, "basisbrainct");
            return (Criteria) this;
        }

        public Criteria andBasisbrainctLessThanOrEqualTo(String value) {
            addCriterion("BasisBrainCT <=", value, "basisbrainct");
            return (Criteria) this;
        }

        public Criteria andBasisbrainctLike(String value) {
            addCriterion("BasisBrainCT like", value, "basisbrainct");
            return (Criteria) this;
        }

        public Criteria andBasisbrainctNotLike(String value) {
            addCriterion("BasisBrainCT not like", value, "basisbrainct");
            return (Criteria) this;
        }

        public Criteria andBasisbrainctIn(List<String> values) {
            addCriterion("BasisBrainCT in", values, "basisbrainct");
            return (Criteria) this;
        }

        public Criteria andBasisbrainctNotIn(List<String> values) {
            addCriterion("BasisBrainCT not in", values, "basisbrainct");
            return (Criteria) this;
        }

        public Criteria andBasisbrainctBetween(String value1, String value2) {
            addCriterion("BasisBrainCT between", value1, value2, "basisbrainct");
            return (Criteria) this;
        }

        public Criteria andBasisbrainctNotBetween(String value1, String value2) {
            addCriterion("BasisBrainCT not between", value1, value2, "basisbrainct");
            return (Criteria) this;
        }

        public Criteria andBasisbrainmriIsNull() {
            addCriterion("BasisBrainMRI is null");
            return (Criteria) this;
        }

        public Criteria andBasisbrainmriIsNotNull() {
            addCriterion("BasisBrainMRI is not null");
            return (Criteria) this;
        }

        public Criteria andBasisbrainmriEqualTo(String value) {
            addCriterion("BasisBrainMRI =", value, "basisbrainmri");
            return (Criteria) this;
        }

        public Criteria andBasisbrainmriNotEqualTo(String value) {
            addCriterion("BasisBrainMRI <>", value, "basisbrainmri");
            return (Criteria) this;
        }

        public Criteria andBasisbrainmriGreaterThan(String value) {
            addCriterion("BasisBrainMRI >", value, "basisbrainmri");
            return (Criteria) this;
        }

        public Criteria andBasisbrainmriGreaterThanOrEqualTo(String value) {
            addCriterion("BasisBrainMRI >=", value, "basisbrainmri");
            return (Criteria) this;
        }

        public Criteria andBasisbrainmriLessThan(String value) {
            addCriterion("BasisBrainMRI <", value, "basisbrainmri");
            return (Criteria) this;
        }

        public Criteria andBasisbrainmriLessThanOrEqualTo(String value) {
            addCriterion("BasisBrainMRI <=", value, "basisbrainmri");
            return (Criteria) this;
        }

        public Criteria andBasisbrainmriLike(String value) {
            addCriterion("BasisBrainMRI like", value, "basisbrainmri");
            return (Criteria) this;
        }

        public Criteria andBasisbrainmriNotLike(String value) {
            addCriterion("BasisBrainMRI not like", value, "basisbrainmri");
            return (Criteria) this;
        }

        public Criteria andBasisbrainmriIn(List<String> values) {
            addCriterion("BasisBrainMRI in", values, "basisbrainmri");
            return (Criteria) this;
        }

        public Criteria andBasisbrainmriNotIn(List<String> values) {
            addCriterion("BasisBrainMRI not in", values, "basisbrainmri");
            return (Criteria) this;
        }

        public Criteria andBasisbrainmriBetween(String value1, String value2) {
            addCriterion("BasisBrainMRI between", value1, value2, "basisbrainmri");
            return (Criteria) this;
        }

        public Criteria andBasisbrainmriNotBetween(String value1, String value2) {
            addCriterion("BasisBrainMRI not between", value1, value2, "basisbrainmri");
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

        public Criteria andMrstimeIsNull() {
            addCriterion("MRSTime is null");
            return (Criteria) this;
        }

        public Criteria andMrstimeIsNotNull() {
            addCriterion("MRSTime is not null");
            return (Criteria) this;
        }

        public Criteria andMrstimeEqualTo(Date value) {
            addCriterionForJDBCDate("MRSTime =", value, "mrstime");
            return (Criteria) this;
        }

        public Criteria andMrstimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("MRSTime <>", value, "mrstime");
            return (Criteria) this;
        }

        public Criteria andMrstimeGreaterThan(Date value) {
            addCriterionForJDBCDate("MRSTime >", value, "mrstime");
            return (Criteria) this;
        }

        public Criteria andMrstimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MRSTime >=", value, "mrstime");
            return (Criteria) this;
        }

        public Criteria andMrstimeLessThan(Date value) {
            addCriterionForJDBCDate("MRSTime <", value, "mrstime");
            return (Criteria) this;
        }

        public Criteria andMrstimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MRSTime <=", value, "mrstime");
            return (Criteria) this;
        }

        public Criteria andMrstimeIn(List<Date> values) {
            addCriterionForJDBCDate("MRSTime in", values, "mrstime");
            return (Criteria) this;
        }

        public Criteria andMrstimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("MRSTime not in", values, "mrstime");
            return (Criteria) this;
        }

        public Criteria andMrstimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MRSTime between", value1, value2, "mrstime");
            return (Criteria) this;
        }

        public Criteria andMrstimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MRSTime not between", value1, value2, "mrstime");
            return (Criteria) this;
        }

        public Criteria andMrsoptionIsNull() {
            addCriterion("MRSOption is null");
            return (Criteria) this;
        }

        public Criteria andMrsoptionIsNotNull() {
            addCriterion("MRSOption is not null");
            return (Criteria) this;
        }

        public Criteria andMrsoptionEqualTo(String value) {
            addCriterion("MRSOption =", value, "mrsoption");
            return (Criteria) this;
        }

        public Criteria andMrsoptionNotEqualTo(String value) {
            addCriterion("MRSOption <>", value, "mrsoption");
            return (Criteria) this;
        }

        public Criteria andMrsoptionGreaterThan(String value) {
            addCriterion("MRSOption >", value, "mrsoption");
            return (Criteria) this;
        }

        public Criteria andMrsoptionGreaterThanOrEqualTo(String value) {
            addCriterion("MRSOption >=", value, "mrsoption");
            return (Criteria) this;
        }

        public Criteria andMrsoptionLessThan(String value) {
            addCriterion("MRSOption <", value, "mrsoption");
            return (Criteria) this;
        }

        public Criteria andMrsoptionLessThanOrEqualTo(String value) {
            addCriterion("MRSOption <=", value, "mrsoption");
            return (Criteria) this;
        }

        public Criteria andMrsoptionLike(String value) {
            addCriterion("MRSOption like", value, "mrsoption");
            return (Criteria) this;
        }

        public Criteria andMrsoptionNotLike(String value) {
            addCriterion("MRSOption not like", value, "mrsoption");
            return (Criteria) this;
        }

        public Criteria andMrsoptionIn(List<String> values) {
            addCriterion("MRSOption in", values, "mrsoption");
            return (Criteria) this;
        }

        public Criteria andMrsoptionNotIn(List<String> values) {
            addCriterion("MRSOption not in", values, "mrsoption");
            return (Criteria) this;
        }

        public Criteria andMrsoptionBetween(String value1, String value2) {
            addCriterion("MRSOption between", value1, value2, "mrsoption");
            return (Criteria) this;
        }

        public Criteria andMrsoptionNotBetween(String value1, String value2) {
            addCriterion("MRSOption not between", value1, value2, "mrsoption");
            return (Criteria) this;
        }

        public Criteria andMrsvalueIsNull() {
            addCriterion("MRSValue is null");
            return (Criteria) this;
        }

        public Criteria andMrsvalueIsNotNull() {
            addCriterion("MRSValue is not null");
            return (Criteria) this;
        }

        public Criteria andMrsvalueEqualTo(String value) {
            addCriterion("MRSValue =", value, "mrsvalue");
            return (Criteria) this;
        }

        public Criteria andMrsvalueNotEqualTo(String value) {
            addCriterion("MRSValue <>", value, "mrsvalue");
            return (Criteria) this;
        }

        public Criteria andMrsvalueGreaterThan(String value) {
            addCriterion("MRSValue >", value, "mrsvalue");
            return (Criteria) this;
        }

        public Criteria andMrsvalueGreaterThanOrEqualTo(String value) {
            addCriterion("MRSValue >=", value, "mrsvalue");
            return (Criteria) this;
        }

        public Criteria andMrsvalueLessThan(String value) {
            addCriterion("MRSValue <", value, "mrsvalue");
            return (Criteria) this;
        }

        public Criteria andMrsvalueLessThanOrEqualTo(String value) {
            addCriterion("MRSValue <=", value, "mrsvalue");
            return (Criteria) this;
        }

        public Criteria andMrsvalueLike(String value) {
            addCriterion("MRSValue like", value, "mrsvalue");
            return (Criteria) this;
        }

        public Criteria andMrsvalueNotLike(String value) {
            addCriterion("MRSValue not like", value, "mrsvalue");
            return (Criteria) this;
        }

        public Criteria andMrsvalueIn(List<String> values) {
            addCriterion("MRSValue in", values, "mrsvalue");
            return (Criteria) this;
        }

        public Criteria andMrsvalueNotIn(List<String> values) {
            addCriterion("MRSValue not in", values, "mrsvalue");
            return (Criteria) this;
        }

        public Criteria andMrsvalueBetween(String value1, String value2) {
            addCriterion("MRSValue between", value1, value2, "mrsvalue");
            return (Criteria) this;
        }

        public Criteria andMrsvalueNotBetween(String value1, String value2) {
            addCriterion("MRSValue not between", value1, value2, "mrsvalue");
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