--The Group By statement is used to group together any rows of a column with the same value stored in them,
--based on a function specified in the statement

--The GROUP BY statement lets the database system know that
--we wish to group the same value rows of the columns specified.



--Function : Count  

SELECT count(Fname) from person WHERE gender ='Male'	
SELECT count(*) from person WHERE gender ='Male'		--*(everything) returns the count of null also

SELECT count(*) AS "Straight"
FROM person WHERE gender IN('Female', 'Male');

SELECT count(DISTINCT gender) AS "Genders Present" FROM person; --Distinct & not null


SELECT gender, count(*) AS "Number of People in Each"
FROM person GROUP BY gender;

-- Math Function : Max , Min , Aggregate , Sum--

SELECT MAX(price) from cars;
SELECT AVG(price) from cars;
SELECT ROUND(AVG(price)) from cars;

SELECT make, MIN(price) FROM cars GROUP BY make;



SELECT sum(price) from cars;

SELECT make, sum(price) from cars GROUP BY make;

--Arithmetic 
SELECT make, model , price, 
ROUND(price*0.1)AS Discount,
ROUND(price*0.9)AS FinalPrice 
FROM cars;