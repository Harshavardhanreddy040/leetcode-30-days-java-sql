select to_char(event_day, 'yyyy-mm-dd') as day , emp_id, (sum(out_time)-sum(in_time)) as total_time
from employees
group by event_day, emp_id
