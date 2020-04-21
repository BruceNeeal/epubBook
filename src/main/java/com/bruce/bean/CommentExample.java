package com.bruce.bean;

import java.util.ArrayList;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCommentidIsNull() {
            addCriterion("commentId is null");
            return (Criteria) this;
        }

        public Criteria andCommentidIsNotNull() {
            addCriterion("commentId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentidEqualTo(Integer value) {
            addCriterion("commentId =", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotEqualTo(Integer value) {
            addCriterion("commentId <>", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThan(Integer value) {
            addCriterion("commentId >", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentId >=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThan(Integer value) {
            addCriterion("commentId <", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThanOrEqualTo(Integer value) {
            addCriterion("commentId <=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidIn(List<Integer> values) {
            addCriterion("commentId in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotIn(List<Integer> values) {
            addCriterion("commentId not in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidBetween(Integer value1, Integer value2) {
            addCriterion("commentId between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotBetween(Integer value1, Integer value2) {
            addCriterion("commentId not between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentbodyIsNull() {
            addCriterion("commentBody is null");
            return (Criteria) this;
        }

        public Criteria andCommentbodyIsNotNull() {
            addCriterion("commentBody is not null");
            return (Criteria) this;
        }

        public Criteria andCommentbodyEqualTo(String value) {
            addCriterion("commentBody =", value, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyNotEqualTo(String value) {
            addCriterion("commentBody <>", value, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyGreaterThan(String value) {
            addCriterion("commentBody >", value, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyGreaterThanOrEqualTo(String value) {
            addCriterion("commentBody >=", value, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyLessThan(String value) {
            addCriterion("commentBody <", value, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyLessThanOrEqualTo(String value) {
            addCriterion("commentBody <=", value, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyLike(String value) {
            addCriterion("commentBody like", value, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyNotLike(String value) {
            addCriterion("commentBody not like", value, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyIn(List<String> values) {
            addCriterion("commentBody in", values, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyNotIn(List<String> values) {
            addCriterion("commentBody not in", values, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyBetween(String value1, String value2) {
            addCriterion("commentBody between", value1, value2, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyNotBetween(String value1, String value2) {
            addCriterion("commentBody not between", value1, value2, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentuseridIsNull() {
            addCriterion("commentUserId is null");
            return (Criteria) this;
        }

        public Criteria andCommentuseridIsNotNull() {
            addCriterion("commentUserId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentuseridEqualTo(Integer value) {
            addCriterion("commentUserId =", value, "commentuserid");
            return (Criteria) this;
        }

        public Criteria andCommentuseridNotEqualTo(Integer value) {
            addCriterion("commentUserId <>", value, "commentuserid");
            return (Criteria) this;
        }

        public Criteria andCommentuseridGreaterThan(Integer value) {
            addCriterion("commentUserId >", value, "commentuserid");
            return (Criteria) this;
        }

        public Criteria andCommentuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentUserId >=", value, "commentuserid");
            return (Criteria) this;
        }

        public Criteria andCommentuseridLessThan(Integer value) {
            addCriterion("commentUserId <", value, "commentuserid");
            return (Criteria) this;
        }

        public Criteria andCommentuseridLessThanOrEqualTo(Integer value) {
            addCriterion("commentUserId <=", value, "commentuserid");
            return (Criteria) this;
        }

        public Criteria andCommentuseridIn(List<Integer> values) {
            addCriterion("commentUserId in", values, "commentuserid");
            return (Criteria) this;
        }

        public Criteria andCommentuseridNotIn(List<Integer> values) {
            addCriterion("commentUserId not in", values, "commentuserid");
            return (Criteria) this;
        }

        public Criteria andCommentuseridBetween(Integer value1, Integer value2) {
            addCriterion("commentUserId between", value1, value2, "commentuserid");
            return (Criteria) this;
        }

        public Criteria andCommentuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("commentUserId not between", value1, value2, "commentuserid");
            return (Criteria) this;
        }

        public Criteria andCommentpostidIsNull() {
            addCriterion("commentPostId is null");
            return (Criteria) this;
        }

        public Criteria andCommentpostidIsNotNull() {
            addCriterion("commentPostId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentpostidEqualTo(Integer value) {
            addCriterion("commentPostId =", value, "commentpostid");
            return (Criteria) this;
        }

        public Criteria andCommentpostidNotEqualTo(Integer value) {
            addCriterion("commentPostId <>", value, "commentpostid");
            return (Criteria) this;
        }

        public Criteria andCommentpostidGreaterThan(Integer value) {
            addCriterion("commentPostId >", value, "commentpostid");
            return (Criteria) this;
        }

        public Criteria andCommentpostidGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentPostId >=", value, "commentpostid");
            return (Criteria) this;
        }

        public Criteria andCommentpostidLessThan(Integer value) {
            addCriterion("commentPostId <", value, "commentpostid");
            return (Criteria) this;
        }

        public Criteria andCommentpostidLessThanOrEqualTo(Integer value) {
            addCriterion("commentPostId <=", value, "commentpostid");
            return (Criteria) this;
        }

        public Criteria andCommentpostidIn(List<Integer> values) {
            addCriterion("commentPostId in", values, "commentpostid");
            return (Criteria) this;
        }

        public Criteria andCommentpostidNotIn(List<Integer> values) {
            addCriterion("commentPostId not in", values, "commentpostid");
            return (Criteria) this;
        }

        public Criteria andCommentpostidBetween(Integer value1, Integer value2) {
            addCriterion("commentPostId between", value1, value2, "commentpostid");
            return (Criteria) this;
        }

        public Criteria andCommentpostidNotBetween(Integer value1, Integer value2) {
            addCriterion("commentPostId not between", value1, value2, "commentpostid");
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