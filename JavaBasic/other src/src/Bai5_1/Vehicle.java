package Bai5_1;


import java.util.Scanner;

public class Vehicle {

    //Field
    private String tenchu;
    private String loaixe;
    private long dungtich;
    private long trigia;
    private double thue;



    //Property




    public String getTenchu() {
        return tenchu;
    }

    public void setTenchu(String tenchu) {
        this.tenchu = tenchu;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public long getDungtich() {
        return dungtich;
    }

    public void setDungtich(long dungtich) {
        this.dungtich = dungtich;
    }

    public long getTrigia() {
        return trigia;
    }

    public void setTrigia(long trigia) {
        this.trigia = trigia;
    }

    public double thue() {
        if(dungtich<100) return trigia*0.01;
        else if(dungtich<200) return trigia*0.03;
        else return trigia*0.05;
    }

    public Vehicle() {
    }

    public Vehicle(String tenchu, String loaixe, long dungtich, long trigia) {
        this.tenchu = tenchu;
        this.loaixe = loaixe;
        this.dungtich = dungtich;
        this.trigia = trigia;
        this.thue = thue;
    }


    public void inputXe() throws Exception {
        Scanner scanner=new Scanner(System.in);
        try
        {

            do
            {
                System.out.print("\nNhập vào tên chủ xe (lớn hơn hoặc bằng 5 kí tự chữ cái) :");
                setTenchu(scanner.next());
            }while(!ThaoTac.checkName(tenchu));

            do
            {
                System.out.print("Nhập vào loại xe (lớn hơn hoặc bằng 5 kí tự, không có kí tự đặc biệt) :");
                setLoaixe(scanner.next());
            }while(!ThaoTac.checkXe(loaixe));

            do
            {
                System.out.print("Nhập vào dung tích xe (số nguyên dương) :");
                setDungtich(scanner.nextInt());
            }while(!ThaoTac.checkNumber(dungtich));

            do
            {
                System.out.print("Nhập vào trị giá xe (số nguyên dương) :");
                setTrigia(scanner.nextInt());
            }while(!ThaoTac.checkNumber(trigia));

        }
        catch(Exception ex)
        {
            throw ex;
        }

    }

    public void displayXe() throws Exception
    {
        try
        {

            System.out.printf(" %-35s %-30s %-15d %-15d %-15.0f",tenchu,loaixe,dungtich,trigia,thue());


        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

}

