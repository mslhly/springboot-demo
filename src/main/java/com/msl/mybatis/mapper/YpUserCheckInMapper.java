package com.msl.mybatis.mapper;

import com.msl.mybatis.entity.YpUserCheckIn;
import com.msl.mybatis.entity.YpUserCheckInExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YpUserCheckInMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user_check_in
     *
     * @mbggenerated
     */
    int countByExample(YpUserCheckInExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user_check_in
     *
     * @mbggenerated
     */
    int deleteByExample(YpUserCheckInExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user_check_in
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String checkInId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user_check_in
     *
     * @mbggenerated
     */
    int insert(YpUserCheckIn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user_check_in
     *
     * @mbggenerated
     */
    int insertSelective(YpUserCheckIn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user_check_in
     *
     * @mbggenerated
     */
    List<YpUserCheckIn> selectByExample(YpUserCheckInExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user_check_in
     *
     * @mbggenerated
     */
    YpUserCheckIn selectByPrimaryKey(String checkInId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user_check_in
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") YpUserCheckIn record, @Param("example") YpUserCheckInExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user_check_in
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") YpUserCheckIn record, @Param("example") YpUserCheckInExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user_check_in
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(YpUserCheckIn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user_check_in
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(YpUserCheckIn record);
}