Select mh.tenmh, count(sv.MaSV) as 'so sinh vien'
from (SINHVIEN AS sv join Ketqua as kq on sv.MaSV=kq.MaSV) join MonHoc as mh on  mh.Mamh= kq.Mamh
where tenmh ='C++' and Diem<7
group by tenmh
