package com.stem.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdcardIsNull() {
            addCriterion("IDCard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("IDCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("IDCard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("IDCard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("IDCard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("IDCard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("IDCard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("IDCard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("IDCard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("IDCard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("IDCard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("IDCard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("IDCard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("IDCard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNull() {
            addCriterion("CheckDate is null");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNotNull() {
            addCriterion("CheckDate is not null");
            return (Criteria) this;
        }

        public Criteria andCheckdateEqualTo(Date value) {
            addCriterionForJDBCDate("CheckDate =", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CheckDate <>", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThan(Date value) {
            addCriterionForJDBCDate("CheckDate >", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CheckDate >=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThan(Date value) {
            addCriterionForJDBCDate("CheckDate <", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CheckDate <=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateIn(List<Date> values) {
            addCriterionForJDBCDate("CheckDate in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CheckDate not in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CheckDate between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CheckDate not between", value1, value2, "checkdate");
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

        public Criteria andCustomernameIsNull() {
            addCriterion("CustomerName is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("CustomerName is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("CustomerName =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("CustomerName <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("CustomerName >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerName >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("CustomerName <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("CustomerName <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("CustomerName like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("CustomerName not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("CustomerName in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("CustomerName not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("CustomerName between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("CustomerName not between", value1, value2, "customername");
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

        public Criteria andCustomeridIsNull() {
            addCriterion("CustomerID is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("CustomerID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(String value) {
            addCriterion("CustomerID =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(String value) {
            addCriterion("CustomerID <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(String value) {
            addCriterion("CustomerID >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerID >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(String value) {
            addCriterion("CustomerID <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(String value) {
            addCriterion("CustomerID <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLike(String value) {
            addCriterion("CustomerID like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotLike(String value) {
            addCriterion("CustomerID not like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<String> values) {
            addCriterion("CustomerID in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<String> values) {
            addCriterion("CustomerID not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(String value1, String value2) {
            addCriterion("CustomerID between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(String value1, String value2) {
            addCriterion("CustomerID not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andFundtypeIsNull() {
            addCriterion("FundType is null");
            return (Criteria) this;
        }

        public Criteria andFundtypeIsNotNull() {
            addCriterion("FundType is not null");
            return (Criteria) this;
        }

        public Criteria andFundtypeEqualTo(String value) {
            addCriterion("FundType =", value, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeNotEqualTo(String value) {
            addCriterion("FundType <>", value, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeGreaterThan(String value) {
            addCriterion("FundType >", value, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeGreaterThanOrEqualTo(String value) {
            addCriterion("FundType >=", value, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeLessThan(String value) {
            addCriterion("FundType <", value, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeLessThanOrEqualTo(String value) {
            addCriterion("FundType <=", value, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeLike(String value) {
            addCriterion("FundType like", value, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeNotLike(String value) {
            addCriterion("FundType not like", value, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeIn(List<String> values) {
            addCriterion("FundType in", values, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeNotIn(List<String> values) {
            addCriterion("FundType not in", values, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeBetween(String value1, String value2) {
            addCriterion("FundType between", value1, value2, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeNotBetween(String value1, String value2) {
            addCriterion("FundType not between", value1, value2, "fundtype");
            return (Criteria) this;
        }

        public Criteria andNetvalueIsNull() {
            addCriterion("NetValue is null");
            return (Criteria) this;
        }

        public Criteria andNetvalueIsNotNull() {
            addCriterion("NetValue is not null");
            return (Criteria) this;
        }

        public Criteria andNetvalueEqualTo(BigDecimal value) {
            addCriterion("NetValue =", value, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueNotEqualTo(BigDecimal value) {
            addCriterion("NetValue <>", value, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueGreaterThan(BigDecimal value) {
            addCriterion("NetValue >", value, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NetValue >=", value, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueLessThan(BigDecimal value) {
            addCriterion("NetValue <", value, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NetValue <=", value, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueIn(List<BigDecimal> values) {
            addCriterion("NetValue in", values, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueNotIn(List<BigDecimal> values) {
            addCriterion("NetValue not in", values, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NetValue between", value1, value2, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NetValue not between", value1, value2, "netvalue");
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

        public Criteria andPurchaseamountEqualTo(BigDecimal value) {
            addCriterion("PurchaseAmount =", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountNotEqualTo(BigDecimal value) {
            addCriterion("PurchaseAmount <>", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountGreaterThan(BigDecimal value) {
            addCriterion("PurchaseAmount >", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PurchaseAmount >=", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountLessThan(BigDecimal value) {
            addCriterion("PurchaseAmount <", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PurchaseAmount <=", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountIn(List<BigDecimal> values) {
            addCriterion("PurchaseAmount in", values, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountNotIn(List<BigDecimal> values) {
            addCriterion("PurchaseAmount not in", values, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PurchaseAmount between", value1, value2, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PurchaseAmount not between", value1, value2, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andTotalpurchaseamountIsNull() {
            addCriterion("TotalPurchaseAmount is null");
            return (Criteria) this;
        }

        public Criteria andTotalpurchaseamountIsNotNull() {
            addCriterion("TotalPurchaseAmount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpurchaseamountEqualTo(BigDecimal value) {
            addCriterion("TotalPurchaseAmount =", value, "totalpurchaseamount");
            return (Criteria) this;
        }

        public Criteria andTotalpurchaseamountNotEqualTo(BigDecimal value) {
            addCriterion("TotalPurchaseAmount <>", value, "totalpurchaseamount");
            return (Criteria) this;
        }

        public Criteria andTotalpurchaseamountGreaterThan(BigDecimal value) {
            addCriterion("TotalPurchaseAmount >", value, "totalpurchaseamount");
            return (Criteria) this;
        }

        public Criteria andTotalpurchaseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalPurchaseAmount >=", value, "totalpurchaseamount");
            return (Criteria) this;
        }

        public Criteria andTotalpurchaseamountLessThan(BigDecimal value) {
            addCriterion("TotalPurchaseAmount <", value, "totalpurchaseamount");
            return (Criteria) this;
        }

        public Criteria andTotalpurchaseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalPurchaseAmount <=", value, "totalpurchaseamount");
            return (Criteria) this;
        }

        public Criteria andTotalpurchaseamountIn(List<BigDecimal> values) {
            addCriterion("TotalPurchaseAmount in", values, "totalpurchaseamount");
            return (Criteria) this;
        }

        public Criteria andTotalpurchaseamountNotIn(List<BigDecimal> values) {
            addCriterion("TotalPurchaseAmount not in", values, "totalpurchaseamount");
            return (Criteria) this;
        }

        public Criteria andTotalpurchaseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalPurchaseAmount between", value1, value2, "totalpurchaseamount");
            return (Criteria) this;
        }

        public Criteria andTotalpurchaseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalPurchaseAmount not between", value1, value2, "totalpurchaseamount");
            return (Criteria) this;
        }

        public Criteria andExchangerateIsNull() {
            addCriterion("ExchangeRate is null");
            return (Criteria) this;
        }

        public Criteria andExchangerateIsNotNull() {
            addCriterion("ExchangeRate is not null");
            return (Criteria) this;
        }

        public Criteria andExchangerateEqualTo(BigDecimal value) {
            addCriterion("ExchangeRate =", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotEqualTo(BigDecimal value) {
            addCriterion("ExchangeRate <>", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateGreaterThan(BigDecimal value) {
            addCriterion("ExchangeRate >", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ExchangeRate >=", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateLessThan(BigDecimal value) {
            addCriterion("ExchangeRate <", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ExchangeRate <=", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateIn(List<BigDecimal> values) {
            addCriterion("ExchangeRate in", values, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotIn(List<BigDecimal> values) {
            addCriterion("ExchangeRate not in", values, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ExchangeRate between", value1, value2, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ExchangeRate not between", value1, value2, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andAddvalueofassertIsNull() {
            addCriterion("AddValueOfAssert is null");
            return (Criteria) this;
        }

        public Criteria andAddvalueofassertIsNotNull() {
            addCriterion("AddValueOfAssert is not null");
            return (Criteria) this;
        }

        public Criteria andAddvalueofassertEqualTo(BigDecimal value) {
            addCriterion("AddValueOfAssert =", value, "addvalueofassert");
            return (Criteria) this;
        }

        public Criteria andAddvalueofassertNotEqualTo(BigDecimal value) {
            addCriterion("AddValueOfAssert <>", value, "addvalueofassert");
            return (Criteria) this;
        }

        public Criteria andAddvalueofassertGreaterThan(BigDecimal value) {
            addCriterion("AddValueOfAssert >", value, "addvalueofassert");
            return (Criteria) this;
        }

        public Criteria andAddvalueofassertGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AddValueOfAssert >=", value, "addvalueofassert");
            return (Criteria) this;
        }

        public Criteria andAddvalueofassertLessThan(BigDecimal value) {
            addCriterion("AddValueOfAssert <", value, "addvalueofassert");
            return (Criteria) this;
        }

        public Criteria andAddvalueofassertLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AddValueOfAssert <=", value, "addvalueofassert");
            return (Criteria) this;
        }

        public Criteria andAddvalueofassertIn(List<BigDecimal> values) {
            addCriterion("AddValueOfAssert in", values, "addvalueofassert");
            return (Criteria) this;
        }

        public Criteria andAddvalueofassertNotIn(List<BigDecimal> values) {
            addCriterion("AddValueOfAssert not in", values, "addvalueofassert");
            return (Criteria) this;
        }

        public Criteria andAddvalueofassertBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AddValueOfAssert between", value1, value2, "addvalueofassert");
            return (Criteria) this;
        }

        public Criteria andAddvalueofassertNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AddValueOfAssert not between", value1, value2, "addvalueofassert");
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

        public Criteria andPurchasesharesEqualTo(Integer value) {
            addCriterion("PurchaseShares =", value, "purchaseshares");
            return (Criteria) this;
        }

        public Criteria andPurchasesharesNotEqualTo(Integer value) {
            addCriterion("PurchaseShares <>", value, "purchaseshares");
            return (Criteria) this;
        }

        public Criteria andPurchasesharesGreaterThan(Integer value) {
            addCriterion("PurchaseShares >", value, "purchaseshares");
            return (Criteria) this;
        }

        public Criteria andPurchasesharesGreaterThanOrEqualTo(Integer value) {
            addCriterion("PurchaseShares >=", value, "purchaseshares");
            return (Criteria) this;
        }

        public Criteria andPurchasesharesLessThan(Integer value) {
            addCriterion("PurchaseShares <", value, "purchaseshares");
            return (Criteria) this;
        }

        public Criteria andPurchasesharesLessThanOrEqualTo(Integer value) {
            addCriterion("PurchaseShares <=", value, "purchaseshares");
            return (Criteria) this;
        }

        public Criteria andPurchasesharesIn(List<Integer> values) {
            addCriterion("PurchaseShares in", values, "purchaseshares");
            return (Criteria) this;
        }

        public Criteria andPurchasesharesNotIn(List<Integer> values) {
            addCriterion("PurchaseShares not in", values, "purchaseshares");
            return (Criteria) this;
        }

        public Criteria andPurchasesharesBetween(Integer value1, Integer value2) {
            addCriterion("PurchaseShares between", value1, value2, "purchaseshares");
            return (Criteria) this;
        }

        public Criteria andPurchasesharesNotBetween(Integer value1, Integer value2) {
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

        public Criteria andCurrentbalanceEqualTo(BigDecimal value) {
            addCriterion("CurrentBalance =", value, "currentbalance");
            return (Criteria) this;
        }

        public Criteria andCurrentbalanceNotEqualTo(BigDecimal value) {
            addCriterion("CurrentBalance <>", value, "currentbalance");
            return (Criteria) this;
        }

        public Criteria andCurrentbalanceGreaterThan(BigDecimal value) {
            addCriterion("CurrentBalance >", value, "currentbalance");
            return (Criteria) this;
        }

        public Criteria andCurrentbalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CurrentBalance >=", value, "currentbalance");
            return (Criteria) this;
        }

        public Criteria andCurrentbalanceLessThan(BigDecimal value) {
            addCriterion("CurrentBalance <", value, "currentbalance");
            return (Criteria) this;
        }

        public Criteria andCurrentbalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CurrentBalance <=", value, "currentbalance");
            return (Criteria) this;
        }

        public Criteria andCurrentbalanceIn(List<BigDecimal> values) {
            addCriterion("CurrentBalance in", values, "currentbalance");
            return (Criteria) this;
        }

        public Criteria andCurrentbalanceNotIn(List<BigDecimal> values) {
            addCriterion("CurrentBalance not in", values, "currentbalance");
            return (Criteria) this;
        }

        public Criteria andCurrentbalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CurrentBalance between", value1, value2, "currentbalance");
            return (Criteria) this;
        }

        public Criteria andCurrentbalanceNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andRedemptionsharesEqualTo(Integer value) {
            addCriterion("RedemptionShares =", value, "redemptionshares");
            return (Criteria) this;
        }

        public Criteria andRedemptionsharesNotEqualTo(Integer value) {
            addCriterion("RedemptionShares <>", value, "redemptionshares");
            return (Criteria) this;
        }

        public Criteria andRedemptionsharesGreaterThan(Integer value) {
            addCriterion("RedemptionShares >", value, "redemptionshares");
            return (Criteria) this;
        }

        public Criteria andRedemptionsharesGreaterThanOrEqualTo(Integer value) {
            addCriterion("RedemptionShares >=", value, "redemptionshares");
            return (Criteria) this;
        }

        public Criteria andRedemptionsharesLessThan(Integer value) {
            addCriterion("RedemptionShares <", value, "redemptionshares");
            return (Criteria) this;
        }

        public Criteria andRedemptionsharesLessThanOrEqualTo(Integer value) {
            addCriterion("RedemptionShares <=", value, "redemptionshares");
            return (Criteria) this;
        }

        public Criteria andRedemptionsharesIn(List<Integer> values) {
            addCriterion("RedemptionShares in", values, "redemptionshares");
            return (Criteria) this;
        }

        public Criteria andRedemptionsharesNotIn(List<Integer> values) {
            addCriterion("RedemptionShares not in", values, "redemptionshares");
            return (Criteria) this;
        }

        public Criteria andRedemptionsharesBetween(Integer value1, Integer value2) {
            addCriterion("RedemptionShares between", value1, value2, "redemptionshares");
            return (Criteria) this;
        }

        public Criteria andRedemptionsharesNotBetween(Integer value1, Integer value2) {
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

        public Criteria andRedemptionamountEqualTo(BigDecimal value) {
            addCriterion("RedemptionAmount =", value, "redemptionamount");
            return (Criteria) this;
        }

        public Criteria andRedemptionamountNotEqualTo(BigDecimal value) {
            addCriterion("RedemptionAmount <>", value, "redemptionamount");
            return (Criteria) this;
        }

        public Criteria andRedemptionamountGreaterThan(BigDecimal value) {
            addCriterion("RedemptionAmount >", value, "redemptionamount");
            return (Criteria) this;
        }

        public Criteria andRedemptionamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RedemptionAmount >=", value, "redemptionamount");
            return (Criteria) this;
        }

        public Criteria andRedemptionamountLessThan(BigDecimal value) {
            addCriterion("RedemptionAmount <", value, "redemptionamount");
            return (Criteria) this;
        }

        public Criteria andRedemptionamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RedemptionAmount <=", value, "redemptionamount");
            return (Criteria) this;
        }

        public Criteria andRedemptionamountIn(List<BigDecimal> values) {
            addCriterion("RedemptionAmount in", values, "redemptionamount");
            return (Criteria) this;
        }

        public Criteria andRedemptionamountNotIn(List<BigDecimal> values) {
            addCriterion("RedemptionAmount not in", values, "redemptionamount");
            return (Criteria) this;
        }

        public Criteria andRedemptionamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RedemptionAmount between", value1, value2, "redemptionamount");
            return (Criteria) this;
        }

        public Criteria andRedemptionamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RedemptionAmount not between", value1, value2, "redemptionamount");
            return (Criteria) this;
        }

        public Criteria andTotalredemptionamountIsNull() {
            addCriterion("TotalRedemptionAmount is null");
            return (Criteria) this;
        }

        public Criteria andTotalredemptionamountIsNotNull() {
            addCriterion("TotalRedemptionAmount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalredemptionamountEqualTo(BigDecimal value) {
            addCriterion("TotalRedemptionAmount =", value, "totalredemptionamount");
            return (Criteria) this;
        }

        public Criteria andTotalredemptionamountNotEqualTo(BigDecimal value) {
            addCriterion("TotalRedemptionAmount <>", value, "totalredemptionamount");
            return (Criteria) this;
        }

        public Criteria andTotalredemptionamountGreaterThan(BigDecimal value) {
            addCriterion("TotalRedemptionAmount >", value, "totalredemptionamount");
            return (Criteria) this;
        }

        public Criteria andTotalredemptionamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalRedemptionAmount >=", value, "totalredemptionamount");
            return (Criteria) this;
        }

        public Criteria andTotalredemptionamountLessThan(BigDecimal value) {
            addCriterion("TotalRedemptionAmount <", value, "totalredemptionamount");
            return (Criteria) this;
        }

        public Criteria andTotalredemptionamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalRedemptionAmount <=", value, "totalredemptionamount");
            return (Criteria) this;
        }

        public Criteria andTotalredemptionamountIn(List<BigDecimal> values) {
            addCriterion("TotalRedemptionAmount in", values, "totalredemptionamount");
            return (Criteria) this;
        }

        public Criteria andTotalredemptionamountNotIn(List<BigDecimal> values) {
            addCriterion("TotalRedemptionAmount not in", values, "totalredemptionamount");
            return (Criteria) this;
        }

        public Criteria andTotalredemptionamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalRedemptionAmount between", value1, value2, "totalredemptionamount");
            return (Criteria) this;
        }

        public Criteria andTotalredemptionamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalRedemptionAmount not between", value1, value2, "totalredemptionamount");
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

        public Criteria andTotalsharesEqualTo(Integer value) {
            addCriterion("TotalShares =", value, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesNotEqualTo(Integer value) {
            addCriterion("TotalShares <>", value, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesGreaterThan(Integer value) {
            addCriterion("TotalShares >", value, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesGreaterThanOrEqualTo(Integer value) {
            addCriterion("TotalShares >=", value, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesLessThan(Integer value) {
            addCriterion("TotalShares <", value, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesLessThanOrEqualTo(Integer value) {
            addCriterion("TotalShares <=", value, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesIn(List<Integer> values) {
            addCriterion("TotalShares in", values, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesNotIn(List<Integer> values) {
            addCriterion("TotalShares not in", values, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesBetween(Integer value1, Integer value2) {
            addCriterion("TotalShares between", value1, value2, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesNotBetween(Integer value1, Integer value2) {
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

        public Criteria andTotalamountEqualTo(BigDecimal value) {
            addCriterion("TotalAmount =", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotEqualTo(BigDecimal value) {
            addCriterion("TotalAmount <>", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThan(BigDecimal value) {
            addCriterion("TotalAmount >", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalAmount >=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThan(BigDecimal value) {
            addCriterion("TotalAmount <", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalAmount <=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountIn(List<BigDecimal> values) {
            addCriterion("TotalAmount in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotIn(List<BigDecimal> values) {
            addCriterion("TotalAmount not in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalAmount between", value1, value2, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andTotalbalanceEqualTo(BigDecimal value) {
            addCriterion("TotalBalance =", value, "totalbalance");
            return (Criteria) this;
        }

        public Criteria andTotalbalanceNotEqualTo(BigDecimal value) {
            addCriterion("TotalBalance <>", value, "totalbalance");
            return (Criteria) this;
        }

        public Criteria andTotalbalanceGreaterThan(BigDecimal value) {
            addCriterion("TotalBalance >", value, "totalbalance");
            return (Criteria) this;
        }

        public Criteria andTotalbalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalBalance >=", value, "totalbalance");
            return (Criteria) this;
        }

        public Criteria andTotalbalanceLessThan(BigDecimal value) {
            addCriterion("TotalBalance <", value, "totalbalance");
            return (Criteria) this;
        }

        public Criteria andTotalbalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalBalance <=", value, "totalbalance");
            return (Criteria) this;
        }

        public Criteria andTotalbalanceIn(List<BigDecimal> values) {
            addCriterion("TotalBalance in", values, "totalbalance");
            return (Criteria) this;
        }

        public Criteria andTotalbalanceNotIn(List<BigDecimal> values) {
            addCriterion("TotalBalance not in", values, "totalbalance");
            return (Criteria) this;
        }

        public Criteria andTotalbalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalBalance between", value1, value2, "totalbalance");
            return (Criteria) this;
        }

        public Criteria andTotalbalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalBalance not between", value1, value2, "totalbalance");
            return (Criteria) this;
        }

        public Criteria andTotalreturnIsNull() {
            addCriterion("TotalReturn is null");
            return (Criteria) this;
        }

        public Criteria andTotalreturnIsNotNull() {
            addCriterion("TotalReturn is not null");
            return (Criteria) this;
        }

        public Criteria andTotalreturnEqualTo(BigDecimal value) {
            addCriterion("TotalReturn =", value, "totalreturn");
            return (Criteria) this;
        }

        public Criteria andTotalreturnNotEqualTo(BigDecimal value) {
            addCriterion("TotalReturn <>", value, "totalreturn");
            return (Criteria) this;
        }

        public Criteria andTotalreturnGreaterThan(BigDecimal value) {
            addCriterion("TotalReturn >", value, "totalreturn");
            return (Criteria) this;
        }

        public Criteria andTotalreturnGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalReturn >=", value, "totalreturn");
            return (Criteria) this;
        }

        public Criteria andTotalreturnLessThan(BigDecimal value) {
            addCriterion("TotalReturn <", value, "totalreturn");
            return (Criteria) this;
        }

        public Criteria andTotalreturnLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalReturn <=", value, "totalreturn");
            return (Criteria) this;
        }

        public Criteria andTotalreturnIn(List<BigDecimal> values) {
            addCriterion("TotalReturn in", values, "totalreturn");
            return (Criteria) this;
        }

        public Criteria andTotalreturnNotIn(List<BigDecimal> values) {
            addCriterion("TotalReturn not in", values, "totalreturn");
            return (Criteria) this;
        }

        public Criteria andTotalreturnBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalReturn between", value1, value2, "totalreturn");
            return (Criteria) this;
        }

        public Criteria andTotalreturnNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalReturn not between", value1, value2, "totalreturn");
            return (Criteria) this;
        }

        public Criteria andTotalrateIsNull() {
            addCriterion("TotalRate is null");
            return (Criteria) this;
        }

        public Criteria andTotalrateIsNotNull() {
            addCriterion("TotalRate is not null");
            return (Criteria) this;
        }

        public Criteria andTotalrateEqualTo(BigDecimal value) {
            addCriterion("TotalRate =", value, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateNotEqualTo(BigDecimal value) {
            addCriterion("TotalRate <>", value, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateGreaterThan(BigDecimal value) {
            addCriterion("TotalRate >", value, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalRate >=", value, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateLessThan(BigDecimal value) {
            addCriterion("TotalRate <", value, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalRate <=", value, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateIn(List<BigDecimal> values) {
            addCriterion("TotalRate in", values, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateNotIn(List<BigDecimal> values) {
            addCriterion("TotalRate not in", values, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalRate between", value1, value2, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalRate not between", value1, value2, "totalrate");
            return (Criteria) this;
        }

        public Criteria andCurrentreturnIsNull() {
            addCriterion("CurrentReturn is null");
            return (Criteria) this;
        }

        public Criteria andCurrentreturnIsNotNull() {
            addCriterion("CurrentReturn is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentreturnEqualTo(BigDecimal value) {
            addCriterion("CurrentReturn =", value, "currentreturn");
            return (Criteria) this;
        }

        public Criteria andCurrentreturnNotEqualTo(BigDecimal value) {
            addCriterion("CurrentReturn <>", value, "currentreturn");
            return (Criteria) this;
        }

        public Criteria andCurrentreturnGreaterThan(BigDecimal value) {
            addCriterion("CurrentReturn >", value, "currentreturn");
            return (Criteria) this;
        }

        public Criteria andCurrentreturnGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CurrentReturn >=", value, "currentreturn");
            return (Criteria) this;
        }

        public Criteria andCurrentreturnLessThan(BigDecimal value) {
            addCriterion("CurrentReturn <", value, "currentreturn");
            return (Criteria) this;
        }

        public Criteria andCurrentreturnLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CurrentReturn <=", value, "currentreturn");
            return (Criteria) this;
        }

        public Criteria andCurrentreturnIn(List<BigDecimal> values) {
            addCriterion("CurrentReturn in", values, "currentreturn");
            return (Criteria) this;
        }

        public Criteria andCurrentreturnNotIn(List<BigDecimal> values) {
            addCriterion("CurrentReturn not in", values, "currentreturn");
            return (Criteria) this;
        }

        public Criteria andCurrentreturnBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CurrentReturn between", value1, value2, "currentreturn");
            return (Criteria) this;
        }

        public Criteria andCurrentreturnNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CurrentReturn not between", value1, value2, "currentreturn");
            return (Criteria) this;
        }

        public Criteria andCurrentrateIsNull() {
            addCriterion("CurrentRate is null");
            return (Criteria) this;
        }

        public Criteria andCurrentrateIsNotNull() {
            addCriterion("CurrentRate is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentrateEqualTo(BigDecimal value) {
            addCriterion("CurrentRate =", value, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateNotEqualTo(BigDecimal value) {
            addCriterion("CurrentRate <>", value, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateGreaterThan(BigDecimal value) {
            addCriterion("CurrentRate >", value, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CurrentRate >=", value, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateLessThan(BigDecimal value) {
            addCriterion("CurrentRate <", value, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CurrentRate <=", value, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateIn(List<BigDecimal> values) {
            addCriterion("CurrentRate in", values, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateNotIn(List<BigDecimal> values) {
            addCriterion("CurrentRate not in", values, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CurrentRate between", value1, value2, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CurrentRate not between", value1, value2, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentdividendIsNull() {
            addCriterion("CurrentDividend is null");
            return (Criteria) this;
        }

        public Criteria andCurrentdividendIsNotNull() {
            addCriterion("CurrentDividend is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentdividendEqualTo(BigDecimal value) {
            addCriterion("CurrentDividend =", value, "currentdividend");
            return (Criteria) this;
        }

        public Criteria andCurrentdividendNotEqualTo(BigDecimal value) {
            addCriterion("CurrentDividend <>", value, "currentdividend");
            return (Criteria) this;
        }

        public Criteria andCurrentdividendGreaterThan(BigDecimal value) {
            addCriterion("CurrentDividend >", value, "currentdividend");
            return (Criteria) this;
        }

        public Criteria andCurrentdividendGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CurrentDividend >=", value, "currentdividend");
            return (Criteria) this;
        }

        public Criteria andCurrentdividendLessThan(BigDecimal value) {
            addCriterion("CurrentDividend <", value, "currentdividend");
            return (Criteria) this;
        }

        public Criteria andCurrentdividendLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CurrentDividend <=", value, "currentdividend");
            return (Criteria) this;
        }

        public Criteria andCurrentdividendIn(List<BigDecimal> values) {
            addCriterion("CurrentDividend in", values, "currentdividend");
            return (Criteria) this;
        }

        public Criteria andCurrentdividendNotIn(List<BigDecimal> values) {
            addCriterion("CurrentDividend not in", values, "currentdividend");
            return (Criteria) this;
        }

        public Criteria andCurrentdividendBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CurrentDividend between", value1, value2, "currentdividend");
            return (Criteria) this;
        }

        public Criteria andCurrentdividendNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CurrentDividend not between", value1, value2, "currentdividend");
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