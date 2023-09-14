-- 데이터 읽기 : R
select 필드명, 필드명 as 별칭, 연산자, 통계함수, ...
from 테이블명;
where 조건식; -- SQL에는 변수가 없어서 = 가 같다라는 의미가 됨
-- 통계함수 : sum(필드명),avg(필드명),max(필드명),min(필드명),count(필드명)
-- 문자열 포함검색 : 필드명 like '패턴'
--   '%ㅋ' : 앞에 뭐가 있던간에 ㅋ로 끝
--   'ㅋ%' : 뒤에 뭐가 있던 ㅋ로 시작
--   '%ㅋ%': 앞뒤에 뭐가있던 ㅋ 포함
----------------------------------------------
-- 전체 학생의 이름, 나이만
select st_name, st_age
from may03_student_ms;

-- 전체 과자 이름, 유통기한만(필드명 바꿔서)
select s_name, s_expd as exp_date -- s_exp as exp_date : s_exp를 exp_date로 바꿔서 출력해줌
from may03_snack_ms;

-- 전체 학생의 이름, 평균
-- PC에서 Java/Python써서 평균 계산...?
select st_name, (st_kor + st_eng + st_mat) / 3 as st_avg
from may03_student_ms;

-- 전체 과자 이름, 가격, 부가세, g당 가격
select s_name, s_price, (s_price / 10) as vat, (s_price / s_weight) as s_gd
from may03_snack_ms;

-- 전체 학생 평균 나이
select avg(s_age)
from may03_student;

-- 과자최고가, 촤자최소가, 과자평균가, 과자 총 몇종류
select max(s_price), min(s_price), count(*) -- 카운트는 뭘 세던 똑같아서 *로 대충 얼버무려도됨
from may03_snack_ms;

-- 학생의 총 평균점수
select avg((s_kor + s_eng + s_mat)/3)
from may03_student_ms;
--나이가 25살 이상인 학생의 이름과 나이
select st_name,st_age
from may03_student_ms
where st_age>=25;
--무게가 400미만인 과자 이름 가격 무게
select s_name,s_price,s_weight
from may03_snack_ms
where s_weight<400;

--초코 가격
select s_price
from may03_snack_ms
where s_name='초코';
--깡 들어가있는 평균 가격
select avg(s_price)
from may03_snack_ms
where s_name='%깡%';
--로씨 학생 몇명
select count(*)
from may03_student_ms
where st_name='로%';

select s_name,s_expd
from may03_snack_ms
where s_expd<=to_date(
concat(
	to_char(
		sysdate,'YYYYMMDD'),'235959'
			),
			'YYYYMMDDHH24MISS');

--내일 먹으면 안되는 과자이름,유통기한
--sysdate
--to_char(...,'패턴'):날짜->글자
--concat('...','...'):글자 붙이기
--to_date('....','패턴'):글자->날씨


--sysdate:2023/05/03 14:56
--to_char(sysdate,'YYYYMMDD'):'20230503' 날짜->글자
--concat(to_char(sysdate,'YYYYMMDD'),'235959'):'20230503235959'
--to date(concat(to_char(sysdate,'YYYYMMDD'),'235959') ,'YYYYMMDDHH24MISS'):2023/05/03/ 23:59:59  글자->날씨




insert into may03_snack_ms
values(may03_snack_ms_seq.nextval,
'노래방새우깡',10000,999.9,
to_date('20230503 1700','YYYYMMDD HH24MI'))

--and,or
--국어점수가 50점 미만이거나 
--영어점수가 50점 미만인 학생이름 국,영,수
select st_name,st_kor,st_eng,st_math
from MAY03_STUDENT_MS
where st_kor<50 or st_eng<50;

--20대 학생이름,나이
select st_name,st_age
from may03_student_ms
where st_age<30 and st_age>19;

--where st_age between 20 and 29;


select s_name,s_expd
from may03_snack_ms
where s_expd<=to_date(concat(to_char(sysdate,'YYYYMMDD'),'205959'),'YYYYMMDDHH24MISS')
and s_expd >=to_date(concat(to_char(sysdate,'YYYYMMDD'),'090000'),'YYYYMMDDHH24MISS');


--최저가
select min(s_price)
from may03_snack_ms;

--subquery
--제일 싼 과자 이름
select s_name
from may03_snack_ms
where s_price=(
	select min(s_price)
	from may03_snack_ms
);

--평균보다 싼 과자 이름,가격
select avg(s_price)
from may03_snack_ms;

select s_name,s_price
from may03_snack_ms
where s_price<(
	select avg(s_price)
	from may03_snack_ms
);
--최연장자 학생 이름,나이
select max(st_age)
from MAY03_STUDENT_MS;


select st_name,st_age
from may03_student_ms
where st_age=(
select max(st_age)
from MAY03_STUDENT_MS
);


--유통기한 가장 널널한 과자 이름,유통기한
select max(s_expd)
from may03_snack_ms;


select s_name,s_expd
from may03_snack_ms
where s_expd=(
select max(s_expd)
from may03_snack_ms
);


