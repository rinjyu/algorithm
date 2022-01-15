-- MySQL
select
   a.id
from Weather a cross join Weather b
where datediff(a.recorddate, b.recorddate) = 1
and a.temperature > b.temperature;

-- Oracle
select
    a.id
from (
    select
        id,
        lag(temperature) over(order by recorddate) as before_temperature,
        temperature as current_temperature,
        lag(recorddate) over(order by recorddate) as before_date,
        recorddate as current_date
    from Weather
) a
where a.current_temperature > a.before_temperature
and a.current_date - a.before_date = 1;