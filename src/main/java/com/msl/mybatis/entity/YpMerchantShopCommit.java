package com.msl.mybatis.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class YpMerchantShopCommit implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_merchant_shop_commit.commit_id
     *
     * @mbggenerated
     */
    private Long commitId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_merchant_shop_commit.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_merchant_shop_commit.ref_merchant_id
     *
     * @mbggenerated
     */
    private Long refMerchantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_merchant_shop_commit.ref_user_id
     *
     * @mbggenerated
     */
    private Long refUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_merchant_shop_commit.isshow
     *
     * @mbggenerated
     */
    private Byte isshow;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_merchant_shop_commit.ref_shop_id
     *
     * @mbggenerated
     */
    private Long refShopId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_merchant_shop_commit.nickname
     *
     * @mbggenerated
     */
    private String nickname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_merchant_shop_commit.score
     *
     * @mbggenerated
     */
    private BigDecimal score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_merchant_shop_commit.stream_no
     *
     * @mbggenerated
     */
    private Long streamNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_merchant_shop_commit.commit_source
     *
     * @mbggenerated
     */
    private Short commitSource;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_merchant_shop_commit.headimg
     *
     * @mbggenerated
     */
    private String headimg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_merchant_shop_commit.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_merchant_shop_commit.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_merchant_shop_commit
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_merchant_shop_commit.commit_id
     *
     * @return the value of yp_merchant_shop_commit.commit_id
     *
     * @mbggenerated
     */
    public Long getCommitId() {
        return commitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_merchant_shop_commit.commit_id
     *
     * @param commitId the value for yp_merchant_shop_commit.commit_id
     *
     * @mbggenerated
     */
    public void setCommitId(Long commitId) {
        this.commitId = commitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_merchant_shop_commit.content
     *
     * @return the value of yp_merchant_shop_commit.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_merchant_shop_commit.content
     *
     * @param content the value for yp_merchant_shop_commit.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_merchant_shop_commit.ref_merchant_id
     *
     * @return the value of yp_merchant_shop_commit.ref_merchant_id
     *
     * @mbggenerated
     */
    public Long getRefMerchantId() {
        return refMerchantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_merchant_shop_commit.ref_merchant_id
     *
     * @param refMerchantId the value for yp_merchant_shop_commit.ref_merchant_id
     *
     * @mbggenerated
     */
    public void setRefMerchantId(Long refMerchantId) {
        this.refMerchantId = refMerchantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_merchant_shop_commit.ref_user_id
     *
     * @return the value of yp_merchant_shop_commit.ref_user_id
     *
     * @mbggenerated
     */
    public Long getRefUserId() {
        return refUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_merchant_shop_commit.ref_user_id
     *
     * @param refUserId the value for yp_merchant_shop_commit.ref_user_id
     *
     * @mbggenerated
     */
    public void setRefUserId(Long refUserId) {
        this.refUserId = refUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_merchant_shop_commit.isshow
     *
     * @return the value of yp_merchant_shop_commit.isshow
     *
     * @mbggenerated
     */
    public Byte getIsshow() {
        return isshow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_merchant_shop_commit.isshow
     *
     * @param isshow the value for yp_merchant_shop_commit.isshow
     *
     * @mbggenerated
     */
    public void setIsshow(Byte isshow) {
        this.isshow = isshow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_merchant_shop_commit.ref_shop_id
     *
     * @return the value of yp_merchant_shop_commit.ref_shop_id
     *
     * @mbggenerated
     */
    public Long getRefShopId() {
        return refShopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_merchant_shop_commit.ref_shop_id
     *
     * @param refShopId the value for yp_merchant_shop_commit.ref_shop_id
     *
     * @mbggenerated
     */
    public void setRefShopId(Long refShopId) {
        this.refShopId = refShopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_merchant_shop_commit.nickname
     *
     * @return the value of yp_merchant_shop_commit.nickname
     *
     * @mbggenerated
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_merchant_shop_commit.nickname
     *
     * @param nickname the value for yp_merchant_shop_commit.nickname
     *
     * @mbggenerated
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_merchant_shop_commit.score
     *
     * @return the value of yp_merchant_shop_commit.score
     *
     * @mbggenerated
     */
    public BigDecimal getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_merchant_shop_commit.score
     *
     * @param score the value for yp_merchant_shop_commit.score
     *
     * @mbggenerated
     */
    public void setScore(BigDecimal score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_merchant_shop_commit.stream_no
     *
     * @return the value of yp_merchant_shop_commit.stream_no
     *
     * @mbggenerated
     */
    public Long getStreamNo() {
        return streamNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_merchant_shop_commit.stream_no
     *
     * @param streamNo the value for yp_merchant_shop_commit.stream_no
     *
     * @mbggenerated
     */
    public void setStreamNo(Long streamNo) {
        this.streamNo = streamNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_merchant_shop_commit.commit_source
     *
     * @return the value of yp_merchant_shop_commit.commit_source
     *
     * @mbggenerated
     */
    public Short getCommitSource() {
        return commitSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_merchant_shop_commit.commit_source
     *
     * @param commitSource the value for yp_merchant_shop_commit.commit_source
     *
     * @mbggenerated
     */
    public void setCommitSource(Short commitSource) {
        this.commitSource = commitSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_merchant_shop_commit.headimg
     *
     * @return the value of yp_merchant_shop_commit.headimg
     *
     * @mbggenerated
     */
    public String getHeadimg() {
        return headimg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_merchant_shop_commit.headimg
     *
     * @param headimg the value for yp_merchant_shop_commit.headimg
     *
     * @mbggenerated
     */
    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_merchant_shop_commit.create_time
     *
     * @return the value of yp_merchant_shop_commit.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_merchant_shop_commit.create_time
     *
     * @param createTime the value for yp_merchant_shop_commit.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_merchant_shop_commit.update_time
     *
     * @return the value of yp_merchant_shop_commit.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_merchant_shop_commit.update_time
     *
     * @param updateTime the value for yp_merchant_shop_commit.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}