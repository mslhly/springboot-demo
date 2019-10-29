package com.msl.mybatis.mapper;

import com.msl.mybatis.entity.YpSysMenu;
import com.msl.mybatis.entity.YpSysMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YpSysMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_menu
     *
     * @mbggenerated
     */
    int countByExample(YpSysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_menu
     *
     * @mbggenerated
     */
    int deleteByExample(YpSysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_menu
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer menuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_menu
     *
     * @mbggenerated
     */
    int insert(YpSysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_menu
     *
     * @mbggenerated
     */
    int insertSelective(YpSysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_menu
     *
     * @mbggenerated
     */
    List<YpSysMenu> selectByExample(YpSysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_menu
     *
     * @mbggenerated
     */
    YpSysMenu selectByPrimaryKey(Integer menuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_menu
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") YpSysMenu record, @Param("example") YpSysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_menu
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") YpSysMenu record, @Param("example") YpSysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_menu
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(YpSysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_sys_menu
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(YpSysMenu record);
}