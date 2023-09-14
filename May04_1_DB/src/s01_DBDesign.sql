--과자
--수원에 있는 오리온,직원100
--초코파이,5000,500.5g

create table may04_company_ms(
c_name varchar2(15) primary key,
c_address varchar2(15) not null,
c_worker number(3) not null
)
create sequence may04_company_ms_seq;
	insert into may04_company_ms values('오리온','수원',100);
	insert into may04_company_ms values('크라운','성남',50);
	
	
	
	drop table may04_snack_ms cascade constraint purge;
create table may04_snack_ms(
	s_no number(3)primary key,
	s_name varchar2(15 char)not null,
	s_price number(5) not null,
	s_weight number(4,1)not null,
	s_c_name varchar2(15 char)not null
	
	);
	create sequence may04_snack_ms_seq;
	insert into may04_snack_ms values(may04_snack_ms_seq.nextval,'초코파이',5000,100.5,'오리온');
	insert into may04_snack_ms values(may04_snack_ms_seq.nextval,'코카콜라맛 초코칩',6000,200.5,'크라운');
	insert into may04_snack_ms values(may04_snack_ms_seq.nextval,'치킨맛 피자',20000,700.5,'오리온');
	insert into may04_snack_ms values(may04_snack_ms_seq.nextval,'도시락맛 이클립스',7000,900.5,'크라온');
	insert into may04_snack_ms values(may04_snack_ms_seq.nextval,'후레쉬베리',9000,499.5,'크라운');
	
	select*from may04_snack_ms;
	select*from may04_company_ms;
	
	
	
	
	
create table jul13_coffee(
   c_name varchar2 (100 char)primary key,
   c_price number(5) not null
    
 );

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
