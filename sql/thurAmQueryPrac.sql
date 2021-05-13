USE sakila;

SHOW TABLES;


SELECT last_name FROM actor_info
WHERE first_name = 'John';

SELECT first_name, last_name FROM actor_info
WHERE last_name = 'Neeson';

SELECT actor_id, first_name, last_name FROM actor_info
WHERE actor_id % 10 = 0;

SELECT description FROM film_list
WHERE FID = 100;

SELECT title FROM film_list
WHERE rating = 'R';

SELECT title FROM film_list
WHERE rating <> 'R';

SELECT title FROM film_list
ORDER BY length LIMIT 10;


SELECT title FROM film
WHERE special_features 
LIKE '%Deleted Scenes%';


SELECT title FROM film 
JOIN film_category ON film_category.category_id = 11
GROUP BY film.title;

SELECT * FROM language
ORDER BY name DESC;

SHOW TABLES;

SELECT first_name, last_name FROM actor_info
WHERE last_name LIKE '%SON' ORDER BY last_name ASC;

SELECT last_name FROM actor_info
GROUP BY last_name
HAVING COUNT(last_name) < 2 ORDER BY last_name DESC;



SELECT first_name, last_name FROM actor
JOIN film_actor ON film_actor.actor_id = actor.actor_id
GROUP BY film_actor.actor_id ORDER BY film_actor.actor_id ASC
LIMIT 1;
