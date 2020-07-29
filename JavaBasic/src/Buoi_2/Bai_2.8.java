package Buoi_2;

import java.util.Scanner;

 class Bai_8 {

	
public static void xuatmang(int[] a,int n) {
		System.out.print("Dãy Fibonasi với "+n+" phần tử: ");
		for(int i=0;i<n;i++)
		{
			System.out.print("\t"+a[i]);
		}
		System.out.println();
	}
public static void main(String[] args) {
	
	int[] a;
	Scanner scanner= new Scanner(System.in);
	
	System.out.print("Nhập số phần tử của dãy Fibonasi: ");
	int n=scanner.nextInt();
	while(n<=0)
	{
		System.out.println("Số vừa nhập phải lớn hơn 0. Xin mời nhập lại");
		n=scanner.nextInt();
	}
	a=new int[n];
	a[0]=0;
	a[1]=1;
	
	for(int i=2;i<n;i++)
	{
		a[i]=a[i-1]+a[i-2];
	}

	xuatmang(a,n);
	
}
}
