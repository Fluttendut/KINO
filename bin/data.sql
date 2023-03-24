DROP TABLE user;
USE kino;
create table user
(
    `username`   varchar(255) NOT NULL,
    `first_name` varchar(255),
    `pw`         varchar(255),
    `role`       ENUM ('ADMIN', 'SALES', 'OPERATOR', 'INSPECTION'),
    PRIMARY KEY (`username`)
);
