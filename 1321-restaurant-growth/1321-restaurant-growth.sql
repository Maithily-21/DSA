# Write your MySQL query statement below
WITH daily_sales AS (
    SELECT
        visited_on,
        SUM(amount) AS amount
    FROM Customer
    GROUP BY visited_on
),
rolling AS (
    SELECT
        visited_on,
        SUM(amount) OVER (
            ORDER BY visited_on
            ROWS BETWEEN 6 PRECEDING AND CURRENT ROW
        ) AS amount,
        ROUND(
            AVG(amount) OVER (
                ORDER BY visited_on
                ROWS BETWEEN 6 PRECEDING AND CURRENT ROW
            ),
            2
        ) AS average_amount,
        ROW_NUMBER() OVER (ORDER BY visited_on) AS rn
    FROM daily_sales
)

SELECT
    visited_on,
    amount,
    average_amount
FROM rolling
WHERE rn >= 7;