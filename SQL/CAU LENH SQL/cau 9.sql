select mh.tenmh, count(sv.MaSV)as'So SV thi lai'
from (SINHVIEN AS SV JOIN Ketqua as kq on sv.MaSV= kq.MaSV) join MonHoc as mh on mh.Mamh= kq.Mamh
where diem<7 
group by tenmh
having count(Diem)>=2