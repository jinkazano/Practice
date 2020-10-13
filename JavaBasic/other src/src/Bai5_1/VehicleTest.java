package Bai5_1;

import java.util.Scanner;

public class VehicleTest {

    public static void printLine()
    {
        System.out.println();

        for(int i = 1; i <= 100; i++)
        {
            if(i == 1 || i == 100)
                System.out.print("+");

            else
                System.out.print("-");
        }
    }

    public static void printMenu()
    {
        printLine();
        System.out.printf("\n| %-90s %7s", "Menu: ", "|");
        System.out.printf("\n| %-90s %7s", "1. Nhập thông tin", "|");
        System.out.printf("\n| %-90s %7s", "2. Xuất bảng kê khai tiền thuế trước bạ của các xe", "|");

        System.out.printf("\n| %-90s %7s", "3. Kết thúc.", "|");
        printLine();
    }

    public static void main(String[] args) {
        try
        {
            final int max = 100;
            Vehicle[] xe = new Vehicle[max];
            Scanner scanner = new Scanner(System.in);
            Count n = new Count();
            int selected;

            do
            {
                printMenu();
                System.out.print("\nNhập vào chức năng: ");
                selected= scanner.nextInt();
                System.out.flush();

                switch(selected)
                {
                    case 1:
                    {
                        System.out.print("\n1. Nhập thông tin. ");
                        ThaoTac.input(xe,n);
                        break;

                    }
                    case 2:
                    {
                        if(n.getN()==0)
                            System.out.println("Chưa nhập thông tin, hãy chọn 1 trong menu để nhập. ");
                        else
                        {
                            System.out.print("\n2. Bảng kê khai tiền thuế trước bạ của các xe");
                            ThaoTac.output(xe,n.getN());
                        }
                        break;


                    }
                    case 3:
                    {
                        System.out.println("Chương trình kết thúc!");
                        System.exit(0);
                    }
                    default:
                    {
                        System.out.println("Chương trình không có chức năng này.");
                        break;
                    }
                }




            }while(selected!=3);


        }
        catch(Exception ex)
        {
            //ex.printStackTrace();
            System.err.println("Nhập sai! Chương trình tự động kết thúc");
            System.exit(0);
        }
    }
}
