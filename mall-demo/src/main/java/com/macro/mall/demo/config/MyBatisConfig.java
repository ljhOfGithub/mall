package com.macro.mall.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
//mybatis配置类
/**
 * MyBatis相关配置
 * Created by macro on 2018/4/26.
 */
@Configuration
@MapperScan("com.macro.mall.mapper")
public class MyBatisConfig {
}
