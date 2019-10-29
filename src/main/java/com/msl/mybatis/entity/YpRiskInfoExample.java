package com.msl.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YpRiskInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_risk_info
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_risk_info
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_risk_info
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_risk_info
     *
     * @mbggenerated
     */
    public YpRiskInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_risk_info
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_risk_info
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_risk_info
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_risk_info
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_risk_info
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_risk_info
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_risk_info
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
     * This method corresponds to the database table yp_risk_info
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
     * This method corresponds to the database table yp_risk_info
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_risk_info
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
     * This class corresponds to the database table yp_risk_info
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

        public Criteria andRiskCodeIsNull() {
            addCriterion("risk_code is null");
            return (Criteria) this;
        }

        public Criteria andRiskCodeIsNotNull() {
            addCriterion("risk_code is not null");
            return (Criteria) this;
        }

        public Criteria andRiskCodeEqualTo(Integer value) {
            addCriterion("risk_code =", value, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeNotEqualTo(Integer value) {
            addCriterion("risk_code <>", value, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeGreaterThan(Integer value) {
            addCriterion("risk_code >", value, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("risk_code >=", value, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeLessThan(Integer value) {
            addCriterion("risk_code <", value, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeLessThanOrEqualTo(Integer value) {
            addCriterion("risk_code <=", value, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeIn(List<Integer> values) {
            addCriterion("risk_code in", values, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeNotIn(List<Integer> values) {
            addCriterion("risk_code not in", values, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeBetween(Integer value1, Integer value2) {
            addCriterion("risk_code between", value1, value2, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("risk_code not between", value1, value2, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskNameIsNull() {
            addCriterion("risk_name is null");
            return (Criteria) this;
        }

        public Criteria andRiskNameIsNotNull() {
            addCriterion("risk_name is not null");
            return (Criteria) this;
        }

        public Criteria andRiskNameEqualTo(String value) {
            addCriterion("risk_name =", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameNotEqualTo(String value) {
            addCriterion("risk_name <>", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameGreaterThan(String value) {
            addCriterion("risk_name >", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameGreaterThanOrEqualTo(String value) {
            addCriterion("risk_name >=", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameLessThan(String value) {
            addCriterion("risk_name <", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameLessThanOrEqualTo(String value) {
            addCriterion("risk_name <=", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameLike(String value) {
            addCriterion("risk_name like", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameNotLike(String value) {
            addCriterion("risk_name not like", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameIn(List<String> values) {
            addCriterion("risk_name in", values, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameNotIn(List<String> values) {
            addCriterion("risk_name not in", values, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameBetween(String value1, String value2) {
            addCriterion("risk_name between", value1, value2, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameNotBetween(String value1, String value2) {
            addCriterion("risk_name not between", value1, value2, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskDesIsNull() {
            addCriterion("risk_des is null");
            return (Criteria) this;
        }

        public Criteria andRiskDesIsNotNull() {
            addCriterion("risk_des is not null");
            return (Criteria) this;
        }

        public Criteria andRiskDesEqualTo(String value) {
            addCriterion("risk_des =", value, "riskDes");
            return (Criteria) this;
        }

        public Criteria andRiskDesNotEqualTo(String value) {
            addCriterion("risk_des <>", value, "riskDes");
            return (Criteria) this;
        }

        public Criteria andRiskDesGreaterThan(String value) {
            addCriterion("risk_des >", value, "riskDes");
            return (Criteria) this;
        }

        public Criteria andRiskDesGreaterThanOrEqualTo(String value) {
            addCriterion("risk_des >=", value, "riskDes");
            return (Criteria) this;
        }

        public Criteria andRiskDesLessThan(String value) {
            addCriterion("risk_des <", value, "riskDes");
            return (Criteria) this;
        }

        public Criteria andRiskDesLessThanOrEqualTo(String value) {
            addCriterion("risk_des <=", value, "riskDes");
            return (Criteria) this;
        }

        public Criteria andRiskDesLike(String value) {
            addCriterion("risk_des like", value, "riskDes");
            return (Criteria) this;
        }

        public Criteria andRiskDesNotLike(String value) {
            addCriterion("risk_des not like", value, "riskDes");
            return (Criteria) this;
        }

        public Criteria andRiskDesIn(List<String> values) {
            addCriterion("risk_des in", values, "riskDes");
            return (Criteria) this;
        }

        public Criteria andRiskDesNotIn(List<String> values) {
            addCriterion("risk_des not in", values, "riskDes");
            return (Criteria) this;
        }

        public Criteria andRiskDesBetween(String value1, String value2) {
            addCriterion("risk_des between", value1, value2, "riskDes");
            return (Criteria) this;
        }

        public Criteria andRiskDesNotBetween(String value1, String value2) {
            addCriterion("risk_des not between", value1, value2, "riskDes");
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
     * This class corresponds to the database table yp_risk_info
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
     * This class corresponds to the database table yp_risk_info
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