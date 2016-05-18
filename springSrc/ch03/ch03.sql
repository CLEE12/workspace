create table owner (
	ownerName varchar(20) primary key
);
select * from owner;
create table pet (petId number(10) primary key, 
	petName varchar2(20),
	ownerName varchar2(20) references owner(ownerName),
	price number(10), 
	birthDate date
);
Insert into owner values ('aa');
Insert into owner values('kk');
insert into owner values('부산동생');
Insert into pet values(1, 'tom' ,'aa', 10000 , sysdate);
Insert into pet values(2, 'jerry' ,'kk', 10000 , sysdate);
Insert into pet values(3,'mary','kk', 10000 , sysdate);
select * from owner;
select * from pet;


create table member3 (
	id varchar2(20) primary key,
	email varchar2(20),
	password varchar2(10),
	name varchar2(20),
	regdate date
);
select * from member3;