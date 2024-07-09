#날짜: 24/7/9
#이름: 김소진
#SQL 연습문제2
#실십2-1
create database bank;
create user 'bank'@'%' identified by '1234';
grant all privileges on bank.* to 'bank'@'%';
flush privileges;

#실십2-2
create table `bank_customer` (
`c_no` varchar(14) primary key not null,
`c_name` varchar(20) not null,
`c_dist` int default 0,
`c_phon` varchar(20) not null,
`c_addr` varchar(100) 
);

create table `bank_account` (
`a_no` varchar(11) primary key not null,
`a_item_dist` varchar(2) not null,
`a_item_name` varchar(20) not null,
`a_c_no` varchar(14) not null,
`a_balance` int not null default 0,
`a_open_date` date not null
);

create table `bank_transaction` (
`t_no` int primary key not null auto_increment,
`t_a_no` varchar(11) not null,
`t_dist` int not null,
`t_amount` int not null default 0,
`t_datetime` datetime not null
);
drop table bank_customer;
drop table bank_transaction;
#실십2-3
INSERT INTO bank_customer  VALUES
('102-22-51094', '부산의원', 2, '051-518-1010', '부산시 남구'),
('220-82-52237', '(주)한국전산', 2, '02-134-1045', '서울시 강서구'),
('361-22-42687', '(주)성원산업', 2, '031-563-1253', '경기도 광명시'),
('730423-1000001', '김유신', 1, '010-1234-1001', '경기도 수원시'),
('750210-1000002', '김춘추', 1, '010-1234-1002', '경기도 광주시'),
('830513-2000003', '선덕여왕', 1, '010-1234-1003', '서울시 마포구'),
('870830-1000004', '강감찬', 1, '010-1234-1004', '서울시 영등포구'),
('910912-2000005', '신사임당', 1, '010-1234-1005', '강원도 강릉시'),
('941127-1000006', '이순신', 1, '010-1234-1006', '부산시 영도구');

INSERT INTO bank_account (a_no, a_item_dist, a_item_name, a_c_no, a_balance, a_open_date) VALUES
('101-11-1001', 'S1', '자유저축예금', '730423-1000001', 420000, '2005-07-21'),
('101-11-1003', 'S1', '자유저축예금', '870830-1000004', 53000, '2007-02-17'),
('101-11-2001', 'S1', '자유저축예금', '220-82-52237', 23000000, '2003-04-14'),
('101-11-2002', 'S1', '자유저축예금', '361-22-42687', 4210000, '2008-12-30'),
('101-11-2003', 'S1', '자유저축예금', '102-22-51094', 8325010, '2006-01-07'),
('101-12-1002', 'S2', '정기적금예금', '830513-2000003', 1020000, '2011-05-13'),
('101-13-1005', 'S3', '주택청약예금', '941127-1000006', 720800, '2010-08-15'),
('101-21-1004', 'L1', '고객신용대출', '910912-2000005', 1200500, '2009-08-25'),
('101-22-1006', 'L2', '여신담보대출', '730423-1000001', 2500000, '2013-12-11'),
('101-23-1007', 'L3', '주택담보대출', '750210-1000002', 2700000, '2020-09-23');

INSERT INTO bank_transaction (t_no, t_a_no, t_dist, t_amount, t_datetime) VALUES
(1, '101-11-1001', 1, 50000, '2020-08-21 04:26:52'),
(2, '101-11-1003', 2, 120000, '2022-08-21 04:26:52'),
(3, '101-11-2001', 2, 300000, '2022-08-21 04:26:52'),
(4, '101-12-1002', 1, 1000000, '2022-08-21 04:26:52'),
(5, '101-11-1001', 3, 0, '2022-08-21 04:26:52'),
(6, '101-13-1005', 1, 200000, '2022-08-21 04:26:52'),
(7, '101-11-1003', 1, 450000, '2022-08-21 04:26:52'),
(8, '101-11-2002', 2, 32000, '2022-08-21 04:26:52'),
(9, '101-11-2003', 3, 0, '2022-08-21 04:26:52'),
(10, '101-11-1003', 1, 75000, '2022-08-21 04:26:52');

select*from bank_customer;
select*from bank_account;
select*from bank_transaction;

#실십2-4 모든 계좌를 조회하시오
select*from bank_account;

#실십2-5 모든 고객을 조회하시오
select*from bank_customer;

#실십2-6 모든 거래내역을 조회
select*from bank_transaction;

#실십2-7 고객의 이름과, 게좌번호를 조회
select c_name, c_no from bank_customer;

#실십2-8 모든 계좌의 구분번호와 겢좌상품 이름을 조회
select a_item_dist, a_item_name from bank_account;

#실십2-9 모든 계좌의 구분번호와 계좌상품 이름 조회, 중복 제거
select distinct a_item_dist, a_item_name from bank_account;

#실십2-10 자유저축예금 계좌 중 잔고액이 100만원 이상을 조회
select*from bank_account where a_balance  >=1000000 and a_item_name = '자유저축예금';

#실십2-11 경기도에 거주하는 고객을 조회
select*from bank_customer where c_addr like '경기도%';

#실십2-12 기업고객을 조회
select*from bank_customer where c_dist=2;

#실십2-13 거래내역 중 입금만 조회
select*from bank_transaction where t_dist = 1;

#실십2-14 출금액이 가장 큰 순서로 조회
select*from bank_transaction where t_dist = 2 order by t_amount desc;

#실십2-15 입금액의 총합과 평균을 구하시오
select sum(t_amount), avg(t_amount) from bank_transaction 
where t_dist=1;
 
#실십2-16 출금액의 가장 큰 금액과 가장 작은 금액을 출력
select max(t_amount), min(t_amount) from bank_transaction
where t_dist=2;

#실십2-17 자유저축 예금계좌에서 큰 잔고액 순으로 조회
select*from bank_account where a_item_name='자유저축예금' order by a_balance desc;

#실십2-18 가장 많은 잔고를 보유한 자유저축 예금계좌를 조회
select*from bank_account where a_item_dist='S1' order by a_balance desc limit 1;

#실십2-19 거래내역에서 입금액과 출금액이 각각 큰 순서로 조회
select*from bank_transaction where t_dist=1 or t_dist=2 order by t_dist, t_amount desc;
select*from bank_transaction where t_dist in(1,2) order by t_dist, t_amount desc;

#실십2-20 거래내역에서 입금 건수, 출금 건수, 조회 건수를 조회
select count(case when t_dist=1 then 1 end) '입금 건수',count(case when t_dist=2 then 2 end) '출금 건수', count(case when t_dist=3 then 3 end) '조회 건수'
from bank_transaction;

#실십2-21 거래내역에서 거래 구분번호를 통해 type을 아래와 같이 조회
select t_dist, case when t_dist=1 then '입금'  when t_dist=2 then '출금' when t_dist =3 then '조회'
end as `type`, t_a_no, t_amount from bank_transaction; 

#실십2-22 각 거래별 카운트를 조회
select t_dist, count(t_no) from bank_transaction group by t_dist;

#실습 2-23 입금 거래만 계좌별로 합계 조회
select t_a_no, t_dist, sum(t_amount) from bank_transaction where t_dist=1
group by t_a_no;

#실습2-24 입금 거래만 계좌별로 합계 구하고 10만원 이상만 큰 순서로 조회
select t_a_no, t_dist, sum(t_amount) '합계' from bank_transaction where t_dist=1
group by t_a_no 
having sum(t_amount) >= 100000
order by '합계' desc;
 
#실습2-25 계좌 테이블과 고객 테이블을 결합 
select*from bank_account as a join bank_customer c
on a.a_c_no=c.c_no 
join bank_transaction t on a.a_no=t.t_a_no;

#실습2-26 조회 계좌번호, 계좌이름, 주민번호, 고객명, 현재잔액
select a_no a,a.a_item_name, a.a_c_no, c.c_name, a.a_balance from bank_account as a join bank_customer c
on a.a_c_no=c.c_no 
join bank_transaction t on a.a_no=t.t_a_no;

#실습2-27 거래 테이블과 계좌 테이블을 결합
select*from bank_transaction t join bank_account a on t.t_a_no=a.a_no;

#실습2-28 조회
select t_no 거래번호, t_a_no 계좌번호, a_c_no 고객번호, t_dist 거래구분, t_amount 거래금액, t_datetime 거래일자 
from bank_account a join bank_transaction t on t.t_a_no = a.a_no;

#실습2-29 거래 구분이 입금이고 큰 거래금액 순으로 아래와 같이 데이터가 조회
select t_no, a_no, c_no, t_dist, a_item_name, c_name, t_amount, t_datetime
from bank_transaction t join bank_account on t.t_a_no=a.a_no
join bank_customer c on c.c_no= a.a_c_no where t.t_dist = 1
order by t.t_amount desc;

#실습2-30 거래구분이 입금, 출금이고 개인 고객을 대상으로 거래건수를 조회,단 거래구분은 작은 순서로 거래건수는 큰순서로 정렬
select t_no, a_no, c_no, t_dist, a_item_name, c_name, count(t_no) as '거래건수'
from bank_transaction t join bank_account a on t.t_a_no=a.a_no 
join bank_customer c on c.c_no= a.a_c_no where t_dist In(1, 2) and c_dist = 1
order by t_dist, '거래건수' desc;

SET SESSION sql_mode = 'STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

