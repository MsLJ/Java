
 --테이블 만들기
--create table snack(
--열제목 자료형[옵션],
--필드명 자료형[옵션],
--...
--);
---------------------------
--옵션
 -- not null:데이터를 안넣지 못하게
 --	primary key: not null+중복데이터 못넣게
 --		어떤 데이터의 대표값
 --		나중에 검색할때 정확한 데이터를 찾을 수 있음
 --		->어떤 테이블에는 PK(primary key)가 꼭 있도록
----------------------------------
--

--데이터 만들기:c
insert into 테이블명(필드명,필드명,....)
values (값,값...);

--순서를 바꿔서 기입했지만 그래서 뭐....
insert into may02_snack_ms(s_price,s_name)
values(400,'새콤');


insert into 테이블명 values (값,값...);

--값이 0이면 계산이 되는데
--값이 없으면 계산 불가능
--...
insert into may02_snack_ms(s_name)
values('달콤')

insert into MAY02_SNACK_MS values('퐁당퐁',5100);
--CRUD의C
------------------------------------------------------
create table may03_coffee_ms(
	c_name varchar2(10 char) primary key,
	c_price number(5)not null

);

insert into may03_coffee_ms(c_name)values('아아');--x

insert into MAY03_COFFEE_MS values('아아',5000);
insert into MAY03_COFFEE_MS values('아아',3999);--x
insert into MAY03_COFFEE_MS values('라떼',3999);
insert into MAY03_COFFEE_MS values('녹차라떼',4999);

--5000원짜리가 뭐?->라떼/녹차라떼/...
--아아 얼마?-> 5000
select*from MAY03_COFFEE_MS;
--------------------------------------------------
--테이블 수정-실전에는 없는 작업
drop table 테이블명 cascade constraint purge;
drop table may02_student_ms cascade constraint purge;
drop table may03_student_ms cascade constraint purge;
--이름/나이/국/영/수/중에 PK로 쓸만한게 없어서
--번호 필드를 추가해서 PK로
-- ->번호는 자동으로 올라갔으면...(Java때 팩토리패턴)
--MySQL/MariaDB에는 autoincrement옵션이 있는데
----------------------------------------
--시퀀스 만들기
create sequence 시퀀스명;
create sequence may03_student_ms_seq;
--시퀀스 사용(insert때)
시퀀스명.nextval
----------------------------------------



create table may03_student_ms(
	st_no number(2)primary key,
	st_name varchar(10 char)not null,
	st_age number(3)not null,
	st_math number(3)not null,
	st_kor number(3)not null,
	st_eng number(3)not null
	
);

insert into may03_student_ms values(may03_student_ms_seq.nextval,'뽀로로',10,20,100,23);
insert into may03_student_ms values(may03_student_ms_seq.nextval,'뽀로로',70,40,100,90);
insert into may03_student_ms values(may03_student_ms_seq.nextval,'뽀로',60,25,10,23);
insert into may03_student_ms values(may03_student_ms_seq.nextval,'로로',50,28,100,23);
insert into may03_student_ms values(may03_student_ms_seq.nextval,'로',40,11,100,23);
select*from MAY02_STUDENT_MS

drop table may03_snack_ms cascade constraint purge;
create table may03_snack_ms(
	s_no number(2)primary key,
	s_name varchar2(10 char)not null,
	s_price number(5)not null,
	s_weight number(4,1)not null,
	s_expd date not null
);
drop sequence may03_snack_ms_seq;
create sequence may03_snack_ms_seq;
insert into may03_snack_ms values(may03_snack_ms_seq.nextval,'새콤달콤', 500, 200.1, sysdate);
insert into may03_snack_ms values(may03_snack_ms_seq.nextval,'초코파이', 5500, 600.1, to_date('20240503', 'YYYYMMDD'));
insert into may03_snack_ms values(may03_snack_ms_seq.nextval,'빅파이', 5000, 450.1, to_date('20250503', 'YYYYMMDD'));
insert into may03_snack_ms values(may03_snack_ms_seq.nextval,'마이쮸', 500, 150.1, to_date('20230505', 'YYYYMMDD'));
insert into may03_snack_ms values(may03_snack_ms_seq.nextval,'찹쌀떡', 2500, 450.1, to_date('20230510 오후 0100', 'YYYYMMDD PM HHMI'));
insert into may03_snack_ms values(may03_snack_ms_seq.nextval,'허니버터', 2500, 65.1, to_date('20240601 1300', 'YYYYMMDD HH24MI'));
insert into may03_snack_ms values(may03_snack_ms_seq.nextval,'새우깡', 1500, 75.0, to_date('20240603', 'YYYYMMDD'));
insert into may03_snack_ms values(may03_snack_ms_seq.nextval,'민트사탕', 1500, 50.1, to_date('20250603', 'YYYYMMDD'));
insert into may03_snack_ms values(may03_snack_ms_seq.nextval,'단팥빵', 1500, 150.0, to_date('20230515 2300', 'YYYYMMDD HH24MI'));
insert into may03_snack_ms values(may03_snack_ms_seq.nextval,'구운옥수수', 2500, 300.0, to_date('20230510 2300', 'YYYYMMDD HH24MI'));















