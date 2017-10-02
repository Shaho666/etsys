package com.etsys.orm.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbQuestionBankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbQuestionBankExample() {
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

        public Criteria andQueIdIsNull() {
            addCriterion("que_id is null");
            return (Criteria) this;
        }

        public Criteria andQueIdIsNotNull() {
            addCriterion("que_id is not null");
            return (Criteria) this;
        }

        public Criteria andQueIdEqualTo(String value) {
            addCriterion("que_id =", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdNotEqualTo(String value) {
            addCriterion("que_id <>", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdGreaterThan(String value) {
            addCriterion("que_id >", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdGreaterThanOrEqualTo(String value) {
            addCriterion("que_id >=", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdLessThan(String value) {
            addCriterion("que_id <", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdLessThanOrEqualTo(String value) {
            addCriterion("que_id <=", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdLike(String value) {
            addCriterion("que_id like", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdNotLike(String value) {
            addCriterion("que_id not like", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdIn(List<String> values) {
            addCriterion("que_id in", values, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdNotIn(List<String> values) {
            addCriterion("que_id not in", values, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdBetween(String value1, String value2) {
            addCriterion("que_id between", value1, value2, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdNotBetween(String value1, String value2) {
            addCriterion("que_id not between", value1, value2, "queId");
            return (Criteria) this;
        }

        public Criteria andQueTypeIsNull() {
            addCriterion("que_type is null");
            return (Criteria) this;
        }

        public Criteria andQueTypeIsNotNull() {
            addCriterion("que_type is not null");
            return (Criteria) this;
        }

        public Criteria andQueTypeEqualTo(Integer value) {
            addCriterion("que_type =", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeNotEqualTo(Integer value) {
            addCriterion("que_type <>", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeGreaterThan(Integer value) {
            addCriterion("que_type >", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("que_type >=", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeLessThan(Integer value) {
            addCriterion("que_type <", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeLessThanOrEqualTo(Integer value) {
            addCriterion("que_type <=", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeIn(List<Integer> values) {
            addCriterion("que_type in", values, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeNotIn(List<Integer> values) {
            addCriterion("que_type not in", values, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeBetween(Integer value1, Integer value2) {
            addCriterion("que_type between", value1, value2, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("que_type not between", value1, value2, "queType");
            return (Criteria) this;
        }

        public Criteria andQueDegreeIsNull() {
            addCriterion("que_degree is null");
            return (Criteria) this;
        }

        public Criteria andQueDegreeIsNotNull() {
            addCriterion("que_degree is not null");
            return (Criteria) this;
        }

        public Criteria andQueDegreeEqualTo(Integer value) {
            addCriterion("que_degree =", value, "queDegree");
            return (Criteria) this;
        }

        public Criteria andQueDegreeNotEqualTo(Integer value) {
            addCriterion("que_degree <>", value, "queDegree");
            return (Criteria) this;
        }

        public Criteria andQueDegreeGreaterThan(Integer value) {
            addCriterion("que_degree >", value, "queDegree");
            return (Criteria) this;
        }

        public Criteria andQueDegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("que_degree >=", value, "queDegree");
            return (Criteria) this;
        }

        public Criteria andQueDegreeLessThan(Integer value) {
            addCriterion("que_degree <", value, "queDegree");
            return (Criteria) this;
        }

        public Criteria andQueDegreeLessThanOrEqualTo(Integer value) {
            addCriterion("que_degree <=", value, "queDegree");
            return (Criteria) this;
        }

        public Criteria andQueDegreeIn(List<Integer> values) {
            addCriterion("que_degree in", values, "queDegree");
            return (Criteria) this;
        }

        public Criteria andQueDegreeNotIn(List<Integer> values) {
            addCriterion("que_degree not in", values, "queDegree");
            return (Criteria) this;
        }

        public Criteria andQueDegreeBetween(Integer value1, Integer value2) {
            addCriterion("que_degree between", value1, value2, "queDegree");
            return (Criteria) this;
        }

        public Criteria andQueDegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("que_degree not between", value1, value2, "queDegree");
            return (Criteria) this;
        }

        public Criteria andQueStateIsNull() {
            addCriterion("que_state is null");
            return (Criteria) this;
        }

        public Criteria andQueStateIsNotNull() {
            addCriterion("que_state is not null");
            return (Criteria) this;
        }

        public Criteria andQueStateEqualTo(Integer value) {
            addCriterion("que_state =", value, "queState");
            return (Criteria) this;
        }

        public Criteria andQueStateNotEqualTo(Integer value) {
            addCriterion("que_state <>", value, "queState");
            return (Criteria) this;
        }

        public Criteria andQueStateGreaterThan(Integer value) {
            addCriterion("que_state >", value, "queState");
            return (Criteria) this;
        }

        public Criteria andQueStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("que_state >=", value, "queState");
            return (Criteria) this;
        }

        public Criteria andQueStateLessThan(Integer value) {
            addCriterion("que_state <", value, "queState");
            return (Criteria) this;
        }

        public Criteria andQueStateLessThanOrEqualTo(Integer value) {
            addCriterion("que_state <=", value, "queState");
            return (Criteria) this;
        }

        public Criteria andQueStateIn(List<Integer> values) {
            addCriterion("que_state in", values, "queState");
            return (Criteria) this;
        }

        public Criteria andQueStateNotIn(List<Integer> values) {
            addCriterion("que_state not in", values, "queState");
            return (Criteria) this;
        }

        public Criteria andQueStateBetween(Integer value1, Integer value2) {
            addCriterion("que_state between", value1, value2, "queState");
            return (Criteria) this;
        }

        public Criteria andQueStateNotBetween(Integer value1, Integer value2) {
            addCriterion("que_state not between", value1, value2, "queState");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(String value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(String value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(String value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(String value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(String value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(String value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLike(String value) {
            addCriterion("course_id like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotLike(String value) {
            addCriterion("course_id not like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<String> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<String> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(String value1, String value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(String value1, String value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
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