package com.penzias.entity;

import java.util.ArrayList;
import java.util.List;

public class SmCodeitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmCodeitemExample() {
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

        public Criteria andCodeidIsNull() {
            addCriterion("CodeID is null");
            return (Criteria) this;
        }

        public Criteria andCodeidIsNotNull() {
            addCriterion("CodeID is not null");
            return (Criteria) this;
        }

        public Criteria andCodeidEqualTo(String value) {
            addCriterion("CodeID =", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidNotEqualTo(String value) {
            addCriterion("CodeID <>", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidGreaterThan(String value) {
            addCriterion("CodeID >", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidGreaterThanOrEqualTo(String value) {
            addCriterion("CodeID >=", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidLessThan(String value) {
            addCriterion("CodeID <", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidLessThanOrEqualTo(String value) {
            addCriterion("CodeID <=", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidLike(String value) {
            addCriterion("CodeID like", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidNotLike(String value) {
            addCriterion("CodeID not like", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidIn(List<String> values) {
            addCriterion("CodeID in", values, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidNotIn(List<String> values) {
            addCriterion("CodeID not in", values, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidBetween(String value1, String value2) {
            addCriterion("CodeID between", value1, value2, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidNotBetween(String value1, String value2) {
            addCriterion("CodeID not between", value1, value2, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("Code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("Code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("Code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("Code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("Code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("Code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("Code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("Code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("Code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("Code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("Code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("Code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("Code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("Description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("Description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("Description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("Description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("Description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("Description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("Description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("Description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("Description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("Description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("Description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("Description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andPptrIsNull() {
            addCriterion("Pptr is null");
            return (Criteria) this;
        }

        public Criteria andPptrIsNotNull() {
            addCriterion("Pptr is not null");
            return (Criteria) this;
        }

        public Criteria andPptrEqualTo(String value) {
            addCriterion("Pptr =", value, "pptr");
            return (Criteria) this;
        }

        public Criteria andPptrNotEqualTo(String value) {
            addCriterion("Pptr <>", value, "pptr");
            return (Criteria) this;
        }

        public Criteria andPptrGreaterThan(String value) {
            addCriterion("Pptr >", value, "pptr");
            return (Criteria) this;
        }

        public Criteria andPptrGreaterThanOrEqualTo(String value) {
            addCriterion("Pptr >=", value, "pptr");
            return (Criteria) this;
        }

        public Criteria andPptrLessThan(String value) {
            addCriterion("Pptr <", value, "pptr");
            return (Criteria) this;
        }

        public Criteria andPptrLessThanOrEqualTo(String value) {
            addCriterion("Pptr <=", value, "pptr");
            return (Criteria) this;
        }

        public Criteria andPptrLike(String value) {
            addCriterion("Pptr like", value, "pptr");
            return (Criteria) this;
        }

        public Criteria andPptrNotLike(String value) {
            addCriterion("Pptr not like", value, "pptr");
            return (Criteria) this;
        }

        public Criteria andPptrIn(List<String> values) {
            addCriterion("Pptr in", values, "pptr");
            return (Criteria) this;
        }

        public Criteria andPptrNotIn(List<String> values) {
            addCriterion("Pptr not in", values, "pptr");
            return (Criteria) this;
        }

        public Criteria andPptrBetween(String value1, String value2) {
            addCriterion("Pptr between", value1, value2, "pptr");
            return (Criteria) this;
        }

        public Criteria andPptrNotBetween(String value1, String value2) {
            addCriterion("Pptr not between", value1, value2, "pptr");
            return (Criteria) this;
        }

        public Criteria andCptrIsNull() {
            addCriterion("Cptr is null");
            return (Criteria) this;
        }

        public Criteria andCptrIsNotNull() {
            addCriterion("Cptr is not null");
            return (Criteria) this;
        }

        public Criteria andCptrEqualTo(Byte value) {
            addCriterion("Cptr =", value, "cptr");
            return (Criteria) this;
        }

        public Criteria andCptrNotEqualTo(Byte value) {
            addCriterion("Cptr <>", value, "cptr");
            return (Criteria) this;
        }

        public Criteria andCptrGreaterThan(Byte value) {
            addCriterion("Cptr >", value, "cptr");
            return (Criteria) this;
        }

        public Criteria andCptrGreaterThanOrEqualTo(Byte value) {
            addCriterion("Cptr >=", value, "cptr");
            return (Criteria) this;
        }

        public Criteria andCptrLessThan(Byte value) {
            addCriterion("Cptr <", value, "cptr");
            return (Criteria) this;
        }

        public Criteria andCptrLessThanOrEqualTo(Byte value) {
            addCriterion("Cptr <=", value, "cptr");
            return (Criteria) this;
        }

        public Criteria andCptrIn(List<Byte> values) {
            addCriterion("Cptr in", values, "cptr");
            return (Criteria) this;
        }

        public Criteria andCptrNotIn(List<Byte> values) {
            addCriterion("Cptr not in", values, "cptr");
            return (Criteria) this;
        }

        public Criteria andCptrBetween(Byte value1, Byte value2) {
            addCriterion("Cptr between", value1, value2, "cptr");
            return (Criteria) this;
        }

        public Criteria andCptrNotBetween(Byte value1, Byte value2) {
            addCriterion("Cptr not between", value1, value2, "cptr");
            return (Criteria) this;
        }

        public Criteria andSpellIsNull() {
            addCriterion("Spell is null");
            return (Criteria) this;
        }

        public Criteria andSpellIsNotNull() {
            addCriterion("Spell is not null");
            return (Criteria) this;
        }

        public Criteria andSpellEqualTo(String value) {
            addCriterion("Spell =", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotEqualTo(String value) {
            addCriterion("Spell <>", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellGreaterThan(String value) {
            addCriterion("Spell >", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellGreaterThanOrEqualTo(String value) {
            addCriterion("Spell >=", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellLessThan(String value) {
            addCriterion("Spell <", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellLessThanOrEqualTo(String value) {
            addCriterion("Spell <=", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellLike(String value) {
            addCriterion("Spell like", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotLike(String value) {
            addCriterion("Spell not like", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellIn(List<String> values) {
            addCriterion("Spell in", values, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotIn(List<String> values) {
            addCriterion("Spell not in", values, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellBetween(String value1, String value2) {
            addCriterion("Spell between", value1, value2, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotBetween(String value1, String value2) {
            addCriterion("Spell not between", value1, value2, "spell");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("Remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("Remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("Remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("Remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("Remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("Remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("Remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("Remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("Remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("Remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("Remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("Remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("Remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("Remarks not between", value1, value2, "remarks");
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