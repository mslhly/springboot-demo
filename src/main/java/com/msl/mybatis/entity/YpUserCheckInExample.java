package com.msl.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YpUserCheckInExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_user_check_in
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_user_check_in
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_user_check_in
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user_check_in
     *
     * @mbggenerated
     */
    public YpUserCheckInExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user_check_in
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user_check_in
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user_check_in
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user_check_in
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user_check_in
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user_check_in
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user_check_in
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
     * This method corresponds to the database table yp_user_check_in
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
     * This method corresponds to the database table yp_user_check_in
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user_check_in
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
     * This class corresponds to the database table yp_user_check_in
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

        public Criteria andCheckInIdIsNull() {
            addCriterion("check_in_id is null");
            return (Criteria) this;
        }

        public Criteria andCheckInIdIsNotNull() {
            addCriterion("check_in_id is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInIdEqualTo(String value) {
            addCriterion("check_in_id =", value, "checkInId");
            return (Criteria) this;
        }

        public Criteria andCheckInIdNotEqualTo(String value) {
            addCriterion("check_in_id <>", value, "checkInId");
            return (Criteria) this;
        }

        public Criteria andCheckInIdGreaterThan(String value) {
            addCriterion("check_in_id >", value, "checkInId");
            return (Criteria) this;
        }

        public Criteria andCheckInIdGreaterThanOrEqualTo(String value) {
            addCriterion("check_in_id >=", value, "checkInId");
            return (Criteria) this;
        }

        public Criteria andCheckInIdLessThan(String value) {
            addCriterion("check_in_id <", value, "checkInId");
            return (Criteria) this;
        }

        public Criteria andCheckInIdLessThanOrEqualTo(String value) {
            addCriterion("check_in_id <=", value, "checkInId");
            return (Criteria) this;
        }

        public Criteria andCheckInIdLike(String value) {
            addCriterion("check_in_id like", value, "checkInId");
            return (Criteria) this;
        }

        public Criteria andCheckInIdNotLike(String value) {
            addCriterion("check_in_id not like", value, "checkInId");
            return (Criteria) this;
        }

        public Criteria andCheckInIdIn(List<String> values) {
            addCriterion("check_in_id in", values, "checkInId");
            return (Criteria) this;
        }

        public Criteria andCheckInIdNotIn(List<String> values) {
            addCriterion("check_in_id not in", values, "checkInId");
            return (Criteria) this;
        }

        public Criteria andCheckInIdBetween(String value1, String value2) {
            addCriterion("check_in_id between", value1, value2, "checkInId");
            return (Criteria) this;
        }

        public Criteria andCheckInIdNotBetween(String value1, String value2) {
            addCriterion("check_in_id not between", value1, value2, "checkInId");
            return (Criteria) this;
        }

        public Criteria andRefUserIdIsNull() {
            addCriterion("ref_user_id is null");
            return (Criteria) this;
        }

        public Criteria andRefUserIdIsNotNull() {
            addCriterion("ref_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefUserIdEqualTo(Long value) {
            addCriterion("ref_user_id =", value, "refUserId");
            return (Criteria) this;
        }

        public Criteria andRefUserIdNotEqualTo(Long value) {
            addCriterion("ref_user_id <>", value, "refUserId");
            return (Criteria) this;
        }

        public Criteria andRefUserIdGreaterThan(Long value) {
            addCriterion("ref_user_id >", value, "refUserId");
            return (Criteria) this;
        }

        public Criteria andRefUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ref_user_id >=", value, "refUserId");
            return (Criteria) this;
        }

        public Criteria andRefUserIdLessThan(Long value) {
            addCriterion("ref_user_id <", value, "refUserId");
            return (Criteria) this;
        }

        public Criteria andRefUserIdLessThanOrEqualTo(Long value) {
            addCriterion("ref_user_id <=", value, "refUserId");
            return (Criteria) this;
        }

        public Criteria andRefUserIdIn(List<Long> values) {
            addCriterion("ref_user_id in", values, "refUserId");
            return (Criteria) this;
        }

        public Criteria andRefUserIdNotIn(List<Long> values) {
            addCriterion("ref_user_id not in", values, "refUserId");
            return (Criteria) this;
        }

        public Criteria andRefUserIdBetween(Long value1, Long value2) {
            addCriterion("ref_user_id between", value1, value2, "refUserId");
            return (Criteria) this;
        }

        public Criteria andRefUserIdNotBetween(Long value1, Long value2) {
            addCriterion("ref_user_id not between", value1, value2, "refUserId");
            return (Criteria) this;
        }

        public Criteria andCheckInCountIsNull() {
            addCriterion("check_in_count is null");
            return (Criteria) this;
        }

        public Criteria andCheckInCountIsNotNull() {
            addCriterion("check_in_count is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInCountEqualTo(Integer value) {
            addCriterion("check_in_count =", value, "checkInCount");
            return (Criteria) this;
        }

        public Criteria andCheckInCountNotEqualTo(Integer value) {
            addCriterion("check_in_count <>", value, "checkInCount");
            return (Criteria) this;
        }

        public Criteria andCheckInCountGreaterThan(Integer value) {
            addCriterion("check_in_count >", value, "checkInCount");
            return (Criteria) this;
        }

        public Criteria andCheckInCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_in_count >=", value, "checkInCount");
            return (Criteria) this;
        }

        public Criteria andCheckInCountLessThan(Integer value) {
            addCriterion("check_in_count <", value, "checkInCount");
            return (Criteria) this;
        }

        public Criteria andCheckInCountLessThanOrEqualTo(Integer value) {
            addCriterion("check_in_count <=", value, "checkInCount");
            return (Criteria) this;
        }

        public Criteria andCheckInCountIn(List<Integer> values) {
            addCriterion("check_in_count in", values, "checkInCount");
            return (Criteria) this;
        }

        public Criteria andCheckInCountNotIn(List<Integer> values) {
            addCriterion("check_in_count not in", values, "checkInCount");
            return (Criteria) this;
        }

        public Criteria andCheckInCountBetween(Integer value1, Integer value2) {
            addCriterion("check_in_count between", value1, value2, "checkInCount");
            return (Criteria) this;
        }

        public Criteria andCheckInCountNotBetween(Integer value1, Integer value2) {
            addCriterion("check_in_count not between", value1, value2, "checkInCount");
            return (Criteria) this;
        }

        public Criteria andContinuousCheckInIsNull() {
            addCriterion("continuous_check_in is null");
            return (Criteria) this;
        }

        public Criteria andContinuousCheckInIsNotNull() {
            addCriterion("continuous_check_in is not null");
            return (Criteria) this;
        }

        public Criteria andContinuousCheckInEqualTo(Integer value) {
            addCriterion("continuous_check_in =", value, "continuousCheckIn");
            return (Criteria) this;
        }

        public Criteria andContinuousCheckInNotEqualTo(Integer value) {
            addCriterion("continuous_check_in <>", value, "continuousCheckIn");
            return (Criteria) this;
        }

        public Criteria andContinuousCheckInGreaterThan(Integer value) {
            addCriterion("continuous_check_in >", value, "continuousCheckIn");
            return (Criteria) this;
        }

        public Criteria andContinuousCheckInGreaterThanOrEqualTo(Integer value) {
            addCriterion("continuous_check_in >=", value, "continuousCheckIn");
            return (Criteria) this;
        }

        public Criteria andContinuousCheckInLessThan(Integer value) {
            addCriterion("continuous_check_in <", value, "continuousCheckIn");
            return (Criteria) this;
        }

        public Criteria andContinuousCheckInLessThanOrEqualTo(Integer value) {
            addCriterion("continuous_check_in <=", value, "continuousCheckIn");
            return (Criteria) this;
        }

        public Criteria andContinuousCheckInIn(List<Integer> values) {
            addCriterion("continuous_check_in in", values, "continuousCheckIn");
            return (Criteria) this;
        }

        public Criteria andContinuousCheckInNotIn(List<Integer> values) {
            addCriterion("continuous_check_in not in", values, "continuousCheckIn");
            return (Criteria) this;
        }

        public Criteria andContinuousCheckInBetween(Integer value1, Integer value2) {
            addCriterion("continuous_check_in between", value1, value2, "continuousCheckIn");
            return (Criteria) this;
        }

        public Criteria andContinuousCheckInNotBetween(Integer value1, Integer value2) {
            addCriterion("continuous_check_in not between", value1, value2, "continuousCheckIn");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeIsNull() {
            addCriterion("check_in_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeIsNotNull() {
            addCriterion("check_in_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeEqualTo(String value) {
            addCriterion("check_in_time =", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeNotEqualTo(String value) {
            addCriterion("check_in_time <>", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeGreaterThan(String value) {
            addCriterion("check_in_time >", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeGreaterThanOrEqualTo(String value) {
            addCriterion("check_in_time >=", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeLessThan(String value) {
            addCriterion("check_in_time <", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeLessThanOrEqualTo(String value) {
            addCriterion("check_in_time <=", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeLike(String value) {
            addCriterion("check_in_time like", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeNotLike(String value) {
            addCriterion("check_in_time not like", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeIn(List<String> values) {
            addCriterion("check_in_time in", values, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeNotIn(List<String> values) {
            addCriterion("check_in_time not in", values, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeBetween(String value1, String value2) {
            addCriterion("check_in_time between", value1, value2, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeNotBetween(String value1, String value2) {
            addCriterion("check_in_time not between", value1, value2, "checkInTime");
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

        public Criteria andCheckInYearIsNull() {
            addCriterion("check_in_year is null");
            return (Criteria) this;
        }

        public Criteria andCheckInYearIsNotNull() {
            addCriterion("check_in_year is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInYearEqualTo(Integer value) {
            addCriterion("check_in_year =", value, "checkInYear");
            return (Criteria) this;
        }

        public Criteria andCheckInYearNotEqualTo(Integer value) {
            addCriterion("check_in_year <>", value, "checkInYear");
            return (Criteria) this;
        }

        public Criteria andCheckInYearGreaterThan(Integer value) {
            addCriterion("check_in_year >", value, "checkInYear");
            return (Criteria) this;
        }

        public Criteria andCheckInYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_in_year >=", value, "checkInYear");
            return (Criteria) this;
        }

        public Criteria andCheckInYearLessThan(Integer value) {
            addCriterion("check_in_year <", value, "checkInYear");
            return (Criteria) this;
        }

        public Criteria andCheckInYearLessThanOrEqualTo(Integer value) {
            addCriterion("check_in_year <=", value, "checkInYear");
            return (Criteria) this;
        }

        public Criteria andCheckInYearIn(List<Integer> values) {
            addCriterion("check_in_year in", values, "checkInYear");
            return (Criteria) this;
        }

        public Criteria andCheckInYearNotIn(List<Integer> values) {
            addCriterion("check_in_year not in", values, "checkInYear");
            return (Criteria) this;
        }

        public Criteria andCheckInYearBetween(Integer value1, Integer value2) {
            addCriterion("check_in_year between", value1, value2, "checkInYear");
            return (Criteria) this;
        }

        public Criteria andCheckInYearNotBetween(Integer value1, Integer value2) {
            addCriterion("check_in_year not between", value1, value2, "checkInYear");
            return (Criteria) this;
        }

        public Criteria andCheckInMonthIsNull() {
            addCriterion("check_in_month is null");
            return (Criteria) this;
        }

        public Criteria andCheckInMonthIsNotNull() {
            addCriterion("check_in_month is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInMonthEqualTo(Integer value) {
            addCriterion("check_in_month =", value, "checkInMonth");
            return (Criteria) this;
        }

        public Criteria andCheckInMonthNotEqualTo(Integer value) {
            addCriterion("check_in_month <>", value, "checkInMonth");
            return (Criteria) this;
        }

        public Criteria andCheckInMonthGreaterThan(Integer value) {
            addCriterion("check_in_month >", value, "checkInMonth");
            return (Criteria) this;
        }

        public Criteria andCheckInMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_in_month >=", value, "checkInMonth");
            return (Criteria) this;
        }

        public Criteria andCheckInMonthLessThan(Integer value) {
            addCriterion("check_in_month <", value, "checkInMonth");
            return (Criteria) this;
        }

        public Criteria andCheckInMonthLessThanOrEqualTo(Integer value) {
            addCriterion("check_in_month <=", value, "checkInMonth");
            return (Criteria) this;
        }

        public Criteria andCheckInMonthIn(List<Integer> values) {
            addCriterion("check_in_month in", values, "checkInMonth");
            return (Criteria) this;
        }

        public Criteria andCheckInMonthNotIn(List<Integer> values) {
            addCriterion("check_in_month not in", values, "checkInMonth");
            return (Criteria) this;
        }

        public Criteria andCheckInMonthBetween(Integer value1, Integer value2) {
            addCriterion("check_in_month between", value1, value2, "checkInMonth");
            return (Criteria) this;
        }

        public Criteria andCheckInMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("check_in_month not between", value1, value2, "checkInMonth");
            return (Criteria) this;
        }

        public Criteria andCheckInDayIsNull() {
            addCriterion("check_in_day is null");
            return (Criteria) this;
        }

        public Criteria andCheckInDayIsNotNull() {
            addCriterion("check_in_day is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInDayEqualTo(Integer value) {
            addCriterion("check_in_day =", value, "checkInDay");
            return (Criteria) this;
        }

        public Criteria andCheckInDayNotEqualTo(Integer value) {
            addCriterion("check_in_day <>", value, "checkInDay");
            return (Criteria) this;
        }

        public Criteria andCheckInDayGreaterThan(Integer value) {
            addCriterion("check_in_day >", value, "checkInDay");
            return (Criteria) this;
        }

        public Criteria andCheckInDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_in_day >=", value, "checkInDay");
            return (Criteria) this;
        }

        public Criteria andCheckInDayLessThan(Integer value) {
            addCriterion("check_in_day <", value, "checkInDay");
            return (Criteria) this;
        }

        public Criteria andCheckInDayLessThanOrEqualTo(Integer value) {
            addCriterion("check_in_day <=", value, "checkInDay");
            return (Criteria) this;
        }

        public Criteria andCheckInDayIn(List<Integer> values) {
            addCriterion("check_in_day in", values, "checkInDay");
            return (Criteria) this;
        }

        public Criteria andCheckInDayNotIn(List<Integer> values) {
            addCriterion("check_in_day not in", values, "checkInDay");
            return (Criteria) this;
        }

        public Criteria andCheckInDayBetween(Integer value1, Integer value2) {
            addCriterion("check_in_day between", value1, value2, "checkInDay");
            return (Criteria) this;
        }

        public Criteria andCheckInDayNotBetween(Integer value1, Integer value2) {
            addCriterion("check_in_day not between", value1, value2, "checkInDay");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yp_user_check_in
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
     * This class corresponds to the database table yp_user_check_in
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