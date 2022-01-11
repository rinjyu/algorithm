-- MySQL
select
    d.name as Department,
    e.Employee,
    e.Salary
from (
    select
        e.name   as  Employee,
        e.salary as  Salary,
        e.departmentId,
        dense_rank() over(partition by e.departmentId order by e.departmentId, e.salary desc) as salary_rank
    from Employee e
) e inner join Department d
on e.departmentId = d.id
where e.salary_rank < 4
order by e.departmentId, e.salary_rank;

-- Oracle
select
    d.name as Department,
    e.Employee,
    e.Salary
from (
    select
        e.name   as  Employee,
        e.salary as  Salary,
        e.departmentId,
        dense_rank() over(partition by e.departmentId order by e.departmentId, e.salary desc) as salary_rank
    from Employee e
) e inner join Department d
on e.departmentId = d.id
where e.salary_rank < 4
order by e.departmentId, e.salary_rank;