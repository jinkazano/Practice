select top(1) sv.TenSV,sv.MaSV, sv.Lop 
from SINHVIEN sv, Ketqua kq
where sv.MaSV=kq.MaSV
group by sv.TenSV,sv.MaSV, sv.Lop 
order by (count(kq.Mamh)) DESC