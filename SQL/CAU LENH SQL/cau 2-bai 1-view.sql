create view so_sinh_vien
as
select count(kq.Mamh) as 'so sinh vien qua mon'
from (SINHVIEN as sv join Ketqua as kq on sv.MaSV= kq.MASV) join MonHoc as mh on mh.Mamh=kq.Mamh
where tenmh='Java' and Diem>5
group by kq.Mamh