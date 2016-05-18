show databases;
use mysql;
show tables; -- table을 보는것
use sakila; -- use 는 sakila라는 데이터베이스를을 쓰겠다.
create database test;
use test;
show tables;
use world;
drop database sakila;
use sakila;
desc user;

create table division (
dno int not null primary key,
name varchar(15) not null,
phone varchar(20) not null,
Position varchar(20) not null);
insert into division values(10, '회계', '032-1111-1111', '인천');
insert into division values(20, '서울', '02-1234-1234', '서울');
insert into division values(30, '영업', '042-2222-2222', '대전');
insert into division values(40, '운영', '052-3333-5555', '부산');
desc division;
select * from division;

create table personal (
pno int not null primary key,
pname varchar(10) not null,
job varchar(15) not null,
manager int, startdate date,
pay int, bonus int, dno int not null
);
desc personal;

show tables; 
use test; 
desc personal; -- personal에 있는 상세
load data local infile 'C:/db/mysql/personal.txt'
replace into table personal;
select * from personal;



-- 문제
-- 1. 사번, 이름, 업무
select pno, pname, job from personal;
-- 2. 사번, 이름, 급여, 보너스 보너스간 null이 아닌경우
select pno, pname, pay, bonus from personal where bonus is not null;
-- 3. 이름, 급여 급여가 1500-3500
select pname, pay from personal where pay between 1500 and 3500;
-- 4. 이름, 업무, 급여 업무가 saleman이거나 manager
select pname, job, pay from personal where job in ('saleman', 'manager');
-- 5. 업무 종류
select distinct job from personal; -- distinct는 중복을 제거 
-- 6. 이름, 업무, 부서코드, 급여 부서코드순 급여큰순
select pname, job, dno, pay from personal order by dno, pay desc;
-- 7. 이름이 j로 시작하는 사람 이름
select pname from personal where pname like 'j%'; -- % 문자열, _문자
-- 8. 이름 2번째 문자가 'o'인 사람 이름
select pname from personal where pname like '_o%';
-- 9. 급여가 4000이상이거나 saleman인 사람 이름, 업무, 급여 업무순 급여큰순
select pname, job, pay from personal where pay>=4000 or job='saleman' order by job, pay desc;
-- 10. 이름, 급여, 연봉 (연봉 = 급여 *12) 별칭 사용 연봉큰순 정렬
select pname, pay, pay*12 연봉 from personal order by 연봉;

-- 문제2
-- 1. 부서코드, 급여합계, 최대급여 부서별로
select dno, sum(pay), max(pay) from personal group by dno;
-- 2. 업무, 급여평균, 인원수, 최소급여 업무별로
select job, avg(pay), count(*), min(pay) from personal group by job;
-- 3. 부서코드, 급여합계, 인원수 단 인원이 4명 이상대상
select dno, sum(pay), count(*) from personal group by dno having count(*)>=4; -- group 함수에선 where대신 having으로 조건을 참조. 
-- 4. 급여가 1500-7500 부서코드, 급여합계, 최대급여 부서별 정렬, 최대급여가 큰순 정렬
select dno, sum(pay), max(pay) from personal group by dno order by max(pay) desc;
-- 5. 부서코드, 업무, 급여합계 부서순 정렬 부서가 같으면 급여합계순
select dno, job, sum(pay) from personal group by dno order by dno, max(pay);