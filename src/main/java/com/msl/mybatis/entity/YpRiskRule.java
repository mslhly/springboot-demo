package com.msl.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class YpRiskRule implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_risk_rule.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_risk_rule.rule_name
     *
     * @mbggenerated
     */
    private String ruleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_risk_rule.risk_codes
     *
     * @mbggenerated
     */
    private String riskCodes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_risk_rule.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_risk_rule.creator
     *
     * @mbggenerated
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_risk_rule.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_risk_rule.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_risk_rule
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_risk_rule.id
     *
     * @return the value of yp_risk_rule.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_risk_rule.id
     *
     * @param id the value for yp_risk_rule.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_risk_rule.rule_name
     *
     * @return the value of yp_risk_rule.rule_name
     *
     * @mbggenerated
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_risk_rule.rule_name
     *
     * @param ruleName the value for yp_risk_rule.rule_name
     *
     * @mbggenerated
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_risk_rule.risk_codes
     *
     * @return the value of yp_risk_rule.risk_codes
     *
     * @mbggenerated
     */
    public String getRiskCodes() {
        return riskCodes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_risk_rule.risk_codes
     *
     * @param riskCodes the value for yp_risk_rule.risk_codes
     *
     * @mbggenerated
     */
    public void setRiskCodes(String riskCodes) {
        this.riskCodes = riskCodes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_risk_rule.status
     *
     * @return the value of yp_risk_rule.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_risk_rule.status
     *
     * @param status the value for yp_risk_rule.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_risk_rule.creator
     *
     * @return the value of yp_risk_rule.creator
     *
     * @mbggenerated
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_risk_rule.creator
     *
     * @param creator the value for yp_risk_rule.creator
     *
     * @mbggenerated
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_risk_rule.create_time
     *
     * @return the value of yp_risk_rule.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_risk_rule.create_time
     *
     * @param createTime the value for yp_risk_rule.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_risk_rule.update_time
     *
     * @return the value of yp_risk_rule.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_risk_rule.update_time
     *
     * @param updateTime the value for yp_risk_rule.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}