package Bai5_7;

import java.util.Scanner;

public class KhachHangNgoai extends KhachHang {
    private String quoctich;

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    public KhachHangNgoai(String makh, String hoten, String ngayrahd, int soluong, long dongia, long thanhtien, String quoctich) {
        super(makh, hoten, ngayrahd, soluong, dongia, thanhtien);
        this.quoctich = quoctich;
    }

    public KhachHangNgoai(){}

    public double getThanhtien(){
        return getDongia()*getSoluong();
    }

    public KhachHangNgoai(String quoctich) {
        this.quoctich = quoctich;
    }

    public void inputKH()throws Exception
    {
        Scanner scanner=new Scanner(System.in);
        try
        {
            super.inputKH();
            do {
                System.out.print("Nhập quốc tịch: ");
                quoctich=scanner.next();
            }while(!quoctich.matches("[a-zA-Z/  ]{0,15}"));
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

            return super.outputKH()+String.format(" %-25s %-20.0f",quoctich,getThanhtien());
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
}
