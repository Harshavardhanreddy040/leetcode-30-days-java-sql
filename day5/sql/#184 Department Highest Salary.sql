select d.name as Department , e.name as Employee, e.salary as Salary
from Employee e left outer join Department d 
on e.departmentId = d.id
where (e.departmentId,salary) in (select departmentId, max(salary)
from employee
group by departmentId);
