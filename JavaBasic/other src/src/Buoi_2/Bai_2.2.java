package Buoi_2;

import java.util.Scanner;

class Bai_2 {
	public static void nhapmang(int[] a,int n) {
		
		Scanner scanner= new Scanner(System.in);
		
		for(int i=0;i<n;i++) 
		{
			System.out.print("a["+i+"] = ");
			a[i]=scanner.nextInt();			
		}
	}
	
	public static void xuatmang(int[] a,int n) {
		System.out.print("Danh sách mảng:");
		for(int i=0;i<n;i++)
		{
			System.out.print("\t"+a[i]);
		}
		System.out.println();
	}
	public static void tinhtong(int[] a,int n) {
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
		}
		System.out.println("Tổng các phần tử của mảng = "+sum);
	}
public static void main(String[] args) {
	int[] a;
	Scanner scanner= new Scanner(System.in);
	
	System.out.print("Nhập kích thước mảng a: ");
	int n=scanner.nextInt();
	while(n<=0)
	{
		System.out.println("Số vừa nhập phải lớn hơn 0. Xin mời nhập lại");
		n=scanner.nextInt();
	}
	
	a=new int[n];
	nhapmang(a,n);
	xuatmang(a,n);
	tinhtong(a,n);
}
}
