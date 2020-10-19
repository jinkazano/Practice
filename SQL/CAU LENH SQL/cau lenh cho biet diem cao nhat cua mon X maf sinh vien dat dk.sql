select sv.MaSV, sv.TenSV, kq.Diem
from (SINHVIEN as sv join KetQua as kq on sv.MaSV= kq.MaSV) join MonHoc as mh on mh.Mamh= kq.Mamh
where mh.Mamh=1 and Diem=( select Max(Diem) from KetQua where Mamh=1)