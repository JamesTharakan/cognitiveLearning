use sql_store;
SHOW TABLES;

use sql_store;
DESC  order_items;

use sql_inventory;
DESC  products;

use sql_inventory;
SELECT name, unit_price, unit_price*1.1 AS new_price
FROM products;

--
use sql_store;
SELECT * from orders;

SELECT order_id AS 2025_ORDERS, order_date
FROM orders
where order_date >= '2019-01-01';


use sql_store;
SELECT * FROM order_items;