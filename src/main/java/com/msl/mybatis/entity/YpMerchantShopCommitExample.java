package com.msl.mybatis.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YpMerchantShopCommitExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_merchant_shop_commit
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_merchant_shop_commit
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_merchant_shop_commit
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_shop_commit
     *
     * @mbggenerated
     */
    public YpMerchantShopCommitExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_shop_commit
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_shop_commit
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_shop_commit
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_shop_commit
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_shop_commit
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_shop_commit
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_shop_commit
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
     * This method corresponds to the database table yp_merchant_shop_commit
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
     * This method corresponds to the database table yp_merchant_shop_commit
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_shop_commit
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
     * This class corresponds to the database table yp_merchant_shop_commit
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

        public Criteria andCommitIdIsNull() {
            addCriterion("commit_id is null");
            return (Criteria) this;
        }

        public Criteria andCommitIdIsNotNull() {
            addCriterion("commit_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommitIdEqualTo(Long value) {
            addCriterion("commit_id =", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdNotEqualTo(Long value) {
            addCriterion("commit_id <>", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdGreaterThan(Long value) {
            addCriterion("commit_id >", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdGreaterThanOrEqualTo(Long value) {
            addCriterion("commit_id >=", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdLessThan(Long value) {
            addCriterion("commit_id <", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdLessThanOrEqualTo(Long value) {
            addCriterion("commit_id <=", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdIn(List<Long> values) {
            addCriterion("commit_id in", values, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdNotIn(List<Long> values) {
            addCriterion("commit_id not in", values, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdBetween(Long value1, Long value2) {
            addCriterion("commit_id between", value1, value2, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdNotBetween(Long value1, Long value2) {
            addCriterion("commit_id not between", value1, value2, "commitId");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andRefMerchantIdIsNull() {
            addCriterion("ref_merchant_id is null");
            return (Criteria) this;
        }

        public Criteria andRefMerchantIdIsNotNull() {
            addCriterion("ref_merchant_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefMerchantIdEqualTo(Long value) {
            addCriterion("ref_merchant_id =", value, "refMerchantId");
            return (Criteria) this;
        }

        public Criteria andRefMerchantIdNotEqualTo(Long value) {
            addCriterion("ref_merchant_id <>", value, "refMerchantId");
            return (Criteria) this;
        }

        public Criteria andRefMerchantIdGreaterThan(Long value) {
            addCriterion("ref_merchant_id >", value, "refMerchantId");
            return (Criteria) this;
        }

        public Criteria andRefMerchantIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ref_merchant_id >=", value, "refMerchantId");
            return (Criteria) this;
        }

        public Criteria andRefMerchantIdLessThan(Long value) {
            addCriterion("ref_merchant_id <", value, "refMerchantId");
            return (Criteria) this;
        }

        public Criteria andRefMerchantIdLessThanOrEqualTo(Long value) {
            addCriterion("ref_merchant_id <=", value, "refMerchantId");
            return (Criteria) this;
        }

        public Criteria andRefMerchantIdIn(List<Long> values) {
            addCriterion("ref_merchant_id in", values, "refMerchantId");
            return (Criteria) this;
        }

        public Criteria andRefMerchantIdNotIn(List<Long> values) {
            addCriterion("ref_merchant_id not in", values, "refMerchantId");
            return (Criteria) this;
        }

        public Criteria andRefMerchantIdBetween(Long value1, Long value2) {
            addCriterion("ref_merchant_id between", value1, value2, "refMerchantId");
            return (Criteria) this;
        }

        public Criteria andRefMerchantIdNotBetween(Long value1, Long value2) {
            addCriterion("ref_merchant_id not between", value1, value2, "refMerchantId");
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

        public Criteria andIsshowIsNull() {
            addCriterion("isshow is null");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNotNull() {
            addCriterion("isshow is not null");
            return (Criteria) this;
        }

        public Criteria andIsshowEqualTo(Byte value) {
            addCriterion("isshow =", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotEqualTo(Byte value) {
            addCriterion("isshow <>", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThan(Byte value) {
            addCriterion("isshow >", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThanOrEqualTo(Byte value) {
            addCriterion("isshow >=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThan(Byte value) {
            addCriterion("isshow <", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThanOrEqualTo(Byte value) {
            addCriterion("isshow <=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowIn(List<Byte> values) {
            addCriterion("isshow in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotIn(List<Byte> values) {
            addCriterion("isshow not in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowBetween(Byte value1, Byte value2) {
            addCriterion("isshow between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotBetween(Byte value1, Byte value2) {
            addCriterion("isshow not between", value1, value2, "isshow");
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

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(BigDecimal value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(BigDecimal value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(BigDecimal value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(BigDecimal value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<BigDecimal> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<BigDecimal> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score not between", value1, value2, "score");
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

        public Criteria andCommitSourceIsNull() {
            addCriterion("commit_source is null");
            return (Criteria) this;
        }

        public Criteria andCommitSourceIsNotNull() {
            addCriterion("commit_source is not null");
            return (Criteria) this;
        }

        public Criteria andCommitSourceEqualTo(Short value) {
            addCriterion("commit_source =", value, "commitSource");
            return (Criteria) this;
        }

        public Criteria andCommitSourceNotEqualTo(Short value) {
            addCriterion("commit_source <>", value, "commitSource");
            return (Criteria) this;
        }

        public Criteria andCommitSourceGreaterThan(Short value) {
            addCriterion("commit_source >", value, "commitSource");
            return (Criteria) this;
        }

        public Criteria andCommitSourceGreaterThanOrEqualTo(Short value) {
            addCriterion("commit_source >=", value, "commitSource");
            return (Criteria) this;
        }

        public Criteria andCommitSourceLessThan(Short value) {
            addCriterion("commit_source <", value, "commitSource");
            return (Criteria) this;
        }

        public Criteria andCommitSourceLessThanOrEqualTo(Short value) {
            addCriterion("commit_source <=", value, "commitSource");
            return (Criteria) this;
        }

        public Criteria andCommitSourceIn(List<Short> values) {
            addCriterion("commit_source in", values, "commitSource");
            return (Criteria) this;
        }

        public Criteria andCommitSourceNotIn(List<Short> values) {
            addCriterion("commit_source not in", values, "commitSource");
            return (Criteria) this;
        }

        public Criteria andCommitSourceBetween(Short value1, Short value2) {
            addCriterion("commit_source between", value1, value2, "commitSource");
            return (Criteria) this;
        }

        public Criteria andCommitSourceNotBetween(Short value1, Short value2) {
            addCriterion("commit_source not between", value1, value2, "commitSource");
            return (Criteria) this;
        }

        public Criteria andHeadimgIsNull() {
            addCriterion("headimg is null");
            return (Criteria) this;
        }

        public Criteria andHeadimgIsNotNull() {
            addCriterion("headimg is not null");
            return (Criteria) this;
        }

        public Criteria andHeadimgEqualTo(String value) {
            addCriterion("headimg =", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotEqualTo(String value) {
            addCriterion("headimg <>", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgGreaterThan(String value) {
            addCriterion("headimg >", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgGreaterThanOrEqualTo(String value) {
            addCriterion("headimg >=", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgLessThan(String value) {
            addCriterion("headimg <", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgLessThanOrEqualTo(String value) {
            addCriterion("headimg <=", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgLike(String value) {
            addCriterion("headimg like", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotLike(String value) {
            addCriterion("headimg not like", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgIn(List<String> values) {
            addCriterion("headimg in", values, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotIn(List<String> values) {
            addCriterion("headimg not in", values, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgBetween(String value1, String value2) {
            addCriterion("headimg between", value1, value2, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotBetween(String value1, String value2) {
            addCriterion("headimg not between", value1, value2, "headimg");
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
     * This class corresponds to the database table yp_merchant_shop_commit
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
     * This class corresponds to the database table yp_merchant_shop_commit
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