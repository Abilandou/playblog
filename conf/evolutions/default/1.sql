# --- !Ups

CREATE TABLE books (
	id INT NOT NULL AUTO_INCREMENT,
	title VARCHAR(100) NOT NULL,
	price INT(11) NOT NULL,
	author VARCHAR(255) NOT NULL,
	PRIMARY KEY (id)
);


