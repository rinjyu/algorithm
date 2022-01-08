-- MySQL
select
    distinct email
from Person
group by email
having count(1) > 1;

-- Oracle
select
    distinct email
from Person
group by email
having count(1) > 1;