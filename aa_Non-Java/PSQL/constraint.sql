ALTER TABLE person
DROP CONSTRAINT person_pkey

AlTER TABLE person 
ADD CONSTRAINT primary_id 
PRIMARY KEY  (id)


--Unique key constraints can accept only one NULL value for column.
--Unique key columns does not auto increment
--Creates non-clustered index
--Can have more than one unique key in a table

ALTER TABLE person
ADD CONSTRAINT unique_email 
UNIQUE(email) 

ALTER TABLE person
DROP CONSTRAINT unique_email

ALTER TABLE person 
ADD UNIQUE(email)

--Check Constraint
ALTER TABLE person
ADD CONSTRAINT genderCons 
CHECK(gender='Male' OR gender='Female')

ALTER TABLE cars
ADD CONSTRAINT maxPrice 
CHECK(price < 1000)


--We can create constraints without giving constraint name, in such cases some name will be assigned
ALTER TABLE cars
ADD  
CHECK(price < 10000)

ALTER TABLE cars
DROP CONSTRAINT cars_price_check


