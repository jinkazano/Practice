package Buoi_1;

import java.util.Scanner;

 class Bai_14 {
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
	System.out.println("Tam giác vuông cân có cạnh "+n);
	for(int i=1;i<=n;i++)
	{
		for (int j=1;j<=i;j++) System.out.print("* ");
		System.out.println();
	}
}
}
