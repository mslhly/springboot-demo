package com.msl.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class YpUserCheckIn implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_check_in.check_in_id
     *
     * @mbggenerated
     */
    private String checkInId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_check_in.ref_user_id
     *
     * @mbggenerated
     */
    private Long refUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_check_in.check_in_count
     *
     * @mbggenerated
     */
    private Integer checkInCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_check_in.continuous_check_in
     *
     * @mbggenerated
     */
    private Integer continuousCheckIn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_check_in.check_in_time
     *
     * @mbggenerated
     */
    private String checkInTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_check_in.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_check_in.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_check_in.check_in_year
     *
     * @mbggenerated
     */
    private Integer checkInYear;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_check_in.check_in_month
     *
     * @mbggenerated
     */
    private Integer checkInMonth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_check_in.check_in_day
     *
     * @mbggenerated
     */
    private Integer checkInDay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_user_check_in
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_check_in.check_in_id
     *
     * @return the value of yp_user_check_in.check_in_id
     *
     * @mbggenerated
     */
    public String getCheckInId() {
        return checkInId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_check_in.check_in_id
     *
     * @param checkInId the value for yp_user_check_in.check_in_id
     *
     * @mbggenerated
     */
    public void setCheckInId(String checkInId) {
        this.checkInId = checkInId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_check_in.ref_user_id
     *
     * @return the value of yp_user_check_in.ref_user_id
     *
     * @mbggenerated
     */
    public Long getRefUserId() {
        return refUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_check_in.ref_user_id
     *
     * @param refUserId the value for yp_user_check_in.ref_user_id
     *
     * @mbggenerated
     */
    public void setRefUserId(Long refUserId) {
        this.refUserId = refUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_check_in.check_in_count
     *
     * @return the value of yp_user_check_in.check_in_count
     *
     * @mbggenerated
     */
    public Integer getCheckInCount() {
        return checkInCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_check_in.check_in_count
     *
     * @param checkInCount the value for yp_user_check_in.check_in_count
     *
     * @mbggenerated
     */
    public void setCheckInCount(Integer checkInCount) {
        this.checkInCount = checkInCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_check_in.continuous_check_in
     *
     * @return the value of yp_user_check_in.continuous_check_in
     *
     * @mbggenerated
     */
    public Integer getContinuousCheckIn() {
        return continuousCheckIn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_check_in.continuous_check_in
     *
     * @param continuousCheckIn the value for yp_user_check_in.continuous_check_in
     *
     * @mbggenerated
     */
    public void setContinuousCheckIn(Integer continuousCheckIn) {
        this.continuousCheckIn = continuousCheckIn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_check_in.check_in_time
     *
     * @return the value of yp_user_check_in.check_in_time
     *
     * @mbggenerated
     */
    public String getCheckInTime() {
        return checkInTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_check_in.check_in_time
     *
     * @param checkInTime the value for yp_user_check_in.check_in_time
     *
     * @mbggenerated
     */
    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_check_in.create_time
     *
     * @return the value of yp_user_check_in.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_check_in.create_time
     *
     * @param createTime the value for yp_user_check_in.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_check_in.update_time
     *
     * @return the value of yp_user_check_in.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_check_in.update_time
     *
     * @param updateTime the value for yp_user_check_in.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_check_in.check_in_year
     *
     * @return the value of yp_user_check_in.check_in_year
     *
     * @mbggenerated
     */
    public Integer getCheckInYear() {
        return checkInYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_check_in.check_in_year
     *
     * @param checkInYear the value for yp_user_check_in.check_in_year
     *
     * @mbggenerated
     */
    public void setCheckInYear(Integer checkInYear) {
        this.checkInYear = checkInYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_check_in.check_in_month
     *
     * @return the value of yp_user_check_in.check_in_month
     *
     * @mbggenerated
     */
    public Integer getCheckInMonth() {
        return checkInMonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_check_in.check_in_month
     *
     * @param checkInMonth the value for yp_user_check_in.check_in_month
     *
     * @mbggenerated
     */
    public void setCheckInMonth(Integer checkInMonth) {
        this.checkInMonth = checkInMonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_check_in.check_in_day
     *
     * @return the value of yp_user_check_in.check_in_day
     *
     * @mbggenerated
     */
    public Integer getCheckInDay() {
        return checkInDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_check_in.check_in_day
     *
     * @param checkInDay the value for yp_user_check_in.check_in_day
     *
     * @mbggenerated
     */
    public void setCheckInDay(Integer checkInDay) {
        this.checkInDay = checkInDay;
    }
}