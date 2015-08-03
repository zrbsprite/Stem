package com.stem.entity;

import java.util.ArrayList;
import java.util.List;

public class MemberLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberLevelExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andInvitationSumIsNull() {
            addCriterion("INVITATION_SUM is null");
            return (Criteria) this;
        }

        public Criteria andInvitationSumIsNotNull() {
            addCriterion("INVITATION_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationSumEqualTo(Short value) {
            addCriterion("INVITATION_SUM =", value, "invitationSum");
            return (Criteria) this;
        }

        public Criteria andInvitationSumNotEqualTo(Short value) {
            addCriterion("INVITATION_SUM <>", value, "invitationSum");
            return (Criteria) this;
        }

        public Criteria andInvitationSumGreaterThan(Short value) {
            addCriterion("INVITATION_SUM >", value, "invitationSum");
            return (Criteria) this;
        }

        public Criteria andInvitationSumGreaterThanOrEqualTo(Short value) {
            addCriterion("INVITATION_SUM >=", value, "invitationSum");
            return (Criteria) this;
        }

        public Criteria andInvitationSumLessThan(Short value) {
            addCriterion("INVITATION_SUM <", value, "invitationSum");
            return (Criteria) this;
        }

        public Criteria andInvitationSumLessThanOrEqualTo(Short value) {
            addCriterion("INVITATION_SUM <=", value, "invitationSum");
            return (Criteria) this;
        }

        public Criteria andInvitationSumIn(List<Short> values) {
            addCriterion("INVITATION_SUM in", values, "invitationSum");
            return (Criteria) this;
        }

        public Criteria andInvitationSumNotIn(List<Short> values) {
            addCriterion("INVITATION_SUM not in", values, "invitationSum");
            return (Criteria) this;
        }

        public Criteria andInvitationSumBetween(Short value1, Short value2) {
            addCriterion("INVITATION_SUM between", value1, value2, "invitationSum");
            return (Criteria) this;
        }

        public Criteria andInvitationSumNotBetween(Short value1, Short value2) {
            addCriterion("INVITATION_SUM not between", value1, value2, "invitationSum");
            return (Criteria) this;
        }

        public Criteria andBuyDiscountIsNull() {
            addCriterion("BUY_DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBuyDiscountIsNotNull() {
            addCriterion("BUY_DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBuyDiscountEqualTo(String value) {
            addCriterion("BUY_DISCOUNT =", value, "buyDiscount");
            return (Criteria) this;
        }

        public Criteria andBuyDiscountNotEqualTo(String value) {
            addCriterion("BUY_DISCOUNT <>", value, "buyDiscount");
            return (Criteria) this;
        }

        public Criteria andBuyDiscountGreaterThan(String value) {
            addCriterion("BUY_DISCOUNT >", value, "buyDiscount");
            return (Criteria) this;
        }

        public Criteria andBuyDiscountGreaterThanOrEqualTo(String value) {
            addCriterion("BUY_DISCOUNT >=", value, "buyDiscount");
            return (Criteria) this;
        }

        public Criteria andBuyDiscountLessThan(String value) {
            addCriterion("BUY_DISCOUNT <", value, "buyDiscount");
            return (Criteria) this;
        }

        public Criteria andBuyDiscountLessThanOrEqualTo(String value) {
            addCriterion("BUY_DISCOUNT <=", value, "buyDiscount");
            return (Criteria) this;
        }

        public Criteria andBuyDiscountLike(String value) {
            addCriterion("BUY_DISCOUNT like", value, "buyDiscount");
            return (Criteria) this;
        }

        public Criteria andBuyDiscountNotLike(String value) {
            addCriterion("BUY_DISCOUNT not like", value, "buyDiscount");
            return (Criteria) this;
        }

        public Criteria andBuyDiscountIn(List<String> values) {
            addCriterion("BUY_DISCOUNT in", values, "buyDiscount");
            return (Criteria) this;
        }

        public Criteria andBuyDiscountNotIn(List<String> values) {
            addCriterion("BUY_DISCOUNT not in", values, "buyDiscount");
            return (Criteria) this;
        }

        public Criteria andBuyDiscountBetween(String value1, String value2) {
            addCriterion("BUY_DISCOUNT between", value1, value2, "buyDiscount");
            return (Criteria) this;
        }

        public Criteria andBuyDiscountNotBetween(String value1, String value2) {
            addCriterion("BUY_DISCOUNT not between", value1, value2, "buyDiscount");
            return (Criteria) this;
        }

        public Criteria andBuyIntegralIsNull() {
            addCriterion("BUY_INTEGRAL is null");
            return (Criteria) this;
        }

        public Criteria andBuyIntegralIsNotNull() {
            addCriterion("BUY_INTEGRAL is not null");
            return (Criteria) this;
        }

        public Criteria andBuyIntegralEqualTo(String value) {
            addCriterion("BUY_INTEGRAL =", value, "buyIntegral");
            return (Criteria) this;
        }

        public Criteria andBuyIntegralNotEqualTo(String value) {
            addCriterion("BUY_INTEGRAL <>", value, "buyIntegral");
            return (Criteria) this;
        }

        public Criteria andBuyIntegralGreaterThan(String value) {
            addCriterion("BUY_INTEGRAL >", value, "buyIntegral");
            return (Criteria) this;
        }

        public Criteria andBuyIntegralGreaterThanOrEqualTo(String value) {
            addCriterion("BUY_INTEGRAL >=", value, "buyIntegral");
            return (Criteria) this;
        }

        public Criteria andBuyIntegralLessThan(String value) {
            addCriterion("BUY_INTEGRAL <", value, "buyIntegral");
            return (Criteria) this;
        }

        public Criteria andBuyIntegralLessThanOrEqualTo(String value) {
            addCriterion("BUY_INTEGRAL <=", value, "buyIntegral");
            return (Criteria) this;
        }

        public Criteria andBuyIntegralLike(String value) {
            addCriterion("BUY_INTEGRAL like", value, "buyIntegral");
            return (Criteria) this;
        }

        public Criteria andBuyIntegralNotLike(String value) {
            addCriterion("BUY_INTEGRAL not like", value, "buyIntegral");
            return (Criteria) this;
        }

        public Criteria andBuyIntegralIn(List<String> values) {
            addCriterion("BUY_INTEGRAL in", values, "buyIntegral");
            return (Criteria) this;
        }

        public Criteria andBuyIntegralNotIn(List<String> values) {
            addCriterion("BUY_INTEGRAL not in", values, "buyIntegral");
            return (Criteria) this;
        }

        public Criteria andBuyIntegralBetween(String value1, String value2) {
            addCriterion("BUY_INTEGRAL between", value1, value2, "buyIntegral");
            return (Criteria) this;
        }

        public Criteria andBuyIntegralNotBetween(String value1, String value2) {
            addCriterion("BUY_INTEGRAL not between", value1, value2, "buyIntegral");
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