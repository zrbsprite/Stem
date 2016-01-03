package com.stem.entity;

import java.util.ArrayList;
import java.util.List;

public class WxReplyResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WxReplyResourceExample() {
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

        public Criteria andNewsKeywordIsNull() {
            addCriterion("news_keyword is null");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordIsNotNull() {
            addCriterion("news_keyword is not null");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordEqualTo(String value) {
            addCriterion("news_keyword =", value, "newsKeyword");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordNotEqualTo(String value) {
            addCriterion("news_keyword <>", value, "newsKeyword");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordGreaterThan(String value) {
            addCriterion("news_keyword >", value, "newsKeyword");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("news_keyword >=", value, "newsKeyword");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordLessThan(String value) {
            addCriterion("news_keyword <", value, "newsKeyword");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordLessThanOrEqualTo(String value) {
            addCriterion("news_keyword <=", value, "newsKeyword");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordLike(String value) {
            addCriterion("news_keyword like", value, "newsKeyword");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordNotLike(String value) {
            addCriterion("news_keyword not like", value, "newsKeyword");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordIn(List<String> values) {
            addCriterion("news_keyword in", values, "newsKeyword");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordNotIn(List<String> values) {
            addCriterion("news_keyword not in", values, "newsKeyword");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordBetween(String value1, String value2) {
            addCriterion("news_keyword between", value1, value2, "newsKeyword");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordNotBetween(String value1, String value2) {
            addCriterion("news_keyword not between", value1, value2, "newsKeyword");
            return (Criteria) this;
        }

        public Criteria andMediaIdIsNull() {
            addCriterion("media_id is null");
            return (Criteria) this;
        }

        public Criteria andMediaIdIsNotNull() {
            addCriterion("media_id is not null");
            return (Criteria) this;
        }

        public Criteria andMediaIdEqualTo(String value) {
            addCriterion("media_id =", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotEqualTo(String value) {
            addCriterion("media_id <>", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdGreaterThan(String value) {
            addCriterion("media_id >", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdGreaterThanOrEqualTo(String value) {
            addCriterion("media_id >=", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLessThan(String value) {
            addCriterion("media_id <", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLessThanOrEqualTo(String value) {
            addCriterion("media_id <=", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLike(String value) {
            addCriterion("media_id like", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotLike(String value) {
            addCriterion("media_id not like", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdIn(List<String> values) {
            addCriterion("media_id in", values, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotIn(List<String> values) {
            addCriterion("media_id not in", values, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdBetween(String value1, String value2) {
            addCriterion("media_id between", value1, value2, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotBetween(String value1, String value2) {
            addCriterion("media_id not between", value1, value2, "mediaId");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNull() {
            addCriterion("news_title is null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNotNull() {
            addCriterion("news_title is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleEqualTo(String value) {
            addCriterion("news_title =", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotEqualTo(String value) {
            addCriterion("news_title <>", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThan(String value) {
            addCriterion("news_title >", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("news_title >=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThan(String value) {
            addCriterion("news_title <", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThanOrEqualTo(String value) {
            addCriterion("news_title <=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLike(String value) {
            addCriterion("news_title like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotLike(String value) {
            addCriterion("news_title not like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIn(List<String> values) {
            addCriterion("news_title in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotIn(List<String> values) {
            addCriterion("news_title not in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleBetween(String value1, String value2) {
            addCriterion("news_title between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotBetween(String value1, String value2) {
            addCriterion("news_title not between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsDesIsNull() {
            addCriterion("news_des is null");
            return (Criteria) this;
        }

        public Criteria andNewsDesIsNotNull() {
            addCriterion("news_des is not null");
            return (Criteria) this;
        }

        public Criteria andNewsDesEqualTo(String value) {
            addCriterion("news_des =", value, "newsDes");
            return (Criteria) this;
        }

        public Criteria andNewsDesNotEqualTo(String value) {
            addCriterion("news_des <>", value, "newsDes");
            return (Criteria) this;
        }

        public Criteria andNewsDesGreaterThan(String value) {
            addCriterion("news_des >", value, "newsDes");
            return (Criteria) this;
        }

        public Criteria andNewsDesGreaterThanOrEqualTo(String value) {
            addCriterion("news_des >=", value, "newsDes");
            return (Criteria) this;
        }

        public Criteria andNewsDesLessThan(String value) {
            addCriterion("news_des <", value, "newsDes");
            return (Criteria) this;
        }

        public Criteria andNewsDesLessThanOrEqualTo(String value) {
            addCriterion("news_des <=", value, "newsDes");
            return (Criteria) this;
        }

        public Criteria andNewsDesLike(String value) {
            addCriterion("news_des like", value, "newsDes");
            return (Criteria) this;
        }

        public Criteria andNewsDesNotLike(String value) {
            addCriterion("news_des not like", value, "newsDes");
            return (Criteria) this;
        }

        public Criteria andNewsDesIn(List<String> values) {
            addCriterion("news_des in", values, "newsDes");
            return (Criteria) this;
        }

        public Criteria andNewsDesNotIn(List<String> values) {
            addCriterion("news_des not in", values, "newsDes");
            return (Criteria) this;
        }

        public Criteria andNewsDesBetween(String value1, String value2) {
            addCriterion("news_des between", value1, value2, "newsDes");
            return (Criteria) this;
        }

        public Criteria andNewsDesNotBetween(String value1, String value2) {
            addCriterion("news_des not between", value1, value2, "newsDes");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("pic_url =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("pic_url <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("pic_url >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pic_url >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("pic_url <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("pic_url <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("pic_url like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("pic_url not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("pic_url in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("pic_url not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("pic_url between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("pic_url not between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlIsNull() {
            addCriterion("news_url is null");
            return (Criteria) this;
        }

        public Criteria andNewsUrlIsNotNull() {
            addCriterion("news_url is not null");
            return (Criteria) this;
        }

        public Criteria andNewsUrlEqualTo(String value) {
            addCriterion("news_url =", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotEqualTo(String value) {
            addCriterion("news_url <>", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlGreaterThan(String value) {
            addCriterion("news_url >", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("news_url >=", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlLessThan(String value) {
            addCriterion("news_url <", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlLessThanOrEqualTo(String value) {
            addCriterion("news_url <=", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlLike(String value) {
            addCriterion("news_url like", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotLike(String value) {
            addCriterion("news_url not like", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlIn(List<String> values) {
            addCriterion("news_url in", values, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotIn(List<String> values) {
            addCriterion("news_url not in", values, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlBetween(String value1, String value2) {
            addCriterion("news_url between", value1, value2, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotBetween(String value1, String value2) {
            addCriterion("news_url not between", value1, value2, "newsUrl");
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