select name as Customers
from customers
where id Not IN (select customerId
from orders );
