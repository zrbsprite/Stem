package com.stem.entity;

import java.util.ArrayList;
import java.util.List;

public class StatementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StatementExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("Month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("Month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(String value) {
            addCriterion("Month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(String value) {
            addCriterion("Month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(String value) {
            addCriterion("Month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(String value) {
            addCriterion("Month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(String value) {
            addCriterion("Month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(String value) {
            addCriterion("Month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLike(String value) {
            addCriterion("Month like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotLike(String value) {
            addCriterion("Month not like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<String> values) {
            addCriterion("Month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<String> values) {
            addCriterion("Month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(String value1, String value2) {
            addCriterion("Month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(String value1, String value2) {
            addCriterion("Month not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andFundnameIsNull() {
            addCriterion("FundName is null");
            return (Criteria) this;
        }

        public Criteria andFundnameIsNotNull() {
            addCriterion("FundName is not null");
            return (Criteria) this;
        }

        public Criteria andFundnameEqualTo(String value) {
            addCriterion("FundName =", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameNotEqualTo(String value) {
            addCriterion("FundName <>", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameGreaterThan(String value) {
            addCriterion("FundName >", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameGreaterThanOrEqualTo(String value) {
            addCriterion("FundName >=", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameLessThan(String value) {
            addCriterion("FundName <", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameLessThanOrEqualTo(String value) {
            addCriterion("FundName <=", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameLike(String value) {
            addCriterion("FundName like", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameNotLike(String value) {
            addCriterion("FundName not like", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameIn(List<String> values) {
            addCriterion("FundName in", values, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameNotIn(List<String> values) {
            addCriterion("FundName not in", values, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameBetween(String value1, String value2) {
            addCriterion("FundName between", value1, value2, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameNotBetween(String value1, String value2) {
            addCriterion("FundName not between", value1, value2, "fundname");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("Phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("Phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("Phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("Phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("Phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("Phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("Phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("Phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("Phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("Phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("Phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("Phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("Phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andNetvalueofbuydayIsNull() {
            addCriterion("NetValueOfBuyDay is null");
            return (Criteria) this;
        }

        public Criteria andNetvalueofbuydayIsNotNull() {
            addCriterion("NetValueOfBuyDay is not null");
            return (Criteria) this;
        }

        public Criteria andNetvalueofbuydayEqualTo(String value) {
            addCriterion("NetValueOfBuyDay =", value, "netvalueofbuyday");
            return (Criteria) this;
        }

        public Criteria andNetvalueofbuydayNotEqualTo(String value) {
            addCriterion("NetValueOfBuyDay <>", value, "netvalueofbuyday");
            return (Criteria) this;
        }

        public Criteria andNetvalueofbuydayGreaterThan(String value) {
            addCriterion("NetValueOfBuyDay >", value, "netvalueofbuyday");
            return (Criteria) this;
        }

        public Criteria andNetvalueofbuydayGreaterThanOrEqualTo(String value) {
            addCriterion("NetValueOfBuyDay >=", value, "netvalueofbuyday");
            return (Criteria) this;
        }

        public Criteria andNetvalueofbuydayLessThan(String value) {
            addCriterion("NetValueOfBuyDay <", value, "netvalueofbuyday");
            return (Criteria) this;
        }

        public Criteria andNetvalueofbuydayLessThanOrEqualTo(String value) {
            addCriterion("NetValueOfBuyDay <=", value, "netvalueofbuyday");
            return (Criteria) this;
        }

        public Criteria andNetvalueofbuydayLike(String value) {
            addCriterion("NetValueOfBuyDay like", value, "netvalueofbuyday");
            return (Criteria) this;
        }

        public Criteria andNetvalueofbuydayNotLike(String value) {
            addCriterion("NetValueOfBuyDay not like", value, "netvalueofbuyday");
            return (Criteria) this;
        }

        public Criteria andNetvalueofbuydayIn(List<String> values) {
            addCriterion("NetValueOfBuyDay in", values, "netvalueofbuyday");
            return (Criteria) this;
        }

        public Criteria andNetvalueofbuydayNotIn(List<String> values) {
            addCriterion("NetValueOfBuyDay not in", values, "netvalueofbuyday");
            return (Criteria) this;
        }

        public Criteria andNetvalueofbuydayBetween(String value1, String value2) {
            addCriterion("NetValueOfBuyDay between", value1, value2, "netvalueofbuyday");
            return (Criteria) this;
        }

        public Criteria andNetvalueofbuydayNotBetween(String value1, String value2) {
            addCriterion("NetValueOfBuyDay not between", value1, value2, "netvalueofbuyday");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountIsNull() {
            addCriterion("PurchaseAmount is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountIsNotNull() {
            addCriterion("PurchaseAmount is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountEqualTo(String value) {
            addCriterion("PurchaseAmount =", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountNotEqualTo(String value) {
            addCriterion("PurchaseAmount <>", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountGreaterThan(String value) {
            addCriterion("PurchaseAmount >", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountGreaterThanOrEqualTo(String value) {
            addCriterion("PurchaseAmount >=", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountLessThan(String value) {
            addCriterion("PurchaseAmount <", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountLessThanOrEqualTo(String value) {
            addCriterion("PurchaseAmount <=", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountLike(String value) {
            addCriterion("PurchaseAmount like", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountNotLike(String value) {
            addCriterion("PurchaseAmount not like", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountIn(List<String> values) {
            addCriterion("PurchaseAmount in", values, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountNotIn(List<String> values) {
            addCriterion("PurchaseAmount not in", values, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountBetween(String value1, String value2) {
            addCriterion("PurchaseAmount between", value1, value2, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountNotBetween(String value1, String value2) {
            addCriterion("PurchaseAmount not between", value1, value2, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchasesharesIsNull() {
            addCriterion("PurchaseShares is null");
            return (Criteria) this;
        }

        public Criteria andPurchasesharesIsNotNull() {
            addCriterion("PurchaseShares is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasesharesEqualTo(String value) {
            addCriterion("PurchaseShares =", value, "purchaseshares");
            return (Criteria) this;
        }

        public Criteria andPurchasesharesNotEqualTo(String value) {
            addCriterion("PurchaseShares <>", value, "purchaseshares");
            return (Criteria) this;
        }

        public Criteria andPurchasesharesGreaterThan(String value) {
            addCriterion("PurchaseShares >", value, "purchaseshares");
            return (Criteria) this;
        }

        public Criteria andPurchasesharesGreaterThanOrEqualTo(String value) {
            addCriterion("PurchaseShares >=", value, "purchaseshares");
            return (Criteria) this;
        }

        public Criteria andPurchasesharesLessThan(String value) {
            addCriterion("PurchaseShares <", value, "purchaseshares");
            return (Criteria) this;
        }

        public Criteria andPurchasesharesLessThanOrEqualTo(String value) {
            addCriterion("PurchaseShares <=", value, "purchaseshares");
            return (Criteria) this;
        }

        public Criteria andPurchasesharesLike(String value) {
            addCriterion("PurchaseShares like", value, "purchaseshares");
            return (Criteria) this;
        }

        public Criteria andPurchasesharesNotLike(String value) {
            addCriterion("PurchaseShares not like", value, "purchaseshares");
            return (Criteria) this;
        }

        public Criteria andPurchasesharesIn(List<String> values) {
            addCriterion("PurchaseShares in", values, "purchaseshares");
            return (Criteria) this;
        }

        public Criteria andPurchasesharesNotIn(List<String> values) {
            addCriterion("PurchaseShares not in", values, "purchaseshares");
            return (Criteria) this;
        }

        public Criteria andPurchasesharesBetween(String value1, String value2) {
            addCriterion("PurchaseShares between", value1, value2, "purchaseshares");
            return (Criteria) this;
        }

        public Criteria andPurchasesharesNotBetween(String value1, String value2) {
            addCriterion("PurchaseShares not between", value1, value2, "purchaseshares");
            return (Criteria) this;
        }

        public Criteria andCurrentbalanceIsNull() {
            addCriterion("CurrentBalance is null");
            return (Criteria) this;
        }

        public Criteria andCurrentbalanceIsNotNull() {
            addCriterion("CurrentBalance is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentbalanceEqualTo(String value) {
            addCriterion("CurrentBalance =", value, "currentbalance");
            return (Criteria) this;
        }

        public Criteria andCurrentbalanceNotEqualTo(String value) {
            addCriterion("CurrentBalance <>", value, "currentbalance");
            return (Criteria) this;
        }

        public Criteria andCurrentbalanceGreaterThan(String value) {
            addCriterion("CurrentBalance >", value, "currentbalance");
            return (Criteria) this;
        }

        public Criteria andCurrentbalanceGreaterThanOrEqualTo(String value) {
            addCriterion("CurrentBalance >=", value, "currentbalance");
            return (Criteria) this;
        }

        public Criteria andCurrentbalanceLessThan(String value) {
            addCriterion("CurrentBalance <", value, "currentbalance");
            return (Criteria) this;
        }

        public Criteria andCurrentbalanceLessThanOrEqualTo(String value) {
            addCriterion("CurrentBalance <=", value, "currentbalance");
            return (Criteria) this;
        }

        public Criteria andCurrentbalanceLike(String value) {
            addCriterion("CurrentBalance like", value, "currentbalance");
            return (Criteria) this;
        }

        public Criteria andCurrentbalanceNotLike(String value) {
            addCriterion("CurrentBalance not like", value, "currentbalance");
            return (Criteria) this;
        }

        public Criteria andCurrentbalanceIn(List<String> values) {
            addCriterion("CurrentBalance in", values, "currentbalance");
            return (Criteria) this;
        }

        public Criteria andCurrentbalanceNotIn(List<String> values) {
            addCriterion("CurrentBalance not in", values, "currentbalance");
            return (Criteria) this;
        }

        public Criteria andCurrentbalanceBetween(String value1, String value2) {
            addCriterion("CurrentBalance between", value1, value2, "currentbalance");
            return (Criteria) this;
        }

        public Criteria andCurrentbalanceNotBetween(String value1, String value2) {
            addCriterion("CurrentBalance not between", value1, value2, "currentbalance");
            return (Criteria) this;
        }

        public Criteria andRedemptionsharesIsNull() {
            addCriterion("RedemptionShares is null");
            return (Criteria) this;
        }

        public Criteria andRedemptionsharesIsNotNull() {
            addCriterion("RedemptionShares is not null");
            return (Criteria) this;
        }

        public Criteria andRedemptionsharesEqualTo(String value) {
            addCriterion("RedemptionShares =", value, "redemptionshares");
            return (Criteria) this;
        }

        public Criteria andRedemptionsharesNotEqualTo(String value) {
            addCriterion("RedemptionShares <>", value, "redemptionshares");
            return (Criteria) this;
        }

        public Criteria andRedemptionsharesGreaterThan(String value) {
            addCriterion("RedemptionShares >", value, "redemptionshares");
            return (Criteria) this;
        }

        public Criteria andRedemptionsharesGreaterThanOrEqualTo(String value) {
            addCriterion("RedemptionShares >=", value, "redemptionshares");
            return (Criteria) this;
        }

        public Criteria andRedemptionsharesLessThan(String value) {
            addCriterion("RedemptionShares <", value, "redemptionshares");
            return (Criteria) this;
        }

        public Criteria andRedemptionsharesLessThanOrEqualTo(String value) {
            addCriterion("RedemptionShares <=", value, "redemptionshares");
            return (Criteria) this;
        }

        public Criteria andRedemptionsharesLike(String value) {
            addCriterion("RedemptionShares like", value, "redemptionshares");
            return (Criteria) this;
        }

        public Criteria andRedemptionsharesNotLike(String value) {
            addCriterion("RedemptionShares not like", value, "redemptionshares");
            return (Criteria) this;
        }

        public Criteria andRedemptionsharesIn(List<String> values) {
            addCriterion("RedemptionShares in", values, "redemptionshares");
            return (Criteria) this;
        }

        public Criteria andRedemptionsharesNotIn(List<String> values) {
            addCriterion("RedemptionShares not in", values, "redemptionshares");
            return (Criteria) this;
        }

        public Criteria andRedemptionsharesBetween(String value1, String value2) {
            addCriterion("RedemptionShares between", value1, value2, "redemptionshares");
            return (Criteria) this;
        }

        public Criteria andRedemptionsharesNotBetween(String value1, String value2) {
            addCriterion("RedemptionShares not between", value1, value2, "redemptionshares");
            return (Criteria) this;
        }

        public Criteria andRedemptionamountIsNull() {
            addCriterion("RedemptionAmount is null");
            return (Criteria) this;
        }

        public Criteria andRedemptionamountIsNotNull() {
            addCriterion("RedemptionAmount is not null");
            return (Criteria) this;
        }

        public Criteria andRedemptionamountEqualTo(String value) {
            addCriterion("RedemptionAmount =", value, "redemptionamount");
            return (Criteria) this;
        }

        public Criteria andRedemptionamountNotEqualTo(String value) {
            addCriterion("RedemptionAmount <>", value, "redemptionamount");
            return (Criteria) this;
        }

        public Criteria andRedemptionamountGreaterThan(String value) {
            addCriterion("RedemptionAmount >", value, "redemptionamount");
            return (Criteria) this;
        }

        public Criteria andRedemptionamountGreaterThanOrEqualTo(String value) {
            addCriterion("RedemptionAmount >=", value, "redemptionamount");
            return (Criteria) this;
        }

        public Criteria andRedemptionamountLessThan(String value) {
            addCriterion("RedemptionAmount <", value, "redemptionamount");
            return (Criteria) this;
        }

        public Criteria andRedemptionamountLessThanOrEqualTo(String value) {
            addCriterion("RedemptionAmount <=", value, "redemptionamount");
            return (Criteria) this;
        }

        public Criteria andRedemptionamountLike(String value) {
            addCriterion("RedemptionAmount like", value, "redemptionamount");
            return (Criteria) this;
        }

        public Criteria andRedemptionamountNotLike(String value) {
            addCriterion("RedemptionAmount not like", value, "redemptionamount");
            return (Criteria) this;
        }

        public Criteria andRedemptionamountIn(List<String> values) {
            addCriterion("RedemptionAmount in", values, "redemptionamount");
            return (Criteria) this;
        }

        public Criteria andRedemptionamountNotIn(List<String> values) {
            addCriterion("RedemptionAmount not in", values, "redemptionamount");
            return (Criteria) this;
        }

        public Criteria andRedemptionamountBetween(String value1, String value2) {
            addCriterion("RedemptionAmount between", value1, value2, "redemptionamount");
            return (Criteria) this;
        }

        public Criteria andRedemptionamountNotBetween(String value1, String value2) {
            addCriterion("RedemptionAmount not between", value1, value2, "redemptionamount");
            return (Criteria) this;
        }

        public Criteria andTotalsharesIsNull() {
            addCriterion("TotalShares is null");
            return (Criteria) this;
        }

        public Criteria andTotalsharesIsNotNull() {
            addCriterion("TotalShares is not null");
            return (Criteria) this;
        }

        public Criteria andTotalsharesEqualTo(String value) {
            addCriterion("TotalShares =", value, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesNotEqualTo(String value) {
            addCriterion("TotalShares <>", value, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesGreaterThan(String value) {
            addCriterion("TotalShares >", value, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesGreaterThanOrEqualTo(String value) {
            addCriterion("TotalShares >=", value, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesLessThan(String value) {
            addCriterion("TotalShares <", value, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesLessThanOrEqualTo(String value) {
            addCriterion("TotalShares <=", value, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesLike(String value) {
            addCriterion("TotalShares like", value, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesNotLike(String value) {
            addCriterion("TotalShares not like", value, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesIn(List<String> values) {
            addCriterion("TotalShares in", values, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesNotIn(List<String> values) {
            addCriterion("TotalShares not in", values, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesBetween(String value1, String value2) {
            addCriterion("TotalShares between", value1, value2, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesNotBetween(String value1, String value2) {
            addCriterion("TotalShares not between", value1, value2, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalamountIsNull() {
            addCriterion("TotalAmount is null");
            return (Criteria) this;
        }

        public Criteria andTotalamountIsNotNull() {
            addCriterion("TotalAmount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalamountEqualTo(String value) {
            addCriterion("TotalAmount =", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotEqualTo(String value) {
            addCriterion("TotalAmount <>", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThan(String value) {
            addCriterion("TotalAmount >", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThanOrEqualTo(String value) {
            addCriterion("TotalAmount >=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThan(String value) {
            addCriterion("TotalAmount <", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThanOrEqualTo(String value) {
            addCriterion("TotalAmount <=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLike(String value) {
            addCriterion("TotalAmount like", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotLike(String value) {
            addCriterion("TotalAmount not like", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountIn(List<String> values) {
            addCriterion("TotalAmount in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotIn(List<String> values) {
            addCriterion("TotalAmount not in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountBetween(String value1, String value2) {
            addCriterion("TotalAmount between", value1, value2, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotBetween(String value1, String value2) {
            addCriterion("TotalAmount not between", value1, value2, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalbalanceIsNull() {
            addCriterion("TotalBalance is null");
            return (Criteria) this;
        }

        public Criteria andTotalbalanceIsNotNull() {
            addCriterion("TotalBalance is not null");
            return (Criteria) this;
        }

        public Criteria andTotalbalanceEqualTo(String value) {
            addCriterion("TotalBalance =", value, "totalbalance");
            return (Criteria) this;
        }

        public Criteria andTotalbalanceNotEqualTo(String value) {
            addCriterion("TotalBalance <>", value, "totalbalance");
            return (Criteria) this;
        }

        public Criteria andTotalbalanceGreaterThan(String value) {
            addCriterion("TotalBalance >", value, "totalbalance");
            return (Criteria) this;
        }

        public Criteria andTotalbalanceGreaterThanOrEqualTo(String value) {
            addCriterion("TotalBalance >=", value, "totalbalance");
            return (Criteria) this;
        }

        public Criteria andTotalbalanceLessThan(String value) {
            addCriterion("TotalBalance <", value, "totalbalance");
            return (Criteria) this;
        }

        public Criteria andTotalbalanceLessThanOrEqualTo(String value) {
            addCriterion("TotalBalance <=", value, "totalbalance");
            return (Criteria) this;
        }

        public Criteria andTotalbalanceLike(String value) {
            addCriterion("TotalBalance like", value, "totalbalance");
            return (Criteria) this;
        }

        public Criteria andTotalbalanceNotLike(String value) {
            addCriterion("TotalBalance not like", value, "totalbalance");
            return (Criteria) this;
        }

        public Criteria andTotalbalanceIn(List<String> values) {
            addCriterion("TotalBalance in", values, "totalbalance");
            return (Criteria) this;
        }

        public Criteria andTotalbalanceNotIn(List<String> values) {
            addCriterion("TotalBalance not in", values, "totalbalance");
            return (Criteria) this;
        }

        public Criteria andTotalbalanceBetween(String value1, String value2) {
            addCriterion("TotalBalance between", value1, value2, "totalbalance");
            return (Criteria) this;
        }

        public Criteria andTotalbalanceNotBetween(String value1, String value2) {
            addCriterion("TotalBalance not between", value1, value2, "totalbalance");
            return (Criteria) this;
        }

        public Criteria andProfitIsNull() {
            addCriterion("Profit is null");
            return (Criteria) this;
        }

        public Criteria andProfitIsNotNull() {
            addCriterion("Profit is not null");
            return (Criteria) this;
        }

        public Criteria andProfitEqualTo(String value) {
            addCriterion("Profit =", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotEqualTo(String value) {
            addCriterion("Profit <>", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThan(String value) {
            addCriterion("Profit >", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThanOrEqualTo(String value) {
            addCriterion("Profit >=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThan(String value) {
            addCriterion("Profit <", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThanOrEqualTo(String value) {
            addCriterion("Profit <=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLike(String value) {
            addCriterion("Profit like", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotLike(String value) {
            addCriterion("Profit not like", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitIn(List<String> values) {
            addCriterion("Profit in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotIn(List<String> values) {
            addCriterion("Profit not in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitBetween(String value1, String value2) {
            addCriterion("Profit between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotBetween(String value1, String value2) {
            addCriterion("Profit not between", value1, value2, "profit");
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