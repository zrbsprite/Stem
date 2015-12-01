package com.penzias.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OtherHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OtherHistoryExample() {
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

        public Criteria andOtheridIsNull() {
            addCriterion("OtherID is null");
            return (Criteria) this;
        }

        public Criteria andOtheridIsNotNull() {
            addCriterion("OtherID is not null");
            return (Criteria) this;
        }

        public Criteria andOtheridEqualTo(Integer value) {
            addCriterion("OtherID =", value, "otherid");
            return (Criteria) this;
        }

        public Criteria andOtheridNotEqualTo(Integer value) {
            addCriterion("OtherID <>", value, "otherid");
            return (Criteria) this;
        }

        public Criteria andOtheridGreaterThan(Integer value) {
            addCriterion("OtherID >", value, "otherid");
            return (Criteria) this;
        }

        public Criteria andOtheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("OtherID >=", value, "otherid");
            return (Criteria) this;
        }

        public Criteria andOtheridLessThan(Integer value) {
            addCriterion("OtherID <", value, "otherid");
            return (Criteria) this;
        }

        public Criteria andOtheridLessThanOrEqualTo(Integer value) {
            addCriterion("OtherID <=", value, "otherid");
            return (Criteria) this;
        }

        public Criteria andOtheridIn(List<Integer> values) {
            addCriterion("OtherID in", values, "otherid");
            return (Criteria) this;
        }

        public Criteria andOtheridNotIn(List<Integer> values) {
            addCriterion("OtherID not in", values, "otherid");
            return (Criteria) this;
        }

        public Criteria andOtheridBetween(Integer value1, Integer value2) {
            addCriterion("OtherID between", value1, value2, "otherid");
            return (Criteria) this;
        }

        public Criteria andOtheridNotBetween(Integer value1, Integer value2) {
            addCriterion("OtherID not between", value1, value2, "otherid");
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

        public Criteria andOthertypeIsNull() {
            addCriterion("OtherType is null");
            return (Criteria) this;
        }

        public Criteria andOthertypeIsNotNull() {
            addCriterion("OtherType is not null");
            return (Criteria) this;
        }

        public Criteria andOthertypeEqualTo(String value) {
            addCriterion("OtherType =", value, "othertype");
            return (Criteria) this;
        }

        public Criteria andOthertypeNotEqualTo(String value) {
            addCriterion("OtherType <>", value, "othertype");
            return (Criteria) this;
        }

        public Criteria andOthertypeGreaterThan(String value) {
            addCriterion("OtherType >", value, "othertype");
            return (Criteria) this;
        }

        public Criteria andOthertypeGreaterThanOrEqualTo(String value) {
            addCriterion("OtherType >=", value, "othertype");
            return (Criteria) this;
        }

        public Criteria andOthertypeLessThan(String value) {
            addCriterion("OtherType <", value, "othertype");
            return (Criteria) this;
        }

        public Criteria andOthertypeLessThanOrEqualTo(String value) {
            addCriterion("OtherType <=", value, "othertype");
            return (Criteria) this;
        }

        public Criteria andOthertypeLike(String value) {
            addCriterion("OtherType like", value, "othertype");
            return (Criteria) this;
        }

        public Criteria andOthertypeNotLike(String value) {
            addCriterion("OtherType not like", value, "othertype");
            return (Criteria) this;
        }

        public Criteria andOthertypeIn(List<String> values) {
            addCriterion("OtherType in", values, "othertype");
            return (Criteria) this;
        }

        public Criteria andOthertypeNotIn(List<String> values) {
            addCriterion("OtherType not in", values, "othertype");
            return (Criteria) this;
        }

        public Criteria andOthertypeBetween(String value1, String value2) {
            addCriterion("OtherType between", value1, value2, "othertype");
            return (Criteria) this;
        }

        public Criteria andOthertypeNotBetween(String value1, String value2) {
            addCriterion("OtherType not between", value1, value2, "othertype");
            return (Criteria) this;
        }

        public Criteria andIsotherIsNull() {
            addCriterion("IsOther is null");
            return (Criteria) this;
        }

        public Criteria andIsotherIsNotNull() {
            addCriterion("IsOther is not null");
            return (Criteria) this;
        }

        public Criteria andIsotherEqualTo(String value) {
            addCriterion("IsOther =", value, "isother");
            return (Criteria) this;
        }

        public Criteria andIsotherNotEqualTo(String value) {
            addCriterion("IsOther <>", value, "isother");
            return (Criteria) this;
        }

        public Criteria andIsotherGreaterThan(String value) {
            addCriterion("IsOther >", value, "isother");
            return (Criteria) this;
        }

        public Criteria andIsotherGreaterThanOrEqualTo(String value) {
            addCriterion("IsOther >=", value, "isother");
            return (Criteria) this;
        }

        public Criteria andIsotherLessThan(String value) {
            addCriterion("IsOther <", value, "isother");
            return (Criteria) this;
        }

        public Criteria andIsotherLessThanOrEqualTo(String value) {
            addCriterion("IsOther <=", value, "isother");
            return (Criteria) this;
        }

        public Criteria andIsotherLike(String value) {
            addCriterion("IsOther like", value, "isother");
            return (Criteria) this;
        }

        public Criteria andIsotherNotLike(String value) {
            addCriterion("IsOther not like", value, "isother");
            return (Criteria) this;
        }

        public Criteria andIsotherIn(List<String> values) {
            addCriterion("IsOther in", values, "isother");
            return (Criteria) this;
        }

        public Criteria andIsotherNotIn(List<String> values) {
            addCriterion("IsOther not in", values, "isother");
            return (Criteria) this;
        }

        public Criteria andIsotherBetween(String value1, String value2) {
            addCriterion("IsOther between", value1, value2, "isother");
            return (Criteria) this;
        }

        public Criteria andIsotherNotBetween(String value1, String value2) {
            addCriterion("IsOther not between", value1, value2, "isother");
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