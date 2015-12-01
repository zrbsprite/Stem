package com.penzias.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PhysiqueExamInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhysiqueExamInfoExample() {
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

        public Criteria andPhysiqueexamidIsNull() {
            addCriterion("PhysiqueExamID is null");
            return (Criteria) this;
        }

        public Criteria andPhysiqueexamidIsNotNull() {
            addCriterion("PhysiqueExamID is not null");
            return (Criteria) this;
        }

        public Criteria andPhysiqueexamidEqualTo(Integer value) {
            addCriterion("PhysiqueExamID =", value, "physiqueexamid");
            return (Criteria) this;
        }

        public Criteria andPhysiqueexamidNotEqualTo(Integer value) {
            addCriterion("PhysiqueExamID <>", value, "physiqueexamid");
            return (Criteria) this;
        }

        public Criteria andPhysiqueexamidGreaterThan(Integer value) {
            addCriterion("PhysiqueExamID >", value, "physiqueexamid");
            return (Criteria) this;
        }

        public Criteria andPhysiqueexamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PhysiqueExamID >=", value, "physiqueexamid");
            return (Criteria) this;
        }

        public Criteria andPhysiqueexamidLessThan(Integer value) {
            addCriterion("PhysiqueExamID <", value, "physiqueexamid");
            return (Criteria) this;
        }

        public Criteria andPhysiqueexamidLessThanOrEqualTo(Integer value) {
            addCriterion("PhysiqueExamID <=", value, "physiqueexamid");
            return (Criteria) this;
        }

        public Criteria andPhysiqueexamidIn(List<Integer> values) {
            addCriterion("PhysiqueExamID in", values, "physiqueexamid");
            return (Criteria) this;
        }

        public Criteria andPhysiqueexamidNotIn(List<Integer> values) {
            addCriterion("PhysiqueExamID not in", values, "physiqueexamid");
            return (Criteria) this;
        }

        public Criteria andPhysiqueexamidBetween(Integer value1, Integer value2) {
            addCriterion("PhysiqueExamID between", value1, value2, "physiqueexamid");
            return (Criteria) this;
        }

        public Criteria andPhysiqueexamidNotBetween(Integer value1, Integer value2) {
            addCriterion("PhysiqueExamID not between", value1, value2, "physiqueexamid");
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

        public Criteria andExamtimeIsNull() {
            addCriterion("ExamTime is null");
            return (Criteria) this;
        }

        public Criteria andExamtimeIsNotNull() {
            addCriterion("ExamTime is not null");
            return (Criteria) this;
        }

        public Criteria andExamtimeEqualTo(Date value) {
            addCriterionForJDBCDate("ExamTime =", value, "examtime");
            return (Criteria) this;
        }

        public Criteria andExamtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ExamTime <>", value, "examtime");
            return (Criteria) this;
        }

        public Criteria andExamtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ExamTime >", value, "examtime");
            return (Criteria) this;
        }

        public Criteria andExamtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ExamTime >=", value, "examtime");
            return (Criteria) this;
        }

        public Criteria andExamtimeLessThan(Date value) {
            addCriterionForJDBCDate("ExamTime <", value, "examtime");
            return (Criteria) this;
        }

        public Criteria andExamtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ExamTime <=", value, "examtime");
            return (Criteria) this;
        }

        public Criteria andExamtimeIn(List<Date> values) {
            addCriterionForJDBCDate("ExamTime in", values, "examtime");
            return (Criteria) this;
        }

        public Criteria andExamtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ExamTime not in", values, "examtime");
            return (Criteria) this;
        }

        public Criteria andExamtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ExamTime between", value1, value2, "examtime");
            return (Criteria) this;
        }

        public Criteria andExamtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ExamTime not between", value1, value2, "examtime");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("Height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("Height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(BigDecimal value) {
            addCriterion("Height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(BigDecimal value) {
            addCriterion("Height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(BigDecimal value) {
            addCriterion("Height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(BigDecimal value) {
            addCriterion("Height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<BigDecimal> values) {
            addCriterion("Height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<BigDecimal> values) {
            addCriterion("Height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("Weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("Weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("Weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("Weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("Weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("Weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("Weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("Weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andBmiIsNull() {
            addCriterion("BMI is null");
            return (Criteria) this;
        }

        public Criteria andBmiIsNotNull() {
            addCriterion("BMI is not null");
            return (Criteria) this;
        }

        public Criteria andBmiEqualTo(BigDecimal value) {
            addCriterion("BMI =", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiNotEqualTo(BigDecimal value) {
            addCriterion("BMI <>", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiGreaterThan(BigDecimal value) {
            addCriterion("BMI >", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BMI >=", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiLessThan(BigDecimal value) {
            addCriterion("BMI <", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BMI <=", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiIn(List<BigDecimal> values) {
            addCriterion("BMI in", values, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiNotIn(List<BigDecimal> values) {
            addCriterion("BMI not in", values, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BMI between", value1, value2, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BMI not between", value1, value2, "bmi");
            return (Criteria) this;
        }

        public Criteria andWaistIsNull() {
            addCriterion("Waist is null");
            return (Criteria) this;
        }

        public Criteria andWaistIsNotNull() {
            addCriterion("Waist is not null");
            return (Criteria) this;
        }

        public Criteria andWaistEqualTo(BigDecimal value) {
            addCriterion("Waist =", value, "waist");
            return (Criteria) this;
        }

        public Criteria andWaistNotEqualTo(BigDecimal value) {
            addCriterion("Waist <>", value, "waist");
            return (Criteria) this;
        }

        public Criteria andWaistGreaterThan(BigDecimal value) {
            addCriterion("Waist >", value, "waist");
            return (Criteria) this;
        }

        public Criteria andWaistGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Waist >=", value, "waist");
            return (Criteria) this;
        }

        public Criteria andWaistLessThan(BigDecimal value) {
            addCriterion("Waist <", value, "waist");
            return (Criteria) this;
        }

        public Criteria andWaistLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Waist <=", value, "waist");
            return (Criteria) this;
        }

        public Criteria andWaistIn(List<BigDecimal> values) {
            addCriterion("Waist in", values, "waist");
            return (Criteria) this;
        }

        public Criteria andWaistNotIn(List<BigDecimal> values) {
            addCriterion("Waist not in", values, "waist");
            return (Criteria) this;
        }

        public Criteria andWaistBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Waist between", value1, value2, "waist");
            return (Criteria) this;
        }

        public Criteria andWaistNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Waist not between", value1, value2, "waist");
            return (Criteria) this;
        }

        public Criteria andOnesbpIsNull() {
            addCriterion("OneSBP is null");
            return (Criteria) this;
        }

        public Criteria andOnesbpIsNotNull() {
            addCriterion("OneSBP is not null");
            return (Criteria) this;
        }

        public Criteria andOnesbpEqualTo(BigDecimal value) {
            addCriterion("OneSBP =", value, "onesbp");
            return (Criteria) this;
        }

        public Criteria andOnesbpNotEqualTo(BigDecimal value) {
            addCriterion("OneSBP <>", value, "onesbp");
            return (Criteria) this;
        }

        public Criteria andOnesbpGreaterThan(BigDecimal value) {
            addCriterion("OneSBP >", value, "onesbp");
            return (Criteria) this;
        }

        public Criteria andOnesbpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OneSBP >=", value, "onesbp");
            return (Criteria) this;
        }

        public Criteria andOnesbpLessThan(BigDecimal value) {
            addCriterion("OneSBP <", value, "onesbp");
            return (Criteria) this;
        }

        public Criteria andOnesbpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OneSBP <=", value, "onesbp");
            return (Criteria) this;
        }

        public Criteria andOnesbpIn(List<BigDecimal> values) {
            addCriterion("OneSBP in", values, "onesbp");
            return (Criteria) this;
        }

        public Criteria andOnesbpNotIn(List<BigDecimal> values) {
            addCriterion("OneSBP not in", values, "onesbp");
            return (Criteria) this;
        }

        public Criteria andOnesbpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OneSBP between", value1, value2, "onesbp");
            return (Criteria) this;
        }

        public Criteria andOnesbpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OneSBP not between", value1, value2, "onesbp");
            return (Criteria) this;
        }

        public Criteria andOnedbpIsNull() {
            addCriterion("OneDBP is null");
            return (Criteria) this;
        }

        public Criteria andOnedbpIsNotNull() {
            addCriterion("OneDBP is not null");
            return (Criteria) this;
        }

        public Criteria andOnedbpEqualTo(BigDecimal value) {
            addCriterion("OneDBP =", value, "onedbp");
            return (Criteria) this;
        }

        public Criteria andOnedbpNotEqualTo(BigDecimal value) {
            addCriterion("OneDBP <>", value, "onedbp");
            return (Criteria) this;
        }

        public Criteria andOnedbpGreaterThan(BigDecimal value) {
            addCriterion("OneDBP >", value, "onedbp");
            return (Criteria) this;
        }

        public Criteria andOnedbpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OneDBP >=", value, "onedbp");
            return (Criteria) this;
        }

        public Criteria andOnedbpLessThan(BigDecimal value) {
            addCriterion("OneDBP <", value, "onedbp");
            return (Criteria) this;
        }

        public Criteria andOnedbpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OneDBP <=", value, "onedbp");
            return (Criteria) this;
        }

        public Criteria andOnedbpIn(List<BigDecimal> values) {
            addCriterion("OneDBP in", values, "onedbp");
            return (Criteria) this;
        }

        public Criteria andOnedbpNotIn(List<BigDecimal> values) {
            addCriterion("OneDBP not in", values, "onedbp");
            return (Criteria) this;
        }

        public Criteria andOnedbpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OneDBP between", value1, value2, "onedbp");
            return (Criteria) this;
        }

        public Criteria andOnedbpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OneDBP not between", value1, value2, "onedbp");
            return (Criteria) this;
        }

        public Criteria andOnepulseIsNull() {
            addCriterion("OnePulse is null");
            return (Criteria) this;
        }

        public Criteria andOnepulseIsNotNull() {
            addCriterion("OnePulse is not null");
            return (Criteria) this;
        }

        public Criteria andOnepulseEqualTo(Integer value) {
            addCriterion("OnePulse =", value, "onepulse");
            return (Criteria) this;
        }

        public Criteria andOnepulseNotEqualTo(Integer value) {
            addCriterion("OnePulse <>", value, "onepulse");
            return (Criteria) this;
        }

        public Criteria andOnepulseGreaterThan(Integer value) {
            addCriterion("OnePulse >", value, "onepulse");
            return (Criteria) this;
        }

        public Criteria andOnepulseGreaterThanOrEqualTo(Integer value) {
            addCriterion("OnePulse >=", value, "onepulse");
            return (Criteria) this;
        }

        public Criteria andOnepulseLessThan(Integer value) {
            addCriterion("OnePulse <", value, "onepulse");
            return (Criteria) this;
        }

        public Criteria andOnepulseLessThanOrEqualTo(Integer value) {
            addCriterion("OnePulse <=", value, "onepulse");
            return (Criteria) this;
        }

        public Criteria andOnepulseIn(List<Integer> values) {
            addCriterion("OnePulse in", values, "onepulse");
            return (Criteria) this;
        }

        public Criteria andOnepulseNotIn(List<Integer> values) {
            addCriterion("OnePulse not in", values, "onepulse");
            return (Criteria) this;
        }

        public Criteria andOnepulseBetween(Integer value1, Integer value2) {
            addCriterion("OnePulse between", value1, value2, "onepulse");
            return (Criteria) this;
        }

        public Criteria andOnepulseNotBetween(Integer value1, Integer value2) {
            addCriterion("OnePulse not between", value1, value2, "onepulse");
            return (Criteria) this;
        }

        public Criteria andTwosbpIsNull() {
            addCriterion("TwoSBP is null");
            return (Criteria) this;
        }

        public Criteria andTwosbpIsNotNull() {
            addCriterion("TwoSBP is not null");
            return (Criteria) this;
        }

        public Criteria andTwosbpEqualTo(BigDecimal value) {
            addCriterion("TwoSBP =", value, "twosbp");
            return (Criteria) this;
        }

        public Criteria andTwosbpNotEqualTo(BigDecimal value) {
            addCriterion("TwoSBP <>", value, "twosbp");
            return (Criteria) this;
        }

        public Criteria andTwosbpGreaterThan(BigDecimal value) {
            addCriterion("TwoSBP >", value, "twosbp");
            return (Criteria) this;
        }

        public Criteria andTwosbpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TwoSBP >=", value, "twosbp");
            return (Criteria) this;
        }

        public Criteria andTwosbpLessThan(BigDecimal value) {
            addCriterion("TwoSBP <", value, "twosbp");
            return (Criteria) this;
        }

        public Criteria andTwosbpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TwoSBP <=", value, "twosbp");
            return (Criteria) this;
        }

        public Criteria andTwosbpIn(List<BigDecimal> values) {
            addCriterion("TwoSBP in", values, "twosbp");
            return (Criteria) this;
        }

        public Criteria andTwosbpNotIn(List<BigDecimal> values) {
            addCriterion("TwoSBP not in", values, "twosbp");
            return (Criteria) this;
        }

        public Criteria andTwosbpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TwoSBP between", value1, value2, "twosbp");
            return (Criteria) this;
        }

        public Criteria andTwosbpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TwoSBP not between", value1, value2, "twosbp");
            return (Criteria) this;
        }

        public Criteria andTwodbpIsNull() {
            addCriterion("TwoDBP is null");
            return (Criteria) this;
        }

        public Criteria andTwodbpIsNotNull() {
            addCriterion("TwoDBP is not null");
            return (Criteria) this;
        }

        public Criteria andTwodbpEqualTo(BigDecimal value) {
            addCriterion("TwoDBP =", value, "twodbp");
            return (Criteria) this;
        }

        public Criteria andTwodbpNotEqualTo(BigDecimal value) {
            addCriterion("TwoDBP <>", value, "twodbp");
            return (Criteria) this;
        }

        public Criteria andTwodbpGreaterThan(BigDecimal value) {
            addCriterion("TwoDBP >", value, "twodbp");
            return (Criteria) this;
        }

        public Criteria andTwodbpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TwoDBP >=", value, "twodbp");
            return (Criteria) this;
        }

        public Criteria andTwodbpLessThan(BigDecimal value) {
            addCriterion("TwoDBP <", value, "twodbp");
            return (Criteria) this;
        }

        public Criteria andTwodbpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TwoDBP <=", value, "twodbp");
            return (Criteria) this;
        }

        public Criteria andTwodbpIn(List<BigDecimal> values) {
            addCriterion("TwoDBP in", values, "twodbp");
            return (Criteria) this;
        }

        public Criteria andTwodbpNotIn(List<BigDecimal> values) {
            addCriterion("TwoDBP not in", values, "twodbp");
            return (Criteria) this;
        }

        public Criteria andTwodbpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TwoDBP between", value1, value2, "twodbp");
            return (Criteria) this;
        }

        public Criteria andTwodbpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TwoDBP not between", value1, value2, "twodbp");
            return (Criteria) this;
        }

        public Criteria andTwopulseIsNull() {
            addCriterion("TwoPulse is null");
            return (Criteria) this;
        }

        public Criteria andTwopulseIsNotNull() {
            addCriterion("TwoPulse is not null");
            return (Criteria) this;
        }

        public Criteria andTwopulseEqualTo(Integer value) {
            addCriterion("TwoPulse =", value, "twopulse");
            return (Criteria) this;
        }

        public Criteria andTwopulseNotEqualTo(Integer value) {
            addCriterion("TwoPulse <>", value, "twopulse");
            return (Criteria) this;
        }

        public Criteria andTwopulseGreaterThan(Integer value) {
            addCriterion("TwoPulse >", value, "twopulse");
            return (Criteria) this;
        }

        public Criteria andTwopulseGreaterThanOrEqualTo(Integer value) {
            addCriterion("TwoPulse >=", value, "twopulse");
            return (Criteria) this;
        }

        public Criteria andTwopulseLessThan(Integer value) {
            addCriterion("TwoPulse <", value, "twopulse");
            return (Criteria) this;
        }

        public Criteria andTwopulseLessThanOrEqualTo(Integer value) {
            addCriterion("TwoPulse <=", value, "twopulse");
            return (Criteria) this;
        }

        public Criteria andTwopulseIn(List<Integer> values) {
            addCriterion("TwoPulse in", values, "twopulse");
            return (Criteria) this;
        }

        public Criteria andTwopulseNotIn(List<Integer> values) {
            addCriterion("TwoPulse not in", values, "twopulse");
            return (Criteria) this;
        }

        public Criteria andTwopulseBetween(Integer value1, Integer value2) {
            addCriterion("TwoPulse between", value1, value2, "twopulse");
            return (Criteria) this;
        }

        public Criteria andTwopulseNotBetween(Integer value1, Integer value2) {
            addCriterion("TwoPulse not between", value1, value2, "twopulse");
            return (Criteria) this;
        }

        public Criteria andCardiacsouffleIsNull() {
            addCriterion("CardiacSouffle is null");
            return (Criteria) this;
        }

        public Criteria andCardiacsouffleIsNotNull() {
            addCriterion("CardiacSouffle is not null");
            return (Criteria) this;
        }

        public Criteria andCardiacsouffleEqualTo(String value) {
            addCriterion("CardiacSouffle =", value, "cardiacsouffle");
            return (Criteria) this;
        }

        public Criteria andCardiacsouffleNotEqualTo(String value) {
            addCriterion("CardiacSouffle <>", value, "cardiacsouffle");
            return (Criteria) this;
        }

        public Criteria andCardiacsouffleGreaterThan(String value) {
            addCriterion("CardiacSouffle >", value, "cardiacsouffle");
            return (Criteria) this;
        }

        public Criteria andCardiacsouffleGreaterThanOrEqualTo(String value) {
            addCriterion("CardiacSouffle >=", value, "cardiacsouffle");
            return (Criteria) this;
        }

        public Criteria andCardiacsouffleLessThan(String value) {
            addCriterion("CardiacSouffle <", value, "cardiacsouffle");
            return (Criteria) this;
        }

        public Criteria andCardiacsouffleLessThanOrEqualTo(String value) {
            addCriterion("CardiacSouffle <=", value, "cardiacsouffle");
            return (Criteria) this;
        }

        public Criteria andCardiacsouffleLike(String value) {
            addCriterion("CardiacSouffle like", value, "cardiacsouffle");
            return (Criteria) this;
        }

        public Criteria andCardiacsouffleNotLike(String value) {
            addCriterion("CardiacSouffle not like", value, "cardiacsouffle");
            return (Criteria) this;
        }

        public Criteria andCardiacsouffleIn(List<String> values) {
            addCriterion("CardiacSouffle in", values, "cardiacsouffle");
            return (Criteria) this;
        }

        public Criteria andCardiacsouffleNotIn(List<String> values) {
            addCriterion("CardiacSouffle not in", values, "cardiacsouffle");
            return (Criteria) this;
        }

        public Criteria andCardiacsouffleBetween(String value1, String value2) {
            addCriterion("CardiacSouffle between", value1, value2, "cardiacsouffle");
            return (Criteria) this;
        }

        public Criteria andCardiacsouffleNotBetween(String value1, String value2) {
            addCriterion("CardiacSouffle not between", value1, value2, "cardiacsouffle");
            return (Criteria) this;
        }

        public Criteria andRhythmIsNull() {
            addCriterion("Rhythm is null");
            return (Criteria) this;
        }

        public Criteria andRhythmIsNotNull() {
            addCriterion("Rhythm is not null");
            return (Criteria) this;
        }

        public Criteria andRhythmEqualTo(String value) {
            addCriterion("Rhythm =", value, "rhythm");
            return (Criteria) this;
        }

        public Criteria andRhythmNotEqualTo(String value) {
            addCriterion("Rhythm <>", value, "rhythm");
            return (Criteria) this;
        }

        public Criteria andRhythmGreaterThan(String value) {
            addCriterion("Rhythm >", value, "rhythm");
            return (Criteria) this;
        }

        public Criteria andRhythmGreaterThanOrEqualTo(String value) {
            addCriterion("Rhythm >=", value, "rhythm");
            return (Criteria) this;
        }

        public Criteria andRhythmLessThan(String value) {
            addCriterion("Rhythm <", value, "rhythm");
            return (Criteria) this;
        }

        public Criteria andRhythmLessThanOrEqualTo(String value) {
            addCriterion("Rhythm <=", value, "rhythm");
            return (Criteria) this;
        }

        public Criteria andRhythmLike(String value) {
            addCriterion("Rhythm like", value, "rhythm");
            return (Criteria) this;
        }

        public Criteria andRhythmNotLike(String value) {
            addCriterion("Rhythm not like", value, "rhythm");
            return (Criteria) this;
        }

        public Criteria andRhythmIn(List<String> values) {
            addCriterion("Rhythm in", values, "rhythm");
            return (Criteria) this;
        }

        public Criteria andRhythmNotIn(List<String> values) {
            addCriterion("Rhythm not in", values, "rhythm");
            return (Criteria) this;
        }

        public Criteria andRhythmBetween(String value1, String value2) {
            addCriterion("Rhythm between", value1, value2, "rhythm");
            return (Criteria) this;
        }

        public Criteria andRhythmNotBetween(String value1, String value2) {
            addCriterion("Rhythm not between", value1, value2, "rhythm");
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