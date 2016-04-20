package com.stem.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TigerUserOperationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TigerUserOperationExample() {
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

        public Criteria andOperationTypeIsNull() {
            addCriterion("operation_type is null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNotNull() {
            addCriterion("operation_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeEqualTo(String value) {
            addCriterion("operation_type =", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotEqualTo(String value) {
            addCriterion("operation_type <>", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThan(String value) {
            addCriterion("operation_type >", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("operation_type >=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThan(String value) {
            addCriterion("operation_type <", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThanOrEqualTo(String value) {
            addCriterion("operation_type <=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLike(String value) {
            addCriterion("operation_type like", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotLike(String value) {
            addCriterion("operation_type not like", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIn(List<String> values) {
            addCriterion("operation_type in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotIn(List<String> values) {
            addCriterion("operation_type not in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeBetween(String value1, String value2) {
            addCriterion("operation_type between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotBetween(String value1, String value2) {
            addCriterion("operation_type not between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationUriIsNull() {
            addCriterion("operation_uri is null");
            return (Criteria) this;
        }

        public Criteria andOperationUriIsNotNull() {
            addCriterion("operation_uri is not null");
            return (Criteria) this;
        }

        public Criteria andOperationUriEqualTo(String value) {
            addCriterion("operation_uri =", value, "operationUri");
            return (Criteria) this;
        }

        public Criteria andOperationUriNotEqualTo(String value) {
            addCriterion("operation_uri <>", value, "operationUri");
            return (Criteria) this;
        }

        public Criteria andOperationUriGreaterThan(String value) {
            addCriterion("operation_uri >", value, "operationUri");
            return (Criteria) this;
        }

        public Criteria andOperationUriGreaterThanOrEqualTo(String value) {
            addCriterion("operation_uri >=", value, "operationUri");
            return (Criteria) this;
        }

        public Criteria andOperationUriLessThan(String value) {
            addCriterion("operation_uri <", value, "operationUri");
            return (Criteria) this;
        }

        public Criteria andOperationUriLessThanOrEqualTo(String value) {
            addCriterion("operation_uri <=", value, "operationUri");
            return (Criteria) this;
        }

        public Criteria andOperationUriLike(String value) {
            addCriterion("operation_uri like", value, "operationUri");
            return (Criteria) this;
        }

        public Criteria andOperationUriNotLike(String value) {
            addCriterion("operation_uri not like", value, "operationUri");
            return (Criteria) this;
        }

        public Criteria andOperationUriIn(List<String> values) {
            addCriterion("operation_uri in", values, "operationUri");
            return (Criteria) this;
        }

        public Criteria andOperationUriNotIn(List<String> values) {
            addCriterion("operation_uri not in", values, "operationUri");
            return (Criteria) this;
        }

        public Criteria andOperationUriBetween(String value1, String value2) {
            addCriterion("operation_uri between", value1, value2, "operationUri");
            return (Criteria) this;
        }

        public Criteria andOperationUriNotBetween(String value1, String value2) {
            addCriterion("operation_uri not between", value1, value2, "operationUri");
            return (Criteria) this;
        }

        public Criteria andOperationContentIsNull() {
            addCriterion("operation_content is null");
            return (Criteria) this;
        }

        public Criteria andOperationContentIsNotNull() {
            addCriterion("operation_content is not null");
            return (Criteria) this;
        }

        public Criteria andOperationContentEqualTo(String value) {
            addCriterion("operation_content =", value, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentNotEqualTo(String value) {
            addCriterion("operation_content <>", value, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentGreaterThan(String value) {
            addCriterion("operation_content >", value, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentGreaterThanOrEqualTo(String value) {
            addCriterion("operation_content >=", value, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentLessThan(String value) {
            addCriterion("operation_content <", value, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentLessThanOrEqualTo(String value) {
            addCriterion("operation_content <=", value, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentLike(String value) {
            addCriterion("operation_content like", value, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentNotLike(String value) {
            addCriterion("operation_content not like", value, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentIn(List<String> values) {
            addCriterion("operation_content in", values, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentNotIn(List<String> values) {
            addCriterion("operation_content not in", values, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentBetween(String value1, String value2) {
            addCriterion("operation_content between", value1, value2, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentNotBetween(String value1, String value2) {
            addCriterion("operation_content not between", value1, value2, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationUserIsNull() {
            addCriterion("operation_user is null");
            return (Criteria) this;
        }

        public Criteria andOperationUserIsNotNull() {
            addCriterion("operation_user is not null");
            return (Criteria) this;
        }

        public Criteria andOperationUserEqualTo(String value) {
            addCriterion("operation_user =", value, "operationUser");
            return (Criteria) this;
        }

        public Criteria andOperationUserNotEqualTo(String value) {
            addCriterion("operation_user <>", value, "operationUser");
            return (Criteria) this;
        }

        public Criteria andOperationUserGreaterThan(String value) {
            addCriterion("operation_user >", value, "operationUser");
            return (Criteria) this;
        }

        public Criteria andOperationUserGreaterThanOrEqualTo(String value) {
            addCriterion("operation_user >=", value, "operationUser");
            return (Criteria) this;
        }

        public Criteria andOperationUserLessThan(String value) {
            addCriterion("operation_user <", value, "operationUser");
            return (Criteria) this;
        }

        public Criteria andOperationUserLessThanOrEqualTo(String value) {
            addCriterion("operation_user <=", value, "operationUser");
            return (Criteria) this;
        }

        public Criteria andOperationUserLike(String value) {
            addCriterion("operation_user like", value, "operationUser");
            return (Criteria) this;
        }

        public Criteria andOperationUserNotLike(String value) {
            addCriterion("operation_user not like", value, "operationUser");
            return (Criteria) this;
        }

        public Criteria andOperationUserIn(List<String> values) {
            addCriterion("operation_user in", values, "operationUser");
            return (Criteria) this;
        }

        public Criteria andOperationUserNotIn(List<String> values) {
            addCriterion("operation_user not in", values, "operationUser");
            return (Criteria) this;
        }

        public Criteria andOperationUserBetween(String value1, String value2) {
            addCriterion("operation_user between", value1, value2, "operationUser");
            return (Criteria) this;
        }

        public Criteria andOperationUserNotBetween(String value1, String value2) {
            addCriterion("operation_user not between", value1, value2, "operationUser");
            return (Criteria) this;
        }

        public Criteria andOperationOpenidIsNull() {
            addCriterion("operation_openid is null");
            return (Criteria) this;
        }

        public Criteria andOperationOpenidIsNotNull() {
            addCriterion("operation_openid is not null");
            return (Criteria) this;
        }

        public Criteria andOperationOpenidEqualTo(String value) {
            addCriterion("operation_openid =", value, "operationOpenid");
            return (Criteria) this;
        }

        public Criteria andOperationOpenidNotEqualTo(String value) {
            addCriterion("operation_openid <>", value, "operationOpenid");
            return (Criteria) this;
        }

        public Criteria andOperationOpenidGreaterThan(String value) {
            addCriterion("operation_openid >", value, "operationOpenid");
            return (Criteria) this;
        }

        public Criteria andOperationOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("operation_openid >=", value, "operationOpenid");
            return (Criteria) this;
        }

        public Criteria andOperationOpenidLessThan(String value) {
            addCriterion("operation_openid <", value, "operationOpenid");
            return (Criteria) this;
        }

        public Criteria andOperationOpenidLessThanOrEqualTo(String value) {
            addCriterion("operation_openid <=", value, "operationOpenid");
            return (Criteria) this;
        }

        public Criteria andOperationOpenidLike(String value) {
            addCriterion("operation_openid like", value, "operationOpenid");
            return (Criteria) this;
        }

        public Criteria andOperationOpenidNotLike(String value) {
            addCriterion("operation_openid not like", value, "operationOpenid");
            return (Criteria) this;
        }

        public Criteria andOperationOpenidIn(List<String> values) {
            addCriterion("operation_openid in", values, "operationOpenid");
            return (Criteria) this;
        }

        public Criteria andOperationOpenidNotIn(List<String> values) {
            addCriterion("operation_openid not in", values, "operationOpenid");
            return (Criteria) this;
        }

        public Criteria andOperationOpenidBetween(String value1, String value2) {
            addCriterion("operation_openid between", value1, value2, "operationOpenid");
            return (Criteria) this;
        }

        public Criteria andOperationOpenidNotBetween(String value1, String value2) {
            addCriterion("operation_openid not between", value1, value2, "operationOpenid");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIsNull() {
            addCriterion("operation_time is null");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIsNotNull() {
            addCriterion("operation_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTimeEqualTo(Date value) {
            addCriterion("operation_time =", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotEqualTo(Date value) {
            addCriterion("operation_time <>", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeGreaterThan(Date value) {
            addCriterion("operation_time >", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("operation_time >=", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeLessThan(Date value) {
            addCriterion("operation_time <", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeLessThanOrEqualTo(Date value) {
            addCriterion("operation_time <=", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIn(List<Date> values) {
            addCriterion("operation_time in", values, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotIn(List<Date> values) {
            addCriterion("operation_time not in", values, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeBetween(Date value1, Date value2) {
            addCriterion("operation_time between", value1, value2, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotBetween(Date value1, Date value2) {
            addCriterion("operation_time not between", value1, value2, "operationTime");
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