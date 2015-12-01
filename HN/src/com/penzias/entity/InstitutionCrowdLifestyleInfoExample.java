package com.penzias.entity;

import java.util.ArrayList;
import java.util.List;

public class InstitutionCrowdLifestyleInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstitutionCrowdLifestyleInfoExample() {
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

        public Criteria andLifestyleidIsNull() {
            addCriterion("LifeStyleID is null");
            return (Criteria) this;
        }

        public Criteria andLifestyleidIsNotNull() {
            addCriterion("LifeStyleID is not null");
            return (Criteria) this;
        }

        public Criteria andLifestyleidEqualTo(Integer value) {
            addCriterion("LifeStyleID =", value, "lifestyleid");
            return (Criteria) this;
        }

        public Criteria andLifestyleidNotEqualTo(Integer value) {
            addCriterion("LifeStyleID <>", value, "lifestyleid");
            return (Criteria) this;
        }

        public Criteria andLifestyleidGreaterThan(Integer value) {
            addCriterion("LifeStyleID >", value, "lifestyleid");
            return (Criteria) this;
        }

        public Criteria andLifestyleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LifeStyleID >=", value, "lifestyleid");
            return (Criteria) this;
        }

        public Criteria andLifestyleidLessThan(Integer value) {
            addCriterion("LifeStyleID <", value, "lifestyleid");
            return (Criteria) this;
        }

        public Criteria andLifestyleidLessThanOrEqualTo(Integer value) {
            addCriterion("LifeStyleID <=", value, "lifestyleid");
            return (Criteria) this;
        }

        public Criteria andLifestyleidIn(List<Integer> values) {
            addCriterion("LifeStyleID in", values, "lifestyleid");
            return (Criteria) this;
        }

        public Criteria andLifestyleidNotIn(List<Integer> values) {
            addCriterion("LifeStyleID not in", values, "lifestyleid");
            return (Criteria) this;
        }

        public Criteria andLifestyleidBetween(Integer value1, Integer value2) {
            addCriterion("LifeStyleID between", value1, value2, "lifestyleid");
            return (Criteria) this;
        }

        public Criteria andLifestyleidNotBetween(Integer value1, Integer value2) {
            addCriterion("LifeStyleID not between", value1, value2, "lifestyleid");
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

        public Criteria andSmokeIsNull() {
            addCriterion("Smoke is null");
            return (Criteria) this;
        }

        public Criteria andSmokeIsNotNull() {
            addCriterion("Smoke is not null");
            return (Criteria) this;
        }

        public Criteria andSmokeEqualTo(String value) {
            addCriterion("Smoke =", value, "smoke");
            return (Criteria) this;
        }

        public Criteria andSmokeNotEqualTo(String value) {
            addCriterion("Smoke <>", value, "smoke");
            return (Criteria) this;
        }

        public Criteria andSmokeGreaterThan(String value) {
            addCriterion("Smoke >", value, "smoke");
            return (Criteria) this;
        }

        public Criteria andSmokeGreaterThanOrEqualTo(String value) {
            addCriterion("Smoke >=", value, "smoke");
            return (Criteria) this;
        }

        public Criteria andSmokeLessThan(String value) {
            addCriterion("Smoke <", value, "smoke");
            return (Criteria) this;
        }

        public Criteria andSmokeLessThanOrEqualTo(String value) {
            addCriterion("Smoke <=", value, "smoke");
            return (Criteria) this;
        }

        public Criteria andSmokeLike(String value) {
            addCriterion("Smoke like", value, "smoke");
            return (Criteria) this;
        }

        public Criteria andSmokeNotLike(String value) {
            addCriterion("Smoke not like", value, "smoke");
            return (Criteria) this;
        }

        public Criteria andSmokeIn(List<String> values) {
            addCriterion("Smoke in", values, "smoke");
            return (Criteria) this;
        }

        public Criteria andSmokeNotIn(List<String> values) {
            addCriterion("Smoke not in", values, "smoke");
            return (Criteria) this;
        }

        public Criteria andSmokeBetween(String value1, String value2) {
            addCriterion("Smoke between", value1, value2, "smoke");
            return (Criteria) this;
        }

        public Criteria andSmokeNotBetween(String value1, String value2) {
            addCriterion("Smoke not between", value1, value2, "smoke");
            return (Criteria) this;
        }

        public Criteria andSmokeyearIsNull() {
            addCriterion("SmokeYear is null");
            return (Criteria) this;
        }

        public Criteria andSmokeyearIsNotNull() {
            addCriterion("SmokeYear is not null");
            return (Criteria) this;
        }

        public Criteria andSmokeyearEqualTo(String value) {
            addCriterion("SmokeYear =", value, "smokeyear");
            return (Criteria) this;
        }

        public Criteria andSmokeyearNotEqualTo(String value) {
            addCriterion("SmokeYear <>", value, "smokeyear");
            return (Criteria) this;
        }

        public Criteria andSmokeyearGreaterThan(String value) {
            addCriterion("SmokeYear >", value, "smokeyear");
            return (Criteria) this;
        }

        public Criteria andSmokeyearGreaterThanOrEqualTo(String value) {
            addCriterion("SmokeYear >=", value, "smokeyear");
            return (Criteria) this;
        }

        public Criteria andSmokeyearLessThan(String value) {
            addCriterion("SmokeYear <", value, "smokeyear");
            return (Criteria) this;
        }

        public Criteria andSmokeyearLessThanOrEqualTo(String value) {
            addCriterion("SmokeYear <=", value, "smokeyear");
            return (Criteria) this;
        }

        public Criteria andSmokeyearLike(String value) {
            addCriterion("SmokeYear like", value, "smokeyear");
            return (Criteria) this;
        }

        public Criteria andSmokeyearNotLike(String value) {
            addCriterion("SmokeYear not like", value, "smokeyear");
            return (Criteria) this;
        }

        public Criteria andSmokeyearIn(List<String> values) {
            addCriterion("SmokeYear in", values, "smokeyear");
            return (Criteria) this;
        }

        public Criteria andSmokeyearNotIn(List<String> values) {
            addCriterion("SmokeYear not in", values, "smokeyear");
            return (Criteria) this;
        }

        public Criteria andSmokeyearBetween(String value1, String value2) {
            addCriterion("SmokeYear between", value1, value2, "smokeyear");
            return (Criteria) this;
        }

        public Criteria andSmokeyearNotBetween(String value1, String value2) {
            addCriterion("SmokeYear not between", value1, value2, "smokeyear");
            return (Criteria) this;
        }

        public Criteria andSmokedayIsNull() {
            addCriterion("SmokeDay is null");
            return (Criteria) this;
        }

        public Criteria andSmokedayIsNotNull() {
            addCriterion("SmokeDay is not null");
            return (Criteria) this;
        }

        public Criteria andSmokedayEqualTo(String value) {
            addCriterion("SmokeDay =", value, "smokeday");
            return (Criteria) this;
        }

        public Criteria andSmokedayNotEqualTo(String value) {
            addCriterion("SmokeDay <>", value, "smokeday");
            return (Criteria) this;
        }

        public Criteria andSmokedayGreaterThan(String value) {
            addCriterion("SmokeDay >", value, "smokeday");
            return (Criteria) this;
        }

        public Criteria andSmokedayGreaterThanOrEqualTo(String value) {
            addCriterion("SmokeDay >=", value, "smokeday");
            return (Criteria) this;
        }

        public Criteria andSmokedayLessThan(String value) {
            addCriterion("SmokeDay <", value, "smokeday");
            return (Criteria) this;
        }

        public Criteria andSmokedayLessThanOrEqualTo(String value) {
            addCriterion("SmokeDay <=", value, "smokeday");
            return (Criteria) this;
        }

        public Criteria andSmokedayLike(String value) {
            addCriterion("SmokeDay like", value, "smokeday");
            return (Criteria) this;
        }

        public Criteria andSmokedayNotLike(String value) {
            addCriterion("SmokeDay not like", value, "smokeday");
            return (Criteria) this;
        }

        public Criteria andSmokedayIn(List<String> values) {
            addCriterion("SmokeDay in", values, "smokeday");
            return (Criteria) this;
        }

        public Criteria andSmokedayNotIn(List<String> values) {
            addCriterion("SmokeDay not in", values, "smokeday");
            return (Criteria) this;
        }

        public Criteria andSmokedayBetween(String value1, String value2) {
            addCriterion("SmokeDay between", value1, value2, "smokeday");
            return (Criteria) this;
        }

        public Criteria andSmokedayNotBetween(String value1, String value2) {
            addCriterion("SmokeDay not between", value1, value2, "smokeday");
            return (Criteria) this;
        }

        public Criteria andWineIsNull() {
            addCriterion("Wine is null");
            return (Criteria) this;
        }

        public Criteria andWineIsNotNull() {
            addCriterion("Wine is not null");
            return (Criteria) this;
        }

        public Criteria andWineEqualTo(String value) {
            addCriterion("Wine =", value, "wine");
            return (Criteria) this;
        }

        public Criteria andWineNotEqualTo(String value) {
            addCriterion("Wine <>", value, "wine");
            return (Criteria) this;
        }

        public Criteria andWineGreaterThan(String value) {
            addCriterion("Wine >", value, "wine");
            return (Criteria) this;
        }

        public Criteria andWineGreaterThanOrEqualTo(String value) {
            addCriterion("Wine >=", value, "wine");
            return (Criteria) this;
        }

        public Criteria andWineLessThan(String value) {
            addCriterion("Wine <", value, "wine");
            return (Criteria) this;
        }

        public Criteria andWineLessThanOrEqualTo(String value) {
            addCriterion("Wine <=", value, "wine");
            return (Criteria) this;
        }

        public Criteria andWineLike(String value) {
            addCriterion("Wine like", value, "wine");
            return (Criteria) this;
        }

        public Criteria andWineNotLike(String value) {
            addCriterion("Wine not like", value, "wine");
            return (Criteria) this;
        }

        public Criteria andWineIn(List<String> values) {
            addCriterion("Wine in", values, "wine");
            return (Criteria) this;
        }

        public Criteria andWineNotIn(List<String> values) {
            addCriterion("Wine not in", values, "wine");
            return (Criteria) this;
        }

        public Criteria andWineBetween(String value1, String value2) {
            addCriterion("Wine between", value1, value2, "wine");
            return (Criteria) this;
        }

        public Criteria andWineNotBetween(String value1, String value2) {
            addCriterion("Wine not between", value1, value2, "wine");
            return (Criteria) this;
        }

        public Criteria andWineyearIsNull() {
            addCriterion("WineYear is null");
            return (Criteria) this;
        }

        public Criteria andWineyearIsNotNull() {
            addCriterion("WineYear is not null");
            return (Criteria) this;
        }

        public Criteria andWineyearEqualTo(String value) {
            addCriterion("WineYear =", value, "wineyear");
            return (Criteria) this;
        }

        public Criteria andWineyearNotEqualTo(String value) {
            addCriterion("WineYear <>", value, "wineyear");
            return (Criteria) this;
        }

        public Criteria andWineyearGreaterThan(String value) {
            addCriterion("WineYear >", value, "wineyear");
            return (Criteria) this;
        }

        public Criteria andWineyearGreaterThanOrEqualTo(String value) {
            addCriterion("WineYear >=", value, "wineyear");
            return (Criteria) this;
        }

        public Criteria andWineyearLessThan(String value) {
            addCriterion("WineYear <", value, "wineyear");
            return (Criteria) this;
        }

        public Criteria andWineyearLessThanOrEqualTo(String value) {
            addCriterion("WineYear <=", value, "wineyear");
            return (Criteria) this;
        }

        public Criteria andWineyearLike(String value) {
            addCriterion("WineYear like", value, "wineyear");
            return (Criteria) this;
        }

        public Criteria andWineyearNotLike(String value) {
            addCriterion("WineYear not like", value, "wineyear");
            return (Criteria) this;
        }

        public Criteria andWineyearIn(List<String> values) {
            addCriterion("WineYear in", values, "wineyear");
            return (Criteria) this;
        }

        public Criteria andWineyearNotIn(List<String> values) {
            addCriterion("WineYear not in", values, "wineyear");
            return (Criteria) this;
        }

        public Criteria andWineyearBetween(String value1, String value2) {
            addCriterion("WineYear between", value1, value2, "wineyear");
            return (Criteria) this;
        }

        public Criteria andWineyearNotBetween(String value1, String value2) {
            addCriterion("WineYear not between", value1, value2, "wineyear");
            return (Criteria) this;
        }

        public Criteria andSportsIsNull() {
            addCriterion("Sports is null");
            return (Criteria) this;
        }

        public Criteria andSportsIsNotNull() {
            addCriterion("Sports is not null");
            return (Criteria) this;
        }

        public Criteria andSportsEqualTo(String value) {
            addCriterion("Sports =", value, "sports");
            return (Criteria) this;
        }

        public Criteria andSportsNotEqualTo(String value) {
            addCriterion("Sports <>", value, "sports");
            return (Criteria) this;
        }

        public Criteria andSportsGreaterThan(String value) {
            addCriterion("Sports >", value, "sports");
            return (Criteria) this;
        }

        public Criteria andSportsGreaterThanOrEqualTo(String value) {
            addCriterion("Sports >=", value, "sports");
            return (Criteria) this;
        }

        public Criteria andSportsLessThan(String value) {
            addCriterion("Sports <", value, "sports");
            return (Criteria) this;
        }

        public Criteria andSportsLessThanOrEqualTo(String value) {
            addCriterion("Sports <=", value, "sports");
            return (Criteria) this;
        }

        public Criteria andSportsLike(String value) {
            addCriterion("Sports like", value, "sports");
            return (Criteria) this;
        }

        public Criteria andSportsNotLike(String value) {
            addCriterion("Sports not like", value, "sports");
            return (Criteria) this;
        }

        public Criteria andSportsIn(List<String> values) {
            addCriterion("Sports in", values, "sports");
            return (Criteria) this;
        }

        public Criteria andSportsNotIn(List<String> values) {
            addCriterion("Sports not in", values, "sports");
            return (Criteria) this;
        }

        public Criteria andSportsBetween(String value1, String value2) {
            addCriterion("Sports between", value1, value2, "sports");
            return (Criteria) this;
        }

        public Criteria andSportsNotBetween(String value1, String value2) {
            addCriterion("Sports not between", value1, value2, "sports");
            return (Criteria) this;
        }

        public Criteria andSportsyearIsNull() {
            addCriterion("SportsYear is null");
            return (Criteria) this;
        }

        public Criteria andSportsyearIsNotNull() {
            addCriterion("SportsYear is not null");
            return (Criteria) this;
        }

        public Criteria andSportsyearEqualTo(String value) {
            addCriterion("SportsYear =", value, "sportsyear");
            return (Criteria) this;
        }

        public Criteria andSportsyearNotEqualTo(String value) {
            addCriterion("SportsYear <>", value, "sportsyear");
            return (Criteria) this;
        }

        public Criteria andSportsyearGreaterThan(String value) {
            addCriterion("SportsYear >", value, "sportsyear");
            return (Criteria) this;
        }

        public Criteria andSportsyearGreaterThanOrEqualTo(String value) {
            addCriterion("SportsYear >=", value, "sportsyear");
            return (Criteria) this;
        }

        public Criteria andSportsyearLessThan(String value) {
            addCriterion("SportsYear <", value, "sportsyear");
            return (Criteria) this;
        }

        public Criteria andSportsyearLessThanOrEqualTo(String value) {
            addCriterion("SportsYear <=", value, "sportsyear");
            return (Criteria) this;
        }

        public Criteria andSportsyearLike(String value) {
            addCriterion("SportsYear like", value, "sportsyear");
            return (Criteria) this;
        }

        public Criteria andSportsyearNotLike(String value) {
            addCriterion("SportsYear not like", value, "sportsyear");
            return (Criteria) this;
        }

        public Criteria andSportsyearIn(List<String> values) {
            addCriterion("SportsYear in", values, "sportsyear");
            return (Criteria) this;
        }

        public Criteria andSportsyearNotIn(List<String> values) {
            addCriterion("SportsYear not in", values, "sportsyear");
            return (Criteria) this;
        }

        public Criteria andSportsyearBetween(String value1, String value2) {
            addCriterion("SportsYear between", value1, value2, "sportsyear");
            return (Criteria) this;
        }

        public Criteria andSportsyearNotBetween(String value1, String value2) {
            addCriterion("SportsYear not between", value1, value2, "sportsyear");
            return (Criteria) this;
        }

        public Criteria andDietIsNull() {
            addCriterion("Diet is null");
            return (Criteria) this;
        }

        public Criteria andDietIsNotNull() {
            addCriterion("Diet is not null");
            return (Criteria) this;
        }

        public Criteria andDietEqualTo(String value) {
            addCriterion("Diet =", value, "diet");
            return (Criteria) this;
        }

        public Criteria andDietNotEqualTo(String value) {
            addCriterion("Diet <>", value, "diet");
            return (Criteria) this;
        }

        public Criteria andDietGreaterThan(String value) {
            addCriterion("Diet >", value, "diet");
            return (Criteria) this;
        }

        public Criteria andDietGreaterThanOrEqualTo(String value) {
            addCriterion("Diet >=", value, "diet");
            return (Criteria) this;
        }

        public Criteria andDietLessThan(String value) {
            addCriterion("Diet <", value, "diet");
            return (Criteria) this;
        }

        public Criteria andDietLessThanOrEqualTo(String value) {
            addCriterion("Diet <=", value, "diet");
            return (Criteria) this;
        }

        public Criteria andDietLike(String value) {
            addCriterion("Diet like", value, "diet");
            return (Criteria) this;
        }

        public Criteria andDietNotLike(String value) {
            addCriterion("Diet not like", value, "diet");
            return (Criteria) this;
        }

        public Criteria andDietIn(List<String> values) {
            addCriterion("Diet in", values, "diet");
            return (Criteria) this;
        }

        public Criteria andDietNotIn(List<String> values) {
            addCriterion("Diet not in", values, "diet");
            return (Criteria) this;
        }

        public Criteria andDietBetween(String value1, String value2) {
            addCriterion("Diet between", value1, value2, "diet");
            return (Criteria) this;
        }

        public Criteria andDietNotBetween(String value1, String value2) {
            addCriterion("Diet not between", value1, value2, "diet");
            return (Criteria) this;
        }

        public Criteria andDietyearIsNull() {
            addCriterion("DietYear is null");
            return (Criteria) this;
        }

        public Criteria andDietyearIsNotNull() {
            addCriterion("DietYear is not null");
            return (Criteria) this;
        }

        public Criteria andDietyearEqualTo(String value) {
            addCriterion("DietYear =", value, "dietyear");
            return (Criteria) this;
        }

        public Criteria andDietyearNotEqualTo(String value) {
            addCriterion("DietYear <>", value, "dietyear");
            return (Criteria) this;
        }

        public Criteria andDietyearGreaterThan(String value) {
            addCriterion("DietYear >", value, "dietyear");
            return (Criteria) this;
        }

        public Criteria andDietyearGreaterThanOrEqualTo(String value) {
            addCriterion("DietYear >=", value, "dietyear");
            return (Criteria) this;
        }

        public Criteria andDietyearLessThan(String value) {
            addCriterion("DietYear <", value, "dietyear");
            return (Criteria) this;
        }

        public Criteria andDietyearLessThanOrEqualTo(String value) {
            addCriterion("DietYear <=", value, "dietyear");
            return (Criteria) this;
        }

        public Criteria andDietyearLike(String value) {
            addCriterion("DietYear like", value, "dietyear");
            return (Criteria) this;
        }

        public Criteria andDietyearNotLike(String value) {
            addCriterion("DietYear not like", value, "dietyear");
            return (Criteria) this;
        }

        public Criteria andDietyearIn(List<String> values) {
            addCriterion("DietYear in", values, "dietyear");
            return (Criteria) this;
        }

        public Criteria andDietyearNotIn(List<String> values) {
            addCriterion("DietYear not in", values, "dietyear");
            return (Criteria) this;
        }

        public Criteria andDietyearBetween(String value1, String value2) {
            addCriterion("DietYear between", value1, value2, "dietyear");
            return (Criteria) this;
        }

        public Criteria andDietyearNotBetween(String value1, String value2) {
            addCriterion("DietYear not between", value1, value2, "dietyear");
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