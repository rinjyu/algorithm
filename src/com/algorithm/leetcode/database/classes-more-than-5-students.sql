-- MySQL
select
    class
from Courses
group by class
having count(1) >= 5;

-- Oracle
select
    class
from Courses
group by class
having count(1) >= 5;