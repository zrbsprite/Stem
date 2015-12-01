package com.penzias.entity;

import java.util.ArrayList;
import java.util.List;

public class SmRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmRoleExample() {
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

        public Criteria andRoleidIsNull() {
            addCriterion("RoleID is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("RoleID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(Integer value) {
            addCriterion("RoleID =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(Integer value) {
            addCriterion("RoleID <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(Integer value) {
            addCriterion("RoleID >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RoleID >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(Integer value) {
            addCriterion("RoleID <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(Integer value) {
            addCriterion("RoleID <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<Integer> values) {
            addCriterion("RoleID in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<Integer> values) {
            addCriterion("RoleID not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(Integer value1, Integer value2) {
            addCriterion("RoleID between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("RoleID not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRolenameIsNull() {
            addCriterion("RoleName is null");
            return (Criteria) this;
        }

        public Criteria andRolenameIsNotNull() {
            addCriterion("RoleName is not null");
            return (Criteria) this;
        }

        public Criteria andRolenameEqualTo(String value) {
            addCriterion("RoleName =", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotEqualTo(String value) {
            addCriterion("RoleName <>", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThan(String value) {
            addCriterion("RoleName >", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThanOrEqualTo(String value) {
            addCriterion("RoleName >=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThan(String value) {
            addCriterion("RoleName <", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThanOrEqualTo(String value) {
            addCriterion("RoleName <=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLike(String value) {
            addCriterion("RoleName like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotLike(String value) {
            addCriterion("RoleName not like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameIn(List<String> values) {
            addCriterion("RoleName in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotIn(List<String> values) {
            addCriterion("RoleName not in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameBetween(String value1, String value2) {
            addCriterion("RoleName between", value1, value2, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotBetween(String value1, String value2) {
            addCriterion("RoleName not between", value1, value2, "rolename");
            return (Criteria) this;
        }

        public Criteria andRoledescIsNull() {
            addCriterion("RoleDesc is null");
            return (Criteria) this;
        }

        public Criteria andRoledescIsNotNull() {
            addCriterion("RoleDesc is not null");
            return (Criteria) this;
        }

        public Criteria andRoledescEqualTo(String value) {
            addCriterion("RoleDesc =", value, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescNotEqualTo(String value) {
            addCriterion("RoleDesc <>", value, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescGreaterThan(String value) {
            addCriterion("RoleDesc >", value, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescGreaterThanOrEqualTo(String value) {
            addCriterion("RoleDesc >=", value, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescLessThan(String value) {
            addCriterion("RoleDesc <", value, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescLessThanOrEqualTo(String value) {
            addCriterion("RoleDesc <=", value, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescLike(String value) {
            addCriterion("RoleDesc like", value, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescNotLike(String value) {
            addCriterion("RoleDesc not like", value, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescIn(List<String> values) {
            addCriterion("RoleDesc in", values, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescNotIn(List<String> values) {
            addCriterion("RoleDesc not in", values, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescBetween(String value1, String value2) {
            addCriterion("RoleDesc between", value1, value2, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescNotBetween(String value1, String value2) {
            addCriterion("RoleDesc not between", value1, value2, "roledesc");
            return (Criteria) this;
        }

        public Criteria andPowerlevelIsNull() {
            addCriterion("PowerLevel is null");
            return (Criteria) this;
        }

        public Criteria andPowerlevelIsNotNull() {
            addCriterion("PowerLevel is not null");
            return (Criteria) this;
        }

        public Criteria andPowerlevelEqualTo(String value) {
            addCriterion("PowerLevel =", value, "powerlevel");
            return (Criteria) this;
        }

        public Criteria andPowerlevelNotEqualTo(String value) {
            addCriterion("PowerLevel <>", value, "powerlevel");
            return (Criteria) this;
        }

        public Criteria andPowerlevelGreaterThan(String value) {
            addCriterion("PowerLevel >", value, "powerlevel");
            return (Criteria) this;
        }

        public Criteria andPowerlevelGreaterThanOrEqualTo(String value) {
            addCriterion("PowerLevel >=", value, "powerlevel");
            return (Criteria) this;
        }

        public Criteria andPowerlevelLessThan(String value) {
            addCriterion("PowerLevel <", value, "powerlevel");
            return (Criteria) this;
        }

        public Criteria andPowerlevelLessThanOrEqualTo(String value) {
            addCriterion("PowerLevel <=", value, "powerlevel");
            return (Criteria) this;
        }

        public Criteria andPowerlevelLike(String value) {
            addCriterion("PowerLevel like", value, "powerlevel");
            return (Criteria) this;
        }

        public Criteria andPowerlevelNotLike(String value) {
            addCriterion("PowerLevel not like", value, "powerlevel");
            return (Criteria) this;
        }

        public Criteria andPowerlevelIn(List<String> values) {
            addCriterion("PowerLevel in", values, "powerlevel");
            return (Criteria) this;
        }

        public Criteria andPowerlevelNotIn(List<String> values) {
            addCriterion("PowerLevel not in", values, "powerlevel");
            return (Criteria) this;
        }

        public Criteria andPowerlevelBetween(String value1, String value2) {
            addCriterion("PowerLevel between", value1, value2, "powerlevel");
            return (Criteria) this;
        }

        public Criteria andPowerlevelNotBetween(String value1, String value2) {
            addCriterion("PowerLevel not between", value1, value2, "powerlevel");
            return (Criteria) this;
        }

        public Criteria andPowersqlIsNull() {
            addCriterion("PowerSQL is null");
            return (Criteria) this;
        }

        public Criteria andPowersqlIsNotNull() {
            addCriterion("PowerSQL is not null");
            return (Criteria) this;
        }

        public Criteria andPowersqlEqualTo(String value) {
            addCriterion("PowerSQL =", value, "powersql");
            return (Criteria) this;
        }

        public Criteria andPowersqlNotEqualTo(String value) {
            addCriterion("PowerSQL <>", value, "powersql");
            return (Criteria) this;
        }

        public Criteria andPowersqlGreaterThan(String value) {
            addCriterion("PowerSQL >", value, "powersql");
            return (Criteria) this;
        }

        public Criteria andPowersqlGreaterThanOrEqualTo(String value) {
            addCriterion("PowerSQL >=", value, "powersql");
            return (Criteria) this;
        }

        public Criteria andPowersqlLessThan(String value) {
            addCriterion("PowerSQL <", value, "powersql");
            return (Criteria) this;
        }

        public Criteria andPowersqlLessThanOrEqualTo(String value) {
            addCriterion("PowerSQL <=", value, "powersql");
            return (Criteria) this;
        }

        public Criteria andPowersqlLike(String value) {
            addCriterion("PowerSQL like", value, "powersql");
            return (Criteria) this;
        }

        public Criteria andPowersqlNotLike(String value) {
            addCriterion("PowerSQL not like", value, "powersql");
            return (Criteria) this;
        }

        public Criteria andPowersqlIn(List<String> values) {
            addCriterion("PowerSQL in", values, "powersql");
            return (Criteria) this;
        }

        public Criteria andPowersqlNotIn(List<String> values) {
            addCriterion("PowerSQL not in", values, "powersql");
            return (Criteria) this;
        }

        public Criteria andPowersqlBetween(String value1, String value2) {
            addCriterion("PowerSQL between", value1, value2, "powersql");
            return (Criteria) this;
        }

        public Criteria andPowersqlNotBetween(String value1, String value2) {
            addCriterion("PowerSQL not between", value1, value2, "powersql");
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