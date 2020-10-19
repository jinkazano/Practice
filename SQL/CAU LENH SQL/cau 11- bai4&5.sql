select distinct nv.Ten, nv.MaNV
from (NHANVIEN AS nv join CHUNGNHAN as cn on nv.MaNV= cn.MaNV) join MAYBAY as mb on mb.MaMB= cn.MaMB
where nv.Ten like 'Nguyen%'