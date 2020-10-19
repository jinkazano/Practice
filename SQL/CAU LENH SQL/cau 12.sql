select sv.TenSV, sv.Lop, mh.tenmh
from SINHVIEN sv, Ketqua kq, MonHoc mh
where sv.MaSV=kq.MaSV and mh.Mamh= kq.Mamh  and kq.Diem<=6
group by sv.TenSV, sv.Lop, mh.tenmh
having count(Diem) >=2