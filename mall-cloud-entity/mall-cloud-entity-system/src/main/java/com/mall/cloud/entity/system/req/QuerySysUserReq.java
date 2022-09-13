package com.mall.cloud.entity.system.req;

import com.mall.cloud.common.basic.pojo.Page;
import lombok.Data;

/**
 * 用户查询实体类
 */
@Data
public class QuerySysUserReq extends Page {

    /**
     * 登录名称
     */
    private String loginName;
}
