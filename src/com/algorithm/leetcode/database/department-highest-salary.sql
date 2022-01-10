-- MySQL
select
    d.name as Department,
    a.name as Employee,
    a.salary as Salary
from (
    select
        dense_rank() over(partition by departmentId order by departmentId, salary desc) as salary_rank,
        id,
        departmentId,
        salary,
        name
    from Employee
) a inner join Department d
on a.departmentId = d.id
where a.salary_rank = 1
order by a.id;

-- Oracle
select
    d.name as Department,
    a.name as Employee,
    a.salary as Salary
from (
    select
        dense_rank() over(partition by departmentId order by departmentId, salary desc) as salary_rank,
        id,
        departmentId,
        salary,
        name
    from Employee
) a inner join Department d
on a.departmentId = d.id
where a.salary_rank = 1
order by a.id;