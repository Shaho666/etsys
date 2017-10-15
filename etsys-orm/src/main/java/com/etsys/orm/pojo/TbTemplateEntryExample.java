package com.etsys.orm.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbTemplateEntryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbTemplateEntryExample() {
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

        public Criteria andTemEntryIdIsNull() {
            addCriterion("tem_entry_id is null");
            return (Criteria) this;
        }

        public Criteria andTemEntryIdIsNotNull() {
            addCriterion("tem_entry_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemEntryIdEqualTo(Integer value) {
            addCriterion("tem_entry_id =", value, "temEntryId");
            return (Criteria) this;
        }

        public Criteria andTemEntryIdNotEqualTo(Integer value) {
            addCriterion("tem_entry_id <>", value, "temEntryId");
            return (Criteria) this;
        }

        public Criteria andTemEntryIdGreaterThan(Integer value) {
            addCriterion("tem_entry_id >", value, "temEntryId");
            return (Criteria) this;
        }

        public Criteria andTemEntryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tem_entry_id >=", value, "temEntryId");
            return (Criteria) this;
        }

        public Criteria andTemEntryIdLessThan(Integer value) {
            addCriterion("tem_entry_id <", value, "temEntryId");
            return (Criteria) this;
        }

        public Criteria andTemEntryIdLessThanOrEqualTo(Integer value) {
            addCriterion("tem_entry_id <=", value, "temEntryId");
            return (Criteria) this;
        }

        public Criteria andTemEntryIdIn(List<Integer> values) {
            addCriterion("tem_entry_id in", values, "temEntryId");
            return (Criteria) this;
        }

        public Criteria andTemEntryIdNotIn(List<Integer> values) {
            addCriterion("tem_entry_id not in", values, "temEntryId");
            return (Criteria) this;
        }

        public Criteria andTemEntryIdBetween(Integer value1, Integer value2) {
            addCriterion("tem_entry_id between", value1, value2, "temEntryId");
            return (Criteria) this;
        }

        public Criteria andTemEntryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tem_entry_id not between", value1, value2, "temEntryId");
            return (Criteria) this;
        }

        public Criteria andTemIdIsNull() {
            addCriterion("tem_id is null");
            return (Criteria) this;
        }

        public Criteria andTemIdIsNotNull() {
            addCriterion("tem_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemIdEqualTo(String value) {
            addCriterion("tem_id =", value, "temId");
            return (Criteria) this;
        }

        public Criteria andTemIdNotEqualTo(String value) {
            addCriterion("tem_id <>", value, "temId");
            return (Criteria) this;
        }

        public Criteria andTemIdGreaterThan(String value) {
            addCriterion("tem_id >", value, "temId");
            return (Criteria) this;
        }

        public Criteria andTemIdGreaterThanOrEqualTo(String value) {
            addCriterion("tem_id >=", value, "temId");
            return (Criteria) this;
        }

        public Criteria andTemIdLessThan(String value) {
            addCriterion("tem_id <", value, "temId");
            return (Criteria) this;
        }

        public Criteria andTemIdLessThanOrEqualTo(String value) {
            addCriterion("tem_id <=", value, "temId");
            return (Criteria) this;
        }

        public Criteria andTemIdLike(String value) {
            addCriterion("tem_id like", value, "temId");
            return (Criteria) this;
        }

        public Criteria andTemIdNotLike(String value) {
            addCriterion("tem_id not like", value, "temId");
            return (Criteria) this;
        }

        public Criteria andTemIdIn(List<String> values) {
            addCriterion("tem_id in", values, "temId");
            return (Criteria) this;
        }

        public Criteria andTemIdNotIn(List<String> values) {
            addCriterion("tem_id not in", values, "temId");
            return (Criteria) this;
        }

        public Criteria andTemIdBetween(String value1, String value2) {
            addCriterion("tem_id between", value1, value2, "temId");
            return (Criteria) this;
        }

        public Criteria andTemIdNotBetween(String value1, String value2) {
            addCriterion("tem_id not between", value1, value2, "temId");
            return (Criteria) this;
        }

        public Criteria andTemTypeIsNull() {
            addCriterion("tem_type is null");
            return (Criteria) this;
        }

        public Criteria andTemTypeIsNotNull() {
            addCriterion("tem_type is not null");
            return (Criteria) this;
        }

        public Criteria andTemTypeEqualTo(Integer value) {
            addCriterion("tem_type =", value, "temType");
            return (Criteria) this;
        }

        public Criteria andTemTypeNotEqualTo(Integer value) {
            addCriterion("tem_type <>", value, "temType");
            return (Criteria) this;
        }

        public Criteria andTemTypeGreaterThan(Integer value) {
            addCriterion("tem_type >", value, "temType");
            return (Criteria) this;
        }

        public Criteria andTemTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tem_type >=", value, "temType");
            return (Criteria) this;
        }

        public Criteria andTemTypeLessThan(Integer value) {
            addCriterion("tem_type <", value, "temType");
            return (Criteria) this;
        }

        public Criteria andTemTypeLessThanOrEqualTo(Integer value) {
            addCriterion("tem_type <=", value, "temType");
            return (Criteria) this;
        }

        public Criteria andTemTypeIn(List<Integer> values) {
            addCriterion("tem_type in", values, "temType");
            return (Criteria) this;
        }

        public Criteria andTemTypeNotIn(List<Integer> values) {
            addCriterion("tem_type not in", values, "temType");
            return (Criteria) this;
        }

        public Criteria andTemTypeBetween(Integer value1, Integer value2) {
            addCriterion("tem_type between", value1, value2, "temType");
            return (Criteria) this;
        }

        public Criteria andTemTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tem_type not between", value1, value2, "temType");
            return (Criteria) this;
        }

        public Criteria andTemNumIsNull() {
            addCriterion("tem_num is null");
            return (Criteria) this;
        }

        public Criteria andTemNumIsNotNull() {
            addCriterion("tem_num is not null");
            return (Criteria) this;
        }

        public Criteria andTemNumEqualTo(Integer value) {
            addCriterion("tem_num =", value, "temNum");
            return (Criteria) this;
        }

        public Criteria andTemNumNotEqualTo(Integer value) {
            addCriterion("tem_num <>", value, "temNum");
            return (Criteria) this;
        }

        public Criteria andTemNumGreaterThan(Integer value) {
            addCriterion("tem_num >", value, "temNum");
            return (Criteria) this;
        }

        public Criteria andTemNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("tem_num >=", value, "temNum");
            return (Criteria) this;
        }

        public Criteria andTemNumLessThan(Integer value) {
            addCriterion("tem_num <", value, "temNum");
            return (Criteria) this;
        }

        public Criteria andTemNumLessThanOrEqualTo(Integer value) {
            addCriterion("tem_num <=", value, "temNum");
            return (Criteria) this;
        }

        public Criteria andTemNumIn(List<Integer> values) {
            addCriterion("tem_num in", values, "temNum");
            return (Criteria) this;
        }

        public Criteria andTemNumNotIn(List<Integer> values) {
            addCriterion("tem_num not in", values, "temNum");
            return (Criteria) this;
        }

        public Criteria andTemNumBetween(Integer value1, Integer value2) {
            addCriterion("tem_num between", value1, value2, "temNum");
            return (Criteria) this;
        }

        public Criteria andTemNumNotBetween(Integer value1, Integer value2) {
            addCriterion("tem_num not between", value1, value2, "temNum");
            return (Criteria) this;
        }

        public Criteria andTemScoreIsNull() {
            addCriterion("tem_score is null");
            return (Criteria) this;
        }

        public Criteria andTemScoreIsNotNull() {
            addCriterion("tem_score is not null");
            return (Criteria) this;
        }

        public Criteria andTemScoreEqualTo(Double value) {
            addCriterion("tem_score =", value, "temScore");
            return (Criteria) this;
        }

        public Criteria andTemScoreNotEqualTo(Double value) {
            addCriterion("tem_score <>", value, "temScore");
            return (Criteria) this;
        }

        public Criteria andTemScoreGreaterThan(Double value) {
            addCriterion("tem_score >", value, "temScore");
            return (Criteria) this;
        }

        public Criteria andTemScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("tem_score >=", value, "temScore");
            return (Criteria) this;
        }

        public Criteria andTemScoreLessThan(Double value) {
            addCriterion("tem_score <", value, "temScore");
            return (Criteria) this;
        }

        public Criteria andTemScoreLessThanOrEqualTo(Double value) {
            addCriterion("tem_score <=", value, "temScore");
            return (Criteria) this;
        }

        public Criteria andTemScoreIn(List<Double> values) {
            addCriterion("tem_score in", values, "temScore");
            return (Criteria) this;
        }

        public Criteria andTemScoreNotIn(List<Double> values) {
            addCriterion("tem_score not in", values, "temScore");
            return (Criteria) this;
        }

        public Criteria andTemScoreBetween(Double value1, Double value2) {
            addCriterion("tem_score between", value1, value2, "temScore");
            return (Criteria) this;
        }

        public Criteria andTemScoreNotBetween(Double value1, Double value2) {
            addCriterion("tem_score not between", value1, value2, "temScore");
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