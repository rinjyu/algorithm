-- MySQL
delete from Person where id in (
    select a.id
    from (
        select
            rank() over(partition by email order by id) as email_rank,
            id
        from Person
    ) a
    where a.email_rank > 1
);