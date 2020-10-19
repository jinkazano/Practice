select nv.MaNV, nv.Ten
from (NHANVIEN AS nv join CHUNGNHAN as cn on nv.MaNV= cn.MaNV) join MAYBAY as mb on mb.MaMB= cn.MaMB
group by nv.MaNV,nv.Ten
having count(cn.MaMB)=3