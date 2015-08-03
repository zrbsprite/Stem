package com.stem.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserTypeCodeIsNull() {
            addCriterion("USER_TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeCodeIsNotNull() {
            addCriterion("USER_TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeCodeEqualTo(String value) {
            addCriterion("USER_TYPE_CODE =", value, "userTypeCode");
            return (Criteria) this;
        }

        public Criteria andUserTypeCodeNotEqualTo(String value) {
            addCriterion("USER_TYPE_CODE <>", value, "userTypeCode");
            return (Criteria) this;
        }

        public Criteria andUserTypeCodeGreaterThan(String value) {
            addCriterion("USER_TYPE_CODE >", value, "userTypeCode");
            return (Criteria) this;
        }

        public Criteria andUserTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TYPE_CODE >=", value, "userTypeCode");
            return (Criteria) this;
        }

        public Criteria andUserTypeCodeLessThan(String value) {
            addCriterion("USER_TYPE_CODE <", value, "userTypeCode");
            return (Criteria) this;
        }

        public Criteria andUserTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("USER_TYPE_CODE <=", value, "userTypeCode");
            return (Criteria) this;
        }

        public Criteria andUserTypeCodeLike(String value) {
            addCriterion("USER_TYPE_CODE like", value, "userTypeCode");
            return (Criteria) this;
        }

        public Criteria andUserTypeCodeNotLike(String value) {
            addCriterion("USER_TYPE_CODE not like", value, "userTypeCode");
            return (Criteria) this;
        }

        public Criteria andUserTypeCodeIn(List<String> values) {
            addCriterion("USER_TYPE_CODE in", values, "userTypeCode");
            return (Criteria) this;
        }

        public Criteria andUserTypeCodeNotIn(List<String> values) {
            addCriterion("USER_TYPE_CODE not in", values, "userTypeCode");
            return (Criteria) this;
        }

        public Criteria andUserTypeCodeBetween(String value1, String value2) {
            addCriterion("USER_TYPE_CODE between", value1, value2, "userTypeCode");
            return (Criteria) this;
        }

        public Criteria andUserTypeCodeNotBetween(String value1, String value2) {
            addCriterion("USER_TYPE_CODE not between", value1, value2, "userTypeCode");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("NICK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("NICK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("NICK_NAME =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("NICK_NAME <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("NICK_NAME >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("NICK_NAME >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("NICK_NAME <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("NICK_NAME <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("NICK_NAME like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("NICK_NAME not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("NICK_NAME in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("NICK_NAME not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("NICK_NAME between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("NICK_NAME not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIsNull() {
            addCriterion("INVITE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIsNotNull() {
            addCriterion("INVITE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeEqualTo(String value) {
            addCriterion("INVITE_CODE =", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotEqualTo(String value) {
            addCriterion("INVITE_CODE <>", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeGreaterThan(String value) {
            addCriterion("INVITE_CODE >", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INVITE_CODE >=", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLessThan(String value) {
            addCriterion("INVITE_CODE <", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLessThanOrEqualTo(String value) {
            addCriterion("INVITE_CODE <=", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLike(String value) {
            addCriterion("INVITE_CODE like", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotLike(String value) {
            addCriterion("INVITE_CODE not like", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIn(List<String> values) {
            addCriterion("INVITE_CODE in", values, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotIn(List<String> values) {
            addCriterion("INVITE_CODE not in", values, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeBetween(String value1, String value2) {
            addCriterion("INVITE_CODE between", value1, value2, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotBetween(String value1, String value2) {
            addCriterion("INVITE_CODE not between", value1, value2, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andLableCodeIsNull() {
            addCriterion("LABLE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLableCodeIsNotNull() {
            addCriterion("LABLE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLableCodeEqualTo(String value) {
            addCriterion("LABLE_CODE =", value, "lableCode");
            return (Criteria) this;
        }

        public Criteria andLableCodeNotEqualTo(String value) {
            addCriterion("LABLE_CODE <>", value, "lableCode");
            return (Criteria) this;
        }

        public Criteria andLableCodeGreaterThan(String value) {
            addCriterion("LABLE_CODE >", value, "lableCode");
            return (Criteria) this;
        }

        public Criteria andLableCodeGreaterThanOrEqualTo(String value) {
            addCriterion("LABLE_CODE >=", value, "lableCode");
            return (Criteria) this;
        }

        public Criteria andLableCodeLessThan(String value) {
            addCriterion("LABLE_CODE <", value, "lableCode");
            return (Criteria) this;
        }

        public Criteria andLableCodeLessThanOrEqualTo(String value) {
            addCriterion("LABLE_CODE <=", value, "lableCode");
            return (Criteria) this;
        }

        public Criteria andLableCodeLike(String value) {
            addCriterion("LABLE_CODE like", value, "lableCode");
            return (Criteria) this;
        }

        public Criteria andLableCodeNotLike(String value) {
            addCriterion("LABLE_CODE not like", value, "lableCode");
            return (Criteria) this;
        }

        public Criteria andLableCodeIn(List<String> values) {
            addCriterion("LABLE_CODE in", values, "lableCode");
            return (Criteria) this;
        }

        public Criteria andLableCodeNotIn(List<String> values) {
            addCriterion("LABLE_CODE not in", values, "lableCode");
            return (Criteria) this;
        }

        public Criteria andLableCodeBetween(String value1, String value2) {
            addCriterion("LABLE_CODE between", value1, value2, "lableCode");
            return (Criteria) this;
        }

        public Criteria andLableCodeNotBetween(String value1, String value2) {
            addCriterion("LABLE_CODE not between", value1, value2, "lableCode");
            return (Criteria) this;
        }

        public Criteria andIntoGuideIsNull() {
            addCriterion("INTO_GUIDE is null");
            return (Criteria) this;
        }

        public Criteria andIntoGuideIsNotNull() {
            addCriterion("INTO_GUIDE is not null");
            return (Criteria) this;
        }

        public Criteria andIntoGuideEqualTo(String value) {
            addCriterion("INTO_GUIDE =", value, "intoGuide");
            return (Criteria) this;
        }

        public Criteria andIntoGuideNotEqualTo(String value) {
            addCriterion("INTO_GUIDE <>", value, "intoGuide");
            return (Criteria) this;
        }

        public Criteria andIntoGuideGreaterThan(String value) {
            addCriterion("INTO_GUIDE >", value, "intoGuide");
            return (Criteria) this;
        }

        public Criteria andIntoGuideGreaterThanOrEqualTo(String value) {
            addCriterion("INTO_GUIDE >=", value, "intoGuide");
            return (Criteria) this;
        }

        public Criteria andIntoGuideLessThan(String value) {
            addCriterion("INTO_GUIDE <", value, "intoGuide");
            return (Criteria) this;
        }

        public Criteria andIntoGuideLessThanOrEqualTo(String value) {
            addCriterion("INTO_GUIDE <=", value, "intoGuide");
            return (Criteria) this;
        }

        public Criteria andIntoGuideLike(String value) {
            addCriterion("INTO_GUIDE like", value, "intoGuide");
            return (Criteria) this;
        }

        public Criteria andIntoGuideNotLike(String value) {
            addCriterion("INTO_GUIDE not like", value, "intoGuide");
            return (Criteria) this;
        }

        public Criteria andIntoGuideIn(List<String> values) {
            addCriterion("INTO_GUIDE in", values, "intoGuide");
            return (Criteria) this;
        }

        public Criteria andIntoGuideNotIn(List<String> values) {
            addCriterion("INTO_GUIDE not in", values, "intoGuide");
            return (Criteria) this;
        }

        public Criteria andIntoGuideBetween(String value1, String value2) {
            addCriterion("INTO_GUIDE between", value1, value2, "intoGuide");
            return (Criteria) this;
        }

        public Criteria andIntoGuideNotBetween(String value1, String value2) {
            addCriterion("INTO_GUIDE not between", value1, value2, "intoGuide");
            return (Criteria) this;
        }

        public Criteria andFunctionGuideIsNull() {
            addCriterion("FUNCTION_GUIDE is null");
            return (Criteria) this;
        }

        public Criteria andFunctionGuideIsNotNull() {
            addCriterion("FUNCTION_GUIDE is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionGuideEqualTo(String value) {
            addCriterion("FUNCTION_GUIDE =", value, "functionGuide");
            return (Criteria) this;
        }

        public Criteria andFunctionGuideNotEqualTo(String value) {
            addCriterion("FUNCTION_GUIDE <>", value, "functionGuide");
            return (Criteria) this;
        }

        public Criteria andFunctionGuideGreaterThan(String value) {
            addCriterion("FUNCTION_GUIDE >", value, "functionGuide");
            return (Criteria) this;
        }

        public Criteria andFunctionGuideGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTION_GUIDE >=", value, "functionGuide");
            return (Criteria) this;
        }

        public Criteria andFunctionGuideLessThan(String value) {
            addCriterion("FUNCTION_GUIDE <", value, "functionGuide");
            return (Criteria) this;
        }

        public Criteria andFunctionGuideLessThanOrEqualTo(String value) {
            addCriterion("FUNCTION_GUIDE <=", value, "functionGuide");
            return (Criteria) this;
        }

        public Criteria andFunctionGuideLike(String value) {
            addCriterion("FUNCTION_GUIDE like", value, "functionGuide");
            return (Criteria) this;
        }

        public Criteria andFunctionGuideNotLike(String value) {
            addCriterion("FUNCTION_GUIDE not like", value, "functionGuide");
            return (Criteria) this;
        }

        public Criteria andFunctionGuideIn(List<String> values) {
            addCriterion("FUNCTION_GUIDE in", values, "functionGuide");
            return (Criteria) this;
        }

        public Criteria andFunctionGuideNotIn(List<String> values) {
            addCriterion("FUNCTION_GUIDE not in", values, "functionGuide");
            return (Criteria) this;
        }

        public Criteria andFunctionGuideBetween(String value1, String value2) {
            addCriterion("FUNCTION_GUIDE between", value1, value2, "functionGuide");
            return (Criteria) this;
        }

        public Criteria andFunctionGuideNotBetween(String value1, String value2) {
            addCriterion("FUNCTION_GUIDE not between", value1, value2, "functionGuide");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdIsNull() {
            addCriterion("WX_OPEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdIsNotNull() {
            addCriterion("WX_OPEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdEqualTo(String value) {
            addCriterion("WX_OPEN_ID =", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdNotEqualTo(String value) {
            addCriterion("WX_OPEN_ID <>", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdGreaterThan(String value) {
            addCriterion("WX_OPEN_ID >", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("WX_OPEN_ID >=", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdLessThan(String value) {
            addCriterion("WX_OPEN_ID <", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdLessThanOrEqualTo(String value) {
            addCriterion("WX_OPEN_ID <=", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdLike(String value) {
            addCriterion("WX_OPEN_ID like", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdNotLike(String value) {
            addCriterion("WX_OPEN_ID not like", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdIn(List<String> values) {
            addCriterion("WX_OPEN_ID in", values, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdNotIn(List<String> values) {
            addCriterion("WX_OPEN_ID not in", values, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdBetween(String value1, String value2) {
            addCriterion("WX_OPEN_ID between", value1, value2, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdNotBetween(String value1, String value2) {
            addCriterion("WX_OPEN_ID not between", value1, value2, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxNickIsNull() {
            addCriterion("WX_NICK is null");
            return (Criteria) this;
        }

        public Criteria andWxNickIsNotNull() {
            addCriterion("WX_NICK is not null");
            return (Criteria) this;
        }

        public Criteria andWxNickEqualTo(String value) {
            addCriterion("WX_NICK =", value, "wxNick");
            return (Criteria) this;
        }

        public Criteria andWxNickNotEqualTo(String value) {
            addCriterion("WX_NICK <>", value, "wxNick");
            return (Criteria) this;
        }

        public Criteria andWxNickGreaterThan(String value) {
            addCriterion("WX_NICK >", value, "wxNick");
            return (Criteria) this;
        }

        public Criteria andWxNickGreaterThanOrEqualTo(String value) {
            addCriterion("WX_NICK >=", value, "wxNick");
            return (Criteria) this;
        }

        public Criteria andWxNickLessThan(String value) {
            addCriterion("WX_NICK <", value, "wxNick");
            return (Criteria) this;
        }

        public Criteria andWxNickLessThanOrEqualTo(String value) {
            addCriterion("WX_NICK <=", value, "wxNick");
            return (Criteria) this;
        }

        public Criteria andWxNickLike(String value) {
            addCriterion("WX_NICK like", value, "wxNick");
            return (Criteria) this;
        }

        public Criteria andWxNickNotLike(String value) {
            addCriterion("WX_NICK not like", value, "wxNick");
            return (Criteria) this;
        }

        public Criteria andWxNickIn(List<String> values) {
            addCriterion("WX_NICK in", values, "wxNick");
            return (Criteria) this;
        }

        public Criteria andWxNickNotIn(List<String> values) {
            addCriterion("WX_NICK not in", values, "wxNick");
            return (Criteria) this;
        }

        public Criteria andWxNickBetween(String value1, String value2) {
            addCriterion("WX_NICK between", value1, value2, "wxNick");
            return (Criteria) this;
        }

        public Criteria andWxNickNotBetween(String value1, String value2) {
            addCriterion("WX_NICK not between", value1, value2, "wxNick");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCodeIsNull() {
            addCriterion("MEMBER_LEVEL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCodeIsNotNull() {
            addCriterion("MEMBER_LEVEL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCodeEqualTo(String value) {
            addCriterion("MEMBER_LEVEL_CODE =", value, "memberLevelCode");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCodeNotEqualTo(String value) {
            addCriterion("MEMBER_LEVEL_CODE <>", value, "memberLevelCode");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCodeGreaterThan(String value) {
            addCriterion("MEMBER_LEVEL_CODE >", value, "memberLevelCode");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_LEVEL_CODE >=", value, "memberLevelCode");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCodeLessThan(String value) {
            addCriterion("MEMBER_LEVEL_CODE <", value, "memberLevelCode");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCodeLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_LEVEL_CODE <=", value, "memberLevelCode");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCodeLike(String value) {
            addCriterion("MEMBER_LEVEL_CODE like", value, "memberLevelCode");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCodeNotLike(String value) {
            addCriterion("MEMBER_LEVEL_CODE not like", value, "memberLevelCode");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCodeIn(List<String> values) {
            addCriterion("MEMBER_LEVEL_CODE in", values, "memberLevelCode");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCodeNotIn(List<String> values) {
            addCriterion("MEMBER_LEVEL_CODE not in", values, "memberLevelCode");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCodeBetween(String value1, String value2) {
            addCriterion("MEMBER_LEVEL_CODE between", value1, value2, "memberLevelCode");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCodeNotBetween(String value1, String value2) {
            addCriterion("MEMBER_LEVEL_CODE not between", value1, value2, "memberLevelCode");
            return (Criteria) this;
        }

        public Criteria andParentUserNameIsNull() {
            addCriterion("PARENT_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andParentUserNameIsNotNull() {
            addCriterion("PARENT_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andParentUserNameEqualTo(String value) {
            addCriterion("PARENT_USER_NAME =", value, "parentUserName");
            return (Criteria) this;
        }

        public Criteria andParentUserNameNotEqualTo(String value) {
            addCriterion("PARENT_USER_NAME <>", value, "parentUserName");
            return (Criteria) this;
        }

        public Criteria andParentUserNameGreaterThan(String value) {
            addCriterion("PARENT_USER_NAME >", value, "parentUserName");
            return (Criteria) this;
        }

        public Criteria andParentUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_USER_NAME >=", value, "parentUserName");
            return (Criteria) this;
        }

        public Criteria andParentUserNameLessThan(String value) {
            addCriterion("PARENT_USER_NAME <", value, "parentUserName");
            return (Criteria) this;
        }

        public Criteria andParentUserNameLessThanOrEqualTo(String value) {
            addCriterion("PARENT_USER_NAME <=", value, "parentUserName");
            return (Criteria) this;
        }

        public Criteria andParentUserNameLike(String value) {
            addCriterion("PARENT_USER_NAME like", value, "parentUserName");
            return (Criteria) this;
        }

        public Criteria andParentUserNameNotLike(String value) {
            addCriterion("PARENT_USER_NAME not like", value, "parentUserName");
            return (Criteria) this;
        }

        public Criteria andParentUserNameIn(List<String> values) {
            addCriterion("PARENT_USER_NAME in", values, "parentUserName");
            return (Criteria) this;
        }

        public Criteria andParentUserNameNotIn(List<String> values) {
            addCriterion("PARENT_USER_NAME not in", values, "parentUserName");
            return (Criteria) this;
        }

        public Criteria andParentUserNameBetween(String value1, String value2) {
            addCriterion("PARENT_USER_NAME between", value1, value2, "parentUserName");
            return (Criteria) this;
        }

        public Criteria andParentUserNameNotBetween(String value1, String value2) {
            addCriterion("PARENT_USER_NAME not between", value1, value2, "parentUserName");
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

        public Criteria andDeleteLableIsNull() {
            addCriterion("DELETE_LABLE is null");
            return (Criteria) this;
        }

        public Criteria andDeleteLableIsNotNull() {
            addCriterion("DELETE_LABLE is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteLableEqualTo(String value) {
            addCriterion("DELETE_LABLE =", value, "deleteLable");
            return (Criteria) this;
        }

        public Criteria andDeleteLableNotEqualTo(String value) {
            addCriterion("DELETE_LABLE <>", value, "deleteLable");
            return (Criteria) this;
        }

        public Criteria andDeleteLableGreaterThan(String value) {
            addCriterion("DELETE_LABLE >", value, "deleteLable");
            return (Criteria) this;
        }

        public Criteria andDeleteLableGreaterThanOrEqualTo(String value) {
            addCriterion("DELETE_LABLE >=", value, "deleteLable");
            return (Criteria) this;
        }

        public Criteria andDeleteLableLessThan(String value) {
            addCriterion("DELETE_LABLE <", value, "deleteLable");
            return (Criteria) this;
        }

        public Criteria andDeleteLableLessThanOrEqualTo(String value) {
            addCriterion("DELETE_LABLE <=", value, "deleteLable");
            return (Criteria) this;
        }

        public Criteria andDeleteLableLike(String value) {
            addCriterion("DELETE_LABLE like", value, "deleteLable");
            return (Criteria) this;
        }

        public Criteria andDeleteLableNotLike(String value) {
            addCriterion("DELETE_LABLE not like", value, "deleteLable");
            return (Criteria) this;
        }

        public Criteria andDeleteLableIn(List<String> values) {
            addCriterion("DELETE_LABLE in", values, "deleteLable");
            return (Criteria) this;
        }

        public Criteria andDeleteLableNotIn(List<String> values) {
            addCriterion("DELETE_LABLE not in", values, "deleteLable");
            return (Criteria) this;
        }

        public Criteria andDeleteLableBetween(String value1, String value2) {
            addCriterion("DELETE_LABLE between", value1, value2, "deleteLable");
            return (Criteria) this;
        }

        public Criteria andDeleteLableNotBetween(String value1, String value2) {
            addCriterion("DELETE_LABLE not between", value1, value2, "deleteLable");
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