/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50622
Source Host           : localhost:3306
Source Database       : tiger

Target Server Type    : MYSQL
Target Server Version : 50622
File Encoding         : 65001

Date: 2015-09-25 21:12:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for statement
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of statement
-- ----------------------------
INSERT INTO `statement` VALUES ('杨靖', '110111198706111000', '13581536386', '2015.4', 'A股-1号', '2.83', '0', '0', '0.0', '0', '0', '0', '0.0', '0.0', '0.0');
INSERT INTO `statement` VALUES ('杨靖', '110111198706111000', '13581536386', '2015.4', '期货-1号', '1.58', '0', '0', '0.0', '0', '0', '0', '0.0', '0.0', '0.0');
INSERT INTO `statement` VALUES ('杨靖', '110111198706111000', '13581536386', '2015.4', '美股-1号', '1.08', '1000', '925', '1.0', '0', '0', '925', '999.0', '1.0', '0.0');
INSERT INTO `statement` VALUES ('杨靖', '110111198706111000', '13581536386', '2015.5', 'A股-1号', '3.23', '0', '0', '0.0', '0', '0', '0', '0.0', '0.0', '0.0');
INSERT INTO `statement` VALUES ('杨靖', '110111198706111000', '13581536386', '2015.5', '期货-1号', '1.59', '0', '0', '0.0', '0', '0', '0', '0.0', '0.0', '0.0');
INSERT INTO `statement` VALUES ('杨靖', '110111198706111000', '13581536386', '2015.5', '美股-1号', '1.06', '1000', '943', '0.42', '0', '0', '1868', '1980.08', '1.42', '-18.5');
INSERT INTO `statement` VALUES ('杨靖', '110111198706111000', '13581536386', '2015.6', 'A股-1号', '4.28', '0', '0', '0.0', '0', '0', '0', '0.0', '0.0', '0.0');
INSERT INTO `statement` VALUES ('杨靖', '110111198706111000', '13581536386', '2015.6', '期货-1号', '1.55', '0', '0', '0.0', '0', '0', '0', '0.0', '0.0', '0.0');
INSERT INTO `statement` VALUES ('杨靖', '110111198706111000', '13581536386', '2015.6', '美股-1号', '1.08', '500', '464', '0.3', '0', '0', '2332', '2518.56', '0.3', '18.86');
INSERT INTO `statement` VALUES ('杨靖', '110111198706111000', '13581536386', '2015.7', 'A股-1号', '3.72', '0', '0', '0.0', '0', '0', '0', '0.0', '0.0', '0.0');
INSERT INTO `statement` VALUES ('杨靖', '110111198706111000', '13581536386', '2015.7', '期货-1号', '1.5', '0', '0', '0.0', '0', '0', '0', '0.0', '0.0', '0.0');
INSERT INTO `statement` VALUES ('杨靖', '110111198706111000', '13581536386', '2015.7', '美股-1号', '1.17', '500', '427', '0.41', '0', '0', '2759', '3228.03', '0.71', '228.74');

-- ----------------------------
-- Table structure for tiger_access_token
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tiger_access_token
-- ----------------------------
INSERT INTO `tiger_access_token` VALUES ('TIGER@AUTH#ACCESS#TOKEN', 'pSJOuKxdqFbizo45TeBm7MUMsYOLKT1TWNRZ49A9g567Y6tPiORFAPUssbtRF-IuxMbaRUGQIzOnFNNiTegd70UQuhwgFTIb44rRQaRQ6rs', '7200', null, null, null, null, null, '1443182281302');

-- ----------------------------
-- Table structure for tiger_naming
-- ----------------------------
DROP TABLE IF EXISTS `tiger_naming`;
CREATE TABLE `tiger_naming` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` varchar(50) DEFAULT NULL,
  `openid` varchar(50) DEFAULT NULL,
  `opt_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='认证表';

-- ----------------------------
-- Records of tiger_naming
-- ----------------------------
INSERT INTO `tiger_naming` VALUES ('1', '110111198706111000', 'ogX3NtwN2dAc8JIPdW5yUUCr_Ud0', '2015-08-21 14:00:19');

-- ----------------------------
-- Table structure for tiger_opt
-- ----------------------------
DROP TABLE IF EXISTS `tiger_opt`;
CREATE TABLE `tiger_opt` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `opt_name` varchar(100) DEFAULT NULL,
  `opt_code` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='操作信息表';

-- ----------------------------
-- Records of tiger_opt
-- ----------------------------

-- ----------------------------
-- Table structure for tiger_pay
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tiger_pay
-- ----------------------------

-- ----------------------------
-- Table structure for tiger_userinfo
-- ----------------------------
DROP TABLE IF EXISTS `tiger_userinfo`;
CREATE TABLE `tiger_userinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idcard` varchar(18) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `real_name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tiger_userinfo
-- ----------------------------
INSERT INTO `tiger_userinfo` VALUES ('1', '110111198706111000', '13581536386', '杨靖');

-- ----------------------------
-- Table structure for tiger_user_opt
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
-- Records of tiger_user_opt
-- ----------------------------

-- ----------------------------
-- Table structure for wx_news_info
-- ----------------------------
DROP TABLE IF EXISTS `wx_news_info`;
CREATE TABLE `wx_news_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `media_id` varchar(50) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `item_ids` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wx_news_info
-- ----------------------------

-- ----------------------------
-- Table structure for wx_news_item
-- ----------------------------
DROP TABLE IF EXISTS `wx_news_item`;
CREATE TABLE `wx_news_item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL COMMENT '图文消息的标题',
  `thumb_media_id` varchar(100) DEFAULT NULL COMMENT '图文消息的封面图片素材id（必须是永久mediaID）',
  `show_cover_pic` int(11) DEFAULT NULL COMMENT '是否显示封面，0为false，即不显示，1为true，即显示',
  `digest` varchar(100) DEFAULT NULL COMMENT '图文消息的摘要，仅有单图文消息才有摘要，多图文此处为空',
  `content` text,
  `url` varchar(255) DEFAULT NULL COMMENT '图文页的URL，或者，当获取的列表是图片素材列表时，该字段是图片的URL',
  `content_source_url` varchar(255) DEFAULT NULL COMMENT '图文消息的原文地址，即点击“阅读原文”后的URL',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='同步微信素材中的图文素材';

-- ----------------------------
-- Records of wx_news_item
-- ----------------------------

DROP TABLE IF EXISTS `wx_reply_resource`;
CREATE TABLE `wx_reply_resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `news_keyword` varchar(100) DEFAULT NULL,
  `media_id` varchar(50) DEFAULT NULL,
  `news_title` varchar(200) DEFAULT NULL,
  `news_des` varchar(500) DEFAULT NULL,
  `pic_url` varchar(500) DEFAULT NULL,
  `news_url` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;