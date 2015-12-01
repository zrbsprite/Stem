package com.penzias.entity;

import java.util.ArrayList;
import java.util.List;

public class HistoryPharmacyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HistoryPharmacyExample() {
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

        public Criteria andPharmacyidIsNull() {
            addCriterion("PharmacyID is null");
            return (Criteria) this;
        }

        public Criteria andPharmacyidIsNotNull() {
            addCriterion("PharmacyID is not null");
            return (Criteria) this;
        }

        public Criteria andPharmacyidEqualTo(Integer value) {
            addCriterion("PharmacyID =", value, "pharmacyid");
            return (Criteria) this;
        }

        public Criteria andPharmacyidNotEqualTo(Integer value) {
            addCriterion("PharmacyID <>", value, "pharmacyid");
            return (Criteria) this;
        }

        public Criteria andPharmacyidGreaterThan(Integer value) {
            addCriterion("PharmacyID >", value, "pharmacyid");
            return (Criteria) this;
        }

        public Criteria andPharmacyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PharmacyID >=", value, "pharmacyid");
            return (Criteria) this;
        }

        public Criteria andPharmacyidLessThan(Integer value) {
            addCriterion("PharmacyID <", value, "pharmacyid");
            return (Criteria) this;
        }

        public Criteria andPharmacyidLessThanOrEqualTo(Integer value) {
            addCriterion("PharmacyID <=", value, "pharmacyid");
            return (Criteria) this;
        }

        public Criteria andPharmacyidIn(List<Integer> values) {
            addCriterion("PharmacyID in", values, "pharmacyid");
            return (Criteria) this;
        }

        public Criteria andPharmacyidNotIn(List<Integer> values) {
            addCriterion("PharmacyID not in", values, "pharmacyid");
            return (Criteria) this;
        }

        public Criteria andPharmacyidBetween(Integer value1, Integer value2) {
            addCriterion("PharmacyID between", value1, value2, "pharmacyid");
            return (Criteria) this;
        }

        public Criteria andPharmacyidNotBetween(Integer value1, Integer value2) {
            addCriterion("PharmacyID not between", value1, value2, "pharmacyid");
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

        public Criteria andPharmacytypeIsNull() {
            addCriterion("PharmacyType is null");
            return (Criteria) this;
        }

        public Criteria andPharmacytypeIsNotNull() {
            addCriterion("PharmacyType is not null");
            return (Criteria) this;
        }

        public Criteria andPharmacytypeEqualTo(String value) {
            addCriterion("PharmacyType =", value, "pharmacytype");
            return (Criteria) this;
        }

        public Criteria andPharmacytypeNotEqualTo(String value) {
            addCriterion("PharmacyType <>", value, "pharmacytype");
            return (Criteria) this;
        }

        public Criteria andPharmacytypeGreaterThan(String value) {
            addCriterion("PharmacyType >", value, "pharmacytype");
            return (Criteria) this;
        }

        public Criteria andPharmacytypeGreaterThanOrEqualTo(String value) {
            addCriterion("PharmacyType >=", value, "pharmacytype");
            return (Criteria) this;
        }

        public Criteria andPharmacytypeLessThan(String value) {
            addCriterion("PharmacyType <", value, "pharmacytype");
            return (Criteria) this;
        }

        public Criteria andPharmacytypeLessThanOrEqualTo(String value) {
            addCriterion("PharmacyType <=", value, "pharmacytype");
            return (Criteria) this;
        }

        public Criteria andPharmacytypeLike(String value) {
            addCriterion("PharmacyType like", value, "pharmacytype");
            return (Criteria) this;
        }

        public Criteria andPharmacytypeNotLike(String value) {
            addCriterion("PharmacyType not like", value, "pharmacytype");
            return (Criteria) this;
        }

        public Criteria andPharmacytypeIn(List<String> values) {
            addCriterion("PharmacyType in", values, "pharmacytype");
            return (Criteria) this;
        }

        public Criteria andPharmacytypeNotIn(List<String> values) {
            addCriterion("PharmacyType not in", values, "pharmacytype");
            return (Criteria) this;
        }

        public Criteria andPharmacytypeBetween(String value1, String value2) {
            addCriterion("PharmacyType between", value1, value2, "pharmacytype");
            return (Criteria) this;
        }

        public Criteria andPharmacytypeNotBetween(String value1, String value2) {
            addCriterion("PharmacyType not between", value1, value2, "pharmacytype");
            return (Criteria) this;
        }

        public Criteria andPharmacynameIsNull() {
            addCriterion("PharmacyName is null");
            return (Criteria) this;
        }

        public Criteria andPharmacynameIsNotNull() {
            addCriterion("PharmacyName is not null");
            return (Criteria) this;
        }

        public Criteria andPharmacynameEqualTo(String value) {
            addCriterion("PharmacyName =", value, "pharmacyname");
            return (Criteria) this;
        }

        public Criteria andPharmacynameNotEqualTo(String value) {
            addCriterion("PharmacyName <>", value, "pharmacyname");
            return (Criteria) this;
        }

        public Criteria andPharmacynameGreaterThan(String value) {
            addCriterion("PharmacyName >", value, "pharmacyname");
            return (Criteria) this;
        }

        public Criteria andPharmacynameGreaterThanOrEqualTo(String value) {
            addCriterion("PharmacyName >=", value, "pharmacyname");
            return (Criteria) this;
        }

        public Criteria andPharmacynameLessThan(String value) {
            addCriterion("PharmacyName <", value, "pharmacyname");
            return (Criteria) this;
        }

        public Criteria andPharmacynameLessThanOrEqualTo(String value) {
            addCriterion("PharmacyName <=", value, "pharmacyname");
            return (Criteria) this;
        }

        public Criteria andPharmacynameLike(String value) {
            addCriterion("PharmacyName like", value, "pharmacyname");
            return (Criteria) this;
        }

        public Criteria andPharmacynameNotLike(String value) {
            addCriterion("PharmacyName not like", value, "pharmacyname");
            return (Criteria) this;
        }

        public Criteria andPharmacynameIn(List<String> values) {
            addCriterion("PharmacyName in", values, "pharmacyname");
            return (Criteria) this;
        }

        public Criteria andPharmacynameNotIn(List<String> values) {
            addCriterion("PharmacyName not in", values, "pharmacyname");
            return (Criteria) this;
        }

        public Criteria andPharmacynameBetween(String value1, String value2) {
            addCriterion("PharmacyName between", value1, value2, "pharmacyname");
            return (Criteria) this;
        }

        public Criteria andPharmacynameNotBetween(String value1, String value2) {
            addCriterion("PharmacyName not between", value1, value2, "pharmacyname");
            return (Criteria) this;
        }

        public Criteria andPharmacyyearIsNull() {
            addCriterion("PharmacyYear is null");
            return (Criteria) this;
        }

        public Criteria andPharmacyyearIsNotNull() {
            addCriterion("PharmacyYear is not null");
            return (Criteria) this;
        }

        public Criteria andPharmacyyearEqualTo(String value) {
            addCriterion("PharmacyYear =", value, "pharmacyyear");
            return (Criteria) this;
        }

        public Criteria andPharmacyyearNotEqualTo(String value) {
            addCriterion("PharmacyYear <>", value, "pharmacyyear");
            return (Criteria) this;
        }

        public Criteria andPharmacyyearGreaterThan(String value) {
            addCriterion("PharmacyYear >", value, "pharmacyyear");
            return (Criteria) this;
        }

        public Criteria andPharmacyyearGreaterThanOrEqualTo(String value) {
            addCriterion("PharmacyYear >=", value, "pharmacyyear");
            return (Criteria) this;
        }

        public Criteria andPharmacyyearLessThan(String value) {
            addCriterion("PharmacyYear <", value, "pharmacyyear");
            return (Criteria) this;
        }

        public Criteria andPharmacyyearLessThanOrEqualTo(String value) {
            addCriterion("PharmacyYear <=", value, "pharmacyyear");
            return (Criteria) this;
        }

        public Criteria andPharmacyyearLike(String value) {
            addCriterion("PharmacyYear like", value, "pharmacyyear");
            return (Criteria) this;
        }

        public Criteria andPharmacyyearNotLike(String value) {
            addCriterion("PharmacyYear not like", value, "pharmacyyear");
            return (Criteria) this;
        }

        public Criteria andPharmacyyearIn(List<String> values) {
            addCriterion("PharmacyYear in", values, "pharmacyyear");
            return (Criteria) this;
        }

        public Criteria andPharmacyyearNotIn(List<String> values) {
            addCriterion("PharmacyYear not in", values, "pharmacyyear");
            return (Criteria) this;
        }

        public Criteria andPharmacyyearBetween(String value1, String value2) {
            addCriterion("PharmacyYear between", value1, value2, "pharmacyyear");
            return (Criteria) this;
        }

        public Criteria andPharmacyyearNotBetween(String value1, String value2) {
            addCriterion("PharmacyYear not between", value1, value2, "pharmacyyear");
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