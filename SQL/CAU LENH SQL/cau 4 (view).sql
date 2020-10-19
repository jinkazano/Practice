create view Nhan_vien_cua_nam
as
select nv.HoTen
from (NHANVIEN as nv join HOADONXUAT as hd on nv.MaNV= hd.MaNV) join CT_HOADON as ct on hd.MaHD=ct.MaHD
group by HoTen
having sum(dongia)>= 20000000