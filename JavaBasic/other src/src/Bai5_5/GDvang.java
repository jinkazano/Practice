package Bai5_5;

import java.util.Scanner;

public class GDvang extends GD {
    private String loaivang;

    public String getLoaivang() {
        return loaivang;
    }

    public void setLoaivang(String loaivang) {
        this.loaivang = loaivang;
    }

    public GDvang(String magd, int soluong, String ngaygd, double dongia, double thanhtien, String loaivang) {
        super(magd, soluong, ngaygd, dongia, thanhtien);
        this.loaivang = loaivang;
    }

    public GDvang() {

    }


    public void inputgd() throws Exception {
        Scanner scanner=new Scanner(System.in);
        try {
            super.inputgd();
            do {
                System.out.print("Nhập loại vànng: ");
                loaivang=scanner.next();
            }while(!loaivang.matches("[a-zA-Z0-9 ]{1,10}"));
        }
        catch (Exception ex)
        {
            throw ex;
        }


    }


    public double getThanhtien() {
        return getDongia()*getSoluong();
    }

    public String outputgd() throws Exception {
        try {
            return super.outputgd() + String.format(" %-20s %-20.0f", loaivang, getThanhtien());
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
}
