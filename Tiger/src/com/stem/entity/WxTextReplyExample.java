package com.stem.entity;

import java.util.ArrayList;
import java.util.List;

public class WxTextReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WxTextReplyExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTextKeywordIsNull() {
            addCriterion("text_keyword is null");
            return (Criteria) this;
        }

        public Criteria andTextKeywordIsNotNull() {
            addCriterion("text_keyword is not null");
            return (Criteria) this;
        }

        public Criteria andTextKeywordEqualTo(String value) {
            addCriterion("text_keyword =", value, "textKeyword");
            return (Criteria) this;
        }

        public Criteria andTextKeywordNotEqualTo(String value) {
            addCriterion("text_keyword <>", value, "textKeyword");
            return (Criteria) this;
        }

        public Criteria andTextKeywordGreaterThan(String value) {
            addCriterion("text_keyword >", value, "textKeyword");
            return (Criteria) this;
        }

        public Criteria andTextKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("text_keyword >=", value, "textKeyword");
            return (Criteria) this;
        }

        public Criteria andTextKeywordLessThan(String value) {
            addCriterion("text_keyword <", value, "textKeyword");
            return (Criteria) this;
        }

        public Criteria andTextKeywordLessThanOrEqualTo(String value) {
            addCriterion("text_keyword <=", value, "textKeyword");
            return (Criteria) this;
        }

        public Criteria andTextKeywordLike(String value) {
            addCriterion("text_keyword like", value, "textKeyword");
            return (Criteria) this;
        }

        public Criteria andTextKeywordNotLike(String value) {
            addCriterion("text_keyword not like", value, "textKeyword");
            return (Criteria) this;
        }

        public Criteria andTextKeywordIn(List<String> values) {
            addCriterion("text_keyword in", values, "textKeyword");
            return (Criteria) this;
        }

        public Criteria andTextKeywordNotIn(List<String> values) {
            addCriterion("text_keyword not in", values, "textKeyword");
            return (Criteria) this;
        }

        public Criteria andTextKeywordBetween(String value1, String value2) {
            addCriterion("text_keyword between", value1, value2, "textKeyword");
            return (Criteria) this;
        }

        public Criteria andTextKeywordNotBetween(String value1, String value2) {
            addCriterion("text_keyword not between", value1, value2, "textKeyword");
            return (Criteria) this;
        }

        public Criteria andTextContentIsNull() {
            addCriterion("text_content is null");
            return (Criteria) this;
        }

        public Criteria andTextContentIsNotNull() {
            addCriterion("text_content is not null");
            return (Criteria) this;
        }

        public Criteria andTextContentEqualTo(String value) {
            addCriterion("text_content =", value, "textContent");
            return (Criteria) this;
        }

        public Criteria andTextContentNotEqualTo(String value) {
            addCriterion("text_content <>", value, "textContent");
            return (Criteria) this;
        }

        public Criteria andTextContentGreaterThan(String value) {
            addCriterion("text_content >", value, "textContent");
            return (Criteria) this;
        }

        public Criteria andTextContentGreaterThanOrEqualTo(String value) {
            addCriterion("text_content >=", value, "textContent");
            return (Criteria) this;
        }

        public Criteria andTextContentLessThan(String value) {
            addCriterion("text_content <", value, "textContent");
            return (Criteria) this;
        }

        public Criteria andTextContentLessThanOrEqualTo(String value) {
            addCriterion("text_content <=", value, "textContent");
            return (Criteria) this;
        }

        public Criteria andTextContentLike(String value) {
            addCriterion("text_content like", value, "textContent");
            return (Criteria) this;
        }

        public Criteria andTextContentNotLike(String value) {
            addCriterion("text_content not like", value, "textContent");
            return (Criteria) this;
        }

        public Criteria andTextContentIn(List<String> values) {
            addCriterion("text_content in", values, "textContent");
            return (Criteria) this;
        }

        public Criteria andTextContentNotIn(List<String> values) {
            addCriterion("text_content not in", values, "textContent");
            return (Criteria) this;
        }

        public Criteria andTextContentBetween(String value1, String value2) {
            addCriterion("text_content between", value1, value2, "textContent");
            return (Criteria) this;
        }

        public Criteria andTextContentNotBetween(String value1, String value2) {
            addCriterion("text_content not between", value1, value2, "textContent");
            return (Criteria) this;
        }

        public Criteria andTextStatusIsNull() {
            addCriterion("text_status is null");
            return (Criteria) this;
        }

        public Criteria andTextStatusIsNotNull() {
            addCriterion("text_status is not null");
            return (Criteria) this;
        }

        public Criteria andTextStatusEqualTo(Integer value) {
            addCriterion("text_status =", value, "textStatus");
            return (Criteria) this;
        }

        public Criteria andTextStatusNotEqualTo(Integer value) {
            addCriterion("text_status <>", value, "textStatus");
            return (Criteria) this;
        }

        public Criteria andTextStatusGreaterThan(Integer value) {
            addCriterion("text_status >", value, "textStatus");
            return (Criteria) this;
        }

        public Criteria andTextStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("text_status >=", value, "textStatus");
            return (Criteria) this;
        }

        public Criteria andTextStatusLessThan(Integer value) {
            addCriterion("text_status <", value, "textStatus");
            return (Criteria) this;
        }

        public Criteria andTextStatusLessThanOrEqualTo(Integer value) {
            addCriterion("text_status <=", value, "textStatus");
            return (Criteria) this;
        }

        public Criteria andTextStatusIn(List<Integer> values) {
            addCriterion("text_status in", values, "textStatus");
            return (Criteria) this;
        }

        public Criteria andTextStatusNotIn(List<Integer> values) {
            addCriterion("text_status not in", values, "textStatus");
            return (Criteria) this;
        }

        public Criteria andTextStatusBetween(Integer value1, Integer value2) {
            addCriterion("text_status between", value1, value2, "textStatus");
            return (Criteria) this;
        }

        public Criteria andTextStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("text_status not between", value1, value2, "textStatus");
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