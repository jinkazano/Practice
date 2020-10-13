package Bai5_4;

import java.util.Scanner;

public class NgoaiThanh extends ChuyenXe {
    private String noiden;
    private int songay;

    public String getNoiden() {
        return noiden;
    }

    public void setNoiden(String noiden) {
        this.noiden = noiden;
    }

    public int getSongay() {
        return songay;
    }

    public void setSongay(int songay) {
        this.songay = songay;
    }

    public NgoaiThanh(String macx, String tentx, String soxe, long doanhthu, String noiden, int songay) {
        super(macx, tentx, soxe, doanhthu);
        this.noiden = noiden;
        this.songay = songay;
    }

    public NgoaiThanh() {

    }

    public void inputcx() throws Exception
    {
        Scanner scanner=new Scanner(System.in);
        try
        {
            super.inputcx();
            do {
                System.out.print("Nhập nơi đến (lớn hơn 5 kí tự): ");
                noiden=scanner.next();
            }while(!noiden.matches("[a-zA-Z ]{1,15}"));
            do {
                System.out.print("Nhập số ngày đi được (số nguyên dương): ");
                songay=scanner.nextInt();
            }while(songay<0);


        }
        catch (Exception ex)
        {
            throw ex;
        }
    }

    public String outputcx()throws Exception
    {
        try
        {

           return super.outputcx()+String.format(" %-15s %-15d",noiden,songay);
        }
        catch (Exception ex)
        {
            throw ex;
        }
    }
}
