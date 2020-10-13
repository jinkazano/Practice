package Buoi_1;

import java.util.Scanner;

class Bai_6 {
public static boolean kiemtragiamdan(int n) {
	int cs1=n%10;
	n/=10;
	while(n>0) {
		int cs2=n%10;
		if(cs2<=cs1) return false;
		else cs1=cs2;
		n/=10;
	}
	return true;

}
public static void main(String[] args) {
	int n;
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Nhập vào số nguyên dương n:");
	n=scanner.nextInt();
	
	while(n<=0) {
		System.out.println("Số vừa nhập phải lớn hơn 0. Xin mời nhập lại");
		n=scanner.nextInt();		
	}
	if (kiemtragiamdan(n)) System.out.println("n là số nguyên dương giảm dần từ trái sang phải");
	else System.out.println("n không là số nguyên dương giảm dần từ trái sang phải");

}
}
