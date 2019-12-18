package com.msl.great;


import com.msl.great.config.MybatisConfig;
import com.msl.great.config.ParamerConfig;
import com.msl.netty.NettyServer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import java.net.InetSocketAddress;


//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication
//读取配置文件
@EnableConfigurationProperties({ParamerConfig.class,})
//扫描并装配bean，除去某些bean不进行装配
@ComponentScan(basePackages = {"com.msl.control"},excludeFilters =@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes={
    MybatisConfig.class}) )
//扫描mapper信息
@MapperScan(basePackages = {"com.msl.mybatis.mapper"})
public class GreatApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreatApplication.class, args);
        //启动服务端
        NettyServer nettyServer = new NettyServer();
        nettyServer.start(new InetSocketAddress("127.0.0.1", 8090));
    }

}
