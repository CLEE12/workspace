create table board2 ( 
	id number(10) primary key, 
	title varchar2(50) not null, 
	writer varchar2(20), 
	content varchar2(500), 
	hit number(10), 
	regDate Date 
);