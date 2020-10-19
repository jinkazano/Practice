create view sinh_vien_CSDL
as
select sv.TenSV, mh.tenmh, kq.Diem
from (SINHVIEN as sv join Ketqua as kq on sv.MaSV= kq.MASV) join MonHoc as mh on mh.Mamh=kq.Mamh
where sv.GioiTinh like 'nu' and mh.tenmh='Ly Thuyet co so du lieu'