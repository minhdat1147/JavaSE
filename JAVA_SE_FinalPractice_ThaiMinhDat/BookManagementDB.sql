Create database ebookshop;
use ebookshop;
create table books(
	id int not null primary key,
    title varchar(50),
    author varchar(50),
    price float,
    quantity int
);
insert into books(id,title, author, price, quantity) 
values(1001,'Java SE Programming Essentials','Tan Ah Teck',11.11,11),
(1002,'Learning SQL','Anthony Molinaro',22.22,22),
(1003,'Servlet and JSP','Budi Kurniawan',33.33,33),
(1004,'Pro Angular 8','Adam Freeman', 88.88,8),
(1005, 'Mastering Node.js','Kevin Faaborg',55.55,5);

update ebookshop.books
set price = 00.7 and quantity = 1
where id = 1006;
select *
from ebookshop.books as b
where b. title like 'Java%'
Order by b.price DESC;

