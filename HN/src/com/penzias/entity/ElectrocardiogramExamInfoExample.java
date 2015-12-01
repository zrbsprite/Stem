package com.penzias.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ElectrocardiogramExamInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ElectrocardiogramExamInfoExample() {
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

        public Criteria andElectrocardiogramexanidIsNull() {
            addCriterion("ElectrocardiogramExanID is null");
            return (Criteria) this;
        }

        public Criteria andElectrocardiogramexanidIsNotNull() {
            addCriterion("ElectrocardiogramExanID is not null");
            return (Criteria) this;
        }

        public Criteria andElectrocardiogramexanidEqualTo(Integer value) {
            addCriterion("ElectrocardiogramExanID =", value, "electrocardiogramexanid");
            return (Criteria) this;
        }

        public Criteria andElectrocardiogramexanidNotEqualTo(Integer value) {
            addCriterion("ElectrocardiogramExanID <>", value, "electrocardiogramexanid");
            return (Criteria) this;
        }

        public Criteria andElectrocardiogramexanidGreaterThan(Integer value) {
            addCriterion("ElectrocardiogramExanID >", value, "electrocardiogramexanid");
            return (Criteria) this;
        }

        public Criteria andElectrocardiogramexanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ElectrocardiogramExanID >=", value, "electrocardiogramexanid");
            return (Criteria) this;
        }

        public Criteria andElectrocardiogramexanidLessThan(Integer value) {
            addCriterion("ElectrocardiogramExanID <", value, "electrocardiogramexanid");
            return (Criteria) this;
        }

        public Criteria andElectrocardiogramexanidLessThanOrEqualTo(Integer value) {
            addCriterion("ElectrocardiogramExanID <=", value, "electrocardiogramexanid");
            return (Criteria) this;
        }

        public Criteria andElectrocardiogramexanidIn(List<Integer> values) {
            addCriterion("ElectrocardiogramExanID in", values, "electrocardiogramexanid");
            return (Criteria) this;
        }

        public Criteria andElectrocardiogramexanidNotIn(List<Integer> values) {
            addCriterion("ElectrocardiogramExanID not in", values, "electrocardiogramexanid");
            return (Criteria) this;
        }

        public Criteria andElectrocardiogramexanidBetween(Integer value1, Integer value2) {
            addCriterion("ElectrocardiogramExanID between", value1, value2, "electrocardiogramexanid");
            return (Criteria) this;
        }

        public Criteria andElectrocardiogramexanidNotBetween(Integer value1, Integer value2) {
            addCriterion("ElectrocardiogramExanID not between", value1, value2, "electrocardiogramexanid");
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

        public Criteria andExammanIsNull() {
            addCriterion("ExamMan is null");
            return (Criteria) this;
        }

        public Criteria andExammanIsNotNull() {
            addCriterion("ExamMan is not null");
            return (Criteria) this;
        }

        public Criteria andExammanEqualTo(String value) {
            addCriterion("ExamMan =", value, "examman");
            return (Criteria) this;
        }

        public Criteria andExammanNotEqualTo(String value) {
            addCriterion("ExamMan <>", value, "examman");
            return (Criteria) this;
        }

        public Criteria andExammanGreaterThan(String value) {
            addCriterion("ExamMan >", value, "examman");
            return (Criteria) this;
        }

        public Criteria andExammanGreaterThanOrEqualTo(String value) {
            addCriterion("ExamMan >=", value, "examman");
            return (Criteria) this;
        }

        public Criteria andExammanLessThan(String value) {
            addCriterion("ExamMan <", value, "examman");
            return (Criteria) this;
        }

        public Criteria andExammanLessThanOrEqualTo(String value) {
            addCriterion("ExamMan <=", value, "examman");
            return (Criteria) this;
        }

        public Criteria andExammanLike(String value) {
            addCriterion("ExamMan like", value, "examman");
            return (Criteria) this;
        }

        public Criteria andExammanNotLike(String value) {
            addCriterion("ExamMan not like", value, "examman");
            return (Criteria) this;
        }

        public Criteria andExammanIn(List<String> values) {
            addCriterion("ExamMan in", values, "examman");
            return (Criteria) this;
        }

        public Criteria andExammanNotIn(List<String> values) {
            addCriterion("ExamMan not in", values, "examman");
            return (Criteria) this;
        }

        public Criteria andExammanBetween(String value1, String value2) {
            addCriterion("ExamMan between", value1, value2, "examman");
            return (Criteria) this;
        }

        public Criteria andExammanNotBetween(String value1, String value2) {
            addCriterion("ExamMan not between", value1, value2, "examman");
            return (Criteria) this;
        }

        public Criteria andExamresultIsNull() {
            addCriterion("ExamResult is null");
            return (Criteria) this;
        }

        public Criteria andExamresultIsNotNull() {
            addCriterion("ExamResult is not null");
            return (Criteria) this;
        }

        public Criteria andExamresultEqualTo(String value) {
            addCriterion("ExamResult =", value, "examresult");
            return (Criteria) this;
        }

        public Criteria andExamresultNotEqualTo(String value) {
            addCriterion("ExamResult <>", value, "examresult");
            return (Criteria) this;
        }

        public Criteria andExamresultGreaterThan(String value) {
            addCriterion("ExamResult >", value, "examresult");
            return (Criteria) this;
        }

        public Criteria andExamresultGreaterThanOrEqualTo(String value) {
            addCriterion("ExamResult >=", value, "examresult");
            return (Criteria) this;
        }

        public Criteria andExamresultLessThan(String value) {
            addCriterion("ExamResult <", value, "examresult");
            return (Criteria) this;
        }

        public Criteria andExamresultLessThanOrEqualTo(String value) {
            addCriterion("ExamResult <=", value, "examresult");
            return (Criteria) this;
        }

        public Criteria andExamresultLike(String value) {
            addCriterion("ExamResult like", value, "examresult");
            return (Criteria) this;
        }

        public Criteria andExamresultNotLike(String value) {
            addCriterion("ExamResult not like", value, "examresult");
            return (Criteria) this;
        }

        public Criteria andExamresultIn(List<String> values) {
            addCriterion("ExamResult in", values, "examresult");
            return (Criteria) this;
        }

        public Criteria andExamresultNotIn(List<String> values) {
            addCriterion("ExamResult not in", values, "examresult");
            return (Criteria) this;
        }

        public Criteria andExamresultBetween(String value1, String value2) {
            addCriterion("ExamResult between", value1, value2, "examresult");
            return (Criteria) this;
        }

        public Criteria andExamresultNotBetween(String value1, String value2) {
            addCriterion("ExamResult not between", value1, value2, "examresult");
            return (Criteria) this;
        }

        public Criteria andExceptiontypeIsNull() {
            addCriterion("ExceptionType is null");
            return (Criteria) this;
        }

        public Criteria andExceptiontypeIsNotNull() {
            addCriterion("ExceptionType is not null");
            return (Criteria) this;
        }

        public Criteria andExceptiontypeEqualTo(String value) {
            addCriterion("ExceptionType =", value, "exceptiontype");
            return (Criteria) this;
        }

        public Criteria andExceptiontypeNotEqualTo(String value) {
            addCriterion("ExceptionType <>", value, "exceptiontype");
            return (Criteria) this;
        }

        public Criteria andExceptiontypeGreaterThan(String value) {
            addCriterion("ExceptionType >", value, "exceptiontype");
            return (Criteria) this;
        }

        public Criteria andExceptiontypeGreaterThanOrEqualTo(String value) {
            addCriterion("ExceptionType >=", value, "exceptiontype");
            return (Criteria) this;
        }

        public Criteria andExceptiontypeLessThan(String value) {
            addCriterion("ExceptionType <", value, "exceptiontype");
            return (Criteria) this;
        }

        public Criteria andExceptiontypeLessThanOrEqualTo(String value) {
            addCriterion("ExceptionType <=", value, "exceptiontype");
            return (Criteria) this;
        }

        public Criteria andExceptiontypeLike(String value) {
            addCriterion("ExceptionType like", value, "exceptiontype");
            return (Criteria) this;
        }

        public Criteria andExceptiontypeNotLike(String value) {
            addCriterion("ExceptionType not like", value, "exceptiontype");
            return (Criteria) this;
        }

        public Criteria andExceptiontypeIn(List<String> values) {
            addCriterion("ExceptionType in", values, "exceptiontype");
            return (Criteria) this;
        }

        public Criteria andExceptiontypeNotIn(List<String> values) {
            addCriterion("ExceptionType not in", values, "exceptiontype");
            return (Criteria) this;
        }

        public Criteria andExceptiontypeBetween(String value1, String value2) {
            addCriterion("ExceptionType between", value1, value2, "exceptiontype");
            return (Criteria) this;
        }

        public Criteria andExceptiontypeNotBetween(String value1, String value2) {
            addCriterion("ExceptionType not between", value1, value2, "exceptiontype");
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