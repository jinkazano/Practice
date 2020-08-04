package bth6;

import java.util.Scanner;

public class bt1 {
	public static int isPrime(int n, int d, double c) {
		if (c < d)
			return 1;

		return (n % d == 0) ? 0 : isPrime(n, d + 1, c);
		/*
		 * if (n%d==0) return 0; else return isPrime (n,d+1,c)
		 */
	}

	public static void printPrime(int n) {
		if (n == 2) {
			System.out.printf("2");
			return;
		}
		if (isPrime(n, 2, Math.sqrt(n)) == 1)
			System.out.printf("%d ", n);
		printPrime(n - 1);

	}

	public static int sumPrimes(int n) {
		int sum = 0;
		if (n == 2)
			return sum = 2;
		else {

			if (isPrime(n, 2, Math.sqrt(n)) == 1)
				sum = (n + sumPrimes(n - 1));
			else if (isPrime(n, 2, Math.sqrt(n)) == 0)
				sum = sumPrimes(n - 1);
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		System.out.printf("Nhap so nguyen x:");
		x = scan.nextInt();
		if (isPrime(x, 2, Math.sqrt(x)) == 1)
			System.out.printf("\n x la so nguyen to");
		else
			System.out.printf("\n x khong la so nguyen to");

		System.out.printf("\n\nCac so nguyen to nho hon x:");
		printPrime(x - 1);
		System.out.printf("\n\nTong cac so nguyen to nho hon x: %d", sumPrimes(x - 1));
	}

}
