package Buoi_2;

import java.util.Scanner;

class Bai_10 {
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

public static void swap(int a[], int x, int y){
    int temp;
    temp=a[x];a[x]=a[y];a[y]=temp;
}

public static void sapxeptangdan(int[][] a, int row, int col) {
	int[] b=new int[row*col];
	int n=0;
	for(int i=0;i<row;i++) // Biến mảng 2 chiều thành mảng 1 chiều
		for(int j=0;j<col;j++)
			b[n++]=a[i][j];
					
	for(int i=0;i<n-1;i++) // Sắp xếp mảng 1 chiều tăng dần
		for(int j=i+1;j<n;j++)
			if(b[i]>b[j]) swap(b,i,j);
	n=0;
	for(int i=0;i<row;i++) // Gán trở lại
		for(int j=0;j<col;j++)
			a[i][j]=b[n++];
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
	
	sapxeptangdan(a,row,col);
	System.out.println("Mảng a sau khi sắp xếp:");
	xuatmang(a,row,col);
	
	
}
}
