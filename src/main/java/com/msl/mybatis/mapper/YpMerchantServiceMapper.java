package com.msl.mybatis.mapper;

import com.msl.mybatis.entity.YpMerchantService;
import com.msl.mybatis.entity.YpMerchantServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YpMerchantServiceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_service
     *
     * @mbggenerated
     */
    int countByExample(YpMerchantServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_service
     *
     * @mbggenerated
     */
    int deleteByExample(YpMerchantServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_service
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_service
     *
     * @mbggenerated
     */
    int insert(YpMerchantService record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_service
     *
     * @mbggenerated
     */
    int insertSelective(YpMerchantService record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_service
     *
     * @mbggenerated
     */
    List<YpMerchantService> selectByExample(YpMerchantServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_service
     *
     * @mbggenerated
     */
    YpMerchantService selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_service
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") YpMerchantService record, @Param("example") YpMerchantServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_service
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") YpMerchantService record, @Param("example") YpMerchantServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_service
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(YpMerchantService record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_merchant_service
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(YpMerchantService record);
}