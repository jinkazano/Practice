package Buoi_1;

import java.util.Scanner;

 class Bai_15 {
public static void main(String[] args) {
	int n;
	int q=0;
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Nhập vào số nguyên dương n:");
	n=scanner.nextInt();
	
	while(n<=0)
	{
		System.out.println("Số vừa nhập phải lớn hơn 0. Xin mời nhập lại");
		n=scanner.nextInt();
	}
	System.out.println("Tam giác cân có cạnh "+n);
	while (n > 0)
    {
        for (int i = 1; i<n; i++)
            System.out.print(" ");
        for (int j = 0; j <= q; j ++)
            System.out.print("*");
        n -- ;
        q += 2 ;
        System.out.println();
    }
}
}
