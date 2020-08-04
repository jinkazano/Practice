package test;

import java.util.Scanner;

public class testJavaBasic {
	public static boolean Test(int x) {

		if (x < 2) {
			return false;
		}
		for (int j = 2; j <= Math.sqrt(x); j++) {
			if (x % j == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Nhap so phan tu cua mang la  ");
		int n = input.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.print("\nNhap phan tu thư " + (i + 1) + " la  ");
			a[i] = input.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		System.out.print("\n Tong các phan tu trong day la  " + sum);

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		System.out.print("\nDay giam dan la  ");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + "   ");

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		System.out.print("\nDay tang dan la  ");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + "   ");
		System.out.print("\nphan tu lon nhat la  " + a[n - 1]);
		System.out.print("\nphan tu nho nhat la  " + a[0]);
		int sumnt = 0;

		for (int i = 0; i < a.length; i++) {
			if (Test(a[i]) == true) {
				sumnt += a[i];
			}
		}
		System.out.print("\nTong cac so nguyen to trong day la  " + (sumnt));

	}

}
