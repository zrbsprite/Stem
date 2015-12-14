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

        public Criteria andDietflavorIsNull() {
            addCriterion("DietFlavor is null");
            return (Criteria) this;
        }

        public Criteria andDietflavorIsNotNull() {
            addCriterion("DietFlavor is not null");
            return (Criteria) this;
        }

        public Criteria andDietflavorEqualTo(String value) {
            addCriterion("DietFlavor =", value, "dietflavor");
            return (Criteria) this;
        }

        public Criteria andDietflavorNotEqualTo(String value) {
            addCriterion("DietFlavor <>", value, "dietflavor");
            return (Criteria) this;
        }

        public Criteria andDietflavorGreaterThan(String value) {
            addCriterion("DietFlavor >", value, "dietflavor");
            return (Criteria) this;
        }

        public Criteria andDietflavorGreaterThanOrEqualTo(String value) {
            addCriterion("DietFlavor >=", value, "dietflavor");
            return (Criteria) this;
        }

        public Criteria andDietflavorLessThan(String value) {
            addCriterion("DietFlavor <", value, "dietflavor");
            return (Criteria) this;
        }

        public Criteria andDietflavorLessThanOrEqualTo(String value) {
            addCriterion("DietFlavor <=", value, "dietflavor");
            return (Criteria) this;
        }

        public Criteria andDietflavorLike(String value) {
            addCriterion("DietFlavor like", value, "dietflavor");
            return (Criteria) this;
        }

        public Criteria andDietflavorNotLike(String value) {
            addCriterion("DietFlavor not like", value, "dietflavor");
            return (Criteria) this;
        }

        public Criteria andDietflavorIn(List<String> values) {
            addCriterion("DietFlavor in", values, "dietflavor");
            return (Criteria) this;
        }

        public Criteria andDietflavorNotIn(List<String> values) {
            addCriterion("DietFlavor not in", values, "dietflavor");
            return (Criteria) this;
        }

        public Criteria andDietflavorBetween(String value1, String value2) {
            addCriterion("DietFlavor between", value1, value2, "dietflavor");
            return (Criteria) this;
        }

        public Criteria andDietflavorNotBetween(String value1, String value2) {
            addCriterion("DietFlavor not between", value1, value2, "dietflavor");
            return (Criteria) this;
        }

        public Criteria andDietflavoryearIsNull() {
            addCriterion("DietFlavorYear is null");
            return (Criteria) this;
        }

        public Criteria andDietflavoryearIsNotNull() {
            addCriterion("DietFlavorYear is not null");
            return (Criteria) this;
        }

        public Criteria andDietflavoryearEqualTo(String value) {
            addCriterion("DietFlavorYear =", value, "dietflavoryear");
            return (Criteria) this;
        }

        public Criteria andDietflavoryearNotEqualTo(String value) {
            addCriterion("DietFlavorYear <>", value, "dietflavoryear");
            return (Criteria) this;
        }

        public Criteria andDietflavoryearGreaterThan(String value) {
            addCriterion("DietFlavorYear >", value, "dietflavoryear");
            return (Criteria) this;
        }

        public Criteria andDietflavoryearGreaterThanOrEqualTo(String value) {
            addCriterion("DietFlavorYear >=", value, "dietflavoryear");
            return (Criteria) this;
        }

        public Criteria andDietflavoryearLessThan(String value) {
            addCriterion("DietFlavorYear <", value, "dietflavoryear");
            return (Criteria) this;
        }

        public Criteria andDietflavoryearLessThanOrEqualTo(String value) {
            addCriterion("DietFlavorYear <=", value, "dietflavoryear");
            return (Criteria) this;
        }

        public Criteria andDietflavoryearLike(String value) {
            addCriterion("DietFlavorYear like", value, "dietflavoryear");
            return (Criteria) this;
        }

        public Criteria andDietflavoryearNotLike(String value) {
            addCriterion("DietFlavorYear not like", value, "dietflavoryear");
            return (Criteria) this;
        }

        public Criteria andDietflavoryearIn(List<String> values) {
            addCriterion("DietFlavorYear in", values, "dietflavoryear");
            return (Criteria) this;
        }

        public Criteria andDietflavoryearNotIn(List<String> values) {
            addCriterion("DietFlavorYear not in", values, "dietflavoryear");
            return (Criteria) this;
        }

        public Criteria andDietflavoryearBetween(String value1, String value2) {
            addCriterion("DietFlavorYear between", value1, value2, "dietflavoryear");
            return (Criteria) this;
        }

        public Criteria andDietflavoryearNotBetween(String value1, String value2) {
            addCriterion("DietFlavorYear not between", value1, value2, "dietflavoryear");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesIsNull() {
            addCriterion("DietMeatVegetables is null");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesIsNotNull() {
            addCriterion("DietMeatVegetables is not null");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesEqualTo(String value) {
            addCriterion("DietMeatVegetables =", value, "dietmeatvegetables");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesNotEqualTo(String value) {
            addCriterion("DietMeatVegetables <>", value, "dietmeatvegetables");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesGreaterThan(String value) {
            addCriterion("DietMeatVegetables >", value, "dietmeatvegetables");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesGreaterThanOrEqualTo(String value) {
            addCriterion("DietMeatVegetables >=", value, "dietmeatvegetables");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesLessThan(String value) {
            addCriterion("DietMeatVegetables <", value, "dietmeatvegetables");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesLessThanOrEqualTo(String value) {
            addCriterion("DietMeatVegetables <=", value, "dietmeatvegetables");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesLike(String value) {
            addCriterion("DietMeatVegetables like", value, "dietmeatvegetables");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesNotLike(String value) {
            addCriterion("DietMeatVegetables not like", value, "dietmeatvegetables");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesIn(List<String> values) {
            addCriterion("DietMeatVegetables in", values, "dietmeatvegetables");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesNotIn(List<String> values) {
            addCriterion("DietMeatVegetables not in", values, "dietmeatvegetables");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesBetween(String value1, String value2) {
            addCriterion("DietMeatVegetables between", value1, value2, "dietmeatvegetables");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesNotBetween(String value1, String value2) {
            addCriterion("DietMeatVegetables not between", value1, value2, "dietmeatvegetables");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesyearIsNull() {
            addCriterion("DietMeatVegetablesYear is null");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesyearIsNotNull() {
            addCriterion("DietMeatVegetablesYear is not null");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesyearEqualTo(String value) {
            addCriterion("DietMeatVegetablesYear =", value, "dietmeatvegetablesyear");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesyearNotEqualTo(String value) {
            addCriterion("DietMeatVegetablesYear <>", value, "dietmeatvegetablesyear");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesyearGreaterThan(String value) {
            addCriterion("DietMeatVegetablesYear >", value, "dietmeatvegetablesyear");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesyearGreaterThanOrEqualTo(String value) {
            addCriterion("DietMeatVegetablesYear >=", value, "dietmeatvegetablesyear");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesyearLessThan(String value) {
            addCriterion("DietMeatVegetablesYear <", value, "dietmeatvegetablesyear");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesyearLessThanOrEqualTo(String value) {
            addCriterion("DietMeatVegetablesYear <=", value, "dietmeatvegetablesyear");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesyearLike(String value) {
            addCriterion("DietMeatVegetablesYear like", value, "dietmeatvegetablesyear");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesyearNotLike(String value) {
            addCriterion("DietMeatVegetablesYear not like", value, "dietmeatvegetablesyear");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesyearIn(List<String> values) {
            addCriterion("DietMeatVegetablesYear in", values, "dietmeatvegetablesyear");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesyearNotIn(List<String> values) {
            addCriterion("DietMeatVegetablesYear not in", values, "dietmeatvegetablesyear");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesyearBetween(String value1, String value2) {
            addCriterion("DietMeatVegetablesYear between", value1, value2, "dietmeatvegetablesyear");
            return (Criteria) this;
        }

        public Criteria andDietmeatvegetablesyearNotBetween(String value1, String value2) {
            addCriterion("DietMeatVegetablesYear not between", value1, value2, "dietmeatvegetablesyear");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesIsNull() {
            addCriterion("DietVegetables is null");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesIsNotNull() {
            addCriterion("DietVegetables is not null");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesEqualTo(String value) {
            addCriterion("DietVegetables =", value, "dietvegetables");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesNotEqualTo(String value) {
            addCriterion("DietVegetables <>", value, "dietvegetables");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesGreaterThan(String value) {
            addCriterion("DietVegetables >", value, "dietvegetables");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesGreaterThanOrEqualTo(String value) {
            addCriterion("DietVegetables >=", value, "dietvegetables");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesLessThan(String value) {
            addCriterion("DietVegetables <", value, "dietvegetables");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesLessThanOrEqualTo(String value) {
            addCriterion("DietVegetables <=", value, "dietvegetables");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesLike(String value) {
            addCriterion("DietVegetables like", value, "dietvegetables");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesNotLike(String value) {
            addCriterion("DietVegetables not like", value, "dietvegetables");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesIn(List<String> values) {
            addCriterion("DietVegetables in", values, "dietvegetables");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesNotIn(List<String> values) {
            addCriterion("DietVegetables not in", values, "dietvegetables");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesBetween(String value1, String value2) {
            addCriterion("DietVegetables between", value1, value2, "dietvegetables");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesNotBetween(String value1, String value2) {
            addCriterion("DietVegetables not between", value1, value2, "dietvegetables");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesyearIsNull() {
            addCriterion("DietVegetablesYear is null");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesyearIsNotNull() {
            addCriterion("DietVegetablesYear is not null");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesyearEqualTo(String value) {
            addCriterion("DietVegetablesYear =", value, "dietvegetablesyear");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesyearNotEqualTo(String value) {
            addCriterion("DietVegetablesYear <>", value, "dietvegetablesyear");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesyearGreaterThan(String value) {
            addCriterion("DietVegetablesYear >", value, "dietvegetablesyear");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesyearGreaterThanOrEqualTo(String value) {
            addCriterion("DietVegetablesYear >=", value, "dietvegetablesyear");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesyearLessThan(String value) {
            addCriterion("DietVegetablesYear <", value, "dietvegetablesyear");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesyearLessThanOrEqualTo(String value) {
            addCriterion("DietVegetablesYear <=", value, "dietvegetablesyear");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesyearLike(String value) {
            addCriterion("DietVegetablesYear like", value, "dietvegetablesyear");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesyearNotLike(String value) {
            addCriterion("DietVegetablesYear not like", value, "dietvegetablesyear");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesyearIn(List<String> values) {
            addCriterion("DietVegetablesYear in", values, "dietvegetablesyear");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesyearNotIn(List<String> values) {
            addCriterion("DietVegetablesYear not in", values, "dietvegetablesyear");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesyearBetween(String value1, String value2) {
            addCriterion("DietVegetablesYear between", value1, value2, "dietvegetablesyear");
            return (Criteria) this;
        }

        public Criteria andDietvegetablesyearNotBetween(String value1, String value2) {
            addCriterion("DietVegetablesYear not between", value1, value2, "dietvegetablesyear");
            return (Criteria) this;
        }

        public Criteria andDietfruitsIsNull() {
            addCriterion("DietFruits is null");
            return (Criteria) this;
        }

        public Criteria andDietfruitsIsNotNull() {
            addCriterion("DietFruits is not null");
            return (Criteria) this;
        }

        public Criteria andDietfruitsEqualTo(String value) {
            addCriterion("DietFruits =", value, "dietfruits");
            return (Criteria) this;
        }

        public Criteria andDietfruitsNotEqualTo(String value) {
            addCriterion("DietFruits <>", value, "dietfruits");
            return (Criteria) this;
        }

        public Criteria andDietfruitsGreaterThan(String value) {
            addCriterion("DietFruits >", value, "dietfruits");
            return (Criteria) this;
        }

        public Criteria andDietfruitsGreaterThanOrEqualTo(String value) {
            addCriterion("DietFruits >=", value, "dietfruits");
            return (Criteria) this;
        }

        public Criteria andDietfruitsLessThan(String value) {
            addCriterion("DietFruits <", value, "dietfruits");
            return (Criteria) this;
        }

        public Criteria andDietfruitsLessThanOrEqualTo(String value) {
            addCriterion("DietFruits <=", value, "dietfruits");
            return (Criteria) this;
        }

        public Criteria andDietfruitsLike(String value) {
            addCriterion("DietFruits like", value, "dietfruits");
            return (Criteria) this;
        }

        public Criteria andDietfruitsNotLike(String value) {
            addCriterion("DietFruits not like", value, "dietfruits");
            return (Criteria) this;
        }

        public Criteria andDietfruitsIn(List<String> values) {
            addCriterion("DietFruits in", values, "dietfruits");
            return (Criteria) this;
        }

        public Criteria andDietfruitsNotIn(List<String> values) {
            addCriterion("DietFruits not in", values, "dietfruits");
            return (Criteria) this;
        }

        public Criteria andDietfruitsBetween(String value1, String value2) {
            addCriterion("DietFruits between", value1, value2, "dietfruits");
            return (Criteria) this;
        }

        public Criteria andDietfruitsNotBetween(String value1, String value2) {
            addCriterion("DietFruits not between", value1, value2, "dietfruits");
            return (Criteria) this;
        }

        public Criteria andDietfruitsyearIsNull() {
            addCriterion("DietFruitsYear is null");
            return (Criteria) this;
        }

        public Criteria andDietfruitsyearIsNotNull() {
            addCriterion("DietFruitsYear is not null");
            return (Criteria) this;
        }

        public Criteria andDietfruitsyearEqualTo(String value) {
            addCriterion("DietFruitsYear =", value, "dietfruitsyear");
            return (Criteria) this;
        }

        public Criteria andDietfruitsyearNotEqualTo(String value) {
            addCriterion("DietFruitsYear <>", value, "dietfruitsyear");
            return (Criteria) this;
        }

        public Criteria andDietfruitsyearGreaterThan(String value) {
            addCriterion("DietFruitsYear >", value, "dietfruitsyear");
            return (Criteria) this;
        }

        public Criteria andDietfruitsyearGreaterThanOrEqualTo(String value) {
            addCriterion("DietFruitsYear >=", value, "dietfruitsyear");
            return (Criteria) this;
        }

        public Criteria andDietfruitsyearLessThan(String value) {
            addCriterion("DietFruitsYear <", value, "dietfruitsyear");
            return (Criteria) this;
        }

        public Criteria andDietfruitsyearLessThanOrEqualTo(String value) {
            addCriterion("DietFruitsYear <=", value, "dietfruitsyear");
            return (Criteria) this;
        }

        public Criteria andDietfruitsyearLike(String value) {
            addCriterion("DietFruitsYear like", value, "dietfruitsyear");
            return (Criteria) this;
        }

        public Criteria andDietfruitsyearNotLike(String value) {
            addCriterion("DietFruitsYear not like", value, "dietfruitsyear");
            return (Criteria) this;
        }

        public Criteria andDietfruitsyearIn(List<String> values) {
            addCriterion("DietFruitsYear in", values, "dietfruitsyear");
            return (Criteria) this;
        }

        public Criteria andDietfruitsyearNotIn(List<String> values) {
            addCriterion("DietFruitsYear not in", values, "dietfruitsyear");
            return (Criteria) this;
        }

        public Criteria andDietfruitsyearBetween(String value1, String value2) {
            addCriterion("DietFruitsYear between", value1, value2, "dietfruitsyear");
            return (Criteria) this;
        }

        public Criteria andDietfruitsyearNotBetween(String value1, String value2) {
            addCriterion("DietFruitsYear not between", value1, value2, "dietfruitsyear");
            return (Criteria) this;
        }

        public Criteria andDietmilkIsNull() {
            addCriterion("DietMilk is null");
            return (Criteria) this;
        }

        public Criteria andDietmilkIsNotNull() {
            addCriterion("DietMilk is not null");
            return (Criteria) this;
        }

        public Criteria andDietmilkEqualTo(String value) {
            addCriterion("DietMilk =", value, "dietmilk");
            return (Criteria) this;
        }

        public Criteria andDietmilkNotEqualTo(String value) {
            addCriterion("DietMilk <>", value, "dietmilk");
            return (Criteria) this;
        }

        public Criteria andDietmilkGreaterThan(String value) {
            addCriterion("DietMilk >", value, "dietmilk");
            return (Criteria) this;
        }

        public Criteria andDietmilkGreaterThanOrEqualTo(String value) {
            addCriterion("DietMilk >=", value, "dietmilk");
            return (Criteria) this;
        }

        public Criteria andDietmilkLessThan(String value) {
            addCriterion("DietMilk <", value, "dietmilk");
            return (Criteria) this;
        }

        public Criteria andDietmilkLessThanOrEqualTo(String value) {
            addCriterion("DietMilk <=", value, "dietmilk");
            return (Criteria) this;
        }

        public Criteria andDietmilkLike(String value) {
            addCriterion("DietMilk like", value, "dietmilk");
            return (Criteria) this;
        }

        public Criteria andDietmilkNotLike(String value) {
            addCriterion("DietMilk not like", value, "dietmilk");
            return (Criteria) this;
        }

        public Criteria andDietmilkIn(List<String> values) {
            addCriterion("DietMilk in", values, "dietmilk");
            return (Criteria) this;
        }

        public Criteria andDietmilkNotIn(List<String> values) {
            addCriterion("DietMilk not in", values, "dietmilk");
            return (Criteria) this;
        }

        public Criteria andDietmilkBetween(String value1, String value2) {
            addCriterion("DietMilk between", value1, value2, "dietmilk");
            return (Criteria) this;
        }

        public Criteria andDietmilkNotBetween(String value1, String value2) {
            addCriterion("DietMilk not between", value1, value2, "dietmilk");
            return (Criteria) this;
        }

        public Criteria andDietmilkyearIsNull() {
            addCriterion("DietMilkYear is null");
            return (Criteria) this;
        }

        public Criteria andDietmilkyearIsNotNull() {
            addCriterion("DietMilkYear is not null");
            return (Criteria) this;
        }

        public Criteria andDietmilkyearEqualTo(String value) {
            addCriterion("DietMilkYear =", value, "dietmilkyear");
            return (Criteria) this;
        }

        public Criteria andDietmilkyearNotEqualTo(String value) {
            addCriterion("DietMilkYear <>", value, "dietmilkyear");
            return (Criteria) this;
        }

        public Criteria andDietmilkyearGreaterThan(String value) {
            addCriterion("DietMilkYear >", value, "dietmilkyear");
            return (Criteria) this;
        }

        public Criteria andDietmilkyearGreaterThanOrEqualTo(String value) {
            addCriterion("DietMilkYear >=", value, "dietmilkyear");
            return (Criteria) this;
        }

        public Criteria andDietmilkyearLessThan(String value) {
            addCriterion("DietMilkYear <", value, "dietmilkyear");
            return (Criteria) this;
        }

        public Criteria andDietmilkyearLessThanOrEqualTo(String value) {
            addCriterion("DietMilkYear <=", value, "dietmilkyear");
            return (Criteria) this;
        }

        public Criteria andDietmilkyearLike(String value) {
            addCriterion("DietMilkYear like", value, "dietmilkyear");
            return (Criteria) this;
        }

        public Criteria andDietmilkyearNotLike(String value) {
            addCriterion("DietMilkYear not like", value, "dietmilkyear");
            return (Criteria) this;
        }

        public Criteria andDietmilkyearIn(List<String> values) {
            addCriterion("DietMilkYear in", values, "dietmilkyear");
            return (Criteria) this;
        }

        public Criteria andDietmilkyearNotIn(List<String> values) {
            addCriterion("DietMilkYear not in", values, "dietmilkyear");
            return (Criteria) this;
        }

        public Criteria andDietmilkyearBetween(String value1, String value2) {
            addCriterion("DietMilkYear between", value1, value2, "dietmilkyear");
            return (Criteria) this;
        }

        public Criteria andDietmilkyearNotBetween(String value1, String value2) {
            addCriterion("DietMilkYear not between", value1, value2, "dietmilkyear");
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