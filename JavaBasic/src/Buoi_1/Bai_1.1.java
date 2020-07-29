package Buoi_1;

import java.util.Scanner;

class Bai_1 {
public static void main(String[] args) {
	int n,chuso;
	int sum=0;
	Scanner	scanner =new Scanner(System.in);
	
	System.out.println("Nhập vào số nguyên dương n:");
	n=scanner.nextInt();
	while(n<=0) {
		System.out.println("Số vừa nhập phải lớn hơn 0. Xin mời nhập lại");
		n=scanner.nextInt();
	}
	while(n>0) {
		chuso=n%10;
		sum+=chuso;
		n/=10;
	}
	System.out.println("Tổng các chữ số của n = "+sum);
}
}
