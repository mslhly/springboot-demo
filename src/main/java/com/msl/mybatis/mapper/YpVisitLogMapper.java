package com.msl.mybatis.mapper;

import com.msl.mybatis.entity.YpVisitLog;
import com.msl.mybatis.entity.YpVisitLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YpVisitLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_visit_log
     *
     * @mbggenerated
     */
    int countByExample(YpVisitLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_visit_log
     *
     * @mbggenerated
     */
    int deleteByExample(YpVisitLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_visit_log
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_visit_log
     *
     * @mbggenerated
     */
    int insert(YpVisitLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_visit_log
     *
     * @mbggenerated
     */
    int insertSelective(YpVisitLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_visit_log
     *
     * @mbggenerated
     */
    List<YpVisitLog> selectByExample(YpVisitLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_visit_log
     *
     * @mbggenerated
     */
    YpVisitLog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_visit_log
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") YpVisitLog record, @Param("example") YpVisitLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_visit_log
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") YpVisitLog record, @Param("example") YpVisitLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_visit_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(YpVisitLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_visit_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(YpVisitLog record);
}