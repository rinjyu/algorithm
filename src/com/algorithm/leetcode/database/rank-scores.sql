-- MySQL
select
    score,
    dense_rank() over(order by score desc) as `rank`
from Scores;

-- Oracle
select
    score,
    dense_rank() over(order by score desc) as rank
from Scores;