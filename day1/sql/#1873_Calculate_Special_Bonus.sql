select employee_id, salary as bonus
from employees
where name not like "M%" and employee_id%2 !=0
union
select  employee_id, 0 as bonus 
from employees 
where employee_id%2=0 or name like "M%"
order by employee_id
