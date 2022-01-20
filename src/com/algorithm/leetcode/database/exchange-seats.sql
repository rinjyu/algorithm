-- MySQL
select
    a.id,
    a.student
from (
    select
        case
            when mod(s.id, 2) = 0 then (s.id - 1)
            else (
                case
                    when lead(s.id) over(order by s.id) is null then s.id
                    else (s.id + 1)
                end
            )
        end id,
        s.student
    from Seat s
) a
order by a.id;


-- Oracle
select
    a.id,
    a.student
from (
    select
        case
            when mod(s.id, 2) = 0 then (s.id - 1)
            else (
                case
                    when lead(s.id) over(order by s.id) is null then s.id
                    else (s.id + 1)
                end
            )
        end id,
        s.student
    from Seat s
) a
order by a.id;