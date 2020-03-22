package com.bruce.bean;

import java.util.ArrayList;
import java.util.List;

public class ProgressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProgressExample() {
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

        public Criteria andProgressidIsNull() {
            addCriterion("progressId is null");
            return (Criteria) this;
        }

        public Criteria andProgressidIsNotNull() {
            addCriterion("progressId is not null");
            return (Criteria) this;
        }

        public Criteria andProgressidEqualTo(Integer value) {
            addCriterion("progressId =", value, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidNotEqualTo(Integer value) {
            addCriterion("progressId <>", value, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidGreaterThan(Integer value) {
            addCriterion("progressId >", value, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidGreaterThanOrEqualTo(Integer value) {
            addCriterion("progressId >=", value, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidLessThan(Integer value) {
            addCriterion("progressId <", value, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidLessThanOrEqualTo(Integer value) {
            addCriterion("progressId <=", value, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidIn(List<Integer> values) {
            addCriterion("progressId in", values, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidNotIn(List<Integer> values) {
            addCriterion("progressId not in", values, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidBetween(Integer value1, Integer value2) {
            addCriterion("progressId between", value1, value2, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidNotBetween(Integer value1, Integer value2) {
            addCriterion("progressId not between", value1, value2, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressuseridIsNull() {
            addCriterion("progressUserId is null");
            return (Criteria) this;
        }

        public Criteria andProgressuseridIsNotNull() {
            addCriterion("progressUserId is not null");
            return (Criteria) this;
        }

        public Criteria andProgressuseridEqualTo(Integer value) {
            addCriterion("progressUserId =", value, "progressuserid");
            return (Criteria) this;
        }

        public Criteria andProgressuseridNotEqualTo(Integer value) {
            addCriterion("progressUserId <>", value, "progressuserid");
            return (Criteria) this;
        }

        public Criteria andProgressuseridGreaterThan(Integer value) {
            addCriterion("progressUserId >", value, "progressuserid");
            return (Criteria) this;
        }

        public Criteria andProgressuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("progressUserId >=", value, "progressuserid");
            return (Criteria) this;
        }

        public Criteria andProgressuseridLessThan(Integer value) {
            addCriterion("progressUserId <", value, "progressuserid");
            return (Criteria) this;
        }

        public Criteria andProgressuseridLessThanOrEqualTo(Integer value) {
            addCriterion("progressUserId <=", value, "progressuserid");
            return (Criteria) this;
        }

        public Criteria andProgressuseridIn(List<Integer> values) {
            addCriterion("progressUserId in", values, "progressuserid");
            return (Criteria) this;
        }

        public Criteria andProgressuseridNotIn(List<Integer> values) {
            addCriterion("progressUserId not in", values, "progressuserid");
            return (Criteria) this;
        }

        public Criteria andProgressuseridBetween(Integer value1, Integer value2) {
            addCriterion("progressUserId between", value1, value2, "progressuserid");
            return (Criteria) this;
        }

        public Criteria andProgressuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("progressUserId not between", value1, value2, "progressuserid");
            return (Criteria) this;
        }

        public Criteria andProgressbookidIsNull() {
            addCriterion("progressBookId is null");
            return (Criteria) this;
        }

        public Criteria andProgressbookidIsNotNull() {
            addCriterion("progressBookId is not null");
            return (Criteria) this;
        }

        public Criteria andProgressbookidEqualTo(Integer value) {
            addCriterion("progressBookId =", value, "progressbookid");
            return (Criteria) this;
        }

        public Criteria andProgressbookidNotEqualTo(Integer value) {
            addCriterion("progressBookId <>", value, "progressbookid");
            return (Criteria) this;
        }

        public Criteria andProgressbookidGreaterThan(Integer value) {
            addCriterion("progressBookId >", value, "progressbookid");
            return (Criteria) this;
        }

        public Criteria andProgressbookidGreaterThanOrEqualTo(Integer value) {
            addCriterion("progressBookId >=", value, "progressbookid");
            return (Criteria) this;
        }

        public Criteria andProgressbookidLessThan(Integer value) {
            addCriterion("progressBookId <", value, "progressbookid");
            return (Criteria) this;
        }

        public Criteria andProgressbookidLessThanOrEqualTo(Integer value) {
            addCriterion("progressBookId <=", value, "progressbookid");
            return (Criteria) this;
        }

        public Criteria andProgressbookidIn(List<Integer> values) {
            addCriterion("progressBookId in", values, "progressbookid");
            return (Criteria) this;
        }

        public Criteria andProgressbookidNotIn(List<Integer> values) {
            addCriterion("progressBookId not in", values, "progressbookid");
            return (Criteria) this;
        }

        public Criteria andProgressbookidBetween(Integer value1, Integer value2) {
            addCriterion("progressBookId between", value1, value2, "progressbookid");
            return (Criteria) this;
        }

        public Criteria andProgressbookidNotBetween(Integer value1, Integer value2) {
            addCriterion("progressBookId not between", value1, value2, "progressbookid");
            return (Criteria) this;
        }

        public Criteria andPageIsNull() {
            addCriterion("page is null");
            return (Criteria) this;
        }

        public Criteria andPageIsNotNull() {
            addCriterion("page is not null");
            return (Criteria) this;
        }

        public Criteria andPageEqualTo(Integer value) {
            addCriterion("page =", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotEqualTo(Integer value) {
            addCriterion("page <>", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageGreaterThan(Integer value) {
            addCriterion("page >", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageGreaterThanOrEqualTo(Integer value) {
            addCriterion("page >=", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLessThan(Integer value) {
            addCriterion("page <", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLessThanOrEqualTo(Integer value) {
            addCriterion("page <=", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageIn(List<Integer> values) {
            addCriterion("page in", values, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotIn(List<Integer> values) {
            addCriterion("page not in", values, "page");
            return (Criteria) this;
        }

        public Criteria andPageBetween(Integer value1, Integer value2) {
            addCriterion("page between", value1, value2, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotBetween(Integer value1, Integer value2) {
            addCriterion("page not between", value1, value2, "page");
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