package Bai5_4;

import java.util.Scanner;

public class ChuyenXe {
    private String macx,tentx,soxe;
    private long doanhthu;

    public ChuyenXe(String macx, String tentx, String soxe, long doanhthu) {
        this.macx = macx;
        this.tentx = tentx;
        this.soxe = soxe;
        this.doanhthu = doanhthu;
    }

    public ChuyenXe(){}

    public String getMacx() {
        return macx;
    }

    public void setMacx(String macx) {
        this.macx = macx;
    }

    public String getTentx() {
        return tentx;
    }

    public void setTentx(String tentx) {
        this.tentx = tentx;
    }

    public String getSoxe() {
        return soxe;
    }

    public void setSoxe(String soxe) {
        this.soxe = soxe;
    }

    public long getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(long doanhthu) {
        this.doanhthu = doanhthu;
    }

    public void inputcx() throws Exception
    {
        Scanner scanner=new Scanner(System.in);
        try
        {
            do {
                System.out.print("\nNhập mã số chuyến xe (không bao gồm kí tự đặc biệt và khoảng trắng, nhỏ hơn 15 kí tự): ");
                macx=scanner.next();
            }while(!macx.matches("[a-zA-Z0-9]{1,15}"));
            do {
                System.out.print("Nhập họ tên tài xế (lớn hơn 5 kí tự chữ cái)");
                tentx=scanner.next();
            }while(!tentx.matches("[a-zA-Z ]{1,35}"));
            do {
                System.out.print("Nhập số xe (không bao gồm khoảng trắng, nhỏ hơn 12 kí tự): ");
                soxe=scanner.next();
            }while(!soxe.matches("[a-zA-Z0-9 .-]{4,12}"));
            do {
                System.out.print("Nhập doanh thu (số nguyên dương): ");
                doanhthu=scanner.nextLong();
            }while(doanhthu<0);
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    public String  outputcx() throws Exception
    {
        try
        {
           return String.format( "%-12s %-35s %-12s %-10d",macx,tentx,soxe,doanhthu);
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
}
