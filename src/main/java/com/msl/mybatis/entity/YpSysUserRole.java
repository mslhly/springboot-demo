package com.msl.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class YpSysUserRole implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_user_role.user_role_id
     *
     * @mbggenerated
     */
    private Integer userRoleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_user_role.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_user_role.role_id
     *
     * @mbggenerated
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_user_role.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_user_role.created_time
     *
     * @mbggenerated
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_user_role.created_by
     *
     * @mbggenerated
     */
    private String createdBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_user_role.modified_time
     *
     * @mbggenerated
     */
    private Date modifiedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_user_role.modified_by
     *
     * @mbggenerated
     */
    private String modifiedBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_sys_user_role
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_user_role.user_role_id
     *
     * @return the value of yp_sys_user_role.user_role_id
     *
     * @mbggenerated
     */
    public Integer getUserRoleId() {
        return userRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_user_role.user_role_id
     *
     * @param userRoleId the value for yp_sys_user_role.user_role_id
     *
     * @mbggenerated
     */
    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_user_role.user_id
     *
     * @return the value of yp_sys_user_role.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_user_role.user_id
     *
     * @param userId the value for yp_sys_user_role.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_user_role.role_id
     *
     * @return the value of yp_sys_user_role.role_id
     *
     * @mbggenerated
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_user_role.role_id
     *
     * @param roleId the value for yp_sys_user_role.role_id
     *
     * @mbggenerated
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_user_role.status
     *
     * @return the value of yp_sys_user_role.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_user_role.status
     *
     * @param status the value for yp_sys_user_role.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_user_role.created_time
     *
     * @return the value of yp_sys_user_role.created_time
     *
     * @mbggenerated
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_user_role.created_time
     *
     * @param createdTime the value for yp_sys_user_role.created_time
     *
     * @mbggenerated
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_user_role.created_by
     *
     * @return the value of yp_sys_user_role.created_by
     *
     * @mbggenerated
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_user_role.created_by
     *
     * @param createdBy the value for yp_sys_user_role.created_by
     *
     * @mbggenerated
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_user_role.modified_time
     *
     * @return the value of yp_sys_user_role.modified_time
     *
     * @mbggenerated
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_user_role.modified_time
     *
     * @param modifiedTime the value for yp_sys_user_role.modified_time
     *
     * @mbggenerated
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_user_role.modified_by
     *
     * @return the value of yp_sys_user_role.modified_by
     *
     * @mbggenerated
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_user_role.modified_by
     *
     * @param modifiedBy the value for yp_sys_user_role.modified_by
     *
     * @mbggenerated
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}