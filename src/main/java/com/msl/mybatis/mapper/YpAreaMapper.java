package com.msl.mybatis.mapper;

import com.msl.mybatis.entity.YpArea;
import com.msl.mybatis.entity.YpAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YpAreaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_area
     *
     * @mbggenerated
     */
    int countByExample(YpAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_area
     *
     * @mbggenerated
     */
    int deleteByExample(YpAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_area
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_area
     *
     * @mbggenerated
     */
    int insert(YpArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_area
     *
     * @mbggenerated
     */
    int insertSelective(YpArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_area
     *
     * @mbggenerated
     */
    List<YpArea> selectByExample(YpAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_area
     *
     * @mbggenerated
     */
    YpArea selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_area
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") YpArea record, @Param("example") YpAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_area
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") YpArea record, @Param("example") YpAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_area
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(YpArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_area
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(YpArea record);
}