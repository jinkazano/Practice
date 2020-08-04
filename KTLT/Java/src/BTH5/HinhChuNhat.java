package BTH5;

import java.util.Scanner;

public class HinhChuNhat {

	private float dai;
	private float rong;

	public HinhChuNhat(float dai, float rong) {

		this.dai = dai;
		this.rong = rong;
	}

	public HinhChuNhat() {

	}

	public float getDai() {
		return dai;
	}

	public void setDai(float dai) {
		this.dai = dai;
	}

	public float getRong() {
		return rong;
	}

	public void setRong(float rong) {
		this.rong = rong;
	}

	public float chuvi() {
		return (getDai() + getRong()) * 2;

	}

	public float dientich() {
		return getDai() * getRong();
	}

	public void draw() {
		int i, j;
		for (i = 0; i < getDai(); i++) {
			for (j = 0; j < getRong(); j++)
				System.out.print("*");
			System.out.println();
		}

	}

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap canh a: ");
		setDai(scan.nextFloat());
		System.out.println("Nhap canh b: ");
		setRong(scan.nextFloat());
	}

	public static void main(String[] args) {
		HinhChuNhat x = new HinhChuNhat();
		x.input();
		System.out.println("Dien tich: " + x.dientich());
		System.out.println("Chu vi: " + x.chuvi());
		System.out.println("Ve hcn: ");
		x.draw();

	}
}
