package com.penzias.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HomocysteineExamInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HomocysteineExamInfoExample() {
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

        public Criteria andHomocysteineexamidIsNull() {
            addCriterion("HomocysteineExamID is null");
            return (Criteria) this;
        }

        public Criteria andHomocysteineexamidIsNotNull() {
            addCriterion("HomocysteineExamID is not null");
            return (Criteria) this;
        }

        public Criteria andHomocysteineexamidEqualTo(Integer value) {
            addCriterion("HomocysteineExamID =", value, "homocysteineexamid");
            return (Criteria) this;
        }

        public Criteria andHomocysteineexamidNotEqualTo(Integer value) {
            addCriterion("HomocysteineExamID <>", value, "homocysteineexamid");
            return (Criteria) this;
        }

        public Criteria andHomocysteineexamidGreaterThan(Integer value) {
            addCriterion("HomocysteineExamID >", value, "homocysteineexamid");
            return (Criteria) this;
        }

        public Criteria andHomocysteineexamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("HomocysteineExamID >=", value, "homocysteineexamid");
            return (Criteria) this;
        }

        public Criteria andHomocysteineexamidLessThan(Integer value) {
            addCriterion("HomocysteineExamID <", value, "homocysteineexamid");
            return (Criteria) this;
        }

        public Criteria andHomocysteineexamidLessThanOrEqualTo(Integer value) {
            addCriterion("HomocysteineExamID <=", value, "homocysteineexamid");
            return (Criteria) this;
        }

        public Criteria andHomocysteineexamidIn(List<Integer> values) {
            addCriterion("HomocysteineExamID in", values, "homocysteineexamid");
            return (Criteria) this;
        }

        public Criteria andHomocysteineexamidNotIn(List<Integer> values) {
            addCriterion("HomocysteineExamID not in", values, "homocysteineexamid");
            return (Criteria) this;
        }

        public Criteria andHomocysteineexamidBetween(Integer value1, Integer value2) {
            addCriterion("HomocysteineExamID between", value1, value2, "homocysteineexamid");
            return (Criteria) this;
        }

        public Criteria andHomocysteineexamidNotBetween(Integer value1, Integer value2) {
            addCriterion("HomocysteineExamID not between", value1, value2, "homocysteineexamid");
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

        public Criteria andHomocysteineIsNull() {
            addCriterion("Homocysteine is null");
            return (Criteria) this;
        }

        public Criteria andHomocysteineIsNotNull() {
            addCriterion("Homocysteine is not null");
            return (Criteria) this;
        }

        public Criteria andHomocysteineEqualTo(BigDecimal value) {
            addCriterion("Homocysteine =", value, "homocysteine");
            return (Criteria) this;
        }

        public Criteria andHomocysteineNotEqualTo(BigDecimal value) {
            addCriterion("Homocysteine <>", value, "homocysteine");
            return (Criteria) this;
        }

        public Criteria andHomocysteineGreaterThan(BigDecimal value) {
            addCriterion("Homocysteine >", value, "homocysteine");
            return (Criteria) this;
        }

        public Criteria andHomocysteineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Homocysteine >=", value, "homocysteine");
            return (Criteria) this;
        }

        public Criteria andHomocysteineLessThan(BigDecimal value) {
            addCriterion("Homocysteine <", value, "homocysteine");
            return (Criteria) this;
        }

        public Criteria andHomocysteineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Homocysteine <=", value, "homocysteine");
            return (Criteria) this;
        }

        public Criteria andHomocysteineIn(List<BigDecimal> values) {
            addCriterion("Homocysteine in", values, "homocysteine");
            return (Criteria) this;
        }

        public Criteria andHomocysteineNotIn(List<BigDecimal> values) {
            addCriterion("Homocysteine not in", values, "homocysteine");
            return (Criteria) this;
        }

        public Criteria andHomocysteineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Homocysteine between", value1, value2, "homocysteine");
            return (Criteria) this;
        }

        public Criteria andHomocysteineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Homocysteine not between", value1, value2, "homocysteine");
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