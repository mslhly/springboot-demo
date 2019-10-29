package com.msl.mybatis.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class YpUserCloudDetail implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_cloud_detail.cloud_id
     *
     * @mbggenerated
     */
    private Long cloudId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_cloud_detail.ref_user_id
     *
     * @mbggenerated
     */
    private Long refUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_cloud_detail.cloud_before
     *
     * @mbggenerated
     */
    private Integer cloudBefore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_cloud_detail.cloud
     *
     * @mbggenerated
     */
    private Integer cloud;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_cloud_detail.cloud_after
     *
     * @mbggenerated
     */
    private Integer cloudAfter;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_cloud_detail.change_type
     *
     * @mbggenerated
     */
    private Short changeType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_cloud_detail.icon
     *
     * @mbggenerated
     */
    private String icon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_cloud_detail.ref_order_no
     *
     * @mbggenerated
     */
    private String refOrderNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_cloud_detail.mark
     *
     * @mbggenerated
     */
    private String mark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_cloud_detail.rate
     *
     * @mbggenerated
     */
    private BigDecimal rate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_cloud_detail.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_cloud_detail.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_user_cloud_detail
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_cloud_detail.cloud_id
     *
     * @return the value of yp_user_cloud_detail.cloud_id
     *
     * @mbggenerated
     */
    public Long getCloudId() {
        return cloudId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_cloud_detail.cloud_id
     *
     * @param cloudId the value for yp_user_cloud_detail.cloud_id
     *
     * @mbggenerated
     */
    public void setCloudId(Long cloudId) {
        this.cloudId = cloudId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_cloud_detail.ref_user_id
     *
     * @return the value of yp_user_cloud_detail.ref_user_id
     *
     * @mbggenerated
     */
    public Long getRefUserId() {
        return refUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_cloud_detail.ref_user_id
     *
     * @param refUserId the value for yp_user_cloud_detail.ref_user_id
     *
     * @mbggenerated
     */
    public void setRefUserId(Long refUserId) {
        this.refUserId = refUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_cloud_detail.cloud_before
     *
     * @return the value of yp_user_cloud_detail.cloud_before
     *
     * @mbggenerated
     */
    public Integer getCloudBefore() {
        return cloudBefore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_cloud_detail.cloud_before
     *
     * @param cloudBefore the value for yp_user_cloud_detail.cloud_before
     *
     * @mbggenerated
     */
    public void setCloudBefore(Integer cloudBefore) {
        this.cloudBefore = cloudBefore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_cloud_detail.cloud
     *
     * @return the value of yp_user_cloud_detail.cloud
     *
     * @mbggenerated
     */
    public Integer getCloud() {
        return cloud;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_cloud_detail.cloud
     *
     * @param cloud the value for yp_user_cloud_detail.cloud
     *
     * @mbggenerated
     */
    public void setCloud(Integer cloud) {
        this.cloud = cloud;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_cloud_detail.cloud_after
     *
     * @return the value of yp_user_cloud_detail.cloud_after
     *
     * @mbggenerated
     */
    public Integer getCloudAfter() {
        return cloudAfter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_cloud_detail.cloud_after
     *
     * @param cloudAfter the value for yp_user_cloud_detail.cloud_after
     *
     * @mbggenerated
     */
    public void setCloudAfter(Integer cloudAfter) {
        this.cloudAfter = cloudAfter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_cloud_detail.change_type
     *
     * @return the value of yp_user_cloud_detail.change_type
     *
     * @mbggenerated
     */
    public Short getChangeType() {
        return changeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_cloud_detail.change_type
     *
     * @param changeType the value for yp_user_cloud_detail.change_type
     *
     * @mbggenerated
     */
    public void setChangeType(Short changeType) {
        this.changeType = changeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_cloud_detail.icon
     *
     * @return the value of yp_user_cloud_detail.icon
     *
     * @mbggenerated
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_cloud_detail.icon
     *
     * @param icon the value for yp_user_cloud_detail.icon
     *
     * @mbggenerated
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_cloud_detail.ref_order_no
     *
     * @return the value of yp_user_cloud_detail.ref_order_no
     *
     * @mbggenerated
     */
    public String getRefOrderNo() {
        return refOrderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_cloud_detail.ref_order_no
     *
     * @param refOrderNo the value for yp_user_cloud_detail.ref_order_no
     *
     * @mbggenerated
     */
    public void setRefOrderNo(String refOrderNo) {
        this.refOrderNo = refOrderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_cloud_detail.mark
     *
     * @return the value of yp_user_cloud_detail.mark
     *
     * @mbggenerated
     */
    public String getMark() {
        return mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_cloud_detail.mark
     *
     * @param mark the value for yp_user_cloud_detail.mark
     *
     * @mbggenerated
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_cloud_detail.rate
     *
     * @return the value of yp_user_cloud_detail.rate
     *
     * @mbggenerated
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_cloud_detail.rate
     *
     * @param rate the value for yp_user_cloud_detail.rate
     *
     * @mbggenerated
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_cloud_detail.create_time
     *
     * @return the value of yp_user_cloud_detail.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_cloud_detail.create_time
     *
     * @param createTime the value for yp_user_cloud_detail.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_cloud_detail.update_time
     *
     * @return the value of yp_user_cloud_detail.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_cloud_detail.update_time
     *
     * @param updateTime the value for yp_user_cloud_detail.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}