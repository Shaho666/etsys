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

        public Criteria andTpIdIsNull() {
            addCriterion("tp_id is null");
            return (Criteria) this;
        }

        public Criteria andTpIdIsNotNull() {
            addCriterion("tp_id is not null");
            return (Criteria) this;
        }

        public Criteria andTpIdEqualTo(String value) {
            addCriterion("tp_id =", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdNotEqualTo(String value) {
            addCriterion("tp_id <>", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdGreaterThan(String value) {
            addCriterion("tp_id >", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdGreaterThanOrEqualTo(String value) {
            addCriterion("tp_id >=", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdLessThan(String value) {
            addCriterion("tp_id <", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdLessThanOrEqualTo(String value) {
            addCriterion("tp_id <=", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdLike(String value) {
            addCriterion("tp_id like", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdNotLike(String value) {
            addCriterion("tp_id not like", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdIn(List<String> values) {
            addCriterion("tp_id in", values, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdNotIn(List<String> values) {
            addCriterion("tp_id not in", values, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdBetween(String value1, String value2) {
            addCriterion("tp_id between", value1, value2, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdNotBetween(String value1, String value2) {
            addCriterion("tp_id not between", value1, value2, "tpId");
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

        public Criteria andScoMarkEqualTo(String value) {
            addCriterion("sco_mark =", value, "scoMark");
            return (Criteria) this;
        }

        public Criteria andScoMarkNotEqualTo(String value) {
            addCriterion("sco_mark <>", value, "scoMark");
            return (Criteria) this;
        }

        public Criteria andScoMarkGreaterThan(String value) {
            addCriterion("sco_mark >", value, "scoMark");
            return (Criteria) this;
        }

        public Criteria andScoMarkGreaterThanOrEqualTo(String value) {
            addCriterion("sco_mark >=", value, "scoMark");
            return (Criteria) this;
        }

        public Criteria andScoMarkLessThan(String value) {
            addCriterion("sco_mark <", value, "scoMark");
            return (Criteria) this;
        }

        public Criteria andScoMarkLessThanOrEqualTo(String value) {
            addCriterion("sco_mark <=", value, "scoMark");
            return (Criteria) this;
        }

        public Criteria andScoMarkLike(String value) {
            addCriterion("sco_mark like", value, "scoMark");
            return (Criteria) this;
        }

        public Criteria andScoMarkNotLike(String value) {
            addCriterion("sco_mark not like", value, "scoMark");
            return (Criteria) this;
        }

        public Criteria andScoMarkIn(List<String> values) {
            addCriterion("sco_mark in", values, "scoMark");
            return (Criteria) this;
        }

        public Criteria andScoMarkNotIn(List<String> values) {
            addCriterion("sco_mark not in", values, "scoMark");
            return (Criteria) this;
        }

        public Criteria andScoMarkBetween(String value1, String value2) {
            addCriterion("sco_mark between", value1, value2, "scoMark");
            return (Criteria) this;
        }

        public Criteria andScoMarkNotBetween(String value1, String value2) {
            addCriterion("sco_mark not between", value1, value2, "scoMark");
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