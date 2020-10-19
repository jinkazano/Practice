create view Sinh_Vien_xuat_sac
as
select sv.Lop
from (SINHVIEN as sv join Ketqua as kq on sv.MaSV= kq.MASV) join MonHoc as mh on mh.Mamh=kq.Mamh
group by sv.Lop
having avg(Diem )> any (select avg(Diem) from Ketqua kq, SINHVIEN sv where sv.MaSV=kq.MaSV group by sv.MaSV)
