-- MySQL
select
    p.firstName,
    p.lastName,
    a.city,
    a.state
from Person p left outer join Address a
on p.personId = a.personId;

-- Oracle
select
    p.firstName,
    p.lastName,
    a.city,
    a.state
from Person p left outer join Address a
on p.personId = a.personId;