package com.mall.cloud.common.basic.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一返回值
 *
 * @param <T>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class R<T> {

    private Long code;       //返回码
    private String msg;        //描述信息
    private T data;       //返回数据

    /**
     * 请求成功，无data数据
     *
     * @param <T>  返回值参数类型
     * @return
     */
    public static <T> R<T> ok() {
        return new R<>(200L, "success", null);
    }

    /**
     * 请求成功，有data数据
     *
     * @param data 数据
     * @param <T>  返回值参数类型
     * @return
     */
    public static <T> R<T> ok(T data) {
        return new R<>(200L, "success", data);
    }
}
