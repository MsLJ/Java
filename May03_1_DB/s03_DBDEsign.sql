--RDBMS(Relational DBMS)계열
--		OracleDB,MYSQL,MariaDB,...
--		테이블을 나눠서 디자인해놓고
--		테이블간의 관계를 중심으로 풀어나가는
--NoSQL계열
--		MongoDB,Elasticsearch,...

--DB디자인
--1)한 데이터에는 하나의 정보만
--2)주제별로 테이블을 나누기
--3)ㅌ테이블 옵션(PK,NN)
--4)테이블간의 관계 파악
--사장님 1:매장n
--매장1:사장님n
--=>사장님:매장=m:n
매장1:메뉴n
메뉴1:매장1
--=>매장:메뉴=1:n

--백종원놀이
--식당프랜차이즈 관리
--홍길동,1999-01-01생,수원에 삼
--김밥천국,종로점,종각역,10테이블
--야채김밥,5000원
--...


drop table may03_boss_ms cascade constraint purge;
create table may03_boss_ms(
	b_no number(2)primary key,
	b_name varchar2(15 char) not null,
	b_adress varchar2(15 char) not null,
	b_birth date not null
	
);
create sequence may03_restaurant_ms_seq;
create sequence may03_boss_ms_seq;

insert into may03_boss_ms values(may03_boss_ms_seq.nextval,'홍길동','수원',to_date('22990101','YYYYMMDD')); 
insert into may03_boss_ms values(may03_boss_ms_seq.nextval,'김길동','중국',to_date('21990101','YYYYMMDD')); 
insert into may03_boss_ms values(may03_boss_ms_seq.nextval,'조길동','북한',to_date('20990101','YYYYMMDD')); 
insert into may03_boss_ms values(may03_boss_ms_seq.nextval,'구길동','한국',to_date('19990101','YYYYMMDD')); 
------------------------------------------------------------------------

create table may03_restaurant_ms(
	r_no number(2)primary key,
	r_name varchar2(15 char)not null,
	r_adress varchar2(15 char)not null,
	r_station varchar2(15 char)not null,
	r_table number(2)not null
);

insert into may03_restaurant_ms values (may03_restaurant_ms_seq.nextval,'김천','종로','종각역',10);
insert into may03_restaurant_ms values (may03_restaurant_ms_seq.nextval,'우천','고대','고대역',50);
insert into may03_restaurant_ms values (may03_restaurant_ms_seq.nextval,'감천','잠실','잠실역',20);
insert into may03_restaurant_ms values (may03_restaurant_ms_seq.nextval,'국천','안암','안암역',30);
-------------------------------------------------------------------------
create table may03_run_ms(
	r_no number(2)primary key,
	r_b_no number(2)not null,
	r_r_no number(2)not null	
);
insert into may03_run_ms values(may_03_run_ms_seq.nextval,4,4);
insert into may03_run_ms values(may_03_run_ms_seq.nextval,1,1);
insert into may03_run_ms values(may_03_run_ms_seq.nextval,2,2);
insert into may03_run_ms values(may_03_run_ms_seq.nextval,3,3);
insert into may03_run_ms values(may_03_run_ms_seq.nextval,5,5);

create sequence may_03_run_ms_seq;

create table may03_menu_ms(
m_no number(2) primary key,
m_name varchar2(10 char)not null,
m_price number(5)not null,
m_r_no number(2)not null

);
create sequence may03_menu_ms_seq;
insert into may03_menu_ms values(may03_menu_ms_seq.nextval,'김치우동',6000,2);
insert into may03_menu_ms values(may03_menu_ms_seq.nextval,'김밥우동',7000,1);
insert into may03_menu_ms values(may03_menu_ms_seq.nextval,'감자우동',6000,3);
insert into may03_menu_ms values(may03_menu_ms_seq.nextval,'햄버거우동',10000,4);
insert into may03_menu_ms values(may03_menu_ms_seq.nextval,'우동사리',2000,1);
insert into may03_menu_ms values(may03_menu_ms_seq.nextval,'김우동',6500,3);