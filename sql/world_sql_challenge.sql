USE world;

SHOW TABLES;

SELECT COUNT(CountryCode) AS Num_Of_US_Cities FROM city
WHERE CountryCode = 'USA';


SELECT Population, LifeExpectancy FROM country
WHERE Code = 'ARG';

SELECT Name, LifeExpectancy FROM country
WHERE LifeExpectancy IS NOT NULL
ORDER BY LifeExpectancy DESC LIMIT 1;


SELECT city.Name from city
JOIN country ON city.id = country.Capital
WHERE country.Name = 'Spain';

SELECT DISTINCT countrylanguage.Language from countrylanguage
JOIN country ON country.Code = countrylanguage.CountryCode
WHERE country.Region = 'Southeast Asia';

SELECT Name FROM city
WHERE Name LIKE 'F%'
LIMIT 25;

SELECT COUNT(city.CountryCode) AS num_of_cities_china FROM city
JOIN country ON city.CountryCode = country.Code
WHERE country.Code = 'CHN';


SELECT Name, Population FROM country
WHERE Population IS NOT NULL
AND Population != 0
ORDER BY Population
LIMIT 1;

SELECT SurfaceArea, Name FROM country
ORDER BY SurfaceArea DESC LIMIT 10;

SELECT city.Name, city.Population FROM city
JOIN country ON country.Code = city.CountryCode
WHERE country.Name = 'Japan'
ORDER BY Population DESC
LIMIT 10;

SELECT Name, Code FROM country
WHERE HeadOfState = 'Elizabeth II'
OR HeadOfState = 'Elisabeth II';

SELECT Name, SurfaceArea, Population, Population / SurfaceArea
AS pop_to_sa_ratio FROM country
WHERE Population > 0
ORDER BY pop_to_sa_ratio 
LIMIT 10;

SELECT DISTINCT Language FROM countrylanguage
ORDER BY Language;

SELECT Name, GNP FROM country
ORDER BY GNP DESC LIMIT 10;

SELECT country.Name, COUNT(countrylanguage.CountryCode) AS total_languages from country
JOIN countrylanguage ON countrylanguage.CountryCode = country.Code
GROUP BY countrylanguage.CountryCode
ORDER BY total_languages DESC
LIMIT 10;


SELECT country.Name from country
JOIN countrylanguage ON countrylanguage.CountryCode = country.Code
WHERE Language = 'German'
AND Percentage >= 50;

SELECT * FROM country;
SELECT * FROM city;
SELECT * FROM countrylanguage;

SELECT Name, LifeExpectancy FROM country
WHERE LifeExpectancy != 0
AND LifeExpectancy IS NOT NULL
ORDER BY LifeExpectancy
LIMIT 1;

SELECT GovernmentForm from country
GROUP BY GovernmentForm
ORDER BY COUNT(GovernmentForm) DESC
LIMIT 3;

SELECT COUNT(Name) AS num_of_countries FROM country
WHERE IndepYear IS NOT NULL;
