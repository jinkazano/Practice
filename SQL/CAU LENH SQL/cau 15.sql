select sv.MaSV, sv.TenSV 
from (SINHVIEN AS sv join Ketqua as kq on sv.MaSV=kq.MaSV) join MonHoc as mh on mh.Mamh=kq.Mamh
where sv.MaSV!=3 and diem<=6 and tenmh in( select mh.tenmh from MonHoc as mh join Ketqua as kq on mh.Mamh=kq.Mamh where kq.MaSV=3 and kq.Diem<=6)  
