Select sv.MaSV, sv.TenSV
from (SINHVIEN AS sv join Ketqua as kq on sv.MaSV=kq.MaSV) join MonHoc as mh on mh.Mamh=kq.Mamh
where tenmh in(N'Ly Thuyet co so du lieu', N'tin hoc dai cuong',N'mang may tinh')