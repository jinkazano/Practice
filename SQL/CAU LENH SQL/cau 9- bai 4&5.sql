select distinct nv.Ten, nv.MaNV
from [dbo].[MAYBAY] mb,[dbo].[CHUNGNHAN] cn, [dbo].[NHANVIEN] nv
where mb.MaMB=cn.MaMB and nv.MaNV= cn.MaNV and mb.Loai like'Boeing%'
