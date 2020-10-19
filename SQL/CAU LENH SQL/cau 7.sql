select sv.MaSV, sv.TenSV, kq.Diem
from (SINHVIEN AS sv join Ketqua as kq on sv.MaSV=kq.MaSV) join MonHoc as mh on mh.Mamh= kq.Mamh
where  kq.Mamh= 1 and Diem > (select Diem from SINHVIEN AS SV JOIN Ketqua as kq on sv.Masv= kq.MaSV where sv.MaSV=2 and kq.Mamh=1 )