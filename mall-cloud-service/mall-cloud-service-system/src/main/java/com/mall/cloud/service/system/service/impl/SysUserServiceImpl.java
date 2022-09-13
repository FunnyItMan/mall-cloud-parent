package com.mall.cloud.service.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mall.cloud.common.basic.pojo.PageR;
import com.mall.cloud.entity.system.req.QuerySysUserReq;
import com.mall.cloud.service.system.domain.SysUser;
import com.mall.cloud.service.system.mapper.SysUserMapper;
import com.mall.cloud.service.system.service.ISysUserService;
import org.springframework.stereotype.Service;

/**
 * 用户serviceImpl
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {
    /**
     * 用户列表
     *
     * @param userReq
     * @return
     */
    @Override
    public PageR<SysUser> page(QuerySysUserReq userReq) {
        Page<SysUser> page = this.baseMapper.selectPage(new Page<>(userReq.getPages(), userReq.getRows()),
                new LambdaQueryWrapper<>());
        //组装分页结果实体类
        return new PageR<>(page.getTotal(), page.getRecords());
    }
}
