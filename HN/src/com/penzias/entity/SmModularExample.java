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

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andModularNameIsNull() {
            addCriterion("modular_name is null");
            return (Criteria) this;
        }

        public Criteria andModularNameIsNotNull() {
            addCriterion("modular_name is not null");
            return (Criteria) this;
        }

        public Criteria andModularNameEqualTo(String value) {
            addCriterion("modular_name =", value, "modularName");
            return (Criteria) this;
        }

        public Criteria andModularNameNotEqualTo(String value) {
            addCriterion("modular_name <>", value, "modularName");
            return (Criteria) this;
        }

        public Criteria andModularNameGreaterThan(String value) {
            addCriterion("modular_name >", value, "modularName");
            return (Criteria) this;
        }

        public Criteria andModularNameGreaterThanOrEqualTo(String value) {
            addCriterion("modular_name >=", value, "modularName");
            return (Criteria) this;
        }

        public Criteria andModularNameLessThan(String value) {
            addCriterion("modular_name <", value, "modularName");
            return (Criteria) this;
        }

        public Criteria andModularNameLessThanOrEqualTo(String value) {
            addCriterion("modular_name <=", value, "modularName");
            return (Criteria) this;
        }

        public Criteria andModularNameLike(String value) {
            addCriterion("modular_name like", value, "modularName");
            return (Criteria) this;
        }

        public Criteria andModularNameNotLike(String value) {
            addCriterion("modular_name not like", value, "modularName");
            return (Criteria) this;
        }

        public Criteria andModularNameIn(List<String> values) {
            addCriterion("modular_name in", values, "modularName");
            return (Criteria) this;
        }

        public Criteria andModularNameNotIn(List<String> values) {
            addCriterion("modular_name not in", values, "modularName");
            return (Criteria) this;
        }

        public Criteria andModularNameBetween(String value1, String value2) {
            addCriterion("modular_name between", value1, value2, "modularName");
            return (Criteria) this;
        }

        public Criteria andModularNameNotBetween(String value1, String value2) {
            addCriterion("modular_name not between", value1, value2, "modularName");
            return (Criteria) this;
        }

        public Criteria andModularUrlIsNull() {
            addCriterion("modular_url is null");
            return (Criteria) this;
        }

        public Criteria andModularUrlIsNotNull() {
            addCriterion("modular_url is not null");
            return (Criteria) this;
        }

        public Criteria andModularUrlEqualTo(String value) {
            addCriterion("modular_url =", value, "modularUrl");
            return (Criteria) this;
        }

        public Criteria andModularUrlNotEqualTo(String value) {
            addCriterion("modular_url <>", value, "modularUrl");
            return (Criteria) this;
        }

        public Criteria andModularUrlGreaterThan(String value) {
            addCriterion("modular_url >", value, "modularUrl");
            return (Criteria) this;
        }

        public Criteria andModularUrlGreaterThanOrEqualTo(String value) {
            addCriterion("modular_url >=", value, "modularUrl");
            return (Criteria) this;
        }

        public Criteria andModularUrlLessThan(String value) {
            addCriterion("modular_url <", value, "modularUrl");
            return (Criteria) this;
        }

        public Criteria andModularUrlLessThanOrEqualTo(String value) {
            addCriterion("modular_url <=", value, "modularUrl");
            return (Criteria) this;
        }

        public Criteria andModularUrlLike(String value) {
            addCriterion("modular_url like", value, "modularUrl");
            return (Criteria) this;
        }

        public Criteria andModularUrlNotLike(String value) {
            addCriterion("modular_url not like", value, "modularUrl");
            return (Criteria) this;
        }

        public Criteria andModularUrlIn(List<String> values) {
            addCriterion("modular_url in", values, "modularUrl");
            return (Criteria) this;
        }

        public Criteria andModularUrlNotIn(List<String> values) {
            addCriterion("modular_url not in", values, "modularUrl");
            return (Criteria) this;
        }

        public Criteria andModularUrlBetween(String value1, String value2) {
            addCriterion("modular_url between", value1, value2, "modularUrl");
            return (Criteria) this;
        }

        public Criteria andModularUrlNotBetween(String value1, String value2) {
            addCriterion("modular_url not between", value1, value2, "modularUrl");
            return (Criteria) this;
        }

        public Criteria andModularDescIsNull() {
            addCriterion("modular_desc is null");
            return (Criteria) this;
        }

        public Criteria andModularDescIsNotNull() {
            addCriterion("modular_desc is not null");
            return (Criteria) this;
        }

        public Criteria andModularDescEqualTo(String value) {
            addCriterion("modular_desc =", value, "modularDesc");
            return (Criteria) this;
        }

        public Criteria andModularDescNotEqualTo(String value) {
            addCriterion("modular_desc <>", value, "modularDesc");
            return (Criteria) this;
        }

        public Criteria andModularDescGreaterThan(String value) {
            addCriterion("modular_desc >", value, "modularDesc");
            return (Criteria) this;
        }

        public Criteria andModularDescGreaterThanOrEqualTo(String value) {
            addCriterion("modular_desc >=", value, "modularDesc");
            return (Criteria) this;
        }

        public Criteria andModularDescLessThan(String value) {
            addCriterion("modular_desc <", value, "modularDesc");
            return (Criteria) this;
        }

        public Criteria andModularDescLessThanOrEqualTo(String value) {
            addCriterion("modular_desc <=", value, "modularDesc");
            return (Criteria) this;
        }

        public Criteria andModularDescLike(String value) {
            addCriterion("modular_desc like", value, "modularDesc");
            return (Criteria) this;
        }

        public Criteria andModularDescNotLike(String value) {
            addCriterion("modular_desc not like", value, "modularDesc");
            return (Criteria) this;
        }

        public Criteria andModularDescIn(List<String> values) {
            addCriterion("modular_desc in", values, "modularDesc");
            return (Criteria) this;
        }

        public Criteria andModularDescNotIn(List<String> values) {
            addCriterion("modular_desc not in", values, "modularDesc");
            return (Criteria) this;
        }

        public Criteria andModularDescBetween(String value1, String value2) {
            addCriterion("modular_desc between", value1, value2, "modularDesc");
            return (Criteria) this;
        }

        public Criteria andModularDescNotBetween(String value1, String value2) {
            addCriterion("modular_desc not between", value1, value2, "modularDesc");
            return (Criteria) this;
        }

        public Criteria andModularOrderIsNull() {
            addCriterion("modular_order is null");
            return (Criteria) this;
        }

        public Criteria andModularOrderIsNotNull() {
            addCriterion("modular_order is not null");
            return (Criteria) this;
        }

        public Criteria andModularOrderEqualTo(Integer value) {
            addCriterion("modular_order =", value, "modularOrder");
            return (Criteria) this;
        }

        public Criteria andModularOrderNotEqualTo(Integer value) {
            addCriterion("modular_order <>", value, "modularOrder");
            return (Criteria) this;
        }

        public Criteria andModularOrderGreaterThan(Integer value) {
            addCriterion("modular_order >", value, "modularOrder");
            return (Criteria) this;
        }

        public Criteria andModularOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("modular_order >=", value, "modularOrder");
            return (Criteria) this;
        }

        public Criteria andModularOrderLessThan(Integer value) {
            addCriterion("modular_order <", value, "modularOrder");
            return (Criteria) this;
        }

        public Criteria andModularOrderLessThanOrEqualTo(Integer value) {
            addCriterion("modular_order <=", value, "modularOrder");
            return (Criteria) this;
        }

        public Criteria andModularOrderIn(List<Integer> values) {
            addCriterion("modular_order in", values, "modularOrder");
            return (Criteria) this;
        }

        public Criteria andModularOrderNotIn(List<Integer> values) {
            addCriterion("modular_order not in", values, "modularOrder");
            return (Criteria) this;
        }

        public Criteria andModularOrderBetween(Integer value1, Integer value2) {
            addCriterion("modular_order between", value1, value2, "modularOrder");
            return (Criteria) this;
        }

        public Criteria andModularOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("modular_order not between", value1, value2, "modularOrder");
            return (Criteria) this;
        }

        public Criteria andModularStyleIsNull() {
            addCriterion("modular_style is null");
            return (Criteria) this;
        }

        public Criteria andModularStyleIsNotNull() {
            addCriterion("modular_style is not null");
            return (Criteria) this;
        }

        public Criteria andModularStyleEqualTo(String value) {
            addCriterion("modular_style =", value, "modularStyle");
            return (Criteria) this;
        }

        public Criteria andModularStyleNotEqualTo(String value) {
            addCriterion("modular_style <>", value, "modularStyle");
            return (Criteria) this;
        }

        public Criteria andModularStyleGreaterThan(String value) {
            addCriterion("modular_style >", value, "modularStyle");
            return (Criteria) this;
        }

        public Criteria andModularStyleGreaterThanOrEqualTo(String value) {
            addCriterion("modular_style >=", value, "modularStyle");
            return (Criteria) this;
        }

        public Criteria andModularStyleLessThan(String value) {
            addCriterion("modular_style <", value, "modularStyle");
            return (Criteria) this;
        }

        public Criteria andModularStyleLessThanOrEqualTo(String value) {
            addCriterion("modular_style <=", value, "modularStyle");
            return (Criteria) this;
        }

        public Criteria andModularStyleLike(String value) {
            addCriterion("modular_style like", value, "modularStyle");
            return (Criteria) this;
        }

        public Criteria andModularStyleNotLike(String value) {
            addCriterion("modular_style not like", value, "modularStyle");
            return (Criteria) this;
        }

        public Criteria andModularStyleIn(List<String> values) {
            addCriterion("modular_style in", values, "modularStyle");
            return (Criteria) this;
        }

        public Criteria andModularStyleNotIn(List<String> values) {
            addCriterion("modular_style not in", values, "modularStyle");
            return (Criteria) this;
        }

        public Criteria andModularStyleBetween(String value1, String value2) {
            addCriterion("modular_style between", value1, value2, "modularStyle");
            return (Criteria) this;
        }

        public Criteria andModularStyleNotBetween(String value1, String value2) {
            addCriterion("modular_style not between", value1, value2, "modularStyle");
            return (Criteria) this;
        }

        public Criteria andModularShowIsNull() {
            addCriterion("modular_show is null");
            return (Criteria) this;
        }

        public Criteria andModularShowIsNotNull() {
            addCriterion("modular_show is not null");
            return (Criteria) this;
        }

        public Criteria andModularShowEqualTo(String value) {
            addCriterion("modular_show =", value, "modularShow");
            return (Criteria) this;
        }

        public Criteria andModularShowNotEqualTo(String value) {
            addCriterion("modular_show <>", value, "modularShow");
            return (Criteria) this;
        }

        public Criteria andModularShowGreaterThan(String value) {
            addCriterion("modular_show >", value, "modularShow");
            return (Criteria) this;
        }

        public Criteria andModularShowGreaterThanOrEqualTo(String value) {
            addCriterion("modular_show >=", value, "modularShow");
            return (Criteria) this;
        }

        public Criteria andModularShowLessThan(String value) {
            addCriterion("modular_show <", value, "modularShow");
            return (Criteria) this;
        }

        public Criteria andModularShowLessThanOrEqualTo(String value) {
            addCriterion("modular_show <=", value, "modularShow");
            return (Criteria) this;
        }

        public Criteria andModularShowLike(String value) {
            addCriterion("modular_show like", value, "modularShow");
            return (Criteria) this;
        }

        public Criteria andModularShowNotLike(String value) {
            addCriterion("modular_show not like", value, "modularShow");
            return (Criteria) this;
        }

        public Criteria andModularShowIn(List<String> values) {
            addCriterion("modular_show in", values, "modularShow");
            return (Criteria) this;
        }

        public Criteria andModularShowNotIn(List<String> values) {
            addCriterion("modular_show not in", values, "modularShow");
            return (Criteria) this;
        }

        public Criteria andModularShowBetween(String value1, String value2) {
            addCriterion("modular_show between", value1, value2, "modularShow");
            return (Criteria) this;
        }

        public Criteria andModularShowNotBetween(String value1, String value2) {
            addCriterion("modular_show not between", value1, value2, "modularShow");
            return (Criteria) this;
        }

        public Criteria andModularFlagIsNull() {
            addCriterion("modular_flag is null");
            return (Criteria) this;
        }

        public Criteria andModularFlagIsNotNull() {
            addCriterion("modular_flag is not null");
            return (Criteria) this;
        }

        public Criteria andModularFlagEqualTo(String value) {
            addCriterion("modular_flag =", value, "modularFlag");
            return (Criteria) this;
        }

        public Criteria andModularFlagNotEqualTo(String value) {
            addCriterion("modular_flag <>", value, "modularFlag");
            return (Criteria) this;
        }

        public Criteria andModularFlagGreaterThan(String value) {
            addCriterion("modular_flag >", value, "modularFlag");
            return (Criteria) this;
        }

        public Criteria andModularFlagGreaterThanOrEqualTo(String value) {
            addCriterion("modular_flag >=", value, "modularFlag");
            return (Criteria) this;
        }

        public Criteria andModularFlagLessThan(String value) {
            addCriterion("modular_flag <", value, "modularFlag");
            return (Criteria) this;
        }

        public Criteria andModularFlagLessThanOrEqualTo(String value) {
            addCriterion("modular_flag <=", value, "modularFlag");
            return (Criteria) this;
        }

        public Criteria andModularFlagLike(String value) {
            addCriterion("modular_flag like", value, "modularFlag");
            return (Criteria) this;
        }

        public Criteria andModularFlagNotLike(String value) {
            addCriterion("modular_flag not like", value, "modularFlag");
            return (Criteria) this;
        }

        public Criteria andModularFlagIn(List<String> values) {
            addCriterion("modular_flag in", values, "modularFlag");
            return (Criteria) this;
        }

        public Criteria andModularFlagNotIn(List<String> values) {
            addCriterion("modular_flag not in", values, "modularFlag");
            return (Criteria) this;
        }

        public Criteria andModularFlagBetween(String value1, String value2) {
            addCriterion("modular_flag between", value1, value2, "modularFlag");
            return (Criteria) this;
        }

        public Criteria andModularFlagNotBetween(String value1, String value2) {
            addCriterion("modular_flag not between", value1, value2, "modularFlag");
            return (Criteria) this;
        }

        public Criteria andCrudIsNull() {
            addCriterion("crud is null");
            return (Criteria) this;
        }

        public Criteria andCrudIsNotNull() {
            addCriterion("crud is not null");
            return (Criteria) this;
        }

        public Criteria andCrudEqualTo(String value) {
            addCriterion("crud =", value, "crud");
            return (Criteria) this;
        }

        public Criteria andCrudNotEqualTo(String value) {
            addCriterion("crud <>", value, "crud");
            return (Criteria) this;
        }

        public Criteria andCrudGreaterThan(String value) {
            addCriterion("crud >", value, "crud");
            return (Criteria) this;
        }

        public Criteria andCrudGreaterThanOrEqualTo(String value) {
            addCriterion("crud >=", value, "crud");
            return (Criteria) this;
        }

        public Criteria andCrudLessThan(String value) {
            addCriterion("crud <", value, "crud");
            return (Criteria) this;
        }

        public Criteria andCrudLessThanOrEqualTo(String value) {
            addCriterion("crud <=", value, "crud");
            return (Criteria) this;
        }

        public Criteria andCrudLike(String value) {
            addCriterion("crud like", value, "crud");
            return (Criteria) this;
        }

        public Criteria andCrudNotLike(String value) {
            addCriterion("crud not like", value, "crud");
            return (Criteria) this;
        }

        public Criteria andCrudIn(List<String> values) {
            addCriterion("crud in", values, "crud");
            return (Criteria) this;
        }

        public Criteria andCrudNotIn(List<String> values) {
            addCriterion("crud not in", values, "crud");
            return (Criteria) this;
        }

        public Criteria andCrudBetween(String value1, String value2) {
            addCriterion("crud between", value1, value2, "crud");
            return (Criteria) this;
        }

        public Criteria andCrudNotBetween(String value1, String value2) {
            addCriterion("crud not between", value1, value2, "crud");
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