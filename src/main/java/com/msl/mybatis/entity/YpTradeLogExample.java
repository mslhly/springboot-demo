package com.msl.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YpTradeLogExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
    public YpTradeLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStreamNoIsNull() {
            addCriterion("stream_no is null");
            return (Criteria) this;
        }

        public Criteria andStreamNoIsNotNull() {
            addCriterion("stream_no is not null");
            return (Criteria) this;
        }

        public Criteria andStreamNoEqualTo(Long value) {
            addCriterion("stream_no =", value, "streamNo");
            return (Criteria) this;
        }

        public Criteria andStreamNoNotEqualTo(Long value) {
            addCriterion("stream_no <>", value, "streamNo");
            return (Criteria) this;
        }

        public Criteria andStreamNoGreaterThan(Long value) {
            addCriterion("stream_no >", value, "streamNo");
            return (Criteria) this;
        }

        public Criteria andStreamNoGreaterThanOrEqualTo(Long value) {
            addCriterion("stream_no >=", value, "streamNo");
            return (Criteria) this;
        }

        public Criteria andStreamNoLessThan(Long value) {
            addCriterion("stream_no <", value, "streamNo");
            return (Criteria) this;
        }

        public Criteria andStreamNoLessThanOrEqualTo(Long value) {
            addCriterion("stream_no <=", value, "streamNo");
            return (Criteria) this;
        }

        public Criteria andStreamNoIn(List<Long> values) {
            addCriterion("stream_no in", values, "streamNo");
            return (Criteria) this;
        }

        public Criteria andStreamNoNotIn(List<Long> values) {
            addCriterion("stream_no not in", values, "streamNo");
            return (Criteria) this;
        }

        public Criteria andStreamNoBetween(Long value1, Long value2) {
            addCriterion("stream_no between", value1, value2, "streamNo");
            return (Criteria) this;
        }

        public Criteria andStreamNoNotBetween(Long value1, Long value2) {
            addCriterion("stream_no not between", value1, value2, "streamNo");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNull() {
            addCriterion("trade_type is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("trade_type is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(Integer value) {
            addCriterion("trade_type =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(Integer value) {
            addCriterion("trade_type <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(Integer value) {
            addCriterion("trade_type >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_type >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(Integer value) {
            addCriterion("trade_type <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("trade_type <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<Integer> values) {
            addCriterion("trade_type in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<Integer> values) {
            addCriterion("trade_type not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(Integer value1, Integer value2) {
            addCriterion("trade_type between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_type not between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andReqJsonIsNull() {
            addCriterion("req_json is null");
            return (Criteria) this;
        }

        public Criteria andReqJsonIsNotNull() {
            addCriterion("req_json is not null");
            return (Criteria) this;
        }

        public Criteria andReqJsonEqualTo(String value) {
            addCriterion("req_json =", value, "reqJson");
            return (Criteria) this;
        }

        public Criteria andReqJsonNotEqualTo(String value) {
            addCriterion("req_json <>", value, "reqJson");
            return (Criteria) this;
        }

        public Criteria andReqJsonGreaterThan(String value) {
            addCriterion("req_json >", value, "reqJson");
            return (Criteria) this;
        }

        public Criteria andReqJsonGreaterThanOrEqualTo(String value) {
            addCriterion("req_json >=", value, "reqJson");
            return (Criteria) this;
        }

        public Criteria andReqJsonLessThan(String value) {
            addCriterion("req_json <", value, "reqJson");
            return (Criteria) this;
        }

        public Criteria andReqJsonLessThanOrEqualTo(String value) {
            addCriterion("req_json <=", value, "reqJson");
            return (Criteria) this;
        }

        public Criteria andReqJsonLike(String value) {
            addCriterion("req_json like", value, "reqJson");
            return (Criteria) this;
        }

        public Criteria andReqJsonNotLike(String value) {
            addCriterion("req_json not like", value, "reqJson");
            return (Criteria) this;
        }

        public Criteria andReqJsonIn(List<String> values) {
            addCriterion("req_json in", values, "reqJson");
            return (Criteria) this;
        }

        public Criteria andReqJsonNotIn(List<String> values) {
            addCriterion("req_json not in", values, "reqJson");
            return (Criteria) this;
        }

        public Criteria andReqJsonBetween(String value1, String value2) {
            addCriterion("req_json between", value1, value2, "reqJson");
            return (Criteria) this;
        }

        public Criteria andReqJsonNotBetween(String value1, String value2) {
            addCriterion("req_json not between", value1, value2, "reqJson");
            return (Criteria) this;
        }

        public Criteria andResJsonIsNull() {
            addCriterion("res_json is null");
            return (Criteria) this;
        }

        public Criteria andResJsonIsNotNull() {
            addCriterion("res_json is not null");
            return (Criteria) this;
        }

        public Criteria andResJsonEqualTo(String value) {
            addCriterion("res_json =", value, "resJson");
            return (Criteria) this;
        }

        public Criteria andResJsonNotEqualTo(String value) {
            addCriterion("res_json <>", value, "resJson");
            return (Criteria) this;
        }

        public Criteria andResJsonGreaterThan(String value) {
            addCriterion("res_json >", value, "resJson");
            return (Criteria) this;
        }

        public Criteria andResJsonGreaterThanOrEqualTo(String value) {
            addCriterion("res_json >=", value, "resJson");
            return (Criteria) this;
        }

        public Criteria andResJsonLessThan(String value) {
            addCriterion("res_json <", value, "resJson");
            return (Criteria) this;
        }

        public Criteria andResJsonLessThanOrEqualTo(String value) {
            addCriterion("res_json <=", value, "resJson");
            return (Criteria) this;
        }

        public Criteria andResJsonLike(String value) {
            addCriterion("res_json like", value, "resJson");
            return (Criteria) this;
        }

        public Criteria andResJsonNotLike(String value) {
            addCriterion("res_json not like", value, "resJson");
            return (Criteria) this;
        }

        public Criteria andResJsonIn(List<String> values) {
            addCriterion("res_json in", values, "resJson");
            return (Criteria) this;
        }

        public Criteria andResJsonNotIn(List<String> values) {
            addCriterion("res_json not in", values, "resJson");
            return (Criteria) this;
        }

        public Criteria andResJsonBetween(String value1, String value2) {
            addCriterion("res_json between", value1, value2, "resJson");
            return (Criteria) this;
        }

        public Criteria andResJsonNotBetween(String value1, String value2) {
            addCriterion("res_json not between", value1, value2, "resJson");
            return (Criteria) this;
        }

        public Criteria andNotifyJsonIsNull() {
            addCriterion("notify_json is null");
            return (Criteria) this;
        }

        public Criteria andNotifyJsonIsNotNull() {
            addCriterion("notify_json is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyJsonEqualTo(String value) {
            addCriterion("notify_json =", value, "notifyJson");
            return (Criteria) this;
        }

        public Criteria andNotifyJsonNotEqualTo(String value) {
            addCriterion("notify_json <>", value, "notifyJson");
            return (Criteria) this;
        }

        public Criteria andNotifyJsonGreaterThan(String value) {
            addCriterion("notify_json >", value, "notifyJson");
            return (Criteria) this;
        }

        public Criteria andNotifyJsonGreaterThanOrEqualTo(String value) {
            addCriterion("notify_json >=", value, "notifyJson");
            return (Criteria) this;
        }

        public Criteria andNotifyJsonLessThan(String value) {
            addCriterion("notify_json <", value, "notifyJson");
            return (Criteria) this;
        }

        public Criteria andNotifyJsonLessThanOrEqualTo(String value) {
            addCriterion("notify_json <=", value, "notifyJson");
            return (Criteria) this;
        }

        public Criteria andNotifyJsonLike(String value) {
            addCriterion("notify_json like", value, "notifyJson");
            return (Criteria) this;
        }

        public Criteria andNotifyJsonNotLike(String value) {
            addCriterion("notify_json not like", value, "notifyJson");
            return (Criteria) this;
        }

        public Criteria andNotifyJsonIn(List<String> values) {
            addCriterion("notify_json in", values, "notifyJson");
            return (Criteria) this;
        }

        public Criteria andNotifyJsonNotIn(List<String> values) {
            addCriterion("notify_json not in", values, "notifyJson");
            return (Criteria) this;
        }

        public Criteria andNotifyJsonBetween(String value1, String value2) {
            addCriterion("notify_json between", value1, value2, "notifyJson");
            return (Criteria) this;
        }

        public Criteria andNotifyJsonNotBetween(String value1, String value2) {
            addCriterion("notify_json not between", value1, value2, "notifyJson");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yp_trade_log
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
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