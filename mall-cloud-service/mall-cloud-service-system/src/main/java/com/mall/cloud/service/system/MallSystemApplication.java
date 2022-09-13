package com.mall.cloud.service.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 核心启动类
 */
@SpringBootApplication
public class MallSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallSystemApplication.class, args);
    }
}
