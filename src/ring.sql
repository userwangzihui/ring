/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.25 : Database - ring
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ring` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ring`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '管理员编号',
  `admin_name` varchar(255) NOT NULL COMMENT '管理员账号',
  `admin_pwd` varchar(255) NOT NULL COMMENT '管理员密码',
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin` */

/*Table structure for table `cart` */

DROP TABLE IF EXISTS `cart`;

CREATE TABLE `cart` (
  `cart_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '购物车编号',
  `user_id` int(11) NOT NULL COMMENT '用户编号',
  `item_id` int(11) NOT NULL COMMENT '商品编号',
  `item_number` int(11) NOT NULL DEFAULT '1' COMMENT '商品数量',
  `cart_item_name` varchar(255) NOT NULL COMMENT '商品名称',
  `cart_item_material` varchar(255) NOT NULL COMMENT '商品材质',
  `cart_item_size` varchar(20) NOT NULL COMMENT '商品尺寸',
  `cart_item_number` int(11) NOT NULL COMMENT '商品数量',
  `cart_item_price` double NOT NULL COMMENT '商品总价',
  PRIMARY KEY (`cart_id`),
  KEY `user_id` (`user_id`),
  KEY `item_id` (`item_id`),
  CONSTRAINT `cart_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `cart_ibfk_2` FOREIGN KEY (`item_id`) REFERENCES `item` (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cart` */

/*Table structure for table `count_order` */

DROP TABLE IF EXISTS `count_order`;

CREATE TABLE `count_order` (
  `count_id` int(11) NOT NULL COMMENT '总订单号',
  `count_userid` int(11) NOT NULL COMMENT '订单用户编号',
  `count_remarks` varchar(255) DEFAULT NULL COMMENT '订单备注',
  `count_createtime` datetime NOT NULL COMMENT '订单生成时间',
  `count_method` varchar(255) DEFAULT NULL COMMENT '订单物流',
  `count_money` double NOT NULL DEFAULT '0' COMMENT '订单总金额',
  `count_sat` varchar(255) NOT NULL DEFAULT '"未处理"' COMMENT '订单状态',
  `count_username` varchar(255) NOT NULL COMMENT '订单用户昵称',
  `count_phone` varchar(255) NOT NULL COMMENT '订单联系号码',
  `count_address` varchar(255) NOT NULL COMMENT '订单送货地址',
  PRIMARY KEY (`count_id`),
  KEY `count_userid` (`count_userid`),
  CONSTRAINT `count_order_ibfk_1` FOREIGN KEY (`count_userid`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `count_order` */

/*Table structure for table `evaluate` */

DROP TABLE IF EXISTS `evaluate`;

CREATE TABLE `evaluate` (
  `eval_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '留言编号',
  `eval_user_id` int(11) NOT NULL COMMENT '用户编号',
  `eval_item_id` int(11) NOT NULL COMMENT '商品编号',
  `eval_item_name` varchar(255) NOT NULL COMMENT '用户名',
  `eval_create_time` datetime NOT NULL COMMENT '评价时间',
  `eval_info` text NOT NULL COMMENT '用户评价',
  PRIMARY KEY (`eval_id`),
  KEY `eval_user_id` (`eval_user_id`),
  KEY `eval_item_id` (`eval_item_id`),
  CONSTRAINT `evaluate_ibfk_1` FOREIGN KEY (`eval_user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `evaluate_ibfk_2` FOREIGN KEY (`eval_item_id`) REFERENCES `item` (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `evaluate` */

/*Table structure for table `item` */

DROP TABLE IF EXISTS `item`;

CREATE TABLE `item` (
  `item_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品编号',
  `item_name` varchar(255) NOT NULL COMMENT '商品名称',
  `item_series` varchar(255) NOT NULL COMMENT '商品系列',
  `item_type` varchar(255) NOT NULL COMMENT '商品类型',
  `item_height` varchar(255) NOT NULL COMMENT '商品重量',
  `item_size` varchar(255) NOT NULL COMMENT '商品手寸',
  `item_number` int(11) NOT NULL DEFAULT '0' COMMENT '商品数量',
  `item_price` double NOT NULL COMMENT '商品价格',
  `item_img1` varchar(255) DEFAULT NULL COMMENT '商品展示图片1',
  `item_img2` varchar(255) DEFAULT NULL COMMENT '商品展示图片4',
  `item_img3` varchar(255) DEFAULT NULL COMMENT '商品展示图片3',
  `item_img4` varchar(255) DEFAULT NULL COMMENT '商品展示图片1',
  `itme_info` varchar(255) DEFAULT NULL COMMENT '商品简介',
  `itme_buynumber` int(11) NOT NULL DEFAULT '0' COMMENT '商品成交量',
  `itme_eval` int(11) NOT NULL DEFAULT '0' COMMENT '商品评论数量',
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `item` */

insert  into `item`(`item_id`,`item_name`,`item_series`,`item_type`,`item_height`,`item_size`,`item_number`,`item_price`,`item_img1`,`item_img2`,`item_img3`,`item_img4`,`itme_info`,`itme_buynumber`,`itme_eval`) values (1,'aa','a','s','d','f',0,30,'ggr','grg','hh','hhs','e33f',0,0);

/*Table structure for table `order` */

DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
  `order_id` int(11) NOT NULL COMMENT '订单号',
  `order_item_id` int(11) NOT NULL COMMENT '订单商品编号',
  `order_number` int(11) NOT NULL DEFAULT '1' COMMENT '订单商品数量',
  `order_money` double NOT NULL DEFAULT '0' COMMENT '订单金额',
  `order_count_id` int(11) DEFAULT NULL COMMENT '总订单号',
  `order_itemname` varchar(100) NOT NULL COMMENT '订单商品名称',
  `order_item_type` varchar(100) DEFAULT NULL COMMENT '订单商品类别',
  PRIMARY KEY (`order_id`),
  KEY `order_item_id` (`order_item_id`),
  KEY `order_count_id` (`order_count_id`),
  CONSTRAINT `order_ibfk_1` FOREIGN KEY (`order_item_id`) REFERENCES `item` (`item_id`),
  CONSTRAINT `order_ibfk_2` FOREIGN KEY (`order_count_id`) REFERENCES `count_order` (`count_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `user_name` varchar(100) DEFAULT 'null' COMMENT '用户昵称',
  `user_realname` varchar(100) DEFAULT NULL COMMENT '用户真实姓名',
  `user_sex` enum('男','女') DEFAULT NULL COMMENT '用户性别',
  `user_birthday` datetime DEFAULT NULL COMMENT '用户生日',
  `user_address` varchar(255) DEFAULT NULL COMMENT '用户常用地址',
  `user_phone` varchar(100) DEFAULT NULL COMMENT '用户手机号',
  `user_image` varchar(255) DEFAULT NULL COMMENT '用户头像',
  `user_pwd` varchar(255) NOT NULL COMMENT '用户密码',
  PRIMARY KEY (`user_id`,`user_pwd`),
  UNIQUE KEY `user_name` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

/*Table structure for table `user_address` */

DROP TABLE IF EXISTS `user_address`;

CREATE TABLE `user_address` (
  `address_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '地址编号',
  `address_userid` int(11) NOT NULL COMMENT '用户编号',
  `address_tousername` varchar(255) NOT NULL COMMENT '收货人姓名',
  `address_info` varchar(255) NOT NULL COMMENT '收货人地址',
  `address_phone` varchar(255) NOT NULL COMMENT '收货人电话',
  `address_code` varchar(255) DEFAULT NULL COMMENT '邮政编码',
  PRIMARY KEY (`address_id`),
  KEY `address_userid` (`address_userid`),
  CONSTRAINT `user_address_ibfk_1` FOREIGN KEY (`address_userid`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user_address` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
