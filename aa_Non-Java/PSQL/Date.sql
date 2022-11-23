SELECT now();

SELECT now()::Date;

SELECT now()::Time;

SELECT CURRENT_TIME(2); --no of digits in the timeStamp

SELECT now()-INTERVAL '2 YEARS';

SELECT (now()+INTERVAL '2 YEARS')::Date;


SELECT EXTRACT(DAY FROM NOW());
SELECT EXTRACT(YEAR FROM NOW());
SELECT EXTRACT(MONTH FROM NOW());


SELECT FName, AGE(NOW(),dob) AS AGE from person;

SELECT AGE(NOW(),dob)  from person;

--Find age , dislay only year under the AGE column header
SELECT FName, EXTRACT(YEAR FROM AGE(NOW(),dob)) AS AGE from person;


