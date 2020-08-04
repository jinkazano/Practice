package bth6;

import java.util.Scanner;

public class bt2 {
	public static int sumArr(int a[], int n) {
		if (n == 0)
			return a[0];

		return a[n - 1] + sumArr(a, n - 1);

	}

	public static int mulArr(int a[], int n) {
		if (n == 0)
			return a[0];
		return a[n - 1] * mulArr(a, n - 1);
	}

	public static int max(int a[], int n) {
		if (n == 2)
			return Math.max(a[0], a[1]);
		return Math.max(a[n - 1], max(a, n - 1));

	}

	public static int min(int a[], int n) {
		if (n == 2)
			return Math.min(a[0], a[1]);
		return Math.min(a[n - 1], max(a, n - 1));

	}

	public static int isPrime(int n, int d, double c) {
		if (c < d)
			return 1;

		return (n % d == 0) ? 0 : isPrime(n, d + 1, c);
		/*
		 * if (n%d==0) return 0; else return isPrime (n,d+1,c)
		 */
	}

	public static int countPrime(int a[], int n) {
		if (n == 0)
			return 0;
		if (isPrime(a[n - 1], 2, Math.sqrt(a[n - 1])) == 1)
			return 1 + countPrime(a, n - 1);
		return countPrime(a, n - 1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, n;

		System.out.printf("Nhap so phan tu cua day: ");
		n = scan.nextInt();
		int[] a = new int[n];
		for (i = 0; i < n; i++) {
			System.out.printf("\nNhap phan tu a[%d]: ", i);
			a[i] = scan.nextInt();
		}
		System.out.printf("\nTong mang: %d", sumArr(a, n - 1));
		System.out.printf("\nTich mang: %d", mulArr(a, n - 1));
		System.out.printf("\nSo lon nhat: %d", max(a, n));
		System.out.printf("\nSo be nhat: %d", min(a, n));
		System.out.printf("\nSo luong so nguyen to trong mang: %d", countPrime(a, n));

	}

}
