package Bai5_1;

import java.util.Scanner;

public class ThaoTac {

    public static void printTitle()
    {
        System.out.printf("\n%-10s %-35s %-30s %-15s %-15s %-15s\n","STT","Tên Chủ Xe","Loại Xe","Dung Tích","Trị Giá","Thuế");
        for (int i=0;i<150;i++)
            System.out.print("=");

    }
    public static boolean checkName(String s)throws Exception
    {
        try
        {
            if(s.matches("[a-zA-Z ]{1,40}"))
                return true;
            else
                return false;

        }
        catch(Exception ex)
        {
            throw ex;
        }

    }

    public static boolean checkXe(String s)throws Exception
    {
        try
        {
            if(s.matches("[a-zA-Z0-9 ]{1,40}"))
                return true;
            else
                return false;

        }
        catch(Exception ex)
        {
            throw ex;
        }

    }

    public static boolean checkNumber(long n)throws Exception
    {
        try
        {
            if(n>0)
                return true;
            else
                return false;
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    public static boolean checkAll(Vehicle temp)throws Exception
    {
        try
        {
            if(checkName(temp.getTenchu())&&checkXe(temp.getLoaixe())&&checkNumber(temp.getDungtich())&&checkNumber(temp.getTrigia()))
                return true;
            else
                return false;
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }


    public static void input(Vehicle[] xe, Count n)throws Exception
    {
        Vehicle temp= null;
        Scanner scanner=new Scanner(System.in);
        try
        {
            do {
                System.out.print("\nNhập vào số lượng xe (số nguyên dương nhỏ hơn 100): ");
                n.setN(scanner.nextInt());

            }while(n.getN()<=0||n.getN()>=100);

            for(int i=0;i<n.getN();i++)
            {
                System.out.printf("Nhập vào phương tiện thứ %d: ",i+1);
                temp= new Vehicle();
                do {
                    temp.inputXe();

                }while(!checkAll(temp));
                xe[i]=temp;


            }


        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    public static void output(Vehicle[] xe,int n)throws Exception
    {
        try
        {
            printTitle();
            for(int i=0;i<n;i++)
            {
                System.out.printf("\n%-10d",i+1);
                xe[i].displayXe();
            }

        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
}
