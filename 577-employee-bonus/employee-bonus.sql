# Write your MySQL query statement below
SELECT a.name,b.bonus FROM Employee a LEFT JOIN Bonus b ON a.empId=b.empId WHERE b.bonus IS NULL OR b.bonus<1000;