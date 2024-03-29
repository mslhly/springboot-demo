package com.msl.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class YpUserAccount implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_account.ref_user_id
     *
     * @mbggenerated
     */
    private Long refUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_account.usable_balance
     *
     * @mbggenerated
     */
    private Long usableBalance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_account.frozen_balance
     *
     * @mbggenerated
     */
    private Long frozenBalance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_account.usable_cloud
     *
     * @mbggenerated
     */
    private Long usableCloud;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_account.frozen_cloud
     *
     * @mbggenerated
     */
    private Long frozenCloud;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_account.usable_task_score
     *
     * @mbggenerated
     */
    private Integer usableTaskScore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_account.frozen_task_score
     *
     * @mbggenerated
     */
    private Integer frozenTaskScore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_account.usable_bonus
     *
     * @mbggenerated
     */
    private Long usableBonus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_account.frozen_bonus
     *
     * @mbggenerated
     */
    private Long frozenBonus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_account.usable_blue_score
     *
     * @mbggenerated
     */
    private Long usableBlueScore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_account.frozen_blue_score
     *
     * @mbggenerated
     */
    private Long frozenBlueScore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_account.version
     *
     * @mbggenerated
     */
    private String version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_account.account_status
     *
     * @mbggenerated
     */
    private Short accountStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_account.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_user_account.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_user_account
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_account.ref_user_id
     *
     * @return the value of yp_user_account.ref_user_id
     *
     * @mbggenerated
     */
    public Long getRefUserId() {
        return refUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_account.ref_user_id
     *
     * @param refUserId the value for yp_user_account.ref_user_id
     *
     * @mbggenerated
     */
    public void setRefUserId(Long refUserId) {
        this.refUserId = refUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_account.usable_balance
     *
     * @return the value of yp_user_account.usable_balance
     *
     * @mbggenerated
     */
    public Long getUsableBalance() {
        return usableBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_account.usable_balance
     *
     * @param usableBalance the value for yp_user_account.usable_balance
     *
     * @mbggenerated
     */
    public void setUsableBalance(Long usableBalance) {
        this.usableBalance = usableBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_account.frozen_balance
     *
     * @return the value of yp_user_account.frozen_balance
     *
     * @mbggenerated
     */
    public Long getFrozenBalance() {
        return frozenBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_account.frozen_balance
     *
     * @param frozenBalance the value for yp_user_account.frozen_balance
     *
     * @mbggenerated
     */
    public void setFrozenBalance(Long frozenBalance) {
        this.frozenBalance = frozenBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_account.usable_cloud
     *
     * @return the value of yp_user_account.usable_cloud
     *
     * @mbggenerated
     */
    public Long getUsableCloud() {
        return usableCloud;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_account.usable_cloud
     *
     * @param usableCloud the value for yp_user_account.usable_cloud
     *
     * @mbggenerated
     */
    public void setUsableCloud(Long usableCloud) {
        this.usableCloud = usableCloud;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_account.frozen_cloud
     *
     * @return the value of yp_user_account.frozen_cloud
     *
     * @mbggenerated
     */
    public Long getFrozenCloud() {
        return frozenCloud;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_account.frozen_cloud
     *
     * @param frozenCloud the value for yp_user_account.frozen_cloud
     *
     * @mbggenerated
     */
    public void setFrozenCloud(Long frozenCloud) {
        this.frozenCloud = frozenCloud;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_account.usable_task_score
     *
     * @return the value of yp_user_account.usable_task_score
     *
     * @mbggenerated
     */
    public Integer getUsableTaskScore() {
        return usableTaskScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_account.usable_task_score
     *
     * @param usableTaskScore the value for yp_user_account.usable_task_score
     *
     * @mbggenerated
     */
    public void setUsableTaskScore(Integer usableTaskScore) {
        this.usableTaskScore = usableTaskScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_account.frozen_task_score
     *
     * @return the value of yp_user_account.frozen_task_score
     *
     * @mbggenerated
     */
    public Integer getFrozenTaskScore() {
        return frozenTaskScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_account.frozen_task_score
     *
     * @param frozenTaskScore the value for yp_user_account.frozen_task_score
     *
     * @mbggenerated
     */
    public void setFrozenTaskScore(Integer frozenTaskScore) {
        this.frozenTaskScore = frozenTaskScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_account.usable_bonus
     *
     * @return the value of yp_user_account.usable_bonus
     *
     * @mbggenerated
     */
    public Long getUsableBonus() {
        return usableBonus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_account.usable_bonus
     *
     * @param usableBonus the value for yp_user_account.usable_bonus
     *
     * @mbggenerated
     */
    public void setUsableBonus(Long usableBonus) {
        this.usableBonus = usableBonus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_account.frozen_bonus
     *
     * @return the value of yp_user_account.frozen_bonus
     *
     * @mbggenerated
     */
    public Long getFrozenBonus() {
        return frozenBonus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_account.frozen_bonus
     *
     * @param frozenBonus the value for yp_user_account.frozen_bonus
     *
     * @mbggenerated
     */
    public void setFrozenBonus(Long frozenBonus) {
        this.frozenBonus = frozenBonus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_account.usable_blue_score
     *
     * @return the value of yp_user_account.usable_blue_score
     *
     * @mbggenerated
     */
    public Long getUsableBlueScore() {
        return usableBlueScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_account.usable_blue_score
     *
     * @param usableBlueScore the value for yp_user_account.usable_blue_score
     *
     * @mbggenerated
     */
    public void setUsableBlueScore(Long usableBlueScore) {
        this.usableBlueScore = usableBlueScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_account.frozen_blue_score
     *
     * @return the value of yp_user_account.frozen_blue_score
     *
     * @mbggenerated
     */
    public Long getFrozenBlueScore() {
        return frozenBlueScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_account.frozen_blue_score
     *
     * @param frozenBlueScore the value for yp_user_account.frozen_blue_score
     *
     * @mbggenerated
     */
    public void setFrozenBlueScore(Long frozenBlueScore) {
        this.frozenBlueScore = frozenBlueScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_account.version
     *
     * @return the value of yp_user_account.version
     *
     * @mbggenerated
     */
    public String getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_account.version
     *
     * @param version the value for yp_user_account.version
     *
     * @mbggenerated
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_account.account_status
     *
     * @return the value of yp_user_account.account_status
     *
     * @mbggenerated
     */
    public Short getAccountStatus() {
        return accountStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_account.account_status
     *
     * @param accountStatus the value for yp_user_account.account_status
     *
     * @mbggenerated
     */
    public void setAccountStatus(Short accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_account.create_time
     *
     * @return the value of yp_user_account.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_account.create_time
     *
     * @param createTime the value for yp_user_account.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_user_account.update_time
     *
     * @return the value of yp_user_account.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_user_account.update_time
     *
     * @param updateTime the value for yp_user_account.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}