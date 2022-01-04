-- MySQL
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      select
        MAX(a.salary)
      from (
          select
            dense_rank() over(order by salary desc) salary_rank,
            salary
          from Employee
      ) a
      where a.salary_rank = N
  );
END;

-- Oracle
CREATE FUNCTION getNthHighestSalary(N IN NUMBER) RETURN NUMBER IS
result NUMBER;
BEGIN
    /* Write your PL/SQL query statement below */
    select
        MAX(a.salary) INTO result
    from (
      select
        dense_rank() over(order by salary desc) salary_rank,
        salary
      from Employee
    ) a
    where a.salary_rank = N;

    RETURN result;
END;