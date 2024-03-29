package com.msl.mybatis.mapper;

import com.msl.mybatis.entity.YpConfig;
import com.msl.mybatis.entity.YpConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YpConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_config
     *
     * @mbggenerated
     */
    int countByExample(YpConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_config
     *
     * @mbggenerated
     */
    int deleteByExample(YpConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_config
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer configId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_config
     *
     * @mbggenerated
     */
    int insert(YpConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_config
     *
     * @mbggenerated
     */
    int insertSelective(YpConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_config
     *
     * @mbggenerated
     */
    List<YpConfig> selectByExample(YpConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_config
     *
     * @mbggenerated
     */
    YpConfig selectByPrimaryKey(Integer configId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_config
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") YpConfig record, @Param("example") YpConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_config
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") YpConfig record, @Param("example") YpConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(YpConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(YpConfig record);
}