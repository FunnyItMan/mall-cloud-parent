-- 后台用户表
CREATE TABLE `sys_user`
(
    `id`          int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `login_name`  varchar(255) NOT NULL COMMENT '登录名称',
    `password`    varchar(255) NOT NULL COMMENT '登录密码',
    `email`       varchar(255) NOT NULL COMMENT '邮箱',
    `status`      int(1) DEFAULT '1' COMMENT '启用状态：0->禁用；1->启用',
    `role_id`     bigint(20) DEFAULT NULL COMMENT '角色ID',
    `create_time` datetime     NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` datetime     NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='后台用户表';

-- 后台用户角色表
CREATE TABLE `sys_role`
(
    `id`          bigint(20) NOT NULL AUTO_INCREMENT,
    `name`        varchar(100) DEFAULT NULL COMMENT '角色名称',
    `description` varchar(500) DEFAULT NULL COMMENT '角色描述',
    `status`      int(1) DEFAULT '1' COMMENT '启用状态：0->禁用；1->启用',
    `create_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='后台用户角色表';


-- 后台用户权限表
CREATE TABLE `sys_permission`
(
    `id`          bigint(20) NOT NULL AUTO_INCREMENT,
    `pid`         bigint(20) DEFAULT NULL COMMENT '父级权限id',
    `name`        varchar(100) DEFAULT NULL COMMENT '名称',
    `perms`       varchar(200) DEFAULT NULL COMMENT '权限值',
    `icon`        varchar(500) DEFAULT NULL COMMENT '图标',
    `type`        int(1) DEFAULT NULL COMMENT '权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）',
    `uri`         varchar(200) DEFAULT NULL COMMENT '前端资源路径',
    `status`      int(1) DEFAULT NULL COMMENT '启用状态；0->禁用；1->启用',
    `sort`        int(11) DEFAULT NULL COMMENT '排序',
    `create_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='后台用户权限表';


-- 后台用户角色和权限关系表
CREATE TABLE `role_permission`
(
    `id`            bigint(20) NOT NULL AUTO_INCREMENT,
    `role_id`       bigint(20) DEFAULT NULL,
    `permission_id` bigint(20) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='后台用户角色和权限关系表';
