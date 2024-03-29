package com.msl.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class YpUserIdentity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_identity.ref_user_id
     *
     * @mbggenerated
     */
    private Long refUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_identity.login_name
     *
     * @mbggenerated
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_identity.province
     *
     * @mbggenerated
     */
    private String province;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_identity.city
     *
     * @mbggenerated
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_identity.region
     *
     * @mbggenerated
     */
    private String region;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_identity.real_name
     *
     * @mbggenerated
     */
    private String realName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_identity.identity
     *
     * @mbggenerated
     */
    private String identity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_identity.idcard_front
     *
     * @mbggenerated
     */
    private String idcardFront;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_identity.idcard_back
     *
     * @mbggenerated
     */
    private String idcardBack;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_identity.cert_type
     *
     * @mbggenerated
     */
    private Short certType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_identity.status
     *
     * @mbggenerated
     */
    private Short status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_identity.mark
     *
     * @mbggenerated
     */
    private String mark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_identity.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_identity.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_user_identity
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_identity.ref_user_id
     *
     * @return the value of yp_user_identity.ref_user_id
     *
     * @mbggenerated
     */
    public Long getRefUserId() {
        return refUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_identity.ref_user_id
     *
     * @param refUserId the value for yp_user_identity.ref_user_id
     *
     * @mbggenerated
     */
    public void setRefUserId(Long refUserId) {
        this.refUserId = refUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_identity.login_name
     *
     * @return the value of yp_user_identity.login_name
     *
     * @mbggenerated
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_identity.login_name
     *
     * @param loginName the value for yp_user_identity.login_name
     *
     * @mbggenerated
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_identity.province
     *
     * @return the value of yp_user_identity.province
     *
     * @mbggenerated
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_identity.province
     *
     * @param province the value for yp_user_identity.province
     *
     * @mbggenerated
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_identity.city
     *
     * @return the value of yp_user_identity.city
     *
     * @mbggenerated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_identity.city
     *
     * @param city the value for yp_user_identity.city
     *
     * @mbggenerated
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_identity.region
     *
     * @return the value of yp_user_identity.region
     *
     * @mbggenerated
     */
    public String getRegion() {
        return region;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_identity.region
     *
     * @param region the value for yp_user_identity.region
     *
     * @mbggenerated
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_identity.real_name
     *
     * @return the value of yp_user_identity.real_name
     *
     * @mbggenerated
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_identity.real_name
     *
     * @param realName the value for yp_user_identity.real_name
     *
     * @mbggenerated
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_identity.identity
     *
     * @return the value of yp_user_identity.identity
     *
     * @mbggenerated
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_identity.identity
     *
     * @param identity the value for yp_user_identity.identity
     *
     * @mbggenerated
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_identity.idcard_front
     *
     * @return the value of yp_user_identity.idcard_front
     *
     * @mbggenerated
     */
    public String getIdcardFront() {
        return idcardFront;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_identity.idcard_front
     *
     * @param idcardFront the value for yp_user_identity.idcard_front
     *
     * @mbggenerated
     */
    public void setIdcardFront(String idcardFront) {
        this.idcardFront = idcardFront;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_identity.idcard_back
     *
     * @return the value of yp_user_identity.idcard_back
     *
     * @mbggenerated
     */
    public String getIdcardBack() {
        return idcardBack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_identity.idcard_back
     *
     * @param idcardBack the value for yp_user_identity.idcard_back
     *
     * @mbggenerated
     */
    public void setIdcardBack(String idcardBack) {
        this.idcardBack = idcardBack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_identity.cert_type
     *
     * @return the value of yp_user_identity.cert_type
     *
     * @mbggenerated
     */
    public Short getCertType() {
        return certType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_identity.cert_type
     *
     * @param certType the value for yp_user_identity.cert_type
     *
     * @mbggenerated
     */
    public void setCertType(Short certType) {
        this.certType = certType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_identity.status
     *
     * @return the value of yp_user_identity.status
     *
     * @mbggenerated
     */
    public Short getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_identity.status
     *
     * @param status the value for yp_user_identity.status
     *
     * @mbggenerated
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_identity.mark
     *
     * @return the value of yp_user_identity.mark
     *
     * @mbggenerated
     */
    public String getMark() {
        return mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_identity.mark
     *
     * @param mark the value for yp_user_identity.mark
     *
     * @mbggenerated
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_identity.create_time
     *
     * @return the value of yp_user_identity.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_identity.create_time
     *
     * @param createTime the value for yp_user_identity.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_identity.update_time
     *
     * @return the value of yp_user_identity.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_identity.update_time
     *
     * @param updateTime the value for yp_user_identity.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}