package Buoi_2;

import java.util.Scanner;

class Bai_11 {
public static void nhapmang(int[][] a, int row, int col, char A) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Nhập vào các phần tử của ma trận "+A);
	for(int i=0;i<row;i++)
		for(int j=0;j<col;j++)
		{
			System.out.print(A+"["+i+"]["+j+"] = ");
			a[i][j]=scanner.nextInt();
		}
}
public static void xuatmang(int[][] a, int row, int col, char A) {
	System.out.println("Ma trận "+A);
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			System.out.print(a[i][j]+"\t");
			
		}
		System.out.println();
		
	}
}
public static void main(String[] args) {
	char a='A';
	char b='B';
	char c='C';
	int row1,row2,col1,col2;
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Nhập số dòng của ma trận A");
	row1=scanner.nextInt();
	while(row1<=0)
	{
		System.out.println("Số vừa nhập phải lớn hơn 0. Xin mời nhập lại");
		row1=scanner.nextInt();
	}
	System.out.println("Nhập số cột của ma trận A");
	col1=scanner.nextInt();
	while(col1<=0)
	{
		System.out.println("Số vừa nhập phải lớn hơn 0. Xin mời nhập lại");
		col1=scanner.nextInt();
	}
	System.out.println("Nhập số dòng của ma trận B");
	row2=scanner.nextInt();
	while(row2<=0)
	{
		System.out.println("Số vừa nhập phải lớn hơn 0. Xin mời nhập lại");
		row2=scanner.nextInt();
	}
	System.out.println("Nhập số cột của ma trận B");
	col2=scanner.nextInt();
	while(col2<=0)
	{
		System.out.println("Số vừa nhập phải lớn hơn 0. Xin mời nhập lại");
		col2=scanner.nextInt();
	}
	
	int[][] A=new int[row1][col1];
	int[][] B=new int[row2][col2];
	
	int[][] C=new int[row1][col2]; // C=A*B có số dòng = A và số cột = B
	
	while(col1!=row2)
	{
		System.out.println("Để nhân hai ma trận thì số cột của A phải bằng số dòng của B");
		System.out.println("Nhập lại số cột của ma trận A: ");
        col1 = scanner.nextInt();
        System.out.println("Nhập vào số dòng của ma trận B: ");
        row2 = scanner.nextInt();
	}
	
	
	nhapmang(A,row1,col1,a); // Nhập và xuất A,B
	nhapmang(B,row2,col2,b);
	xuatmang(A,row1,col1,a);
	xuatmang(B,row2,col2,b);
	
	for (int i=0;i<row1;i++) // Tính C=A*B
	{
		for (int j=0;j<col2;j++)
		{
			C[i][j]=0;
			for(int k=0;k<col1;k++) C[i][j]+=A[i][k]*B[k][j];
		}
	}
	xuatmang(C,row1,col2,c);
		

}
}
