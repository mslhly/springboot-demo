package com.msl.mybatis.mapper;

import com.msl.mybatis.entity.YpRiskRule;
import com.msl.mybatis.entity.YpRiskRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YpRiskRuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_risk_rule
     *
     * @mbggenerated
     */
    int countByExample(YpRiskRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_risk_rule
     *
     * @mbggenerated
     */
    int deleteByExample(YpRiskRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_risk_rule
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_risk_rule
     *
     * @mbggenerated
     */
    int insert(YpRiskRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_risk_rule
     *
     * @mbggenerated
     */
    int insertSelective(YpRiskRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_risk_rule
     *
     * @mbggenerated
     */
    List<YpRiskRule> selectByExample(YpRiskRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_risk_rule
     *
     * @mbggenerated
     */
    YpRiskRule selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_risk_rule
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") YpRiskRule record, @Param("example") YpRiskRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_risk_rule
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") YpRiskRule record, @Param("example") YpRiskRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_risk_rule
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(YpRiskRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yp_risk_rule
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(YpRiskRule record);
}