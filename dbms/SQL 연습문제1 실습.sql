#24/7/8
#이름; 김소진
#연습문제
SET SESSION sql_mode = 'STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
#실습 1-1
create database shop;
create user 'shop'@'%' identified by '1234';
grant all privileges on shop.* to 'shop'@'%';
flush privileges;
#실습 1-2
create table  Customer (
`custId` varchar(10) primary key not null,
`name` varchar(10)  not null,
`hp` varchar(13) unique key,
`addr` varchar(100),
`rdate` date  not null
);
drop table product;
create table Product (
`prodNo`int primary key not null,
`prodName` varchar(10) not null,
`stock` int not null default 0,
`price` int,
`company` varchar(20) not null
);
select*from product;
create table Orderd(
`orderNo` int primary key auto_increment not null,
`orderId` varchar(10) not null,
`orderProduct` int not null,
`orderCount` int not null,
`orderDate` datetime not null
);
drop table orderd;
#실습 1-3
drop table customer;
select*from customer;
insert into customer values ('c101','김유신','010-1234-1001','김해시 봉황동','2022-01-01');
insert into customer values ('c102','김춘추','010-1234-1002','경주시 보문동','2022-01-02');
insert into customer values ('c103','장보고','010-1234-1003','완도군 청산면','2022-01-03');
insert into customer values ('c104','강감찬','010-1234-1004','서울시 마포구','2022-01-04');
insert into customer (`custid`,`name`,`rdate`) values ('c105','이성계','2022-01-05');
insert into customer values ('c106','정철','010-1234-1006','경기도 용인시','2022-01-06');
insert into customer (`custid`,`name`,`rdate`) values ('c107','허준','2022-01-07');
insert into customer values ('c108','이순신','010-1234-1008','서울시 영등포구','2022-01-08');
insert into customer values ('c109','송상현','010-1234-1009','부산시 동래구','2022-01-09');
insert into customer values ('c110','정약용','010-1234-1010','경기도 광주시','2022-01-10');

select*from customer;
insert into product values (1,'새우깡',5000,1500,'농심');
insert into product values (2,'초코파이',2500,2500,'오리온');
insert into product values (3,'포카칩',3600,1700,'오리온');
insert into product values (4,'양파링',1250,1800,'농심');
insert into product (`prodNo`,`prodName`,`stock`,`company`) values (5,'죠리퐁',2200,'크라운');
insert into product values (6,'마가렛트',3500,3500,'롯데');
insert into product values (7,'뿌셔뿌셔',1650,1200,'오뚜기');

select*from product;
insert into Orderd values (1, 'c102',3 ,2 ,now());
insert into orderd values (2, 'c101',4 ,1 ,now());
insert into orderd values (3, 'c108',1 ,1 ,now());
insert into orderd values (4, 'c109',6 ,5 ,now());
insert into orderd values (5, 'c102',2 ,1 ,now());
insert into orderd values (6, 'c101',7 ,3 ,now());
insert into orderd values (7, 'c110',1 ,2 ,now());
insert into orderd values (8, 'c104',2 ,4 ,now());
insert into orderd values (9, 'c102',1 ,3 ,now());
insert into orderd values (10, 'c107',6 ,1 ,now());
select*from orderd;

#실습 1-4 고객 테이블에 존재하는 모든 속성을 조회
#실습 1-5 고객 테이블에서 고객 아이디, 이름, 휴대폰 번호 조회
select custid, name, hp from customer ;
#실습 1-6 제품 테이블에 존재하는 모든 속성을 조회
select*from product;
#실습 1-7 제품 테이블에서 제조업체를 조회
select company from product;
#실습 1-8 제품 테이블에서 제조업체를 중복없이 조회
select distinct company from product;
#실습 1-9 제품 테이블에서 제품명과 단가를 조회
select prodName, price from product;
#실습 1-10 제품 테이블에서 제품명과 단가를 조회하되, 단가에 500원을 더해 조정단가로 출력
select prodname, price+500 조정단가 from product;
#실습 1-11 제품 테이블에서 오리온이제조한 제품의 제품명, 재고량, 단가를 조회
select prodname, stock, price from product where company='오리온';
#실습 1-12 주문 테이블에서 'c102' 고객이 주문한 주문제품, 수량, 주문일자를 조회
select orderproduct, ordercount, orderdate from orderd where orderid='c102';
#실습 1-13 주문 테이블에서 'ㅊ102 고객이 2개이상 주문한 주문제품, 수량, 주문일자를 조회
select orderproduct, ordercount, orderdate from orderd where custid='c102' and
ordercount >= 2; 
#실습 1-14 제품 테이블에서 단가가 1000이상 2000원 이하인 제품을 조회
select prodname, stock, price company from product where price between 1000 and 2000;
#실습 1-15 고객 테이블에서 성이 김씨인 고객의 아이디, 이름, 휴대폰, 주소를 조회
select custid, name, hp, addr from customer where name like '김%';
#실습 1-16 고객 테이블에서 고객 이름이 2자인 고객의 아이디, 이름, 휴대폰, 주소를 조회
select custid, name, hp, addr from customer where name like '__';
#실습 1-17 고객 테이블에서 휴대폰 번호가 입력되지 않은 고객을 조회
select custid, name, hp, addr from customer where hp is null;
#실습 1-18 고객 테이블에서 주소가 입력된 고객을 조회 
select *from customer where addr is not null;
#실습 1-19 고객 ㅔ이블에서 가입일을 내림차순으로 정렬하여 고객을 조회
select*from customer order by rdate desc;
#실습 1-20 주문 테이블에서 수량이 3개 이상인 주문내용을 조회 단 주문 수량으로 내림차순 정렬하고, 수량이 같으면 제품번호를 기준으로 오름차순으로 정렬
select orderno, orderid, orderproduct, ordercount, orderdate from orderd 
where ordercount >= 3 order by ordercount desc, orderproduct asc;
#실습 1-21 제품 테이블에서 모든 제품의 단가 평균을 조회
select avg(price) from product;
#실습 1-22 농심에서 제조한 제품의 재고량 합계를 조회
select sum(stock) from product where company='농심';
#실습 1-23 고객 텡이블에 고객이 몇명 등록되어 있는지 조회 
select count(*) 고객수 from customer;
#실습 1-24 제품 테이블에서 제조업체의 수를 조회
select count(distinct company) from product;
#실습 1-25 주문 테이블에서 주문제품별 수량의 합게를 조회
select orderproduct as '주문 상품번호', sum(orderCount) as '총 주문수량' from orderd group by orderproduct order by orderproduct;
#실습 1-26 제품 테이블에서 제조업체별 제좆한 제품의 개수와 제품 중 가장 비싼 단가를 조회
select company 제조업체, count(*) 제품수, max(price) 최고가 from product group by company;
#실습 1-27 제품 테이블에서 제품을 2개 이상 제조한 제조업체별로 제품의 개수와 제품 중 가장 비싼 단가를 조회
select company 제조업체, count(*) 제품수, max(price) 최고가 from product group by company having count(*) >= 2;
#실습 1-28 주문테이블에서 각 주문 고객이 주문한 제품의 총 주문수량을 주문 제품별로 조회
select orderproduct, orderid, sum(ordercount) '총 주문수량' from orderd group by orderid, orderproduct;
#실습 1-29 c102 고객이 주문한 제품의 이름을 조회
select o.orderid, p.prodname from orderd o join product p on o.orderproduct = p.prodno
where orderid = 'c102';
#실습 1-30 주문일자가 7월 3일인 고객의 아이디, 이름, 상품명 그리고 주문 날짜시간을 조회
select orderid, name, prodname, orderdate from orderd o join customer c
on o.orderid = c.custid
join product p on o.orderproduct = p.prodno
where substr(orderdate, 1, 10) = '2024-07-08';  











