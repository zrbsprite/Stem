package com.penzias.entity;

import java.util.ArrayList;
import java.util.List;

public class SmModularExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmModularExample() {
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

        public Criteria andModularidIsNull() {
            addCriterion("ModularID is null");
            return (Criteria) this;
        }

        public Criteria andModularidIsNotNull() {
            addCriterion("ModularID is not null");
            return (Criteria) this;
        }

        public Criteria andModularidEqualTo(Integer value) {
            addCriterion("ModularID =", value, "modularid");
            return (Criteria) this;
        }

        public Criteria andModularidNotEqualTo(Integer value) {
            addCriterion("ModularID <>", value, "modularid");
            return (Criteria) this;
        }

        public Criteria andModularidGreaterThan(Integer value) {
            addCriterion("ModularID >", value, "modularid");
            return (Criteria) this;
        }

        public Criteria andModularidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ModularID >=", value, "modularid");
            return (Criteria) this;
        }

        public Criteria andModularidLessThan(Integer value) {
            addCriterion("ModularID <", value, "modularid");
            return (Criteria) this;
        }

        public Criteria andModularidLessThanOrEqualTo(Integer value) {
            addCriterion("ModularID <=", value, "modularid");
            return (Criteria) this;
        }

        public Criteria andModularidIn(List<Integer> values) {
            addCriterion("ModularID in", values, "modularid");
            return (Criteria) this;
        }

        public Criteria andModularidNotIn(List<Integer> values) {
            addCriterion("ModularID not in", values, "modularid");
            return (Criteria) this;
        }

        public Criteria andModularidBetween(Integer value1, Integer value2) {
            addCriterion("ModularID between", value1, value2, "modularid");
            return (Criteria) this;
        }

        public Criteria andModularidNotBetween(Integer value1, Integer value2) {
            addCriterion("ModularID not between", value1, value2, "modularid");
            return (Criteria) this;
        }

        public Criteria andParentmodularidIsNull() {
            addCriterion("ParentModularID is null");
            return (Criteria) this;
        }

        public Criteria andParentmodularidIsNotNull() {
            addCriterion("ParentModularID is not null");
            return (Criteria) this;
        }

        public Criteria andParentmodularidEqualTo(Integer value) {
            addCriterion("ParentModularID =", value, "parentmodularid");
            return (Criteria) this;
        }

        public Criteria andParentmodularidNotEqualTo(Integer value) {
            addCriterion("ParentModularID <>", value, "parentmodularid");
            return (Criteria) this;
        }

        public Criteria andParentmodularidGreaterThan(Integer value) {
            addCriterion("ParentModularID >", value, "parentmodularid");
            return (Criteria) this;
        }

        public Criteria andParentmodularidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParentModularID >=", value, "parentmodularid");
            return (Criteria) this;
        }

        public Criteria andParentmodularidLessThan(Integer value) {
            addCriterion("ParentModularID <", value, "parentmodularid");
            return (Criteria) this;
        }

        public Criteria andParentmodularidLessThanOrEqualTo(Integer value) {
            addCriterion("ParentModularID <=", value, "parentmodularid");
            return (Criteria) this;
        }

        public Criteria andParentmodularidIn(List<Integer> values) {
            addCriterion("ParentModularID in", values, "parentmodularid");
            return (Criteria) this;
        }

        public Criteria andParentmodularidNotIn(List<Integer> values) {
            addCriterion("ParentModularID not in", values, "parentmodularid");
            return (Criteria) this;
        }

        public Criteria andParentmodularidBetween(Integer value1, Integer value2) {
            addCriterion("ParentModularID between", value1, value2, "parentmodularid");
            return (Criteria) this;
        }

        public Criteria andParentmodularidNotBetween(Integer value1, Integer value2) {
            addCriterion("ParentModularID not between", value1, value2, "parentmodularid");
            return (Criteria) this;
        }

        public Criteria andModularnameIsNull() {
            addCriterion("ModularName is null");
            return (Criteria) this;
        }

        public Criteria andModularnameIsNotNull() {
            addCriterion("ModularName is not null");
            return (Criteria) this;
        }

        public Criteria andModularnameEqualTo(String value) {
            addCriterion("ModularName =", value, "modularname");
            return (Criteria) this;
        }

        public Criteria andModularnameNotEqualTo(String value) {
            addCriterion("ModularName <>", value, "modularname");
            return (Criteria) this;
        }

        public Criteria andModularnameGreaterThan(String value) {
            addCriterion("ModularName >", value, "modularname");
            return (Criteria) this;
        }

        public Criteria andModularnameGreaterThanOrEqualTo(String value) {
            addCriterion("ModularName >=", value, "modularname");
            return (Criteria) this;
        }

        public Criteria andModularnameLessThan(String value) {
            addCriterion("ModularName <", value, "modularname");
            return (Criteria) this;
        }

        public Criteria andModularnameLessThanOrEqualTo(String value) {
            addCriterion("ModularName <=", value, "modularname");
            return (Criteria) this;
        }

        public Criteria andModularnameLike(String value) {
            addCriterion("ModularName like", value, "modularname");
            return (Criteria) this;
        }

        public Criteria andModularnameNotLike(String value) {
            addCriterion("ModularName not like", value, "modularname");
            return (Criteria) this;
        }

        public Criteria andModularnameIn(List<String> values) {
            addCriterion("ModularName in", values, "modularname");
            return (Criteria) this;
        }

        public Criteria andModularnameNotIn(List<String> values) {
            addCriterion("ModularName not in", values, "modularname");
            return (Criteria) this;
        }

        public Criteria andModularnameBetween(String value1, String value2) {
            addCriterion("ModularName between", value1, value2, "modularname");
            return (Criteria) this;
        }

        public Criteria andModularnameNotBetween(String value1, String value2) {
            addCriterion("ModularName not between", value1, value2, "modularname");
            return (Criteria) this;
        }

        public Criteria andUriIsNull() {
            addCriterion("Uri is null");
            return (Criteria) this;
        }

        public Criteria andUriIsNotNull() {
            addCriterion("Uri is not null");
            return (Criteria) this;
        }

        public Criteria andUriEqualTo(String value) {
            addCriterion("Uri =", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotEqualTo(String value) {
            addCriterion("Uri <>", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriGreaterThan(String value) {
            addCriterion("Uri >", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriGreaterThanOrEqualTo(String value) {
            addCriterion("Uri >=", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLessThan(String value) {
            addCriterion("Uri <", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLessThanOrEqualTo(String value) {
            addCriterion("Uri <=", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLike(String value) {
            addCriterion("Uri like", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotLike(String value) {
            addCriterion("Uri not like", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriIn(List<String> values) {
            addCriterion("Uri in", values, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotIn(List<String> values) {
            addCriterion("Uri not in", values, "uri");
            return (Criteria) this;
        }

        public Criteria andUriBetween(String value1, String value2) {
            addCriterion("Uri between", value1, value2, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotBetween(String value1, String value2) {
            addCriterion("Uri not between", value1, value2, "uri");
            return (Criteria) this;
        }

        public Criteria andModulardescIsNull() {
            addCriterion("ModularDesc is null");
            return (Criteria) this;
        }

        public Criteria andModulardescIsNotNull() {
            addCriterion("ModularDesc is not null");
            return (Criteria) this;
        }

        public Criteria andModulardescEqualTo(String value) {
            addCriterion("ModularDesc =", value, "modulardesc");
            return (Criteria) this;
        }

        public Criteria andModulardescNotEqualTo(String value) {
            addCriterion("ModularDesc <>", value, "modulardesc");
            return (Criteria) this;
        }

        public Criteria andModulardescGreaterThan(String value) {
            addCriterion("ModularDesc >", value, "modulardesc");
            return (Criteria) this;
        }

        public Criteria andModulardescGreaterThanOrEqualTo(String value) {
            addCriterion("ModularDesc >=", value, "modulardesc");
            return (Criteria) this;
        }

        public Criteria andModulardescLessThan(String value) {
            addCriterion("ModularDesc <", value, "modulardesc");
            return (Criteria) this;
        }

        public Criteria andModulardescLessThanOrEqualTo(String value) {
            addCriterion("ModularDesc <=", value, "modulardesc");
            return (Criteria) this;
        }

        public Criteria andModulardescLike(String value) {
            addCriterion("ModularDesc like", value, "modulardesc");
            return (Criteria) this;
        }

        public Criteria andModulardescNotLike(String value) {
            addCriterion("ModularDesc not like", value, "modulardesc");
            return (Criteria) this;
        }

        public Criteria andModulardescIn(List<String> values) {
            addCriterion("ModularDesc in", values, "modulardesc");
            return (Criteria) this;
        }

        public Criteria andModulardescNotIn(List<String> values) {
            addCriterion("ModularDesc not in", values, "modulardesc");
            return (Criteria) this;
        }

        public Criteria andModulardescBetween(String value1, String value2) {
            addCriterion("ModularDesc between", value1, value2, "modulardesc");
            return (Criteria) this;
        }

        public Criteria andModulardescNotBetween(String value1, String value2) {
            addCriterion("ModularDesc not between", value1, value2, "modulardesc");
            return (Criteria) this;
        }

        public Criteria andDisplayorderIsNull() {
            addCriterion("DisplayOrder is null");
            return (Criteria) this;
        }

        public Criteria andDisplayorderIsNotNull() {
            addCriterion("DisplayOrder is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayorderEqualTo(Integer value) {
            addCriterion("DisplayOrder =", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderNotEqualTo(Integer value) {
            addCriterion("DisplayOrder <>", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderGreaterThan(Integer value) {
            addCriterion("DisplayOrder >", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("DisplayOrder >=", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderLessThan(Integer value) {
            addCriterion("DisplayOrder <", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderLessThanOrEqualTo(Integer value) {
            addCriterion("DisplayOrder <=", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderIn(List<Integer> values) {
            addCriterion("DisplayOrder in", values, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderNotIn(List<Integer> values) {
            addCriterion("DisplayOrder not in", values, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderBetween(Integer value1, Integer value2) {
            addCriterion("DisplayOrder between", value1, value2, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderNotBetween(Integer value1, Integer value2) {
            addCriterion("DisplayOrder not between", value1, value2, "displayorder");
            return (Criteria) this;
        }

        public Criteria andCrudIsNull() {
            addCriterion("Crud is null");
            return (Criteria) this;
        }

        public Criteria andCrudIsNotNull() {
            addCriterion("Crud is not null");
            return (Criteria) this;
        }

        public Criteria andCrudEqualTo(String value) {
            addCriterion("Crud =", value, "crud");
            return (Criteria) this;
        }

        public Criteria andCrudNotEqualTo(String value) {
            addCriterion("Crud <>", value, "crud");
            return (Criteria) this;
        }

        public Criteria andCrudGreaterThan(String value) {
            addCriterion("Crud >", value, "crud");
            return (Criteria) this;
        }

        public Criteria andCrudGreaterThanOrEqualTo(String value) {
            addCriterion("Crud >=", value, "crud");
            return (Criteria) this;
        }

        public Criteria andCrudLessThan(String value) {
            addCriterion("Crud <", value, "crud");
            return (Criteria) this;
        }

        public Criteria andCrudLessThanOrEqualTo(String value) {
            addCriterion("Crud <=", value, "crud");
            return (Criteria) this;
        }

        public Criteria andCrudLike(String value) {
            addCriterion("Crud like", value, "crud");
            return (Criteria) this;
        }

        public Criteria andCrudNotLike(String value) {
            addCriterion("Crud not like", value, "crud");
            return (Criteria) this;
        }

        public Criteria andCrudIn(List<String> values) {
            addCriterion("Crud in", values, "crud");
            return (Criteria) this;
        }

        public Criteria andCrudNotIn(List<String> values) {
            addCriterion("Crud not in", values, "crud");
            return (Criteria) this;
        }

        public Criteria andCrudBetween(String value1, String value2) {
            addCriterion("Crud between", value1, value2, "crud");
            return (Criteria) this;
        }

        public Criteria andCrudNotBetween(String value1, String value2) {
            addCriterion("Crud not between", value1, value2, "crud");
            return (Criteria) this;
        }

        public Criteria andHomemodularIsNull() {
            addCriterion("HomeModular is null");
            return (Criteria) this;
        }

        public Criteria andHomemodularIsNotNull() {
            addCriterion("HomeModular is not null");
            return (Criteria) this;
        }

        public Criteria andHomemodularEqualTo(String value) {
            addCriterion("HomeModular =", value, "homemodular");
            return (Criteria) this;
        }

        public Criteria andHomemodularNotEqualTo(String value) {
            addCriterion("HomeModular <>", value, "homemodular");
            return (Criteria) this;
        }

        public Criteria andHomemodularGreaterThan(String value) {
            addCriterion("HomeModular >", value, "homemodular");
            return (Criteria) this;
        }

        public Criteria andHomemodularGreaterThanOrEqualTo(String value) {
            addCriterion("HomeModular >=", value, "homemodular");
            return (Criteria) this;
        }

        public Criteria andHomemodularLessThan(String value) {
            addCriterion("HomeModular <", value, "homemodular");
            return (Criteria) this;
        }

        public Criteria andHomemodularLessThanOrEqualTo(String value) {
            addCriterion("HomeModular <=", value, "homemodular");
            return (Criteria) this;
        }

        public Criteria andHomemodularLike(String value) {
            addCriterion("HomeModular like", value, "homemodular");
            return (Criteria) this;
        }

        public Criteria andHomemodularNotLike(String value) {
            addCriterion("HomeModular not like", value, "homemodular");
            return (Criteria) this;
        }

        public Criteria andHomemodularIn(List<String> values) {
            addCriterion("HomeModular in", values, "homemodular");
            return (Criteria) this;
        }

        public Criteria andHomemodularNotIn(List<String> values) {
            addCriterion("HomeModular not in", values, "homemodular");
            return (Criteria) this;
        }

        public Criteria andHomemodularBetween(String value1, String value2) {
            addCriterion("HomeModular between", value1, value2, "homemodular");
            return (Criteria) this;
        }

        public Criteria andHomemodularNotBetween(String value1, String value2) {
            addCriterion("HomeModular not between", value1, value2, "homemodular");
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