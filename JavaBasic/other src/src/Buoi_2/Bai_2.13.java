package Buoi_2;

import java.util.Scanner;

class Bai_13 {
public static void main(String[] args) {
	
	int dem=0;
	Scanner scanner=new Scanner(System.in);
	
	System.out.print("Nhập chuỗi: ");
	String chuoi=scanner.nextLine();
	
	System.out.print("Nhập ký tự: ");
	char kytu=scanner.next().charAt(0);
	
	for(int i=0;i<chuoi.length();i++)
		if(chuoi.charAt(i)==kytu) dem++;
	
	if(dem!=0) System.out.println("Kí tự "+kytu+" xuất hiện "+dem+" lần trong chuỗi "+chuoi);
	else System.out.println("Kí tự "+kytu+" không thuộc chuỗi "+chuoi);
}
}
