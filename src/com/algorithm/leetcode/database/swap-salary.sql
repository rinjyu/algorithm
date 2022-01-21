-- MySQL
update Salary set sex = case sex when 'm' then 'f' else 'm' end;

-- Oracle
update Salary set sex = decode(sex,'m','f','f','m');