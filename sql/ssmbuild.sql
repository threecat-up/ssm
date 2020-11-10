CREATE DATABASE `ssmuild`;
USE `ssmbuild`;
DROP TABLE IF EXISTS `books`;

CREATE TABLE `books`(
	`bookID` INT(10) NOT NULL AUTO_INCREMENT COMMENT '书id',
	`bookName` VARCHAR(100) NOT NULL COMMENT '书名',
	`bookCounts` INT(11) NOT NULL COMMENT '数量',
	`detail` VARCHAR(200) NOT NULL COMMENT '描述',
	KEY `bookID` (`bookID`)
)ENGINE=INNODB DEFAULT CHARSET=utf8
INSERT INTO `books`(`bookID`,`bookName`,`bookCounts`,`detail`)VALUES
(1,'java',1,'入门放弃'),
(2,'java2',3,'入门放弃2'),
(3,'java3',7,'入门放弃3');

