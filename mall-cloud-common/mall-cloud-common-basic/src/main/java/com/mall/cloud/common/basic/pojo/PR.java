package com.mall.cloud.common.basic.pojo;

import lombok.Data;

import java.util.List;

/**
 * 分页查询结果对象
 *
 * @param <T>
 */
@Data
public class PR<T> {
    private Integer     total;  //总数量
    private List<T>     list;   //数据
}
