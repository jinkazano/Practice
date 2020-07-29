package Buoi_2;

import java.util.Scanner;

class Bai_6 {
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
public static void swap(int a[], int x, int y){
    int temp;
    temp=a[x];a[x]=a[y];a[y]=temp;
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
	
	for(int i=0;i<n-1;i++)	// Đẩy số dương qua bên trái, số âm qua bên phải, số 0 ở giữa
	{
		for(int j=i+1;j<n;j++)
	    {
			if((a[i]<0&&a[j]>0)||(a[i]==0&&a[j]>0))
	        swap(a,i,j);
	    
	    }
	 } 
	for(int i=0;i<n-1;i++) // Sắp xếp lại theo thứ tự trái tăng dần, phải giảm dần
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[i]>a[j]) swap(a,i,j);
			if(a[i]<0&&a[i]<a[j]) swap(a,i,j);
		}
	}
	System.out.println("\nMảng a sau khi sắp xếp:");
	xuatmang(a,n);

}
}
