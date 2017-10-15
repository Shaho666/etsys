package com.etsys.orm.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbScoreExample() {
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

        public Criteria andScoIdIsNull() {
            addCriterion("sco_id is null");
            return (Criteria) this;
        }

        public Criteria andScoIdIsNotNull() {
            addCriterion("sco_id is not null");
            return (Criteria) this;
        }

        public Criteria andScoIdEqualTo(String value) {
            addCriterion("sco_id =", value, "scoId");
            return (Criteria) this;
        }

        public Criteria andScoIdNotEqualTo(String value) {
            addCriterion("sco_id <>", value, "scoId");
            return (Criteria) this;
        }

        public Criteria andScoIdGreaterThan(String value) {
            addCriterion("sco_id >", value, "scoId");
            return (Criteria) this;
        }

        public Criteria andScoIdGreaterThanOrEqualTo(String value) {
            addCriterion("sco_id >=", value, "scoId");
            return (Criteria) this;
        }

        public Criteria andScoIdLessThan(String value) {
            addCriterion("sco_id <", value, "scoId");
            return (Criteria) this;
        }

        public Criteria andScoIdLessThanOrEqualTo(String value) {
            addCriterion("sco_id <=", value, "scoId");
            return (Criteria) this;
        }

        public Criteria andScoIdLike(String value) {
            addCriterion("sco_id like", value, "scoId");
            return (Criteria) this;
        }

        public Criteria andScoIdNotLike(String value) {
            addCriterion("sco_id not like", value, "scoId");
            return (Criteria) this;
        }

        public Criteria andScoIdIn(List<String> values) {
            addCriterion("sco_id in", values, "scoId");
            return (Criteria) this;
        }

        public Criteria andScoIdNotIn(List<String> values) {
            addCriterion("sco_id not in", values, "scoId");
            return (Criteria) this;
        }

        public Criteria andScoIdBetween(String value1, String value2) {
            addCriterion("sco_id between", value1, value2, "scoId");
            return (Criteria) this;
        }

        public Criteria andScoIdNotBetween(String value1, String value2) {
            addCriterion("sco_id not between", value1, value2, "scoId");
            return (Criteria) this;
        }

        public Criteria andTestIdIsNull() {
            addCriterion("test_id is null");
            return (Criteria) this;
        }

        public Criteria andTestIdIsNotNull() {
            addCriterion("test_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestIdEqualTo(String value) {
            addCriterion("test_id =", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotEqualTo(String value) {
            addCriterion("test_id <>", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdGreaterThan(String value) {
            addCriterion("test_id >", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdGreaterThanOrEqualTo(String value) {
            addCriterion("test_id >=", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLessThan(String value) {
            addCriterion("test_id <", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLessThanOrEqualTo(String value) {
            addCriterion("test_id <=", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLike(String value) {
            addCriterion("test_id like", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotLike(String value) {
            addCriterion("test_id not like", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdIn(List<String> values) {
            addCriterion("test_id in", values, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotIn(List<String> values) {
            addCriterion("test_id not in", values, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdBetween(String value1, String value2) {
            addCriterion("test_id between", value1, value2, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotBetween(String value1, String value2) {
            addCriterion("test_id not between", value1, value2, "testId");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(String value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(String value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(String value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(String value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(String value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(String value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLike(String value) {
            addCriterion("stu_id like", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotLike(String value) {
            addCriterion("stu_id not like", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<String> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<String> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(String value1, String value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(String value1, String value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andScoMarkIsNull() {
            addCriterion("sco_mark is null");
            return (Criteria) this;
        }

        public Criteria andScoMarkIsNotNull() {
            addCriterion("sco_mark is not null");
            return (Criteria) this;
        }

        public Criteria andScoMarkEqualTo(Double value) {
            addCriterion("sco_mark =", value, "scoMark");
            return (Criteria) this;
        }

        public Criteria andScoMarkNotEqualTo(Double value) {
            addCriterion("sco_mark <>", value, "scoMark");
            return (Criteria) this;
        }

        public Criteria andScoMarkGreaterThan(Double value) {
            addCriterion("sco_mark >", value, "scoMark");
            return (Criteria) this;
        }

        public Criteria andScoMarkGreaterThanOrEqualTo(Double value) {
            addCriterion("sco_mark >=", value, "scoMark");
            return (Criteria) this;
        }

        public Criteria andScoMarkLessThan(Double value) {
            addCriterion("sco_mark <", value, "scoMark");
            return (Criteria) this;
        }

        public Criteria andScoMarkLessThanOrEqualTo(Double value) {
            addCriterion("sco_mark <=", value, "scoMark");
            return (Criteria) this;
        }

        public Criteria andScoMarkIn(List<Double> values) {
            addCriterion("sco_mark in", values, "scoMark");
            return (Criteria) this;
        }

        public Criteria andScoMarkNotIn(List<Double> values) {
            addCriterion("sco_mark not in", values, "scoMark");
            return (Criteria) this;
        }

        public Criteria andScoMarkBetween(Double value1, Double value2) {
            addCriterion("sco_mark between", value1, value2, "scoMark");
            return (Criteria) this;
        }

        public Criteria andScoMarkNotBetween(Double value1, Double value2) {
            addCriterion("sco_mark not between", value1, value2, "scoMark");
            return (Criteria) this;
        }

        public Criteria andScoTypeIsNull() {
            addCriterion("sco_type is null");
            return (Criteria) this;
        }

        public Criteria andScoTypeIsNotNull() {
            addCriterion("sco_type is not null");
            return (Criteria) this;
        }

        public Criteria andScoTypeEqualTo(Integer value) {
            addCriterion("sco_type =", value, "scoType");
            return (Criteria) this;
        }

        public Criteria andScoTypeNotEqualTo(Integer value) {
            addCriterion("sco_type <>", value, "scoType");
            return (Criteria) this;
        }

        public Criteria andScoTypeGreaterThan(Integer value) {
            addCriterion("sco_type >", value, "scoType");
            return (Criteria) this;
        }

        public Criteria andScoTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sco_type >=", value, "scoType");
            return (Criteria) this;
        }

        public Criteria andScoTypeLessThan(Integer value) {
            addCriterion("sco_type <", value, "scoType");
            return (Criteria) this;
        }

        public Criteria andScoTypeLessThanOrEqualTo(Integer value) {
            addCriterion("sco_type <=", value, "scoType");
            return (Criteria) this;
        }

        public Criteria andScoTypeIn(List<Integer> values) {
            addCriterion("sco_type in", values, "scoType");
            return (Criteria) this;
        }

        public Criteria andScoTypeNotIn(List<Integer> values) {
            addCriterion("sco_type not in", values, "scoType");
            return (Criteria) this;
        }

        public Criteria andScoTypeBetween(Integer value1, Integer value2) {
            addCriterion("sco_type between", value1, value2, "scoType");
            return (Criteria) this;
        }

        public Criteria andScoTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("sco_type not between", value1, value2, "scoType");
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