ALTER TABLE person ADD  COLUMN carsID INT 
CONSTRAINT personCar_FK REFERENCES cars (id)

ALTER TABLE person 
RENAME COLUMN carsid TO carID

select id,fname, carid from person
select * from cars

UPDATE person SET carid =3
WHERE id =1

select * from person where carid=3