package Bai3_2;

import java.util.Scanner;

public class SanPhamTest {

	//Hàm in dòng
    public static void printLine()
    {
        System.out.println();
        
        for(int i = 1; i <= 100; i++)
        {
            if(i == 1 || i == 100)
            {
                System.out.print("+");
            }
            else
            {
                System.out.print("-");
            }
        }
    }
    
  //Hàm in menu
    public static void printMenu()
    {
        printLine();
        System.out.printf("\n| %-90s %7s", "Menu: ", "|");
        System.out.printf("\n| %-90s %7s", "1. Nhập sản phẩm.", "|");
        System.out.printf("\n| %-90s %7s", "2. Xem danh sách sản phẩm.", "|");
        System.out.printf("\n| %-90s %7s", "0. Kết thúc.", "|");
        printLine();
    }
    
    //Hàm main
    
    public static void main(String[] args) 
    {
    	try
    	{
    		final int max=100;
    		SanPham[] sanpham=new SanPham[max];
    		Count n=new Count();
    		Scanner scanner=new Scanner(System.in);
    		int luachon;
    		do
    		{
    			printMenu();
    			System.out.print("\nNhập chức năng :");
    			luachon=scanner.nextInt();
    			System.out.flush();
    			
    			switch(luachon)
    			{
    			case 1:
    				{
    					System.out.print("1. Nhập sản phẩm mới.");
    					ThaoTac.seclecInput(sanpham, n);
    					
    					break;
    				}
    			case 2:
    			{
    				if(n.getN()==0) 
    					System.out.println("Chưa có sản phẩm trong danh sách mời chọn chức năng 1 trong menu");
    				else
    				{
    					System.out.print("2. Xem danh sách sản phẩm.");
    					ThaoTac.outputsp(sanpham, n.getN());
    					
    				}
    				break;
    					
    			}
    			case 0:
    			{
    				System.out.println("Kết thúc!");
    				break;
    			}
    			default:
    				System.out.println("Không có chức năng này.");
    				break;
    			}
    			
    		}while(luachon!=0);
    		
    	}
    	catch(Exception ex)
    	{
    		ex.printStackTrace();
    		System.err.print("Nhập sai! Chương trình tự động kết thúc");
    		System.exit(0);
    	}
    }
	
}
