package Buoi_2;

import java.util.Scanner;

 class Bai_15 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	String s1 = null;
	int chon;
	boolean daNhap=false;
	
	 
	System.out.println("**********MENU**********");
	for(;;)
	{
	System.out.println("1. Nhập chuỗi");
	System.out.println("2. Viết hoa toàn bộ chuỗi");
	System.out.println("3. Viết thường toàn bộ chuỗi");
	System.out.println("4. Thoát");

	do {
        System.out.println("Bấm số để chọn (1~4): ");
        chon = scanner.nextInt();
    } while ((chon < 1) || (chon > 4));
	
	switch(chon)
	{
		case 1:
		
			System.out.print("Mời nhập chuỗi:");
			s1=scanner.nextLine();
			daNhap=true;
			System.out.println(s1+"");
			scanner.nextLine();
			break;
		
		case 2:
			if(daNhap)
			{
			
				System.out.println("Chuỗi được viết hoa: "+s1.toUpperCase());
			}
			else System.out.println("Mời nhập chuỗi trước!");
			scanner.nextLine();
			try {
				  Thread.sleep(500);
				}
				catch (Exception e) {}
			break;
		case 3:
			if(daNhap)
			{
				
				System.out.println("Chuỗi được viết hoa: "+s1.toLowerCase());
			}
			else System.out.println("Mời nhập chuỗi trước!");
			scanner.nextLine();
			try {
				  Thread.sleep(500);
				}
				catch (Exception e) {}
			
			break;
		case 4:
			System.out.println("Bạn đã chọn thoát!");
			System.exit(0);
			break;


		default:
			throw new IllegalStateException("Unexpected value: " + chon);
	}
	
}
}
}
