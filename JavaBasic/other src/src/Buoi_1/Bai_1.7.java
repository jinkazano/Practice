package Buoi_1;

import java.util.Scanner;

class Bai_7 {
	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner (System.in);
		
		System.out.println("Nhập vào số nguyên dương n:");
		n=scanner.nextInt();
		
		while(n<=0||n>=10) {
			System.out.println("Số vừa nhập phải lớn hơn 0 và nhỏ hơn 10. Xin mời nhập lại");
			n=scanner.nextInt();		
		}
		for(int i=1;i<=10;i++) {
			System.out.println(" "+n+" x "+i+" = "+n*i);
		}
	}

}
