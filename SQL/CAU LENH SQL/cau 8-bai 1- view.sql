create view sinh_vien_voi_7
as
select sv.MaSV, count(Diem) as'so diem lon hon 7'
from (SINHVIEN as sv join Ketqua as kq on sv.MaSV=kq.MaSV) join MonHoc as mh on mh.Mamh=kq.Mamh
where Diem>7
group by sv.MaSV
having count(kq.Mamh)>=  (select count( distinct Mamh)/2 from Ketqua where Diem>=7)