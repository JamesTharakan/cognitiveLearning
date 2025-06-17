SELECT id ,Fname, carid --For Each record in person, it checks the EXISTS condition
FROM person
WHERE EXISTS(SELECT * FROM cars	WHERE cars.id=person.carid);


SELECT id ,Fname, carid FROM person WHERE carid NOTNULL