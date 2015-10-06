/*
MySQL Backup
Source Server Version: 5.5.25
Source Database: tiger_u
Date: 2015/10/6 星期二 14:48:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
--  Table structure for `statement`
-- ----------------------------
DROP TABLE IF EXISTS `statement`;
CREATE TABLE `statement` (
  `Name` varchar(20) DEFAULT NULL,
  `ID` varchar(30) NOT NULL DEFAULT '',
  `Phone` varchar(15) DEFAULT NULL,
  `Month` varchar(10) NOT NULL DEFAULT '',
  `FundName` varchar(20) NOT NULL DEFAULT '',
  `NetValueOfBuyDay` varchar(10) DEFAULT NULL,
  `PurchaseAmount` varchar(25) DEFAULT NULL,
  `PurchaseShares` varchar(20) DEFAULT NULL,
  `CurrentBalance` varchar(10) DEFAULT NULL,
  `RedemptionShares` varchar(20) DEFAULT NULL,
  `RedemptionAmount` varchar(25) DEFAULT NULL,
  `TotalShares` varchar(20) DEFAULT NULL,
  `TotalAmount` varchar(25) DEFAULT NULL,
  `TotalBalance` varchar(10) DEFAULT NULL,
  `Profit` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`ID`,`Month`,`FundName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='业务数据';

-- ----------------------------
--  Table structure for `tiger_access_token`
-- ----------------------------
DROP TABLE IF EXISTS `tiger_access_token`;
CREATE TABLE `tiger_access_token` (
  `id` varchar(30) COLLATE utf8_unicode_ci NOT NULL COMMENT 'id',
  `accessToken` varchar(512) COLLATE utf8_unicode_ci NOT NULL COMMENT '高级功能token',
  `expiresIn` int(11) NOT NULL DEFAULT '7200' COMMENT '过期时间（单位：秒）',
  `refreshToken` varchar(512) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '刷新token，在oauth和授权登录中能获取该值',
  `openid` varchar(256) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户OPENID',
  `scope` varchar(256) COLLATE utf8_unicode_ci DEFAULT NULL,
  `errcode` int(11) DEFAULT NULL COMMENT '错误码',
  `errmsg` varchar(512) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '错误信息',
  `created` bigint(15) DEFAULT '0' COMMENT '当前时间戳（毫秒）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='系统token记录表';

-- ----------------------------
--  Table structure for `tiger_naming`
-- ----------------------------
DROP TABLE IF EXISTS `tiger_naming`;
CREATE TABLE `tiger_naming` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` varchar(50) DEFAULT NULL,
  `openid` varchar(50) DEFAULT NULL,
  `opt_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='认证表';

-- ----------------------------
--  Table structure for `tiger_opt`
-- ----------------------------
DROP TABLE IF EXISTS `tiger_opt`;
CREATE TABLE `tiger_opt` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `opt_name` varchar(100) DEFAULT NULL,
  `opt_code` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='操作信息表';

-- ----------------------------
--  Table structure for `tiger_pay`
-- ----------------------------
DROP TABLE IF EXISTS `tiger_pay`;
CREATE TABLE `tiger_pay` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `openid` varchar(50) DEFAULT NULL,
  `trade_id` varchar(50) DEFAULT NULL COMMENT '微信交易号',
  `pay_status` int(11) DEFAULT NULL COMMENT ' 支付状态',
  `pay_money` int(11) DEFAULT NULL COMMENT '支付金额 ，单位是分',
  `pay_time` varchar(20) DEFAULT NULL COMMENT ' 支付日期',
  `product_name` varchar(11) DEFAULT NULL COMMENT ' 产品名称',
  `order_id` varchar(32) DEFAULT NULL COMMENT '商户订单号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='支付信息表';

-- ----------------------------
--  Table structure for `tiger_userinfo`
-- ----------------------------
DROP TABLE IF EXISTS `tiger_userinfo`;
CREATE TABLE `tiger_userinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idcard` varchar(18) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `real_name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
--  Table structure for `tiger_user_opt`
-- ----------------------------
DROP TABLE IF EXISTS `tiger_user_opt`;
CREATE TABLE `tiger_user_opt` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `openid` varchar(100) DEFAULT NULL COMMENT '用户openid',
  `opt_code` varchar(20) DEFAULT NULL COMMENT '用户操作模块儿代码',
  `opt_time` datetime DEFAULT NULL COMMENT '操作时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户操作记录表';

-- ----------------------------
--  Table structure for `wx_image_resource`
-- ----------------------------
DROP TABLE IF EXISTS `wx_image_resource`;
CREATE TABLE `wx_image_resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `media_id` varchar(50) DEFAULT NULL,
  `name` varchar(100) DEFAULT '',
  `update_time` varchar(15) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=173 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `wx_image_resource_temp`
-- ----------------------------
DROP TABLE IF EXISTS `wx_image_resource_temp`;
CREATE TABLE `wx_image_resource_temp` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `media_id` varchar(50) DEFAULT NULL,
  `name` varchar(100) DEFAULT '',
  `update_time` varchar(15) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=173 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `wx_menu`
-- ----------------------------
DROP TABLE IF EXISTS `wx_menu`;
CREATE TABLE `wx_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `menu_name` varchar(50) DEFAULT NULL,
  `menu_type` varchar(10) DEFAULT NULL,
  `menu_key` varchar(100) DEFAULT NULL,
  `menu_order` int(11) DEFAULT NULL,
  `is_parent` char(1) DEFAULT NULL,
  `parent_id` int(11) DEFAULT NULL,
  `menu_url` varchar(255) DEFAULT NULL,
  `resource_id` varchar(100) DEFAULT NULL COMMENT '微信资源id，如mediaid或多图文的mediaid',
  `response_type` varchar(50) DEFAULT NULL COMMENT '回复类型,news、image、text',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='微信菜单';

-- ----------------------------
--  Table structure for `wx_news_resource`
-- ----------------------------
DROP TABLE IF EXISTS `wx_news_resource`;
CREATE TABLE `wx_news_resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `menu_key` varchar(100) DEFAULT NULL,
  `media_id` varchar(50) DEFAULT NULL,
  `news_title` varchar(200) DEFAULT NULL,
  `news_des` varchar(500) DEFAULT NULL,
  `pic_url` varchar(500) DEFAULT NULL,
  `news_url` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `wx_userinfo`
-- ----------------------------
DROP TABLE IF EXISTS `wx_userinfo`;
CREATE TABLE `wx_userinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `subscribe` char(1) DEFAULT NULL,
  `openid` varchar(32) DEFAULT NULL,
  `nickname` varchar(100) CHARACTER SET utf8mb4 DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `country` varchar(20) DEFAULT NULL,
  `province` varchar(20) DEFAULT NULL,
  `language` varchar(10) DEFAULT NULL,
  `headimgurl` varchar(500) DEFAULT NULL,
  `subscribe_time` varchar(15) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `groupid` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2296 DEFAULT CHARSET=utf8 COMMENT='粉丝信息表';

-- ----------------------------
--  Table structure for `wx_userinfo_temp`
-- ----------------------------
DROP TABLE IF EXISTS `wx_userinfo_temp`;
CREATE TABLE `wx_userinfo_temp` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `subscribe` char(1) DEFAULT NULL,
  `openid` varchar(32) DEFAULT NULL,
  `nickname` varchar(100) CHARACTER SET utf8mb4 DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `country` varchar(20) DEFAULT NULL,
  `province` varchar(20) DEFAULT NULL,
  `language` varchar(10) DEFAULT NULL,
  `headimgurl` varchar(500) DEFAULT NULL,
  `subscribe_time` varchar(15) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `groupid` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='粉丝信息临时表';

-- ----------------------------
--  Records 
-- ----------------------------