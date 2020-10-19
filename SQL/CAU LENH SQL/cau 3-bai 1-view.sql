create view diem_trung_binh
as
select sv.TenSV, avg(kq.diem) as' Diem Trung binh'
from (SINHVIEN as sv join Ketqua as kq on sv.MaSV= kq.MASV) join MonHoc as mh on mh.Mamh=kq.Mamh
group by sv.TenSV