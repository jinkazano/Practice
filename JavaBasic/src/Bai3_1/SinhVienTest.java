package Bai3_1;

import java.util.Scanner;

public class SinhVienTest {
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
        System.out.printf("\n| %-90s %7s", "1. Nhập một sinh viên mới.", "|");
        System.out.printf("\n| %-90s %7s", "2. Xem danh sách sinh viên.", "|");

        System.out.printf("\n| %-90s %7s", "0. Kết thúc.", "|");
        printLine();
    }
    
    //Hàm main
    public static void main(String[] args)
    {
        try
        {
            final int max = 100;
            SinhVien[] sinhVien = new SinhVien[max];
            Scanner scanner = new Scanner(System.in);
            Count n = new Count();
            int selected;
            
         
                       
            do
            {
                printMenu();
                System.out.print("\nBạn nhập vào chức năng: ");
                selected = scanner.nextInt();
                System.out.flush();                

                switch(selected)
                {
                    case 1:
                    {
                        System.out.print("\n1. Nhập sinh viên mới.");
                        ThaoTac.selectInput(sinhVien, n);
                        break;
                    }
                    case 2:
                    {
                        if(n.getN() == 0 )
                        {
                            System.out.println("Chưa có sinh viên nào trong danh sách bạn hãy chọn menu 1 để nhập các thông tin cho sinh viên.");
                        }
                        else
                        {
                            System.out.print("\n2. Xem danh sách sinh viên.");
                            ThaoTac.outputSinhVien(sinhVien, n.getN());
                        }

                        break;
                    }
                   
                    case 0:
                    {
                        System.out.println("Kết thúc.");
                        break;
                    }
                    default:
                    {
                        System.out.println("Chương trình không có chức năng này.");
                        break;
                    }
                }
            }
            while(selected != 0);
        }
        catch(Exception ex)
        {
            //ex.printStackTrace(); xem ngoại lệ
            System.err.print("Bạn nhập sai chương trình tự động kết thúc.");
            System.exit(0);
            
        }
    }
}
