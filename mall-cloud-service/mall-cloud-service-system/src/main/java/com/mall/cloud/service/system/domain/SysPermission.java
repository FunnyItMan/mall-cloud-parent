package com.mall.cloud.service.system.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 后台用户权限表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_permission")
public class SysPermission {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 父级权限id
     */
    @TableField(value = "pid")
    private Long pid;

    /**
     * 名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 权限值
     */
    @TableField(value = "perms")
    private String perms;

    /**
     * 图标
     */
    @TableField(value = "icon")
    private String icon;

    /**
     * 权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
     */
    @TableField(value = "type")
    private Integer type;

    /**
     * 前端资源路径
     */
    @TableField(value = "uri")
    private String uri;

    /**
     * 启用状态；0->禁用；1->启用
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 排序
     */
    @TableField(value = "sort")
    private Integer sort;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;
}