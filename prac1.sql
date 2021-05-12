CREATE DATABASE store_info3;

USE store_info3;


CREATE TABLE customers (
    id INT AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL DEFAULT '???',
    last_name VARCHAR(50) NOT NULL DEFAULT '???',
    address VARCHAR(100) NOT NULL DEFAULT '???',
    phone CHAR(10) NOT NULL DEFAULT '???',
    PRIMARY KEY (id)
    );

CREATE TABLE products (
	id INT AUTO_INCREMENT,
	product_name VARCHAR(50) NOT NULL,
	price DEC(65,2) NOT NULL,
	PRIMARY KEY (id)
	);



CREATE TABLE orders (
	id INT AUTO_INCREMENT,
	customer_id INT,
	product_id INT,
	total DEC(65,2) NOT NULL,
	quantity INT NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (customer_id) REFERENCES customers(id),
	FOREIGN KEY (product_id) REFERENCES products(id)
	);

DESCRIBE customers;

ALTER TABLE customers
ADD email VARCHAR(50) UNIQUE NOT NULL;

DROP TABLE IF EXISTS orders;