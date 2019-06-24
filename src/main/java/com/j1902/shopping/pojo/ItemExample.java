package com.j1902.shopping.pojo;

import java.util.ArrayList;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemExample() {
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

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemSeriesIsNull() {
            addCriterion("item_series is null");
            return (Criteria) this;
        }

        public Criteria andItemSeriesIsNotNull() {
            addCriterion("item_series is not null");
            return (Criteria) this;
        }

        public Criteria andItemSeriesEqualTo(String value) {
            addCriterion("item_series =", value, "itemSeries");
            return (Criteria) this;
        }

        public Criteria andItemSeriesNotEqualTo(String value) {
            addCriterion("item_series <>", value, "itemSeries");
            return (Criteria) this;
        }

        public Criteria andItemSeriesGreaterThan(String value) {
            addCriterion("item_series >", value, "itemSeries");
            return (Criteria) this;
        }

        public Criteria andItemSeriesGreaterThanOrEqualTo(String value) {
            addCriterion("item_series >=", value, "itemSeries");
            return (Criteria) this;
        }

        public Criteria andItemSeriesLessThan(String value) {
            addCriterion("item_series <", value, "itemSeries");
            return (Criteria) this;
        }

        public Criteria andItemSeriesLessThanOrEqualTo(String value) {
            addCriterion("item_series <=", value, "itemSeries");
            return (Criteria) this;
        }

        public Criteria andItemSeriesLike(String value) {
            addCriterion("item_series like", value, "itemSeries");
            return (Criteria) this;
        }

        public Criteria andItemSeriesNotLike(String value) {
            addCriterion("item_series not like", value, "itemSeries");
            return (Criteria) this;
        }

        public Criteria andItemSeriesIn(List<String> values) {
            addCriterion("item_series in", values, "itemSeries");
            return (Criteria) this;
        }

        public Criteria andItemSeriesNotIn(List<String> values) {
            addCriterion("item_series not in", values, "itemSeries");
            return (Criteria) this;
        }

        public Criteria andItemSeriesBetween(String value1, String value2) {
            addCriterion("item_series between", value1, value2, "itemSeries");
            return (Criteria) this;
        }

        public Criteria andItemSeriesNotBetween(String value1, String value2) {
            addCriterion("item_series not between", value1, value2, "itemSeries");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNull() {
            addCriterion("item_type is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNotNull() {
            addCriterion("item_type is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeEqualTo(String value) {
            addCriterion("item_type =", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotEqualTo(String value) {
            addCriterion("item_type <>", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThan(String value) {
            addCriterion("item_type >", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("item_type >=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThan(String value) {
            addCriterion("item_type <", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThanOrEqualTo(String value) {
            addCriterion("item_type <=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLike(String value) {
            addCriterion("item_type like", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotLike(String value) {
            addCriterion("item_type not like", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeIn(List<String> values) {
            addCriterion("item_type in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotIn(List<String> values) {
            addCriterion("item_type not in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeBetween(String value1, String value2) {
            addCriterion("item_type between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotBetween(String value1, String value2) {
            addCriterion("item_type not between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemHeightIsNull() {
            addCriterion("item_height is null");
            return (Criteria) this;
        }

        public Criteria andItemHeightIsNotNull() {
            addCriterion("item_height is not null");
            return (Criteria) this;
        }

        public Criteria andItemHeightEqualTo(String value) {
            addCriterion("item_height =", value, "itemHeight");
            return (Criteria) this;
        }

        public Criteria andItemHeightNotEqualTo(String value) {
            addCriterion("item_height <>", value, "itemHeight");
            return (Criteria) this;
        }

        public Criteria andItemHeightGreaterThan(String value) {
            addCriterion("item_height >", value, "itemHeight");
            return (Criteria) this;
        }

        public Criteria andItemHeightGreaterThanOrEqualTo(String value) {
            addCriterion("item_height >=", value, "itemHeight");
            return (Criteria) this;
        }

        public Criteria andItemHeightLessThan(String value) {
            addCriterion("item_height <", value, "itemHeight");
            return (Criteria) this;
        }

        public Criteria andItemHeightLessThanOrEqualTo(String value) {
            addCriterion("item_height <=", value, "itemHeight");
            return (Criteria) this;
        }

        public Criteria andItemHeightLike(String value) {
            addCriterion("item_height like", value, "itemHeight");
            return (Criteria) this;
        }

        public Criteria andItemHeightNotLike(String value) {
            addCriterion("item_height not like", value, "itemHeight");
            return (Criteria) this;
        }

        public Criteria andItemHeightIn(List<String> values) {
            addCriterion("item_height in", values, "itemHeight");
            return (Criteria) this;
        }

        public Criteria andItemHeightNotIn(List<String> values) {
            addCriterion("item_height not in", values, "itemHeight");
            return (Criteria) this;
        }

        public Criteria andItemHeightBetween(String value1, String value2) {
            addCriterion("item_height between", value1, value2, "itemHeight");
            return (Criteria) this;
        }

        public Criteria andItemHeightNotBetween(String value1, String value2) {
            addCriterion("item_height not between", value1, value2, "itemHeight");
            return (Criteria) this;
        }

        public Criteria andItemSizeIsNull() {
            addCriterion("item_size is null");
            return (Criteria) this;
        }

        public Criteria andItemSizeIsNotNull() {
            addCriterion("item_size is not null");
            return (Criteria) this;
        }

        public Criteria andItemSizeEqualTo(String value) {
            addCriterion("item_size =", value, "itemSize");
            return (Criteria) this;
        }

        public Criteria andItemSizeNotEqualTo(String value) {
            addCriterion("item_size <>", value, "itemSize");
            return (Criteria) this;
        }

        public Criteria andItemSizeGreaterThan(String value) {
            addCriterion("item_size >", value, "itemSize");
            return (Criteria) this;
        }

        public Criteria andItemSizeGreaterThanOrEqualTo(String value) {
            addCriterion("item_size >=", value, "itemSize");
            return (Criteria) this;
        }

        public Criteria andItemSizeLessThan(String value) {
            addCriterion("item_size <", value, "itemSize");
            return (Criteria) this;
        }

        public Criteria andItemSizeLessThanOrEqualTo(String value) {
            addCriterion("item_size <=", value, "itemSize");
            return (Criteria) this;
        }

        public Criteria andItemSizeLike(String value) {
            addCriterion("item_size like", value, "itemSize");
            return (Criteria) this;
        }

        public Criteria andItemSizeNotLike(String value) {
            addCriterion("item_size not like", value, "itemSize");
            return (Criteria) this;
        }

        public Criteria andItemSizeIn(List<String> values) {
            addCriterion("item_size in", values, "itemSize");
            return (Criteria) this;
        }

        public Criteria andItemSizeNotIn(List<String> values) {
            addCriterion("item_size not in", values, "itemSize");
            return (Criteria) this;
        }

        public Criteria andItemSizeBetween(String value1, String value2) {
            addCriterion("item_size between", value1, value2, "itemSize");
            return (Criteria) this;
        }

        public Criteria andItemSizeNotBetween(String value1, String value2) {
            addCriterion("item_size not between", value1, value2, "itemSize");
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

        public Criteria andItemPriceIsNull() {
            addCriterion("item_price is null");
            return (Criteria) this;
        }

        public Criteria andItemPriceIsNotNull() {
            addCriterion("item_price is not null");
            return (Criteria) this;
        }

        public Criteria andItemPriceEqualTo(Double value) {
            addCriterion("item_price =", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotEqualTo(Double value) {
            addCriterion("item_price <>", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceGreaterThan(Double value) {
            addCriterion("item_price >", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("item_price >=", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceLessThan(Double value) {
            addCriterion("item_price <", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceLessThanOrEqualTo(Double value) {
            addCriterion("item_price <=", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceIn(List<Double> values) {
            addCriterion("item_price in", values, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotIn(List<Double> values) {
            addCriterion("item_price not in", values, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceBetween(Double value1, Double value2) {
            addCriterion("item_price between", value1, value2, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotBetween(Double value1, Double value2) {
            addCriterion("item_price not between", value1, value2, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemImg1IsNull() {
            addCriterion("item_img1 is null");
            return (Criteria) this;
        }

        public Criteria andItemImg1IsNotNull() {
            addCriterion("item_img1 is not null");
            return (Criteria) this;
        }

        public Criteria andItemImg1EqualTo(String value) {
            addCriterion("item_img1 =", value, "itemImg1");
            return (Criteria) this;
        }

        public Criteria andItemImg1NotEqualTo(String value) {
            addCriterion("item_img1 <>", value, "itemImg1");
            return (Criteria) this;
        }

        public Criteria andItemImg1GreaterThan(String value) {
            addCriterion("item_img1 >", value, "itemImg1");
            return (Criteria) this;
        }

        public Criteria andItemImg1GreaterThanOrEqualTo(String value) {
            addCriterion("item_img1 >=", value, "itemImg1");
            return (Criteria) this;
        }

        public Criteria andItemImg1LessThan(String value) {
            addCriterion("item_img1 <", value, "itemImg1");
            return (Criteria) this;
        }

        public Criteria andItemImg1LessThanOrEqualTo(String value) {
            addCriterion("item_img1 <=", value, "itemImg1");
            return (Criteria) this;
        }

        public Criteria andItemImg1Like(String value) {
            addCriterion("item_img1 like", value, "itemImg1");
            return (Criteria) this;
        }

        public Criteria andItemImg1NotLike(String value) {
            addCriterion("item_img1 not like", value, "itemImg1");
            return (Criteria) this;
        }

        public Criteria andItemImg1In(List<String> values) {
            addCriterion("item_img1 in", values, "itemImg1");
            return (Criteria) this;
        }

        public Criteria andItemImg1NotIn(List<String> values) {
            addCriterion("item_img1 not in", values, "itemImg1");
            return (Criteria) this;
        }

        public Criteria andItemImg1Between(String value1, String value2) {
            addCriterion("item_img1 between", value1, value2, "itemImg1");
            return (Criteria) this;
        }

        public Criteria andItemImg1NotBetween(String value1, String value2) {
            addCriterion("item_img1 not between", value1, value2, "itemImg1");
            return (Criteria) this;
        }

        public Criteria andItemImg2IsNull() {
            addCriterion("item_img2 is null");
            return (Criteria) this;
        }

        public Criteria andItemImg2IsNotNull() {
            addCriterion("item_img2 is not null");
            return (Criteria) this;
        }

        public Criteria andItemImg2EqualTo(String value) {
            addCriterion("item_img2 =", value, "itemImg2");
            return (Criteria) this;
        }

        public Criteria andItemImg2NotEqualTo(String value) {
            addCriterion("item_img2 <>", value, "itemImg2");
            return (Criteria) this;
        }

        public Criteria andItemImg2GreaterThan(String value) {
            addCriterion("item_img2 >", value, "itemImg2");
            return (Criteria) this;
        }

        public Criteria andItemImg2GreaterThanOrEqualTo(String value) {
            addCriterion("item_img2 >=", value, "itemImg2");
            return (Criteria) this;
        }

        public Criteria andItemImg2LessThan(String value) {
            addCriterion("item_img2 <", value, "itemImg2");
            return (Criteria) this;
        }

        public Criteria andItemImg2LessThanOrEqualTo(String value) {
            addCriterion("item_img2 <=", value, "itemImg2");
            return (Criteria) this;
        }

        public Criteria andItemImg2Like(String value) {
            addCriterion("item_img2 like", value, "itemImg2");
            return (Criteria) this;
        }

        public Criteria andItemImg2NotLike(String value) {
            addCriterion("item_img2 not like", value, "itemImg2");
            return (Criteria) this;
        }

        public Criteria andItemImg2In(List<String> values) {
            addCriterion("item_img2 in", values, "itemImg2");
            return (Criteria) this;
        }

        public Criteria andItemImg2NotIn(List<String> values) {
            addCriterion("item_img2 not in", values, "itemImg2");
            return (Criteria) this;
        }

        public Criteria andItemImg2Between(String value1, String value2) {
            addCriterion("item_img2 between", value1, value2, "itemImg2");
            return (Criteria) this;
        }

        public Criteria andItemImg2NotBetween(String value1, String value2) {
            addCriterion("item_img2 not between", value1, value2, "itemImg2");
            return (Criteria) this;
        }

        public Criteria andItemImg3IsNull() {
            addCriterion("item_img3 is null");
            return (Criteria) this;
        }

        public Criteria andItemImg3IsNotNull() {
            addCriterion("item_img3 is not null");
            return (Criteria) this;
        }

        public Criteria andItemImg3EqualTo(String value) {
            addCriterion("item_img3 =", value, "itemImg3");
            return (Criteria) this;
        }

        public Criteria andItemImg3NotEqualTo(String value) {
            addCriterion("item_img3 <>", value, "itemImg3");
            return (Criteria) this;
        }

        public Criteria andItemImg3GreaterThan(String value) {
            addCriterion("item_img3 >", value, "itemImg3");
            return (Criteria) this;
        }

        public Criteria andItemImg3GreaterThanOrEqualTo(String value) {
            addCriterion("item_img3 >=", value, "itemImg3");
            return (Criteria) this;
        }

        public Criteria andItemImg3LessThan(String value) {
            addCriterion("item_img3 <", value, "itemImg3");
            return (Criteria) this;
        }

        public Criteria andItemImg3LessThanOrEqualTo(String value) {
            addCriterion("item_img3 <=", value, "itemImg3");
            return (Criteria) this;
        }

        public Criteria andItemImg3Like(String value) {
            addCriterion("item_img3 like", value, "itemImg3");
            return (Criteria) this;
        }

        public Criteria andItemImg3NotLike(String value) {
            addCriterion("item_img3 not like", value, "itemImg3");
            return (Criteria) this;
        }

        public Criteria andItemImg3In(List<String> values) {
            addCriterion("item_img3 in", values, "itemImg3");
            return (Criteria) this;
        }

        public Criteria andItemImg3NotIn(List<String> values) {
            addCriterion("item_img3 not in", values, "itemImg3");
            return (Criteria) this;
        }

        public Criteria andItemImg3Between(String value1, String value2) {
            addCriterion("item_img3 between", value1, value2, "itemImg3");
            return (Criteria) this;
        }

        public Criteria andItemImg3NotBetween(String value1, String value2) {
            addCriterion("item_img3 not between", value1, value2, "itemImg3");
            return (Criteria) this;
        }

        public Criteria andItemImg4IsNull() {
            addCriterion("item_img4 is null");
            return (Criteria) this;
        }

        public Criteria andItemImg4IsNotNull() {
            addCriterion("item_img4 is not null");
            return (Criteria) this;
        }

        public Criteria andItemImg4EqualTo(String value) {
            addCriterion("item_img4 =", value, "itemImg4");
            return (Criteria) this;
        }

        public Criteria andItemImg4NotEqualTo(String value) {
            addCriterion("item_img4 <>", value, "itemImg4");
            return (Criteria) this;
        }

        public Criteria andItemImg4GreaterThan(String value) {
            addCriterion("item_img4 >", value, "itemImg4");
            return (Criteria) this;
        }

        public Criteria andItemImg4GreaterThanOrEqualTo(String value) {
            addCriterion("item_img4 >=", value, "itemImg4");
            return (Criteria) this;
        }

        public Criteria andItemImg4LessThan(String value) {
            addCriterion("item_img4 <", value, "itemImg4");
            return (Criteria) this;
        }

        public Criteria andItemImg4LessThanOrEqualTo(String value) {
            addCriterion("item_img4 <=", value, "itemImg4");
            return (Criteria) this;
        }

        public Criteria andItemImg4Like(String value) {
            addCriterion("item_img4 like", value, "itemImg4");
            return (Criteria) this;
        }

        public Criteria andItemImg4NotLike(String value) {
            addCriterion("item_img4 not like", value, "itemImg4");
            return (Criteria) this;
        }

        public Criteria andItemImg4In(List<String> values) {
            addCriterion("item_img4 in", values, "itemImg4");
            return (Criteria) this;
        }

        public Criteria andItemImg4NotIn(List<String> values) {
            addCriterion("item_img4 not in", values, "itemImg4");
            return (Criteria) this;
        }

        public Criteria andItemImg4Between(String value1, String value2) {
            addCriterion("item_img4 between", value1, value2, "itemImg4");
            return (Criteria) this;
        }

        public Criteria andItemImg4NotBetween(String value1, String value2) {
            addCriterion("item_img4 not between", value1, value2, "itemImg4");
            return (Criteria) this;
        }

        public Criteria andItmeInfoIsNull() {
            addCriterion("itme_info is null");
            return (Criteria) this;
        }

        public Criteria andItmeInfoIsNotNull() {
            addCriterion("itme_info is not null");
            return (Criteria) this;
        }

        public Criteria andItmeInfoEqualTo(String value) {
            addCriterion("itme_info =", value, "itmeInfo");
            return (Criteria) this;
        }

        public Criteria andItmeInfoNotEqualTo(String value) {
            addCriterion("itme_info <>", value, "itmeInfo");
            return (Criteria) this;
        }

        public Criteria andItmeInfoGreaterThan(String value) {
            addCriterion("itme_info >", value, "itmeInfo");
            return (Criteria) this;
        }

        public Criteria andItmeInfoGreaterThanOrEqualTo(String value) {
            addCriterion("itme_info >=", value, "itmeInfo");
            return (Criteria) this;
        }

        public Criteria andItmeInfoLessThan(String value) {
            addCriterion("itme_info <", value, "itmeInfo");
            return (Criteria) this;
        }

        public Criteria andItmeInfoLessThanOrEqualTo(String value) {
            addCriterion("itme_info <=", value, "itmeInfo");
            return (Criteria) this;
        }

        public Criteria andItmeInfoLike(String value) {
            addCriterion("itme_info like", value, "itmeInfo");
            return (Criteria) this;
        }

        public Criteria andItmeInfoNotLike(String value) {
            addCriterion("itme_info not like", value, "itmeInfo");
            return (Criteria) this;
        }

        public Criteria andItmeInfoIn(List<String> values) {
            addCriterion("itme_info in", values, "itmeInfo");
            return (Criteria) this;
        }

        public Criteria andItmeInfoNotIn(List<String> values) {
            addCriterion("itme_info not in", values, "itmeInfo");
            return (Criteria) this;
        }

        public Criteria andItmeInfoBetween(String value1, String value2) {
            addCriterion("itme_info between", value1, value2, "itmeInfo");
            return (Criteria) this;
        }

        public Criteria andItmeInfoNotBetween(String value1, String value2) {
            addCriterion("itme_info not between", value1, value2, "itmeInfo");
            return (Criteria) this;
        }

        public Criteria andItmeBuynumberIsNull() {
            addCriterion("itme_buynumber is null");
            return (Criteria) this;
        }

        public Criteria andItmeBuynumberIsNotNull() {
            addCriterion("itme_buynumber is not null");
            return (Criteria) this;
        }

        public Criteria andItmeBuynumberEqualTo(Integer value) {
            addCriterion("itme_buynumber =", value, "itmeBuynumber");
            return (Criteria) this;
        }

        public Criteria andItmeBuynumberNotEqualTo(Integer value) {
            addCriterion("itme_buynumber <>", value, "itmeBuynumber");
            return (Criteria) this;
        }

        public Criteria andItmeBuynumberGreaterThan(Integer value) {
            addCriterion("itme_buynumber >", value, "itmeBuynumber");
            return (Criteria) this;
        }

        public Criteria andItmeBuynumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("itme_buynumber >=", value, "itmeBuynumber");
            return (Criteria) this;
        }

        public Criteria andItmeBuynumberLessThan(Integer value) {
            addCriterion("itme_buynumber <", value, "itmeBuynumber");
            return (Criteria) this;
        }

        public Criteria andItmeBuynumberLessThanOrEqualTo(Integer value) {
            addCriterion("itme_buynumber <=", value, "itmeBuynumber");
            return (Criteria) this;
        }

        public Criteria andItmeBuynumberIn(List<Integer> values) {
            addCriterion("itme_buynumber in", values, "itmeBuynumber");
            return (Criteria) this;
        }

        public Criteria andItmeBuynumberNotIn(List<Integer> values) {
            addCriterion("itme_buynumber not in", values, "itmeBuynumber");
            return (Criteria) this;
        }

        public Criteria andItmeBuynumberBetween(Integer value1, Integer value2) {
            addCriterion("itme_buynumber between", value1, value2, "itmeBuynumber");
            return (Criteria) this;
        }

        public Criteria andItmeBuynumberNotBetween(Integer value1, Integer value2) {
            addCriterion("itme_buynumber not between", value1, value2, "itmeBuynumber");
            return (Criteria) this;
        }

        public Criteria andItmeEvalIsNull() {
            addCriterion("itme_eval is null");
            return (Criteria) this;
        }

        public Criteria andItmeEvalIsNotNull() {
            addCriterion("itme_eval is not null");
            return (Criteria) this;
        }

        public Criteria andItmeEvalEqualTo(Integer value) {
            addCriterion("itme_eval =", value, "itmeEval");
            return (Criteria) this;
        }

        public Criteria andItmeEvalNotEqualTo(Integer value) {
            addCriterion("itme_eval <>", value, "itmeEval");
            return (Criteria) this;
        }

        public Criteria andItmeEvalGreaterThan(Integer value) {
            addCriterion("itme_eval >", value, "itmeEval");
            return (Criteria) this;
        }

        public Criteria andItmeEvalGreaterThanOrEqualTo(Integer value) {
            addCriterion("itme_eval >=", value, "itmeEval");
            return (Criteria) this;
        }

        public Criteria andItmeEvalLessThan(Integer value) {
            addCriterion("itme_eval <", value, "itmeEval");
            return (Criteria) this;
        }

        public Criteria andItmeEvalLessThanOrEqualTo(Integer value) {
            addCriterion("itme_eval <=", value, "itmeEval");
            return (Criteria) this;
        }

        public Criteria andItmeEvalIn(List<Integer> values) {
            addCriterion("itme_eval in", values, "itmeEval");
            return (Criteria) this;
        }

        public Criteria andItmeEvalNotIn(List<Integer> values) {
            addCriterion("itme_eval not in", values, "itmeEval");
            return (Criteria) this;
        }

        public Criteria andItmeEvalBetween(Integer value1, Integer value2) {
            addCriterion("itme_eval between", value1, value2, "itmeEval");
            return (Criteria) this;
        }

        public Criteria andItmeEvalNotBetween(Integer value1, Integer value2) {
            addCriterion("itme_eval not between", value1, value2, "itmeEval");
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