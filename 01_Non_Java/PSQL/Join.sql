select * 
from person join cars 
on person.carid= cars.id

select  person.Fname, cars.make,cars.model
from person join cars 
on person.carid= cars.id

select * from person 
left join cars 
on person.carid= cars.id
order by person.id