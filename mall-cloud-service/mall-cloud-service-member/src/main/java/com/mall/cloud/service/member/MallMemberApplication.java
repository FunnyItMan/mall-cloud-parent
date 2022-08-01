package com.mall.cloud.service.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.mall.cloud.service.member.mapper"})
public class MallMemberApplication {
}
