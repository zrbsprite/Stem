package com.stem.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductTypeRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductTypeRelationExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductTypeCodeIsNull() {
            addCriterion("PRODUCT_TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeCodeIsNotNull() {
            addCriterion("PRODUCT_TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeCodeEqualTo(String value) {
            addCriterion("PRODUCT_TYPE_CODE =", value, "productTypeCode");
            return (Criteria) this;
        }

        public Criteria andProductTypeCodeNotEqualTo(String value) {
            addCriterion("PRODUCT_TYPE_CODE <>", value, "productTypeCode");
            return (Criteria) this;
        }

        public Criteria andProductTypeCodeGreaterThan(String value) {
            addCriterion("PRODUCT_TYPE_CODE >", value, "productTypeCode");
            return (Criteria) this;
        }

        public Criteria andProductTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TYPE_CODE >=", value, "productTypeCode");
            return (Criteria) this;
        }

        public Criteria andProductTypeCodeLessThan(String value) {
            addCriterion("PRODUCT_TYPE_CODE <", value, "productTypeCode");
            return (Criteria) this;
        }

        public Criteria andProductTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TYPE_CODE <=", value, "productTypeCode");
            return (Criteria) this;
        }

        public Criteria andProductTypeCodeLike(String value) {
            addCriterion("PRODUCT_TYPE_CODE like", value, "productTypeCode");
            return (Criteria) this;
        }

        public Criteria andProductTypeCodeNotLike(String value) {
            addCriterion("PRODUCT_TYPE_CODE not like", value, "productTypeCode");
            return (Criteria) this;
        }

        public Criteria andProductTypeCodeIn(List<String> values) {
            addCriterion("PRODUCT_TYPE_CODE in", values, "productTypeCode");
            return (Criteria) this;
        }

        public Criteria andProductTypeCodeNotIn(List<String> values) {
            addCriterion("PRODUCT_TYPE_CODE not in", values, "productTypeCode");
            return (Criteria) this;
        }

        public Criteria andProductTypeCodeBetween(String value1, String value2) {
            addCriterion("PRODUCT_TYPE_CODE between", value1, value2, "productTypeCode");
            return (Criteria) this;
        }

        public Criteria andProductTypeCodeNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_TYPE_CODE not between", value1, value2, "productTypeCode");
            return (Criteria) this;
        }

        public Criteria andProductCCodeIsNull() {
            addCriterion("PRODUCT_C_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProductCCodeIsNotNull() {
            addCriterion("PRODUCT_C_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProductCCodeEqualTo(String value) {
            addCriterion("PRODUCT_C_CODE =", value, "productCCode");
            return (Criteria) this;
        }

        public Criteria andProductCCodeNotEqualTo(String value) {
            addCriterion("PRODUCT_C_CODE <>", value, "productCCode");
            return (Criteria) this;
        }

        public Criteria andProductCCodeGreaterThan(String value) {
            addCriterion("PRODUCT_C_CODE >", value, "productCCode");
            return (Criteria) this;
        }

        public Criteria andProductCCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_C_CODE >=", value, "productCCode");
            return (Criteria) this;
        }

        public Criteria andProductCCodeLessThan(String value) {
            addCriterion("PRODUCT_C_CODE <", value, "productCCode");
            return (Criteria) this;
        }

        public Criteria andProductCCodeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_C_CODE <=", value, "productCCode");
            return (Criteria) this;
        }

        public Criteria andProductCCodeLike(String value) {
            addCriterion("PRODUCT_C_CODE like", value, "productCCode");
            return (Criteria) this;
        }

        public Criteria andProductCCodeNotLike(String value) {
            addCriterion("PRODUCT_C_CODE not like", value, "productCCode");
            return (Criteria) this;
        }

        public Criteria andProductCCodeIn(List<String> values) {
            addCriterion("PRODUCT_C_CODE in", values, "productCCode");
            return (Criteria) this;
        }

        public Criteria andProductCCodeNotIn(List<String> values) {
            addCriterion("PRODUCT_C_CODE not in", values, "productCCode");
            return (Criteria) this;
        }

        public Criteria andProductCCodeBetween(String value1, String value2) {
            addCriterion("PRODUCT_C_CODE between", value1, value2, "productCCode");
            return (Criteria) this;
        }

        public Criteria andProductCCodeNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_C_CODE not between", value1, value2, "productCCode");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNull() {
            addCriterion("SEQUENCE is null");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNotNull() {
            addCriterion("SEQUENCE is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceEqualTo(Integer value) {
            addCriterion("SEQUENCE =", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotEqualTo(Integer value) {
            addCriterion("SEQUENCE <>", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThan(Integer value) {
            addCriterion("SEQUENCE >", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEQUENCE >=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThan(Integer value) {
            addCriterion("SEQUENCE <", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThanOrEqualTo(Integer value) {
            addCriterion("SEQUENCE <=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceIn(List<Integer> values) {
            addCriterion("SEQUENCE in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotIn(List<Integer> values) {
            addCriterion("SEQUENCE not in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceBetween(Integer value1, Integer value2) {
            addCriterion("SEQUENCE between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("SEQUENCE not between", value1, value2, "sequence");
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