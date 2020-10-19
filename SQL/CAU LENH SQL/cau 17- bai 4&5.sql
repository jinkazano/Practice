select count(cb.MaCB) as'So duong'
from CHUYENBAY cb
where cb.GaDi in (select GaDen from CHUYENBAY)