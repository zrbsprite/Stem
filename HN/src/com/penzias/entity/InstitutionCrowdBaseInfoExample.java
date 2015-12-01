package com.penzias.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InstitutionCrowdBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstitutionCrowdBaseInfoExample() {
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

        public Criteria andCrowdidIsNull() {
            addCriterion("CrowdID is null");
            return (Criteria) this;
        }

        public Criteria andCrowdidIsNotNull() {
            addCriterion("CrowdID is not null");
            return (Criteria) this;
        }

        public Criteria andCrowdidEqualTo(Integer value) {
            addCriterion("CrowdID =", value, "crowdid");
            return (Criteria) this;
        }

        public Criteria andCrowdidNotEqualTo(Integer value) {
            addCriterion("CrowdID <>", value, "crowdid");
            return (Criteria) this;
        }

        public Criteria andCrowdidGreaterThan(Integer value) {
            addCriterion("CrowdID >", value, "crowdid");
            return (Criteria) this;
        }

        public Criteria andCrowdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CrowdID >=", value, "crowdid");
            return (Criteria) this;
        }

        public Criteria andCrowdidLessThan(Integer value) {
            addCriterion("CrowdID <", value, "crowdid");
            return (Criteria) this;
        }

        public Criteria andCrowdidLessThanOrEqualTo(Integer value) {
            addCriterion("CrowdID <=", value, "crowdid");
            return (Criteria) this;
        }

        public Criteria andCrowdidIn(List<Integer> values) {
            addCriterion("CrowdID in", values, "crowdid");
            return (Criteria) this;
        }

        public Criteria andCrowdidNotIn(List<Integer> values) {
            addCriterion("CrowdID not in", values, "crowdid");
            return (Criteria) this;
        }

        public Criteria andCrowdidBetween(Integer value1, Integer value2) {
            addCriterion("CrowdID between", value1, value2, "crowdid");
            return (Criteria) this;
        }

        public Criteria andCrowdidNotBetween(Integer value1, Integer value2) {
            addCriterion("CrowdID not between", value1, value2, "crowdid");
            return (Criteria) this;
        }

        public Criteria andCertificatestypeIsNull() {
            addCriterion("CertificatesType is null");
            return (Criteria) this;
        }

        public Criteria andCertificatestypeIsNotNull() {
            addCriterion("CertificatesType is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatestypeEqualTo(String value) {
            addCriterion("CertificatesType =", value, "certificatestype");
            return (Criteria) this;
        }

        public Criteria andCertificatestypeNotEqualTo(String value) {
            addCriterion("CertificatesType <>", value, "certificatestype");
            return (Criteria) this;
        }

        public Criteria andCertificatestypeGreaterThan(String value) {
            addCriterion("CertificatesType >", value, "certificatestype");
            return (Criteria) this;
        }

        public Criteria andCertificatestypeGreaterThanOrEqualTo(String value) {
            addCriterion("CertificatesType >=", value, "certificatestype");
            return (Criteria) this;
        }

        public Criteria andCertificatestypeLessThan(String value) {
            addCriterion("CertificatesType <", value, "certificatestype");
            return (Criteria) this;
        }

        public Criteria andCertificatestypeLessThanOrEqualTo(String value) {
            addCriterion("CertificatesType <=", value, "certificatestype");
            return (Criteria) this;
        }

        public Criteria andCertificatestypeLike(String value) {
            addCriterion("CertificatesType like", value, "certificatestype");
            return (Criteria) this;
        }

        public Criteria andCertificatestypeNotLike(String value) {
            addCriterion("CertificatesType not like", value, "certificatestype");
            return (Criteria) this;
        }

        public Criteria andCertificatestypeIn(List<String> values) {
            addCriterion("CertificatesType in", values, "certificatestype");
            return (Criteria) this;
        }

        public Criteria andCertificatestypeNotIn(List<String> values) {
            addCriterion("CertificatesType not in", values, "certificatestype");
            return (Criteria) this;
        }

        public Criteria andCertificatestypeBetween(String value1, String value2) {
            addCriterion("CertificatesType between", value1, value2, "certificatestype");
            return (Criteria) this;
        }

        public Criteria andCertificatestypeNotBetween(String value1, String value2) {
            addCriterion("CertificatesType not between", value1, value2, "certificatestype");
            return (Criteria) this;
        }

        public Criteria andCertificatesidIsNull() {
            addCriterion("CertificatesID is null");
            return (Criteria) this;
        }

        public Criteria andCertificatesidIsNotNull() {
            addCriterion("CertificatesID is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatesidEqualTo(String value) {
            addCriterion("CertificatesID =", value, "certificatesid");
            return (Criteria) this;
        }

        public Criteria andCertificatesidNotEqualTo(String value) {
            addCriterion("CertificatesID <>", value, "certificatesid");
            return (Criteria) this;
        }

        public Criteria andCertificatesidGreaterThan(String value) {
            addCriterion("CertificatesID >", value, "certificatesid");
            return (Criteria) this;
        }

        public Criteria andCertificatesidGreaterThanOrEqualTo(String value) {
            addCriterion("CertificatesID >=", value, "certificatesid");
            return (Criteria) this;
        }

        public Criteria andCertificatesidLessThan(String value) {
            addCriterion("CertificatesID <", value, "certificatesid");
            return (Criteria) this;
        }

        public Criteria andCertificatesidLessThanOrEqualTo(String value) {
            addCriterion("CertificatesID <=", value, "certificatesid");
            return (Criteria) this;
        }

        public Criteria andCertificatesidLike(String value) {
            addCriterion("CertificatesID like", value, "certificatesid");
            return (Criteria) this;
        }

        public Criteria andCertificatesidNotLike(String value) {
            addCriterion("CertificatesID not like", value, "certificatesid");
            return (Criteria) this;
        }

        public Criteria andCertificatesidIn(List<String> values) {
            addCriterion("CertificatesID in", values, "certificatesid");
            return (Criteria) this;
        }

        public Criteria andCertificatesidNotIn(List<String> values) {
            addCriterion("CertificatesID not in", values, "certificatesid");
            return (Criteria) this;
        }

        public Criteria andCertificatesidBetween(String value1, String value2) {
            addCriterion("CertificatesID between", value1, value2, "certificatesid");
            return (Criteria) this;
        }

        public Criteria andCertificatesidNotBetween(String value1, String value2) {
            addCriterion("CertificatesID not between", value1, value2, "certificatesid");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNull() {
            addCriterion("FullName is null");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNotNull() {
            addCriterion("FullName is not null");
            return (Criteria) this;
        }

        public Criteria andFullnameEqualTo(String value) {
            addCriterion("FullName =", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotEqualTo(String value) {
            addCriterion("FullName <>", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThan(String value) {
            addCriterion("FullName >", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("FullName >=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThan(String value) {
            addCriterion("FullName <", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThanOrEqualTo(String value) {
            addCriterion("FullName <=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLike(String value) {
            addCriterion("FullName like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotLike(String value) {
            addCriterion("FullName not like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameIn(List<String> values) {
            addCriterion("FullName in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotIn(List<String> values) {
            addCriterion("FullName not in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameBetween(String value1, String value2) {
            addCriterion("FullName between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotBetween(String value1, String value2) {
            addCriterion("FullName not between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("Mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("Mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("Mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("Mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("Mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("Mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("Mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("Mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("Mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("Mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("Mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("Mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("Mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("Mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("Sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("Sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("Sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("Sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("Sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("Sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("Sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("Sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("Sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("Sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("Sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("Sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("Sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("Sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNull() {
            addCriterion("BirthDate is null");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNotNull() {
            addCriterion("BirthDate is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdateEqualTo(Date value) {
            addCriterionForJDBCDate("BirthDate =", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BirthDate <>", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThan(Date value) {
            addCriterionForJDBCDate("BirthDate >", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BirthDate >=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThan(Date value) {
            addCriterionForJDBCDate("BirthDate <", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BirthDate <=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateIn(List<Date> values) {
            addCriterionForJDBCDate("BirthDate in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BirthDate not in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BirthDate between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BirthDate not between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andDepbmIsNull() {
            addCriterion("depBM is null");
            return (Criteria) this;
        }

        public Criteria andDepbmIsNotNull() {
            addCriterion("depBM is not null");
            return (Criteria) this;
        }

        public Criteria andDepbmEqualTo(String value) {
            addCriterion("depBM =", value, "depbm");
            return (Criteria) this;
        }

        public Criteria andDepbmNotEqualTo(String value) {
            addCriterion("depBM <>", value, "depbm");
            return (Criteria) this;
        }

        public Criteria andDepbmGreaterThan(String value) {
            addCriterion("depBM >", value, "depbm");
            return (Criteria) this;
        }

        public Criteria andDepbmGreaterThanOrEqualTo(String value) {
            addCriterion("depBM >=", value, "depbm");
            return (Criteria) this;
        }

        public Criteria andDepbmLessThan(String value) {
            addCriterion("depBM <", value, "depbm");
            return (Criteria) this;
        }

        public Criteria andDepbmLessThanOrEqualTo(String value) {
            addCriterion("depBM <=", value, "depbm");
            return (Criteria) this;
        }

        public Criteria andDepbmLike(String value) {
            addCriterion("depBM like", value, "depbm");
            return (Criteria) this;
        }

        public Criteria andDepbmNotLike(String value) {
            addCriterion("depBM not like", value, "depbm");
            return (Criteria) this;
        }

        public Criteria andDepbmIn(List<String> values) {
            addCriterion("depBM in", values, "depbm");
            return (Criteria) this;
        }

        public Criteria andDepbmNotIn(List<String> values) {
            addCriterion("depBM not in", values, "depbm");
            return (Criteria) this;
        }

        public Criteria andDepbmBetween(String value1, String value2) {
            addCriterion("depBM between", value1, value2, "depbm");
            return (Criteria) this;
        }

        public Criteria andDepbmNotBetween(String value1, String value2) {
            addCriterion("depBM not between", value1, value2, "depbm");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("CreateDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("CreateDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("CreateDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("CreateDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("CreateDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("CreateDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("CreateDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("CreateDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("CreateDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andStatesIsNull() {
            addCriterion("States is null");
            return (Criteria) this;
        }

        public Criteria andStatesIsNotNull() {
            addCriterion("States is not null");
            return (Criteria) this;
        }

        public Criteria andStatesEqualTo(String value) {
            addCriterion("States =", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotEqualTo(String value) {
            addCriterion("States <>", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesGreaterThan(String value) {
            addCriterion("States >", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesGreaterThanOrEqualTo(String value) {
            addCriterion("States >=", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesLessThan(String value) {
            addCriterion("States <", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesLessThanOrEqualTo(String value) {
            addCriterion("States <=", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesLike(String value) {
            addCriterion("States like", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotLike(String value) {
            addCriterion("States not like", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesIn(List<String> values) {
            addCriterion("States in", values, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotIn(List<String> values) {
            addCriterion("States not in", values, "states");
            return (Criteria) this;
        }

        public Criteria andStatesBetween(String value1, String value2) {
            addCriterion("States between", value1, value2, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotBetween(String value1, String value2) {
            addCriterion("States not between", value1, value2, "states");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("Grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("Grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("Grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("Grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("Grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("Grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("Grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("Grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("Grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("Grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("Grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("Grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("Grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("Grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("Source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("Source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("Source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("Source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("Source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("Source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("Source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("Source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("Source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("Source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("Source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("Source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("Source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("Source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourcebzIsNull() {
            addCriterion("SourceBZ is null");
            return (Criteria) this;
        }

        public Criteria andSourcebzIsNotNull() {
            addCriterion("SourceBZ is not null");
            return (Criteria) this;
        }

        public Criteria andSourcebzEqualTo(String value) {
            addCriterion("SourceBZ =", value, "sourcebz");
            return (Criteria) this;
        }

        public Criteria andSourcebzNotEqualTo(String value) {
            addCriterion("SourceBZ <>", value, "sourcebz");
            return (Criteria) this;
        }

        public Criteria andSourcebzGreaterThan(String value) {
            addCriterion("SourceBZ >", value, "sourcebz");
            return (Criteria) this;
        }

        public Criteria andSourcebzGreaterThanOrEqualTo(String value) {
            addCriterion("SourceBZ >=", value, "sourcebz");
            return (Criteria) this;
        }

        public Criteria andSourcebzLessThan(String value) {
            addCriterion("SourceBZ <", value, "sourcebz");
            return (Criteria) this;
        }

        public Criteria andSourcebzLessThanOrEqualTo(String value) {
            addCriterion("SourceBZ <=", value, "sourcebz");
            return (Criteria) this;
        }

        public Criteria andSourcebzLike(String value) {
            addCriterion("SourceBZ like", value, "sourcebz");
            return (Criteria) this;
        }

        public Criteria andSourcebzNotLike(String value) {
            addCriterion("SourceBZ not like", value, "sourcebz");
            return (Criteria) this;
        }

        public Criteria andSourcebzIn(List<String> values) {
            addCriterion("SourceBZ in", values, "sourcebz");
            return (Criteria) this;
        }

        public Criteria andSourcebzNotIn(List<String> values) {
            addCriterion("SourceBZ not in", values, "sourcebz");
            return (Criteria) this;
        }

        public Criteria andSourcebzBetween(String value1, String value2) {
            addCriterion("SourceBZ between", value1, value2, "sourcebz");
            return (Criteria) this;
        }

        public Criteria andSourcebzNotBetween(String value1, String value2) {
            addCriterion("SourceBZ not between", value1, value2, "sourcebz");
            return (Criteria) this;
        }

        public Criteria andCasenoIsNull() {
            addCriterion("CaseNo is null");
            return (Criteria) this;
        }

        public Criteria andCasenoIsNotNull() {
            addCriterion("CaseNo is not null");
            return (Criteria) this;
        }

        public Criteria andCasenoEqualTo(String value) {
            addCriterion("CaseNo =", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotEqualTo(String value) {
            addCriterion("CaseNo <>", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoGreaterThan(String value) {
            addCriterion("CaseNo >", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoGreaterThanOrEqualTo(String value) {
            addCriterion("CaseNo >=", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoLessThan(String value) {
            addCriterion("CaseNo <", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoLessThanOrEqualTo(String value) {
            addCriterion("CaseNo <=", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoLike(String value) {
            addCriterion("CaseNo like", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotLike(String value) {
            addCriterion("CaseNo not like", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoIn(List<String> values) {
            addCriterion("CaseNo in", values, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotIn(List<String> values) {
            addCriterion("CaseNo not in", values, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoBetween(String value1, String value2) {
            addCriterion("CaseNo between", value1, value2, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotBetween(String value1, String value2) {
            addCriterion("CaseNo not between", value1, value2, "caseno");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("Nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("Nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("Nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("Nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("Nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("Nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("Nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("Nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("Nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("Nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("Nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("Nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("Nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("Nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("Education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("Education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("Education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("Education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("Education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("Education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("Education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("Education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("Education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("Education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("Education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("Education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("Education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("Education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNull() {
            addCriterion("Occupation is null");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNotNull() {
            addCriterion("Occupation is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationEqualTo(String value) {
            addCriterion("Occupation =", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotEqualTo(String value) {
            addCriterion("Occupation <>", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThan(String value) {
            addCriterion("Occupation >", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThanOrEqualTo(String value) {
            addCriterion("Occupation >=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThan(String value) {
            addCriterion("Occupation <", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThanOrEqualTo(String value) {
            addCriterion("Occupation <=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLike(String value) {
            addCriterion("Occupation like", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotLike(String value) {
            addCriterion("Occupation not like", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationIn(List<String> values) {
            addCriterion("Occupation in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotIn(List<String> values) {
            addCriterion("Occupation not in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationBetween(String value1, String value2) {
            addCriterion("Occupation between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotBetween(String value1, String value2) {
            addCriterion("Occupation not between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("Income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("Income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(String value) {
            addCriterion("Income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(String value) {
            addCriterion("Income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(String value) {
            addCriterion("Income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("Income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(String value) {
            addCriterion("Income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(String value) {
            addCriterion("Income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLike(String value) {
            addCriterion("Income like", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotLike(String value) {
            addCriterion("Income not like", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<String> values) {
            addCriterion("Income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<String> values) {
            addCriterion("Income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(String value1, String value2) {
            addCriterion("Income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(String value1, String value2) {
            addCriterion("Income not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andPayIsNull() {
            addCriterion("Pay is null");
            return (Criteria) this;
        }

        public Criteria andPayIsNotNull() {
            addCriterion("Pay is not null");
            return (Criteria) this;
        }

        public Criteria andPayEqualTo(String value) {
            addCriterion("Pay =", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotEqualTo(String value) {
            addCriterion("Pay <>", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayGreaterThan(String value) {
            addCriterion("Pay >", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayGreaterThanOrEqualTo(String value) {
            addCriterion("Pay >=", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLessThan(String value) {
            addCriterion("Pay <", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLessThanOrEqualTo(String value) {
            addCriterion("Pay <=", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLike(String value) {
            addCriterion("Pay like", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotLike(String value) {
            addCriterion("Pay not like", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayIn(List<String> values) {
            addCriterion("Pay in", values, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotIn(List<String> values) {
            addCriterion("Pay not in", values, "pay");
            return (Criteria) this;
        }

        public Criteria andPayBetween(String value1, String value2) {
            addCriterion("Pay between", value1, value2, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotBetween(String value1, String value2) {
            addCriterion("Pay not between", value1, value2, "pay");
            return (Criteria) this;
        }

        public Criteria andCensusregisteraddressIsNull() {
            addCriterion("CensusRegisterAddress is null");
            return (Criteria) this;
        }

        public Criteria andCensusregisteraddressIsNotNull() {
            addCriterion("CensusRegisterAddress is not null");
            return (Criteria) this;
        }

        public Criteria andCensusregisteraddressEqualTo(String value) {
            addCriterion("CensusRegisterAddress =", value, "censusregisteraddress");
            return (Criteria) this;
        }

        public Criteria andCensusregisteraddressNotEqualTo(String value) {
            addCriterion("CensusRegisterAddress <>", value, "censusregisteraddress");
            return (Criteria) this;
        }

        public Criteria andCensusregisteraddressGreaterThan(String value) {
            addCriterion("CensusRegisterAddress >", value, "censusregisteraddress");
            return (Criteria) this;
        }

        public Criteria andCensusregisteraddressGreaterThanOrEqualTo(String value) {
            addCriterion("CensusRegisterAddress >=", value, "censusregisteraddress");
            return (Criteria) this;
        }

        public Criteria andCensusregisteraddressLessThan(String value) {
            addCriterion("CensusRegisterAddress <", value, "censusregisteraddress");
            return (Criteria) this;
        }

        public Criteria andCensusregisteraddressLessThanOrEqualTo(String value) {
            addCriterion("CensusRegisterAddress <=", value, "censusregisteraddress");
            return (Criteria) this;
        }

        public Criteria andCensusregisteraddressLike(String value) {
            addCriterion("CensusRegisterAddress like", value, "censusregisteraddress");
            return (Criteria) this;
        }

        public Criteria andCensusregisteraddressNotLike(String value) {
            addCriterion("CensusRegisterAddress not like", value, "censusregisteraddress");
            return (Criteria) this;
        }

        public Criteria andCensusregisteraddressIn(List<String> values) {
            addCriterion("CensusRegisterAddress in", values, "censusregisteraddress");
            return (Criteria) this;
        }

        public Criteria andCensusregisteraddressNotIn(List<String> values) {
            addCriterion("CensusRegisterAddress not in", values, "censusregisteraddress");
            return (Criteria) this;
        }

        public Criteria andCensusregisteraddressBetween(String value1, String value2) {
            addCriterion("CensusRegisterAddress between", value1, value2, "censusregisteraddress");
            return (Criteria) this;
        }

        public Criteria andCensusregisteraddressNotBetween(String value1, String value2) {
            addCriterion("CensusRegisterAddress not between", value1, value2, "censusregisteraddress");
            return (Criteria) this;
        }

        public Criteria andCensusregistercodeIsNull() {
            addCriterion("CensusRegisterCode is null");
            return (Criteria) this;
        }

        public Criteria andCensusregistercodeIsNotNull() {
            addCriterion("CensusRegisterCode is not null");
            return (Criteria) this;
        }

        public Criteria andCensusregistercodeEqualTo(String value) {
            addCriterion("CensusRegisterCode =", value, "censusregistercode");
            return (Criteria) this;
        }

        public Criteria andCensusregistercodeNotEqualTo(String value) {
            addCriterion("CensusRegisterCode <>", value, "censusregistercode");
            return (Criteria) this;
        }

        public Criteria andCensusregistercodeGreaterThan(String value) {
            addCriterion("CensusRegisterCode >", value, "censusregistercode");
            return (Criteria) this;
        }

        public Criteria andCensusregistercodeGreaterThanOrEqualTo(String value) {
            addCriterion("CensusRegisterCode >=", value, "censusregistercode");
            return (Criteria) this;
        }

        public Criteria andCensusregistercodeLessThan(String value) {
            addCriterion("CensusRegisterCode <", value, "censusregistercode");
            return (Criteria) this;
        }

        public Criteria andCensusregistercodeLessThanOrEqualTo(String value) {
            addCriterion("CensusRegisterCode <=", value, "censusregistercode");
            return (Criteria) this;
        }

        public Criteria andCensusregistercodeLike(String value) {
            addCriterion("CensusRegisterCode like", value, "censusregistercode");
            return (Criteria) this;
        }

        public Criteria andCensusregistercodeNotLike(String value) {
            addCriterion("CensusRegisterCode not like", value, "censusregistercode");
            return (Criteria) this;
        }

        public Criteria andCensusregistercodeIn(List<String> values) {
            addCriterion("CensusRegisterCode in", values, "censusregistercode");
            return (Criteria) this;
        }

        public Criteria andCensusregistercodeNotIn(List<String> values) {
            addCriterion("CensusRegisterCode not in", values, "censusregistercode");
            return (Criteria) this;
        }

        public Criteria andCensusregistercodeBetween(String value1, String value2) {
            addCriterion("CensusRegisterCode between", value1, value2, "censusregistercode");
            return (Criteria) this;
        }

        public Criteria andCensusregistercodeNotBetween(String value1, String value2) {
            addCriterion("CensusRegisterCode not between", value1, value2, "censusregistercode");
            return (Criteria) this;
        }

        public Criteria andLiveaddressIsNull() {
            addCriterion("LiveAddress is null");
            return (Criteria) this;
        }

        public Criteria andLiveaddressIsNotNull() {
            addCriterion("LiveAddress is not null");
            return (Criteria) this;
        }

        public Criteria andLiveaddressEqualTo(String value) {
            addCriterion("LiveAddress =", value, "liveaddress");
            return (Criteria) this;
        }

        public Criteria andLiveaddressNotEqualTo(String value) {
            addCriterion("LiveAddress <>", value, "liveaddress");
            return (Criteria) this;
        }

        public Criteria andLiveaddressGreaterThan(String value) {
            addCriterion("LiveAddress >", value, "liveaddress");
            return (Criteria) this;
        }

        public Criteria andLiveaddressGreaterThanOrEqualTo(String value) {
            addCriterion("LiveAddress >=", value, "liveaddress");
            return (Criteria) this;
        }

        public Criteria andLiveaddressLessThan(String value) {
            addCriterion("LiveAddress <", value, "liveaddress");
            return (Criteria) this;
        }

        public Criteria andLiveaddressLessThanOrEqualTo(String value) {
            addCriterion("LiveAddress <=", value, "liveaddress");
            return (Criteria) this;
        }

        public Criteria andLiveaddressLike(String value) {
            addCriterion("LiveAddress like", value, "liveaddress");
            return (Criteria) this;
        }

        public Criteria andLiveaddressNotLike(String value) {
            addCriterion("LiveAddress not like", value, "liveaddress");
            return (Criteria) this;
        }

        public Criteria andLiveaddressIn(List<String> values) {
            addCriterion("LiveAddress in", values, "liveaddress");
            return (Criteria) this;
        }

        public Criteria andLiveaddressNotIn(List<String> values) {
            addCriterion("LiveAddress not in", values, "liveaddress");
            return (Criteria) this;
        }

        public Criteria andLiveaddressBetween(String value1, String value2) {
            addCriterion("LiveAddress between", value1, value2, "liveaddress");
            return (Criteria) this;
        }

        public Criteria andLiveaddressNotBetween(String value1, String value2) {
            addCriterion("LiveAddress not between", value1, value2, "liveaddress");
            return (Criteria) this;
        }

        public Criteria andLivecodeIsNull() {
            addCriterion("LiveCode is null");
            return (Criteria) this;
        }

        public Criteria andLivecodeIsNotNull() {
            addCriterion("LiveCode is not null");
            return (Criteria) this;
        }

        public Criteria andLivecodeEqualTo(String value) {
            addCriterion("LiveCode =", value, "livecode");
            return (Criteria) this;
        }

        public Criteria andLivecodeNotEqualTo(String value) {
            addCriterion("LiveCode <>", value, "livecode");
            return (Criteria) this;
        }

        public Criteria andLivecodeGreaterThan(String value) {
            addCriterion("LiveCode >", value, "livecode");
            return (Criteria) this;
        }

        public Criteria andLivecodeGreaterThanOrEqualTo(String value) {
            addCriterion("LiveCode >=", value, "livecode");
            return (Criteria) this;
        }

        public Criteria andLivecodeLessThan(String value) {
            addCriterion("LiveCode <", value, "livecode");
            return (Criteria) this;
        }

        public Criteria andLivecodeLessThanOrEqualTo(String value) {
            addCriterion("LiveCode <=", value, "livecode");
            return (Criteria) this;
        }

        public Criteria andLivecodeLike(String value) {
            addCriterion("LiveCode like", value, "livecode");
            return (Criteria) this;
        }

        public Criteria andLivecodeNotLike(String value) {
            addCriterion("LiveCode not like", value, "livecode");
            return (Criteria) this;
        }

        public Criteria andLivecodeIn(List<String> values) {
            addCriterion("LiveCode in", values, "livecode");
            return (Criteria) this;
        }

        public Criteria andLivecodeNotIn(List<String> values) {
            addCriterion("LiveCode not in", values, "livecode");
            return (Criteria) this;
        }

        public Criteria andLivecodeBetween(String value1, String value2) {
            addCriterion("LiveCode between", value1, value2, "livecode");
            return (Criteria) this;
        }

        public Criteria andLivecodeNotBetween(String value1, String value2) {
            addCriterion("LiveCode not between", value1, value2, "livecode");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("Tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("Tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("Tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("Tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("Tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("Tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("Tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("Tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("Tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("Tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("Tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("Tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("Tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("Tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("LinkMan is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("LinkMan is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("LinkMan =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("LinkMan <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("LinkMan >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("LinkMan >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("LinkMan <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("LinkMan <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("LinkMan like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("LinkMan not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("LinkMan in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("LinkMan not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("LinkMan between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("LinkMan not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanmobIsNull() {
            addCriterion("LinkManMob is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanmobIsNotNull() {
            addCriterion("LinkManMob is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanmobEqualTo(String value) {
            addCriterion("LinkManMob =", value, "linkmanmob");
            return (Criteria) this;
        }

        public Criteria andLinkmanmobNotEqualTo(String value) {
            addCriterion("LinkManMob <>", value, "linkmanmob");
            return (Criteria) this;
        }

        public Criteria andLinkmanmobGreaterThan(String value) {
            addCriterion("LinkManMob >", value, "linkmanmob");
            return (Criteria) this;
        }

        public Criteria andLinkmanmobGreaterThanOrEqualTo(String value) {
            addCriterion("LinkManMob >=", value, "linkmanmob");
            return (Criteria) this;
        }

        public Criteria andLinkmanmobLessThan(String value) {
            addCriterion("LinkManMob <", value, "linkmanmob");
            return (Criteria) this;
        }

        public Criteria andLinkmanmobLessThanOrEqualTo(String value) {
            addCriterion("LinkManMob <=", value, "linkmanmob");
            return (Criteria) this;
        }

        public Criteria andLinkmanmobLike(String value) {
            addCriterion("LinkManMob like", value, "linkmanmob");
            return (Criteria) this;
        }

        public Criteria andLinkmanmobNotLike(String value) {
            addCriterion("LinkManMob not like", value, "linkmanmob");
            return (Criteria) this;
        }

        public Criteria andLinkmanmobIn(List<String> values) {
            addCriterion("LinkManMob in", values, "linkmanmob");
            return (Criteria) this;
        }

        public Criteria andLinkmanmobNotIn(List<String> values) {
            addCriterion("LinkManMob not in", values, "linkmanmob");
            return (Criteria) this;
        }

        public Criteria andLinkmanmobBetween(String value1, String value2) {
            addCriterion("LinkManMob between", value1, value2, "linkmanmob");
            return (Criteria) this;
        }

        public Criteria andLinkmanmobNotBetween(String value1, String value2) {
            addCriterion("LinkManMob not between", value1, value2, "linkmanmob");
            return (Criteria) this;
        }

        public Criteria andRelationshipIsNull() {
            addCriterion("Relationship is null");
            return (Criteria) this;
        }

        public Criteria andRelationshipIsNotNull() {
            addCriterion("Relationship is not null");
            return (Criteria) this;
        }

        public Criteria andRelationshipEqualTo(String value) {
            addCriterion("Relationship =", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotEqualTo(String value) {
            addCriterion("Relationship <>", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipGreaterThan(String value) {
            addCriterion("Relationship >", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipGreaterThanOrEqualTo(String value) {
            addCriterion("Relationship >=", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLessThan(String value) {
            addCriterion("Relationship <", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLessThanOrEqualTo(String value) {
            addCriterion("Relationship <=", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLike(String value) {
            addCriterion("Relationship like", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotLike(String value) {
            addCriterion("Relationship not like", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipIn(List<String> values) {
            addCriterion("Relationship in", values, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotIn(List<String> values) {
            addCriterion("Relationship not in", values, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipBetween(String value1, String value2) {
            addCriterion("Relationship between", value1, value2, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotBetween(String value1, String value2) {
            addCriterion("Relationship not between", value1, value2, "relationship");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("Flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("Flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("Flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("Flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("Flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("Flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("Flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("Flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("Flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("Flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("Flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("Flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("Flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("Flag not between", value1, value2, "flag");
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