

SELECT count(Fname) from person WHERE gender ='Male'	
SELECT count(*) from person WHERE gender ='Male'		--*(everything) returns the count of null also

SELECT Fname, gender, email FROM person
WHERE gender is NULL

