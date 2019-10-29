package com.msl.mybatis.mapper;

import com.msl.mybatis.entity.YpMerchantIdentity;
import com.msl.mybatis.entity.YpMerchantIdentityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YpMerchantIdentityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_identity
     *
     * @mbggenerated
     */
    int countByExample(YpMerchantIdentityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_identity
     *
     * @mbggenerated
     */
    int deleteByExample(YpMerchantIdentityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_identity
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long refUserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_identity
     *
     * @mbggenerated
     */
    int insert(YpMerchantIdentity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_identity
     *
     * @mbggenerated
     */
    int insertSelective(YpMerchantIdentity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_identity
     *
     * @mbggenerated
     */
    List<YpMerchantIdentity> selectByExample(YpMerchantIdentityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_identity
     *
     * @mbggenerated
     */
    YpMerchantIdentity selectByPrimaryKey(Long refUserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_identity
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") YpMerchantIdentity record, @Param("example") YpMerchantIdentityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_identity
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") YpMerchantIdentity record, @Param("example") YpMerchantIdentityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_identity
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(YpMerchantIdentity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_identity
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(YpMerchantIdentity record);
}