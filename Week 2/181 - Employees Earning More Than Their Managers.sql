SELECT x.name as Employee
FROM Employee AS x,
     Employee AS y
WHERE x.managerID = y.id
 AND x.Salary > y.Salary;
