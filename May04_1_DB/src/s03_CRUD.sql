--C:insert
--R:select
------------------------------------------------------
--U:updte
update 테이블명
set 필드명=값, 필드명=값, ....
where 조건식;
-----------------------------
update MAY04_SNACK_MS
set s_price=3000
where s_name like '%초코&';

select*from may04_snack_ms;
--직원수 제일 적은 회사에서 만든 과자를 0원으로
select min(c_worker)
from MAY04_COMPANY_MS


select c_name
from MAY04_COMPANY_MS
where c_worker=(
select min(c_worker)
from MAY04_COMPANY_MS
)

update may04_snack_ms
set s_price=0
where s_c_name in (
	select c_name
	from MAY04_COMPANY_MS
	where c_worker=(
		select min(c_worker)
		from MAY04_COMPANY_MS
)
);

update may04_snack_ms
set s_price=s_price*1.1
where s_c_name in (
	select c_name
	from MAY04_COMPANY_MS
	where c_worker=(
		select max(c_worker)
		from MAY04_COMPANY_MS
)
);
--제일 비싼과자 500원 할인
select max(s_price)
from MAY04_SNACK_MS

update MAY04_SNACK_MS
set s_price=s_price-500
where s_price=(
select max(s_price)
from MAY04_SNACK_MS
)

select*from may04_snack_ms;
----------------------------------------------
--D:delete
delete from 테이블명
where 조건식;
--0원짜리 삭제
delete from may04_snack_ms
where s_price=0;

select*from may04_snack_ms
--직원수 제일 적은 회사 폐업
delete from MAY04_COMPANY_MS
where c_worker=(
select min(c_worker)
from may04_company_ms
);
select*from may04_company_ms;

-- 회 의 록


