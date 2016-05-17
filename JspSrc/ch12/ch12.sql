create table member2(
	id varchar2(12) primary key,
	passwd varchar2(12) not null,
	name varchar2(20) not null,
	address varchar2(20),
	tel varchar2(20) not null,
	reg_date date
);
select * from member2;
alter table member2 rename column password to passwd;