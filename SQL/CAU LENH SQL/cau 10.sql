select sv.MaSV, sv.TenSV, sv.lop, mh.tenmh
from (SINHVIEN as sv join Ketqua as kq on sv.MaSV= kq.MaSV) join MonHoc as mh on mh.Mamh=kq.Mamh
where mh.tenmh='tin hoc dai cuong' and Diem= (select max(Diem) from Ketqua where Mamh=7) 