create table board1 (
	num number primary key, --key
	writer varchar2(20) not null, --writer
	subject varchar2(50) not null,
	content varchar2(500) not null,
	email varchar2(30),
	readcount number default 0,
	passwd varchar2(12) not null,
	ref number not null, --답변글끼리 그룹
	re_step number not null, --순서
	re_level number not null, --들여쓰기
	ip varchar2(20) not null, --작성자 ip
	reg_date date not null,
	del_yn char(1) not null default 'n'
	);
	
	
alter table board1 add (del_yn char(1)default 'n');
update table board1 set del_yn = 'n';
select * from board1;
update board1 set readcount=300 where num=2;
select count(*) from board1;

drop table board1;