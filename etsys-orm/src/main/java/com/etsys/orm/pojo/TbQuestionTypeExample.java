package com.etsys.orm.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbQuestionTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbQuestionTypeExample() {
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

        public Criteria andQtIdIsNull() {
            addCriterion("qt_id is null");
            return (Criteria) this;
        }

        public Criteria andQtIdIsNotNull() {
            addCriterion("qt_id is not null");
            return (Criteria) this;
        }

        public Criteria andQtIdEqualTo(Integer value) {
            addCriterion("qt_id =", value, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdNotEqualTo(Integer value) {
            addCriterion("qt_id <>", value, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdGreaterThan(Integer value) {
            addCriterion("qt_id >", value, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("qt_id >=", value, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdLessThan(Integer value) {
            addCriterion("qt_id <", value, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdLessThanOrEqualTo(Integer value) {
            addCriterion("qt_id <=", value, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdIn(List<Integer> values) {
            addCriterion("qt_id in", values, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdNotIn(List<Integer> values) {
            addCriterion("qt_id not in", values, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdBetween(Integer value1, Integer value2) {
            addCriterion("qt_id between", value1, value2, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("qt_id not between", value1, value2, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtNameIsNull() {
            addCriterion("qt_name is null");
            return (Criteria) this;
        }

        public Criteria andQtNameIsNotNull() {
            addCriterion("qt_name is not null");
            return (Criteria) this;
        }

        public Criteria andQtNameEqualTo(String value) {
            addCriterion("qt_name =", value, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameNotEqualTo(String value) {
            addCriterion("qt_name <>", value, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameGreaterThan(String value) {
            addCriterion("qt_name >", value, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameGreaterThanOrEqualTo(String value) {
            addCriterion("qt_name >=", value, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameLessThan(String value) {
            addCriterion("qt_name <", value, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameLessThanOrEqualTo(String value) {
            addCriterion("qt_name <=", value, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameLike(String value) {
            addCriterion("qt_name like", value, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameNotLike(String value) {
            addCriterion("qt_name not like", value, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameIn(List<String> values) {
            addCriterion("qt_name in", values, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameNotIn(List<String> values) {
            addCriterion("qt_name not in", values, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameBetween(String value1, String value2) {
            addCriterion("qt_name between", value1, value2, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameNotBetween(String value1, String value2) {
            addCriterion("qt_name not between", value1, value2, "qtName");
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