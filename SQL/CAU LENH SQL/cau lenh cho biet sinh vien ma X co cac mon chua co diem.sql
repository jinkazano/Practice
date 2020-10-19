select Mamh, tenmh
from MonHoc 
except
select mh.Mamh, mh.tenmh
from (SINHVIEN as sv join KetQua as kq on sv.MaSV= kq.MaSV) join MonHoc as mh on mh.Mamh= kq.Mamh
where sv.MaSV=1