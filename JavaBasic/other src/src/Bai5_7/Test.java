package Bai5_7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        final int max=100;
        Scanner scanner=new Scanner(System.in);
        KhachHangNgoai[] khngoai=new KhachHangNgoai[max];
        KhachHangVN[] khvn=new KhachHangVN[max];
        int songoai,sovn;
        int tongngoai=0,tongvn=0;
        int tongtienngoai=0;


        try {
            do {
                System.out.print("Nhập số khách hàng việt nam (số nguyên dương nhỏ hơn 100): ");
                sovn = scanner.nextInt();
            } while (sovn <= 0 || sovn > 100);
            do {
                System.out.print("Nhập số khách hàng nước ngoài (số nguyên dương nhỏ hơn 100): ");
                songoai = scanner.nextInt();
            } while (songoai <= 0 || songoai > 100);

            System.out.println("Nhập thông tin ");

            if (sovn > 0) {
                System.out.println("~Nhập thông tin khách hàng việt Nam: ");
                KhachHangVN temp1 = null;
                for (int i = 0; i < sovn; i++) {
                    temp1 = new KhachHangVN();
                    System.out.printf("Nhập vào thông tin khách hàng thứ %d", i + 1);
                    temp1.inputKH();
                    khvn[i] = temp1;
                    tongvn += khvn[i].getSoluong();

                }
            }

            if (songoai > 0) {
                System.out.println("~Nhập thông tin khách hàng nước ngoài: ");
                KhachHangNgoai temp2 = null;
                for (int i = 0; i < songoai; i++) {

                    temp2 = new KhachHangNgoai();
                    System.out.printf("Nhập vào thông tin khách hàng thứ %d", i + 1);
                    temp2.inputKH();
                    khngoai[i] = temp2;
                    tongngoai += khngoai[i].getSoluong();
                    tongtienngoai += khngoai[i].getThanhtien();
                }
            }

            if (sovn > 0) {
                System.out.println("\n-----Thông tin khách hàng Việt Nam-----");
                System.out.printf("%-10s %-12s %-35s %-20s %-20s %-20s %-20s %-20s %-20s\n", "STT", "Mã Khách Hàng",
                        "Họ Tên Khách Hàng", "Ngày Ra Hóa Đơn", "Số KW Tiêu Thụ", "Đơn Giá", "Loại Khách Hàng", "Định Mức", "Thành Tiền");
                for (int i = 0; i < 181; i++)
                    System.out.print("=");
                for (int i = 0; i < sovn; i++) {
                    System.out.printf("\n%-10d ", i + 1);
                    System.out.println(khvn[i].outputKH());
                }
            }

            if (songoai > 0) {
                System.out.println("\n-----Thông tin khách hàng nước ngoài-----");
                System.out.printf("%-10s %-12s %-35s %-20s %-20s %-20s %-20s %-20s\n", "STT", "Mã Khách Hàng"
                        , "Họ Tên Khách Hàng", "Ngày Ra Hóa Đơn", "Số KW Tiêu Thụ", "Đơn Giá", "Quốc Tịch", "Thành Tiền");

                for (int i = 0; i < 160; i++)
                    System.out.print("=");
                for (int i = 0; i < songoai; i++) {
                    System.out.printf("\n%-10d ", i + 1);
                    System.out.println(khngoai[i].outputKH());

                }


            }
            System.out.println("\nTổng số lượng KW tiêu thụ từng loại khách hàng");
            System.out.println("Tổng số lượng KW tiêu thụ khách hàng việt nam: " + tongvn);
            System.out.println("Tổng số lượng KW tiêu thụ khách hàng nước ngoài: " + tongngoai);

            System.out.println("\nTrung bình thành tiền của khách hàng nước ngoài: " + tongtienngoai / songoai);

            if (sovn > 0) {
                System.out.println("\n-----Thông tin khách hàng việt nam trong tháng 9/2013-----");
                System.out.printf("%-10s %-12s %-35s %-20s %-20s %-20s %-20s %-20s %-20s\n", "STT", "Mã Khách Hàng",
                        "Họ Tên Khách Hàng", "Ngày Ra Hóa Đơn", "Số KW Tiêu Thụ", "Đơn Giá", "Loại Khách Hàng", "Định Mức", "Thành Tiền");
                for (int i = 0; i < 181; i++)
                    System.out.print("=");
                for (int i = 0; i < sovn; i++) {
                    if (khvn[i].getNgayrahd().matches("\\d{1,2}[-|/]09[-|/]2013")) {
                        System.out.printf("\n%-10d ", i + 1);
                        System.out.println(khvn[i].outputKH());
                    }
                }
            }
            if(songoai>0){
                System.out.println("\n-----Thông tin khách hàng nước ngoài trong tháng 9/2013-----");
                System.out.printf("%-10s %-12s %-35s %-20s %-20s %-20s %-20s %-20s\n", "STT", "Mã Khách Hàng"
                        , "Họ Tên Khách Hàng", "Ngày Ra Hóa Đơn", "Số KW Tiêu Thụ", "Đơn Giá", "Quốc Tịch", "Thành Tiền");

                for (int i = 0; i < 160; i++)
                    System.out.print("=");
                for (int i = 0; i < songoai; i++) {
                    if(khngoai[i].getNgayrahd().matches("\\d{1,2}[-|/]09[-|/]2013")) {
                        System.out.printf("\n%-10d ", i + 1);
                        System.out.println(khngoai[i].outputKH());
                    }

                }


            }
        }

        catch(Exception ex)
        {
           // ex.printStackTrace();
            System.err.println("Nhập sai! Kết thúc chương trình");
            System.exit(0);
        }
    }
}
