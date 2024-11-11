CREATE TABLE `sku_price_change_0` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '自增无意义主键',
  `sku_id` varchar(32) NOT NULL COMMENT '商品ID',
  `tenant_code` varchar(64) NOT NULL DEFAULT '1' COMMENT '租户ID,默认值为10000',
  `old_price` decimal(12,2) DEFAULT NULL COMMENT '商品旧价',
  `new_price` decimal(12,2) DEFAULT NULL COMMENT '商品新价',
  `unit` int(11) DEFAULT NULL COMMENT '价格单位 1.人民币 元',
  `ext_info` varchar(5000) DEFAULT NULL COMMENT '扩展信息，JSON格式存储',
  `creator` varchar(32) DEFAULT NULL COMMENT '创建人PIN',
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uniq_tenant_sku` (`tenant_code`,`sku_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品价格';

CREATE TABLE `sku_price_change_0` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '自增无意义主键',
  `sku_id` varchar(32) NOT NULL COMMENT '商品ID',
  `tenant_code` varchar(64) NOT NULL DEFAULT '1' COMMENT '租户ID,默认值为10000',
  `old_price` decimal(12,2) DEFAULT NULL COMMENT '商品旧价',
  `new_price` decimal(12,2) DEFAULT NULL COMMENT '商品新价',
  `unit` int(11) DEFAULT NULL COMMENT '价格单位 1.人民币 元',
  `ext_info` varchar(5000) DEFAULT NULL COMMENT '扩展信息，JSON格式存储',
  `creator` varchar(32) DEFAULT NULL COMMENT '创建人PIN',
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品价格变更记录';
