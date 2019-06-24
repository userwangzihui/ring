package com.j1902.shopping.pojo;

import java.util.ArrayList;
import java.util.List;

public class CartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CartExample() {
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

        public Criteria andCartIdIsNull() {
            addCriterion("cart_id is null");
            return (Criteria) this;
        }

        public Criteria andCartIdIsNotNull() {
            addCriterion("cart_id is not null");
            return (Criteria) this;
        }

        public Criteria andCartIdEqualTo(Integer value) {
            addCriterion("cart_id =", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotEqualTo(Integer value) {
            addCriterion("cart_id <>", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThan(Integer value) {
            addCriterion("cart_id >", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cart_id >=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThan(Integer value) {
            addCriterion("cart_id <", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThanOrEqualTo(Integer value) {
            addCriterion("cart_id <=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdIn(List<Integer> values) {
            addCriterion("cart_id in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotIn(List<Integer> values) {
            addCriterion("cart_id not in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdBetween(Integer value1, Integer value2) {
            addCriterion("cart_id between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cart_id not between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemNumberIsNull() {
            addCriterion("item_number is null");
            return (Criteria) this;
        }

        public Criteria andItemNumberIsNotNull() {
            addCriterion("item_number is not null");
            return (Criteria) this;
        }

        public Criteria andItemNumberEqualTo(Integer value) {
            addCriterion("item_number =", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberNotEqualTo(Integer value) {
            addCriterion("item_number <>", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberGreaterThan(Integer value) {
            addCriterion("item_number >", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_number >=", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberLessThan(Integer value) {
            addCriterion("item_number <", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberLessThanOrEqualTo(Integer value) {
            addCriterion("item_number <=", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberIn(List<Integer> values) {
            addCriterion("item_number in", values, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberNotIn(List<Integer> values) {
            addCriterion("item_number not in", values, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberBetween(Integer value1, Integer value2) {
            addCriterion("item_number between", value1, value2, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("item_number not between", value1, value2, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andCartItemNameIsNull() {
            addCriterion("cart_item_name is null");
            return (Criteria) this;
        }

        public Criteria andCartItemNameIsNotNull() {
            addCriterion("cart_item_name is not null");
            return (Criteria) this;
        }

        public Criteria andCartItemNameEqualTo(String value) {
            addCriterion("cart_item_name =", value, "cartItemName");
            return (Criteria) this;
        }

        public Criteria andCartItemNameNotEqualTo(String value) {
            addCriterion("cart_item_name <>", value, "cartItemName");
            return (Criteria) this;
        }

        public Criteria andCartItemNameGreaterThan(String value) {
            addCriterion("cart_item_name >", value, "cartItemName");
            return (Criteria) this;
        }

        public Criteria andCartItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("cart_item_name >=", value, "cartItemName");
            return (Criteria) this;
        }

        public Criteria andCartItemNameLessThan(String value) {
            addCriterion("cart_item_name <", value, "cartItemName");
            return (Criteria) this;
        }

        public Criteria andCartItemNameLessThanOrEqualTo(String value) {
            addCriterion("cart_item_name <=", value, "cartItemName");
            return (Criteria) this;
        }

        public Criteria andCartItemNameLike(String value) {
            addCriterion("cart_item_name like", value, "cartItemName");
            return (Criteria) this;
        }

        public Criteria andCartItemNameNotLike(String value) {
            addCriterion("cart_item_name not like", value, "cartItemName");
            return (Criteria) this;
        }

        public Criteria andCartItemNameIn(List<String> values) {
            addCriterion("cart_item_name in", values, "cartItemName");
            return (Criteria) this;
        }

        public Criteria andCartItemNameNotIn(List<String> values) {
            addCriterion("cart_item_name not in", values, "cartItemName");
            return (Criteria) this;
        }

        public Criteria andCartItemNameBetween(String value1, String value2) {
            addCriterion("cart_item_name between", value1, value2, "cartItemName");
            return (Criteria) this;
        }

        public Criteria andCartItemNameNotBetween(String value1, String value2) {
            addCriterion("cart_item_name not between", value1, value2, "cartItemName");
            return (Criteria) this;
        }

        public Criteria andCartItemMaterialIsNull() {
            addCriterion("cart_item_material is null");
            return (Criteria) this;
        }

        public Criteria andCartItemMaterialIsNotNull() {
            addCriterion("cart_item_material is not null");
            return (Criteria) this;
        }

        public Criteria andCartItemMaterialEqualTo(String value) {
            addCriterion("cart_item_material =", value, "cartItemMaterial");
            return (Criteria) this;
        }

        public Criteria andCartItemMaterialNotEqualTo(String value) {
            addCriterion("cart_item_material <>", value, "cartItemMaterial");
            return (Criteria) this;
        }

        public Criteria andCartItemMaterialGreaterThan(String value) {
            addCriterion("cart_item_material >", value, "cartItemMaterial");
            return (Criteria) this;
        }

        public Criteria andCartItemMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("cart_item_material >=", value, "cartItemMaterial");
            return (Criteria) this;
        }

        public Criteria andCartItemMaterialLessThan(String value) {
            addCriterion("cart_item_material <", value, "cartItemMaterial");
            return (Criteria) this;
        }

        public Criteria andCartItemMaterialLessThanOrEqualTo(String value) {
            addCriterion("cart_item_material <=", value, "cartItemMaterial");
            return (Criteria) this;
        }

        public Criteria andCartItemMaterialLike(String value) {
            addCriterion("cart_item_material like", value, "cartItemMaterial");
            return (Criteria) this;
        }

        public Criteria andCartItemMaterialNotLike(String value) {
            addCriterion("cart_item_material not like", value, "cartItemMaterial");
            return (Criteria) this;
        }

        public Criteria andCartItemMaterialIn(List<String> values) {
            addCriterion("cart_item_material in", values, "cartItemMaterial");
            return (Criteria) this;
        }

        public Criteria andCartItemMaterialNotIn(List<String> values) {
            addCriterion("cart_item_material not in", values, "cartItemMaterial");
            return (Criteria) this;
        }

        public Criteria andCartItemMaterialBetween(String value1, String value2) {
            addCriterion("cart_item_material between", value1, value2, "cartItemMaterial");
            return (Criteria) this;
        }

        public Criteria andCartItemMaterialNotBetween(String value1, String value2) {
            addCriterion("cart_item_material not between", value1, value2, "cartItemMaterial");
            return (Criteria) this;
        }

        public Criteria andCartItemSizeIsNull() {
            addCriterion("cart_item_size is null");
            return (Criteria) this;
        }

        public Criteria andCartItemSizeIsNotNull() {
            addCriterion("cart_item_size is not null");
            return (Criteria) this;
        }

        public Criteria andCartItemSizeEqualTo(String value) {
            addCriterion("cart_item_size =", value, "cartItemSize");
            return (Criteria) this;
        }

        public Criteria andCartItemSizeNotEqualTo(String value) {
            addCriterion("cart_item_size <>", value, "cartItemSize");
            return (Criteria) this;
        }

        public Criteria andCartItemSizeGreaterThan(String value) {
            addCriterion("cart_item_size >", value, "cartItemSize");
            return (Criteria) this;
        }

        public Criteria andCartItemSizeGreaterThanOrEqualTo(String value) {
            addCriterion("cart_item_size >=", value, "cartItemSize");
            return (Criteria) this;
        }

        public Criteria andCartItemSizeLessThan(String value) {
            addCriterion("cart_item_size <", value, "cartItemSize");
            return (Criteria) this;
        }

        public Criteria andCartItemSizeLessThanOrEqualTo(String value) {
            addCriterion("cart_item_size <=", value, "cartItemSize");
            return (Criteria) this;
        }

        public Criteria andCartItemSizeLike(String value) {
            addCriterion("cart_item_size like", value, "cartItemSize");
            return (Criteria) this;
        }

        public Criteria andCartItemSizeNotLike(String value) {
            addCriterion("cart_item_size not like", value, "cartItemSize");
            return (Criteria) this;
        }

        public Criteria andCartItemSizeIn(List<String> values) {
            addCriterion("cart_item_size in", values, "cartItemSize");
            return (Criteria) this;
        }

        public Criteria andCartItemSizeNotIn(List<String> values) {
            addCriterion("cart_item_size not in", values, "cartItemSize");
            return (Criteria) this;
        }

        public Criteria andCartItemSizeBetween(String value1, String value2) {
            addCriterion("cart_item_size between", value1, value2, "cartItemSize");
            return (Criteria) this;
        }

        public Criteria andCartItemSizeNotBetween(String value1, String value2) {
            addCriterion("cart_item_size not between", value1, value2, "cartItemSize");
            return (Criteria) this;
        }

        public Criteria andCartItemNumberIsNull() {
            addCriterion("cart_item_number is null");
            return (Criteria) this;
        }

        public Criteria andCartItemNumberIsNotNull() {
            addCriterion("cart_item_number is not null");
            return (Criteria) this;
        }

        public Criteria andCartItemNumberEqualTo(Integer value) {
            addCriterion("cart_item_number =", value, "cartItemNumber");
            return (Criteria) this;
        }

        public Criteria andCartItemNumberNotEqualTo(Integer value) {
            addCriterion("cart_item_number <>", value, "cartItemNumber");
            return (Criteria) this;
        }

        public Criteria andCartItemNumberGreaterThan(Integer value) {
            addCriterion("cart_item_number >", value, "cartItemNumber");
            return (Criteria) this;
        }

        public Criteria andCartItemNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("cart_item_number >=", value, "cartItemNumber");
            return (Criteria) this;
        }

        public Criteria andCartItemNumberLessThan(Integer value) {
            addCriterion("cart_item_number <", value, "cartItemNumber");
            return (Criteria) this;
        }

        public Criteria andCartItemNumberLessThanOrEqualTo(Integer value) {
            addCriterion("cart_item_number <=", value, "cartItemNumber");
            return (Criteria) this;
        }

        public Criteria andCartItemNumberIn(List<Integer> values) {
            addCriterion("cart_item_number in", values, "cartItemNumber");
            return (Criteria) this;
        }

        public Criteria andCartItemNumberNotIn(List<Integer> values) {
            addCriterion("cart_item_number not in", values, "cartItemNumber");
            return (Criteria) this;
        }

        public Criteria andCartItemNumberBetween(Integer value1, Integer value2) {
            addCriterion("cart_item_number between", value1, value2, "cartItemNumber");
            return (Criteria) this;
        }

        public Criteria andCartItemNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("cart_item_number not between", value1, value2, "cartItemNumber");
            return (Criteria) this;
        }

        public Criteria andCartItemPriceIsNull() {
            addCriterion("cart_item_price is null");
            return (Criteria) this;
        }

        public Criteria andCartItemPriceIsNotNull() {
            addCriterion("cart_item_price is not null");
            return (Criteria) this;
        }

        public Criteria andCartItemPriceEqualTo(Double value) {
            addCriterion("cart_item_price =", value, "cartItemPrice");
            return (Criteria) this;
        }

        public Criteria andCartItemPriceNotEqualTo(Double value) {
            addCriterion("cart_item_price <>", value, "cartItemPrice");
            return (Criteria) this;
        }

        public Criteria andCartItemPriceGreaterThan(Double value) {
            addCriterion("cart_item_price >", value, "cartItemPrice");
            return (Criteria) this;
        }

        public Criteria andCartItemPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("cart_item_price >=", value, "cartItemPrice");
            return (Criteria) this;
        }

        public Criteria andCartItemPriceLessThan(Double value) {
            addCriterion("cart_item_price <", value, "cartItemPrice");
            return (Criteria) this;
        }

        public Criteria andCartItemPriceLessThanOrEqualTo(Double value) {
            addCriterion("cart_item_price <=", value, "cartItemPrice");
            return (Criteria) this;
        }

        public Criteria andCartItemPriceIn(List<Double> values) {
            addCriterion("cart_item_price in", values, "cartItemPrice");
            return (Criteria) this;
        }

        public Criteria andCartItemPriceNotIn(List<Double> values) {
            addCriterion("cart_item_price not in", values, "cartItemPrice");
            return (Criteria) this;
        }

        public Criteria andCartItemPriceBetween(Double value1, Double value2) {
            addCriterion("cart_item_price between", value1, value2, "cartItemPrice");
            return (Criteria) this;
        }

        public Criteria andCartItemPriceNotBetween(Double value1, Double value2) {
            addCriterion("cart_item_price not between", value1, value2, "cartItemPrice");
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