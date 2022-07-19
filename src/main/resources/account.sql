CREATE TABLE `account`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `creator` bigint NULL COMMENT '创建者',
  `create_time` datetime NULL COMMENT '创建时间',
  `updator` bigint NULL COMMENT '修改者',
  `update_time` datetime NULL COMMENT '修改时间',
  `delete_status` int NULL COMMENT '删除 0 未删除 1 已删除',
  `user_id` bigint NULL COMMENT '所属用户',
  `account_name` varchar(255) NULL COMMENT '账户名称',
  `balance` double(10, 2) NULL COMMENT '账户余额',
  PRIMARY KEY (`id`)
);

CREATE TABLE `category`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `creator` bigint NULL COMMENT '创建者',
  `create_time` datetime NULL COMMENT '创建时间',
  `updator` bigint NULL COMMENT '修改者',
  `update_time` datetime NULL COMMENT '修改时间',
  `delete_status` int NULL COMMENT '删除 0 未删除 1 已删除',
  `category_name` varchar(255) NULL COMMENT '分类名称',
  `parent_id` bigint NULL COMMENT '父分类',
  `level` int NULL COMMENT '级别 1 一级分类 2 二级分类',
  PRIMARY KEY (`id`)
);

CREATE TABLE `record`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `creator` bigint NULL COMMENT '创建者',
  `create_time` datetime NULL COMMENT '创建时间',
  `updator` bigint NULL COMMENT '修改者',
  `update_time` datetime NULL COMMENT '修改时间',
  `delete_status` int NULL COMMENT '删除 0 未删除 1 已删除',
  `account_id` bigint NULL COMMENT '账户id',
  `parent_category_id` bigint NULL COMMENT '父分类id',
  `children_category_id` bigint NULL COMMENT '子分类id',
  `cost` decimal(10, 2) NULL COMMENT '花费',
  `type` int NULL COMMENT '类型 1 收入 2 支出',
  PRIMARY KEY (`id`)
);

CREATE TABLE `transfer_account_record`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `creator` bigint NULL COMMENT '创建者',
  `create_time` datetime NULL COMMENT '创建时间',
  `updator` bigint NULL COMMENT '修改者',
  `update_time` datetime NULL COMMENT '修改时间',
  `delete_status` int NULL COMMENT '删除 0 未删除 1 已删除',
  `from_account_id` bigint NULL COMMENT 'from账户id',
  `cost` decimal(10, 2) NULL COMMENT '花费',
  `to_account_id` bigint NULL COMMENT 'to账户id',
  PRIMARY KEY (`id`)
);

CREATE TABLE `user`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `creator` bigint NULL COMMENT '创建者',
  `create_time` datetime NULL COMMENT '创建时间',
  `updator` bigint NULL COMMENT '修改者',
  `update_time` datetime NULL COMMENT '修改时间',
  `delete_status` int NULL COMMENT '删除 0 未删除 1 已删除',
  `user_name` varchar(255) NULL COMMENT '用户名',
  PRIMARY KEY (`id`)
);

