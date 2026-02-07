# Write your MySQL query statement below
select e.name
from Employee e
join Employee  b
on e.id = b.managerId
group by b.managerId , e.name
having count(b.managerId) >= 5;