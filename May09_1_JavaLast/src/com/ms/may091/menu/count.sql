select count(*)as c
from may09_menu_ms
where c=select count(*)/3 as b
from may09_menu_ms
where b=1;


select*
from(
select rownum as rn,m_no,m_name,m_price,m_r_name
from(
select *
from may09_menu_ms
order by m_r_name,m_name
)
)
where rn>=6 and rn<=10


select*
from(
select rownum as rn r_name,r_birth,r_address
from(
select *
from MAY09_RESTAURANT_MS
order by r_name,r_birth
)
)
where rn>=2 and rn<=4