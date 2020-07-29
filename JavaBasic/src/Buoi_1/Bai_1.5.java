package Buoi_1;

import java.util.Scanner;

class Bai_5 {
public static boolean kiemtratoanchan(int n){
	while(n>0){
		int t=n%10;
		if (t%2!=0) return false;
		n/=10;			
	}
	return true;
}
public static boolean kiemtratoanle(int n){
		while(n>0){
			int t=n%10;
			if (t%2==0) return false;
			n/=10;			
		}
		return true;
}
public static void main(String[] args) {
	int n;
	Scanner scanner= new Scanner(System.in);
	
	System.out.println("Nhập vào số nguyên dương n:");
	n=scanner.nextInt();
	
	while(n<=0) {
		System.out.println("Số vừa nhập phải lớn hơn 0. Xin mời nhập lại");
		n=scanner.nextInt();		
	}
	
	if (kiemtratoanchan(n)) System.out.println("n là số toàn chẵn");
	else if(kiemtratoanle(n)) System.out.println("n là số toàn lẻ");
	else System.out.println("n không là số toàn chẵn hay toàn lẻ");
	
}
}
