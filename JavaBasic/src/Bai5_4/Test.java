package Bai5_4;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        final int max=100;
        Scanner scanner=new Scanner(System.in);
        NoiThanh[] noithanh= new NoiThanh[max];
        NgoaiThanh[] ngoaithanh= new NgoaiThanh[max];
        int sochuyennoi,sochuyenngoai;
        long doanhthuxenoi=0,doanhthuxengoai=0;

        try
        {
            do {
                System.out.print("Nhập số chuyến xe nội thành (số nguyên dương nhỏ hơn 100): ");
                sochuyennoi = scanner.nextInt();
            }while(sochuyennoi<=0||sochuyennoi>100);
            do {
                System.out.print("Nhập số chuyến xe ngoại thành (số nguyên dương nhỏ hơn 100): ");
                sochuyenngoai = scanner.nextInt();
            }while(sochuyenngoai<=0||sochuyenngoai>100);

            if(sochuyennoi>0)
            {
                System.out.println("Nhập thông tin chuyến xe nội thành: ");
                NoiThanh temp1 = null;
                for (int i = 0; i < sochuyennoi; i++) {
                    temp1 = new NoiThanh();
                    System.out.printf("Nhập vào thông tin chuyến xe thứ %d", i + 1);
                    temp1.inputcx();
                    noithanh[i] = temp1;
                    doanhthuxenoi += noithanh[i].getDoanhthu();

                }
            }

            if(sochuyenngoai>0)
            {
                System.out.println("Nhập thông tin chuyến xe ngoại thành: ");
                NgoaiThanh temp2 = null;
                for (int i = 0; i < sochuyenngoai; i++) {

                    temp2 = new NgoaiThanh();
                    System.out.printf("Nhập vào thông tin chuyến xe thứ %d", i + 1);
                    temp2.inputcx();
                    ngoaithanh[i] = temp2;
                    doanhthuxengoai += ngoaithanh[i].getDoanhthu();
                }
            }

            if(sochuyennoi>0)
            {
                System.out.println("-----Thông tin chuyến xe nội thành-----");
                System.out.printf("%-10s %-12s %-35s %-12s %-10s %-15s %-15s\n", "STT", "Mã Chuyến Xe", "Họ Tên Tài Xế", "Số Xe", "Doanh Thu", "Số tuyến", "Số km đi được");
                for (int i = 0; i < 150; i++)
                    System.out.print("=");
                for (int i = 0; i < sochuyennoi; i++) {
                    System.out.printf("\n%-10d ", i + 1);
                    System.out.println(noithanh[i].outputcx());
                }
            }


            if(sochuyenngoai>0)
            {
                System.out.println("\n-----Thông tin chuyến xe ngoại thành-----");
                System.out.printf("%-10s %-12s %-35s %-12s %-10s %-15s %-15s\n", "STT", "Mã Chuyến Xe", "Họ Tên Tài Xế", "Số Xe", "Doanh Thu", "Nơi đến", "Số ngày đi được");
                for (int i = 0; i < 150; i++)
                    System.out.print("=");
                for (int i = 0; i < sochuyenngoai; i++) {
                    System.out.printf("\n%-10d ", i + 1);
                    System.out.println(ngoaithanh[i].outputcx());

                }
            }
            System.out.println("\nDoanh thu từng chuyến xe: ");
            System.out.println("Tổng doanh thu chuyến xe nội thành: " +doanhthuxenoi);
            System.out.println("Tổng doanh thu chuyến xe ngoại thành: " +doanhthuxengoai);






        }
        catch(Exception ex)
        {
            //ex.printStackTrace();
            System.err.println("Nhập sai! Chương trình tự động kết thúc");
            System.exit(0);
        }

    }
}
