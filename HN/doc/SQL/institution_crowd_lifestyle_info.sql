/*
Navicat MySQL Data Transfer

Source Server         : Self
Source Server Version : 50622
Source Host           : 119.90.131.199:3306
Source Database       : hn_ncz

Target Server Type    : MYSQL
Target Server Version : 50622
File Encoding         : 65001

Date: 2015-12-14 09:14:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for institution_crowd_lifestyle_info
-- ----------------------------
DROP TABLE IF EXISTS `institution_crowd_lifestyle_info`;
CREATE TABLE `institution_crowd_lifestyle_info` (
  `LifeStyleID` int(11) NOT NULL AUTO_INCREMENT COMMENT '生活方式ID',
  `CrowdID` int(11) DEFAULT NULL COMMENT '人群ID',
  `Smoke` varchar(20) DEFAULT NULL COMMENT '吸烟情况（ZN）',
  `SmokeYear` varchar(2) DEFAULT NULL COMMENT '年限',
  `SmokeDay` varchar(3) DEFAULT NULL COMMENT '每天支数',
  `Wine` varchar(20) DEFAULT NULL COMMENT '喝酒情况（ZO）',
  `WineYear` varchar(2) DEFAULT NULL COMMENT '年限',
  `Sports` varchar(20) DEFAULT NULL COMMENT '运动情况（ZP）',
  `SportsYear` varchar(2) DEFAULT NULL COMMENT '年限',
  `DietFlavor` varchar(20) DEFAULT NULL COMMENT '膳食习惯_口味（CodeID=ZQ  Code=01下的选项）',
  `DietFlavorYear` varchar(2) DEFAULT NULL COMMENT '年限',
  `DietMeatVegetables` varchar(20) DEFAULT NULL COMMENT '膳食习惯_荤素（CodeID=ZQ  Code=02下的选项）',
  `DietMeatVegetablesYear` varchar(2) DEFAULT NULL COMMENT '年限',
  `DietVegetables` varchar(20) DEFAULT NULL COMMENT '膳食习惯_吃蔬菜（CodeID=ZQ  Code=03下的选项）',
  `DietVegetablesYear` varchar(2) DEFAULT NULL COMMENT '年限',
  `DietFruits` varchar(20) DEFAULT NULL COMMENT '膳食习惯_吃水果（CodeID=ZQ  Code=04下的选项）',
  `DietFruitsYear` varchar(2) DEFAULT NULL COMMENT '年限',
  `DietMilk` varchar(20) DEFAULT NULL COMMENT '膳食习惯_牛奶或酸奶（CodeID=ZQ  Code=05下的选项）',
  `DietMilkYear` varchar(2) DEFAULT NULL COMMENT '年限',
  `Flag` varchar(10) DEFAULT NULL COMMENT '预留标示',
  PRIMARY KEY (`LifeStyleID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='机构人群生活方式表';
