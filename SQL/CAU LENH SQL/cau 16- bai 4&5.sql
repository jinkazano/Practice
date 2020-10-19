select mb.MaMB, mb.Loai, count(nv.MaNV) as'So phi cong'
from (NHANVIEN AS nv join CHUNGNHAN as cn on nv.MaNV= cn.MaNV) join MAYBAY as mb on mb.MaMB= cn.MaMB
group by mb.MaMB, mb.Loai