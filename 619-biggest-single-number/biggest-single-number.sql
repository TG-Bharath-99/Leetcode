# Write your MySQL query statement below
SELECT max(num) as num 
FROM (select num from MyNumbers
GROUP BY num
HAVING COUNT(*) = 1)t;
