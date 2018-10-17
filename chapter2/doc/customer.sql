CREATE TABLE `customer` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `name` varchar(32) DEFAULT NULL COMMENT '姓名',
  `contact` varchar(32) DEFAULT NULL COMMENT '联系人',
  `telephone` varchar(16) DEFAULT NULL COMMENT '联系电话',
  `email` varchar(64) DEFAULT NULL COMMENT '邮箱',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `insert_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '插入时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COMMENT '顾客表';


insert into customer(name, contact, telephone, email, remark) values('customer1', 'Jack', '13512345678', 'jack@gmail.com', null);
insert into customer(name, contact, telephone, email, remark) values('customer2', 'Rose', '1362345789', 'rose@gmail.com', null);
