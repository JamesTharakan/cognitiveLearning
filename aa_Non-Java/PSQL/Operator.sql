select * from person where gender NOT LIKE  '%ale'

--Operator : BETWEEN
--Function : Date 


SELECT * FROM person
WHERE dob
BETWEEN DATE '2001-01-01' AND '2001-01-31'

--Operator : LIKE , ILIKE
--WILDCARD : % and _(underscore)


SELECT * FROM person WHERE email like '%rediff%';

SELECT * FROM person WHERE email like '______@%';


