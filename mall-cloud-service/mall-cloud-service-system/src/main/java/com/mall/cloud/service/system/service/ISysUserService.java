package com.mall.cloud.service.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.cloud.common.basic.pojo.PageR;
import com.mall.cloud.entity.system.req.QuerySysUserReq;
import com.mall.cloud.service.system.domain.SysUser;

/**
 * 用户service
 */
public interface ISysUserService extends IService<SysUser> {

    /**
     * 用户列表
     *
     * @param userReq
     * @return
     */
    PageR<SysUser> page(QuerySysUserReq userReq);
}
