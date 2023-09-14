--DBA과정- x
--DBP과정 -> 기본적인 DB사용법
-- ->DB랑 연동된 프로그램 개발
--OracleDB환경에서 SQL을 수업
--지금 배운 SQL MySQL,MariaDB,....에서도 됨
--90%이상 같음
---------------------------
--SQL(Structured Query Language)
--	DB를 제어하는 컴퓨터 언어
--	DB메이커는 다양한데 다들 SQL을 사용함
-- 	조건문/반복문/변수-x 답이 정해져 있고
--	CRUD(데이터를 Create Read Update Delete)가 목표
--	대소문자 구별x->대문자로 인식
--CREATE 정석은 대문자이지만 가독성이 좋지않아
--create 이것을 채용
--cReATe
--------------------------------------
-- 테이블
-- 열(column),field
-- 행(row),	record,	data
--테이블 만들기
--create table snack(
--열제목 자료형[옵션],
--필드명 자료형[옵션],
--...
--);
--문법이 있을지 없을지 모르기에 테이블 첫글자만 따서 s_언더바 넣어서
---------------------------------------------------------
--용량
--	Oracle DB에서 영어/숫자1글자=1byte
-- 				 한글1글자=3bytes
--	5	  :5bytes
--	5 char:5글자(사실은 15bytes)
---------------------------------------------------------
--자료형
--글자
--	char(용량):무조건 그 용량만큼 저장
--		char(5char)->'ㅋㅋㅋ'저장하면
--				'ㅋㅋㅋ  '3글자를 썼지만 띄어쓰기2개해서 5글자 맞춰서 저장
--		빈칸들어가니 용량낭비
--		데이터들 자릿수가 정해져있는 상황에 사용(핸드폰번호 주민번호)

--	varchar2(용량):용량조절해서 저장
--		varchar2(5 char)->'ㅎㅎㅎ'저장하면
--					'ㅎㅎㅎ'을저장함
--   	용량 조절하느라 느림
--		일반적으로 많이 사용
--	if(용량이 덜찼으면){
--사이즈 조절
--}
--숫자
--	number(용량)
--		number(5):5자리 정수(99999까지 가능)
--		number(5,3):전체5자리,소수점이하3자리 실수(99.999)

--날짜
--date
create table may02_snack_ms(
	s_name varchar2(50 char),
	s_price number(6)

);
----------------------------------
--alt+x로 실행
create table may02_student_ms(
	st_name varchar2(50 char),
	st_height number(4,1),
	st_weight number(4,1)
);
-----------------------------------
--데이터 만들기:C
--insert into 테이블명(필드명,필드명,....)
--values(값,값,....)
insert into may02_snack_ms(s_name,s_price)
values('辛당동 장독대를 뛰쳐나온 떡볶이 총각의 맛있는 프로포즈',1500);
insert into may02_snack_ms(s_name,s_price)
values('辛당동 장독대를 뛰쳐나온 떡볶이 총각의 맛있는 프로포즈辛당동 장독대를 뛰쳐나온 떡볶이 총각의 맛있는 프로포즈辛당동 장독대를 뛰쳐나온 떡볶이 총각의 맛있는 프로포즈辛당동 장독대를 뛰쳐나온 떡볶이 총각의 맛있는 프로포즈辛당동 장독대를 뛰쳐나온 떡볶이 총각의 맛있는 프로포즈辛당동 장독대를 뛰쳐나온 떡볶이 총각의 맛있는 프로포즈辛당동 장독대를 뛰쳐나온 떡볶이 총각의 맛있는 프로포즈辛당동 장독대를 뛰쳐나온 떡볶이 총각의 맛있는 프로포즈辛당동 장독대를 뛰쳐나온 떡볶이 총각의 맛있는 프로포즈',1500);
---------------------------------------------------------
--데이터 읽기:R
select*from may02_snack_ms;
--이클립스가 첫 select 안나오는 버그
