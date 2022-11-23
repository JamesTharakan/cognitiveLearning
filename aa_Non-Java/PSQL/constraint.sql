-- Primary Key 
ALTER TABLE person DROP CONSTRAINT sadas_key
ALTER TABLE person ADD PRIMARY KEY col_id

insert into person (FName, LName, gender, email, dob, country) 
values ('Duplicate', 'E_mail', 'Female', 'afishpond9@discovery.com', date '2012-03-02', 'Indonesia');

select email, count(*) from person group by email having count(*) >1

SELECT * FROM person where email ='afishpond9@discovery.com'

--Unique Key
--Unique key constraints can accept only one NULL value for column.
--Unique key columns does not auto increment
--Creates non-clustered index
--Can have more than one unique key in a table
ALTER TABLE person 
ADD CONSTRAINT unique_email UNIQUE(email) --In this way, we can give the name for the constraint

DELETE FROM person WHERE id=1904

ALTER TABLE person DROP CONSTRAINT unique_email

ALTER TABLE person 
ADD UNIQUE(email)

--Check Constraint
ALTER TABLE person
ADD CONSTRAINT genderCons CHECK(gender='Male' OR gender='Female')


SELECT * FROM PERSON WHERE id=9

UPDATE person SET id=007, Fname='James' WHERE id=9;


SELECT * FROM person order by id DESC;	--1903


