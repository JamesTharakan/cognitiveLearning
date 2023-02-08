-- HAVING can only be used by groupBy and it should be usung some kind of aggreator

SELECT email, count(*) from person group by email having count(*) >1

SELECT * FROM person where email ='afishpond9@discovery.com'


-- ASC and DESC can only be used with 'Order by'
SELECT * FROM person order by id DESC;	--1903

select id, price from cars order by price DESC,id -- If clash in orderby then use the second mentioned column
