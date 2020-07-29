package Buoi_1;

import java.util.Scanner;

class Bai_4 {
	public static int min_songuyen(int n) {
				int min=9;
				while (n>0) {
					int x= n%10;
					if(x<min) 						min=x;						
					
					n/=10;
				}
				return min;
	}
public static void main(String[] args) {
	int n;
	int dem=0;
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Nhập vào số nguyên dương n:");
	n=scanner.nextInt();
	
	while(n<=0) {
		System.out.println("Số vừa nhập phải lớn hơn 0. Xin mời nhập lại");
		n=scanner.nextInt();		
	}
	
	while(n>0) {
		if ((n%10)==min_songuyen(n)) 		dem++;
		
		n/=10;
	}
	System.out.println("Số chữ số nhỏ nhất của n = "+dem);
}
}
