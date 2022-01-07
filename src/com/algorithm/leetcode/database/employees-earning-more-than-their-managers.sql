-- MySQL
select
    e.name as Employee
from (
         select e.id,
                e.name,
                e.salary,
                e.managerId
         from Employee e
         where e.managerId is not null
     ) e, Employee m
where e.managerId = m.id
  and e.salary > m.salary;

-- Oracle
select
    e.name as Employee
from (
         select e.id,
                e.name,
                e.salary,
                e.managerId
         from Employee e
         where e.managerId is not null
     ) e, Employee m
where e.managerId = m.id
  and e.salary > m.salary;

