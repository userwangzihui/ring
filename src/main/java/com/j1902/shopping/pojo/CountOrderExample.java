package com.j1902.shopping.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CountOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CountOrderExample() {
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

        public Criteria andCountIdIsNull() {
            addCriterion("count_id is null");
            return (Criteria) this;
        }

        public Criteria andCountIdIsNotNull() {
            addCriterion("count_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountIdEqualTo(Integer value) {
            addCriterion("count_id =", value, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdNotEqualTo(Integer value) {
            addCriterion("count_id <>", value, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdGreaterThan(Integer value) {
            addCriterion("count_id >", value, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_id >=", value, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdLessThan(Integer value) {
            addCriterion("count_id <", value, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdLessThanOrEqualTo(Integer value) {
            addCriterion("count_id <=", value, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdIn(List<Integer> values) {
            addCriterion("count_id in", values, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdNotIn(List<Integer> values) {
            addCriterion("count_id not in", values, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdBetween(Integer value1, Integer value2) {
            addCriterion("count_id between", value1, value2, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("count_id not between", value1, value2, "countId");
            return (Criteria) this;
        }

        public Criteria andCountUseridIsNull() {
            addCriterion("count_userid is null");
            return (Criteria) this;
        }

        public Criteria andCountUseridIsNotNull() {
            addCriterion("count_userid is not null");
            return (Criteria) this;
        }

        public Criteria andCountUseridEqualTo(Integer value) {
            addCriterion("count_userid =", value, "countUserid");
            return (Criteria) this;
        }

        public Criteria andCountUseridNotEqualTo(Integer value) {
            addCriterion("count_userid <>", value, "countUserid");
            return (Criteria) this;
        }

        public Criteria andCountUseridGreaterThan(Integer value) {
            addCriterion("count_userid >", value, "countUserid");
            return (Criteria) this;
        }

        public Criteria andCountUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_userid >=", value, "countUserid");
            return (Criteria) this;
        }

        public Criteria andCountUseridLessThan(Integer value) {
            addCriterion("count_userid <", value, "countUserid");
            return (Criteria) this;
        }

        public Criteria andCountUseridLessThanOrEqualTo(Integer value) {
            addCriterion("count_userid <=", value, "countUserid");
            return (Criteria) this;
        }

        public Criteria andCountUseridIn(List<Integer> values) {
            addCriterion("count_userid in", values, "countUserid");
            return (Criteria) this;
        }

        public Criteria andCountUseridNotIn(List<Integer> values) {
            addCriterion("count_userid not in", values, "countUserid");
            return (Criteria) this;
        }

        public Criteria andCountUseridBetween(Integer value1, Integer value2) {
            addCriterion("count_userid between", value1, value2, "countUserid");
            return (Criteria) this;
        }

        public Criteria andCountUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("count_userid not between", value1, value2, "countUserid");
            return (Criteria) this;
        }

        public Criteria andCountRemarksIsNull() {
            addCriterion("count_remarks is null");
            return (Criteria) this;
        }

        public Criteria andCountRemarksIsNotNull() {
            addCriterion("count_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andCountRemarksEqualTo(String value) {
            addCriterion("count_remarks =", value, "countRemarks");
            return (Criteria) this;
        }

        public Criteria andCountRemarksNotEqualTo(String value) {
            addCriterion("count_remarks <>", value, "countRemarks");
            return (Criteria) this;
        }

        public Criteria andCountRemarksGreaterThan(String value) {
            addCriterion("count_remarks >", value, "countRemarks");
            return (Criteria) this;
        }

        public Criteria andCountRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("count_remarks >=", value, "countRemarks");
            return (Criteria) this;
        }

        public Criteria andCountRemarksLessThan(String value) {
            addCriterion("count_remarks <", value, "countRemarks");
            return (Criteria) this;
        }

        public Criteria andCountRemarksLessThanOrEqualTo(String value) {
            addCriterion("count_remarks <=", value, "countRemarks");
            return (Criteria) this;
        }

        public Criteria andCountRemarksLike(String value) {
            addCriterion("count_remarks like", value, "countRemarks");
            return (Criteria) this;
        }

        public Criteria andCountRemarksNotLike(String value) {
            addCriterion("count_remarks not like", value, "countRemarks");
            return (Criteria) this;
        }

        public Criteria andCountRemarksIn(List<String> values) {
            addCriterion("count_remarks in", values, "countRemarks");
            return (Criteria) this;
        }

        public Criteria andCountRemarksNotIn(List<String> values) {
            addCriterion("count_remarks not in", values, "countRemarks");
            return (Criteria) this;
        }

        public Criteria andCountRemarksBetween(String value1, String value2) {
            addCriterion("count_remarks between", value1, value2, "countRemarks");
            return (Criteria) this;
        }

        public Criteria andCountRemarksNotBetween(String value1, String value2) {
            addCriterion("count_remarks not between", value1, value2, "countRemarks");
            return (Criteria) this;
        }

        public Criteria andCountCreatetimeIsNull() {
            addCriterion("count_createtime is null");
            return (Criteria) this;
        }

        public Criteria andCountCreatetimeIsNotNull() {
            addCriterion("count_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCountCreatetimeEqualTo(Date value) {
            addCriterion("count_createtime =", value, "countCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountCreatetimeNotEqualTo(Date value) {
            addCriterion("count_createtime <>", value, "countCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountCreatetimeGreaterThan(Date value) {
            addCriterion("count_createtime >", value, "countCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("count_createtime >=", value, "countCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountCreatetimeLessThan(Date value) {
            addCriterion("count_createtime <", value, "countCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("count_createtime <=", value, "countCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountCreatetimeIn(List<Date> values) {
            addCriterion("count_createtime in", values, "countCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountCreatetimeNotIn(List<Date> values) {
            addCriterion("count_createtime not in", values, "countCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountCreatetimeBetween(Date value1, Date value2) {
            addCriterion("count_createtime between", value1, value2, "countCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("count_createtime not between", value1, value2, "countCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountMethodIsNull() {
            addCriterion("count_method is null");
            return (Criteria) this;
        }

        public Criteria andCountMethodIsNotNull() {
            addCriterion("count_method is not null");
            return (Criteria) this;
        }

        public Criteria andCountMethodEqualTo(String value) {
            addCriterion("count_method =", value, "countMethod");
            return (Criteria) this;
        }

        public Criteria andCountMethodNotEqualTo(String value) {
            addCriterion("count_method <>", value, "countMethod");
            return (Criteria) this;
        }

        public Criteria andCountMethodGreaterThan(String value) {
            addCriterion("count_method >", value, "countMethod");
            return (Criteria) this;
        }

        public Criteria andCountMethodGreaterThanOrEqualTo(String value) {
            addCriterion("count_method >=", value, "countMethod");
            return (Criteria) this;
        }

        public Criteria andCountMethodLessThan(String value) {
            addCriterion("count_method <", value, "countMethod");
            return (Criteria) this;
        }

        public Criteria andCountMethodLessThanOrEqualTo(String value) {
            addCriterion("count_method <=", value, "countMethod");
            return (Criteria) this;
        }

        public Criteria andCountMethodLike(String value) {
            addCriterion("count_method like", value, "countMethod");
            return (Criteria) this;
        }

        public Criteria andCountMethodNotLike(String value) {
            addCriterion("count_method not like", value, "countMethod");
            return (Criteria) this;
        }

        public Criteria andCountMethodIn(List<String> values) {
            addCriterion("count_method in", values, "countMethod");
            return (Criteria) this;
        }

        public Criteria andCountMethodNotIn(List<String> values) {
            addCriterion("count_method not in", values, "countMethod");
            return (Criteria) this;
        }

        public Criteria andCountMethodBetween(String value1, String value2) {
            addCriterion("count_method between", value1, value2, "countMethod");
            return (Criteria) this;
        }

        public Criteria andCountMethodNotBetween(String value1, String value2) {
            addCriterion("count_method not between", value1, value2, "countMethod");
            return (Criteria) this;
        }

        public Criteria andCountMoneyIsNull() {
            addCriterion("count_money is null");
            return (Criteria) this;
        }

        public Criteria andCountMoneyIsNotNull() {
            addCriterion("count_money is not null");
            return (Criteria) this;
        }

        public Criteria andCountMoneyEqualTo(Double value) {
            addCriterion("count_money =", value, "countMoney");
            return (Criteria) this;
        }

        public Criteria andCountMoneyNotEqualTo(Double value) {
            addCriterion("count_money <>", value, "countMoney");
            return (Criteria) this;
        }

        public Criteria andCountMoneyGreaterThan(Double value) {
            addCriterion("count_money >", value, "countMoney");
            return (Criteria) this;
        }

        public Criteria andCountMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("count_money >=", value, "countMoney");
            return (Criteria) this;
        }

        public Criteria andCountMoneyLessThan(Double value) {
            addCriterion("count_money <", value, "countMoney");
            return (Criteria) this;
        }

        public Criteria andCountMoneyLessThanOrEqualTo(Double value) {
            addCriterion("count_money <=", value, "countMoney");
            return (Criteria) this;
        }

        public Criteria andCountMoneyIn(List<Double> values) {
            addCriterion("count_money in", values, "countMoney");
            return (Criteria) this;
        }

        public Criteria andCountMoneyNotIn(List<Double> values) {
            addCriterion("count_money not in", values, "countMoney");
            return (Criteria) this;
        }

        public Criteria andCountMoneyBetween(Double value1, Double value2) {
            addCriterion("count_money between", value1, value2, "countMoney");
            return (Criteria) this;
        }

        public Criteria andCountMoneyNotBetween(Double value1, Double value2) {
            addCriterion("count_money not between", value1, value2, "countMoney");
            return (Criteria) this;
        }

        public Criteria andCountSatIsNull() {
            addCriterion("count_sat is null");
            return (Criteria) this;
        }

        public Criteria andCountSatIsNotNull() {
            addCriterion("count_sat is not null");
            return (Criteria) this;
        }

        public Criteria andCountSatEqualTo(String value) {
            addCriterion("count_sat =", value, "countSat");
            return (Criteria) this;
        }

        public Criteria andCountSatNotEqualTo(String value) {
            addCriterion("count_sat <>", value, "countSat");
            return (Criteria) this;
        }

        public Criteria andCountSatGreaterThan(String value) {
            addCriterion("count_sat >", value, "countSat");
            return (Criteria) this;
        }

        public Criteria andCountSatGreaterThanOrEqualTo(String value) {
            addCriterion("count_sat >=", value, "countSat");
            return (Criteria) this;
        }

        public Criteria andCountSatLessThan(String value) {
            addCriterion("count_sat <", value, "countSat");
            return (Criteria) this;
        }

        public Criteria andCountSatLessThanOrEqualTo(String value) {
            addCriterion("count_sat <=", value, "countSat");
            return (Criteria) this;
        }

        public Criteria andCountSatLike(String value) {
            addCriterion("count_sat like", value, "countSat");
            return (Criteria) this;
        }

        public Criteria andCountSatNotLike(String value) {
            addCriterion("count_sat not like", value, "countSat");
            return (Criteria) this;
        }

        public Criteria andCountSatIn(List<String> values) {
            addCriterion("count_sat in", values, "countSat");
            return (Criteria) this;
        }

        public Criteria andCountSatNotIn(List<String> values) {
            addCriterion("count_sat not in", values, "countSat");
            return (Criteria) this;
        }

        public Criteria andCountSatBetween(String value1, String value2) {
            addCriterion("count_sat between", value1, value2, "countSat");
            return (Criteria) this;
        }

        public Criteria andCountSatNotBetween(String value1, String value2) {
            addCriterion("count_sat not between", value1, value2, "countSat");
            return (Criteria) this;
        }

        public Criteria andCountUsernameIsNull() {
            addCriterion("count_username is null");
            return (Criteria) this;
        }

        public Criteria andCountUsernameIsNotNull() {
            addCriterion("count_username is not null");
            return (Criteria) this;
        }

        public Criteria andCountUsernameEqualTo(String value) {
            addCriterion("count_username =", value, "countUsername");
            return (Criteria) this;
        }

        public Criteria andCountUsernameNotEqualTo(String value) {
            addCriterion("count_username <>", value, "countUsername");
            return (Criteria) this;
        }

        public Criteria andCountUsernameGreaterThan(String value) {
            addCriterion("count_username >", value, "countUsername");
            return (Criteria) this;
        }

        public Criteria andCountUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("count_username >=", value, "countUsername");
            return (Criteria) this;
        }

        public Criteria andCountUsernameLessThan(String value) {
            addCriterion("count_username <", value, "countUsername");
            return (Criteria) this;
        }

        public Criteria andCountUsernameLessThanOrEqualTo(String value) {
            addCriterion("count_username <=", value, "countUsername");
            return (Criteria) this;
        }

        public Criteria andCountUsernameLike(String value) {
            addCriterion("count_username like", value, "countUsername");
            return (Criteria) this;
        }

        public Criteria andCountUsernameNotLike(String value) {
            addCriterion("count_username not like", value, "countUsername");
            return (Criteria) this;
        }

        public Criteria andCountUsernameIn(List<String> values) {
            addCriterion("count_username in", values, "countUsername");
            return (Criteria) this;
        }

        public Criteria andCountUsernameNotIn(List<String> values) {
            addCriterion("count_username not in", values, "countUsername");
            return (Criteria) this;
        }

        public Criteria andCountUsernameBetween(String value1, String value2) {
            addCriterion("count_username between", value1, value2, "countUsername");
            return (Criteria) this;
        }

        public Criteria andCountUsernameNotBetween(String value1, String value2) {
            addCriterion("count_username not between", value1, value2, "countUsername");
            return (Criteria) this;
        }

        public Criteria andCountPhoneIsNull() {
            addCriterion("count_phone is null");
            return (Criteria) this;
        }

        public Criteria andCountPhoneIsNotNull() {
            addCriterion("count_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCountPhoneEqualTo(String value) {
            addCriterion("count_phone =", value, "countPhone");
            return (Criteria) this;
        }

        public Criteria andCountPhoneNotEqualTo(String value) {
            addCriterion("count_phone <>", value, "countPhone");
            return (Criteria) this;
        }

        public Criteria andCountPhoneGreaterThan(String value) {
            addCriterion("count_phone >", value, "countPhone");
            return (Criteria) this;
        }

        public Criteria andCountPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("count_phone >=", value, "countPhone");
            return (Criteria) this;
        }

        public Criteria andCountPhoneLessThan(String value) {
            addCriterion("count_phone <", value, "countPhone");
            return (Criteria) this;
        }

        public Criteria andCountPhoneLessThanOrEqualTo(String value) {
            addCriterion("count_phone <=", value, "countPhone");
            return (Criteria) this;
        }

        public Criteria andCountPhoneLike(String value) {
            addCriterion("count_phone like", value, "countPhone");
            return (Criteria) this;
        }

        public Criteria andCountPhoneNotLike(String value) {
            addCriterion("count_phone not like", value, "countPhone");
            return (Criteria) this;
        }

        public Criteria andCountPhoneIn(List<String> values) {
            addCriterion("count_phone in", values, "countPhone");
            return (Criteria) this;
        }

        public Criteria andCountPhoneNotIn(List<String> values) {
            addCriterion("count_phone not in", values, "countPhone");
            return (Criteria) this;
        }

        public Criteria andCountPhoneBetween(String value1, String value2) {
            addCriterion("count_phone between", value1, value2, "countPhone");
            return (Criteria) this;
        }

        public Criteria andCountPhoneNotBetween(String value1, String value2) {
            addCriterion("count_phone not between", value1, value2, "countPhone");
            return (Criteria) this;
        }

        public Criteria andCountAddressIsNull() {
            addCriterion("count_address is null");
            return (Criteria) this;
        }

        public Criteria andCountAddressIsNotNull() {
            addCriterion("count_address is not null");
            return (Criteria) this;
        }

        public Criteria andCountAddressEqualTo(String value) {
            addCriterion("count_address =", value, "countAddress");
            return (Criteria) this;
        }

        public Criteria andCountAddressNotEqualTo(String value) {
            addCriterion("count_address <>", value, "countAddress");
            return (Criteria) this;
        }

        public Criteria andCountAddressGreaterThan(String value) {
            addCriterion("count_address >", value, "countAddress");
            return (Criteria) this;
        }

        public Criteria andCountAddressGreaterThanOrEqualTo(String value) {
            addCriterion("count_address >=", value, "countAddress");
            return (Criteria) this;
        }

        public Criteria andCountAddressLessThan(String value) {
            addCriterion("count_address <", value, "countAddress");
            return (Criteria) this;
        }

        public Criteria andCountAddressLessThanOrEqualTo(String value) {
            addCriterion("count_address <=", value, "countAddress");
            return (Criteria) this;
        }

        public Criteria andCountAddressLike(String value) {
            addCriterion("count_address like", value, "countAddress");
            return (Criteria) this;
        }

        public Criteria andCountAddressNotLike(String value) {
            addCriterion("count_address not like", value, "countAddress");
            return (Criteria) this;
        }

        public Criteria andCountAddressIn(List<String> values) {
            addCriterion("count_address in", values, "countAddress");
            return (Criteria) this;
        }

        public Criteria andCountAddressNotIn(List<String> values) {
            addCriterion("count_address not in", values, "countAddress");
            return (Criteria) this;
        }

        public Criteria andCountAddressBetween(String value1, String value2) {
            addCriterion("count_address between", value1, value2, "countAddress");
            return (Criteria) this;
        }

        public Criteria andCountAddressNotBetween(String value1, String value2) {
            addCriterion("count_address not between", value1, value2, "countAddress");
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