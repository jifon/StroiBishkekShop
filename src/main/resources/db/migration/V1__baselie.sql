CREATE TABLE `product` (
  `prod_id` bigint NOT NULL,
  `date_of_manifacture` varchar(255) NOT NULL,
  `expiry_date` varchar(255) NOT NULL,
  `product_name` varchar(255) NOT NULL,
  `price` double NOT NULL,
  PRIMARY KEY (`prod_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `order_detail` (
  `order_id` bigint NOT NULL,
  `prod_id` bigint NOT NULL,
  KEY `FKjkw63ww6tlamnw9ooowb7pk9r` (`prod_id`),
  KEY `FKplam7wxc4tjbgex0xyk8f0qxo` (`order_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `order` (
  `order_id` bigint NOT NULL AUTO_INCREMENT,
  `creation_time` varchar(255) DEFAULT NULL,
  `customer_id` bigint NOT NULL,
  PRIMARY KEY (`order_id`),
  KEY `FKb8tboo4d95mh8gavvovwbb7vg` (`customer_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `customer` (
  `customer_id` bigint NOT NULL AUTO_INCREMENT,
  `creation_time` varchar(255) DEFAULT NULL,
  `emaiol` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `cart_id` bigint DEFAULT NULL,
  PRIMARY KEY (`customer_id`),
  KEY `FKam4cgy6fxmjm52m8otoph84m3` (`cart_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `cart` (
  `cart_id` bigint NOT NULL,
  `creation_time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cart_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `admin` (
  `id` bigint NOT NULL,
  `added_date` varchar(255) NOT NULL,
  `emaiol` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



