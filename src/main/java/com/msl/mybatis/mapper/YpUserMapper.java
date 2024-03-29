package com.msl.mybatis.mapper;

import com.msl.mybatis.entity.YpUser;
import com.msl.mybatis.entity.YpUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YpUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user
     *
     * @mbggenerated
     */
    int countByExample(YpUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user
     *
     * @mbggenerated
     */
    int deleteByExample(YpUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user
     *
     * @mbggenerated
     */
    int insert(YpUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user
     *
     * @mbggenerated
     */
    int insertSelective(YpUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user
     *
     * @mbggenerated
     */
    List<YpUser> selectByExample(YpUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user
     *
     * @mbggenerated
     */
    YpUser selectByPrimaryKey(Long userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") YpUser record, @Param("example") YpUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") YpUser record, @Param("example") YpUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(YpUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(YpUser record);
}