package com.msl.great.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @name:  系统参数配置
 * @description: 配置数据加载进系统
 * @params
 * @return:
 * @date: 2019-10-29 14:50
 * @auther: 马少龙
*/
//配置数据前缀
@ConfigurationProperties(prefix="com.md")
//配置数据扫描时，将数据设置进bean
@Component
//配置文件所在
@PropertySource("classpath:application-para.properties")
@Data
public class ParamerConfig {
    private String name;
    private String want;
}

