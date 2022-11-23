--Coalesce  (koh-les), it returns the first non-null argument.

SELECT COALESCE(email,'If_no_email(NULL)_this_default_value_is_returned') from person 

--nulls
SELECT 10/0;
SELECT 10/NULL;



--NULLIF,returns a null value if arg1 equals to arg2, otherwise it returns arg1.

SELECT NULLIF(1,1);				
SELECT NULLIF(1,2);
SELECT NULLIF(NULL, NULL);			--Can be used to check/assert, return null if true

SELECT COALESCE(10/NULLIF(0,0) ,555);