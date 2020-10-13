package Buoi_1;

import java.util.Scanner;

 class Bai_12 {
public static void main(String[] args) {
	int a,b,c;
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Nhập số a");
	a=scanner.nextInt();
	System.out.println("Nhập số b");
	b=scanner.nextInt();
	System.out.println("Nhập số c");
	c=scanner.nextInt();
	
	if(a<0) a=-a;
	if(b<0) b=-b;
	if(c<0) c=-c;
	
	System.out.println("a = "+a);
	System.out.println("b = "+b);
	System.out.println("c = "+c);
}
}
