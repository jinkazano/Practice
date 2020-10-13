package Bai5_7;

import java.util.Scanner;

public class KhachHangVN extends KhachHang{
    private int dinhmuc,loaidoituong;

    public int getDinhmuc() {
        return dinhmuc;
    }

    public void setDinhmuc(int dinhmuc) {
        this.dinhmuc = dinhmuc;
    }

    public int getLoaidoituong() {
        return loaidoituong;
    }

    public void setLoaidoituong(int loaidoituong) {
        this.loaidoituong = loaidoituong;
    }

    public KhachHangVN(String makh, String hoten, String ngayrahd, int soluong, long dongia, long thanhtien, int dinhmuc, int loaidoituong) {
        super(makh, hoten, ngayrahd, soluong, dongia, thanhtien);
        this.dinhmuc = dinhmuc;
        this.loaidoituong = loaidoituong;
    }

    public KhachHangVN() {
    }

    public double getThanhtien() {
        if(getSoluong()<getDinhmuc())
            return getDongia()*getSoluong();
        else
            return getSoluong()*getDongia()*2.5;

    }

    public  void inputKH()throws Exception
    {
        Scanner scanner=new Scanner(System.in);
        try
        {
            super.inputKH();
            do {
                System.out.print("Nhập loại khách hàng (1=Sinh hoạt, 2=Kinh doanh, 3=Sản xuất): ");
                loaidoituong = scanner.nextInt();
            }while(loaidoituong<1||loaidoituong>3);
            do {
                System.out.print("Nhập định mức: ");
                dinhmuc=scanner.nextInt();
            }while(dinhmuc<0);
        }
        catch (Exception ex)
        {
            throw ex;
        }
    }

    public String outputKH()throws Exception
    {
        try
        {

            return super.outputKH()+String.format(" %-20d %-20d %-20.0f",loaidoituong,dinhmuc,getThanhtien());
        }
        catch (Exception ex)
        {
            throw ex;
        }
    }
}
