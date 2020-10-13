package Buoi_2;

import java.util.Scanner;

class Bai_9 {
public static void nhapmang(int[][] a, int row, int col) {
	Scanner scanner=new Scanner(System.in);
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			System.out.print("a["+i+"]["+j+"] = ");
			a[i][j]=scanner.nextInt();
		}
	}
}
public static void xuatmang(int[][] a, int row, int col) {
	System.out.println("Xuất mảng:");
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++) System.out.print(a[i][j]+"\t");
		System.out.println();
	
	}		
}
public static boolean kiemtranguyento(int n) {
	if (n<2) return false;
	for (int i=2;i<=(int)Math.sqrt(n);i++)
	{
		if(n%i==0) return false;
	}
	return true;
}

public static void nguyento(int[][] a, int row, int col) {
	System.out.println("Các số nguyên tố trong mảng:");
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			if(kiemtranguyento(a[i][j])) System.out.println("a["+i+"]["+j+"]="+a[i][j]);
		}
	}
}
public static void main(String[] args) {
	
	int[][] a;
	Scanner scanner= new Scanner(System.in);
	
	System.out.print("Nhập số hàng mảng a: ");
	int row=scanner.nextInt();
	while(row<=0)
	{
		System.out.println("Số vừa nhập phải lớn hơn 0. Xin mời nhập lại");
		row=scanner.nextInt();
	}
	System.out.print("Nhập số cột mảng a: ");
	int col=scanner.nextInt();
	while(col<=0)
	{
		System.out.println("Số vừa nhập phải lớn hơn 0. Xin mời nhập lại");
		col=scanner.nextInt();
	}
	a=new int[row][col];
	
	nhapmang(a,row,col);
	xuatmang(a,row,col);
	nguyento(a,row,col);
}
}
