package Bai5_5;

import java.util.Scanner;

public class GD {
    private int soluong;
    private String magd, ngaygd;
    private double dongia,thanhtien;

    public String getMagd() {
        return magd;
    }

    public void setMagd(String magd) {
        this.magd = magd;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getNgaygd() {
        return ngaygd;
    }

    public void setNgaygd(String ngaygd) {
        this.ngaygd = ngaygd;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }

    public GD(String magd, int soluong, String ngaygd, double dongia, double thanhtien) {
        this.magd = magd;
        this.soluong = soluong;
        this.ngaygd = ngaygd;
        this.dongia = dongia;
        this.thanhtien = thanhtien;
    }

    public GD(){}

    public void inputgd() throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            do {
                System.out.print("\nNhập mã khách hàng: ");
                magd = scanner.next();
            } while (!magd.matches("[a-zA-Z0-9]{1,10}"));

            do {
                System.out.print("Nhập ngày ra hóa đơn (dd/mm/yyyy): ");
                ngaygd = scanner.next();
            } while (!ngaygd.matches("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}"));
            do {
                System.out.print("Nhập số lượng: ");
                soluong = scanner.nextInt();
            } while (soluong < 0);
            do {
                System.out.print("Nhập đơn giá: ");
                dongia = scanner.nextDouble();
            } while (dongia < 0);
        } catch (Exception ex) {
            throw ex;
        }
    }

        public String outputgd() throws Exception {
            try
            {
                return String.format("%-12s %-20s %-20d %-20.0f",magd,ngaygd,soluong,dongia);

            }
            catch (Exception ex)
            {
                throw ex;
            }
        }

    }


