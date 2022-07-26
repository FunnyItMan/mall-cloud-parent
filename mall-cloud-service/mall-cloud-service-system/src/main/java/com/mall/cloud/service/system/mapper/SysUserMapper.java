package com.mall.cloud.service.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mall.cloud.service.system.domain.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户mapper
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
}
