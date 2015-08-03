package com.stem.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("PIC is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("PIC is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("PIC =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("PIC <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("PIC >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("PIC >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("PIC <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("PIC <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("PIC like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("PIC not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("PIC in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("PIC not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("PIC between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("PIC not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andBuyUrlIsNull() {
            addCriterion("BUY_URL is null");
            return (Criteria) this;
        }

        public Criteria andBuyUrlIsNotNull() {
            addCriterion("BUY_URL is not null");
            return (Criteria) this;
        }

        public Criteria andBuyUrlEqualTo(String value) {
            addCriterion("BUY_URL =", value, "buyUrl");
            return (Criteria) this;
        }

        public Criteria andBuyUrlNotEqualTo(String value) {
            addCriterion("BUY_URL <>", value, "buyUrl");
            return (Criteria) this;
        }

        public Criteria andBuyUrlGreaterThan(String value) {
            addCriterion("BUY_URL >", value, "buyUrl");
            return (Criteria) this;
        }

        public Criteria andBuyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("BUY_URL >=", value, "buyUrl");
            return (Criteria) this;
        }

        public Criteria andBuyUrlLessThan(String value) {
            addCriterion("BUY_URL <", value, "buyUrl");
            return (Criteria) this;
        }

        public Criteria andBuyUrlLessThanOrEqualTo(String value) {
            addCriterion("BUY_URL <=", value, "buyUrl");
            return (Criteria) this;
        }

        public Criteria andBuyUrlLike(String value) {
            addCriterion("BUY_URL like", value, "buyUrl");
            return (Criteria) this;
        }

        public Criteria andBuyUrlNotLike(String value) {
            addCriterion("BUY_URL not like", value, "buyUrl");
            return (Criteria) this;
        }

        public Criteria andBuyUrlIn(List<String> values) {
            addCriterion("BUY_URL in", values, "buyUrl");
            return (Criteria) this;
        }

        public Criteria andBuyUrlNotIn(List<String> values) {
            addCriterion("BUY_URL not in", values, "buyUrl");
            return (Criteria) this;
        }

        public Criteria andBuyUrlBetween(String value1, String value2) {
            addCriterion("BUY_URL between", value1, value2, "buyUrl");
            return (Criteria) this;
        }

        public Criteria andBuyUrlNotBetween(String value1, String value2) {
            addCriterion("BUY_URL not between", value1, value2, "buyUrl");
            return (Criteria) this;
        }

        public Criteria andUpDownIsNull() {
            addCriterion("UP_DOWN is null");
            return (Criteria) this;
        }

        public Criteria andUpDownIsNotNull() {
            addCriterion("UP_DOWN is not null");
            return (Criteria) this;
        }

        public Criteria andUpDownEqualTo(String value) {
            addCriterion("UP_DOWN =", value, "upDown");
            return (Criteria) this;
        }

        public Criteria andUpDownNotEqualTo(String value) {
            addCriterion("UP_DOWN <>", value, "upDown");
            return (Criteria) this;
        }

        public Criteria andUpDownGreaterThan(String value) {
            addCriterion("UP_DOWN >", value, "upDown");
            return (Criteria) this;
        }

        public Criteria andUpDownGreaterThanOrEqualTo(String value) {
            addCriterion("UP_DOWN >=", value, "upDown");
            return (Criteria) this;
        }

        public Criteria andUpDownLessThan(String value) {
            addCriterion("UP_DOWN <", value, "upDown");
            return (Criteria) this;
        }

        public Criteria andUpDownLessThanOrEqualTo(String value) {
            addCriterion("UP_DOWN <=", value, "upDown");
            return (Criteria) this;
        }

        public Criteria andUpDownLike(String value) {
            addCriterion("UP_DOWN like", value, "upDown");
            return (Criteria) this;
        }

        public Criteria andUpDownNotLike(String value) {
            addCriterion("UP_DOWN not like", value, "upDown");
            return (Criteria) this;
        }

        public Criteria andUpDownIn(List<String> values) {
            addCriterion("UP_DOWN in", values, "upDown");
            return (Criteria) this;
        }

        public Criteria andUpDownNotIn(List<String> values) {
            addCriterion("UP_DOWN not in", values, "upDown");
            return (Criteria) this;
        }

        public Criteria andUpDownBetween(String value1, String value2) {
            addCriterion("UP_DOWN between", value1, value2, "upDown");
            return (Criteria) this;
        }

        public Criteria andUpDownNotBetween(String value1, String value2) {
            addCriterion("UP_DOWN not between", value1, value2, "upDown");
            return (Criteria) this;
        }

        public Criteria andShareUrlIsNull() {
            addCriterion("SHARE_URL is null");
            return (Criteria) this;
        }

        public Criteria andShareUrlIsNotNull() {
            addCriterion("SHARE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andShareUrlEqualTo(String value) {
            addCriterion("SHARE_URL =", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlNotEqualTo(String value) {
            addCriterion("SHARE_URL <>", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlGreaterThan(String value) {
            addCriterion("SHARE_URL >", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SHARE_URL >=", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlLessThan(String value) {
            addCriterion("SHARE_URL <", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlLessThanOrEqualTo(String value) {
            addCriterion("SHARE_URL <=", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlLike(String value) {
            addCriterion("SHARE_URL like", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlNotLike(String value) {
            addCriterion("SHARE_URL not like", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlIn(List<String> values) {
            addCriterion("SHARE_URL in", values, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlNotIn(List<String> values) {
            addCriterion("SHARE_URL not in", values, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlBetween(String value1, String value2) {
            addCriterion("SHARE_URL between", value1, value2, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlNotBetween(String value1, String value2) {
            addCriterion("SHARE_URL not between", value1, value2, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andTrendsUrlIsNull() {
            addCriterion("TRENDS_URL is null");
            return (Criteria) this;
        }

        public Criteria andTrendsUrlIsNotNull() {
            addCriterion("TRENDS_URL is not null");
            return (Criteria) this;
        }

        public Criteria andTrendsUrlEqualTo(String value) {
            addCriterion("TRENDS_URL =", value, "trendsUrl");
            return (Criteria) this;
        }

        public Criteria andTrendsUrlNotEqualTo(String value) {
            addCriterion("TRENDS_URL <>", value, "trendsUrl");
            return (Criteria) this;
        }

        public Criteria andTrendsUrlGreaterThan(String value) {
            addCriterion("TRENDS_URL >", value, "trendsUrl");
            return (Criteria) this;
        }

        public Criteria andTrendsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("TRENDS_URL >=", value, "trendsUrl");
            return (Criteria) this;
        }

        public Criteria andTrendsUrlLessThan(String value) {
            addCriterion("TRENDS_URL <", value, "trendsUrl");
            return (Criteria) this;
        }

        public Criteria andTrendsUrlLessThanOrEqualTo(String value) {
            addCriterion("TRENDS_URL <=", value, "trendsUrl");
            return (Criteria) this;
        }

        public Criteria andTrendsUrlLike(String value) {
            addCriterion("TRENDS_URL like", value, "trendsUrl");
            return (Criteria) this;
        }

        public Criteria andTrendsUrlNotLike(String value) {
            addCriterion("TRENDS_URL not like", value, "trendsUrl");
            return (Criteria) this;
        }

        public Criteria andTrendsUrlIn(List<String> values) {
            addCriterion("TRENDS_URL in", values, "trendsUrl");
            return (Criteria) this;
        }

        public Criteria andTrendsUrlNotIn(List<String> values) {
            addCriterion("TRENDS_URL not in", values, "trendsUrl");
            return (Criteria) this;
        }

        public Criteria andTrendsUrlBetween(String value1, String value2) {
            addCriterion("TRENDS_URL between", value1, value2, "trendsUrl");
            return (Criteria) this;
        }

        public Criteria andTrendsUrlNotBetween(String value1, String value2) {
            addCriterion("TRENDS_URL not between", value1, value2, "trendsUrl");
            return (Criteria) this;
        }

        public Criteria andScoreStandardIsNull() {
            addCriterion("SCORE_STANDARD is null");
            return (Criteria) this;
        }

        public Criteria andScoreStandardIsNotNull() {
            addCriterion("SCORE_STANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andScoreStandardEqualTo(String value) {
            addCriterion("SCORE_STANDARD =", value, "scoreStandard");
            return (Criteria) this;
        }

        public Criteria andScoreStandardNotEqualTo(String value) {
            addCriterion("SCORE_STANDARD <>", value, "scoreStandard");
            return (Criteria) this;
        }

        public Criteria andScoreStandardGreaterThan(String value) {
            addCriterion("SCORE_STANDARD >", value, "scoreStandard");
            return (Criteria) this;
        }

        public Criteria andScoreStandardGreaterThanOrEqualTo(String value) {
            addCriterion("SCORE_STANDARD >=", value, "scoreStandard");
            return (Criteria) this;
        }

        public Criteria andScoreStandardLessThan(String value) {
            addCriterion("SCORE_STANDARD <", value, "scoreStandard");
            return (Criteria) this;
        }

        public Criteria andScoreStandardLessThanOrEqualTo(String value) {
            addCriterion("SCORE_STANDARD <=", value, "scoreStandard");
            return (Criteria) this;
        }

        public Criteria andScoreStandardLike(String value) {
            addCriterion("SCORE_STANDARD like", value, "scoreStandard");
            return (Criteria) this;
        }

        public Criteria andScoreStandardNotLike(String value) {
            addCriterion("SCORE_STANDARD not like", value, "scoreStandard");
            return (Criteria) this;
        }

        public Criteria andScoreStandardIn(List<String> values) {
            addCriterion("SCORE_STANDARD in", values, "scoreStandard");
            return (Criteria) this;
        }

        public Criteria andScoreStandardNotIn(List<String> values) {
            addCriterion("SCORE_STANDARD not in", values, "scoreStandard");
            return (Criteria) this;
        }

        public Criteria andScoreStandardBetween(String value1, String value2) {
            addCriterion("SCORE_STANDARD between", value1, value2, "scoreStandard");
            return (Criteria) this;
        }

        public Criteria andScoreStandardNotBetween(String value1, String value2) {
            addCriterion("SCORE_STANDARD not between", value1, value2, "scoreStandard");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("MARKET_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("MARKET_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(String value) {
            addCriterion("MARKET_PRICE =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(String value) {
            addCriterion("MARKET_PRICE <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(String value) {
            addCriterion("MARKET_PRICE >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(String value) {
            addCriterion("MARKET_PRICE >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(String value) {
            addCriterion("MARKET_PRICE <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(String value) {
            addCriterion("MARKET_PRICE <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLike(String value) {
            addCriterion("MARKET_PRICE like", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotLike(String value) {
            addCriterion("MARKET_PRICE not like", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<String> values) {
            addCriterion("MARKET_PRICE in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<String> values) {
            addCriterion("MARKET_PRICE not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(String value1, String value2) {
            addCriterion("MARKET_PRICE between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(String value1, String value2) {
            addCriterion("MARKET_PRICE not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNull() {
            addCriterion("SALE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNotNull() {
            addCriterion("SALE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceEqualTo(String value) {
            addCriterion("SALE_PRICE =", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotEqualTo(String value) {
            addCriterion("SALE_PRICE <>", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThan(String value) {
            addCriterion("SALE_PRICE >", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_PRICE >=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThan(String value) {
            addCriterion("SALE_PRICE <", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThanOrEqualTo(String value) {
            addCriterion("SALE_PRICE <=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLike(String value) {
            addCriterion("SALE_PRICE like", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotLike(String value) {
            addCriterion("SALE_PRICE not like", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceIn(List<String> values) {
            addCriterion("SALE_PRICE in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotIn(List<String> values) {
            addCriterion("SALE_PRICE not in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceBetween(String value1, String value2) {
            addCriterion("SALE_PRICE between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotBetween(String value1, String value2) {
            addCriterion("SALE_PRICE not between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andProductLableIsNull() {
            addCriterion("PRODUCT_LABLE is null");
            return (Criteria) this;
        }

        public Criteria andProductLableIsNotNull() {
            addCriterion("PRODUCT_LABLE is not null");
            return (Criteria) this;
        }

        public Criteria andProductLableEqualTo(String value) {
            addCriterion("PRODUCT_LABLE =", value, "productLable");
            return (Criteria) this;
        }

        public Criteria andProductLableNotEqualTo(String value) {
            addCriterion("PRODUCT_LABLE <>", value, "productLable");
            return (Criteria) this;
        }

        public Criteria andProductLableGreaterThan(String value) {
            addCriterion("PRODUCT_LABLE >", value, "productLable");
            return (Criteria) this;
        }

        public Criteria andProductLableGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_LABLE >=", value, "productLable");
            return (Criteria) this;
        }

        public Criteria andProductLableLessThan(String value) {
            addCriterion("PRODUCT_LABLE <", value, "productLable");
            return (Criteria) this;
        }

        public Criteria andProductLableLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_LABLE <=", value, "productLable");
            return (Criteria) this;
        }

        public Criteria andProductLableLike(String value) {
            addCriterion("PRODUCT_LABLE like", value, "productLable");
            return (Criteria) this;
        }

        public Criteria andProductLableNotLike(String value) {
            addCriterion("PRODUCT_LABLE not like", value, "productLable");
            return (Criteria) this;
        }

        public Criteria andProductLableIn(List<String> values) {
            addCriterion("PRODUCT_LABLE in", values, "productLable");
            return (Criteria) this;
        }

        public Criteria andProductLableNotIn(List<String> values) {
            addCriterion("PRODUCT_LABLE not in", values, "productLable");
            return (Criteria) this;
        }

        public Criteria andProductLableBetween(String value1, String value2) {
            addCriterion("PRODUCT_LABLE between", value1, value2, "productLable");
            return (Criteria) this;
        }

        public Criteria andProductLableNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_LABLE not between", value1, value2, "productLable");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeIsNull() {
            addCriterion("SUPPLIER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeIsNotNull() {
            addCriterion("SUPPLIER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeEqualTo(String value) {
            addCriterion("SUPPLIER_CODE =", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotEqualTo(String value) {
            addCriterion("SUPPLIER_CODE <>", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeGreaterThan(String value) {
            addCriterion("SUPPLIER_CODE >", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_CODE >=", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeLessThan(String value) {
            addCriterion("SUPPLIER_CODE <", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_CODE <=", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeLike(String value) {
            addCriterion("SUPPLIER_CODE like", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotLike(String value) {
            addCriterion("SUPPLIER_CODE not like", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeIn(List<String> values) {
            addCriterion("SUPPLIER_CODE in", values, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotIn(List<String> values) {
            addCriterion("SUPPLIER_CODE not in", values, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeBetween(String value1, String value2) {
            addCriterion("SUPPLIER_CODE between", value1, value2, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_CODE not between", value1, value2, "supplierCode");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
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