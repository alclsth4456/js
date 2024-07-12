#Sql 연습문제3
SET SESSION sql_mode = 'STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
#실습3-2
create table student (
`stdNo` char(8) not null primary key,
`stdName` varchar(20) not null,
`stdHp` char(13) unique key not null,
`stdYear` int not null,
`stdAddress` varchar(100)
);
drop table student;
select*from student;
create table lecture (
`lecNo` int primary key not null ,
`lecName` varchar(20) not null,
`lecCredit` int not null,
`lecTime` int not null,
`lecClass` varchar(10)
);
drop table register;
create table register(
`regStdNo` char(8) not null,
`regLecNo` int not null,
`regMidScore` int ,
`regFinalScore` int,
`regTotalScore` int,
`regGrade` char(1)
);
select*from student;
select*from register;
select*from lecture;
#실습3-3
INSERT INTO student (stdNo, stdName, stdHp, stdYear, stdAddress) VALUES
('20201016', '김유신', '010-1234-1001', 3, NULL),
('20201126', '김춘추', '010-1234-1002', 3, '경상남도 경주시'),
('20210216', '장보고', '010-1234-1003', 2, '전라남도 완도시'),
('20210326', '강감찬', '010-1234-1004', 2, '서울시 영등포구'),
('20220416', '이순신', '010-1234-1005', 1, '부산시 부산진구'),
('20220521', '송상현', '010-1234-1006', 1, '부산시 동래구');

INSERT INTO lecture (lecNo, lecName, lecCredit, lecTime, lecClass) VALUES
(159, '인지행동심리학', 3, 40, '본304'),
(167, '운영체제론', 3, 25, '본B05'),
(234, '중급 영문법', 3, 40, '본201'),
(239, '세법개론', 3, 20, '본204'),
(248, '빅데이터 개론', 3, 40, '본B01'),
(253, '컴퓨팅사고와 코딩', 2, 10, '본B02'),
(349, '사회복지 마케팅', 2, 50, '본301');

INSERT INTO register (regStdNo, regLecNo) VALUES
('20201126', 234),
('20201016', 248),
('20201016', 253),
('20201126', 239),
('20201126', 349),
('20210216', 349),
('20210326', 349),
('20201016', 167),
('20220416', 349);

#실습3-4 강좌를 조회
select*from lecture;
#실습3-5 학생을 조회
select*from student;
#실습3-6 수강신청 내역을 조회
select*from register;
#실습3-7 3학년 학생을 조회
select *from student where stdYear=3;
#실습3-8 2학점짜리 강좌를 조회
select * from lecture where lecCredit=2;
#실습3-9 중간고사 기말고사 점수를 입력 후 조회
UPDATE register SET `regMidScore` = 36, `regFinalScore` = 42 WHERE `regstdno` = '20201126' AND `reglecno` = 234;
UPDATE register SET `regmidscore` = 24, `regfinalscore` = 62 WHERE `regstdno` = '20201026' AND `reglecno` = 248;
UPDATE register SET regmidscore = 28, regfinalscore = 40 WHERE regstdno = '20201016' AND reglecno = 253;
UPDATE register SET regmidscore = 37, regfinalscore = 57 WHERE regstdno = '20201016' AND reglecno = 239;
UPDATE register SET regmidscore = 28, regfinalscore = 68 WHERE regstdno = '20201126' AND reglecno = 349;
UPDATE register SET regmidscore = 16, regfinalscore = 65 WHERE regstdno = '20210216' AND reglecno = 349;
UPDATE register SET regmidscore = 18, regfinalscore = 38 WHERE regstdno = '20210326' AND reglecno = 167;
UPDATE register SET regmidscore = 18, regfinalscore = 58 WHERE regstdno = '20220416' AND reglecno = 349;


#실습3-10 총점과 등급을 입력 후 조회
update register set 
regtotalscore=regmidscore + regfinalscore,
regfrade=if(regtotalscore >= 90, 'A',
		if(regtotalscore >=80, 'B',
        if(regtotalscore >= 70, 'C',
        if(regtotalscore >= 60, 'D', 'F'))));
        select*from register;

#실습11 점수가 큰 순서로 정렬
select*from register where regtotalscore order by regtotalscore desc;

#실습3-12 강좌번호가 349번이면서 총점이 가장 큰 순서로 조회
select*from register where reglecno=349 order by regtotalscore desc;
select*from lecture;
#실습3-13 30시간 이상인 강좌를 조회
select*from lecture where lectime >= 30;

#실습3-14  강좌명과 강의실을 조회
select lecname, lecclass from lecture;

#실습3-15 학번과 이름을 조회
select stdno, stdname from student;

#실습3-16 주소를 입력하지 않은 학생을 조회
select*from student where stdaddress is null;

#실습3-17  부산에 거주하는 햑생을 조회
select*from student where stdaddress like '부산%';

#실습3-18 학생과 수강 테이블을 결합 단, 수강신청하지 않아 점수가 없어도 조회 될것
select*from student s left join register r on s.stdno=r.regstdno;

#실습3-19???
select stdno, stdname,r.regLecNo, r.regMidScore, r.regFinalScore, r.regTotalScore, r.regGrade
from student s, register r where s.stdno= r.regstdno;

#실습3-20 강좌번호 349를 수강 신청한 학생의 이름과 학번을 조회
select stdname, stdno, reglecno from student s join register r on s.stdno= r.regstdno
where reglecno=349;

#실습3-21 학생별 수강 신청 건수와 모든 수강과목의 전체점수 합게, 평균을 조회
select stdno, stdname, count(stdno) as '수강신청 건수',
sum(regtotalscore) as '종합점수',
sum(regtotalscore) / count(stdno) as '평균'
from student as s join register as r on s.stdno = r.regstdno
group by stdNo;

#실습3-22  수강 테이블과 강좌 테이블을 결합
 select*from lecture r join register g on r.lecno=g.reglecno;
 
#실습3-23 
select regstdno, regleno, lecname, regmidscore, regfinalscore, regtotalscore, reggrade
from register g join lecture l on g.reglecno=l.lecno; 

#실습3-24 사회복지 마케팅 강좌를 신청한 건수와 평균을 조회
select count(*) as'수강신청 건수',
avg(regtotalscore) as '평균'
from register as r join lecture as l on r.reglecno = l.lecno
where lecName='사회복지 마케팅';

#실습3-25 A등급을 받은 학번과 강좌명을 조회
select regstdno, lecname from register r join lecture l on r.reglecno = l.lecno
where reggrade = 'A';

#실습3-26 학생테이블과 수강테이블 그리고 강좌테이블을 결합
select*from student s 
join register r on s.stdno=r.regstdno
join  lecture l on l.lecno = r.reglecno;

#실습3-27 
select stdno,stdname,lecno,lecname,regmidscore,regfinalscore,regtotalscore,reggrade
from student s join register r on s.stdno=r.regstdno
join  lecture l on l.lecno = r.reglecno;
#실습3-28 f학점을 받은 학번과 이름,수강과목명, 점수 그리고 등급을 조회
select stdNo, stdName, lecName, regTotalScore, regGrade
from student s 
join register r on s.stdno=r.regstdno
join  lecture l on l.lecno = r.reglecno
where regGrade = 'F';
#실습3-29  학생별 이수학점을 조회, 단, f등급은 받은 과목은 학점으로 인정되지 않음
select stdNo, stdname, sum(lecCredit) '이수학점'
from Student s join register r on s.stdno=r.regstdno 
join  lecture l on l.lecno = r.reglecno
where `regGrade` <> 'F'
group by `stdNo`;

#실습3-30 신청과목과 이수과목을 조회, 단 F등급은 받은 과목은 이수과목으로 인정안됨
select stdNo, stdName, group_concat(`lecName`) '신청과목',
group_concat(if(regtotalScore >= 60, lecName, null)) 이수과목
from Student s join register r on s.stdno=r.regstdno 
join  lecture l on l.lecno = r.reglecno
where `regGrade` <> 'F'
group by stdNo;
