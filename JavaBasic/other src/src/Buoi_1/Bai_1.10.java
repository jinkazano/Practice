package Buoi_1;

import java.util.Scanner;

 class Bai_10 {
public static boolean kiemtranguyento(int n) {
	if (n<2) return false;
	for (int i=2;i<=(int)Math.sqrt(n);i++)
	{
		if(n%i==0) return false;
	}
	return true;
}
public static void main(String[] args) {
	int n;
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Nhập vào số nguyên dương n:");
	n=scanner.nextInt();
	
	while(n<=0)
	{
		System.out.println("Số vừa nhập phải lớn hơn 0. Xin mời nhập lại");
		n=scanner.nextInt();
	}
	if(kiemtranguyento(n)) System.out.println("n là số nguyên tố");
	else System.out.println("n không là số nguyên tố");
	
		
}
}
