package com.bruce.bean;

import java.util.ArrayList;
import java.util.List;

public class PostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostExample() {
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

        public Criteria andPostidIsNull() {
            addCriterion("postId is null");
            return (Criteria) this;
        }

        public Criteria andPostidIsNotNull() {
            addCriterion("postId is not null");
            return (Criteria) this;
        }

        public Criteria andPostidEqualTo(Integer value) {
            addCriterion("postId =", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotEqualTo(Integer value) {
            addCriterion("postId <>", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThan(Integer value) {
            addCriterion("postId >", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThanOrEqualTo(Integer value) {
            addCriterion("postId >=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThan(Integer value) {
            addCriterion("postId <", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThanOrEqualTo(Integer value) {
            addCriterion("postId <=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidIn(List<Integer> values) {
            addCriterion("postId in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotIn(List<Integer> values) {
            addCriterion("postId not in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidBetween(Integer value1, Integer value2) {
            addCriterion("postId between", value1, value2, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotBetween(Integer value1, Integer value2) {
            addCriterion("postId not between", value1, value2, "postid");
            return (Criteria) this;
        }

        public Criteria andPosttitleIsNull() {
            addCriterion("postTitle is null");
            return (Criteria) this;
        }

        public Criteria andPosttitleIsNotNull() {
            addCriterion("postTitle is not null");
            return (Criteria) this;
        }

        public Criteria andPosttitleEqualTo(String value) {
            addCriterion("postTitle =", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleNotEqualTo(String value) {
            addCriterion("postTitle <>", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleGreaterThan(String value) {
            addCriterion("postTitle >", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleGreaterThanOrEqualTo(String value) {
            addCriterion("postTitle >=", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleLessThan(String value) {
            addCriterion("postTitle <", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleLessThanOrEqualTo(String value) {
            addCriterion("postTitle <=", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleLike(String value) {
            addCriterion("postTitle like", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleNotLike(String value) {
            addCriterion("postTitle not like", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleIn(List<String> values) {
            addCriterion("postTitle in", values, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleNotIn(List<String> values) {
            addCriterion("postTitle not in", values, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleBetween(String value1, String value2) {
            addCriterion("postTitle between", value1, value2, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleNotBetween(String value1, String value2) {
            addCriterion("postTitle not between", value1, value2, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPostbodyIsNull() {
            addCriterion("postBody is null");
            return (Criteria) this;
        }

        public Criteria andPostbodyIsNotNull() {
            addCriterion("postBody is not null");
            return (Criteria) this;
        }

        public Criteria andPostbodyEqualTo(String value) {
            addCriterion("postBody =", value, "postbody");
            return (Criteria) this;
        }

        public Criteria andPostbodyNotEqualTo(String value) {
            addCriterion("postBody <>", value, "postbody");
            return (Criteria) this;
        }

        public Criteria andPostbodyGreaterThan(String value) {
            addCriterion("postBody >", value, "postbody");
            return (Criteria) this;
        }

        public Criteria andPostbodyGreaterThanOrEqualTo(String value) {
            addCriterion("postBody >=", value, "postbody");
            return (Criteria) this;
        }

        public Criteria andPostbodyLessThan(String value) {
            addCriterion("postBody <", value, "postbody");
            return (Criteria) this;
        }

        public Criteria andPostbodyLessThanOrEqualTo(String value) {
            addCriterion("postBody <=", value, "postbody");
            return (Criteria) this;
        }

        public Criteria andPostbodyLike(String value) {
            addCriterion("postBody like", value, "postbody");
            return (Criteria) this;
        }

        public Criteria andPostbodyNotLike(String value) {
            addCriterion("postBody not like", value, "postbody");
            return (Criteria) this;
        }

        public Criteria andPostbodyIn(List<String> values) {
            addCriterion("postBody in", values, "postbody");
            return (Criteria) this;
        }

        public Criteria andPostbodyNotIn(List<String> values) {
            addCriterion("postBody not in", values, "postbody");
            return (Criteria) this;
        }

        public Criteria andPostbodyBetween(String value1, String value2) {
            addCriterion("postBody between", value1, value2, "postbody");
            return (Criteria) this;
        }

        public Criteria andPostbodyNotBetween(String value1, String value2) {
            addCriterion("postBody not between", value1, value2, "postbody");
            return (Criteria) this;
        }

        public Criteria andPostuseridIsNull() {
            addCriterion("postUserId is null");
            return (Criteria) this;
        }

        public Criteria andPostuseridIsNotNull() {
            addCriterion("postUserId is not null");
            return (Criteria) this;
        }

        public Criteria andPostuseridEqualTo(Integer value) {
            addCriterion("postUserId =", value, "postuserid");
            return (Criteria) this;
        }

        public Criteria andPostuseridNotEqualTo(Integer value) {
            addCriterion("postUserId <>", value, "postuserid");
            return (Criteria) this;
        }

        public Criteria andPostuseridGreaterThan(Integer value) {
            addCriterion("postUserId >", value, "postuserid");
            return (Criteria) this;
        }

        public Criteria andPostuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("postUserId >=", value, "postuserid");
            return (Criteria) this;
        }

        public Criteria andPostuseridLessThan(Integer value) {
            addCriterion("postUserId <", value, "postuserid");
            return (Criteria) this;
        }

        public Criteria andPostuseridLessThanOrEqualTo(Integer value) {
            addCriterion("postUserId <=", value, "postuserid");
            return (Criteria) this;
        }

        public Criteria andPostuseridIn(List<Integer> values) {
            addCriterion("postUserId in", values, "postuserid");
            return (Criteria) this;
        }

        public Criteria andPostuseridNotIn(List<Integer> values) {
            addCriterion("postUserId not in", values, "postuserid");
            return (Criteria) this;
        }

        public Criteria andPostuseridBetween(Integer value1, Integer value2) {
            addCriterion("postUserId between", value1, value2, "postuserid");
            return (Criteria) this;
        }

        public Criteria andPostuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("postUserId not between", value1, value2, "postuserid");
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