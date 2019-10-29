package com.msl.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class YpSysOperationLog implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_operation_log.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_operation_log.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_operation_log.login_name
     *
     * @mbggenerated
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_operation_log.ip_address
     *
     * @mbggenerated
     */
    private String ipAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_operation_log.operation_content
     *
     * @mbggenerated
     */
    private String operationContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_operation_log.operation_time
     *
     * @mbggenerated
     */
    private Date operationTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_sys_operation_log
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_operation_log.id
     *
     * @return the value of yp_sys_operation_log.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_operation_log.id
     *
     * @param id the value for yp_sys_operation_log.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_operation_log.user_id
     *
     * @return the value of yp_sys_operation_log.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_operation_log.user_id
     *
     * @param userId the value for yp_sys_operation_log.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_operation_log.login_name
     *
     * @return the value of yp_sys_operation_log.login_name
     *
     * @mbggenerated
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_operation_log.login_name
     *
     * @param loginName the value for yp_sys_operation_log.login_name
     *
     * @mbggenerated
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_operation_log.ip_address
     *
     * @return the value of yp_sys_operation_log.ip_address
     *
     * @mbggenerated
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_operation_log.ip_address
     *
     * @param ipAddress the value for yp_sys_operation_log.ip_address
     *
     * @mbggenerated
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_operation_log.operation_content
     *
     * @return the value of yp_sys_operation_log.operation_content
     *
     * @mbggenerated
     */
    public String getOperationContent() {
        return operationContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_operation_log.operation_content
     *
     * @param operationContent the value for yp_sys_operation_log.operation_content
     *
     * @mbggenerated
     */
    public void setOperationContent(String operationContent) {
        this.operationContent = operationContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_operation_log.operation_time
     *
     * @return the value of yp_sys_operation_log.operation_time
     *
     * @mbggenerated
     */
    public Date getOperationTime() {
        return operationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_operation_log.operation_time
     *
     * @param operationTime the value for yp_sys_operation_log.operation_time
     *
     * @mbggenerated
     */
    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }
}