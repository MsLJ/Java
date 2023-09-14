--회원
--		id
--		pw
--		이름
-----------------
--sns
--	번호
--	글쓴이id
--	내용

--1.없는 id로 글 안써졌으면
--2.탈퇴하면 그 사람이 한 거 다 지우자
-- 그거 좀 자동으로 됐으면..
-- ->foreign key(외래키)

create table may04_user_ms(
	u_id varchar2(15 char)primary key,
	u_pw varchar2(15 char) not null,
	u_name varchar2(15 char)not null

);

--1.없는 id로 글 안써졌으면(해결)
--constraint 제약조건명
--		foreign key (필드명)
--		references 테이블명(필드명)
--2.탈퇴하면 그 사람이 한 거 다 지우자(해결)
--		on delete cascade
create table may04_sns_ms(
	s_no number(4)primary key,
	s_writer varchar2(15 char)not null,
	s_txt varchar2(30 char)not null,
	constraint sns_writer
		foreign key(s_writer)
		references may04_user_ms(u_id)
		on delete cascade
);
create sequence may04_sns_seq;
------------------------------------
--회원가입
insert into may04_user_ms values('dog','123456','골든 리트리버');
--글쓰기
insert into may04_sns_ms values(may04_sns_seq.nextval,'dog','멍멍');
insert into may04_sns_ms values(may04_sns_seq.nextval,'cat','멍멍멍');

--dog탈퇴
delete from may04_user_ms
where u_id='dog';

drop table may04_user_ms cascade constraint purge;
drop table may04_sns_ms cascade constraint purge;


