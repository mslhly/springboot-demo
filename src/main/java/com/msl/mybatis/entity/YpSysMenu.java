package com.msl.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class YpSysMenu implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_menu.menu_id
     *
     * @mbggenerated
     */
    private Integer menuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_menu.parent_menu_id
     *
     * @mbggenerated
     */
    private Integer parentMenuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_menu.menu_name
     *
     * @mbggenerated
     */
    private String menuName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_menu.menu_alias
     *
     * @mbggenerated
     */
    private String menuAlias;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_menu.menu_seq
     *
     * @mbggenerated
     */
    private Integer menuSeq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_menu.menu_url
     *
     * @mbggenerated
     */
    private String menuUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_menu.menu_type
     *
     * @mbggenerated
     */
    private String menuType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_menu.icon
     *
     * @mbggenerated
     */
    private String icon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_menu.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_menu.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_menu.created_time
     *
     * @mbggenerated
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_menu.created_by
     *
     * @mbggenerated
     */
    private String createdBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_menu.modified_time
     *
     * @mbggenerated
     */
    private Date modifiedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_menu.modified_by
     *
     * @mbggenerated
     */
    private String modifiedBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_sys_menu
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_menu.menu_id
     *
     * @return the value of yp_sys_menu.menu_id
     *
     * @mbggenerated
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_menu.menu_id
     *
     * @param menuId the value for yp_sys_menu.menu_id
     *
     * @mbggenerated
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_menu.parent_menu_id
     *
     * @return the value of yp_sys_menu.parent_menu_id
     *
     * @mbggenerated
     */
    public Integer getParentMenuId() {
        return parentMenuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_menu.parent_menu_id
     *
     * @param parentMenuId the value for yp_sys_menu.parent_menu_id
     *
     * @mbggenerated
     */
    public void setParentMenuId(Integer parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_menu.menu_name
     *
     * @return the value of yp_sys_menu.menu_name
     *
     * @mbggenerated
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_menu.menu_name
     *
     * @param menuName the value for yp_sys_menu.menu_name
     *
     * @mbggenerated
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_menu.menu_alias
     *
     * @return the value of yp_sys_menu.menu_alias
     *
     * @mbggenerated
     */
    public String getMenuAlias() {
        return menuAlias;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_menu.menu_alias
     *
     * @param menuAlias the value for yp_sys_menu.menu_alias
     *
     * @mbggenerated
     */
    public void setMenuAlias(String menuAlias) {
        this.menuAlias = menuAlias;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_menu.menu_seq
     *
     * @return the value of yp_sys_menu.menu_seq
     *
     * @mbggenerated
     */
    public Integer getMenuSeq() {
        return menuSeq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_menu.menu_seq
     *
     * @param menuSeq the value for yp_sys_menu.menu_seq
     *
     * @mbggenerated
     */
    public void setMenuSeq(Integer menuSeq) {
        this.menuSeq = menuSeq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_menu.menu_url
     *
     * @return the value of yp_sys_menu.menu_url
     *
     * @mbggenerated
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_menu.menu_url
     *
     * @param menuUrl the value for yp_sys_menu.menu_url
     *
     * @mbggenerated
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_menu.menu_type
     *
     * @return the value of yp_sys_menu.menu_type
     *
     * @mbggenerated
     */
    public String getMenuType() {
        return menuType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_menu.menu_type
     *
     * @param menuType the value for yp_sys_menu.menu_type
     *
     * @mbggenerated
     */
    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_menu.icon
     *
     * @return the value of yp_sys_menu.icon
     *
     * @mbggenerated
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_menu.icon
     *
     * @param icon the value for yp_sys_menu.icon
     *
     * @mbggenerated
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_menu.status
     *
     * @return the value of yp_sys_menu.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_menu.status
     *
     * @param status the value for yp_sys_menu.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_menu.remark
     *
     * @return the value of yp_sys_menu.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_menu.remark
     *
     * @param remark the value for yp_sys_menu.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_menu.created_time
     *
     * @return the value of yp_sys_menu.created_time
     *
     * @mbggenerated
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_menu.created_time
     *
     * @param createdTime the value for yp_sys_menu.created_time
     *
     * @mbggenerated
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_menu.created_by
     *
     * @return the value of yp_sys_menu.created_by
     *
     * @mbggenerated
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_menu.created_by
     *
     * @param createdBy the value for yp_sys_menu.created_by
     *
     * @mbggenerated
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_menu.modified_time
     *
     * @return the value of yp_sys_menu.modified_time
     *
     * @mbggenerated
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_menu.modified_time
     *
     * @param modifiedTime the value for yp_sys_menu.modified_time
     *
     * @mbggenerated
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_menu.modified_by
     *
     * @return the value of yp_sys_menu.modified_by
     *
     * @mbggenerated
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_menu.modified_by
     *
     * @param modifiedBy the value for yp_sys_menu.modified_by
     *
     * @mbggenerated
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}