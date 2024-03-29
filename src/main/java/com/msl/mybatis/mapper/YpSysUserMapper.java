package com.msl.mybatis.mapper;

import com.msl.mybatis.entity.YpSysUser;
import com.msl.mybatis.entity.YpSysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YpSysUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_user
     *
     * @mbggenerated
     */
    int countByExample(YpSysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_user
     *
     * @mbggenerated
     */
    int deleteByExample(YpSysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_user
     *
     * @mbggenerated
     */
    int insert(YpSysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_user
     *
     * @mbggenerated
     */
    int insertSelective(YpSysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_user
     *
     * @mbggenerated
     */
    List<YpSysUser> selectByExample(YpSysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_user
     *
     * @mbggenerated
     */
    YpSysUser selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_user
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") YpSysUser record, @Param("example") YpSysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_user
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") YpSysUser record, @Param("example") YpSysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(YpSysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(YpSysUser record);
}