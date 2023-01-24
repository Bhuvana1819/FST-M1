REM   Script: Activity 8
REM   Activity 8

select * from orders;

desc orders


CREATE TABLE salesman (  
    salesman_id int,  
    salesman_name varchar2(20),  
    salesman_city varchar2(20),  
    commission int );

select * from orders;

desc orders


    create table orders(   
    order_no int primary key, purchase_amount float, order_date date,   
    customer_id int, salesman_id int);

select * from orders;

desc orders


INSERT ALL  
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)   
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005)  
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001)  
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003)  
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001)  
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001)  
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006)  
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003)  
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002)  
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007)  
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001)  
SELECT 1 FROM DUAL;

select * from orders;

desc orders


select max (PURCHASE_AMOUNT) from ordes;

select max (PURCHASE_AMOUNT) from orders;

desc orders


select max(PURCHASE_AMOUNT) from orders order by CUSTOMER_ID;

select max(PURCHASE_AMOUNT) from orders;

select * from orders order by CUSTOMER_ID and (select max(PURCHASE_AMOUNT) from orders);

select * from orders order by CUSTOMER_ID and max(PURCHASE_AMOUNT);

desc orders


select CUSTOMER_ID , max(PURCHASE_AMOUNT) as 'Max' from orders group by CUSTOMER_ID;

SELECT customer_id, MAX(purchase_amount) AS "Max Amount" FROM orders GROUP BY customer_id;

select CUSTOMER_ID , max(PURCHASE_AMOUNT) as 'Max' from orders group by CUSTOMER_ID;

select CUSTOMER_ID , max(PURCHASE_AMOUNT) as "Max" from orders group by CUSTOMER_ID;

select * from orders order by CUSTOMER_ID and max(PURCHASE_AMOUNT);

select * from orders;

select CUSTOMER_ID , max(PURCHASE_AMOUNT) as "Max" from orders group by CUSTOMER_ID;

desc orders


select * from orders;

select SALESMAN_ID , max(PURCHASE_AMOUNT) as "Max" from orders where ORDER_DATE = "2012-08-1";

select SALESMAN_ID , max(PURCHASE_AMOUNT) as "Max" from orders where ORDER_DATE = To_DATE('2012/08/17', 'YYYY/MM/DD') ;

select SALESMAN_ID , max(PURCHASE_AMOUNT) as "Max" from orders where ORDER_DATE = To_DATE('2012/08/17', 'YYYY/MM/DD')  GROUP BY salesman_id, order_date ;

SELECT salesman_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders  
WHERE order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id, order_date;

select SALESMAN_ID , max(PURCHASE_AMOUNT) as "Max" from orders where ORDER_DATE = To_DATE('2012/08/17', 'YYYY/MM/DD')  GROUP BY salesman_id, order_date ;

SELECT salesman_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders  
WHERE order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') ;

desc orders


select CUSTOMER_ID, SALESMAN_ID,ORDER_DATE, max(PURCHASE_AMOUNT) as "Max" from orders having max(PURCHASE_AMOUNT) > 2030 and < 6000;

select CUSTOMER_ID, SALESMAN_ID,ORDER_DATE, max(PURCHASE_AMOUNT) as "Max" from orders having max(PURCHASE_AMOUNT) > 2030 and < 6000 group by CUSTOMER_ID;

select CUSTOMER_ID, SALESMAN_ID,ORDER_DATE, max(PURCHASE_AMOUNT) as "Max" from orders having max(PURCHASE_AMOUNT) > 2030 and max(PURCHASE_AMOUNT) < 6000 group by CUSTOMER_ID;

select CUSTOMER_ID,ORDER_DATE, max(PURCHASE_AMOUNT) as "Max" from orders having max(PURCHASE_AMOUNT) in (2030, 3450, 5760, and 6000)  
group by CUSTOMER_ID, order_date;

select CUSTOMER_ID,ORDER_DATE, max(PURCHASE_AMOUNT) as "Max" from orders group by CUSTOMER_ID, order_date 
having max(PURCHASE_AMOUNT) in (2030, 3450, 5760, and 6000) ;

SELECT customer_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders 
GROUP BY customer_id, order_date 
HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);

select CUSTOMER_ID,ORDER_DATE, max(PURCHASE_AMOUNT) as "Max" from orders group by CUSTOMER_ID, order_date 
having max(PURCHASE_AMOUNT) in (2030, 3450, 5760, 6000) ;

select CUSTOMER_ID,ORDER_DATE, max(PURCHASE_AMOUNT) as "Max" from orders  
having max(PURCHASE_AMOUNT) in (2030, 3450, 5760, 6000) group by CUSTOMER_ID, order_date;

select * from orders;

select CUSTOMER_ID,ORDER_DATE, max(PURCHASE_AMOUNT) as "Max" from orders  
having max(PURCHASE_AMOUNT) in (2030, 3450, 5760, 6000) group by CUSTOMER_ID, order_date;

