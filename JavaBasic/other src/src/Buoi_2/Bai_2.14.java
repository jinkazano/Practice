package Buoi_2;

import java.util.Scanner;

class Bai_14 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.print("Nhập chuỗi 1: ");
	String s1=scanner.nextLine();
	System.out.print("Nhập chuỗi 2: ");
	String s2=scanner.nextLine();
	
	String s3=s1.concat(s2);
	System.out.print("Chuỗi mới sau khi nối: "+s3);
}
}
