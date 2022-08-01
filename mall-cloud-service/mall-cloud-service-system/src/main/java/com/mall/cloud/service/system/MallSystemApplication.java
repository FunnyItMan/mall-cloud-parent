package com.mall.cloud.service.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.mall.cloud.service.system.mapper"})
public class MallSystemApplication {
}
