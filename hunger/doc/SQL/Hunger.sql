/*
Navicat MySQL Data Transfer

Source Server         : Localhost
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : stem

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2015-08-03 21:12:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `memberlevel`
-- ----------------------------
DROP TABLE IF EXISTS `memberlevel`;
CREATE TABLE `memberlevel` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '会员等级id',
  `CODE` char(2) NOT NULL COMMENT '会员等级编码',
  `NAME` varchar(50) DEFAULT NULL COMMENT '会员名称',
  `INVITATION_SUM` smallint(6) DEFAULT NULL COMMENT '邀请人数',
  `BUY_DISCOUNT` varchar(10) DEFAULT NULL COMMENT '购买折扣',
  `BUY_INTEGRAL` varchar(10) DEFAULT NULL COMMENT '购买返积分',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='会员等级表\r\n';

-- ----------------------------
-- Records of memberlevel
-- ----------------------------
INSERT INTO `memberlevel` VALUES ('1', '01', '普通会员', '0', '0.99', '0.01');
INSERT INTO `memberlevel` VALUES ('2', '02', '白银会员', '1', '0.98', '0.01');
INSERT INTO `memberlevel` VALUES ('3', '03', '黄金会员', '2', '0.97', '0.01');
INSERT INTO `memberlevel` VALUES ('4', '04', '白金会员', '4', '0.96', '0.01');
INSERT INTO `memberlevel` VALUES ('5', '05', '铂金会员', '7', '0.95', '0.01');
INSERT INTO `memberlevel` VALUES ('6', '06', '至尊会员', '11', '0.94', '0.01');

-- ----------------------------
-- Table structure for `messagevalidate`
-- ----------------------------
DROP TABLE IF EXISTS `messagevalidate`;
CREATE TABLE `messagevalidate` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '验证码id',
  `MOBILE` char(11) NOT NULL COMMENT '手机号',
  `VALIDATE` varchar(6) NOT NULL COMMENT '验证码',
  `CREATE_TIME` datetime NOT NULL COMMENT '生成时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='短信验证码表\r\n';

-- ----------------------------
-- Records of messagevalidate
-- ----------------------------

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '产品id',
  `CODE` varchar(30) NOT NULL COMMENT '产品编码',
  `NAME` varchar(100) NOT NULL COMMENT '产品名称',
  `TITLE` varchar(100) DEFAULT NULL COMMENT '展示标题',
  `PIC` varchar(100) DEFAULT NULL COMMENT '图片路径',
  `CONTENT` text COMMENT '展示内容',
  `BUY_URL` varchar(100) DEFAULT NULL COMMENT '购买地址',
  `UP_DOWN` char(1) DEFAULT '1' COMMENT '产品上下架-默认为0下架，1为上架',
  `SHARE_URL` varchar(100) DEFAULT NULL COMMENT '分享案例地址',
  `TRENDS_URL` varchar(100) DEFAULT NULL COMMENT '动态地址',
  `SCORE_STANDARD` varchar(8) DEFAULT NULL COMMENT '总让利标准NUMERIC(1,6)',
  `MARKET_PRICE` varchar(13) DEFAULT NULL COMMENT '市场价',
  `SALE_PRICE` varchar(13) DEFAULT NULL COMMENT '销售价',
  `UNIT` varchar(10) DEFAULT NULL COMMENT '单位，份/盒/斤/公斤',
  `PRODUCT_LABLE` char(1) DEFAULT NULL COMMENT '产品标签-默认0自营、1分销、2分销商自家产品',
  `SUPPLIER_CODE` varchar(30) DEFAULT NULL COMMENT '供应商编码',
  `PRODUCT_TYPE_CODE` varchar(10) DEFAULT NULL COMMENT '产品分类编码-按一般分类（水果类、蔬菜类等),一般一种产品只属于一个一般分类',
  `CREATE_TIME` datetime NOT NULL COMMENT '生成时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='产品表';

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '201507261156309', '苹果', '红富士苹果', '584449774D5456634D4464634D6A5A634D54517A4E7A67344D5441794E6A63774D4330314C6D70775A773D3D', null, '', '1', '', '', '', '10.5', '9.9', '斤', '', '', '', '2015-07-26 11:57:38');
INSERT INTO `product` VALUES ('2', '201507261156306', '桔子', '淮南桔子', '584449774D5456634D4464634D6A5A634D54517A4E7A67344D5441794E6A63774D4330314C6D70775A773D3D', null, null, '1', null, null, null, '12.5', '11.5', '斤', null, null, null, '2015-07-26 12:00:03');
INSERT INTO `product` VALUES ('3', '201507261200238', '香蕉', '海南香蕉', '584449774D5456634D4464634D6A5A634D54517A4E7A67344D5441794E6A63774D4330314C6D70775A773D3D', null, null, '1', null, null, null, '15.9', '14.9', '斤', null, null, null, '2015-07-26 12:01:06');

-- ----------------------------
-- Table structure for `productactivity`
-- ----------------------------
DROP TABLE IF EXISTS `productactivity`;
CREATE TABLE `productactivity` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '产品活动id',
  `CODE` varchar(30) NOT NULL COMMENT '产品活动编码',
  `NAME` varchar(100) NOT NULL COMMENT '产品活动名称',
  `TITLE` varchar(100) DEFAULT NULL COMMENT '展示标题',
  `PIC` varchar(100) DEFAULT NULL COMMENT '滚动图片',
  `CONTENT` text COMMENT '展示内容',
  `SHOW_URL` varchar(100) DEFAULT NULL COMMENT '显示地址',
  `PRODUCT_C_CODE` varchar(30) DEFAULT NULL COMMENT '关联产品编码',
  `ACTIVITY_PRICE` varchar(10) DEFAULT NULL COMMENT '活动价',
  `UNIT` varchar(10) DEFAULT NULL COMMENT '单位,份/盒/斤/公斤',
  `START_DATE` datetime DEFAULT NULL COMMENT '活动开始时间',
  `END_DATE` datetime DEFAULT NULL COMMENT '活动结束时间',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '生成时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品活动表';

-- ----------------------------
-- Records of productactivity
-- ----------------------------

-- ----------------------------
-- Table structure for `productype`
-- ----------------------------
DROP TABLE IF EXISTS `productype`;
CREATE TABLE `productype` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '产品分类id',
  `CODE` varchar(10) DEFAULT NULL COMMENT '产品分类编码',
  `NAME` varchar(100) DEFAULT NULL COMMENT '产品分类名称',
  `TYPE` char(1) DEFAULT '0' COMMENT '类型,默认为0：一般分类；1：为自定义分类',
  `LABLE` char(1) DEFAULT '0' COMMENT '标签,默认为0：馋吧产品类型；1：赚吧产品类型；2：花吧产品类型',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品分类表';

-- ----------------------------
-- Records of productype
-- ----------------------------

-- ----------------------------
-- Table structure for `product_lable_relation`
-- ----------------------------
DROP TABLE IF EXISTS `product_lable_relation`;
CREATE TABLE `product_lable_relation` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '对应关系id',
  `LABLE_CODE` varchar(4) NOT NULL COMMENT '标签编码',
  `PRODUCT_C_CODE` varchar(30) NOT NULL COMMENT '产品编码',
  `SEQUENCE` int(11) NOT NULL DEFAULT '0' COMMENT '显示顺序',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='标签产品对应表\r\n';

-- ----------------------------
-- Records of product_lable_relation
-- ----------------------------

-- ----------------------------
-- Table structure for `product_type_relation`
-- ----------------------------
DROP TABLE IF EXISTS `product_type_relation`;
CREATE TABLE `product_type_relation` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '对应关系id',
  `PRODUCT_TYPE_CODE` varchar(4) NOT NULL COMMENT '产品类型编码',
  `PRODUCT_C_CODE` varchar(30) NOT NULL COMMENT '产品编码',
  `SEQUENCE` int(11) NOT NULL DEFAULT '0' COMMENT '显示顺序',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='类型产品对应表';

-- ----------------------------
-- Records of product_type_relation
-- ----------------------------

-- ----------------------------
-- Table structure for `sixdegreesspace`
-- ----------------------------
DROP TABLE IF EXISTS `sixdegreesspace`;
CREATE TABLE `sixdegreesspace` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '六度空间id',
  `CODE` varchar(4) NOT NULL COMMENT '六度空间编码',
  `NAME` varchar(50) NOT NULL COMMENT '六度空间名称',
  `BUY_INTEGRAL` varchar(10) DEFAULT NULL COMMENT '购买返积分',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='六度空间表\r\n';

-- ----------------------------
-- Records of sixdegreesspace
-- ----------------------------
INSERT INTO `sixdegreesspace` VALUES ('1', 'YDKJ', '一度空间', '0.001');
INSERT INTO `sixdegreesspace` VALUES ('2', 'EDKJ', '二度空间', '0.0001');
INSERT INTO `sixdegreesspace` VALUES ('3', 'SDKJ', '三度空间', '0.00001');
INSERT INTO `sixdegreesspace` VALUES ('4', 'SDKJ', '四度空间', '0.000001');
INSERT INTO `sixdegreesspace` VALUES ('5', 'WDKJ', '五度空间', '0.0000001');
INSERT INTO `sixdegreesspace` VALUES ('6', 'LDKJ', '六度空间', '0.00000001');

-- ----------------------------
-- Table structure for `user`
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT=' 用户表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', 'zhangribo', '96E79218965EB72C92A549DD5A330112', '15133953627', 'stem', null, null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `userapprove`
-- ----------------------------
DROP TABLE IF EXISTS `userapprove`;
CREATE TABLE `userapprove` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户认证id',
  `USER_NAME` varchar(30) DEFAULT NULL COMMENT '用户名',
  `NAME` varchar(50) DEFAULT NULL COMMENT ' 姓名',
  `EMAIL` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `SEX` char(1) DEFAULT NULL COMMENT '性别 0女；1男',
  `ID_CARD` varchar(18) DEFAULT NULL COMMENT '身份证',
  `PARTNER_NAME` varchar(50) DEFAULT NULL COMMENT '合作店店主',
  `PARTNER_TEL` varchar(50) DEFAULT NULL COMMENT '合作店电话',
  `PARTNER_ADDRESS` varchar(100) DEFAULT NULL COMMENT '合作店地址',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '生成时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户认证表';

-- ----------------------------
-- Records of userapprove
-- ----------------------------
