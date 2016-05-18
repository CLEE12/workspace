create table userAccount (
	userId varchar2(20) primary key,
	userName varchar2(20),
	password varchar2(20),
	postCode varchar2(8),
	address VARCHAR2(50),
	email VARCHAR2(50),
	job VARCHAR2(30),
	birthday DATE
);
insert into userAccount values ('kk1','길동이','kk1','111-111',
	'서울시 서초구','kk1@korea.net','사회인','1979-01-01');
insert into userAccount values ('kk2','길동이','kk2','222-222',
	'부산시 남구','kk2@korea.net','사회인','1979-06-30');
insert into userAccount values ('kk3','길동이','kk3','333-333',
	'인천시 북구','kk3@korea.net','학생','1985-12-31');
select * from userAccount;