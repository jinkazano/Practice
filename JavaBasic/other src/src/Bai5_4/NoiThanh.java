package Bai5_4;

import java.util.Scanner;

public class NoiThanh extends ChuyenXe {
    private String sotuyen;
    private int sokm;

    public String getSotuyen() {
        return sotuyen;
    }

    public void setSotuyen(String sotuyen) {
        this.sotuyen = sotuyen;
    }

    public long getSokm() {
        return sokm;
    }

    public void setSokm(int sokm) {
        this.sokm = sokm;
    }

    public NoiThanh(String macx, String tentx, String soxe, long doanhthu, String sotuyen, int sokm) {
        super(macx, tentx, soxe, doanhthu);
        this.sotuyen = sotuyen;
        this.sokm = sokm;
    }

    public NoiThanh() {

    }
    public void inputcx()throws Exception
    {
        Scanner scanner=new Scanner(System.in);
        try
        {
            super.inputcx();
            do {
                System.out.print("Nhập số tuyến (không bao gồm kí tự đặc biệt,nhỏ hơn 10 kí tự): ");
                sotuyen=scanner.next();
            }while(!sotuyen.matches("[a-zA-Z0-9]{1,10}"));
            do {
                System.out.print("Nhập số km đi được (nguyên dương): ");
                sokm=scanner.nextInt();
            }while(sokm<0);
        }
        catch(Exception ex)
        {
            throw ex;
        }

    }

    public String outputcx() throws Exception
    {
        try
        {

            return super.outputcx()+String.format(" %-15s %-15d", sotuyen, sokm);
        }
        catch(Exception ex)
        {
            throw ex;
        }

    }
}
