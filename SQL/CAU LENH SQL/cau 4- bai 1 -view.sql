create view so_sinh_vien_thi_lai
as
select  mh.tenmh, count(mh.Mamh) as 'so sinh vien thi lai'
from (SINHVIEN as sv join Ketqua as kq on sv.MaSV= kq.MASV) join MonHoc as mh on mh.Mamh=kq.Mamh
where Diem<5
group by mh.tenmh