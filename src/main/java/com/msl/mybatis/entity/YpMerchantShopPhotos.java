package com.msl.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class YpMerchantShopPhotos implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_merchant_shop_photos.shop_photos_id
     *
     * @mbggenerated
     */
    private Long shopPhotosId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_merchant_shop_photos.ref_merchant_id
     *
     * @mbggenerated
     */
    private Long refMerchantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_merchant_shop_photos.shop_id
     *
     * @mbggenerated
     */
    private Long shopId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_merchant_shop_photos.img
     *
     * @mbggenerated
     */
    private String img;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_merchant_shop_photos.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_merchant_shop_photos.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_merchant_shop_photos.img_type
     *
     * @mbggenerated
     */
    private Short imgType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yp_merchant_shop_photos.sort
     *
     * @mbggenerated
     */
    private Short sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yp_merchant_shop_photos
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_merchant_shop_photos.shop_photos_id
     *
     * @return the value of yp_merchant_shop_photos.shop_photos_id
     *
     * @mbggenerated
     */
    public Long getShopPhotosId() {
        return shopPhotosId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_merchant_shop_photos.shop_photos_id
     *
     * @param shopPhotosId the value for yp_merchant_shop_photos.shop_photos_id
     *
     * @mbggenerated
     */
    public void setShopPhotosId(Long shopPhotosId) {
        this.shopPhotosId = shopPhotosId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_merchant_shop_photos.ref_merchant_id
     *
     * @return the value of yp_merchant_shop_photos.ref_merchant_id
     *
     * @mbggenerated
     */
    public Long getRefMerchantId() {
        return refMerchantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_merchant_shop_photos.ref_merchant_id
     *
     * @param refMerchantId the value for yp_merchant_shop_photos.ref_merchant_id
     *
     * @mbggenerated
     */
    public void setRefMerchantId(Long refMerchantId) {
        this.refMerchantId = refMerchantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_merchant_shop_photos.shop_id
     *
     * @return the value of yp_merchant_shop_photos.shop_id
     *
     * @mbggenerated
     */
    public Long getShopId() {
        return shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_merchant_shop_photos.shop_id
     *
     * @param shopId the value for yp_merchant_shop_photos.shop_id
     *
     * @mbggenerated
     */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_merchant_shop_photos.img
     *
     * @return the value of yp_merchant_shop_photos.img
     *
     * @mbggenerated
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_merchant_shop_photos.img
     *
     * @param img the value for yp_merchant_shop_photos.img
     *
     * @mbggenerated
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_merchant_shop_photos.create_time
     *
     * @return the value of yp_merchant_shop_photos.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_merchant_shop_photos.create_time
     *
     * @param createTime the value for yp_merchant_shop_photos.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_merchant_shop_photos.update_time
     *
     * @return the value of yp_merchant_shop_photos.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_merchant_shop_photos.update_time
     *
     * @param updateTime the value for yp_merchant_shop_photos.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_merchant_shop_photos.img_type
     *
     * @return the value of yp_merchant_shop_photos.img_type
     *
     * @mbggenerated
     */
    public Short getImgType() {
        return imgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_merchant_shop_photos.img_type
     *
     * @param imgType the value for yp_merchant_shop_photos.img_type
     *
     * @mbggenerated
     */
    public void setImgType(Short imgType) {
        this.imgType = imgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yp_merchant_shop_photos.sort
     *
     * @return the value of yp_merchant_shop_photos.sort
     *
     * @mbggenerated
     */
    public Short getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yp_merchant_shop_photos.sort
     *
     * @param sort the value for yp_merchant_shop_photos.sort
     *
     * @mbggenerated
     */
    public void setSort(Short sort) {
        this.sort = sort;
    }
}