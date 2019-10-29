package com.msl.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YpInterfaceStatisticsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_interface_statistics
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_interface_statistics
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_interface_statistics
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_interface_statistics
     *
     * @mbggenerated
     */
    public YpInterfaceStatisticsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_interface_statistics
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_interface_statistics
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_interface_statistics
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_interface_statistics
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_interface_statistics
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_interface_statistics
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_interface_statistics
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
     * This method corresponds to the database table yp_interface_statistics
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
     * This method corresponds to the database table yp_interface_statistics
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_interface_statistics
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
     * This class corresponds to the database table yp_interface_statistics
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

        public Criteria andInterfaceDescIsNull() {
            addCriterion("interface_desc is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceDescIsNotNull() {
            addCriterion("interface_desc is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceDescEqualTo(String value) {
            addCriterion("interface_desc =", value, "interfaceDesc");
            return (Criteria) this;
        }

        public Criteria andInterfaceDescNotEqualTo(String value) {
            addCriterion("interface_desc <>", value, "interfaceDesc");
            return (Criteria) this;
        }

        public Criteria andInterfaceDescGreaterThan(String value) {
            addCriterion("interface_desc >", value, "interfaceDesc");
            return (Criteria) this;
        }

        public Criteria andInterfaceDescGreaterThanOrEqualTo(String value) {
            addCriterion("interface_desc >=", value, "interfaceDesc");
            return (Criteria) this;
        }

        public Criteria andInterfaceDescLessThan(String value) {
            addCriterion("interface_desc <", value, "interfaceDesc");
            return (Criteria) this;
        }

        public Criteria andInterfaceDescLessThanOrEqualTo(String value) {
            addCriterion("interface_desc <=", value, "interfaceDesc");
            return (Criteria) this;
        }

        public Criteria andInterfaceDescLike(String value) {
            addCriterion("interface_desc like", value, "interfaceDesc");
            return (Criteria) this;
        }

        public Criteria andInterfaceDescNotLike(String value) {
            addCriterion("interface_desc not like", value, "interfaceDesc");
            return (Criteria) this;
        }

        public Criteria andInterfaceDescIn(List<String> values) {
            addCriterion("interface_desc in", values, "interfaceDesc");
            return (Criteria) this;
        }

        public Criteria andInterfaceDescNotIn(List<String> values) {
            addCriterion("interface_desc not in", values, "interfaceDesc");
            return (Criteria) this;
        }

        public Criteria andInterfaceDescBetween(String value1, String value2) {
            addCriterion("interface_desc between", value1, value2, "interfaceDesc");
            return (Criteria) this;
        }

        public Criteria andInterfaceDescNotBetween(String value1, String value2) {
            addCriterion("interface_desc not between", value1, value2, "interfaceDesc");
            return (Criteria) this;
        }

        public Criteria andInterfaceValIsNull() {
            addCriterion("interface_val is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceValIsNotNull() {
            addCriterion("interface_val is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceValEqualTo(String value) {
            addCriterion("interface_val =", value, "interfaceVal");
            return (Criteria) this;
        }

        public Criteria andInterfaceValNotEqualTo(String value) {
            addCriterion("interface_val <>", value, "interfaceVal");
            return (Criteria) this;
        }

        public Criteria andInterfaceValGreaterThan(String value) {
            addCriterion("interface_val >", value, "interfaceVal");
            return (Criteria) this;
        }

        public Criteria andInterfaceValGreaterThanOrEqualTo(String value) {
            addCriterion("interface_val >=", value, "interfaceVal");
            return (Criteria) this;
        }

        public Criteria andInterfaceValLessThan(String value) {
            addCriterion("interface_val <", value, "interfaceVal");
            return (Criteria) this;
        }

        public Criteria andInterfaceValLessThanOrEqualTo(String value) {
            addCriterion("interface_val <=", value, "interfaceVal");
            return (Criteria) this;
        }

        public Criteria andInterfaceValLike(String value) {
            addCriterion("interface_val like", value, "interfaceVal");
            return (Criteria) this;
        }

        public Criteria andInterfaceValNotLike(String value) {
            addCriterion("interface_val not like", value, "interfaceVal");
            return (Criteria) this;
        }

        public Criteria andInterfaceValIn(List<String> values) {
            addCriterion("interface_val in", values, "interfaceVal");
            return (Criteria) this;
        }

        public Criteria andInterfaceValNotIn(List<String> values) {
            addCriterion("interface_val not in", values, "interfaceVal");
            return (Criteria) this;
        }

        public Criteria andInterfaceValBetween(String value1, String value2) {
            addCriterion("interface_val between", value1, value2, "interfaceVal");
            return (Criteria) this;
        }

        public Criteria andInterfaceValNotBetween(String value1, String value2) {
            addCriterion("interface_val not between", value1, value2, "interfaceVal");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Long value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Long value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Long value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Long value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Long value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Long value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Long> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Long> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Long value1, Long value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Long value1, Long value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andStatisYearIsNull() {
            addCriterion("statis_year is null");
            return (Criteria) this;
        }

        public Criteria andStatisYearIsNotNull() {
            addCriterion("statis_year is not null");
            return (Criteria) this;
        }

        public Criteria andStatisYearEqualTo(Integer value) {
            addCriterion("statis_year =", value, "statisYear");
            return (Criteria) this;
        }

        public Criteria andStatisYearNotEqualTo(Integer value) {
            addCriterion("statis_year <>", value, "statisYear");
            return (Criteria) this;
        }

        public Criteria andStatisYearGreaterThan(Integer value) {
            addCriterion("statis_year >", value, "statisYear");
            return (Criteria) this;
        }

        public Criteria andStatisYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("statis_year >=", value, "statisYear");
            return (Criteria) this;
        }

        public Criteria andStatisYearLessThan(Integer value) {
            addCriterion("statis_year <", value, "statisYear");
            return (Criteria) this;
        }

        public Criteria andStatisYearLessThanOrEqualTo(Integer value) {
            addCriterion("statis_year <=", value, "statisYear");
            return (Criteria) this;
        }

        public Criteria andStatisYearIn(List<Integer> values) {
            addCriterion("statis_year in", values, "statisYear");
            return (Criteria) this;
        }

        public Criteria andStatisYearNotIn(List<Integer> values) {
            addCriterion("statis_year not in", values, "statisYear");
            return (Criteria) this;
        }

        public Criteria andStatisYearBetween(Integer value1, Integer value2) {
            addCriterion("statis_year between", value1, value2, "statisYear");
            return (Criteria) this;
        }

        public Criteria andStatisYearNotBetween(Integer value1, Integer value2) {
            addCriterion("statis_year not between", value1, value2, "statisYear");
            return (Criteria) this;
        }

        public Criteria andStatisMonthIsNull() {
            addCriterion("statis_month is null");
            return (Criteria) this;
        }

        public Criteria andStatisMonthIsNotNull() {
            addCriterion("statis_month is not null");
            return (Criteria) this;
        }

        public Criteria andStatisMonthEqualTo(Integer value) {
            addCriterion("statis_month =", value, "statisMonth");
            return (Criteria) this;
        }

        public Criteria andStatisMonthNotEqualTo(Integer value) {
            addCriterion("statis_month <>", value, "statisMonth");
            return (Criteria) this;
        }

        public Criteria andStatisMonthGreaterThan(Integer value) {
            addCriterion("statis_month >", value, "statisMonth");
            return (Criteria) this;
        }

        public Criteria andStatisMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("statis_month >=", value, "statisMonth");
            return (Criteria) this;
        }

        public Criteria andStatisMonthLessThan(Integer value) {
            addCriterion("statis_month <", value, "statisMonth");
            return (Criteria) this;
        }

        public Criteria andStatisMonthLessThanOrEqualTo(Integer value) {
            addCriterion("statis_month <=", value, "statisMonth");
            return (Criteria) this;
        }

        public Criteria andStatisMonthIn(List<Integer> values) {
            addCriterion("statis_month in", values, "statisMonth");
            return (Criteria) this;
        }

        public Criteria andStatisMonthNotIn(List<Integer> values) {
            addCriterion("statis_month not in", values, "statisMonth");
            return (Criteria) this;
        }

        public Criteria andStatisMonthBetween(Integer value1, Integer value2) {
            addCriterion("statis_month between", value1, value2, "statisMonth");
            return (Criteria) this;
        }

        public Criteria andStatisMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("statis_month not between", value1, value2, "statisMonth");
            return (Criteria) this;
        }

        public Criteria andStatisDayIsNull() {
            addCriterion("statis_day is null");
            return (Criteria) this;
        }

        public Criteria andStatisDayIsNotNull() {
            addCriterion("statis_day is not null");
            return (Criteria) this;
        }

        public Criteria andStatisDayEqualTo(Integer value) {
            addCriterion("statis_day =", value, "statisDay");
            return (Criteria) this;
        }

        public Criteria andStatisDayNotEqualTo(Integer value) {
            addCriterion("statis_day <>", value, "statisDay");
            return (Criteria) this;
        }

        public Criteria andStatisDayGreaterThan(Integer value) {
            addCriterion("statis_day >", value, "statisDay");
            return (Criteria) this;
        }

        public Criteria andStatisDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("statis_day >=", value, "statisDay");
            return (Criteria) this;
        }

        public Criteria andStatisDayLessThan(Integer value) {
            addCriterion("statis_day <", value, "statisDay");
            return (Criteria) this;
        }

        public Criteria andStatisDayLessThanOrEqualTo(Integer value) {
            addCriterion("statis_day <=", value, "statisDay");
            return (Criteria) this;
        }

        public Criteria andStatisDayIn(List<Integer> values) {
            addCriterion("statis_day in", values, "statisDay");
            return (Criteria) this;
        }

        public Criteria andStatisDayNotIn(List<Integer> values) {
            addCriterion("statis_day not in", values, "statisDay");
            return (Criteria) this;
        }

        public Criteria andStatisDayBetween(Integer value1, Integer value2) {
            addCriterion("statis_day between", value1, value2, "statisDay");
            return (Criteria) this;
        }

        public Criteria andStatisDayNotBetween(Integer value1, Integer value2) {
            addCriterion("statis_day not between", value1, value2, "statisDay");
            return (Criteria) this;
        }

        public Criteria andStatisHourIsNull() {
            addCriterion("statis_hour is null");
            return (Criteria) this;
        }

        public Criteria andStatisHourIsNotNull() {
            addCriterion("statis_hour is not null");
            return (Criteria) this;
        }

        public Criteria andStatisHourEqualTo(Integer value) {
            addCriterion("statis_hour =", value, "statisHour");
            return (Criteria) this;
        }

        public Criteria andStatisHourNotEqualTo(Integer value) {
            addCriterion("statis_hour <>", value, "statisHour");
            return (Criteria) this;
        }

        public Criteria andStatisHourGreaterThan(Integer value) {
            addCriterion("statis_hour >", value, "statisHour");
            return (Criteria) this;
        }

        public Criteria andStatisHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("statis_hour >=", value, "statisHour");
            return (Criteria) this;
        }

        public Criteria andStatisHourLessThan(Integer value) {
            addCriterion("statis_hour <", value, "statisHour");
            return (Criteria) this;
        }

        public Criteria andStatisHourLessThanOrEqualTo(Integer value) {
            addCriterion("statis_hour <=", value, "statisHour");
            return (Criteria) this;
        }

        public Criteria andStatisHourIn(List<Integer> values) {
            addCriterion("statis_hour in", values, "statisHour");
            return (Criteria) this;
        }

        public Criteria andStatisHourNotIn(List<Integer> values) {
            addCriterion("statis_hour not in", values, "statisHour");
            return (Criteria) this;
        }

        public Criteria andStatisHourBetween(Integer value1, Integer value2) {
            addCriterion("statis_hour between", value1, value2, "statisHour");
            return (Criteria) this;
        }

        public Criteria andStatisHourNotBetween(Integer value1, Integer value2) {
            addCriterion("statis_hour not between", value1, value2, "statisHour");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yp_interface_statistics
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
     * This class corresponds to the database table yp_interface_statistics
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