select sv.MaSV, sv.TenSV
from SINHVIEN sv, Ketqua kq
where sv.MaSV=kq.MaSV 
group by sv.MaSV, sv.TenSV
having avg(kq.Diem)<8