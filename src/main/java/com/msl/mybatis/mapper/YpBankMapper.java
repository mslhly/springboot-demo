package com.msl.mybatis.mapper;

import com.msl.mybatis.entity.YpBank;
import com.msl.mybatis.entity.YpBankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YpBankMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_bank
     *
     * @mbggenerated
     */
    int countByExample(YpBankExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_bank
     *
     * @mbggenerated
     */
    int deleteByExample(YpBankExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_bank
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer bankId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_bank
     *
     * @mbggenerated
     */
    int insert(YpBank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_bank
     *
     * @mbggenerated
     */
    int insertSelective(YpBank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_bank
     *
     * @mbggenerated
     */
    List<YpBank> selectByExample(YpBankExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_bank
     *
     * @mbggenerated
     */
    YpBank selectByPrimaryKey(Integer bankId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_bank
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") YpBank record, @Param("example") YpBankExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_bank
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") YpBank record, @Param("example") YpBankExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_bank
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(YpBank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_bank
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(YpBank record);
}