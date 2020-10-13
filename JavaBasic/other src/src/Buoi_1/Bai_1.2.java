package Buoi_1;

import java.util.Scanner;

class Bai_2 {
public static void main(String[] args) {
	int n;
	int dem=0;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Nhập vào số nguyên dương n:");
	n=scanner.nextInt();
	
	while(n<=0) {
		System.out.println("Số vừa nhập phải lớn hơn 0. Xin mời nhập lại");
		n=scanner.nextInt();		
	}
	while(n>0) {
		if ((n%10)%2==1) {
			dem++;
		}
		n/=10;
	}
	System.out.println("Số chữ số lẻ của n = "+dem);
}
}
