package com.msl.mybatis.entity;

import java.io.Serializable;

public class YpSysPaymentInter implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_payment_inter.pay_id
     *
     * @mbggenerated
     */
    private Long payId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_payment_inter.pay_name
     *
     * @mbggenerated
     */
    private String payName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_payment_inter.lang
     *
     * @mbggenerated
     */
    private String lang;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_sys_payment_inter.channel_num
     *
     * @mbggenerated
     */
    private Integer channelNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_sys_payment_inter
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_payment_inter.pay_id
     *
     * @return the value of yp_sys_payment_inter.pay_id
     *
     * @mbggenerated
     */
    public Long getPayId() {
        return payId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_payment_inter.pay_id
     *
     * @param payId the value for yp_sys_payment_inter.pay_id
     *
     * @mbggenerated
     */
    public void setPayId(Long payId) {
        this.payId = payId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_payment_inter.pay_name
     *
     * @return the value of yp_sys_payment_inter.pay_name
     *
     * @mbggenerated
     */
    public String getPayName() {
        return payName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_payment_inter.pay_name
     *
     * @param payName the value for yp_sys_payment_inter.pay_name
     *
     * @mbggenerated
     */
    public void setPayName(String payName) {
        this.payName = payName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_payment_inter.lang
     *
     * @return the value of yp_sys_payment_inter.lang
     *
     * @mbggenerated
     */
    public String getLang() {
        return lang;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_payment_inter.lang
     *
     * @param lang the value for yp_sys_payment_inter.lang
     *
     * @mbggenerated
     */
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_sys_payment_inter.channel_num
     *
     * @return the value of yp_sys_payment_inter.channel_num
     *
     * @mbggenerated
     */
    public Integer getChannelNum() {
        return channelNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_sys_payment_inter.channel_num
     *
     * @param channelNum the value for yp_sys_payment_inter.channel_num
     *
     * @mbggenerated
     */
    public void setChannelNum(Integer channelNum) {
        this.channelNum = channelNum;
    }
}