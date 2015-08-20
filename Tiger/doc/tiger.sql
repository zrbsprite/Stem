/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50622
Source Host           : localhost:3306
Source Database       : tigger

Target Server Type    : MYSQL
Target Server Version : 50622
File Encoding         : 65001

Date: 2015-08-13 14:30:37
*/

SET FOREIGN_KEY_CHECKS=0;

create database tigger;
use tigger;

-- ----------------------------
-- Table structure for tigger_naming
-- ----------------------------
DROP TABLE IF EXISTS `tigger_naming`;
CREATE TABLE `tigger_naming` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` varchar(50) DEFAULT NULL,
  `openid` varchar(50) DEFAULT NULL,
  `opt_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='认证表';

-- ----------------------------
-- Records of tigger_naming
-- ----------------------------

-- ----------------------------
-- Table structure for tigger_opt
-- ----------------------------
DROP TABLE IF EXISTS `tigger_opt`;
CREATE TABLE `tigger_opt` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `opt_name` varchar(100) DEFAULT NULL,
  `opt_code` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='操作信息表';

-- ----------------------------
-- Records of tigger_opt
-- ----------------------------

-- ----------------------------
-- Table structure for tigger_user_opt
-- ----------------------------
DROP TABLE IF EXISTS `tigger_user_opt`;
CREATE TABLE `tigger_user_opt` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `openid` varchar(100) DEFAULT NULL COMMENT '用户openid',
  `opt_code` varchar(20) DEFAULT NULL COMMENT '用户操作模块儿代码',
  `opt_time` datetime DEFAULT NULL COMMENT '操作时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户操作记录表';

-- ----------------------------
-- Records of tigger_user_opt
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
