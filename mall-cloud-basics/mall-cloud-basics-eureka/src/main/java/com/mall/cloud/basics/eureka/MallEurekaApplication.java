package com.mall.cloud.basics.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka服务端启动类
 */
@EnableEurekaServer
@SpringBootApplication
public class MallEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallEurekaApplication.class, args);
    }
}
