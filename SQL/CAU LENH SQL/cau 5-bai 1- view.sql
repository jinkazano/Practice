create view Sinh_Vien_qua_mon
as
select distinct mh.tenmh, mh.Mamh
from (SINHVIEN as sv join Ketqua as kq on sv.MaSV= kq.MASV) join MonHoc as mh on mh.Mamh=kq.Mamh
where mh.Mamh not in (select Mamh from Ketqua where Diem<5)
group by tenmh, mh.Mamh