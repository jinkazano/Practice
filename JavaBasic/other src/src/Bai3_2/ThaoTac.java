package Bai3_2;

import java.util.Scanner;

public class ThaoTac {

	//Hàm xuất với format
	public static void printFormat()
	{
		System.out.println();
		for(int i=1;i<=165;i++)
		{
			if(i == 1 || i == 14 || i == 27 || i == 65 || i == 83 || i == 101 || i == 119 || i == 142 || i == 165)
			{
				System.out.print("+");
				
			}
			else
			{
				System.out.print("-");
			}
			
		}
	}
	
	//Hàm xuất tiêu đề
	public static void printTitle()
	{
		printFormat();
		System.out.printf("\n| %-10s | %-10s | %-35s | %-15s | %-15s | %-15s | %-20s | %-20s |","STT","Mã","Tên Sản Phẩm","Giá Mua","Giá Bán","Số Lượng","Bán Toàn Bộ","Bán 2 phần 3");
		printFormat();
	}
	
	//Hàm xóa dấu cách
    public static String removeSpace(String s, boolean check) throws Exception
    {
        try
        {
            //Xóa tất cả dấu cách đầu và cuối 
            s = s.trim();

            //Xóa 2 dấu cách liền nhau 
            while(s.lastIndexOf("  ") != -1)	
            {
                s = s.replaceAll("  ", " ");
                
            }
            
            //Xóa tất cả các dấu cách còn lại 
            if(check)
            {
                while(s.lastIndexOf(" ") != -1)
                {
                    s = s.replaceAll(" ", "");
                }
            }

            return s;
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
    
    //Hàm chuẩn hóa dữ liệu
    public static void standardized(SanPham temp) throws Exception
    {
    	try
    	{
    		temp.setmaSP(removeSpace(temp.getmaSP(), true));
    		temp.settenSP(removeSpace(temp.gettenSP(), false));
    	}
    	catch(Exception ex)
    	{
    		throw ex;
    	}
    }
	
    //Hàm kiểm tra mã đã tồn tại
    public static int checkIDexist(SanPham[] sanpham, String ID, int n) throws Exception
    {
    	try
    	{
    		int result=-1;
    		if(n>0)
    		{
    			for (int i=0;i<n;i++)
    				if(ID.equalsIgnoreCase(sanpham[i].getmaSP()))
    				{
    					result=i;
    					break;
    				}
    		}
    		return result;
    	}
    	catch(Exception ex)
    	{
    		throw ex;
    	}
    }
    
    //Hàm check maSP
    public static boolean checkID(String s)throws Exception
    {
    	try
    	{
    		if(s.matches("[a-zA-Z0-9 ]{1,10}")) //mã là các kí tự a->z,A->Z,0->9 và nhỏ hơn 10 kí tự
    			return true;
    		else
    			return false;
    							
    	}
    	catch(Exception ex)
    	{
    		throw ex;
    	}
    }
    
    //Hàm check tenSP
    public static boolean checkName(String s)throws Exception
    {
    	try
    	{
    		if(s.matches("[a-zA-Z0-9 ]{2,35}"))
    			return true;
    		else
    			return false;
    	}
    	catch(Exception ex)
    	{
    		throw ex;
    	}
    }
    
    //Hàm check số
    public static boolean checkPoint(int point)throws Exception
    {
    	try
    	{
    		if(point>0)
    			return true;
    		else
    			return false;
    	}
    	catch(Exception ex)
    	{
    		throw ex;
    	}
    }
    
    //Hàm check all
    public static boolean checkAll(SanPham temp)throws Exception
    {
    	try
    	{
    		if(checkID(temp.getmaSP()) &&checkName(temp.gettenSP()) &&checkPoint(temp.getgiaban()) &&checkPoint(temp.getgiamua()) &&checkPoint(temp.getsoluong()) )
    			return true;
    		
    		else
    			return false;
    	}
    	catch(Exception ex)
    	{
    		throw ex;
    	}
    }
    
    //Hàm nhập sản phẩm
    public static void inputSP(SanPham[] sanpham,Count n)throws Exception
    {
    	SanPham temp=null;
    	Scanner scanner=new Scanner(System.in);
    	
    	try
    	{
    		//Nhập số sp trong khoảng 0 tới 100
    		do 
    		{
    			System.out.print("Nhập số lượng sản phẩm (0<n<100): ");
    			n.setN(scanner.nextInt());
    			
    		}while(n.getN()<=0||n.getN()>=100);
    		
    		for(int i=0;i<n.getN();i++)
    		{
    			System.out.printf("Nhập thông tin cho sản phấm thứ: %d",i+1);
    			temp = new SanPham();
    			
    			do
    			{
    				temp.inputSP(); //1 đối tượng chứa dữ liệu
    				standardized(temp); //chuẩn hóa dữ liệu
    				if(checkIDexist(sanpham,temp.getmaSP(),i)!=-1)
    				{
    					System.out.printf("\nThông báo: sản phẩm có mã \"%s\" đã tồn tại. Mời nhập lại:",temp.getmaSP());
    				}
    			}while(!checkAll(temp) || checkIDexist(sanpham,temp.getmaSP(),i)!=-1);
    			
    			sanpham[i]=temp; //sau khi chuẩn hóa và dữ liệu đúng điều kiện thì được gán cho sản phẩm thứ i	
    				
    		}
    	}
    	catch(Exception ex)
    	{
    		throw ex;
    	}
    	
    }
    
    //Hàm xuất sản phẩm
    public static void outputsp(SanPham[] sanpham, int n)throws Exception
    {
    	try
    	{
    		printTitle(); //in tiêu đề
    		
    		for(int i=0;i<n;i++)
    		{
    			System.out.printf("\n| %-10s |",i+1);
    			sanpham[i].displaySP();
    			System.out.printf("| %-20s ",bantoanbo(sanpham[i]));
    			System.out.printf("| %-20s |",ban2phan3(sanpham[i]));
    			
    			printFormat();
    			
    		}
    		
    		
    	}
    	catch(Exception ex)
    	{
    		throw ex;
    	}
    	
    }
    
    //Hàm thêm dữ liệu
    public static void addSP(SanPham[] sanpham, Count n)throws Exception
    {
    	
    	SanPham temp=null;
    	int them;
    	int m=n.getN();
    	Scanner scanner=new Scanner(System.in);
    	try
    	{
    		do
    		{
    			System.out.printf("Nhập vào số lượng sản phẩm muốn thêm (số lượng <=%d): ",99-n.getN());
    			them=scanner.nextInt();
    		}while(them>99-n.getN()||them<=0);
    		
    		n.setN(n.getN()+them);
    		
    		for(int i=m;i<n.getN();i++)
    		{
    			System.out.printf("Nhập thông tin cho sản phấm thứ: %d",i+1);
    			temp = new SanPham();
    			
    			do
    			{
    				temp.inputSP();// 1 đối tượng để chứa dữ liệu
    				standardized(temp);// chuẩn hóa dữ liệu
    				if(checkIDexist(sanpham,temp.getmaSP(),i)!=-1)
    				{
    					System.out.printf("\nThông báo: sản phẩm có mã \"%s\" đã tồn tại. Mời nhập lại",temp.getmaSP());
    				}
    			}while(!checkAll(temp)||checkIDexist(sanpham,temp.getmaSP(),i)!=-1);
    			sanpham[i]=temp;// gán cho sản phẩm thứ i sau khi được chuẩn hóa và đáp ứng điều kiện
    		}
    			
    	}
    	catch(Exception ex)
    	{
    		throw ex;
    		
    	}
    }
    
    //Hàm tính lãi bán hết toàn bộ
    public static String bantoanbo(SanPham temp)throws Exception
    {
    	try
    	{
    		return "Lãi "+temp.getsoluong()*(temp.getgiaban()-temp.getgiamua());
    	}
    	catch(Exception ex)
    	{
    		throw ex;
    	}
    }
    //Hàm tính lãi/lỗ bán 2/3
    public static String ban2phan3(SanPham temp)throws Exception
    {
    	int tienban=(2*temp.getsoluong()/3)*temp.getgiaban()-temp.getsoluong()*temp.getgiamua();
    	try
    	{
    		if(tienban>0) return "Lãi "+ tienban;
    		else return "Lỗ "+ -tienban;
    	}
    	catch(Exception ex)
    	{
    		throw ex;
    	}
    }
    
    public static boolean checkContinue(String s)throws Exception
    {
    	try
    	{
    		if(s.equalsIgnoreCase("continue")||s.equalsIgnoreCase("new")||s.equalsIgnoreCase("cancel"))
    			return true;
    		else
    			return false;
    	}
    	catch(Exception ex)
    	{
    		throw ex;
    	}
    }
    //Hàm lựa chọn nhập tiếp
    public static void seclecInput(SanPham[] sanpham, Count n)throws Exception
    {
    	Scanner scanner=new Scanner(System.in);
    	String Continue;
    	
    	try
    	{
    		if(n.getN()>0)
    		{
    			do
    			{
    				System.out.printf("\nTrong danh sách đã có sản phẩm, bạn muốn nhập lại hay tiếp tục thêm (nhập lại: new, tiếp tục: continue, thoát: cancel): ");
    				Continue=scanner.nextLine();
    			}while(!checkContinue(Continue));
    			
    			if(Continue.equalsIgnoreCase("continue"))
    				addSP(sanpham,n);
    			
    			else if(Continue.equalsIgnoreCase("new"))
    				inputSP(sanpham,n);
    			
    		}
    		else
    			inputSP(sanpham,n);
    		
    	}
    	catch(Exception ex)
    	{
    		throw ex;
    	}
    }
}
