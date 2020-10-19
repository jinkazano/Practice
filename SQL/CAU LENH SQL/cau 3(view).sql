create view khach_hang_sop
as
select kh.TenKH
from (KHACHHANG as kh join HOADONXUAT as hd on kh.MaKH=hd.MaKH )join CT_HOADON as ct on hd.MaHD=ct.MaHD
group by kh.Tenkh
having sum(ct.dongia)>=20000000