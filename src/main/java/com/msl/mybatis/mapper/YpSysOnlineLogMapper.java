package com.msl.mybatis.mapper;

import com.msl.mybatis.entity.YpSysOnlineLog;
import com.msl.mybatis.entity.YpSysOnlineLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YpSysOnlineLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_online_log
     *
     * @mbggenerated
     */
    int countByExample(YpSysOnlineLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_online_log
     *
     * @mbggenerated
     */
    int deleteByExample(YpSysOnlineLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_online_log
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_online_log
     *
     * @mbggenerated
     */
    int insert(YpSysOnlineLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_online_log
     *
     * @mbggenerated
     */
    int insertSelective(YpSysOnlineLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_online_log
     *
     * @mbggenerated
     */
    List<YpSysOnlineLog> selectByExample(YpSysOnlineLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_online_log
     *
     * @mbggenerated
     */
    YpSysOnlineLog selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_online_log
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") YpSysOnlineLog record, @Param("example") YpSysOnlineLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_online_log
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") YpSysOnlineLog record, @Param("example") YpSysOnlineLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_online_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(YpSysOnlineLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_online_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(YpSysOnlineLog record);
}