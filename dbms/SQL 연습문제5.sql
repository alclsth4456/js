#실습 5-2
-- 고객 테이블 생성
CREATE TABLE Customer (
    `custId` INT AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(10) NOT NULL,
    `address` VARCHAR(20) DEFAULT NULL,
    `phone` VARCHAR(13) DEFAULT NULL
);

-- 책 테이블 생성
CREATE TABLE Book (
    bookId INT PRIMARY KEY,
    bookName VARCHAR(20) NOT NULL,
    publisher VARCHAR(20) NOT NULL,
    price INT DEFAULT NULL
);

-- 주문 테이블 생성
CREATE TABLE `Order` (
    orderId INT AUTO_INCREMENT PRIMARY KEY,
    custId INT NOT NULL,
    bookId INT NOT NULL,
    salePrice INT NOT NULL,
    orderDate DATE NOT NULL
);

#실습 5-3
insert into customer values (1,'박지성','영국 맨체스타','000-5000-0001');
insert into customer values (2,'김연아','대한민국 서울','000-6000-0001');
insert into customer values (3,'장미란','대한민국 강원도','000-7000-0001');
insert into customer values (4,'추신수','미국 클리블랜드','000-8000-0001');
insert into customer (`custId`,`name`,`address`)values (5,'박세라','대한민국 대전');

select*from customer;
select*from book;
drop table book;
INSERT INTO Book (bookId, bookName, publisher, price) VALUES (1, '축구의 역사', '굿스포츠', 7000);
INSERT INTO Book (bookId, bookName, publisher, price) VALUES (2, '축구아는 여자', '나무수', 13000);
INSERT INTO Book (bookId, bookName, publisher, price) VALUES (3, '축구의 이해', '대한미디어', 22000);
INSERT INTO Book (bookId, bookName, publisher, price) VALUES (4, '골프 바이블', '대한미디어', 35000);
INSERT INTO Book (bookId, bookName, publisher, price) VALUES (5, '피겨 교본', '굿스포츠', 8000);
INSERT INTO Book (bookId, bookName, publisher, price) VALUES (6, '역도 단계별기술', '굿스포츠', 6000);
INSERT INTO Book (bookId, bookName, publisher, price) VALUES (7, '야구의 추억', '이상미디어', 20000);
INSERT INTO Book (bookId, bookName, publisher, price) VALUES (8, '야구를 부탁해', '이상미디어', 13000);
INSERT INTO Book (bookId, bookName, publisher, price) VALUES (9, '올림픽 이야기', '삼성당', 7500);
INSERT INTO Book (bookId, bookName, publisher, price) VALUES (10, 'Olympic Champions', 'perason', 13000);

insert into `order` values(1 ,1 ,1 ,6000,'2014-07-01');
insert into `order` values(2 ,1 ,3 ,6000,'2014-07-03');
insert into `order` values(3 ,2,5 ,6000,'2014-07-03');
insert into `order` values(4 ,3 ,6 ,6000,'2014-07-04');
insert into `order` values(5 ,4 ,7 ,6000,'2014-07-05');
insert into `order` values(6 ,1 ,2 ,6000,'2014-07-07');
insert into `order` values(7 ,4 ,8 ,6000,'2014-07-07');
insert into `order` values(8 ,3 ,10 ,6000,'2014-07-08');
insert into `order` values(9 ,2 ,10 ,6000,'2014-07-09');
insert into `order` values(10 ,3 ,8 ,6000,'2014-07-10');

#실습 5-4 모든 회원의 회원번호, 이름, 주소를 조회
select custid, name, address from customer;

#실습 5-5 모든 도서의 이름과 가격을 조회
select price, bookname from book;

#실습 5-7 모든 도서의 도서번호, 도서이름, 출판사, 가격을 조회
select bookid, bookname, publisher, price from book;

#실습 5-8 도서 테이블에 있는 모든 출판사를 조회
select publisher from book;

#실습 5-9 도서 테이블에 있는 모든 출판사를 조회 단, 중복제거
select distinct publisher from book;

#실습 5-10 가격이 20000원이상인 도서를 조회
select*from book where price >= 20000;

#실습 5-11 가격이 20000원 미만인 도서를 조회
select *from book where price <20000;

#실습 5-12 가격이 10000원 이상 20000이하인 도서를 조회
select*from book where price between 10000 and 20000;

#실습 5-13 가격이 15000이상 30000 이하인 도서의 도서번호, 도서명, 도서가격을 조회
select bookid, bookname, price from book where price between 15000 and 30000;

#실습 5-14 도서번호가 2, 3, 5인 도서를 조회
select*from book where bookid in(2,3,5); 

#실습 5-15 도서번호가 짝수번호인 도서를 조회
select*from book where mod(bookid, 2)=0;

#실습 5-16 박씨 성  고객을 조회
select*from customer where name like '박%';

#실습 5-17 대한민국에 거주하는 고객을 조회
select*from customer where address like '대한민국%';

#실습 5-18 휴대폰 번호가 유효한 고객만 조회
select *from customer where phone is not null;

#실습 5-19 출판사가 굿스포츠 혹은 대한미디어인 도서를 조회
select *from book where publisher= '굿스포츠' or '대한미디어';

#실습 5-20 축구의 역사를 출간한 출판사를 조회
select publisher from book where bookname like '축구의 역사%';

#실습 5-21 도서이름에 축구가 포함된 출판사를 조회
select publisher from book where bookname like '축구%';

#실습 5-22 도서일므의 왼쪽 두번째 위치에 구라는 문자열을 갖는 도서를 조회
select * from book where bookname like '_구%';

#실습 5-23 축구에 관한 도서 중 가격이 20000원 이상인 도서를 조회
select * from book where bookname like '축구%' and price >=20000;

#실습 5-24 도서를 이름순으로 조회
select*from book order by bookName asc;

#실습 5-25 도서를 가격순으로 조회 가격이 같으면 이름순으로 조회
select *from book order by price desc , bookname asc;

#실습 5-26 도서를 가격의 내림차순으로 조회, 단 가격이 같다면 출파사를 오름차순으로 조회
select *from book order by price desc, publisher asc;

#실습 5-27 도서가격이 큰 1,2,3위 도서를 조회
select*from book order by price desc limit 3;

#실습 5-28 
select*from book order by price asc limit 3;

#실습 5-29 고객이 주문한 도서의 총 판매액을 조회
select sum(o.salePrice) from `order` o join book c on o.bookId = b.bookId;

#실습 5-30 고객이 주문한 도서의 총 판매액, 평균값, 최저가, 최고가를 조회
select sum(o.salePrice), avg(o.salePrice), min(o.salePrice), max(o.salePrice) from `order` o join customer c on o.custid=c.custid;

#실습 5-31 도서 판매 건수를 조회
select count(*) from customer c join `order` o on c.custid = o.custid;

#실습 5-32 도서제목에 야구가 포함된 도서를 농구로 변경한 후 도서 목록을 조회
select*from book where bookname like '축구%';
UPDATE book
SET bookname = REPLACE(bookname, '축구', '농구')
WHERE bookname LIKE '%축구%';
select*from book;

#실습 5-33 가격이 8000이상인 도서를 구매한 고객에 대하여 고객별 주문도서의 총 수량을 조회, 단, 두권이상 구매한 고객만 조회
SELECT o.custid, COUNT(*) count
FROM `order` o
JOIN customer c ON o.custid = c.custid
WHERE o.saleprice >= 8000
GROUP BY o.custid
HAVING COUNT(*) >= 2;

#실습 5-34고객과 고객의 주문에 관한 데이터를 모두 조회
select*from customer c join `order` o on c.custid=o.custid;

#실습 5-35 고객과 고객의 주문에 관한 데이터를 고객번호 순으로 정렬하여 조회
select*from customer c join `order` o on o.custid=c.custid
group by custid order by custid asc;

#실습 5-36 고객의 이름과 고객이 주문한 도서의 판매가격을 조회
select c.name, o.saleprice from customer c join `order` o on o.custid=c.custid; 

#실습 5-37 고객별로 주문한 모든 도서의 총 ㅍㄴ매액을 조회, 고객별로 정렬
select c.name, sum(saleprice) from customer c join `order` o on o.custid=c.custid
group by name; 

#실습 5-38 고객의 이름과 고객이 주문한 도서의 이름을 조회
select c.name, b.name
from book b
join `order` o on o.bookId = b.bookId
join customer c on o.custid = c.custid;


#실습 5-39 가격이 20000원 도서를 주문한 고객의 이름과 도서의 이름을 조회
select c.name, b.bookname o from book b 
join `order` o on o.bookId = b.bookId
join customer c on o.custid = c.custid
where saleprice =20000;

#실습 5-40 도서를 구매하지 않은 고객을 포함해서 고객명과 주문한 도서의 판매가격을 조회
select c.name, saleprice from customer c
left join `order` o  using(`custid`);

#실습 5-41 김연아 고객이 주문한 도서의 총 판매액을 조회
select sum(saleprice) from customer c join `order` o on o.custid = c.custid
where name like '김연아';
SET SESSION sql_mode = 'STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

#실습 5-42 가장 비싼 도서의 이름을 조회
SELECT bookname
FROM book
ORDER BY price DESC
LIMIT 1;
select*from book;

#실습 5-43 도서를 주문하지 않은 고객의 이름을 조회
select c.name 
from customer c 
left join `order` o using(custid)
where o.custid is null;  

#실습 5-44 book테이블에 새로운 도서 스포츠 의학을 삽입, 스포츠 의학은 한솔의학서적에서 출간했으며 가격은 미정
insert into book (`bookid`,`bookname`,`publisher`) values(11,'스포츠 의학','한솔의학서적');
select*from book;

#실습 5-45 customer 테이블에서 고객번호가 5인 고객의 주소를 대한민국 부산으로 변경
update customer set address = '대한민국 부산' where custid = '5'; 
select*from customer;

#실습 5-46 customer 테이블에서 고객번호가 5인 고객을 삭제
delete from customer where custid = 5; 












