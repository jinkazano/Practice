package bth6;

import java.util.Scanner;

public class bt3 {
	public static int decToBin(int n) {
		return (n == 0) ? 0 : (n % 2 + 10 * decToBin(n / 2));
	}

	public static int decToOct(int n) {
		return (n == 0) ? 0 : (n % 8 + 10 * decToOct(n / 8));
	}

	public static void decToHex(int n) {
		int rem;
		if (n == 0)
			return;
		else {
			rem = n % 16;
			decToHex(n / 16);
			if (rem >= 10)
				System.out.printf("%s", rem + 55);
			else
				System.out.printf("%d", rem);
		}

	}

	public static void main(String[] args)

	{
		Scanner scan = new Scanner(System.in);

		int n;
		System.out.printf("Nhap n: ");
		n = scan.nextInt();
		System.out.printf("\nHe 2: %d", decToBin(n));
		System.out.printf("\nHe 8: %d", decToOct(n));
		System.out.printf("\nHe 16: ");
		decToHex(n);

	}

}
