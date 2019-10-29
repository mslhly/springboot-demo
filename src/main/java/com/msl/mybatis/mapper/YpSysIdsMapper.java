package com.msl.mybatis.mapper;

import com.msl.mybatis.entity.YpSysIds;
import com.msl.mybatis.entity.YpSysIdsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YpSysIdsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_ids
     *
     * @mbggenerated
     */
    int countByExample(YpSysIdsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_ids
     *
     * @mbggenerated
     */
    int deleteByExample(YpSysIdsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_ids
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_ids
     *
     * @mbggenerated
     */
    int insert(YpSysIds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_ids
     *
     * @mbggenerated
     */
    int insertSelective(YpSysIds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_ids
     *
     * @mbggenerated
     */
    List<YpSysIds> selectByExample(YpSysIdsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_ids
     *
     * @mbggenerated
     */
    YpSysIds selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_ids
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") YpSysIds record, @Param("example") YpSysIdsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_ids
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") YpSysIds record, @Param("example") YpSysIdsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_ids
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(YpSysIds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_ids
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(YpSysIds record);
}