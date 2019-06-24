package com.j1902.shopping.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EvaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluateExample() {
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

        public Criteria andEvalIdIsNull() {
            addCriterion("eval_id is null");
            return (Criteria) this;
        }

        public Criteria andEvalIdIsNotNull() {
            addCriterion("eval_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvalIdEqualTo(Integer value) {
            addCriterion("eval_id =", value, "evalId");
            return (Criteria) this;
        }

        public Criteria andEvalIdNotEqualTo(Integer value) {
            addCriterion("eval_id <>", value, "evalId");
            return (Criteria) this;
        }

        public Criteria andEvalIdGreaterThan(Integer value) {
            addCriterion("eval_id >", value, "evalId");
            return (Criteria) this;
        }

        public Criteria andEvalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("eval_id >=", value, "evalId");
            return (Criteria) this;
        }

        public Criteria andEvalIdLessThan(Integer value) {
            addCriterion("eval_id <", value, "evalId");
            return (Criteria) this;
        }

        public Criteria andEvalIdLessThanOrEqualTo(Integer value) {
            addCriterion("eval_id <=", value, "evalId");
            return (Criteria) this;
        }

        public Criteria andEvalIdIn(List<Integer> values) {
            addCriterion("eval_id in", values, "evalId");
            return (Criteria) this;
        }

        public Criteria andEvalIdNotIn(List<Integer> values) {
            addCriterion("eval_id not in", values, "evalId");
            return (Criteria) this;
        }

        public Criteria andEvalIdBetween(Integer value1, Integer value2) {
            addCriterion("eval_id between", value1, value2, "evalId");
            return (Criteria) this;
        }

        public Criteria andEvalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("eval_id not between", value1, value2, "evalId");
            return (Criteria) this;
        }

        public Criteria andEvalUserIdIsNull() {
            addCriterion("eval_user_id is null");
            return (Criteria) this;
        }

        public Criteria andEvalUserIdIsNotNull() {
            addCriterion("eval_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvalUserIdEqualTo(Integer value) {
            addCriterion("eval_user_id =", value, "evalUserId");
            return (Criteria) this;
        }

        public Criteria andEvalUserIdNotEqualTo(Integer value) {
            addCriterion("eval_user_id <>", value, "evalUserId");
            return (Criteria) this;
        }

        public Criteria andEvalUserIdGreaterThan(Integer value) {
            addCriterion("eval_user_id >", value, "evalUserId");
            return (Criteria) this;
        }

        public Criteria andEvalUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("eval_user_id >=", value, "evalUserId");
            return (Criteria) this;
        }

        public Criteria andEvalUserIdLessThan(Integer value) {
            addCriterion("eval_user_id <", value, "evalUserId");
            return (Criteria) this;
        }

        public Criteria andEvalUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("eval_user_id <=", value, "evalUserId");
            return (Criteria) this;
        }

        public Criteria andEvalUserIdIn(List<Integer> values) {
            addCriterion("eval_user_id in", values, "evalUserId");
            return (Criteria) this;
        }

        public Criteria andEvalUserIdNotIn(List<Integer> values) {
            addCriterion("eval_user_id not in", values, "evalUserId");
            return (Criteria) this;
        }

        public Criteria andEvalUserIdBetween(Integer value1, Integer value2) {
            addCriterion("eval_user_id between", value1, value2, "evalUserId");
            return (Criteria) this;
        }

        public Criteria andEvalUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("eval_user_id not between", value1, value2, "evalUserId");
            return (Criteria) this;
        }

        public Criteria andEvalItemIdIsNull() {
            addCriterion("eval_item_id is null");
            return (Criteria) this;
        }

        public Criteria andEvalItemIdIsNotNull() {
            addCriterion("eval_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvalItemIdEqualTo(Integer value) {
            addCriterion("eval_item_id =", value, "evalItemId");
            return (Criteria) this;
        }

        public Criteria andEvalItemIdNotEqualTo(Integer value) {
            addCriterion("eval_item_id <>", value, "evalItemId");
            return (Criteria) this;
        }

        public Criteria andEvalItemIdGreaterThan(Integer value) {
            addCriterion("eval_item_id >", value, "evalItemId");
            return (Criteria) this;
        }

        public Criteria andEvalItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("eval_item_id >=", value, "evalItemId");
            return (Criteria) this;
        }

        public Criteria andEvalItemIdLessThan(Integer value) {
            addCriterion("eval_item_id <", value, "evalItemId");
            return (Criteria) this;
        }

        public Criteria andEvalItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("eval_item_id <=", value, "evalItemId");
            return (Criteria) this;
        }

        public Criteria andEvalItemIdIn(List<Integer> values) {
            addCriterion("eval_item_id in", values, "evalItemId");
            return (Criteria) this;
        }

        public Criteria andEvalItemIdNotIn(List<Integer> values) {
            addCriterion("eval_item_id not in", values, "evalItemId");
            return (Criteria) this;
        }

        public Criteria andEvalItemIdBetween(Integer value1, Integer value2) {
            addCriterion("eval_item_id between", value1, value2, "evalItemId");
            return (Criteria) this;
        }

        public Criteria andEvalItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("eval_item_id not between", value1, value2, "evalItemId");
            return (Criteria) this;
        }

        public Criteria andEvalItemNameIsNull() {
            addCriterion("eval_item_name is null");
            return (Criteria) this;
        }

        public Criteria andEvalItemNameIsNotNull() {
            addCriterion("eval_item_name is not null");
            return (Criteria) this;
        }

        public Criteria andEvalItemNameEqualTo(String value) {
            addCriterion("eval_item_name =", value, "evalItemName");
            return (Criteria) this;
        }

        public Criteria andEvalItemNameNotEqualTo(String value) {
            addCriterion("eval_item_name <>", value, "evalItemName");
            return (Criteria) this;
        }

        public Criteria andEvalItemNameGreaterThan(String value) {
            addCriterion("eval_item_name >", value, "evalItemName");
            return (Criteria) this;
        }

        public Criteria andEvalItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("eval_item_name >=", value, "evalItemName");
            return (Criteria) this;
        }

        public Criteria andEvalItemNameLessThan(String value) {
            addCriterion("eval_item_name <", value, "evalItemName");
            return (Criteria) this;
        }

        public Criteria andEvalItemNameLessThanOrEqualTo(String value) {
            addCriterion("eval_item_name <=", value, "evalItemName");
            return (Criteria) this;
        }

        public Criteria andEvalItemNameLike(String value) {
            addCriterion("eval_item_name like", value, "evalItemName");
            return (Criteria) this;
        }

        public Criteria andEvalItemNameNotLike(String value) {
            addCriterion("eval_item_name not like", value, "evalItemName");
            return (Criteria) this;
        }

        public Criteria andEvalItemNameIn(List<String> values) {
            addCriterion("eval_item_name in", values, "evalItemName");
            return (Criteria) this;
        }

        public Criteria andEvalItemNameNotIn(List<String> values) {
            addCriterion("eval_item_name not in", values, "evalItemName");
            return (Criteria) this;
        }

        public Criteria andEvalItemNameBetween(String value1, String value2) {
            addCriterion("eval_item_name between", value1, value2, "evalItemName");
            return (Criteria) this;
        }

        public Criteria andEvalItemNameNotBetween(String value1, String value2) {
            addCriterion("eval_item_name not between", value1, value2, "evalItemName");
            return (Criteria) this;
        }

        public Criteria andEvalCreateTimeIsNull() {
            addCriterion("eval_create_time is null");
            return (Criteria) this;
        }

        public Criteria andEvalCreateTimeIsNotNull() {
            addCriterion("eval_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andEvalCreateTimeEqualTo(Date value) {
            addCriterion("eval_create_time =", value, "evalCreateTime");
            return (Criteria) this;
        }

        public Criteria andEvalCreateTimeNotEqualTo(Date value) {
            addCriterion("eval_create_time <>", value, "evalCreateTime");
            return (Criteria) this;
        }

        public Criteria andEvalCreateTimeGreaterThan(Date value) {
            addCriterion("eval_create_time >", value, "evalCreateTime");
            return (Criteria) this;
        }

        public Criteria andEvalCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("eval_create_time >=", value, "evalCreateTime");
            return (Criteria) this;
        }

        public Criteria andEvalCreateTimeLessThan(Date value) {
            addCriterion("eval_create_time <", value, "evalCreateTime");
            return (Criteria) this;
        }

        public Criteria andEvalCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("eval_create_time <=", value, "evalCreateTime");
            return (Criteria) this;
        }

        public Criteria andEvalCreateTimeIn(List<Date> values) {
            addCriterion("eval_create_time in", values, "evalCreateTime");
            return (Criteria) this;
        }

        public Criteria andEvalCreateTimeNotIn(List<Date> values) {
            addCriterion("eval_create_time not in", values, "evalCreateTime");
            return (Criteria) this;
        }

        public Criteria andEvalCreateTimeBetween(Date value1, Date value2) {
            addCriterion("eval_create_time between", value1, value2, "evalCreateTime");
            return (Criteria) this;
        }

        public Criteria andEvalCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("eval_create_time not between", value1, value2, "evalCreateTime");
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