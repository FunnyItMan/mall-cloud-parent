package com.mall.cloud.common.basic.pojo;

import lombok.Data;

@Data
public class Page {

    private Integer pages = 1;      //当前页，默认第一页
    private Integer rows = 10;      //每页的记录数，默认查10条
}
