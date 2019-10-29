package com.msl.mybatis.mapper;

import com.msl.mybatis.entity.YpTradeError;
import com.msl.mybatis.entity.YpTradeErrorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YpTradeErrorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_error
     *
     * @mbggenerated
     */
    int countByExample(YpTradeErrorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_error
     *
     * @mbggenerated
     */
    int deleteByExample(YpTradeErrorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_error
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_error
     *
     * @mbggenerated
     */
    int insert(YpTradeError record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_error
     *
     * @mbggenerated
     */
    int insertSelective(YpTradeError record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_error
     *
     * @mbggenerated
     */
    List<YpTradeError> selectByExample(YpTradeErrorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_error
     *
     * @mbggenerated
     */
    YpTradeError selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_error
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") YpTradeError record, @Param("example") YpTradeErrorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_error
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") YpTradeError record, @Param("example") YpTradeErrorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_error
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(YpTradeError record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_trade_error
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(YpTradeError record);
}