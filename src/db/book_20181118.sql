/*
 Navicat Premium Data Transfer

 Source Server         : lycc
 Source Server Type    : MySQL
 Source Server Version : 50022
 Source Host           : localhost:3306
 Source Schema         : book

 Target Server Type    : MySQL
 Target Server Version : 50022
 File Encoding         : 65001

 Date: 18/11/2018 16:45:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for book_admin
-- ----------------------------
DROP TABLE IF EXISTS `book_admin`;
CREATE TABLE `book_admin`  (
  `bn_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '管理员编号',
  `bn_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '管理员名称',
  `bn_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '管理员密码',
  PRIMARY KEY USING BTREE (`bn_id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for book_attribute
-- ----------------------------
DROP TABLE IF EXISTS `book_attribute`;
CREATE TABLE `book_attribute`  (
  `ba_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '图书编号',
  `ba_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '图书名称',
  `ba_autor` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '图书作者',
  `bt_id` int(11) NOT NULL DEFAULT '' COMMENT '图书类型',
  `ba_stock` int(11) NULL DEFAULT NULL COMMENT '库存量',
  `ba_isbn` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图书书号\r\n',
  `ba_introduction` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图书简介',
  `ba_picture` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '图书图片',
  `ba_state` int(11) NOT NULL DEFAULT '' COMMENT '图书状态',
  `ba_price` double(10, 2) NULL DEFAULT NULL COMMENT '图书单价',
  `ba_mprice` double(10, 2) NULL DEFAULT NULL COMMENT '图书市场价',
  PRIMARY KEY USING BTREE (`ba_id`),
  INDEX `type_attribute` USING BTREE(`bt_id`),
  CONSTRAINT `type_attribute` FOREIGN KEY (`bt_id`) REFERENCES `book_type` (`bt_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'InnoDB free: 6144 kB; (`bt_id`) REFER `book/book_type`(`bt_id`)' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for book_cart
-- ----------------------------
DROP TABLE IF EXISTS `book_cart`;
CREATE TABLE `book_cart`  (
  `br_id` int(11) NOT NULL AUTO_INCREMENT,
  `bo_id` int(11) NOT NULL DEFAULT '' COMMENT '订单号',
  `ba_id` int(11) NOT NULL DEFAULT '' COMMENT '图书编号',
  `br_num` int(11) NULL DEFAULT NULL COMMENT '订购数量',
  `br_prices` double(11, 0) NULL DEFAULT NULL COMMENT '总价格',
  PRIMARY KEY USING BTREE (`br_id`),
  INDEX `order_cart` USING BTREE(`bo_id`),
  INDEX `attribute_attribute` USING BTREE(`ba_id`),
  CONSTRAINT `attribute_attribute` FOREIGN KEY (`ba_id`) REFERENCES `book_attribute` (`ba_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `order_cart` FOREIGN KEY (`bo_id`) REFERENCES `book_order` (`bo_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'InnoDB free: 6144 kB; (`ba_id`) REFER `book/book_attribute`(`ba_id`); (`bo_id`) ' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for book_comment
-- ----------------------------
DROP TABLE IF EXISTS `book_comment`;
CREATE TABLE `book_comment`  (
  `bm_id` int(11) NOT NULL AUTO_INCREMENT,
  `ba_id` int(11) NOT NULL DEFAULT '',
  `bc_id` int(11) NOT NULL DEFAULT '' COMMENT '用户编号',
  `bc_nickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户昵称',
  `bm_time` datetime NULL DEFAULT NULL COMMENT '评价时间',
  `bm_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评价内容',
  PRIMARY KEY USING BTREE (`bm_id`),
  INDEX `attribute_comment` USING BTREE(`ba_id`),
  INDEX `consumer_comment` USING BTREE(`bc_id`),
  CONSTRAINT `attribute_comment` FOREIGN KEY (`ba_id`) REFERENCES `book_attribute` (`ba_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `consumer_comment` FOREIGN KEY (`bc_id`) REFERENCES `book_consumer` (`bc_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'InnoDB free: 6144 kB; (`ba_id`) REFER `book/book_attribute`(`ba_id`); (`bc_id`) ' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for book_consumer
-- ----------------------------
DROP TABLE IF EXISTS `book_consumer`;
CREATE TABLE `book_consumer`  (
  `bc_id` int(11) NOT NULL DEFAULT '' COMMENT '用户编号',
  `bc_nickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户昵称',
  `bc_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户密码',
  `bc_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '真实姓名',
  `bc_sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '性别',
  `bc_telphone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '联系方式',
  `bc_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户地址',
  `bc_state` int(11) NOT NULL DEFAULT '' COMMENT '用户状态',
  PRIMARY KEY USING BTREE (`bc_id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for book_order
-- ----------------------------
DROP TABLE IF EXISTS `book_order`;
CREATE TABLE `book_order`  (
  `bo_id` int(11) NOT NULL AUTO_INCREMENT,
  `bc_id` int(11) NOT NULL DEFAULT '' COMMENT '用户编号',
  `bo_time` datetime NOT NULL DEFAULT '' COMMENT '下单时间',
  `bo_pay` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支付方式',
  `bo_rename` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收货人姓名',
  `bo_readdr` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收货人地址',
  `bo_retel` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收货人联系方式',
  `bo_price` double(30, 3) NULL DEFAULT NULL COMMENT '总价格',
  `bo_memo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY USING BTREE (`bo_id`),
  INDEX `consumer_order` USING BTREE(`bc_id`),
  CONSTRAINT `consumer_order` FOREIGN KEY (`bc_id`) REFERENCES `book_consumer` (`bc_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'InnoDB free: 6144 kB; (`bc_id`) REFER `book/book_consumer`(`bc_id`)' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for book_type
-- ----------------------------
DROP TABLE IF EXISTS `book_type`;
CREATE TABLE `book_type`  (
  `bt_id` int(11) NOT NULL AUTO_INCREMENT,
  `bt_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  PRIMARY KEY USING BTREE (`bt_id`)
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of book_type
-- ----------------------------
INSERT INTO `book_type` VALUES (1, '言情小说');
INSERT INTO `book_type` VALUES (2, '军事小说');

SET FOREIGN_KEY_CHECKS = 1;
