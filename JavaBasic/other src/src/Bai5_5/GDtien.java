package Bai5_5;

import java.util.Scanner;

public class GDtien extends GD {
    private double tigia;
    private int loaitiente;

    public double getTigia() {
        return tigia;
    }

    public void setTigia(double tigia) {
        this.tigia = tigia;
    }

    public int getLoaitiente() {
        return loaitiente;
    }

    public void setLoaitiente(int loaitiente) {
        this.loaitiente = loaitiente;
    }

    public GDtien(String magd, int soluong, String ngaygd, double dongia, double thanhtien, double tigia) {
        super(magd, soluong, ngaygd, dongia, thanhtien);
        this.tigia = tigia;
    }

    public GDtien() {
    }

    public double getThanhtien() {
        if(loaitiente==1)
            return getDongia()*getSoluong();
        else
            return getDongia()*getSoluong()*tigia;
    }


    public void inputgd() throws Exception {
        Scanner scanner=new Scanner(System.in);
        try {
            super.inputgd();
            do {
                System.out.print("Nhập loại tiền tệ (1=VND,2=Ngoại tệ): ");
                loaitiente=scanner.nextInt();
            }while(loaitiente!=1&&loaitiente!=2);
            do {
                System.out.print("Nhập tỉ giá: ");
                tigia=scanner.nextInt();
            }while(tigia<0);
        }
        catch(Exception ex)
        {
            throw ex;
        }


    }

    @Override
    public String outputgd() throws Exception {
        try{
        return super.outputgd()+String.format(" %-20d %-20.0f %-20.0f",loaitiente,tigia,getThanhtien());
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
}
