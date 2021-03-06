package com.stem.entity;

import java.util.ArrayList;
import java.util.List;

public class WxNewsItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WxNewsItemExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdIsNull() {
            addCriterion("thumb_media_id is null");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdIsNotNull() {
            addCriterion("thumb_media_id is not null");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdEqualTo(String value) {
            addCriterion("thumb_media_id =", value, "thumbMediaId");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdNotEqualTo(String value) {
            addCriterion("thumb_media_id <>", value, "thumbMediaId");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdGreaterThan(String value) {
            addCriterion("thumb_media_id >", value, "thumbMediaId");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdGreaterThanOrEqualTo(String value) {
            addCriterion("thumb_media_id >=", value, "thumbMediaId");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdLessThan(String value) {
            addCriterion("thumb_media_id <", value, "thumbMediaId");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdLessThanOrEqualTo(String value) {
            addCriterion("thumb_media_id <=", value, "thumbMediaId");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdLike(String value) {
            addCriterion("thumb_media_id like", value, "thumbMediaId");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdNotLike(String value) {
            addCriterion("thumb_media_id not like", value, "thumbMediaId");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdIn(List<String> values) {
            addCriterion("thumb_media_id in", values, "thumbMediaId");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdNotIn(List<String> values) {
            addCriterion("thumb_media_id not in", values, "thumbMediaId");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdBetween(String value1, String value2) {
            addCriterion("thumb_media_id between", value1, value2, "thumbMediaId");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdNotBetween(String value1, String value2) {
            addCriterion("thumb_media_id not between", value1, value2, "thumbMediaId");
            return (Criteria) this;
        }

        public Criteria andShowCoverPicIsNull() {
            addCriterion("show_cover_pic is null");
            return (Criteria) this;
        }

        public Criteria andShowCoverPicIsNotNull() {
            addCriterion("show_cover_pic is not null");
            return (Criteria) this;
        }

        public Criteria andShowCoverPicEqualTo(Integer value) {
            addCriterion("show_cover_pic =", value, "showCoverPic");
            return (Criteria) this;
        }

        public Criteria andShowCoverPicNotEqualTo(Integer value) {
            addCriterion("show_cover_pic <>", value, "showCoverPic");
            return (Criteria) this;
        }

        public Criteria andShowCoverPicGreaterThan(Integer value) {
            addCriterion("show_cover_pic >", value, "showCoverPic");
            return (Criteria) this;
        }

        public Criteria andShowCoverPicGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_cover_pic >=", value, "showCoverPic");
            return (Criteria) this;
        }

        public Criteria andShowCoverPicLessThan(Integer value) {
            addCriterion("show_cover_pic <", value, "showCoverPic");
            return (Criteria) this;
        }

        public Criteria andShowCoverPicLessThanOrEqualTo(Integer value) {
            addCriterion("show_cover_pic <=", value, "showCoverPic");
            return (Criteria) this;
        }

        public Criteria andShowCoverPicIn(List<Integer> values) {
            addCriterion("show_cover_pic in", values, "showCoverPic");
            return (Criteria) this;
        }

        public Criteria andShowCoverPicNotIn(List<Integer> values) {
            addCriterion("show_cover_pic not in", values, "showCoverPic");
            return (Criteria) this;
        }

        public Criteria andShowCoverPicBetween(Integer value1, Integer value2) {
            addCriterion("show_cover_pic between", value1, value2, "showCoverPic");
            return (Criteria) this;
        }

        public Criteria andShowCoverPicNotBetween(Integer value1, Integer value2) {
            addCriterion("show_cover_pic not between", value1, value2, "showCoverPic");
            return (Criteria) this;
        }

        public Criteria andDigestIsNull() {
            addCriterion("digest is null");
            return (Criteria) this;
        }

        public Criteria andDigestIsNotNull() {
            addCriterion("digest is not null");
            return (Criteria) this;
        }

        public Criteria andDigestEqualTo(String value) {
            addCriterion("digest =", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotEqualTo(String value) {
            addCriterion("digest <>", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestGreaterThan(String value) {
            addCriterion("digest >", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestGreaterThanOrEqualTo(String value) {
            addCriterion("digest >=", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLessThan(String value) {
            addCriterion("digest <", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLessThanOrEqualTo(String value) {
            addCriterion("digest <=", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLike(String value) {
            addCriterion("digest like", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotLike(String value) {
            addCriterion("digest not like", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestIn(List<String> values) {
            addCriterion("digest in", values, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotIn(List<String> values) {
            addCriterion("digest not in", values, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestBetween(String value1, String value2) {
            addCriterion("digest between", value1, value2, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotBetween(String value1, String value2) {
            addCriterion("digest not between", value1, value2, "digest");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andContentSourceUrlIsNull() {
            addCriterion("content_source_url is null");
            return (Criteria) this;
        }

        public Criteria andContentSourceUrlIsNotNull() {
            addCriterion("content_source_url is not null");
            return (Criteria) this;
        }

        public Criteria andContentSourceUrlEqualTo(String value) {
            addCriterion("content_source_url =", value, "contentSourceUrl");
            return (Criteria) this;
        }

        public Criteria andContentSourceUrlNotEqualTo(String value) {
            addCriterion("content_source_url <>", value, "contentSourceUrl");
            return (Criteria) this;
        }

        public Criteria andContentSourceUrlGreaterThan(String value) {
            addCriterion("content_source_url >", value, "contentSourceUrl");
            return (Criteria) this;
        }

        public Criteria andContentSourceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("content_source_url >=", value, "contentSourceUrl");
            return (Criteria) this;
        }

        public Criteria andContentSourceUrlLessThan(String value) {
            addCriterion("content_source_url <", value, "contentSourceUrl");
            return (Criteria) this;
        }

        public Criteria andContentSourceUrlLessThanOrEqualTo(String value) {
            addCriterion("content_source_url <=", value, "contentSourceUrl");
            return (Criteria) this;
        }

        public Criteria andContentSourceUrlLike(String value) {
            addCriterion("content_source_url like", value, "contentSourceUrl");
            return (Criteria) this;
        }

        public Criteria andContentSourceUrlNotLike(String value) {
            addCriterion("content_source_url not like", value, "contentSourceUrl");
            return (Criteria) this;
        }

        public Criteria andContentSourceUrlIn(List<String> values) {
            addCriterion("content_source_url in", values, "contentSourceUrl");
            return (Criteria) this;
        }

        public Criteria andContentSourceUrlNotIn(List<String> values) {
            addCriterion("content_source_url not in", values, "contentSourceUrl");
            return (Criteria) this;
        }

        public Criteria andContentSourceUrlBetween(String value1, String value2) {
            addCriterion("content_source_url between", value1, value2, "contentSourceUrl");
            return (Criteria) this;
        }

        public Criteria andContentSourceUrlNotBetween(String value1, String value2) {
            addCriterion("content_source_url not between", value1, value2, "contentSourceUrl");
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