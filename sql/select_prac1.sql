USE store_info5;

CREATE TABLE customers (
    id INT AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(70) NOT NULL,
    PRIMARY KEY (id)
    );

CREATE TABLE orders (
	id INT AUTO_INCREMENT,
	customer_id INT,
	total DEC(10,2) NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (customer_id) REFERENCES customers(id)
	);

CREATE TABLE products (
	id INT AUTO_INCREMENT,
	name VARCHAR(50) NOT NULL,
	price DEC(10,2) NOT NULL,
	PRIMARY KEY (id)
	);

CREATE TABLE ordered_products (
	id INT AUTO_INCREMENT,
	order_id INT,
	product_id INT,
	quantity INT DEFAULT 1 NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (order_id) REFERENCES orders(id),
	FOREIGN KEY (product_id) REFERENCES products(id)
	);
    


INSERT INTO customers
VALUES (NULL, "John", "Person", "something@mail.com");

INSERT INTO customers
VALUES (NULL, "Person", "Example", "person@person.com");

INSERT INTO customers
VALUES (NULL, "Harriet", "Wow", "wow@wow.com");

INSERT INTO customers
VALUES (NULL, "Mister", "Captain", "captain@person.com");

INSERT INTO customers
VALUES (NULL, "Blobbo", "McWow", "heynow@wow.com");

INSERT INTO products
VALUES (NULL, "Thingamabob", 55.22);

INSERT INTO products
VALUES (NULL, "Garden Hose", 100.00);

INSERT INTO products
VALUES (NULL, "Cutting Board", 49.99);

INSERT INTO products
VALUES (NULL, "Coffee Mug", 19.99);

INSERT INTO products
VALUES (NULL, "Pillow", 39.99);

INSERT INTO orders
VALUES (NULL, 1, 10.54);

INSERT INTO orders
VALUES (NULL, 1, 20.33);

INSERT INTO orders
VALUES (NULL, 4, 50.55);

INSERT INTO orders
VALUES (NULL, 2, 1.44);

INSERT INTO orders
VALUES (NULL, 1, 5.55);


INSERT INTO ordered_products
VALUES (NULL, 2, 5, 2);

INSERT INTO ordered_products
VALUES (NULL, 2, 4, 1);

INSERT INTO ordered_products
VALUES (NULL, 3, 3, 2);

INSERT INTO ordered_products
VALUES (NULL, 4, 2, 1);

INSERT INTO ordered_products
VALUES (NULL, 5, 1, 3);

SELECT * FROM customers;

SELECT * FROM orders;

SELECT * FROM products;

UPDATE customers
SET first_name="Charlotte"
WHERE id=2;

UPDATE customers
SET first_name="David"
WHERE id=3;




SELECT * FROM customers;


SELECT cus.first_name, cus.last_name FROM customers cus
JOIN orders ord ON ord.customer_id = cus.id;





INSERT INTO orders VALUES (NULL, 3, 44.22);

SELECT * FROM products;

INSERT INTO ordered_products
VALUES (NULL, 8, 4, 2);

INSERT INTO ordered_products
VALUES (NULL, 8, 2, 1);

SELECT prod.name FROM products prod
JOIN ordered_products ON prod.id = ordered_products.product_id;



