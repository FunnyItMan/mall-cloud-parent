package com.mall.cloud.common.basic.pojo;

import lombok.Data;

@Data
public class Page {

    private Integer startPage = 1;  //起始页，默认第一页
    private Integer rows = 10;      //每页的记录数，默认查10条
}
