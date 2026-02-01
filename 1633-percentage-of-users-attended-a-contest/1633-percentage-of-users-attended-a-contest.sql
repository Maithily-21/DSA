/* Write your PL/SQL query statement below */

select r.contest_id , round((COUNT(DISTINCT r.user_id) * 100.0) / 
        (SELECT COUNT(*) FROM Users) ,2) as percentage 
from Users u , Register r where u.user_id = r.user_id 
group by contest_id
order by percentage desc , r.contest_id;