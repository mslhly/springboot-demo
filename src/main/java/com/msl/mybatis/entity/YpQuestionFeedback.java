package com.msl.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class YpQuestionFeedback implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_question_feedback.feedback_id
     *
     * @mbggenerated
     */
    private Integer feedbackId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_question_feedback.type
     *
     * @mbggenerated
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_question_feedback.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_question_feedback.photos
     *
     * @mbggenerated
     */
    private String photos;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_question_feedback.ref_user_id
     *
     * @mbggenerated
     */
    private Long refUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_question_feedback.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_question_feedback.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_question_feedback
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_question_feedback.feedback_id
     *
     * @return the value of yp_question_feedback.feedback_id
     *
     * @mbggenerated
     */
    public Integer getFeedbackId() {
        return feedbackId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_question_feedback.feedback_id
     *
     * @param feedbackId the value for yp_question_feedback.feedback_id
     *
     * @mbggenerated
     */
    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_question_feedback.type
     *
     * @return the value of yp_question_feedback.type
     *
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_question_feedback.type
     *
     * @param type the value for yp_question_feedback.type
     *
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_question_feedback.content
     *
     * @return the value of yp_question_feedback.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_question_feedback.content
     *
     * @param content the value for yp_question_feedback.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_question_feedback.photos
     *
     * @return the value of yp_question_feedback.photos
     *
     * @mbggenerated
     */
    public String getPhotos() {
        return photos;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_question_feedback.photos
     *
     * @param photos the value for yp_question_feedback.photos
     *
     * @mbggenerated
     */
    public void setPhotos(String photos) {
        this.photos = photos;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_question_feedback.ref_user_id
     *
     * @return the value of yp_question_feedback.ref_user_id
     *
     * @mbggenerated
     */
    public Long getRefUserId() {
        return refUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_question_feedback.ref_user_id
     *
     * @param refUserId the value for yp_question_feedback.ref_user_id
     *
     * @mbggenerated
     */
    public void setRefUserId(Long refUserId) {
        this.refUserId = refUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_question_feedback.create_time
     *
     * @return the value of yp_question_feedback.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_question_feedback.create_time
     *
     * @param createTime the value for yp_question_feedback.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_question_feedback.update_time
     *
     * @return the value of yp_question_feedback.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_question_feedback.update_time
     *
     * @param updateTime the value for yp_question_feedback.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}