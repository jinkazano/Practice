select  sv.Lop,sv.MaSV,sv.TenSV,  avg(kq.Diem ) as'Diem trung binh'
from SINHVIEN as sv join Ketqua as kq on sv.MaSV=kq.MaSV
group by sv.Lop,sv.MaSV,sv.TenSV
