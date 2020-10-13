package Bai3_1;

import java.util.Scanner;

public class ThaoTac {
	//Hàm xuất với format
	public static void printFormat()
	{
		System.out.println();
		for(int i=1;i<=173;i++)
		{
			 if (i == 1 || i == 14 || i == 27 || i == 65 || i == 83 || i == 101 || i == 119 || i == 137 || i == 155 || i == 173)
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
        System.out.printf("\n| %-10s | %-10s | %-35s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |", "STT", "Mã SV", "Họ Và Tên", "Quê Quán", "Điểm Toán A1", "Điểm Toán A2", "Điểm Nguyên Lí","Điểm Trung Bình","Tiền Thi Lại");
        printFormat();		
	}
	
	//Hàm xóa dấu cách
    public static String removeSpace(String s, boolean check) throws Exception
    {
        try
        {
            //xóa tất cả dấu cách đầu và cuối của xâu.
            s = s.trim();

            //hàm xóa 2 dấu cách liền nhau trong xâu.
            while(s.lastIndexOf("  ") != -1)	
            {
                s = s.replaceAll("  ", " ");
            }

            //xóa tất cả các dấu cách còn lại trong xâu chỉ dùng với mã học sinh
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
    public static void standardized(SinhVien temp) throws Exception
    {
        try
        {
            temp.setmaSV(removeSpace(temp.getmaSV(), true));
            temp.settenSV(removeSpace(temp.gettenSV(), false));
            temp.setque(removeSpace(temp.getque(), false));
        }
        catch(Exception ex)
        {
            throw ex;
        
        }
    }
    //Hàm check ID đã tồn tại
    public static int checkIDExists(SinhVien[] sinhVien, String ID, int n) throws Exception
    {
        try
        {
            int result = -1;

            if(n > 0)
            {
                for(int i = 0; i < n; i++)
                {
                    if(ID.equalsIgnoreCase(sinhVien[i].getmaSV()))
                    {
                        result = i;
                        break;
                    }
                }
            }

            return result;
        }
        catch(Exception ex)
        {
            throw ex;
        
        }
    }
    
    //Hàm check maSV
    public static boolean checkID(String s) throws Exception
    {
        try
        {
            //kiểm tra xem ID có đúng định dạng không? ID chỉ chứa các ký tự từ a -> z, A -> Z và 0 -> 9 độ dài = 10
            if(s.matches("[a-zA-Z0-9 ]{1,10}"))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
    
    //Hàm check tenSv
    public static boolean checkFullName(String s) throws Exception
    {
        try
        {
            //kiểm tra họ tên, họ tên chỉ chứa các ký tự từ a -> z và A -> Z, từ 5-40 kí tự
            if(s.matches("[a-zA-Z ]{1,40}"))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
    
    //Hàm check que
    public static boolean checkQue(String s) throws Exception
    {
        try
        {
            //kiểm tra quê, quê chỉ chứa các ký tự từ a -> z và A -> Z, từ 5-15 kí tự
            if(s.matches("[a-zA-Z ]{1,15}"))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
    
    //Hàm check số
    public static boolean checkPoint(double point) throws Exception
    {
        try
        {
            //Kiểm tra điểm, điểm chỉ được lơn hơn hoặc bằng 0 và nhỏ hơn hoặc bằng 10
            if(point >= 0 && point <= 10)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
    
    //Hàm check all
    public static boolean checkAll(SinhVien temp) throws Exception
    {
    	try
    	{
    		//Gọi các hàm kiểm tra tất cả dữ liệu vào
    		if(checkID(temp.getmaSV()) && checkFullName(temp.gettenSV()) && checkQue(temp.getque()) && checkPoint(temp.gettoana1()) && checkPoint(temp.gettoana3()) && checkPoint(temp.getnguyenli()) )
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    
    	}
    	catch(Exception ex)
    	{
    		throw ex;
    	}
    }
    //Hàm nhập SinhVien
    public static void inputSinhVien(SinhVien[] sinhVien, Count n) throws Exception
    {
        SinhVien temp = null;
        Scanner scanner = new Scanner(System.in);
        

        try
        {
            //Nhập số lượng học sinh số lượng học sinh chỉ được lớn hơn 0 và nhỏ hơn 100
            do
            {
                System.out.print("\nBạn nhập vào số lượng học sinh(0 < n < 100 ): ");
                n.setN(scanner.nextInt());
            }
            while(n.getN() <= 0 || n.getN() >= 100);

            for(int i = 0; i < n.getN(); i++)
            {
                System.out.printf("Bạn nhập vào thông tin cho sinh viên thứ %d: ", i + 1);
                temp = new SinhVien();

                do
                {
                    temp.inputSinhVien();//1 đối tượng để chứa dữ liệu
                    standardized(temp);//chuẩn hóa dữ liệu.

                    if(checkIDExists(sinhVien, temp.getmaSV(), i) != -1)
                    {
                        System.out.printf("\nThông báo: Sinh viên có mã \"%s\" đã có trong danh sách. Mời bạn nhập lại:", temp.getmaSV());
                    }
                }
                while(!checkAll(temp) || checkIDExists(sinhVien, temp.getmaSV(), i) != -1);

                sinhVien[i] = temp;//khi được chuẩn hóa và dữ liệu đúng điều kiện thì gán cho học sinh thứ i
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
    
    //Hàm thêm dữ liệu
    public static void addSinhVien(SinhVien[] sinhVien, Count n) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        SinhVien temp = null;
        int count, m = n.getN();

        try
        {
            do
            {
                System.out.printf("Bạn nhập vào số lượng sinh viên muốn thêm (số lượng <= %d): ", 99 - n.getN());
                count = scanner.nextInt();
            }
            while(!(count < 99 - n.getN()) || count <= 0);

            n.setN(n.getN() + count);

            for(int i = m; i < n.getN(); i++)
            {
                System.out.printf("Bạn nhập vào thông tin cho sinh viên thứ %d: ", i + 1);
                temp = new SinhVien();

                do
                {
                    temp.inputSinhVien();//1 đối tượng để chứa dữ liệu
                    standardized(temp);//chuẩn hóa dữ liệu.

                    if(checkIDExists(sinhVien, temp.getmaSV(), i) != -1)
                    {
                        System.out.printf("\nThông báo: ID \"%s\" đã có trong danh sách. Mời bạn nhập lại:", temp.getmaSV());
                    }
                }
                while(!checkAll(temp) || checkIDExists(sinhVien, temp.getmaSV(), i) != -1);

                sinhVien[i] = temp;//khi được chuẩn hóa và dữ liệu đúng điều kiện thì gán cho học sinh thứ i
            }            
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
    
    //Hàm xuất SinhVien
    public static void outputSinhVien(SinhVien[] sinhVien, int n) throws Exception
    {
        try
        {
            printTitle();//in ra tiêu đề

            for(int i = 0; i < n; i++)
            {
                System.out.printf("\n| %-10d |", i + 1);
                sinhVien[i].displaySinhVien();//in thông tin của các sinh viên
                System.out.printf("| %-15.2f ",avr(sinhVien[i])); // in điểm trung bình
                System.out.printf("| %-15d |",tienthilai(sinhVien[i])); //in tiền thi lại
    
                printFormat();//in ra các line
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
    
    //Hàm tính điểm trung bình
    public static double avr(SinhVien temp) throws Exception
    {
        try
        {
            return (temp.gettoana1() + temp.gettoana3() + temp.getnguyenli())/3;//tính trung bình
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
    
    //Hàm tính tiền thi lại
    public static int tienthilai(SinhVien temp) throws Exception
    {
    	int tien = 0;
    	try
    	{
    		if(temp.gettoana1()<4) tien+=90000;
    		if(temp.gettoana3()<4) tien+=90000;
    		if(temp.getnguyenli()<4) tien+=90000;
    		return tien;
    	}
    	catch(Exception ex)
    	{
    		throw ex;
    	}
    }
    
    
    public static boolean checkContinue(String s) throws Exception
    {
        try
        {
            
            if(s.equalsIgnoreCase("continue") || s.equalsIgnoreCase("new") || s.equalsIgnoreCase("cancel"))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
    // Hàm lựa chọn nhập tiếp
    public static void selectInput(SinhVien[] sinhVien, Count n) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        String Continue;
        
        try
        {
            if(n.getN() > 0)
            {
                do
                {
                    System.out.print("\nTrong danh sách đã có sinh viên bạn muốn nhập lại hay tiếp tục thêm? (nhập lại: new, tiếp tục: continue, thoát: cancel): ");
                    Continue = scanner.nextLine();
                }
                while(!checkContinue(Continue));

                if(Continue.equalsIgnoreCase("Continue"))
                {
                    addSinhVien(sinhVien, n);
                }
                else if(Continue.equalsIgnoreCase("new"))
                {
                    inputSinhVien(sinhVien, n);
                }
            }
            else
            {
                inputSinhVien(sinhVien, n);
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
   
}
    
