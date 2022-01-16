-- MySQL
select
   a.request_at as day,
   round(a.cancel_cnt / a.total_cnt,2) as `Cancellation Rate`
from (
    select
        t.request_at,
        count(case when t.status <> 'completed' then 1 end) as cancel_cnt,
        count(t.request_at) as total_cnt
    from (select client_id, driver_id, status, request_at from Trips) t
    left outer join (select users_id, banned from Users where role = 'client') u on t.client_id = u.users_id
    left outer join (select users_id, banned from Users where role = 'driver') d on t.driver_id = d.users_id
    where u.banned = 'No'
    and d.banned = 'No'
    and t.request_at between '2013-10-01' and '2013-10-03'
    group by t.request_at
) a;

-- Oracle
select
   a.request_at as day,
   round(a.cancel_cnt / a.total_cnt,2) as "Cancellation Rate"
from (
    select
        t.request_at,
        count(case when t.status <> 'completed' then 1 end) as cancel_cnt,
        count(t.request_at) as total_cnt
    from (select client_id, driver_id, status, request_at from Trips) t
    left outer join (select users_id, banned from Users where role = 'client') u on t.client_id = u.users_id
    left outer join (select users_id, banned from Users where role = 'driver') d on t.driver_id = d.users_id
    where u.banned = 'No'
    and d.banned = 'No'
    and t.request_at between '2013-10-01' and '2013-10-03'
    group by t.request_at
) a;