package com.msl.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

public class YpServiceofficeStatExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_serviceoffice_stat
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_serviceoffice_stat
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_serviceoffice_stat
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_serviceoffice_stat
     *
     * @mbggenerated
     */
    public YpServiceofficeStatExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_serviceoffice_stat
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_serviceoffice_stat
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_serviceoffice_stat
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_serviceoffice_stat
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_serviceoffice_stat
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_serviceoffice_stat
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_serviceoffice_stat
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
     * This method corresponds to the database table yp_serviceoffice_stat
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
     * This method corresponds to the database table yp_serviceoffice_stat
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_serviceoffice_stat
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
     * This class corresponds to the database table yp_serviceoffice_stat
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

        public Criteria andStatIdIsNull() {
            addCriterion("stat_id is null");
            return (Criteria) this;
        }

        public Criteria andStatIdIsNotNull() {
            addCriterion("stat_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatIdEqualTo(Integer value) {
            addCriterion("stat_id =", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdNotEqualTo(Integer value) {
            addCriterion("stat_id <>", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdGreaterThan(Integer value) {
            addCriterion("stat_id >", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stat_id >=", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdLessThan(Integer value) {
            addCriterion("stat_id <", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdLessThanOrEqualTo(Integer value) {
            addCriterion("stat_id <=", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdIn(List<Integer> values) {
            addCriterion("stat_id in", values, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdNotIn(List<Integer> values) {
            addCriterion("stat_id not in", values, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdBetween(Integer value1, Integer value2) {
            addCriterion("stat_id between", value1, value2, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stat_id not between", value1, value2, "statId");
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

        public Criteria andYearOfMonthIsNull() {
            addCriterion("year_of_month is null");
            return (Criteria) this;
        }

        public Criteria andYearOfMonthIsNotNull() {
            addCriterion("year_of_month is not null");
            return (Criteria) this;
        }

        public Criteria andYearOfMonthEqualTo(String value) {
            addCriterion("year_of_month =", value, "yearOfMonth");
            return (Criteria) this;
        }

        public Criteria andYearOfMonthNotEqualTo(String value) {
            addCriterion("year_of_month <>", value, "yearOfMonth");
            return (Criteria) this;
        }

        public Criteria andYearOfMonthGreaterThan(String value) {
            addCriterion("year_of_month >", value, "yearOfMonth");
            return (Criteria) this;
        }

        public Criteria andYearOfMonthGreaterThanOrEqualTo(String value) {
            addCriterion("year_of_month >=", value, "yearOfMonth");
            return (Criteria) this;
        }

        public Criteria andYearOfMonthLessThan(String value) {
            addCriterion("year_of_month <", value, "yearOfMonth");
            return (Criteria) this;
        }

        public Criteria andYearOfMonthLessThanOrEqualTo(String value) {
            addCriterion("year_of_month <=", value, "yearOfMonth");
            return (Criteria) this;
        }

        public Criteria andYearOfMonthLike(String value) {
            addCriterion("year_of_month like", value, "yearOfMonth");
            return (Criteria) this;
        }

        public Criteria andYearOfMonthNotLike(String value) {
            addCriterion("year_of_month not like", value, "yearOfMonth");
            return (Criteria) this;
        }

        public Criteria andYearOfMonthIn(List<String> values) {
            addCriterion("year_of_month in", values, "yearOfMonth");
            return (Criteria) this;
        }

        public Criteria andYearOfMonthNotIn(List<String> values) {
            addCriterion("year_of_month not in", values, "yearOfMonth");
            return (Criteria) this;
        }

        public Criteria andYearOfMonthBetween(String value1, String value2) {
            addCriterion("year_of_month between", value1, value2, "yearOfMonth");
            return (Criteria) this;
        }

        public Criteria andYearOfMonthNotBetween(String value1, String value2) {
            addCriterion("year_of_month not between", value1, value2, "yearOfMonth");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(Integer value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(Integer value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(Integer value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(Integer value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(Integer value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(Integer value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<Integer> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<Integer> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(Integer value1, Integer value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(Integer value1, Integer value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andMonthTransactionIsNull() {
            addCriterion("month_transaction is null");
            return (Criteria) this;
        }

        public Criteria andMonthTransactionIsNotNull() {
            addCriterion("month_transaction is not null");
            return (Criteria) this;
        }

        public Criteria andMonthTransactionEqualTo(Integer value) {
            addCriterion("month_transaction =", value, "monthTransaction");
            return (Criteria) this;
        }

        public Criteria andMonthTransactionNotEqualTo(Integer value) {
            addCriterion("month_transaction <>", value, "monthTransaction");
            return (Criteria) this;
        }

        public Criteria andMonthTransactionGreaterThan(Integer value) {
            addCriterion("month_transaction >", value, "monthTransaction");
            return (Criteria) this;
        }

        public Criteria andMonthTransactionGreaterThanOrEqualTo(Integer value) {
            addCriterion("month_transaction >=", value, "monthTransaction");
            return (Criteria) this;
        }

        public Criteria andMonthTransactionLessThan(Integer value) {
            addCriterion("month_transaction <", value, "monthTransaction");
            return (Criteria) this;
        }

        public Criteria andMonthTransactionLessThanOrEqualTo(Integer value) {
            addCriterion("month_transaction <=", value, "monthTransaction");
            return (Criteria) this;
        }

        public Criteria andMonthTransactionIn(List<Integer> values) {
            addCriterion("month_transaction in", values, "monthTransaction");
            return (Criteria) this;
        }

        public Criteria andMonthTransactionNotIn(List<Integer> values) {
            addCriterion("month_transaction not in", values, "monthTransaction");
            return (Criteria) this;
        }

        public Criteria andMonthTransactionBetween(Integer value1, Integer value2) {
            addCriterion("month_transaction between", value1, value2, "monthTransaction");
            return (Criteria) this;
        }

        public Criteria andMonthTransactionNotBetween(Integer value1, Integer value2) {
            addCriterion("month_transaction not between", value1, value2, "monthTransaction");
            return (Criteria) this;
        }

        public Criteria andMonthPaymentAmountIsNull() {
            addCriterion("month_payment_amount is null");
            return (Criteria) this;
        }

        public Criteria andMonthPaymentAmountIsNotNull() {
            addCriterion("month_payment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMonthPaymentAmountEqualTo(Long value) {
            addCriterion("month_payment_amount =", value, "monthPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMonthPaymentAmountNotEqualTo(Long value) {
            addCriterion("month_payment_amount <>", value, "monthPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMonthPaymentAmountGreaterThan(Long value) {
            addCriterion("month_payment_amount >", value, "monthPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMonthPaymentAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("month_payment_amount >=", value, "monthPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMonthPaymentAmountLessThan(Long value) {
            addCriterion("month_payment_amount <", value, "monthPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMonthPaymentAmountLessThanOrEqualTo(Long value) {
            addCriterion("month_payment_amount <=", value, "monthPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMonthPaymentAmountIn(List<Long> values) {
            addCriterion("month_payment_amount in", values, "monthPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMonthPaymentAmountNotIn(List<Long> values) {
            addCriterion("month_payment_amount not in", values, "monthPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMonthPaymentAmountBetween(Long value1, Long value2) {
            addCriterion("month_payment_amount between", value1, value2, "monthPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMonthPaymentAmountNotBetween(Long value1, Long value2) {
            addCriterion("month_payment_amount not between", value1, value2, "monthPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMonthRegisterIsNull() {
            addCriterion("month_register is null");
            return (Criteria) this;
        }

        public Criteria andMonthRegisterIsNotNull() {
            addCriterion("month_register is not null");
            return (Criteria) this;
        }

        public Criteria andMonthRegisterEqualTo(Integer value) {
            addCriterion("month_register =", value, "monthRegister");
            return (Criteria) this;
        }

        public Criteria andMonthRegisterNotEqualTo(Integer value) {
            addCriterion("month_register <>", value, "monthRegister");
            return (Criteria) this;
        }

        public Criteria andMonthRegisterGreaterThan(Integer value) {
            addCriterion("month_register >", value, "monthRegister");
            return (Criteria) this;
        }

        public Criteria andMonthRegisterGreaterThanOrEqualTo(Integer value) {
            addCriterion("month_register >=", value, "monthRegister");
            return (Criteria) this;
        }

        public Criteria andMonthRegisterLessThan(Integer value) {
            addCriterion("month_register <", value, "monthRegister");
            return (Criteria) this;
        }

        public Criteria andMonthRegisterLessThanOrEqualTo(Integer value) {
            addCriterion("month_register <=", value, "monthRegister");
            return (Criteria) this;
        }

        public Criteria andMonthRegisterIn(List<Integer> values) {
            addCriterion("month_register in", values, "monthRegister");
            return (Criteria) this;
        }

        public Criteria andMonthRegisterNotIn(List<Integer> values) {
            addCriterion("month_register not in", values, "monthRegister");
            return (Criteria) this;
        }

        public Criteria andMonthRegisterBetween(Integer value1, Integer value2) {
            addCriterion("month_register between", value1, value2, "monthRegister");
            return (Criteria) this;
        }

        public Criteria andMonthRegisterNotBetween(Integer value1, Integer value2) {
            addCriterion("month_register not between", value1, value2, "monthRegister");
            return (Criteria) this;
        }

        public Criteria andMonthMerchantGoodopinionIsNull() {
            addCriterion("month_merchant_goodopinion is null");
            return (Criteria) this;
        }

        public Criteria andMonthMerchantGoodopinionIsNotNull() {
            addCriterion("month_merchant_goodopinion is not null");
            return (Criteria) this;
        }

        public Criteria andMonthMerchantGoodopinionEqualTo(Integer value) {
            addCriterion("month_merchant_goodopinion =", value, "monthMerchantGoodopinion");
            return (Criteria) this;
        }

        public Criteria andMonthMerchantGoodopinionNotEqualTo(Integer value) {
            addCriterion("month_merchant_goodopinion <>", value, "monthMerchantGoodopinion");
            return (Criteria) this;
        }

        public Criteria andMonthMerchantGoodopinionGreaterThan(Integer value) {
            addCriterion("month_merchant_goodopinion >", value, "monthMerchantGoodopinion");
            return (Criteria) this;
        }

        public Criteria andMonthMerchantGoodopinionGreaterThanOrEqualTo(Integer value) {
            addCriterion("month_merchant_goodopinion >=", value, "monthMerchantGoodopinion");
            return (Criteria) this;
        }

        public Criteria andMonthMerchantGoodopinionLessThan(Integer value) {
            addCriterion("month_merchant_goodopinion <", value, "monthMerchantGoodopinion");
            return (Criteria) this;
        }

        public Criteria andMonthMerchantGoodopinionLessThanOrEqualTo(Integer value) {
            addCriterion("month_merchant_goodopinion <=", value, "monthMerchantGoodopinion");
            return (Criteria) this;
        }

        public Criteria andMonthMerchantGoodopinionIn(List<Integer> values) {
            addCriterion("month_merchant_goodopinion in", values, "monthMerchantGoodopinion");
            return (Criteria) this;
        }

        public Criteria andMonthMerchantGoodopinionNotIn(List<Integer> values) {
            addCriterion("month_merchant_goodopinion not in", values, "monthMerchantGoodopinion");
            return (Criteria) this;
        }

        public Criteria andMonthMerchantGoodopinionBetween(Integer value1, Integer value2) {
            addCriterion("month_merchant_goodopinion between", value1, value2, "monthMerchantGoodopinion");
            return (Criteria) this;
        }

        public Criteria andMonthMerchantGoodopinionNotBetween(Integer value1, Integer value2) {
            addCriterion("month_merchant_goodopinion not between", value1, value2, "monthMerchantGoodopinion");
            return (Criteria) this;
        }

        public Criteria andMonthMerchtAgainstRuleIsNull() {
            addCriterion("month_mercht_against_rule is null");
            return (Criteria) this;
        }

        public Criteria andMonthMerchtAgainstRuleIsNotNull() {
            addCriterion("month_mercht_against_rule is not null");
            return (Criteria) this;
        }

        public Criteria andMonthMerchtAgainstRuleEqualTo(Integer value) {
            addCriterion("month_mercht_against_rule =", value, "monthMerchtAgainstRule");
            return (Criteria) this;
        }

        public Criteria andMonthMerchtAgainstRuleNotEqualTo(Integer value) {
            addCriterion("month_mercht_against_rule <>", value, "monthMerchtAgainstRule");
            return (Criteria) this;
        }

        public Criteria andMonthMerchtAgainstRuleGreaterThan(Integer value) {
            addCriterion("month_mercht_against_rule >", value, "monthMerchtAgainstRule");
            return (Criteria) this;
        }

        public Criteria andMonthMerchtAgainstRuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("month_mercht_against_rule >=", value, "monthMerchtAgainstRule");
            return (Criteria) this;
        }

        public Criteria andMonthMerchtAgainstRuleLessThan(Integer value) {
            addCriterion("month_mercht_against_rule <", value, "monthMerchtAgainstRule");
            return (Criteria) this;
        }

        public Criteria andMonthMerchtAgainstRuleLessThanOrEqualTo(Integer value) {
            addCriterion("month_mercht_against_rule <=", value, "monthMerchtAgainstRule");
            return (Criteria) this;
        }

        public Criteria andMonthMerchtAgainstRuleIn(List<Integer> values) {
            addCriterion("month_mercht_against_rule in", values, "monthMerchtAgainstRule");
            return (Criteria) this;
        }

        public Criteria andMonthMerchtAgainstRuleNotIn(List<Integer> values) {
            addCriterion("month_mercht_against_rule not in", values, "monthMerchtAgainstRule");
            return (Criteria) this;
        }

        public Criteria andMonthMerchtAgainstRuleBetween(Integer value1, Integer value2) {
            addCriterion("month_mercht_against_rule between", value1, value2, "monthMerchtAgainstRule");
            return (Criteria) this;
        }

        public Criteria andMonthMerchtAgainstRuleNotBetween(Integer value1, Integer value2) {
            addCriterion("month_mercht_against_rule not between", value1, value2, "monthMerchtAgainstRule");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yp_serviceoffice_stat
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
     * This class corresponds to the database table yp_serviceoffice_stat
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