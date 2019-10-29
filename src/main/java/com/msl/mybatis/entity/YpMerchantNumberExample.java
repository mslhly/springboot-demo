package com.msl.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YpMerchantNumberExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_merchant_number
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_merchant_number
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_merchant_number
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_number
     *
     * @mbggenerated
     */
    public YpMerchantNumberExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_number
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_number
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_number
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_number
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_number
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_number
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_number
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
     * This method corresponds to the database table yp_merchant_number
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
     * This method corresponds to the database table yp_merchant_number
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_number
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
     * This class corresponds to the database table yp_merchant_number
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

        public Criteria andRefShopIdIsNull() {
            addCriterion("ref_shop_id is null");
            return (Criteria) this;
        }

        public Criteria andRefShopIdIsNotNull() {
            addCriterion("ref_shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefShopIdEqualTo(Long value) {
            addCriterion("ref_shop_id =", value, "refShopId");
            return (Criteria) this;
        }

        public Criteria andRefShopIdNotEqualTo(Long value) {
            addCriterion("ref_shop_id <>", value, "refShopId");
            return (Criteria) this;
        }

        public Criteria andRefShopIdGreaterThan(Long value) {
            addCriterion("ref_shop_id >", value, "refShopId");
            return (Criteria) this;
        }

        public Criteria andRefShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ref_shop_id >=", value, "refShopId");
            return (Criteria) this;
        }

        public Criteria andRefShopIdLessThan(Long value) {
            addCriterion("ref_shop_id <", value, "refShopId");
            return (Criteria) this;
        }

        public Criteria andRefShopIdLessThanOrEqualTo(Long value) {
            addCriterion("ref_shop_id <=", value, "refShopId");
            return (Criteria) this;
        }

        public Criteria andRefShopIdIn(List<Long> values) {
            addCriterion("ref_shop_id in", values, "refShopId");
            return (Criteria) this;
        }

        public Criteria andRefShopIdNotIn(List<Long> values) {
            addCriterion("ref_shop_id not in", values, "refShopId");
            return (Criteria) this;
        }

        public Criteria andRefShopIdBetween(Long value1, Long value2) {
            addCriterion("ref_shop_id between", value1, value2, "refShopId");
            return (Criteria) this;
        }

        public Criteria andRefShopIdNotBetween(Long value1, Long value2) {
            addCriterion("ref_shop_id not between", value1, value2, "refShopId");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIsNull() {
            addCriterion("merchant_no is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIsNotNull() {
            addCriterion("merchant_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoEqualTo(String value) {
            addCriterion("merchant_no =", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotEqualTo(String value) {
            addCriterion("merchant_no <>", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThan(String value) {
            addCriterion("merchant_no >", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_no >=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThan(String value) {
            addCriterion("merchant_no <", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThanOrEqualTo(String value) {
            addCriterion("merchant_no <=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLike(String value) {
            addCriterion("merchant_no like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotLike(String value) {
            addCriterion("merchant_no not like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIn(List<String> values) {
            addCriterion("merchant_no in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotIn(List<String> values) {
            addCriterion("merchant_no not in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoBetween(String value1, String value2) {
            addCriterion("merchant_no between", value1, value2, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotBetween(String value1, String value2) {
            addCriterion("merchant_no not between", value1, value2, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andStoreCodeIsNull() {
            addCriterion("store_code is null");
            return (Criteria) this;
        }

        public Criteria andStoreCodeIsNotNull() {
            addCriterion("store_code is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCodeEqualTo(String value) {
            addCriterion("store_code =", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotEqualTo(String value) {
            addCriterion("store_code <>", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeGreaterThan(String value) {
            addCriterion("store_code >", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeGreaterThanOrEqualTo(String value) {
            addCriterion("store_code >=", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeLessThan(String value) {
            addCriterion("store_code <", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeLessThanOrEqualTo(String value) {
            addCriterion("store_code <=", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeLike(String value) {
            addCriterion("store_code like", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotLike(String value) {
            addCriterion("store_code not like", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeIn(List<String> values) {
            addCriterion("store_code in", values, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotIn(List<String> values) {
            addCriterion("store_code not in", values, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeBetween(String value1, String value2) {
            addCriterion("store_code between", value1, value2, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotBetween(String value1, String value2) {
            addCriterion("store_code not between", value1, value2, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreAbbreviationIsNull() {
            addCriterion("store_abbreviation is null");
            return (Criteria) this;
        }

        public Criteria andStoreAbbreviationIsNotNull() {
            addCriterion("store_abbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAbbreviationEqualTo(String value) {
            addCriterion("store_abbreviation =", value, "storeAbbreviation");
            return (Criteria) this;
        }

        public Criteria andStoreAbbreviationNotEqualTo(String value) {
            addCriterion("store_abbreviation <>", value, "storeAbbreviation");
            return (Criteria) this;
        }

        public Criteria andStoreAbbreviationGreaterThan(String value) {
            addCriterion("store_abbreviation >", value, "storeAbbreviation");
            return (Criteria) this;
        }

        public Criteria andStoreAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("store_abbreviation >=", value, "storeAbbreviation");
            return (Criteria) this;
        }

        public Criteria andStoreAbbreviationLessThan(String value) {
            addCriterion("store_abbreviation <", value, "storeAbbreviation");
            return (Criteria) this;
        }

        public Criteria andStoreAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("store_abbreviation <=", value, "storeAbbreviation");
            return (Criteria) this;
        }

        public Criteria andStoreAbbreviationLike(String value) {
            addCriterion("store_abbreviation like", value, "storeAbbreviation");
            return (Criteria) this;
        }

        public Criteria andStoreAbbreviationNotLike(String value) {
            addCriterion("store_abbreviation not like", value, "storeAbbreviation");
            return (Criteria) this;
        }

        public Criteria andStoreAbbreviationIn(List<String> values) {
            addCriterion("store_abbreviation in", values, "storeAbbreviation");
            return (Criteria) this;
        }

        public Criteria andStoreAbbreviationNotIn(List<String> values) {
            addCriterion("store_abbreviation not in", values, "storeAbbreviation");
            return (Criteria) this;
        }

        public Criteria andStoreAbbreviationBetween(String value1, String value2) {
            addCriterion("store_abbreviation between", value1, value2, "storeAbbreviation");
            return (Criteria) this;
        }

        public Criteria andStoreAbbreviationNotBetween(String value1, String value2) {
            addCriterion("store_abbreviation not between", value1, value2, "storeAbbreviation");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIsNull() {
            addCriterion("channel_type is null");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIsNotNull() {
            addCriterion("channel_type is not null");
            return (Criteria) this;
        }

        public Criteria andChannelTypeEqualTo(Integer value) {
            addCriterion("channel_type =", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotEqualTo(Integer value) {
            addCriterion("channel_type <>", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeGreaterThan(Integer value) {
            addCriterion("channel_type >", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_type >=", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeLessThan(Integer value) {
            addCriterion("channel_type <", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeLessThanOrEqualTo(Integer value) {
            addCriterion("channel_type <=", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIn(List<Integer> values) {
            addCriterion("channel_type in", values, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotIn(List<Integer> values) {
            addCriterion("channel_type not in", values, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeBetween(Integer value1, Integer value2) {
            addCriterion("channel_type between", value1, value2, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_type not between", value1, value2, "channelType");
            return (Criteria) this;
        }

        public Criteria andCreatorPresonIsNull() {
            addCriterion("creator_preson is null");
            return (Criteria) this;
        }

        public Criteria andCreatorPresonIsNotNull() {
            addCriterion("creator_preson is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorPresonEqualTo(String value) {
            addCriterion("creator_preson =", value, "creatorPreson");
            return (Criteria) this;
        }

        public Criteria andCreatorPresonNotEqualTo(String value) {
            addCriterion("creator_preson <>", value, "creatorPreson");
            return (Criteria) this;
        }

        public Criteria andCreatorPresonGreaterThan(String value) {
            addCriterion("creator_preson >", value, "creatorPreson");
            return (Criteria) this;
        }

        public Criteria andCreatorPresonGreaterThanOrEqualTo(String value) {
            addCriterion("creator_preson >=", value, "creatorPreson");
            return (Criteria) this;
        }

        public Criteria andCreatorPresonLessThan(String value) {
            addCriterion("creator_preson <", value, "creatorPreson");
            return (Criteria) this;
        }

        public Criteria andCreatorPresonLessThanOrEqualTo(String value) {
            addCriterion("creator_preson <=", value, "creatorPreson");
            return (Criteria) this;
        }

        public Criteria andCreatorPresonLike(String value) {
            addCriterion("creator_preson like", value, "creatorPreson");
            return (Criteria) this;
        }

        public Criteria andCreatorPresonNotLike(String value) {
            addCriterion("creator_preson not like", value, "creatorPreson");
            return (Criteria) this;
        }

        public Criteria andCreatorPresonIn(List<String> values) {
            addCriterion("creator_preson in", values, "creatorPreson");
            return (Criteria) this;
        }

        public Criteria andCreatorPresonNotIn(List<String> values) {
            addCriterion("creator_preson not in", values, "creatorPreson");
            return (Criteria) this;
        }

        public Criteria andCreatorPresonBetween(String value1, String value2) {
            addCriterion("creator_preson between", value1, value2, "creatorPreson");
            return (Criteria) this;
        }

        public Criteria andCreatorPresonNotBetween(String value1, String value2) {
            addCriterion("creator_preson not between", value1, value2, "creatorPreson");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("mark is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("mark is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(String value) {
            addCriterion("mark =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(String value) {
            addCriterion("mark <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(String value) {
            addCriterion("mark >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(String value) {
            addCriterion("mark >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(String value) {
            addCriterion("mark <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(String value) {
            addCriterion("mark <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLike(String value) {
            addCriterion("mark like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotLike(String value) {
            addCriterion("mark not like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<String> values) {
            addCriterion("mark in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<String> values) {
            addCriterion("mark not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(String value1, String value2) {
            addCriterion("mark between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(String value1, String value2) {
            addCriterion("mark not between", value1, value2, "mark");
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

        public Criteria andOpenKeyIsNull() {
            addCriterion("open_key is null");
            return (Criteria) this;
        }

        public Criteria andOpenKeyIsNotNull() {
            addCriterion("open_key is not null");
            return (Criteria) this;
        }

        public Criteria andOpenKeyEqualTo(String value) {
            addCriterion("open_key =", value, "openKey");
            return (Criteria) this;
        }

        public Criteria andOpenKeyNotEqualTo(String value) {
            addCriterion("open_key <>", value, "openKey");
            return (Criteria) this;
        }

        public Criteria andOpenKeyGreaterThan(String value) {
            addCriterion("open_key >", value, "openKey");
            return (Criteria) this;
        }

        public Criteria andOpenKeyGreaterThanOrEqualTo(String value) {
            addCriterion("open_key >=", value, "openKey");
            return (Criteria) this;
        }

        public Criteria andOpenKeyLessThan(String value) {
            addCriterion("open_key <", value, "openKey");
            return (Criteria) this;
        }

        public Criteria andOpenKeyLessThanOrEqualTo(String value) {
            addCriterion("open_key <=", value, "openKey");
            return (Criteria) this;
        }

        public Criteria andOpenKeyLike(String value) {
            addCriterion("open_key like", value, "openKey");
            return (Criteria) this;
        }

        public Criteria andOpenKeyNotLike(String value) {
            addCriterion("open_key not like", value, "openKey");
            return (Criteria) this;
        }

        public Criteria andOpenKeyIn(List<String> values) {
            addCriterion("open_key in", values, "openKey");
            return (Criteria) this;
        }

        public Criteria andOpenKeyNotIn(List<String> values) {
            addCriterion("open_key not in", values, "openKey");
            return (Criteria) this;
        }

        public Criteria andOpenKeyBetween(String value1, String value2) {
            addCriterion("open_key between", value1, value2, "openKey");
            return (Criteria) this;
        }

        public Criteria andOpenKeyNotBetween(String value1, String value2) {
            addCriterion("open_key not between", value1, value2, "openKey");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yp_merchant_number
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
     * This class corresponds to the database table yp_merchant_number
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