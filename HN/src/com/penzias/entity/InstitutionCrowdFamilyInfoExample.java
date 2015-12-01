package com.penzias.entity;

import java.util.ArrayList;
import java.util.List;

public class InstitutionCrowdFamilyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstitutionCrowdFamilyInfoExample() {
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

        public Criteria andFamilyidIsNull() {
            addCriterion("FamilyID is null");
            return (Criteria) this;
        }

        public Criteria andFamilyidIsNotNull() {
            addCriterion("FamilyID is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyidEqualTo(Integer value) {
            addCriterion("FamilyID =", value, "familyid");
            return (Criteria) this;
        }

        public Criteria andFamilyidNotEqualTo(Integer value) {
            addCriterion("FamilyID <>", value, "familyid");
            return (Criteria) this;
        }

        public Criteria andFamilyidGreaterThan(Integer value) {
            addCriterion("FamilyID >", value, "familyid");
            return (Criteria) this;
        }

        public Criteria andFamilyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FamilyID >=", value, "familyid");
            return (Criteria) this;
        }

        public Criteria andFamilyidLessThan(Integer value) {
            addCriterion("FamilyID <", value, "familyid");
            return (Criteria) this;
        }

        public Criteria andFamilyidLessThanOrEqualTo(Integer value) {
            addCriterion("FamilyID <=", value, "familyid");
            return (Criteria) this;
        }

        public Criteria andFamilyidIn(List<Integer> values) {
            addCriterion("FamilyID in", values, "familyid");
            return (Criteria) this;
        }

        public Criteria andFamilyidNotIn(List<Integer> values) {
            addCriterion("FamilyID not in", values, "familyid");
            return (Criteria) this;
        }

        public Criteria andFamilyidBetween(Integer value1, Integer value2) {
            addCriterion("FamilyID between", value1, value2, "familyid");
            return (Criteria) this;
        }

        public Criteria andFamilyidNotBetween(Integer value1, Integer value2) {
            addCriterion("FamilyID not between", value1, value2, "familyid");
            return (Criteria) this;
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

        public Criteria andDiseasetypeIsNull() {
            addCriterion("DiseaseType is null");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeIsNotNull() {
            addCriterion("DiseaseType is not null");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeEqualTo(String value) {
            addCriterion("DiseaseType =", value, "diseasetype");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeNotEqualTo(String value) {
            addCriterion("DiseaseType <>", value, "diseasetype");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeGreaterThan(String value) {
            addCriterion("DiseaseType >", value, "diseasetype");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeGreaterThanOrEqualTo(String value) {
            addCriterion("DiseaseType >=", value, "diseasetype");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeLessThan(String value) {
            addCriterion("DiseaseType <", value, "diseasetype");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeLessThanOrEqualTo(String value) {
            addCriterion("DiseaseType <=", value, "diseasetype");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeLike(String value) {
            addCriterion("DiseaseType like", value, "diseasetype");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeNotLike(String value) {
            addCriterion("DiseaseType not like", value, "diseasetype");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeIn(List<String> values) {
            addCriterion("DiseaseType in", values, "diseasetype");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeNotIn(List<String> values) {
            addCriterion("DiseaseType not in", values, "diseasetype");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeBetween(String value1, String value2) {
            addCriterion("DiseaseType between", value1, value2, "diseasetype");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeNotBetween(String value1, String value2) {
            addCriterion("DiseaseType not between", value1, value2, "diseasetype");
            return (Criteria) this;
        }

        public Criteria andIsexistIsNull() {
            addCriterion("IsExist is null");
            return (Criteria) this;
        }

        public Criteria andIsexistIsNotNull() {
            addCriterion("IsExist is not null");
            return (Criteria) this;
        }

        public Criteria andIsexistEqualTo(String value) {
            addCriterion("IsExist =", value, "isexist");
            return (Criteria) this;
        }

        public Criteria andIsexistNotEqualTo(String value) {
            addCriterion("IsExist <>", value, "isexist");
            return (Criteria) this;
        }

        public Criteria andIsexistGreaterThan(String value) {
            addCriterion("IsExist >", value, "isexist");
            return (Criteria) this;
        }

        public Criteria andIsexistGreaterThanOrEqualTo(String value) {
            addCriterion("IsExist >=", value, "isexist");
            return (Criteria) this;
        }

        public Criteria andIsexistLessThan(String value) {
            addCriterion("IsExist <", value, "isexist");
            return (Criteria) this;
        }

        public Criteria andIsexistLessThanOrEqualTo(String value) {
            addCriterion("IsExist <=", value, "isexist");
            return (Criteria) this;
        }

        public Criteria andIsexistLike(String value) {
            addCriterion("IsExist like", value, "isexist");
            return (Criteria) this;
        }

        public Criteria andIsexistNotLike(String value) {
            addCriterion("IsExist not like", value, "isexist");
            return (Criteria) this;
        }

        public Criteria andIsexistIn(List<String> values) {
            addCriterion("IsExist in", values, "isexist");
            return (Criteria) this;
        }

        public Criteria andIsexistNotIn(List<String> values) {
            addCriterion("IsExist not in", values, "isexist");
            return (Criteria) this;
        }

        public Criteria andIsexistBetween(String value1, String value2) {
            addCriterion("IsExist between", value1, value2, "isexist");
            return (Criteria) this;
        }

        public Criteria andIsexistNotBetween(String value1, String value2) {
            addCriterion("IsExist not between", value1, value2, "isexist");
            return (Criteria) this;
        }

        public Criteria andFatherIsNull() {
            addCriterion("Father is null");
            return (Criteria) this;
        }

        public Criteria andFatherIsNotNull() {
            addCriterion("Father is not null");
            return (Criteria) this;
        }

        public Criteria andFatherEqualTo(String value) {
            addCriterion("Father =", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherNotEqualTo(String value) {
            addCriterion("Father <>", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherGreaterThan(String value) {
            addCriterion("Father >", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherGreaterThanOrEqualTo(String value) {
            addCriterion("Father >=", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherLessThan(String value) {
            addCriterion("Father <", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherLessThanOrEqualTo(String value) {
            addCriterion("Father <=", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherLike(String value) {
            addCriterion("Father like", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherNotLike(String value) {
            addCriterion("Father not like", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherIn(List<String> values) {
            addCriterion("Father in", values, "father");
            return (Criteria) this;
        }

        public Criteria andFatherNotIn(List<String> values) {
            addCriterion("Father not in", values, "father");
            return (Criteria) this;
        }

        public Criteria andFatherBetween(String value1, String value2) {
            addCriterion("Father between", value1, value2, "father");
            return (Criteria) this;
        }

        public Criteria andFatherNotBetween(String value1, String value2) {
            addCriterion("Father not between", value1, value2, "father");
            return (Criteria) this;
        }

        public Criteria andMotherIsNull() {
            addCriterion("Mother is null");
            return (Criteria) this;
        }

        public Criteria andMotherIsNotNull() {
            addCriterion("Mother is not null");
            return (Criteria) this;
        }

        public Criteria andMotherEqualTo(String value) {
            addCriterion("Mother =", value, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherNotEqualTo(String value) {
            addCriterion("Mother <>", value, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherGreaterThan(String value) {
            addCriterion("Mother >", value, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherGreaterThanOrEqualTo(String value) {
            addCriterion("Mother >=", value, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherLessThan(String value) {
            addCriterion("Mother <", value, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherLessThanOrEqualTo(String value) {
            addCriterion("Mother <=", value, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherLike(String value) {
            addCriterion("Mother like", value, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherNotLike(String value) {
            addCriterion("Mother not like", value, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherIn(List<String> values) {
            addCriterion("Mother in", values, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherNotIn(List<String> values) {
            addCriterion("Mother not in", values, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherBetween(String value1, String value2) {
            addCriterion("Mother between", value1, value2, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherNotBetween(String value1, String value2) {
            addCriterion("Mother not between", value1, value2, "mother");
            return (Criteria) this;
        }

        public Criteria andBrothersisterIsNull() {
            addCriterion("BrotherSister is null");
            return (Criteria) this;
        }

        public Criteria andBrothersisterIsNotNull() {
            addCriterion("BrotherSister is not null");
            return (Criteria) this;
        }

        public Criteria andBrothersisterEqualTo(String value) {
            addCriterion("BrotherSister =", value, "brothersister");
            return (Criteria) this;
        }

        public Criteria andBrothersisterNotEqualTo(String value) {
            addCriterion("BrotherSister <>", value, "brothersister");
            return (Criteria) this;
        }

        public Criteria andBrothersisterGreaterThan(String value) {
            addCriterion("BrotherSister >", value, "brothersister");
            return (Criteria) this;
        }

        public Criteria andBrothersisterGreaterThanOrEqualTo(String value) {
            addCriterion("BrotherSister >=", value, "brothersister");
            return (Criteria) this;
        }

        public Criteria andBrothersisterLessThan(String value) {
            addCriterion("BrotherSister <", value, "brothersister");
            return (Criteria) this;
        }

        public Criteria andBrothersisterLessThanOrEqualTo(String value) {
            addCriterion("BrotherSister <=", value, "brothersister");
            return (Criteria) this;
        }

        public Criteria andBrothersisterLike(String value) {
            addCriterion("BrotherSister like", value, "brothersister");
            return (Criteria) this;
        }

        public Criteria andBrothersisterNotLike(String value) {
            addCriterion("BrotherSister not like", value, "brothersister");
            return (Criteria) this;
        }

        public Criteria andBrothersisterIn(List<String> values) {
            addCriterion("BrotherSister in", values, "brothersister");
            return (Criteria) this;
        }

        public Criteria andBrothersisterNotIn(List<String> values) {
            addCriterion("BrotherSister not in", values, "brothersister");
            return (Criteria) this;
        }

        public Criteria andBrothersisterBetween(String value1, String value2) {
            addCriterion("BrotherSister between", value1, value2, "brothersister");
            return (Criteria) this;
        }

        public Criteria andBrothersisterNotBetween(String value1, String value2) {
            addCriterion("BrotherSister not between", value1, value2, "brothersister");
            return (Criteria) this;
        }

        public Criteria andChildrenIsNull() {
            addCriterion("Children is null");
            return (Criteria) this;
        }

        public Criteria andChildrenIsNotNull() {
            addCriterion("Children is not null");
            return (Criteria) this;
        }

        public Criteria andChildrenEqualTo(String value) {
            addCriterion("Children =", value, "children");
            return (Criteria) this;
        }

        public Criteria andChildrenNotEqualTo(String value) {
            addCriterion("Children <>", value, "children");
            return (Criteria) this;
        }

        public Criteria andChildrenGreaterThan(String value) {
            addCriterion("Children >", value, "children");
            return (Criteria) this;
        }

        public Criteria andChildrenGreaterThanOrEqualTo(String value) {
            addCriterion("Children >=", value, "children");
            return (Criteria) this;
        }

        public Criteria andChildrenLessThan(String value) {
            addCriterion("Children <", value, "children");
            return (Criteria) this;
        }

        public Criteria andChildrenLessThanOrEqualTo(String value) {
            addCriterion("Children <=", value, "children");
            return (Criteria) this;
        }

        public Criteria andChildrenLike(String value) {
            addCriterion("Children like", value, "children");
            return (Criteria) this;
        }

        public Criteria andChildrenNotLike(String value) {
            addCriterion("Children not like", value, "children");
            return (Criteria) this;
        }

        public Criteria andChildrenIn(List<String> values) {
            addCriterion("Children in", values, "children");
            return (Criteria) this;
        }

        public Criteria andChildrenNotIn(List<String> values) {
            addCriterion("Children not in", values, "children");
            return (Criteria) this;
        }

        public Criteria andChildrenBetween(String value1, String value2) {
            addCriterion("Children between", value1, value2, "children");
            return (Criteria) this;
        }

        public Criteria andChildrenNotBetween(String value1, String value2) {
            addCriterion("Children not between", value1, value2, "children");
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