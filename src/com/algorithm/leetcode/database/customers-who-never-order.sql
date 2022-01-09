-- MySQL
select
    c.name as Customers
from Customers c left outer join Orders o
on c.id = o.customerId
where o.customerId is null;

-- Oracle
select
    c.name as Customers
from Customers c left outer join Orders o
on c.id = o.customerId
where o.customerId is null;