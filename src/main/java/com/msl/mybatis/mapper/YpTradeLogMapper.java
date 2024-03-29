package com.msl.mybatis.mapper;

import com.msl.mybatis.entity.YpTradeLog;
import com.msl.mybatis.entity.YpTradeLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YpTradeLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
    int countByExample(YpTradeLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
    int deleteByExample(YpTradeLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
    int insert(YpTradeLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
    int insertSelective(YpTradeLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
    List<YpTradeLog> selectByExample(YpTradeLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
    YpTradeLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") YpTradeLog record, @Param("example") YpTradeLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") YpTradeLog record, @Param("example") YpTradeLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(YpTradeLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(YpTradeLog record);
}