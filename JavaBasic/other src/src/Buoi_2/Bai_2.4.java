package Buoi_2;

import java.util.Scanner;

 class Bai_4 {
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
public static boolean timpt(int[] a,int n,int x) {
	for(int i=0;i<n;i++) 
	{
		if(a[i]==x) return true;
	}
	return false;
}
public static void dempt(int[] a,int n, int x) {
	int dem=0;
	for(int i=0;i<n;i++)
	{
		if(a[i]==x) dem++;
	}
	System.out.println("Số "+x+" xuất hiện "+dem+" lần trong mảng");
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
	System.out.print("Nhập số cần tìm: ");
	int x=scanner.nextInt();
	if(timpt(a,n,x)) dempt(a,n,x);
	else System.out.println("Số "+x+" không thuộc mảng");
}
}
