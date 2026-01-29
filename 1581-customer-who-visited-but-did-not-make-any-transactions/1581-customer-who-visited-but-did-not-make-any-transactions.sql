/* Write your PL/SQL query statement below */


/* Write your PL/SQL query statement below */
Select v.customer_id,
    COUNT(v.visit_id) as count_no_trans
    from visits v
    left join
    transactions t
    on v.visit_id = t.visit_id
    where t.visit_id is NULL
    group by v.customer_id
    having COUNT(v.visit_id) > 0;