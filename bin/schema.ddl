DROP DATABASE kinotest2;
CREATE DATABASE kinotest2;
USE kinotest2;

DROP TABLE user;
CREATE TABLE user
(
    `user_id`    int AUTO_INCREMENT,
    `username`   varchar(255)                                                  NOT NULL UNIQUE,
    `first_name` varchar(255)                                                  NOT NULL,
    `last_name`  varchar(255),
    `pw`         varchar(255)                                                  NOT NULL,
    `role`       ENUM ('ADMIN', 'SALES', 'OPERATOR', 'INSPECTION', 'CUSTOMER') NOT NULL,
    PRIMARY KEY (`user_id`)
);