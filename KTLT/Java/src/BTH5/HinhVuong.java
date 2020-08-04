package BTH5;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {

	@Override
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap canh: ");
		setDai(scan.nextFloat());
		setRong(getDai());
	}

	public static void main(String[] args) {
		HinhVuong x = new HinhVuong();
		x.input();
		System.out.println("Dien tich: " + x.dientich());
		System.out.println("Chu vi: " + x.chuvi());
		System.out.println("Ve hinh vuong: ");
		x.draw();
	}
}