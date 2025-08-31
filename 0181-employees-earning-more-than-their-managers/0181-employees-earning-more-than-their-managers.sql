# Write your MySQL query statement below
select e.name as Employee
from Employee e
join Employee mgr
where e.managerId = mgr.id and e.salary > mgr.salary;