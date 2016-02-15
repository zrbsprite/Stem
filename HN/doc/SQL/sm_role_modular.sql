/*
Navicat MySQL Data Transfer

Source Server         : Localhost
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : hn_ncz

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2016-01-17 09:46:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sm_role_modular
-- ----------------------------
DROP TABLE IF EXISTS `sm_role_modular`;
CREATE TABLE `sm_role_modular` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色功能模块ID',
  `role_id` int(11) DEFAULT NULL COMMENT '角色ID',
  `modular_id` int(11) DEFAULT NULL COMMENT '功能模块ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色功能权限表';
