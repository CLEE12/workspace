show databases;
use mysql;
show tables;
use sakila;
create database test;
use test;
show tables;
use world;
desc user; 
select * from user;
select * from db;
grant all on *.* to kim identified by '1234';
grant all on test.* to park identified by '1234';

use test;
show tables;
create table sawon (num int not null primary key auto_increment, 
name varchar(10), addr varchar(16)); 
-- auto_increment insert에다가 값을 넣을 때마다 무조건 1씩 증가한다.
insert into sawon (name,addr) values('하니','서울');
select * from sawon;
alter table sawon rename emp;
select * from emp;
alter table emp add (phone varchar(20));
desc emp;
alter table emp modify name varchar(20);
alter table emp change phone tel varchar(18);
drop table emp;

create table division (
 dno int not null primary key,
 dname varchar(15) not null,
 phone varchar(20) not null,
 position varchar(20) not null);
insert into division values(10,'회계','032-1111-1111','인천');
insert into division values(20,'연구소','02-1234-1234','서울');
insert into division values(30,'영업','042-2222-1234','인천');
insert into division values(40,'운영','031-3333-3333','안양');
select * from division;
create table personal (
pno int not null primary key,
pname varchar(10) not null,
job varchar(15) not null,
manager int,
startdate date,
pay int,
bonus int,
dno int not null);
desc personal;










load data local infile '/Users/JAMESCH/Desktop/MySQL/personal.txt'
 replace into table personal;



-- 2016.02.09 스칼라 함수 
use test;
select concat(pname, '의 업무는 ', job) from personal; -- concat() 오라클과 다른점 여러개를 쓸수 있다. 
select abs(-3);
select pname, reverse(pname) from personal; -- 이름을 꺼꾸로 쓴다. 
select year(startdate) from personal;
select month(startdate) from personal;
select day(startdate) from personal;
select monthname(startdate) from personal;
select dayname(startdate) from personal;
select dayname(now());
select to_days(now())-to_days('1990-5-28');
select pname, startdate from personal;
select pname, date_format(startdate, '%y/%m/%d (%W)') from personal;

select pname,pay,if(pay>3000, 'good', '헐') from personal;
select pname, dno, if(dno = 10, '회계', if(dno=20, '인사', if(dno=30, '영업', '대박'))) from personal;

select pname, pay, bonus, pay+bonus from personal;
select pname, pay, bonus, pay+ifnull(bonus, 0) from personal; -- oracle에서는 null이면 nvl 여기선 틀리다.

select * from personal;
-- 1. 이름, 대문자, 소문자
select pname, upper(pname), lower(pname) from personal;
-- 2. 이름, 급여/7, round,floor,ceiling, truncate
select pname, pay/7, round(pay/7), floor(pay/7), ceiling(pay/7), truncate(pay/7, 0) from personal;
-- 3. xxx는 급여가 yyy이다.
select concat(pname, ' 는 급여가', pay, '이다') from personal;
-- 4. 이름, 이름을 거꾸로, 이름 앞 두글자
select pname, reverse(pname), substring(pname, 1, 2) from personal;
-- 5. 이름, 입사일, 입사기간(날짜)
select pname, startdate, to_days(now())-to_days(startdate) 입사기간 from personal;
-- 6. 이름, 입사일(년도4자리/월/일 요일)
select pname, date_format(startdate, '%Y/%m/%d %W') from personal;
-- 7. 이름, 급여, 급여등급  등급 0-2900 1등급, 3000-4999 2등급, 그이상은 3등급
select pname, pay, if(pay>=5000, '3등급', if(pay>=3000, '2등급','1등급')) 급여등급 from personal;
-- 8. 이름, 급여, 연봉(연봉=(급여+보너스)*12 null 은 0)
select pname, pay, (pay+ifnull(bonus,0))*12 연봉 from personal;
-- 9. 3번을 bonus가 null인 사람 대상 급여순 정렬
select concat(pname, ' 는 급여가 ', pay, '이다') from personal where bonus is null order by pay;
-- 10. 6번을 업무가 salesman을 대상으로 하고 입사일순 정렬
select pname, date_format(startdate, '%Y/%m/%d %W') from personal where job='salesman' order by startdate;

select pname, pay from personal order by pay limit 3; -- 급여 적게 받는 사람 3명 
select pname, pay from personal order by pay desc limit 5; -- 급여 많이 받는 사람 3명 0-5
select pname, pay from personal order by pay limit 3, 3; -- 3인덱스 3번째거 3은 세명

select database(); -- 지금 쓰고 있는 데이터베이스가 어떤 것인지 알려준다. \
select password('1234'); -- 암호를 암호화 시킨다. 오라클은 따로 없어서 모듈을 등록해서 쓴다. 
select pname, pay, format(pay, 1) from personal;
select pname, pay, format(pay, 0) from personal;

select * from division;
select * from personal;
select pname, danme from personal p, division d where p.dno=d.dno;
select pname, danme from personal p right outer join division d on p.dno=d.dno;
-- join 과 subquery 문제
-- 1. 사번, 이름, 부서명, 근무지 --사번 pno, 부서코드 dno
select pno, pname, dname, position from personal p, division d where p.dno=d.dno;
-- 2. 이름, 부서코드, 부서명
select pname, d.dno, dname from personal p, division d where p.dno=d.dno;
-- 3. 사번, 이름, 급여, 사수명
select w.pno, w.pname, w.pay, m.pname 사수 from personal w , personal m where w.manager=m.pno;
-- 4. 부서명, 급여합계, 급여평균
select dname, sum(pay), avg(pay) from personal p, division d where p.dno=d.dno group by dname; 
-- 5. 이름, 급여, 연봉 단 대전에 근무하는 사람 대상 연봉=(급여+보너스)*12 null이면 0으로 처리
select pname, pay, (pay+ifnull(bonus,0))*12 연봉 from personal 
 where dno=(select dno from division where position='서울');  -- 대전은 division 테이블에 안넣었기 때문
-- 6. 회사평균보다 급여를 많이 받는 사람의 모든 정보 
select * from personal where pay > (select avg(pay) from personal);
-- 7. 자기부서평균보다 급여 많이 받는 사람의 모든 정보 -- 상관관계 쿼리
select * from personal p where pay > (select avg(pay) from personal where p.dno=dno);
-- 8. 문제1에서 직원이 없는 부서도 출력
select pno, pname, dname, position from personal p right outer join division d on p.dno=d.dno;
-- 9. 문제3에서 사수가 없는 사원도 출력
select w.pno, w.pname, w.pay, m.pname 사수 from personal w left outer join personal m on w.manager=m.pno;
-- 10.문제8을 부서명순으로 정렬
select pno, pname, dname, position from personal p right outer join division d on p.dno=d.dno order by dname;
-- 11.이름, 급여, 입사일, 입사가 빠른 3명 출력
select pname, pay, startdate from personal order by startdate limit 3;
-- 12.이름, 급여, 입사일, 부서명, 입사가 4-6인 출력
select pname, pay, startdate, dname from personal p, division d 
 where p.dno=d.dno order by startdate limit 3,3;
-- 13.이름, 급여, 자기부서평균급여 자기부서 평균보다 많이 받는 사람 대상 -- 인라인 뷰 -- 서브쿼리이지만
select pname, pay, avgPay from personal p,
 (select dno, avg(pay) avgPay from personal group by dno) a -- a 란 테이블 별칭을 붙인다. 
  where p.dno=a.dno and pay > avgPay;
-- -------------------------------------------- 파일 백업 부분 
create database test2;
use test2;
show tables;
-- drop table division;
-- drop table personal;
create table division (
 dno int not null primary key,
 dname varchar(15) not null,
 phone varchar(20) not null,
 position varchar(20) not null);
 use test2; select * from division;

select * from division;
select * into outfile 'c:/java/dv.txt' from division;
set sql_safe_updates=0; 
use test;
show tables;
drop table personal;
-- ------------------------------------------------

-- 160222MON
use test;
show tables;

drop procedure if exists division_insert;
delimiter //
create procedure division_insert
  (vdno int, vdname varchar(20), vphone varchar(20), vpos varchar(20))  
begin
  insert into division values ( vdno, vdname, vphone, vpos);
end;
//

delimiter ; -- delimiterdivision_insert
call division_insert(53, '왜', '010-3333-3333', '거기')