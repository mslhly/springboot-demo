package com.msl.mybatis.mapper;

import com.msl.mybatis.entity.YpStructurePeriods;
import com.msl.mybatis.entity.YpStructurePeriodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YpStructurePeriodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_structure_periods
     *
     * @mbggenerated
     */
    int countByExample(YpStructurePeriodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_structure_periods
     *
     * @mbggenerated
     */
    int deleteByExample(YpStructurePeriodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_structure_periods
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer periodsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_structure_periods
     *
     * @mbggenerated
     */
    int insert(YpStructurePeriods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_structure_periods
     *
     * @mbggenerated
     */
    int insertSelective(YpStructurePeriods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_structure_periods
     *
     * @mbggenerated
     */
    List<YpStructurePeriods> selectByExample(YpStructurePeriodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_structure_periods
     *
     * @mbggenerated
     */
    YpStructurePeriods selectByPrimaryKey(Integer periodsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_structure_periods
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") YpStructurePeriods record, @Param("example") YpStructurePeriodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_structure_periods
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") YpStructurePeriods record, @Param("example") YpStructurePeriodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_structure_periods
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(YpStructurePeriods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_structure_periods
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(YpStructurePeriods record);
}