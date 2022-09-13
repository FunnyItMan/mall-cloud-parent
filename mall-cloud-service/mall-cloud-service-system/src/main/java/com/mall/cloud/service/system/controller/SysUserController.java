package com.mall.cloud.service.system.controller;

import com.mall.cloud.common.basic.pojo.PageR;
import com.mall.cloud.common.basic.pojo.R;
import com.mall.cloud.entity.system.req.QuerySysUserReq;
import com.mall.cloud.service.system.domain.SysUser;
import com.mall.cloud.service.system.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 后台用户
 */
@Controller
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    ISysUserService userService;

    /**
     * 用户列表
     *
     * @return <ref>QuerySysUserRes</>
     */
    @ResponseBody
    @RequestMapping("/page")
    public R<PageR<SysUser>> page(@RequestBody QuerySysUserReq userReq) {
        return R.ok(userService.page(userReq));
    }
}
