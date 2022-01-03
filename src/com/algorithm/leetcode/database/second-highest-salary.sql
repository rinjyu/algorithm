-- MySQL
select
   max(a.salary) as SecondHighestSalary
from (
    select
        dense_rank() over(order by salary desc) as salary_rank,
        salary
    from employee
) a
where a.salary_rank = 2;

-- Oracle
select
   max(a.salary) as SecondHighestSalary
from (
    select
        dense_rank() over(order by salary desc) as salary_rank,
        salary
    from employee
) a
where a.salary_rank = 2;