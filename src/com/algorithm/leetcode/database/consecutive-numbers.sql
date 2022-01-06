-- MySQL
select
    distinct a.num as ConsecutiveNums
from (
    select
        id,
        num,
        lag(num) over(order by id) as previous_number,
        lead(num) over(order by id) as next_number
    from Logs
) a
where a.num = a.previous_number
  and a.num = a.next_number;

-- Oracle
select
    distinct a.num as ConsecutiveNums
from (
    select
        id,
        num,
        lag(num) over(order by id) as previous_number,
        lead(num) over(order by id) as next_number
    from Logs
) a
where a.num = a.previous_number
  and a.num = a.next_number;