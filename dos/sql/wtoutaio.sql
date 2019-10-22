/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80013
 Source Host           : localhost:3306
 Source Schema         : wtoutaio

 Target Server Type    : MySQL
 Target Server Version : 80013
 File Encoding         : 65001

 Date: 21/10/2019 15:50:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for new_info
-- ----------------------------
DROP TABLE IF EXISTS `new_info`;
CREATE TABLE `new_info`  (
  `news_info_id` bigint(20) NULL DEFAULT NULL,
  `title` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `content` varchar(2000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `abstract` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `source` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `news_type_id` bigint(20) NULL DEFAULT NULL,
  `image1` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `image2` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `image3` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `keyword` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `create_time` datetime(0) NOT NULL,
  `create_by` bigint(20) NOT NULL,
  `modify_time` datetime(0) NOT NULL,
  `modify_by` bigint(20) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for news_comment
-- ----------------------------
DROP TABLE IF EXISTS `news_comment`;
CREATE TABLE `news_comment`  (
  `news_comment_id` bigint(20) NULL DEFAULT NULL,
  `user_id` bigint(20) NULL DEFAULT NULL,
  `comment` varchar(2000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `favor` tinyint(5) NULL DEFAULT NULL,
  `create_time` datetime(0) NOT NULL,
  `create_by` bigint(20) NOT NULL,
  `modify_time` datetime(0) NOT NULL,
  `modify_by` bigint(20) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for news_rel_tag
-- ----------------------------
DROP TABLE IF EXISTS `news_rel_tag`;
CREATE TABLE `news_rel_tag`  (
  `news_rel_tag_id` bigint(20) NOT NULL,
  `news_tag_id` bigint(20) NULL DEFAULT NULL,
  `news_info_id` bigint(20) NULL DEFAULT NULL,
  `create_time` datetime(0) NOT NULL,
  `create_by` bigint(20) NOT NULL,
  `modify_time` datetime(0) NOT NULL,
  `modify_by` bigint(20) NOT NULL,
  PRIMARY KEY (`news_rel_tag_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for news_tag
-- ----------------------------
DROP TABLE IF EXISTS `news_tag`;
CREATE TABLE `news_tag`  (
  `news_tag_id` bigint(20) NOT NULL,
  `news_tag_name` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `create_time` datetime(0) NOT NULL,
  `create_by` bigint(20) NOT NULL,
  `modify_time` datetime(0) NOT NULL,
  `modify_by` bigint(20) NOT NULL,
  PRIMARY KEY (`news_tag_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for news_type
-- ----------------------------
DROP TABLE IF EXISTS `news_type`;
CREATE TABLE `news_type`  (
  `news_type_id` bigint(20) NULL DEFAULT NULL,
  `news_type_name` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `create_time` datetime(0) NOT NULL,
  `create_by` bigint(20) NOT NULL,
  `modify_time` datetime(0) NOT NULL,
  `modify_by` bigint(20) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`  (
  `sys_role_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `password` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `sex` int(2) NULL DEFAULT NULL,
  `photo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `mobile` int(14) NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `create_by` bigint(20) NULL DEFAULT NULL,
  `modify_time` datetime(0) NULL DEFAULT NULL,
  `modify_by` bigint(20) NULL DEFAULT NULL,
  PRIMARY KEY (`sys_role_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES (2, 'admin', '111111', 0, '2001', 123, '2019-10-30 16:09:33', 1, '2019-10-17 16:09:38', 1);
INSERT INTO `sys_role` VALUES (3, 'test', '123456', 1, '123456', 123456, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for user_behavior
-- ----------------------------
DROP TABLE IF EXISTS `user_behavior`;
CREATE TABLE `user_behavior`  (
  `user_behavior_id` bigint(20) NULL DEFAULT NULL,
  `create_time` datetime(0) NOT NULL,
  `create_by` bigint(20) NOT NULL,
  `modify_time` datetime(0) NOT NULL,
  `modify_by` bigint(20) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`  (
  `user_id` bigint(20) NOT NULL,
  `user_name` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `user_password` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `salt` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `user_type` tinyint(2) NOT NULL,
  `mobile` bigint(13) NOT NULL,
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `nick_name` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `sex` tinyint(2) NOT NULL,
  `avatar` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `birthday` date NOT NULL,
  `signature` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `create_time` datetime(0) NOT NULL,
  `create_by` bigint(20) NOT NULL,
  `modify_time` datetime(0) NOT NULL,
  `modify_by` bigint(20) NOT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_operate
-- ----------------------------
DROP TABLE IF EXISTS `user_operate`;
CREATE TABLE `user_operate`  (
  `user_operate_id` bigint(20) NOT NULL,
  `news_id` bigint(20) NOT NULL,
  `time` date NOT NULL,
  `is_comment` tinyint(2) NOT NULL,
  `comment_num` tinyint(6) NOT NULL,
  `is_favor` tinyint(2) NOT NULL,
  `create_time` datetime(0) NOT NULL,
  `create_by` bigint(20) NOT NULL,
  `modify_time` datetime(0) NOT NULL,
  `modify_by` bigint(20) NOT NULL,
  PRIMARY KEY (`user_operate_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_rel_tag
-- ----------------------------
DROP TABLE IF EXISTS `user_rel_tag`;
CREATE TABLE `user_rel_tag`  (
  `user_rel_tag_id` bigint(20) NULL DEFAULT NULL,
  `user_id` bigint(20) NULL DEFAULT NULL,
  `user_tag_id` bigint(20) NULL DEFAULT NULL,
  `create_time` datetime(0) NOT NULL,
  `create_by` bigint(20) NOT NULL,
  `modify_time` datetime(0) NOT NULL,
  `modify_by` bigint(20) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_tag
-- ----------------------------
DROP TABLE IF EXISTS `user_tag`;
CREATE TABLE `user_tag`  (
  `user_tag_id` bigint(20) NOT NULL,
  `user_tag_name` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `create_time` datetime(0) NOT NULL,
  `create_by` bigint(20) NOT NULL,
  `modify_time` datetime(0) NOT NULL,
  `modify_by` bigint(20) NOT NULL,
  PRIMARY KEY (`user_tag_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
