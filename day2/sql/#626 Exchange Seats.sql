# Write your MySQL query statement below
select 
CASE 
    WHEN id%2=1 AND id != (select max(id) from seat) THEN id+1
    WHEn id%2=0 THEN id-1
    else id
END as id, student
from Seat
order by id asc
