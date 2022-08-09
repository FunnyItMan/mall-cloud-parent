package com.mall.cloud.common.basic.pojo;

import lombok.Data;

/**
 * 统一返回值
 *
 * @param <T>
 */
@Data
public class R<T> {

    private Long        code;       //返回码
    private String      msg;        //描述信息
    private T           data;       //返回数据
}
