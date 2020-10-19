create view sinh_vien_gioi
as
select sv.MaSV, sv.TenSV
from (SINHVIEN as sv join Ketqua as kq on sv.MaSV=kq.MaSV) join MonHoc as mh on mh.Mamh=kq.Mamh
group by sv.MaSV, sv.TenSV
having count(kq.Mamh)>=(select count( distinct Mamh)/2 from Ketqua where Diem>=5)