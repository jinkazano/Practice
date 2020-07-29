package Bai5_5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        final int max = 100;
        Scanner scanner = new Scanner(System.in);
        GDtien[] gdtien = new GDtien[max];
        GDvang[] gdvang = new GDvang[max];
        int sogdtien, sogdvang;
        int tonggdtien = 0, tonggdvang = 0;
        int tongtien_gdtien = 0;


        try {
            do {
                System.out.print("Nhập số giao dịch vàng (số nguyên dương nhỏ hơn 100): ");
                sogdvang = scanner.nextInt();
            } while (sogdvang <= 0 || sogdvang > 100);
            do {
                System.out.print("Nhập số giao dịch tiền tệ (số nguyên dương nhỏ hơn 100): ");
                sogdtien = scanner.nextInt();
            } while (sogdtien <= 0 || sogdtien > 100);

            System.out.println("Nhập thông tin ");

            if (sogdvang > 0) {
                System.out.println("~Nhập thông tin giao dịch vàng: ");
                GDvang temp1 = null;
                for (int i = 0; i < sogdvang; i++) {
                    temp1 = new GDvang();
                    System.out.printf("Nhập vào thông tin giao dịch thứ %d", i + 1);
                    temp1.inputgd();
                    gdvang[i] = temp1;
                    tonggdvang += gdvang[i].getSoluong();

                }
            }

            if (sogdtien > 0) {
                System.out.println("~Nhập thông tin giao dịch tiền tệ: ");
                GDtien temp2 = null;
                for (int i = 0; i < sogdtien; i++) {

                    temp2 = new GDtien();
                    System.out.printf("Nhập vào thông tin giao dịch thứ %d", i + 1);
                    temp2.inputgd();
                    gdtien[i] = temp2;
                    tonggdtien += gdtien[i].getSoluong();
                    tongtien_gdtien += gdtien[i].getThanhtien();
                }
            }

            if (sogdvang > 0) {
                System.out.println("\n-----Thông tin giao dịch vàng-----");
                System.out.printf("%-10s %-12s %-20s %-20s %-20s %-20s %-20s\n", "STT", "Mã GD",
                        "Ngày GD", "Số KW Tiêu Thụ", "Đơn Giá", "Quốc Tịch", "Thành Tiền");

                for (int i = 0; i < 181; i++)
                    System.out.print("=");
                for (int i = 0; i < sogdvang; i++) {
                    System.out.printf("\n%-10d ", i + 1);
                    System.out.println(gdvang[i].outputgd());
                }
            }

            if (sogdtien > 0) {
                System.out.println("\n-----Thông tin giao dịch tiền tệ-----");

                System.out.printf("%-10s %-12s %-20s %-20s %-20s %-20s %-20s %-20s\n", "STT", "Mã GD",
                        "Ngày GD", "Số Lượng GD", "Đơn Giá", "Loại Tiền Tệ", "Tỉ Giá", "Thành Tiền");

                for (int i = 0; i < 160; i++)
                    System.out.print("=");
                for (int i = 0; i < sogdtien; i++) {
                    System.out.printf("\n%-10d ", i + 1);
                    System.out.println(gdtien[i].outputgd());

                }

                if (sogdvang > 0) {
                    System.out.println("\n-----Thông tin giao dịch vàng có đơn giá trên 1 tỉ -----");
                    System.out.printf("%-10s %-12s %-20s %-20s %-20s %-20s %-20s\n", "STT", "Mã GD",
                            "Ngày GD", "Số KW Tiêu Thụ", "Đơn Giá", "Quốc Tịch", "Thành Tiền");

                    for (int i = 0; i < 181; i++)
                        System.out.print("=");
                    for (int i = 0; i < sogdvang; i++) {
                        if (gdvang[i].getDongia() > 1000000000) {
                            System.out.printf("\n%-10d ", i + 1);
                            System.out.println(gdvang[i].outputgd());
                        }
                    }
                }

                if (sogdtien > 0) {
                    System.out.println("\n-----Thông tin giao dịch tiền tệ có đơn giá trên 1 tỉ-----");

                    System.out.printf("%-10s %-12s %-20s %-20s %-20s %-20s %-20s %-20s\n", "STT", "Mã GD",
                            "Ngày GD", "Số Lượng GD", "Đơn Giá", "Loại Tiền Tệ", "Tỉ Giá", "Thành Tiền");

                    for (int i = 0; i < 160; i++)
                        System.out.print("=");
                    for (int i = 0; i < sogdtien; i++) {
                        if (gdtien[i].getDongia() > 1000000000) {
                            System.out.printf("\n%-10d ", i + 1);
                            System.out.println(gdtien[i].outputgd());

                        }
                    }
                }



                System.out.println("\nTổng số lượng giao dịch:");
                System.out.println("Tổng số lượng giao dịch vàng: " + tonggdvang);
                System.out.println("Tổng số lượng giao dịch tiền tệ: " + tonggdtien);

                System.out.println("\nTrung bình thành tiền của giao dịch tiền tệ: " + tongtien_gdtien / sogdtien);
            }


        } catch (Exception ex) {
            ex.printStackTrace();
            System.err.println("Nhập sai! Kết thúc chương trình");
            System.exit(0);
        }
    }
}
