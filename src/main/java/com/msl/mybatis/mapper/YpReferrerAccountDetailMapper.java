package com.msl.mybatis.mapper;

import com.msl.mybatis.entity.YpReferrerAccountDetail;
import com.msl.mybatis.entity.YpReferrerAccountDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YpReferrerAccountDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_referrer_account_detail
     *
     * @mbggenerated
     */
    int countByExample(YpReferrerAccountDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_referrer_account_detail
     *
     * @mbggenerated
     */
    int deleteByExample(YpReferrerAccountDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_referrer_account_detail
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long inviteId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_referrer_account_detail
     *
     * @mbggenerated
     */
    int insert(YpReferrerAccountDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_referrer_account_detail
     *
     * @mbggenerated
     */
    int insertSelective(YpReferrerAccountDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_referrer_account_detail
     *
     * @mbggenerated
     */
    List<YpReferrerAccountDetail> selectByExample(YpReferrerAccountDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_referrer_account_detail
     *
     * @mbggenerated
     */
    YpReferrerAccountDetail selectByPrimaryKey(Long inviteId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_referrer_account_detail
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") YpReferrerAccountDetail record, @Param("example") YpReferrerAccountDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_referrer_account_detail
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") YpReferrerAccountDetail record, @Param("example") YpReferrerAccountDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_referrer_account_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(YpReferrerAccountDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_referrer_account_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(YpReferrerAccountDetail record);
}