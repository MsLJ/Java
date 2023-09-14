create table may08_gandantable(
g_name varchar2(20 char)primary key,
g_price number(5)not null

);

insert into may08_gandantable values('test',100);
insert into may08_gandantable values('longshorttable',5000);
insert into may08_gandantable values('tableandtable',8000);
insert into may08_gandantable values('table',6000);
insert into may08_gandantable values('krtable',6250);

select*from may08_gandantable;

update may08_gandantable
set g_price=g_price+500
where g_name='krtable';

delete from may04_user_ms
where u_id='dog';

delete from may08_gandantable
where g_name ='krtable'

delete from may08_gandantable
where g_name like '%short%'

select avg(g_price)
from may08_gandantable
where g_name like '%table%'