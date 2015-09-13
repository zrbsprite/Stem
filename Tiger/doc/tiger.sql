/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50622
Source Host           : localhost:3306
Source Database       : tiger

Target Server Type    : MYSQL
Target Server Version : 50622
File Encoding         : 65001

Date: 2015-08-21 13:16:04
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
-- Table structure for tiger_naming
-- ----------------------------
DROP TABLE IF EXISTS `tiger_naming`;
CREATE TABLE `tiger_naming` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` varchar(50) DEFAULT NULL,
  `openid` varchar(50) DEFAULT NULL,
  `opt_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='认证表';

-- ----------------------------
-- Records of tiger_naming
-- ----------------------------

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
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `USER_TYPE_CODE` varchar(4) NOT NULL COMMENT '用户类型编码',
  `USER_NAME` varchar(30) NOT NULL COMMENT '用户名',
  `PASSWORD` varchar(50) NOT NULL COMMENT '密码',
  `MOBILE` varchar(11) NOT NULL COMMENT '手机',
  `NICK_NAME` varchar(100) DEFAULT NULL COMMENT '昵称',
  `HEAD_PORTRAIT` varchar(100) DEFAULT NULL COMMENT '头像地址',
  `INVITE_CODE` varchar(10) DEFAULT NULL COMMENT '邀请码',
  `LABLE_CODE` varchar(4) DEFAULT NULL COMMENT '所属标签',
  `INTO_GUIDE` char(1) DEFAULT NULL COMMENT '新手引导',
  `FUNCTION_GUIDE` char(1) DEFAULT NULL COMMENT '新功能引导',
  `WX_OPEN_ID` varchar(100) DEFAULT NULL COMMENT '微信open id',
  `WX_NICK` varchar(100) DEFAULT NULL COMMENT '微信昵称',
  `MEMBER_LEVEL_CODE` varchar(2) DEFAULT NULL COMMENT '会员等级编码',
  `PARENT_USER_NAME` varchar(30) DEFAULT NULL COMMENT '直接推荐人',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '生成时间',
  `DELETE_LABLE` char(1) DEFAULT NULL COMMENT '删除标示',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', 'zhangribo', '96E79218965EB72C92A549DD5A330112', '15133953627', 'stem', null, null, null, null, null, null, null, null, null, '2015-08-13 14:04:43', null);


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