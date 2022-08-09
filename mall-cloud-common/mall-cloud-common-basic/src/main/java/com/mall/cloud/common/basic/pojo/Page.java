package com.mall.cloud.common.basic.pojo;

import lombok.Data;

@Data
public class Page {

    private Integer startPage;  //起始页
    private Integer rows;       //每页的记录数
}
