--데이터 읽기:R
select 필드명,필드명 as 별칭, 연산자,통계함수,...
from 테이블명,테이블명,...
where 조건식
group by 필드명,필드명,....
having 조건식
order by 필드명 [desc 역순으로할꺼면],필드명,...;

-------------------------------------

--전체 과자 이름,가격,g당 가격 no join
--을 과자이름순
select s_name,s_price,(s_price/s_weight)*100 as pph
from may04_snack_ms
order by s_price,s_name;
--order by를 사용해 정렬해주는


--평균가보다 싼 과자를 파는 회사이름,위치,직원수 no join
select min(s_price)
from may04_snack_ms

select s_c_name
from may04_snack_ms
where s_price=(
select min(s_price)
from may04_snack_ms
)


select c_name,c_address,c_worker
from may04_company_ms
where c_name=(
select s_c_name
from may04_snack_ms
where s_price=(
select min(s_price)
from may04_snack_ms
)
);




--직원수 가장 많은 
--회사이름,직원수,과자이름,가격 join
--을 회사이름 ->과자이름
select c_name,c_worker,s_name,s_price
from MAY04_COMPANY_MS,may04_snack_ms
where c_name=s_c_name and c_worker=(
	select max(c_worker)
	from MAY04_COMPANY_MS
)
order by c_name,s_name;

--사장이름,생일
--생일 날짜순으로 정렬
select b_name,b_birth
from may03_boss_ms
order by b_name,b_birth

--숙제형 코딩테스트
--데이터를 주고
--날짜별로 정렬?? 
--		1)IT잘 모르는 사람이 문제 낸거
--		2)일부러 저렇게
-----------------------
--실전에서
--	전체조회라는건 있을수가 없고
--	필요하지도 않음->페이지 나눠서 10개만 필요하지

-- 한 페이지당 5개씩
-- 1page:1 2 3 4 5
-- 2page:6 7 8 9 10
-- 페이지번호->?~?

--과자이름,가격
--이름순
--4~6번만

--한 페이지당 3개씩
--1 1 2 3
--2 4 5 6
select s_name,s_price
from may04_snack_ms
where s_no>3 and s_no<7
order by s_name;
--이거 아님

--sequence
-- 	insert실패해도 올라감
-- 	여러 테이블이 같이 쓰기도 함
--	나는 3번인데 2번학생 전학가면 나는 2번?
--	=>1234-x
--	=>중복 안되는 번호 들어가는거

--rownum
--  select할때마다 부여되는 가상필드
--  *랑은 같이 못씀
--	order by보다
--  1번부터 조회해야  
--  먼저 처리 되기에 select from하고 from안에 그 작업을 넣어서 나중에 처리

--위 select*에서 rownum처리하기에 중간에 있는 select rownum에 as별칭 설정할것
select*
from(
	select rownum as rn,s_no,s_name,s_price,s_weight,s_c_name
	from(
		select *
		from MAY04_SNACK_MS
		order by s_name
	)
)
where rn>=4 and rn<=7;

--평균가보다 비싼 과자
select s_name
from may04_snack_ms
where s_price>(
	select avg(s_price)
	from may04_snack_ms
)
--회사이름,위치,과자이름,가격 join
select*
from(
select rownum as rn,c_name,c_address,s_name,s_price
from (
	select c_name,c_address,s_name,s_price
	from MAY04_COMPANY_MS,may04_snack_ms
	where c_name=s_c_name and s_price>(
		select avg(s_price)
		from may04_snack_ms
 		)
		order by c_name,s_name;
	)
)
where rn>=2 and rn=<4;
--------------------------------
SELECT *
FROM (
SELECT ROWNUM AS rn, c_name, c_address, s_name, s_price
FROM (
	SELECT c_name, c_address, s_name, s_price
	FROM MAY04_COMPANY_MS, MAY04_SNACK_MS
	WHERE c_name = s_c_name AND s_price > (
		SELECT AVG(s_price)
		FROM MAY04_SNACK_MS
)
ORDER BY c_name, s_name
)
)
WHERE rn >= 2 AND rn <= 4;


--회사이름순->과자이름순
select s_c_name,s_name
from may04_snack_ms
order by s_name,s_c_name;

--2~4번까지


--회사별 평군가
select s_c_name,avg(s_price)
from may04_snack_ms;
group by s_c_name;

--지역별 최고가

select max(s_price)
from may04_company_ms,may04_snack_ms
where c_name=s_c_name
group by c_address;


--사장님별 메뉴 평균가
select b_name,r_name,avg(m_price)
from may03_boss_ms,may03_menu_ms,may03_run_ms,may03_restaurant_ms
where b_no=r_b_no 
 and r_r_no=may03_restaurant_ms.r_no
 and r_r_no=m_r_no
 group by b_name,r_name
 order by b_name,r_name

--회사별로 과자 평균가
--근데 평균가 구할때 3000원 안되는과자는 빼고 구하는걸로
--통계 낼때 데이터를 필터링해서
select s_c_name,avg(s_price)
from may04_snack_ms
where s_price>3999
group by s_c_name;

--회사별 과자 평균가
--그렇게 구해서 평균가가 4000원 안되는거는 안 볼래
--통게 내놓고 결과를 필터링
select s_c_name,avg(s_price)
from may04_snack_ms
group by s_c_name
having avg(s_price)>=4000;

--사장이름별->식당별 메뉴 객수
--평균가보다 산거 뺴고 갯수 세는걸로
--세어서,갯수가 2개 안되는거는 안나오게
--사장이름별->식당별 정렬해서

select count(*)
from may03_menu_ms;

select b_name,r_name,count(*)
from may03_boss_ms,may03_restaurant_ms,may03_run_ms,may03_menu_ms
where b_no=r_b_no
and r_r_no=may03_restaurant_ms.r_no 
and m_r_no=r_r_no
and m_price>=(
select avg(m_price)
from may03_menu_ms
)
group by b_name,r_name-- 보스이름이랑 레스토랑 이름으로 구분지어서
having count(*)>=1 --카운트 1개이상만 출력
order by b_name,r_name--정렬











