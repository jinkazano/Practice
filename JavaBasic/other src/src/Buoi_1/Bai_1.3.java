package Buoi_1;

import java.util.Scanner;

class Bai_3 {
	public static void main(String[] args) {
		int n,x;
		int max=0;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Nhập vào số nguyên dương n:");
		n=scanner.nextInt();
		
		while(n<=0) {
			System.out.println("Số vừa nhập phải lớn hơn 0. Xin mời nhập lại");
			n=scanner.nextInt();
		}
		while(n>0) {
			x=n%10;
			if(x>max) max=x;
			n/=10;
		}
		System.out.println("Chữ số lớn nhất của n = "+max);
			
}
}
