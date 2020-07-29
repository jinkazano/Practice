package Bai5_2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
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


    public static void printMenu()
    {
        printLine();
        System.out.printf("\n| %-90s %7s", "Menu: ", "|");
        System.out.printf("\n| %-90s %7s", "1. Tối giản phân số.", "|");
        System.out.printf("\n| %-90s %7s", "2. Nghịch đảo phân số.", "|");
        System.out.printf("\n| %-90s %7s", "3. Cộng trừ nhân chia 2 phân số.", "|");
        System.out.printf("\n| %-90s %7s", "4. So sánh phân số.", "|");
        System.out.printf("\n| %-90s %7s", "0. Kết thúc.", "|");
        printLine();
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Rational ps1=new Rational();
        Rational ps2=new Rational();
        int selected;

        do {
            printMenu();
            System.out.print("\nNhập vào chức năng: ");
            selected=scanner.nextInt();
            System.out.flush();

            switch (selected)
            {
                case 1:
                {
                    System.out.println("Nhập phân số: ");
                    ps1.inputps();
                    ps1.outputps("\nPhân số sau khi tối giản: ");
                    break;
                }
                case 2:
                {
                    System.out.println("Nhập phân số: ");
                    ps1.inputps();

                    ps1.ngichdaophanso().outputps("\nPhân số sau khi ngịch đảo: ");
                    break;
                }
                case 3:
                {
                    System.out.println("Nhập phân số thứ 1: ");
                    ps1.inputps();
                    System.out.println("Nhập phân số thứ 2: ");
                    ps2.inputps();

                    ps1.Tong(ps2).outputps( "\nTổng hai phân số: ");
                    ps1.Hieu(ps2).outputps( "\nHiệu hai phân số: ");
                    ps1.Tich(ps2).outputps( "\nTích hai phân số: ");
                    ps1.Thuong(ps2).outputps( "\nThương hai phân số: ");
                    break;
                }
                case 4:
                {
                    System.out.println("Nhập phân số thứ 1: ");
                    ps1.inputps();
                    System.out.println("Nhập phân số thứ 2: ");
                    ps2.inputps();

                    ps1.SoSanh(ps2);
                    break;

                }
                case 0:
                {
                    System.out.println("Kết thúc!");
                    System.exit(0);
                }
                default:
                {
                    System.out.println("Chương trình không có chức năng này.");
                    break;
                }
            }


        }while(selected!=0);







    }
}
