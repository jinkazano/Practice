select distinct nv.MaNV, max( mb.TamBay) as'Tam Bay lon nhat'
from (NHANVIEN AS nv join CHUNGNHAN as cn on nv.MaNV= cn.MaNV) join MAYBAY as mb on mb.MaMB= cn.MaMB
group by nv.MaNV
having count(cn.MaMB)>3