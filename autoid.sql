/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50610
Source Host           : localhost:3306
Source Database       : autoid

Target Server Type    : MYSQL
Target Server Version : 50610
File Encoding         : 65001

Date: 2013-05-10 10:13:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `account`
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `birthday` date DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`,`username`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1', '08580101', '090909', '2013-05-08', 'wang@outlook.com');
INSERT INTO `account` VALUES ('3', 'XYZ', 'xyw', '2013-04-18', 'o@outlook.com');
INSERT INTO `account` VALUES ('4', 'XYZ', 'xyw', '2013-04-18', 'o@outlook.com');
INSERT INTO `account` VALUES ('5', 'XYZ', 'xyw', '2013-04-18', 'o@outlook.com');
INSERT INTO `account` VALUES ('6', 'XYZ', 'xyw', '2013-04-18', 'o@outlook.com');

-- ----------------------------
-- Table structure for `dao_jian`
-- ----------------------------
DROP TABLE IF EXISTS `dao_jian`;
CREATE TABLE `dao_jian` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL,
  `format` varchar(255) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dao_jian
-- ----------------------------

-- ----------------------------
-- Table structure for `detail`
-- ----------------------------
DROP TABLE IF EXISTS `detail`;
CREATE TABLE `detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `detail_name` varchar(255) DEFAULT NULL,
  `detail_number` varchar(255) DEFAULT NULL,
  `fu_ze_ren` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `pai_song_fan_wei` text,
  `bu_pai_song_fan_wei` text,
  `grade_3_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `detail_name` (`detail_name`),
  KEY `grade_3_id` (`grade_3_id`),
  CONSTRAINT `detail_ibfk_1` FOREIGN KEY (`detail_name`) REFERENCES `grade_3` (`grade_3_name`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `detail_ibfk_2` FOREIGN KEY (`grade_3_id`) REFERENCES `grade_3` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of detail
-- ----------------------------
INSERT INTO `detail` VALUES ('1', '南京机场分部', '210079', '熊文', '025-52390425', '全境', null, '2');
INSERT INTO `detail` VALUES ('2', '其林分部', '212121', '熊大', '025-25251212', '全境', null, '1');
INSERT INTO `detail` VALUES ('3', '南京栖霞二部', '452515', '熊二', '025-47854587', '全境', null, '4');
INSERT INTO `detail` VALUES ('4', '六安裕安一部', '100101', '熊猫', '0564-2271511', '徐集、金寨、罗集、丁集、叶集、姚李、舒城', '除派送范围外都不派送', '13');
INSERT INTO `detail` VALUES ('5', '六安徐集一部', '145212', '熊四', '0564-2241158', '徐集全境', null, '15');

-- ----------------------------
-- Table structure for `fa_jian`
-- ----------------------------
DROP TABLE IF EXISTS `fa_jian`;
CREATE TABLE `fa_jian` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL,
  `format` varchar(255) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fa_jian
-- ----------------------------

-- ----------------------------
-- Table structure for `grade_1`
-- ----------------------------
DROP TABLE IF EXISTS `grade_1`;
CREATE TABLE `grade_1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `grade_1_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of grade_1
-- ----------------------------
INSERT INTO `grade_1` VALUES ('1', '安徽');
INSERT INTO `grade_1` VALUES ('2', '江苏');
INSERT INTO `grade_1` VALUES ('3', '浙江');
INSERT INTO `grade_1` VALUES ('4', '湖北');
INSERT INTO `grade_1` VALUES ('5', '湖南');
INSERT INTO `grade_1` VALUES ('6', '北京');
INSERT INTO `grade_1` VALUES ('7', '天津');
INSERT INTO `grade_1` VALUES ('8', '上海');

-- ----------------------------
-- Table structure for `grade_2`
-- ----------------------------
DROP TABLE IF EXISTS `grade_2`;
CREATE TABLE `grade_2` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `grade_2_name` varchar(255) DEFAULT NULL,
  `grade_1_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `grade_1_id` (`grade_1_id`),
  CONSTRAINT `grade_2_ibfk_1` FOREIGN KEY (`grade_1_id`) REFERENCES `grade_1` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of grade_2
-- ----------------------------
INSERT INTO `grade_2` VALUES ('1', '合肥', '1');
INSERT INTO `grade_2` VALUES ('2', '安庆', '1');
INSERT INTO `grade_2` VALUES ('3', '南京', '2');
INSERT INTO `grade_2` VALUES ('4', '徐州', '2');
INSERT INTO `grade_2` VALUES ('5', '杭州', '3');
INSERT INTO `grade_2` VALUES ('6', '六安', '1');
INSERT INTO `grade_2` VALUES ('7', '滁州', '1');
INSERT INTO `grade_2` VALUES ('8', '池州', '1');
INSERT INTO `grade_2` VALUES ('9', '铜陵', '1');
INSERT INTO `grade_2` VALUES ('10', '亳州', '1');
INSERT INTO `grade_2` VALUES ('11', '黄山', '1');
INSERT INTO `grade_2` VALUES ('12', '苏州', '2');
INSERT INTO `grade_2` VALUES ('13', '扬州', '2');
INSERT INTO `grade_2` VALUES ('14', '无锡', '2');
INSERT INTO `grade_2` VALUES ('15', '常州', '2');
INSERT INTO `grade_2` VALUES ('16', '南通', '2');
INSERT INTO `grade_2` VALUES ('17', '盐城', '2');
INSERT INTO `grade_2` VALUES ('18', '宁波', '3');
INSERT INTO `grade_2` VALUES ('19', '温州', '3');
INSERT INTO `grade_2` VALUES ('20', '台州', '3');
INSERT INTO `grade_2` VALUES ('21', '金华', '3');
INSERT INTO `grade_2` VALUES ('22', '绍兴', '3');

-- ----------------------------
-- Table structure for `grade_3`
-- ----------------------------
DROP TABLE IF EXISTS `grade_3`;
CREATE TABLE `grade_3` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `grade_3_name` varchar(255) DEFAULT NULL,
  `grade_2_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `grade_2_id` (`grade_2_id`),
  KEY `grade_3_name` (`grade_3_name`),
  CONSTRAINT `grade_3_ibfk_1` FOREIGN KEY (`grade_2_id`) REFERENCES `grade_2` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of grade_3
-- ----------------------------
INSERT INTO `grade_3` VALUES ('1', '其林分部', '3');
INSERT INTO `grade_3` VALUES ('2', '南京机场分部', '3');
INSERT INTO `grade_3` VALUES ('3', '南京栖霞一部', '3');
INSERT INTO `grade_3` VALUES ('4', '南京栖霞二部', '3');
INSERT INTO `grade_3` VALUES ('5', '南京栖霞三部', '3');
INSERT INTO `grade_3` VALUES ('6', '南京栖霞郊区', '3');
INSERT INTO `grade_3` VALUES ('7', '南京栖霞郊区四部', '3');
INSERT INTO `grade_3` VALUES ('8', '合肥瑶海一部', '1');
INSERT INTO `grade_3` VALUES ('9', '合肥瑶海二部', '1');
INSERT INTO `grade_3` VALUES ('10', '合肥瑶海三部', '1');
INSERT INTO `grade_3` VALUES ('11', '合肥蜀山一部', '1');
INSERT INTO `grade_3` VALUES ('12', ' 合肥蜀山郊区分部', '1');
INSERT INTO `grade_3` VALUES ('13', '六安裕安一部', '6');
INSERT INTO `grade_3` VALUES ('14', '六安裕安二部', '6');
INSERT INTO `grade_3` VALUES ('15', '六安徐集一部', '6');
INSERT INTO `grade_3` VALUES ('16', '六安金寨郊区分部', '6');

-- ----------------------------
-- Table structure for `pai_jian`
-- ----------------------------
DROP TABLE IF EXISTS `pai_jian`;
CREATE TABLE `pai_jian` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL,
  `format` varchar(255) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pai_jian
-- ----------------------------

-- ----------------------------
-- Table structure for `salesman`
-- ----------------------------
DROP TABLE IF EXISTS `salesman`;
CREATE TABLE `salesman` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `salesman_id` varchar(255) DEFAULT NULL,
  `salesman_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `salesman_id` (`salesman_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of salesman
-- ----------------------------

-- ----------------------------
-- Table structure for `shou_jian`
-- ----------------------------
DROP TABLE IF EXISTS `shou_jian`;
CREATE TABLE `shou_jian` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL,
  `format` varchar(255) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `salesman_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `shou_jian_ibfk_1` (`salesman_id`),
  CONSTRAINT `shou_jian_ibfk_1` FOREIGN KEY (`salesman_id`) REFERENCES `salesman` (`salesman_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shou_jian
-- ----------------------------
