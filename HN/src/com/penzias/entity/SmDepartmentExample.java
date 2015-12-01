package com.penzias.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SmDepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmDepartmentExample() {
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

        public Criteria andDepnameIsNull() {
            addCriterion("depName is null");
            return (Criteria) this;
        }

        public Criteria andDepnameIsNotNull() {
            addCriterion("depName is not null");
            return (Criteria) this;
        }

        public Criteria andDepnameEqualTo(String value) {
            addCriterion("depName =", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotEqualTo(String value) {
            addCriterion("depName <>", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameGreaterThan(String value) {
            addCriterion("depName >", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameGreaterThanOrEqualTo(String value) {
            addCriterion("depName >=", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameLessThan(String value) {
            addCriterion("depName <", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameLessThanOrEqualTo(String value) {
            addCriterion("depName <=", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameLike(String value) {
            addCriterion("depName like", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotLike(String value) {
            addCriterion("depName not like", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameIn(List<String> values) {
            addCriterion("depName in", values, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotIn(List<String> values) {
            addCriterion("depName not in", values, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameBetween(String value1, String value2) {
            addCriterion("depName between", value1, value2, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotBetween(String value1, String value2) {
            addCriterion("depName not between", value1, value2, "depname");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("Description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("Description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("Description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("Description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("Description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("Description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("Description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("Description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("Description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("Description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("Description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("Description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeIsNull() {
            addCriterion("InstitutionType is null");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeIsNotNull() {
            addCriterion("InstitutionType is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeEqualTo(String value) {
            addCriterion("InstitutionType =", value, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeNotEqualTo(String value) {
            addCriterion("InstitutionType <>", value, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeGreaterThan(String value) {
            addCriterion("InstitutionType >", value, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeGreaterThanOrEqualTo(String value) {
            addCriterion("InstitutionType >=", value, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeLessThan(String value) {
            addCriterion("InstitutionType <", value, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeLessThanOrEqualTo(String value) {
            addCriterion("InstitutionType <=", value, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeLike(String value) {
            addCriterion("InstitutionType like", value, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeNotLike(String value) {
            addCriterion("InstitutionType not like", value, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeIn(List<String> values) {
            addCriterion("InstitutionType in", values, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeNotIn(List<String> values) {
            addCriterion("InstitutionType not in", values, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeBetween(String value1, String value2) {
            addCriterion("InstitutionType between", value1, value2, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeNotBetween(String value1, String value2) {
            addCriterion("InstitutionType not between", value1, value2, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andDepflagIsNull() {
            addCriterion("depFlag is null");
            return (Criteria) this;
        }

        public Criteria andDepflagIsNotNull() {
            addCriterion("depFlag is not null");
            return (Criteria) this;
        }

        public Criteria andDepflagEqualTo(String value) {
            addCriterion("depFlag =", value, "depflag");
            return (Criteria) this;
        }

        public Criteria andDepflagNotEqualTo(String value) {
            addCriterion("depFlag <>", value, "depflag");
            return (Criteria) this;
        }

        public Criteria andDepflagGreaterThan(String value) {
            addCriterion("depFlag >", value, "depflag");
            return (Criteria) this;
        }

        public Criteria andDepflagGreaterThanOrEqualTo(String value) {
            addCriterion("depFlag >=", value, "depflag");
            return (Criteria) this;
        }

        public Criteria andDepflagLessThan(String value) {
            addCriterion("depFlag <", value, "depflag");
            return (Criteria) this;
        }

        public Criteria andDepflagLessThanOrEqualTo(String value) {
            addCriterion("depFlag <=", value, "depflag");
            return (Criteria) this;
        }

        public Criteria andDepflagLike(String value) {
            addCriterion("depFlag like", value, "depflag");
            return (Criteria) this;
        }

        public Criteria andDepflagNotLike(String value) {
            addCriterion("depFlag not like", value, "depflag");
            return (Criteria) this;
        }

        public Criteria andDepflagIn(List<String> values) {
            addCriterion("depFlag in", values, "depflag");
            return (Criteria) this;
        }

        public Criteria andDepflagNotIn(List<String> values) {
            addCriterion("depFlag not in", values, "depflag");
            return (Criteria) this;
        }

        public Criteria andDepflagBetween(String value1, String value2) {
            addCriterion("depFlag between", value1, value2, "depflag");
            return (Criteria) this;
        }

        public Criteria andDepflagNotBetween(String value1, String value2) {
            addCriterion("depFlag not between", value1, value2, "depflag");
            return (Criteria) this;
        }

        public Criteria andPptrIsNull() {
            addCriterion("PPtr is null");
            return (Criteria) this;
        }

        public Criteria andPptrIsNotNull() {
            addCriterion("PPtr is not null");
            return (Criteria) this;
        }

        public Criteria andPptrEqualTo(String value) {
            addCriterion("PPtr =", value, "pptr");
            return (Criteria) this;
        }

        public Criteria andPptrNotEqualTo(String value) {
            addCriterion("PPtr <>", value, "pptr");
            return (Criteria) this;
        }

        public Criteria andPptrGreaterThan(String value) {
            addCriterion("PPtr >", value, "pptr");
            return (Criteria) this;
        }

        public Criteria andPptrGreaterThanOrEqualTo(String value) {
            addCriterion("PPtr >=", value, "pptr");
            return (Criteria) this;
        }

        public Criteria andPptrLessThan(String value) {
            addCriterion("PPtr <", value, "pptr");
            return (Criteria) this;
        }

        public Criteria andPptrLessThanOrEqualTo(String value) {
            addCriterion("PPtr <=", value, "pptr");
            return (Criteria) this;
        }

        public Criteria andPptrLike(String value) {
            addCriterion("PPtr like", value, "pptr");
            return (Criteria) this;
        }

        public Criteria andPptrNotLike(String value) {
            addCriterion("PPtr not like", value, "pptr");
            return (Criteria) this;
        }

        public Criteria andPptrIn(List<String> values) {
            addCriterion("PPtr in", values, "pptr");
            return (Criteria) this;
        }

        public Criteria andPptrNotIn(List<String> values) {
            addCriterion("PPtr not in", values, "pptr");
            return (Criteria) this;
        }

        public Criteria andPptrBetween(String value1, String value2) {
            addCriterion("PPtr between", value1, value2, "pptr");
            return (Criteria) this;
        }

        public Criteria andPptrNotBetween(String value1, String value2) {
            addCriterion("PPtr not between", value1, value2, "pptr");
            return (Criteria) this;
        }

        public Criteria andCptrIsNull() {
            addCriterion("CPtr is null");
            return (Criteria) this;
        }

        public Criteria andCptrIsNotNull() {
            addCriterion("CPtr is not null");
            return (Criteria) this;
        }

        public Criteria andCptrEqualTo(String value) {
            addCriterion("CPtr =", value, "cptr");
            return (Criteria) this;
        }

        public Criteria andCptrNotEqualTo(String value) {
            addCriterion("CPtr <>", value, "cptr");
            return (Criteria) this;
        }

        public Criteria andCptrGreaterThan(String value) {
            addCriterion("CPtr >", value, "cptr");
            return (Criteria) this;
        }

        public Criteria andCptrGreaterThanOrEqualTo(String value) {
            addCriterion("CPtr >=", value, "cptr");
            return (Criteria) this;
        }

        public Criteria andCptrLessThan(String value) {
            addCriterion("CPtr <", value, "cptr");
            return (Criteria) this;
        }

        public Criteria andCptrLessThanOrEqualTo(String value) {
            addCriterion("CPtr <=", value, "cptr");
            return (Criteria) this;
        }

        public Criteria andCptrLike(String value) {
            addCriterion("CPtr like", value, "cptr");
            return (Criteria) this;
        }

        public Criteria andCptrNotLike(String value) {
            addCriterion("CPtr not like", value, "cptr");
            return (Criteria) this;
        }

        public Criteria andCptrIn(List<String> values) {
            addCriterion("CPtr in", values, "cptr");
            return (Criteria) this;
        }

        public Criteria andCptrNotIn(List<String> values) {
            addCriterion("CPtr not in", values, "cptr");
            return (Criteria) this;
        }

        public Criteria andCptrBetween(String value1, String value2) {
            addCriterion("CPtr between", value1, value2, "cptr");
            return (Criteria) this;
        }

        public Criteria andCptrNotBetween(String value1, String value2) {
            addCriterion("CPtr not between", value1, value2, "cptr");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("Status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("Status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("Logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("Logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("Logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("Logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("Logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("Logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("Logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("Logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("Logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("Logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("Logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("Logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("Logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("Logo not between", value1, value2, "logo");
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

        public Criteria andLinkmantelIsNull() {
            addCriterion("LinkManTel is null");
            return (Criteria) this;
        }

        public Criteria andLinkmantelIsNotNull() {
            addCriterion("LinkManTel is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmantelEqualTo(String value) {
            addCriterion("LinkManTel =", value, "linkmantel");
            return (Criteria) this;
        }

        public Criteria andLinkmantelNotEqualTo(String value) {
            addCriterion("LinkManTel <>", value, "linkmantel");
            return (Criteria) this;
        }

        public Criteria andLinkmantelGreaterThan(String value) {
            addCriterion("LinkManTel >", value, "linkmantel");
            return (Criteria) this;
        }

        public Criteria andLinkmantelGreaterThanOrEqualTo(String value) {
            addCriterion("LinkManTel >=", value, "linkmantel");
            return (Criteria) this;
        }

        public Criteria andLinkmantelLessThan(String value) {
            addCriterion("LinkManTel <", value, "linkmantel");
            return (Criteria) this;
        }

        public Criteria andLinkmantelLessThanOrEqualTo(String value) {
            addCriterion("LinkManTel <=", value, "linkmantel");
            return (Criteria) this;
        }

        public Criteria andLinkmantelLike(String value) {
            addCriterion("LinkManTel like", value, "linkmantel");
            return (Criteria) this;
        }

        public Criteria andLinkmantelNotLike(String value) {
            addCriterion("LinkManTel not like", value, "linkmantel");
            return (Criteria) this;
        }

        public Criteria andLinkmantelIn(List<String> values) {
            addCriterion("LinkManTel in", values, "linkmantel");
            return (Criteria) this;
        }

        public Criteria andLinkmantelNotIn(List<String> values) {
            addCriterion("LinkManTel not in", values, "linkmantel");
            return (Criteria) this;
        }

        public Criteria andLinkmantelBetween(String value1, String value2) {
            addCriterion("LinkManTel between", value1, value2, "linkmantel");
            return (Criteria) this;
        }

        public Criteria andLinkmantelNotBetween(String value1, String value2) {
            addCriterion("LinkManTel not between", value1, value2, "linkmantel");
            return (Criteria) this;
        }

        public Criteria andInstitutiontelIsNull() {
            addCriterion("InstitutionTel is null");
            return (Criteria) this;
        }

        public Criteria andInstitutiontelIsNotNull() {
            addCriterion("InstitutionTel is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutiontelEqualTo(String value) {
            addCriterion("InstitutionTel =", value, "institutiontel");
            return (Criteria) this;
        }

        public Criteria andInstitutiontelNotEqualTo(String value) {
            addCriterion("InstitutionTel <>", value, "institutiontel");
            return (Criteria) this;
        }

        public Criteria andInstitutiontelGreaterThan(String value) {
            addCriterion("InstitutionTel >", value, "institutiontel");
            return (Criteria) this;
        }

        public Criteria andInstitutiontelGreaterThanOrEqualTo(String value) {
            addCriterion("InstitutionTel >=", value, "institutiontel");
            return (Criteria) this;
        }

        public Criteria andInstitutiontelLessThan(String value) {
            addCriterion("InstitutionTel <", value, "institutiontel");
            return (Criteria) this;
        }

        public Criteria andInstitutiontelLessThanOrEqualTo(String value) {
            addCriterion("InstitutionTel <=", value, "institutiontel");
            return (Criteria) this;
        }

        public Criteria andInstitutiontelLike(String value) {
            addCriterion("InstitutionTel like", value, "institutiontel");
            return (Criteria) this;
        }

        public Criteria andInstitutiontelNotLike(String value) {
            addCriterion("InstitutionTel not like", value, "institutiontel");
            return (Criteria) this;
        }

        public Criteria andInstitutiontelIn(List<String> values) {
            addCriterion("InstitutionTel in", values, "institutiontel");
            return (Criteria) this;
        }

        public Criteria andInstitutiontelNotIn(List<String> values) {
            addCriterion("InstitutionTel not in", values, "institutiontel");
            return (Criteria) this;
        }

        public Criteria andInstitutiontelBetween(String value1, String value2) {
            addCriterion("InstitutionTel between", value1, value2, "institutiontel");
            return (Criteria) this;
        }

        public Criteria andInstitutiontelNotBetween(String value1, String value2) {
            addCriterion("InstitutionTel not between", value1, value2, "institutiontel");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
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

        public Criteria andAreaIsNull() {
            addCriterion("Area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("Area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("Area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("Area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("Area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("Area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("Area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("Area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("Area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("Area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("Area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("Area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("Area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("Area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andZorderIsNull() {
            addCriterion("zorder is null");
            return (Criteria) this;
        }

        public Criteria andZorderIsNotNull() {
            addCriterion("zorder is not null");
            return (Criteria) this;
        }

        public Criteria andZorderEqualTo(Integer value) {
            addCriterion("zorder =", value, "zorder");
            return (Criteria) this;
        }

        public Criteria andZorderNotEqualTo(Integer value) {
            addCriterion("zorder <>", value, "zorder");
            return (Criteria) this;
        }

        public Criteria andZorderGreaterThan(Integer value) {
            addCriterion("zorder >", value, "zorder");
            return (Criteria) this;
        }

        public Criteria andZorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("zorder >=", value, "zorder");
            return (Criteria) this;
        }

        public Criteria andZorderLessThan(Integer value) {
            addCriterion("zorder <", value, "zorder");
            return (Criteria) this;
        }

        public Criteria andZorderLessThanOrEqualTo(Integer value) {
            addCriterion("zorder <=", value, "zorder");
            return (Criteria) this;
        }

        public Criteria andZorderIn(List<Integer> values) {
            addCriterion("zorder in", values, "zorder");
            return (Criteria) this;
        }

        public Criteria andZorderNotIn(List<Integer> values) {
            addCriterion("zorder not in", values, "zorder");
            return (Criteria) this;
        }

        public Criteria andZorderBetween(Integer value1, Integer value2) {
            addCriterion("zorder between", value1, value2, "zorder");
            return (Criteria) this;
        }

        public Criteria andZorderNotBetween(Integer value1, Integer value2) {
            addCriterion("zorder not between", value1, value2, "zorder");
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