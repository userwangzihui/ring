package com.j1902.shopping.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdIsNull() {
            addCriterion("order_item_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdIsNotNull() {
            addCriterion("order_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdEqualTo(Integer value) {
            addCriterion("order_item_id =", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdNotEqualTo(Integer value) {
            addCriterion("order_item_id <>", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdGreaterThan(Integer value) {
            addCriterion("order_item_id >", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_item_id >=", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdLessThan(Integer value) {
            addCriterion("order_item_id <", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_item_id <=", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdIn(List<Integer> values) {
            addCriterion("order_item_id in", values, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdNotIn(List<Integer> values) {
            addCriterion("order_item_id not in", values, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdBetween(Integer value1, Integer value2) {
            addCriterion("order_item_id between", value1, value2, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_item_id not between", value1, value2, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNull() {
            addCriterion("order_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("order_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(Integer value) {
            addCriterion("order_number =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(Integer value) {
            addCriterion("order_number <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(Integer value) {
            addCriterion("order_number >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_number >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(Integer value) {
            addCriterion("order_number <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(Integer value) {
            addCriterion("order_number <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<Integer> values) {
            addCriterion("order_number in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<Integer> values) {
            addCriterion("order_number not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(Integer value1, Integer value2) {
            addCriterion("order_number between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("order_number not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNull() {
            addCriterion("order_money is null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNotNull() {
            addCriterion("order_money is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyEqualTo(Double value) {
            addCriterion("order_money =", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotEqualTo(Double value) {
            addCriterion("order_money <>", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThan(Double value) {
            addCriterion("order_money >", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("order_money >=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThan(Double value) {
            addCriterion("order_money <", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThanOrEqualTo(Double value) {
            addCriterion("order_money <=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIn(List<Double> values) {
            addCriterion("order_money in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotIn(List<Double> values) {
            addCriterion("order_money not in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyBetween(Double value1, Double value2) {
            addCriterion("order_money between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotBetween(Double value1, Double value2) {
            addCriterion("order_money not between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderCountIdIsNull() {
            addCriterion("order_count_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderCountIdIsNotNull() {
            addCriterion("order_count_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCountIdEqualTo(Integer value) {
            addCriterion("order_count_id =", value, "orderCountId");
            return (Criteria) this;
        }

        public Criteria andOrderCountIdNotEqualTo(Integer value) {
            addCriterion("order_count_id <>", value, "orderCountId");
            return (Criteria) this;
        }

        public Criteria andOrderCountIdGreaterThan(Integer value) {
            addCriterion("order_count_id >", value, "orderCountId");
            return (Criteria) this;
        }

        public Criteria andOrderCountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_count_id >=", value, "orderCountId");
            return (Criteria) this;
        }

        public Criteria andOrderCountIdLessThan(Integer value) {
            addCriterion("order_count_id <", value, "orderCountId");
            return (Criteria) this;
        }

        public Criteria andOrderCountIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_count_id <=", value, "orderCountId");
            return (Criteria) this;
        }

        public Criteria andOrderCountIdIn(List<Integer> values) {
            addCriterion("order_count_id in", values, "orderCountId");
            return (Criteria) this;
        }

        public Criteria andOrderCountIdNotIn(List<Integer> values) {
            addCriterion("order_count_id not in", values, "orderCountId");
            return (Criteria) this;
        }

        public Criteria andOrderCountIdBetween(Integer value1, Integer value2) {
            addCriterion("order_count_id between", value1, value2, "orderCountId");
            return (Criteria) this;
        }

        public Criteria andOrderCountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_count_id not between", value1, value2, "orderCountId");
            return (Criteria) this;
        }

        public Criteria andOrderItemnameIsNull() {
            addCriterion("order_itemname is null");
            return (Criteria) this;
        }

        public Criteria andOrderItemnameIsNotNull() {
            addCriterion("order_itemname is not null");
            return (Criteria) this;
        }

        public Criteria andOrderItemnameEqualTo(String value) {
            addCriterion("order_itemname =", value, "orderItemname");
            return (Criteria) this;
        }

        public Criteria andOrderItemnameNotEqualTo(String value) {
            addCriterion("order_itemname <>", value, "orderItemname");
            return (Criteria) this;
        }

        public Criteria andOrderItemnameGreaterThan(String value) {
            addCriterion("order_itemname >", value, "orderItemname");
            return (Criteria) this;
        }

        public Criteria andOrderItemnameGreaterThanOrEqualTo(String value) {
            addCriterion("order_itemname >=", value, "orderItemname");
            return (Criteria) this;
        }

        public Criteria andOrderItemnameLessThan(String value) {
            addCriterion("order_itemname <", value, "orderItemname");
            return (Criteria) this;
        }

        public Criteria andOrderItemnameLessThanOrEqualTo(String value) {
            addCriterion("order_itemname <=", value, "orderItemname");
            return (Criteria) this;
        }

        public Criteria andOrderItemnameLike(String value) {
            addCriterion("order_itemname like", value, "orderItemname");
            return (Criteria) this;
        }

        public Criteria andOrderItemnameNotLike(String value) {
            addCriterion("order_itemname not like", value, "orderItemname");
            return (Criteria) this;
        }

        public Criteria andOrderItemnameIn(List<String> values) {
            addCriterion("order_itemname in", values, "orderItemname");
            return (Criteria) this;
        }

        public Criteria andOrderItemnameNotIn(List<String> values) {
            addCriterion("order_itemname not in", values, "orderItemname");
            return (Criteria) this;
        }

        public Criteria andOrderItemnameBetween(String value1, String value2) {
            addCriterion("order_itemname between", value1, value2, "orderItemname");
            return (Criteria) this;
        }

        public Criteria andOrderItemnameNotBetween(String value1, String value2) {
            addCriterion("order_itemname not between", value1, value2, "orderItemname");
            return (Criteria) this;
        }

        public Criteria andOrderItemTypeIsNull() {
            addCriterion("order_item_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderItemTypeIsNotNull() {
            addCriterion("order_item_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderItemTypeEqualTo(String value) {
            addCriterion("order_item_type =", value, "orderItemType");
            return (Criteria) this;
        }

        public Criteria andOrderItemTypeNotEqualTo(String value) {
            addCriterion("order_item_type <>", value, "orderItemType");
            return (Criteria) this;
        }

        public Criteria andOrderItemTypeGreaterThan(String value) {
            addCriterion("order_item_type >", value, "orderItemType");
            return (Criteria) this;
        }

        public Criteria andOrderItemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_item_type >=", value, "orderItemType");
            return (Criteria) this;
        }

        public Criteria andOrderItemTypeLessThan(String value) {
            addCriterion("order_item_type <", value, "orderItemType");
            return (Criteria) this;
        }

        public Criteria andOrderItemTypeLessThanOrEqualTo(String value) {
            addCriterion("order_item_type <=", value, "orderItemType");
            return (Criteria) this;
        }

        public Criteria andOrderItemTypeLike(String value) {
            addCriterion("order_item_type like", value, "orderItemType");
            return (Criteria) this;
        }

        public Criteria andOrderItemTypeNotLike(String value) {
            addCriterion("order_item_type not like", value, "orderItemType");
            return (Criteria) this;
        }

        public Criteria andOrderItemTypeIn(List<String> values) {
            addCriterion("order_item_type in", values, "orderItemType");
            return (Criteria) this;
        }

        public Criteria andOrderItemTypeNotIn(List<String> values) {
            addCriterion("order_item_type not in", values, "orderItemType");
            return (Criteria) this;
        }

        public Criteria andOrderItemTypeBetween(String value1, String value2) {
            addCriterion("order_item_type between", value1, value2, "orderItemType");
            return (Criteria) this;
        }

        public Criteria andOrderItemTypeNotBetween(String value1, String value2) {
            addCriterion("order_item_type not between", value1, value2, "orderItemType");
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