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

INSERT INTO user (username, pw, first_name, role)
VALUES ('BATMAN@KINO.DK', '123', 'BATMAN', 'ADMIN');
INSERT INTO user (username, pw, first_name, role)
VALUES ('SØREN@KINO.DK', '123', 'SØREN', 'OPERATOR');
INSERT INTO user (username, pw, first_name, role)
VALUES ('HINO@KINO.DK', '123', 'HINO', 'SALES');
INSERT INTO user (username, pw, first_name, role)
VALUES ('HTMLLA@KINO.DK', '123', 'HTMLLA', 'INSPECTION');