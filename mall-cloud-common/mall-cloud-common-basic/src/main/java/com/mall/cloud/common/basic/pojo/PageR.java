package com.mall.cloud.common.basic.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 分页查询结果对象
 *
 * @param <T>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageR<T> {
    private Long     total;  //总数量
    private List<T>     list;   //数据
}
