package Bai5_7;

import java.util.Scanner;

public class KhachHang {




        private String makh,hoten,ngayrahd;
        private int soluong;
        private double dongia,thanhtien;

        public String getMakh() {
            return makh;
        }

        public void setMakh(String makh) {
            this.makh = makh;
        }

        public String getHoten() {
            return hoten;
        }

        public void setHoten(String hoten) {
            this.hoten = hoten;
        }

        public String getNgayrahd() {
            return ngayrahd;
        }

        public void setNgayrahd(String ngayrahd) {
            this.ngayrahd = ngayrahd;
        }

        public int getSoluong() {
            return soluong;
        }

        public void setSoluong(int soluong) {
            this.soluong = soluong;
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

        public KhachHang(String makh, String hoten, String ngayrahd, int soluong, long dongia, long thanhtien) {
            this.makh = makh;
            this.hoten = hoten;
            this.ngayrahd = ngayrahd;
            this.soluong = soluong;
            this.dongia = dongia;
            this.thanhtien = thanhtien;
        }

        public KhachHang(){}

        public void inputKH()throws Exception
        {
            Scanner scanner=new Scanner(System.in);
            try
            {
                do {
                    System.out.print("\nNhập mã khách hàng: ");
                    makh=scanner.next();
                }while (!makh.matches("[a-zA-Z0-9]{1,10}"));
                do {
                    System.out.print("Nhập họ và tên khách hàng: ");
                    hoten=scanner.next();
                }while (!hoten.matches("[a-zA-Z ]{0,35}"));
                do {
                    System.out.print("Nhập ngày ra hóa đơn (dd/mm/yyyy): ");
                    ngayrahd=scanner.next();
                }while(!ngayrahd.matches("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}"));
                do {
                    System.out.print("Nhập số lượng: ");
                    soluong=scanner.nextInt();
                }while(soluong<0);
                do {
                    System.out.print("Nhập đơn giá: ");
                    dongia=scanner.nextDouble();
                }while (dongia<0);

            }
            catch(Exception ex)
            {
                throw ex;
            }

        }

        public String outputKH()throws Exception
        {
            try
            {
                return String.format("%-12s %-35s %-20s %-20d %-20.0f",makh,hoten,ngayrahd,soluong,dongia);
            }
            catch(Exception ex)
            {
                throw ex;
            }
        }
}


