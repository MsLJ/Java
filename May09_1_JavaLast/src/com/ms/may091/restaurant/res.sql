create table may09_restaurant_ms(
 r_name varchar2(10 char)primary key,
 r_address varchar2(20 char)not null,
 r_birth date not null
);
create sequence may09_menu_ms_seq;


drop table may09_restaurant_ms cascade constraint purge;
drop table may09_menu_ms cascade constraint purge;

insert into may09_restaurant_ms values('차이나타운양꼬치점','차이나타운1',to_date('20110101','YYYYMMDD'));
insert into may09_restaurant_ms values('차이나타운양꼬치','차이나타운1',to_date('20110101','YYYYMMDD'));
insert into may09_restaurant_ms values('차이나타운양점','차이나타운1',to_date('20110101','YYYYMMDD'));
insert into may09_restaurant_ms values('차이나꼬치점','차이나타운1',to_date('20110101','YYYYMMDD'));
insert into may09_restaurant_ms values('타운양꼬치점','차이나타운1',to_date('20110101','YYYYMMDD'));

create table may09_menu_ms(
m_no number(3)primary key,
m_name varchar2(15 char)not null,
m_price number(5)not null,
m_r_name varchar2(20 char)not null,
constraint restaurant_menu
foreign key(m_r_name)
references may09_restaurant_ms(r_name)
on delete cascade
);

insert into MAY09_menu_MS values(may09_menu_ms_seq.nextval,'양꼬치',7000,'차이나타운양꼬치점');

select*from may09_restaurant_ms;
select*from may09_menu_ms;