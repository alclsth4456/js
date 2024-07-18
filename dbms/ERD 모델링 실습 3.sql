insert into users values ('user1','김유신','1976-91-21','M','010-1101-1976','kimys@naver.com',0,1,'서울',now());
insert into users (`userId`,`userName`,`userBirth`,`userGender`,`userHp`,userPoint,`userLevel`,`userAddr`,`userRegDate`) values ('user2','계백','1975-06-11','M','010-1102-1976',0,1,'서울',now());
insert into users (`userId`,`userName`,`userBirth`,`userGender`,`userHp`,userPoint,`userLevel`,`userAddr`,`userRegDate`) values ('user3','김춘추','1989-05-30','M','010-1103-1976',0,1,'서울',now());
insert into users values ('user4','이사부','1979-04-13','M','010-2101-1976','leesabu@gmail.com',0,1,'서울',now());
insert into users values ('user5','장보고','1966-09-12','M','010-2104-1976','jangbg@naver.com',0,1,'서울',now());
insert into users values ('user6','선덕여왕','1979-07-28','M','010-3101-1976','gueen@naver.com',0,1,'서울',now());
insert into users values ('user7','강감찬','1984-06-15','F','010-4101-1976','kang@daum.net',0,1,'서울',now());
insert into users values ('user8','신사임당','1965-10-21','M','010-5101-1976','sinsa@gmail.com',0,1,'서울',now());
insert into users values ('user9','이이','1972-11-28','M','010-6101-1976','leelee@nate.com',0,1,'서울',now());
insert into users (`userId`,`userName`,`userBirth`,`userGender`,`userHp`,userPoint,`userLevel`,`userAddr`,`userRegDate`) values ('user10','허난설헌','1992-09-07','M','010-7101-1976',0,1,'서울',now());

select*from points;

insert into points values (1,'user1',1000,'회원가입 1000 적립',now());
insert into points values (2,'user1',6000,'상품구매 5% 적립',now());
insert into points values (3,'user3',2835,'상품구매 5% 적립',now());
insert into points values (4,'user7',3610,'상품구매 5% 적립',now());
insert into points values (5,'user5',3000,'이벤트 응모 3000 적립',now());
insert into points values (6,'user2',1000,'회원가입 1000 적립',now());
insert into points values (7,'user2',2000,'이벤트 응모 2000 적립',now());
insert into points values (8,'user2',2615,'상품구매 5% 적립',now());
insert into points values (9,'user3',1500,'이벤트 응모 1500 적립',now());
insert into points values (10,'user6',15840,'상품구매 2% 적립',now());
select*from users;
select*from points;
select*from sellers;

insert into sellers values(10001,'(주)다팔아','02-201-1976','정우성','서울');
insert into sellers values(10002,'판매의민족','02-102-1975','이정재','서울');
insert into sellers values(10003,'멋남','031-103-1989','원빈','경기');
insert into sellers values(10004,'스타일살아','032-201-1979','이나영','경기');
insert into sellers values(10005,'(주)삼성전자','02-214-1996','장동건','서울');
insert into sellers values(10006,'복실이옷짱','051-301-1979','고소영','부산');
insert into sellers values(10007,'컴퓨존(주)','055-401-1984','유재석','대구');
insert into sellers values(10008,'(주)LG전자','02-511-1965','강호동','서울');
insert into sellers values(10009,'(주)굿바디스포츠','070-6101-1972','조인성','부산');
insert into sellers values(10010,'누리푸드','051-701-1992','강동원','부산');

insert into products values (100101,11,10003,'반팔티 L~2XL',869,25000,132,20);
insert into products values (100110,10,10004,'트레이닝 통바지',1602,38000,398,15);
insert into products values (110101,10,10003,'신상 여성운동화',160,76000,40,5);
insert into products (PRODNO,CATENO,SELLERNO,PRODNAME,PRODPRICE,PRODSOLD,PRODDISCOUNT) VALUES (120101,12,10010,'암소 1등급 구이셋트 1.2KG',150000,87,15);
insert into products (PRODNO,CATENO,SELLERNO,PRODNAME,PRODPRICE,PRODSOLD,PRODDISCOUNT) VALUES (120103,12,10010,'바로구이 부채살 250G',21000,61,10);
insert into products valueS (130101,13,10006,'[ANF] 식스프리 강아지 사료',58,56000,142,0);
insert into products valueS (130112,13,10006,'중대형 사계절 강아지옷',120,15000,80,0);
insert into products (PRODNO,CATENO,SELLERNO,PRODNAME,PRODPRICE,PRODSOLD,PRODDISCOUNT) VALUES (141001,14,10001,'라떼 2인 소파/방수 패브릭',320000,42,0);
insert into products valueS (170115,17,10007,'지포스 3080 그래픽카드',28,900000,12,12);
insert into products value (160103,16,10009,'치닝디핑 33BR 철봉',32,120000,28,0);

select*from orders;

insert into Orders values(22010210001, 'user2', 52300, '서울시 마포구 121', 1, '2022-01-10 10:50:12');
insert into Orders values(22010210002, 'user3', 56700, '서울시 강남구 21-1', 1, '2022-01-10 10:50:12');
insert into Orders values(22010210000, 'user4', 72200, '서울시 강서구 큰대로 38', 2, '2022-01-10 10:50:12');
insert into Orders values(22010310001, 'user5', 127000, '경기도 광주시 초월로 21', 1, '2022-01-10 10:50:12');
insert into Orders values(22010310000, 'user1', 120000, '경기도 수원시 120번지', 0, '2022-01-10 10:50:12');
insert into Orders values(22010410101, 'user6', 792000, '부산시 남구 21-1', 2, '2022-01-10 10:50:12');
insert into Orders values(22010510021, 'user7', 92000, '부산시 부산진구 56 10층', 4, '2022-01-10 10:50:12');
insert into Orders values(22010510027, 'user8', 112000, '대구시 팔달로 19', 3, '2022-01-10 10:50:12');
insert into Orders values(22010510031, 'user10', 792000, '대전시 한발로 24-1', 2, '2022-01-10 10:50:12');
insert into Orders values(22010710110, 'user9', 94500, '광주시 충열로 11', 1, '2022-01-10 10:50:12');

insert into carts values(1,'user1',100101,1,now());
insert into carts values(2,'user1',100110,2,now());
insert into carts values(3,'user3',120103,1,now());
insert into carts values(4,'user4',130112,1,now());
insert into carts values(5,'user5',130101,1,now());
insert into carts values(6,'user2',110101,3,now());
insert into carts values(7,'user2',160103,1,now());
insert into carts values(8,'user2',170115,1,now());
insert into carts values(9,'user3',110101,1,now());
insert into carts values(10,'user6',130101,1,now());

select*from orderitems;
insert into orderitems values (1,'220102101',100110,38000,15,1);
insert into orderitems values (1,'220102101',100110,38000,15,1);
insert into orderitems values (1,'220102101',100110,38000,15,1);
insert into orderitems values (1,'220102101',100110,38000,15,1);
insert into orderitems values (1,'220102101',100110,38000,15,1);
insert into orderitems values (1,'220102101',100110,38000,15,1);
insert into orderitems values (1,'220102101',100110,38000,15,1);
insert into orderitems values (1,'220102101',100110,38000,15,1);
select*from carts;
#users(userId), 
#실습1. 모든 장바구니 내역에서 고객명, 상품명, 상품수량을 조회 단, 상품품수량 2건이상만 조회할 것
#고객, 상품, 조인
select u.username, p.
#실습2. 모든 상품내역에서 상품번호, 상품카테고리명, 상품명, 상품가격, 판매자이름, 판매자 연락처를 조회
#상품, 판매자 조인

#3. 모든 고객의 아이디, 이름, 휴대폰, 현재포인트, 적립포인트 총합을 조회
#고객, 포인트 조인

#4. 모든 주문의 주문번호, 주문자 아이디, 고객명, 주문가격, 주문일자를 조회
#주문, 고객 조인

#5. 모든 주문의 주문번호, 주문자 아이디, 고객명, 상품명, 주문일자를 조회, 주문번호는 중복 없이 상품명은 구분자 ,로 나열
#주문, 고객, 상품 조인

#6. 모든 상품의 상품번호, 상품명, 상품가격, 할인율, 할인된 가격을 조회
#상품, 

#7. 고소영이 판매하는 모든 상품의 상품번호, 상품명, 상품가격, 재고수량, 판매자이름을 조회
#상품, 고객, 판매자, 조인

#8.아직 상품을 판매하지 않은 판매자의 판매자번호, 판매자상호, 판매자 이름, 판매자 연락처를 조회
#상품, 판매자, 조인

#9. 모든 주문상세내역 중 개별 상품 가격과 개수 그리고 할인율이 적용된 가격을 구하고 그 가격으로 주문별 총합을 구해서 주문별 10만원이상 
#그리고 큰 금액 순으로 주문번호, 최종종합을 조회
#주문, 상품, 조인

#10. 장보고 고객이 주문했던 모든 상품명을 고객명, 상품명으로 조회
#고객, 주문, 상품, 조인