package com.penzias.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BloodFatHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BloodFatHistoryExample() {
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

        public Criteria andBloodfathistoryidIsNull() {
            addCriterion("BloodFatHistoryID is null");
            return (Criteria) this;
        }

        public Criteria andBloodfathistoryidIsNotNull() {
            addCriterion("BloodFatHistoryID is not null");
            return (Criteria) this;
        }

        public Criteria andBloodfathistoryidEqualTo(Integer value) {
            addCriterion("BloodFatHistoryID =", value, "bloodfathistoryid");
            return (Criteria) this;
        }

        public Criteria andBloodfathistoryidNotEqualTo(Integer value) {
            addCriterion("BloodFatHistoryID <>", value, "bloodfathistoryid");
            return (Criteria) this;
        }

        public Criteria andBloodfathistoryidGreaterThan(Integer value) {
            addCriterion("BloodFatHistoryID >", value, "bloodfathistoryid");
            return (Criteria) this;
        }

        public Criteria andBloodfathistoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BloodFatHistoryID >=", value, "bloodfathistoryid");
            return (Criteria) this;
        }

        public Criteria andBloodfathistoryidLessThan(Integer value) {
            addCriterion("BloodFatHistoryID <", value, "bloodfathistoryid");
            return (Criteria) this;
        }

        public Criteria andBloodfathistoryidLessThanOrEqualTo(Integer value) {
            addCriterion("BloodFatHistoryID <=", value, "bloodfathistoryid");
            return (Criteria) this;
        }

        public Criteria andBloodfathistoryidIn(List<Integer> values) {
            addCriterion("BloodFatHistoryID in", values, "bloodfathistoryid");
            return (Criteria) this;
        }

        public Criteria andBloodfathistoryidNotIn(List<Integer> values) {
            addCriterion("BloodFatHistoryID not in", values, "bloodfathistoryid");
            return (Criteria) this;
        }

        public Criteria andBloodfathistoryidBetween(Integer value1, Integer value2) {
            addCriterion("BloodFatHistoryID between", value1, value2, "bloodfathistoryid");
            return (Criteria) this;
        }

        public Criteria andBloodfathistoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("BloodFatHistoryID not between", value1, value2, "bloodfathistoryid");
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

        public Criteria andIsbloodfatIsNull() {
            addCriterion("IsBloodFat is null");
            return (Criteria) this;
        }

        public Criteria andIsbloodfatIsNotNull() {
            addCriterion("IsBloodFat is not null");
            return (Criteria) this;
        }

        public Criteria andIsbloodfatEqualTo(String value) {
            addCriterion("IsBloodFat =", value, "isbloodfat");
            return (Criteria) this;
        }

        public Criteria andIsbloodfatNotEqualTo(String value) {
            addCriterion("IsBloodFat <>", value, "isbloodfat");
            return (Criteria) this;
        }

        public Criteria andIsbloodfatGreaterThan(String value) {
            addCriterion("IsBloodFat >", value, "isbloodfat");
            return (Criteria) this;
        }

        public Criteria andIsbloodfatGreaterThanOrEqualTo(String value) {
            addCriterion("IsBloodFat >=", value, "isbloodfat");
            return (Criteria) this;
        }

        public Criteria andIsbloodfatLessThan(String value) {
            addCriterion("IsBloodFat <", value, "isbloodfat");
            return (Criteria) this;
        }

        public Criteria andIsbloodfatLessThanOrEqualTo(String value) {
            addCriterion("IsBloodFat <=", value, "isbloodfat");
            return (Criteria) this;
        }

        public Criteria andIsbloodfatLike(String value) {
            addCriterion("IsBloodFat like", value, "isbloodfat");
            return (Criteria) this;
        }

        public Criteria andIsbloodfatNotLike(String value) {
            addCriterion("IsBloodFat not like", value, "isbloodfat");
            return (Criteria) this;
        }

        public Criteria andIsbloodfatIn(List<String> values) {
            addCriterion("IsBloodFat in", values, "isbloodfat");
            return (Criteria) this;
        }

        public Criteria andIsbloodfatNotIn(List<String> values) {
            addCriterion("IsBloodFat not in", values, "isbloodfat");
            return (Criteria) this;
        }

        public Criteria andIsbloodfatBetween(String value1, String value2) {
            addCriterion("IsBloodFat between", value1, value2, "isbloodfat");
            return (Criteria) this;
        }

        public Criteria andIsbloodfatNotBetween(String value1, String value2) {
            addCriterion("IsBloodFat not between", value1, value2, "isbloodfat");
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

        public Criteria andHighcholesterolIsNull() {
            addCriterion("HighCholesterol is null");
            return (Criteria) this;
        }

        public Criteria andHighcholesterolIsNotNull() {
            addCriterion("HighCholesterol is not null");
            return (Criteria) this;
        }

        public Criteria andHighcholesterolEqualTo(String value) {
            addCriterion("HighCholesterol =", value, "highcholesterol");
            return (Criteria) this;
        }

        public Criteria andHighcholesterolNotEqualTo(String value) {
            addCriterion("HighCholesterol <>", value, "highcholesterol");
            return (Criteria) this;
        }

        public Criteria andHighcholesterolGreaterThan(String value) {
            addCriterion("HighCholesterol >", value, "highcholesterol");
            return (Criteria) this;
        }

        public Criteria andHighcholesterolGreaterThanOrEqualTo(String value) {
            addCriterion("HighCholesterol >=", value, "highcholesterol");
            return (Criteria) this;
        }

        public Criteria andHighcholesterolLessThan(String value) {
            addCriterion("HighCholesterol <", value, "highcholesterol");
            return (Criteria) this;
        }

        public Criteria andHighcholesterolLessThanOrEqualTo(String value) {
            addCriterion("HighCholesterol <=", value, "highcholesterol");
            return (Criteria) this;
        }

        public Criteria andHighcholesterolLike(String value) {
            addCriterion("HighCholesterol like", value, "highcholesterol");
            return (Criteria) this;
        }

        public Criteria andHighcholesterolNotLike(String value) {
            addCriterion("HighCholesterol not like", value, "highcholesterol");
            return (Criteria) this;
        }

        public Criteria andHighcholesterolIn(List<String> values) {
            addCriterion("HighCholesterol in", values, "highcholesterol");
            return (Criteria) this;
        }

        public Criteria andHighcholesterolNotIn(List<String> values) {
            addCriterion("HighCholesterol not in", values, "highcholesterol");
            return (Criteria) this;
        }

        public Criteria andHighcholesterolBetween(String value1, String value2) {
            addCriterion("HighCholesterol between", value1, value2, "highcholesterol");
            return (Criteria) this;
        }

        public Criteria andHighcholesterolNotBetween(String value1, String value2) {
            addCriterion("HighCholesterol not between", value1, value2, "highcholesterol");
            return (Criteria) this;
        }

        public Criteria andHightriglycerideIsNull() {
            addCriterion("HighTriglyceride is null");
            return (Criteria) this;
        }

        public Criteria andHightriglycerideIsNotNull() {
            addCriterion("HighTriglyceride is not null");
            return (Criteria) this;
        }

        public Criteria andHightriglycerideEqualTo(String value) {
            addCriterion("HighTriglyceride =", value, "hightriglyceride");
            return (Criteria) this;
        }

        public Criteria andHightriglycerideNotEqualTo(String value) {
            addCriterion("HighTriglyceride <>", value, "hightriglyceride");
            return (Criteria) this;
        }

        public Criteria andHightriglycerideGreaterThan(String value) {
            addCriterion("HighTriglyceride >", value, "hightriglyceride");
            return (Criteria) this;
        }

        public Criteria andHightriglycerideGreaterThanOrEqualTo(String value) {
            addCriterion("HighTriglyceride >=", value, "hightriglyceride");
            return (Criteria) this;
        }

        public Criteria andHightriglycerideLessThan(String value) {
            addCriterion("HighTriglyceride <", value, "hightriglyceride");
            return (Criteria) this;
        }

        public Criteria andHightriglycerideLessThanOrEqualTo(String value) {
            addCriterion("HighTriglyceride <=", value, "hightriglyceride");
            return (Criteria) this;
        }

        public Criteria andHightriglycerideLike(String value) {
            addCriterion("HighTriglyceride like", value, "hightriglyceride");
            return (Criteria) this;
        }

        public Criteria andHightriglycerideNotLike(String value) {
            addCriterion("HighTriglyceride not like", value, "hightriglyceride");
            return (Criteria) this;
        }

        public Criteria andHightriglycerideIn(List<String> values) {
            addCriterion("HighTriglyceride in", values, "hightriglyceride");
            return (Criteria) this;
        }

        public Criteria andHightriglycerideNotIn(List<String> values) {
            addCriterion("HighTriglyceride not in", values, "hightriglyceride");
            return (Criteria) this;
        }

        public Criteria andHightriglycerideBetween(String value1, String value2) {
            addCriterion("HighTriglyceride between", value1, value2, "hightriglyceride");
            return (Criteria) this;
        }

        public Criteria andHightriglycerideNotBetween(String value1, String value2) {
            addCriterion("HighTriglyceride not between", value1, value2, "hightriglyceride");
            return (Criteria) this;
        }

        public Criteria andHighldlCIsNull() {
            addCriterion("HighLDL-C is null");
            return (Criteria) this;
        }

        public Criteria andHighldlCIsNotNull() {
            addCriterion("HighLDL-C is not null");
            return (Criteria) this;
        }

        public Criteria andHighldlCEqualTo(String value) {
            addCriterion("HighLDL-C =", value, "highldlC");
            return (Criteria) this;
        }

        public Criteria andHighldlCNotEqualTo(String value) {
            addCriterion("HighLDL-C <>", value, "highldlC");
            return (Criteria) this;
        }

        public Criteria andHighldlCGreaterThan(String value) {
            addCriterion("HighLDL-C >", value, "highldlC");
            return (Criteria) this;
        }

        public Criteria andHighldlCGreaterThanOrEqualTo(String value) {
            addCriterion("HighLDL-C >=", value, "highldlC");
            return (Criteria) this;
        }

        public Criteria andHighldlCLessThan(String value) {
            addCriterion("HighLDL-C <", value, "highldlC");
            return (Criteria) this;
        }

        public Criteria andHighldlCLessThanOrEqualTo(String value) {
            addCriterion("HighLDL-C <=", value, "highldlC");
            return (Criteria) this;
        }

        public Criteria andHighldlCLike(String value) {
            addCriterion("HighLDL-C like", value, "highldlC");
            return (Criteria) this;
        }

        public Criteria andHighldlCNotLike(String value) {
            addCriterion("HighLDL-C not like", value, "highldlC");
            return (Criteria) this;
        }

        public Criteria andHighldlCIn(List<String> values) {
            addCriterion("HighLDL-C in", values, "highldlC");
            return (Criteria) this;
        }

        public Criteria andHighldlCNotIn(List<String> values) {
            addCriterion("HighLDL-C not in", values, "highldlC");
            return (Criteria) this;
        }

        public Criteria andHighldlCBetween(String value1, String value2) {
            addCriterion("HighLDL-C between", value1, value2, "highldlC");
            return (Criteria) this;
        }

        public Criteria andHighldlCNotBetween(String value1, String value2) {
            addCriterion("HighLDL-C not between", value1, value2, "highldlC");
            return (Criteria) this;
        }

        public Criteria andLowhdlCIsNull() {
            addCriterion("LowHDL-C is null");
            return (Criteria) this;
        }

        public Criteria andLowhdlCIsNotNull() {
            addCriterion("LowHDL-C is not null");
            return (Criteria) this;
        }

        public Criteria andLowhdlCEqualTo(String value) {
            addCriterion("LowHDL-C =", value, "lowhdlC");
            return (Criteria) this;
        }

        public Criteria andLowhdlCNotEqualTo(String value) {
            addCriterion("LowHDL-C <>", value, "lowhdlC");
            return (Criteria) this;
        }

        public Criteria andLowhdlCGreaterThan(String value) {
            addCriterion("LowHDL-C >", value, "lowhdlC");
            return (Criteria) this;
        }

        public Criteria andLowhdlCGreaterThanOrEqualTo(String value) {
            addCriterion("LowHDL-C >=", value, "lowhdlC");
            return (Criteria) this;
        }

        public Criteria andLowhdlCLessThan(String value) {
            addCriterion("LowHDL-C <", value, "lowhdlC");
            return (Criteria) this;
        }

        public Criteria andLowhdlCLessThanOrEqualTo(String value) {
            addCriterion("LowHDL-C <=", value, "lowhdlC");
            return (Criteria) this;
        }

        public Criteria andLowhdlCLike(String value) {
            addCriterion("LowHDL-C like", value, "lowhdlC");
            return (Criteria) this;
        }

        public Criteria andLowhdlCNotLike(String value) {
            addCriterion("LowHDL-C not like", value, "lowhdlC");
            return (Criteria) this;
        }

        public Criteria andLowhdlCIn(List<String> values) {
            addCriterion("LowHDL-C in", values, "lowhdlC");
            return (Criteria) this;
        }

        public Criteria andLowhdlCNotIn(List<String> values) {
            addCriterion("LowHDL-C not in", values, "lowhdlC");
            return (Criteria) this;
        }

        public Criteria andLowhdlCBetween(String value1, String value2) {
            addCriterion("LowHDL-C between", value1, value2, "lowhdlC");
            return (Criteria) this;
        }

        public Criteria andLowhdlCNotBetween(String value1, String value2) {
            addCriterion("LowHDL-C not between", value1, value2, "lowhdlC");
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

        public Criteria andIslipidLoweringIsNull() {
            addCriterion("IsLipid-lowering is null");
            return (Criteria) this;
        }

        public Criteria andIslipidLoweringIsNotNull() {
            addCriterion("IsLipid-lowering is not null");
            return (Criteria) this;
        }

        public Criteria andIslipidLoweringEqualTo(String value) {
            addCriterion("IsLipid-lowering =", value, "islipidLowering");
            return (Criteria) this;
        }

        public Criteria andIslipidLoweringNotEqualTo(String value) {
            addCriterion("IsLipid-lowering <>", value, "islipidLowering");
            return (Criteria) this;
        }

        public Criteria andIslipidLoweringGreaterThan(String value) {
            addCriterion("IsLipid-lowering >", value, "islipidLowering");
            return (Criteria) this;
        }

        public Criteria andIslipidLoweringGreaterThanOrEqualTo(String value) {
            addCriterion("IsLipid-lowering >=", value, "islipidLowering");
            return (Criteria) this;
        }

        public Criteria andIslipidLoweringLessThan(String value) {
            addCriterion("IsLipid-lowering <", value, "islipidLowering");
            return (Criteria) this;
        }

        public Criteria andIslipidLoweringLessThanOrEqualTo(String value) {
            addCriterion("IsLipid-lowering <=", value, "islipidLowering");
            return (Criteria) this;
        }

        public Criteria andIslipidLoweringLike(String value) {
            addCriterion("IsLipid-lowering like", value, "islipidLowering");
            return (Criteria) this;
        }

        public Criteria andIslipidLoweringNotLike(String value) {
            addCriterion("IsLipid-lowering not like", value, "islipidLowering");
            return (Criteria) this;
        }

        public Criteria andIslipidLoweringIn(List<String> values) {
            addCriterion("IsLipid-lowering in", values, "islipidLowering");
            return (Criteria) this;
        }

        public Criteria andIslipidLoweringNotIn(List<String> values) {
            addCriterion("IsLipid-lowering not in", values, "islipidLowering");
            return (Criteria) this;
        }

        public Criteria andIslipidLoweringBetween(String value1, String value2) {
            addCriterion("IsLipid-lowering between", value1, value2, "islipidLowering");
            return (Criteria) this;
        }

        public Criteria andIslipidLoweringNotBetween(String value1, String value2) {
            addCriterion("IsLipid-lowering not between", value1, value2, "islipidLowering");
            return (Criteria) this;
        }

        public Criteria andCholesterolcontrolIsNull() {
            addCriterion("CholesterolControl is null");
            return (Criteria) this;
        }

        public Criteria andCholesterolcontrolIsNotNull() {
            addCriterion("CholesterolControl is not null");
            return (Criteria) this;
        }

        public Criteria andCholesterolcontrolEqualTo(String value) {
            addCriterion("CholesterolControl =", value, "cholesterolcontrol");
            return (Criteria) this;
        }

        public Criteria andCholesterolcontrolNotEqualTo(String value) {
            addCriterion("CholesterolControl <>", value, "cholesterolcontrol");
            return (Criteria) this;
        }

        public Criteria andCholesterolcontrolGreaterThan(String value) {
            addCriterion("CholesterolControl >", value, "cholesterolcontrol");
            return (Criteria) this;
        }

        public Criteria andCholesterolcontrolGreaterThanOrEqualTo(String value) {
            addCriterion("CholesterolControl >=", value, "cholesterolcontrol");
            return (Criteria) this;
        }

        public Criteria andCholesterolcontrolLessThan(String value) {
            addCriterion("CholesterolControl <", value, "cholesterolcontrol");
            return (Criteria) this;
        }

        public Criteria andCholesterolcontrolLessThanOrEqualTo(String value) {
            addCriterion("CholesterolControl <=", value, "cholesterolcontrol");
            return (Criteria) this;
        }

        public Criteria andCholesterolcontrolLike(String value) {
            addCriterion("CholesterolControl like", value, "cholesterolcontrol");
            return (Criteria) this;
        }

        public Criteria andCholesterolcontrolNotLike(String value) {
            addCriterion("CholesterolControl not like", value, "cholesterolcontrol");
            return (Criteria) this;
        }

        public Criteria andCholesterolcontrolIn(List<String> values) {
            addCriterion("CholesterolControl in", values, "cholesterolcontrol");
            return (Criteria) this;
        }

        public Criteria andCholesterolcontrolNotIn(List<String> values) {
            addCriterion("CholesterolControl not in", values, "cholesterolcontrol");
            return (Criteria) this;
        }

        public Criteria andCholesterolcontrolBetween(String value1, String value2) {
            addCriterion("CholesterolControl between", value1, value2, "cholesterolcontrol");
            return (Criteria) this;
        }

        public Criteria andCholesterolcontrolNotBetween(String value1, String value2) {
            addCriterion("CholesterolControl not between", value1, value2, "cholesterolcontrol");
            return (Criteria) this;
        }

        public Criteria andCholesterolyearIsNull() {
            addCriterion("CholesterolYear is null");
            return (Criteria) this;
        }

        public Criteria andCholesterolyearIsNotNull() {
            addCriterion("CholesterolYear is not null");
            return (Criteria) this;
        }

        public Criteria andCholesterolyearEqualTo(String value) {
            addCriterion("CholesterolYear =", value, "cholesterolyear");
            return (Criteria) this;
        }

        public Criteria andCholesterolyearNotEqualTo(String value) {
            addCriterion("CholesterolYear <>", value, "cholesterolyear");
            return (Criteria) this;
        }

        public Criteria andCholesterolyearGreaterThan(String value) {
            addCriterion("CholesterolYear >", value, "cholesterolyear");
            return (Criteria) this;
        }

        public Criteria andCholesterolyearGreaterThanOrEqualTo(String value) {
            addCriterion("CholesterolYear >=", value, "cholesterolyear");
            return (Criteria) this;
        }

        public Criteria andCholesterolyearLessThan(String value) {
            addCriterion("CholesterolYear <", value, "cholesterolyear");
            return (Criteria) this;
        }

        public Criteria andCholesterolyearLessThanOrEqualTo(String value) {
            addCriterion("CholesterolYear <=", value, "cholesterolyear");
            return (Criteria) this;
        }

        public Criteria andCholesterolyearLike(String value) {
            addCriterion("CholesterolYear like", value, "cholesterolyear");
            return (Criteria) this;
        }

        public Criteria andCholesterolyearNotLike(String value) {
            addCriterion("CholesterolYear not like", value, "cholesterolyear");
            return (Criteria) this;
        }

        public Criteria andCholesterolyearIn(List<String> values) {
            addCriterion("CholesterolYear in", values, "cholesterolyear");
            return (Criteria) this;
        }

        public Criteria andCholesterolyearNotIn(List<String> values) {
            addCriterion("CholesterolYear not in", values, "cholesterolyear");
            return (Criteria) this;
        }

        public Criteria andCholesterolyearBetween(String value1, String value2) {
            addCriterion("CholesterolYear between", value1, value2, "cholesterolyear");
            return (Criteria) this;
        }

        public Criteria andCholesterolyearNotBetween(String value1, String value2) {
            addCriterion("CholesterolYear not between", value1, value2, "cholesterolyear");
            return (Criteria) this;
        }

        public Criteria andTriglyceridecontrolIsNull() {
            addCriterion("TriglycerideControl is null");
            return (Criteria) this;
        }

        public Criteria andTriglyceridecontrolIsNotNull() {
            addCriterion("TriglycerideControl is not null");
            return (Criteria) this;
        }

        public Criteria andTriglyceridecontrolEqualTo(String value) {
            addCriterion("TriglycerideControl =", value, "triglyceridecontrol");
            return (Criteria) this;
        }

        public Criteria andTriglyceridecontrolNotEqualTo(String value) {
            addCriterion("TriglycerideControl <>", value, "triglyceridecontrol");
            return (Criteria) this;
        }

        public Criteria andTriglyceridecontrolGreaterThan(String value) {
            addCriterion("TriglycerideControl >", value, "triglyceridecontrol");
            return (Criteria) this;
        }

        public Criteria andTriglyceridecontrolGreaterThanOrEqualTo(String value) {
            addCriterion("TriglycerideControl >=", value, "triglyceridecontrol");
            return (Criteria) this;
        }

        public Criteria andTriglyceridecontrolLessThan(String value) {
            addCriterion("TriglycerideControl <", value, "triglyceridecontrol");
            return (Criteria) this;
        }

        public Criteria andTriglyceridecontrolLessThanOrEqualTo(String value) {
            addCriterion("TriglycerideControl <=", value, "triglyceridecontrol");
            return (Criteria) this;
        }

        public Criteria andTriglyceridecontrolLike(String value) {
            addCriterion("TriglycerideControl like", value, "triglyceridecontrol");
            return (Criteria) this;
        }

        public Criteria andTriglyceridecontrolNotLike(String value) {
            addCriterion("TriglycerideControl not like", value, "triglyceridecontrol");
            return (Criteria) this;
        }

        public Criteria andTriglyceridecontrolIn(List<String> values) {
            addCriterion("TriglycerideControl in", values, "triglyceridecontrol");
            return (Criteria) this;
        }

        public Criteria andTriglyceridecontrolNotIn(List<String> values) {
            addCriterion("TriglycerideControl not in", values, "triglyceridecontrol");
            return (Criteria) this;
        }

        public Criteria andTriglyceridecontrolBetween(String value1, String value2) {
            addCriterion("TriglycerideControl between", value1, value2, "triglyceridecontrol");
            return (Criteria) this;
        }

        public Criteria andTriglyceridecontrolNotBetween(String value1, String value2) {
            addCriterion("TriglycerideControl not between", value1, value2, "triglyceridecontrol");
            return (Criteria) this;
        }

        public Criteria andTriglycerideyearIsNull() {
            addCriterion("TriglycerideYear is null");
            return (Criteria) this;
        }

        public Criteria andTriglycerideyearIsNotNull() {
            addCriterion("TriglycerideYear is not null");
            return (Criteria) this;
        }

        public Criteria andTriglycerideyearEqualTo(String value) {
            addCriterion("TriglycerideYear =", value, "triglycerideyear");
            return (Criteria) this;
        }

        public Criteria andTriglycerideyearNotEqualTo(String value) {
            addCriterion("TriglycerideYear <>", value, "triglycerideyear");
            return (Criteria) this;
        }

        public Criteria andTriglycerideyearGreaterThan(String value) {
            addCriterion("TriglycerideYear >", value, "triglycerideyear");
            return (Criteria) this;
        }

        public Criteria andTriglycerideyearGreaterThanOrEqualTo(String value) {
            addCriterion("TriglycerideYear >=", value, "triglycerideyear");
            return (Criteria) this;
        }

        public Criteria andTriglycerideyearLessThan(String value) {
            addCriterion("TriglycerideYear <", value, "triglycerideyear");
            return (Criteria) this;
        }

        public Criteria andTriglycerideyearLessThanOrEqualTo(String value) {
            addCriterion("TriglycerideYear <=", value, "triglycerideyear");
            return (Criteria) this;
        }

        public Criteria andTriglycerideyearLike(String value) {
            addCriterion("TriglycerideYear like", value, "triglycerideyear");
            return (Criteria) this;
        }

        public Criteria andTriglycerideyearNotLike(String value) {
            addCriterion("TriglycerideYear not like", value, "triglycerideyear");
            return (Criteria) this;
        }

        public Criteria andTriglycerideyearIn(List<String> values) {
            addCriterion("TriglycerideYear in", values, "triglycerideyear");
            return (Criteria) this;
        }

        public Criteria andTriglycerideyearNotIn(List<String> values) {
            addCriterion("TriglycerideYear not in", values, "triglycerideyear");
            return (Criteria) this;
        }

        public Criteria andTriglycerideyearBetween(String value1, String value2) {
            addCriterion("TriglycerideYear between", value1, value2, "triglycerideyear");
            return (Criteria) this;
        }

        public Criteria andTriglycerideyearNotBetween(String value1, String value2) {
            addCriterion("TriglycerideYear not between", value1, value2, "triglycerideyear");
            return (Criteria) this;
        }

        public Criteria andLdlCcontrolIsNull() {
            addCriterion("LDL-CControl is null");
            return (Criteria) this;
        }

        public Criteria andLdlCcontrolIsNotNull() {
            addCriterion("LDL-CControl is not null");
            return (Criteria) this;
        }

        public Criteria andLdlCcontrolEqualTo(String value) {
            addCriterion("LDL-CControl =", value, "ldlCcontrol");
            return (Criteria) this;
        }

        public Criteria andLdlCcontrolNotEqualTo(String value) {
            addCriterion("LDL-CControl <>", value, "ldlCcontrol");
            return (Criteria) this;
        }

        public Criteria andLdlCcontrolGreaterThan(String value) {
            addCriterion("LDL-CControl >", value, "ldlCcontrol");
            return (Criteria) this;
        }

        public Criteria andLdlCcontrolGreaterThanOrEqualTo(String value) {
            addCriterion("LDL-CControl >=", value, "ldlCcontrol");
            return (Criteria) this;
        }

        public Criteria andLdlCcontrolLessThan(String value) {
            addCriterion("LDL-CControl <", value, "ldlCcontrol");
            return (Criteria) this;
        }

        public Criteria andLdlCcontrolLessThanOrEqualTo(String value) {
            addCriterion("LDL-CControl <=", value, "ldlCcontrol");
            return (Criteria) this;
        }

        public Criteria andLdlCcontrolLike(String value) {
            addCriterion("LDL-CControl like", value, "ldlCcontrol");
            return (Criteria) this;
        }

        public Criteria andLdlCcontrolNotLike(String value) {
            addCriterion("LDL-CControl not like", value, "ldlCcontrol");
            return (Criteria) this;
        }

        public Criteria andLdlCcontrolIn(List<String> values) {
            addCriterion("LDL-CControl in", values, "ldlCcontrol");
            return (Criteria) this;
        }

        public Criteria andLdlCcontrolNotIn(List<String> values) {
            addCriterion("LDL-CControl not in", values, "ldlCcontrol");
            return (Criteria) this;
        }

        public Criteria andLdlCcontrolBetween(String value1, String value2) {
            addCriterion("LDL-CControl between", value1, value2, "ldlCcontrol");
            return (Criteria) this;
        }

        public Criteria andLdlCcontrolNotBetween(String value1, String value2) {
            addCriterion("LDL-CControl not between", value1, value2, "ldlCcontrol");
            return (Criteria) this;
        }

        public Criteria andLdlCyearIsNull() {
            addCriterion("LDL-CYear is null");
            return (Criteria) this;
        }

        public Criteria andLdlCyearIsNotNull() {
            addCriterion("LDL-CYear is not null");
            return (Criteria) this;
        }

        public Criteria andLdlCyearEqualTo(String value) {
            addCriterion("LDL-CYear =", value, "ldlCyear");
            return (Criteria) this;
        }

        public Criteria andLdlCyearNotEqualTo(String value) {
            addCriterion("LDL-CYear <>", value, "ldlCyear");
            return (Criteria) this;
        }

        public Criteria andLdlCyearGreaterThan(String value) {
            addCriterion("LDL-CYear >", value, "ldlCyear");
            return (Criteria) this;
        }

        public Criteria andLdlCyearGreaterThanOrEqualTo(String value) {
            addCriterion("LDL-CYear >=", value, "ldlCyear");
            return (Criteria) this;
        }

        public Criteria andLdlCyearLessThan(String value) {
            addCriterion("LDL-CYear <", value, "ldlCyear");
            return (Criteria) this;
        }

        public Criteria andLdlCyearLessThanOrEqualTo(String value) {
            addCriterion("LDL-CYear <=", value, "ldlCyear");
            return (Criteria) this;
        }

        public Criteria andLdlCyearLike(String value) {
            addCriterion("LDL-CYear like", value, "ldlCyear");
            return (Criteria) this;
        }

        public Criteria andLdlCyearNotLike(String value) {
            addCriterion("LDL-CYear not like", value, "ldlCyear");
            return (Criteria) this;
        }

        public Criteria andLdlCyearIn(List<String> values) {
            addCriterion("LDL-CYear in", values, "ldlCyear");
            return (Criteria) this;
        }

        public Criteria andLdlCyearNotIn(List<String> values) {
            addCriterion("LDL-CYear not in", values, "ldlCyear");
            return (Criteria) this;
        }

        public Criteria andLdlCyearBetween(String value1, String value2) {
            addCriterion("LDL-CYear between", value1, value2, "ldlCyear");
            return (Criteria) this;
        }

        public Criteria andLdlCyearNotBetween(String value1, String value2) {
            addCriterion("LDL-CYear not between", value1, value2, "ldlCyear");
            return (Criteria) this;
        }

        public Criteria andHdlCcontrolIsNull() {
            addCriterion("HDL-CControl is null");
            return (Criteria) this;
        }

        public Criteria andHdlCcontrolIsNotNull() {
            addCriterion("HDL-CControl is not null");
            return (Criteria) this;
        }

        public Criteria andHdlCcontrolEqualTo(String value) {
            addCriterion("HDL-CControl =", value, "hdlCcontrol");
            return (Criteria) this;
        }

        public Criteria andHdlCcontrolNotEqualTo(String value) {
            addCriterion("HDL-CControl <>", value, "hdlCcontrol");
            return (Criteria) this;
        }

        public Criteria andHdlCcontrolGreaterThan(String value) {
            addCriterion("HDL-CControl >", value, "hdlCcontrol");
            return (Criteria) this;
        }

        public Criteria andHdlCcontrolGreaterThanOrEqualTo(String value) {
            addCriterion("HDL-CControl >=", value, "hdlCcontrol");
            return (Criteria) this;
        }

        public Criteria andHdlCcontrolLessThan(String value) {
            addCriterion("HDL-CControl <", value, "hdlCcontrol");
            return (Criteria) this;
        }

        public Criteria andHdlCcontrolLessThanOrEqualTo(String value) {
            addCriterion("HDL-CControl <=", value, "hdlCcontrol");
            return (Criteria) this;
        }

        public Criteria andHdlCcontrolLike(String value) {
            addCriterion("HDL-CControl like", value, "hdlCcontrol");
            return (Criteria) this;
        }

        public Criteria andHdlCcontrolNotLike(String value) {
            addCriterion("HDL-CControl not like", value, "hdlCcontrol");
            return (Criteria) this;
        }

        public Criteria andHdlCcontrolIn(List<String> values) {
            addCriterion("HDL-CControl in", values, "hdlCcontrol");
            return (Criteria) this;
        }

        public Criteria andHdlCcontrolNotIn(List<String> values) {
            addCriterion("HDL-CControl not in", values, "hdlCcontrol");
            return (Criteria) this;
        }

        public Criteria andHdlCcontrolBetween(String value1, String value2) {
            addCriterion("HDL-CControl between", value1, value2, "hdlCcontrol");
            return (Criteria) this;
        }

        public Criteria andHdlCcontrolNotBetween(String value1, String value2) {
            addCriterion("HDL-CControl not between", value1, value2, "hdlCcontrol");
            return (Criteria) this;
        }

        public Criteria andHdlCyearIsNull() {
            addCriterion("HDL-CYear is null");
            return (Criteria) this;
        }

        public Criteria andHdlCyearIsNotNull() {
            addCriterion("HDL-CYear is not null");
            return (Criteria) this;
        }

        public Criteria andHdlCyearEqualTo(String value) {
            addCriterion("HDL-CYear =", value, "hdlCyear");
            return (Criteria) this;
        }

        public Criteria andHdlCyearNotEqualTo(String value) {
            addCriterion("HDL-CYear <>", value, "hdlCyear");
            return (Criteria) this;
        }

        public Criteria andHdlCyearGreaterThan(String value) {
            addCriterion("HDL-CYear >", value, "hdlCyear");
            return (Criteria) this;
        }

        public Criteria andHdlCyearGreaterThanOrEqualTo(String value) {
            addCriterion("HDL-CYear >=", value, "hdlCyear");
            return (Criteria) this;
        }

        public Criteria andHdlCyearLessThan(String value) {
            addCriterion("HDL-CYear <", value, "hdlCyear");
            return (Criteria) this;
        }

        public Criteria andHdlCyearLessThanOrEqualTo(String value) {
            addCriterion("HDL-CYear <=", value, "hdlCyear");
            return (Criteria) this;
        }

        public Criteria andHdlCyearLike(String value) {
            addCriterion("HDL-CYear like", value, "hdlCyear");
            return (Criteria) this;
        }

        public Criteria andHdlCyearNotLike(String value) {
            addCriterion("HDL-CYear not like", value, "hdlCyear");
            return (Criteria) this;
        }

        public Criteria andHdlCyearIn(List<String> values) {
            addCriterion("HDL-CYear in", values, "hdlCyear");
            return (Criteria) this;
        }

        public Criteria andHdlCyearNotIn(List<String> values) {
            addCriterion("HDL-CYear not in", values, "hdlCyear");
            return (Criteria) this;
        }

        public Criteria andHdlCyearBetween(String value1, String value2) {
            addCriterion("HDL-CYear between", value1, value2, "hdlCyear");
            return (Criteria) this;
        }

        public Criteria andHdlCyearNotBetween(String value1, String value2) {
            addCriterion("HDL-CYear not between", value1, value2, "hdlCyear");
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