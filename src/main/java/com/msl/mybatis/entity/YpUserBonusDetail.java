package com.msl.mybatis.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class YpUserBonusDetail implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_bonus_detail.bonus_detail_id
     *
     * @mbggenerated
     */
    private Long bonusDetailId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_bonus_detail.ref_user_id
     *
     * @mbggenerated
     */
    private Long refUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_bonus_detail.bonus_before
     *
     * @mbggenerated
     */
    private Long bonusBefore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_bonus_detail.bonus
     *
     * @mbggenerated
     */
    private Long bonus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_bonus_detail.bonus_after
     *
     * @mbggenerated
     */
    private Long bonusAfter;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_bonus_detail.change_type
     *
     * @mbggenerated
     */
    private Short changeType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_bonus_detail.icon
     *
     * @mbggenerated
     */
    private String icon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_bonus_detail.ref_order_no
     *
     * @mbggenerated
     */
    private String refOrderNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_bonus_detail.mark
     *
     * @mbggenerated
     */
    private String mark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_bonus_detail.rate
     *
     * @mbggenerated
     */
    private BigDecimal rate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_bonus_detail.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_bonus_detail.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_user_bonus_detail
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_bonus_detail.bonus_detail_id
     *
     * @return the value of yp_user_bonus_detail.bonus_detail_id
     *
     * @mbggenerated
     */
    public Long getBonusDetailId() {
        return bonusDetailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_bonus_detail.bonus_detail_id
     *
     * @param bonusDetailId the value for yp_user_bonus_detail.bonus_detail_id
     *
     * @mbggenerated
     */
    public void setBonusDetailId(Long bonusDetailId) {
        this.bonusDetailId = bonusDetailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_bonus_detail.ref_user_id
     *
     * @return the value of yp_user_bonus_detail.ref_user_id
     *
     * @mbggenerated
     */
    public Long getRefUserId() {
        return refUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_bonus_detail.ref_user_id
     *
     * @param refUserId the value for yp_user_bonus_detail.ref_user_id
     *
     * @mbggenerated
     */
    public void setRefUserId(Long refUserId) {
        this.refUserId = refUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_bonus_detail.bonus_before
     *
     * @return the value of yp_user_bonus_detail.bonus_before
     *
     * @mbggenerated
     */
    public Long getBonusBefore() {
        return bonusBefore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_bonus_detail.bonus_before
     *
     * @param bonusBefore the value for yp_user_bonus_detail.bonus_before
     *
     * @mbggenerated
     */
    public void setBonusBefore(Long bonusBefore) {
        this.bonusBefore = bonusBefore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_bonus_detail.bonus
     *
     * @return the value of yp_user_bonus_detail.bonus
     *
     * @mbggenerated
     */
    public Long getBonus() {
        return bonus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_bonus_detail.bonus
     *
     * @param bonus the value for yp_user_bonus_detail.bonus
     *
     * @mbggenerated
     */
    public void setBonus(Long bonus) {
        this.bonus = bonus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_bonus_detail.bonus_after
     *
     * @return the value of yp_user_bonus_detail.bonus_after
     *
     * @mbggenerated
     */
    public Long getBonusAfter() {
        return bonusAfter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_bonus_detail.bonus_after
     *
     * @param bonusAfter the value for yp_user_bonus_detail.bonus_after
     *
     * @mbggenerated
     */
    public void setBonusAfter(Long bonusAfter) {
        this.bonusAfter = bonusAfter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_bonus_detail.change_type
     *
     * @return the value of yp_user_bonus_detail.change_type
     *
     * @mbggenerated
     */
    public Short getChangeType() {
        return changeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_bonus_detail.change_type
     *
     * @param changeType the value for yp_user_bonus_detail.change_type
     *
     * @mbggenerated
     */
    public void setChangeType(Short changeType) {
        this.changeType = changeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_bonus_detail.icon
     *
     * @return the value of yp_user_bonus_detail.icon
     *
     * @mbggenerated
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_bonus_detail.icon
     *
     * @param icon the value for yp_user_bonus_detail.icon
     *
     * @mbggenerated
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_bonus_detail.ref_order_no
     *
     * @return the value of yp_user_bonus_detail.ref_order_no
     *
     * @mbggenerated
     */
    public String getRefOrderNo() {
        return refOrderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_bonus_detail.ref_order_no
     *
     * @param refOrderNo the value for yp_user_bonus_detail.ref_order_no
     *
     * @mbggenerated
     */
    public void setRefOrderNo(String refOrderNo) {
        this.refOrderNo = refOrderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_bonus_detail.mark
     *
     * @return the value of yp_user_bonus_detail.mark
     *
     * @mbggenerated
     */
    public String getMark() {
        return mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_bonus_detail.mark
     *
     * @param mark the value for yp_user_bonus_detail.mark
     *
     * @mbggenerated
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_bonus_detail.rate
     *
     * @return the value of yp_user_bonus_detail.rate
     *
     * @mbggenerated
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_bonus_detail.rate
     *
     * @param rate the value for yp_user_bonus_detail.rate
     *
     * @mbggenerated
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_bonus_detail.create_time
     *
     * @return the value of yp_user_bonus_detail.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_bonus_detail.create_time
     *
     * @param createTime the value for yp_user_bonus_detail.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_bonus_detail.update_time
     *
     * @return the value of yp_user_bonus_detail.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_bonus_detail.update_time
     *
     * @param updateTime the value for yp_user_bonus_detail.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}