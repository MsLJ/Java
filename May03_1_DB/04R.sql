--전체 메뉴명,가격
select m_name,m_price
from may03_menu_ms;
--전체 식당이름,위치
select r_name,r_station
from may03_restaurant_ms;
--프렌차이즈 전체의 메뉴 평균가
select avg(m_price)
from may03_menu_ms;
--식당 수
select count(r_no)
from may03_restaurant_ms;
--최연장자 사장님 이름,생일,집
select b_name,b_adress,b_birth
from MAY03_BOSS_MS
where b_birth=(
select min(b_birth)
from MAY03_BOSS_MS
);
--테이블 수 제일 적은 매장은 어디에
select min(r_table)
from may03_restaurant_ms;

select r_station
from may03_restaurant_ms
where r_table=(
select min(r_table)
from may03_restaurant_ms
);
--'우동'시리즈 평균가
select avg(m_price)
from may03_menu_ms
where m_name like'%우동%';

--subquery
--종각에서 먹을수있는 메뉴명,가격
-- 테이블여러개 엮을때
--	subquery의 결과는 하나만 나와야
--		in쓰면 m_r_no=5 or m_r_no=8
--종각에서 먹을수있는 메뉴명,가격
select r_no
from may03_restaurant_ms
where r_station='종각역';

select m_name,m_price
from may03_menu_ms
	where m_r_no=(
	select r_no
	from may03_restaurant_ms
	where r_station='종각역'
);
--밥이 먹고 싶으면 어디로 가야
select m_r_no
from may03_menu_ms
where m_name like '%밥%';

select r_station
from may03_restaurant_ms
where r_no=(
select m_r_no
from may03_menu_ms
where m_name like '%밥%'
);

--제일 싼 메뉴 파는 매장명,위치
select min(m_price)
from may03_menu_ms;

select m_r_no
from may03_menu_ms
where m_price=(
select min(m_price)
from may03_menu_ms
);


select r_name,r_station
from may03_restaurant_ms
where r_no=(
select m_r_no
from may03_menu_ms
where m_price=(
select min(m_price)
from may03_menu_ms
));

--최연장자 사장님이 운영하는 매장명,지점명,위치
select min(b_birth)
from MAY03_BOSS_MS

select b_no
from MAY03_BOSS_MS
where b_birth=(
select min(b_birth)
from MAY03_BOSS_MS
);


--이곳에 in쓰는 이유는 한날 한시에 태어난 사장님이 있을수도 있기에=쓰지않고 in으로
select r_r_no
from may03_run_ms
where r_b_no in(
select b_no
from MAY03_BOSS_MS
where b_birth=(
select min(b_birth)
from MAY03_BOSS_MS
)
);

select r_name,r_adress,r_station
from MAY03_RESTAURANT_MS
where r_no=(
select r_r_no
from may03_run_ms
where r_b_no in(
select b_no
from MAY03_BOSS_MS
where b_birth=(
select min(b_birth)
from MAY03_BOSS_MS
)
)
);
--우동시리즈 파는 사장님 이름

select m_r_no
from may03_menu_ms
where m_name like '%우동%';

select r_b_no
from may03_run_ms
where r_r_no in(
	select m_r_no
	from may03_menu_ms
	where m_name like '%우동%'
)


select b_name
from may03_boss_ms
where b_no in(
	select r_b_no
	from may03_run_ms
	where r_r_no in(
		select m_r_no
		from may03_menu_ms
		where m_name like '%우동%'
)
);
--최연장자 사장님네 메뉴 평균가
select min(b_birth)
from MAY03_BOSS_MS;

select b_no
from may03_boss_ms
where b_birth =(
	select min(b_birth)
	from MAY03_BOSS_MS
);

select r_r_no
from may03_run_ms
where r_b_no in(
	select b_no
	from may03_boss_ms
	where b_birth =(
		select min(b_birth)
		from MAY03_BOSS_MS
	)
);




select avg(m_price)
from may03_menu_ms
where m_no =(
	select r_r_no
	from may03_run_ms
	where r_b_no in(
		select b_no
		from may03_boss_ms
		where b_birth =(
			select min(b_birth)
			from MAY03_BOSS_MS
		)
	)
);

--join
---전체 매장명,위치,메뉴명,가격

select r_name,r_station,m_name,m_price
from may03_restaurant_ms,may03_menu_ms
where r_no=m_r_no;

select r_name,r_station,m_name,m_price
from may03_restaurant_ms,may03_menu_ms
--중복되게 나옴 모든걸 병렬처리해서

--사장이름,식당명,위치 restaurant의r_no랑 run의r_no가 중복
--필드명 같으면 테이블명.필드명
select b_name,r_name,r_station
from may03_restaurant_ms,may03_boss_ms,may03_run_ms
where b_no=r_b_no and r_r_no=may03_restaurant_ms.r_no;

--최연장자 사장님이 운영하는 식당명,위치
--db: hdd에 저장(13개 -130mb)
--subquery 쓰면 5개 -변수에 5mb
--join쓰면 1300개-변수에 13000mb?

--subquery: HDD에 130MB->RAM에 5MB
--join:HDD에 130MB->RAM에1.3TB 안쓸수있으면 안쓰는것

--최연장자가 사장님이 운영하는 식당명, 위치
--가 아니고
select min(b_birth)
from may03_boss_ms

select b_no
from may03_boss_ms
where b_birth in 
	(
	select min(b_birth)
	from may03_boss_ms
	);
	




select b_name,r_name,r_station
from may03_boss_ms,may03restaurant_ms,may03_run_ms
where b_no=r_b_no and r_r_no=may03_restaurant_ms.r_no 
and b_birth = (
	select min(b_birth)
	from may03_boss_ms
	);
	
--join은 자제를...

--테이블 수 가장 많은 식당에서 파는 메뉴명,가격
	select max(r_table)
	from MAY03_RESTAURANT_MS
	
	select r_no
	from may03_restaurant_ms
	where r_table=(
	select max(r_table)
	from MAY03_RESTAURANT_MS
	)
	--한 테이블에서 값 출력이라 join사용xx불필요
	select m_name,m_price
	from MAY03_MENU_MS
	where m_r_no=(
		select r_no
		from may03_restaurant_ms
		where r_table=(
			select max(r_table)
			from MAY03_RESTAURANT_MS
	)
	);
	
	--join버젼
	select m_name,m_price
	from MAY03_RESTAURANT_MS,may03_menu_ms
	where m_r_no=r_no and r_table=(select max(r_table)
	from MAY03_RESTAURANT_MS)
	

--평균가보다 비싼 메뉴명,가격,식당명 
--여러테이블에서 가져온값을 출력해야하니 어쩔수없이 join사용
select avg(m_price)
from may03_menu_ms
	
select m_name,m_price,r_name
from MAY03_RESTAURANT_MS,may03_menu_ms
where r_no=m_r_no and m_price>(
	select avg(m_price)
	from may03_menu_ms)




