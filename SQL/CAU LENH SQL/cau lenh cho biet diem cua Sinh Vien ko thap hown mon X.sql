select sv.MaSV, sv.TenSV, kq.Diem
from (SINHVIEN AS sv join Ketqua as kq on sv.MaSV=kq.MaSV) join MonHoc as mh on mh.Mamh= kq.Mamh
where  kq.Mamh= 2 and Diem> (select Min(Diem) from Ketqua where Mamh= 2)