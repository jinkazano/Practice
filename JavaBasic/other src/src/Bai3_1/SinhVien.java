package Bai3_1;

import java.util.Scanner;


public class SinhVien {
	
	//Field
	private String maSV;
	private String tenSV;
	private String que;
	private double toana1;
	private double toana3;
	private double nguyenli;
	
	//Proverty	
	public String getmaSV() {
		return maSV;
	}
	
	public void setmaSV(String maSV) {
		this.maSV=maSV;
	}
	
	public String gettenSV() {
		return tenSV;
	}

	public void settenSV(String tenSV) {
		this.tenSV=tenSV;
	}
	public String getque() {
		return que;		
	}
	public void setque(String que) {
		this.que=que;		
	}
	public double gettoana1() {
		return toana1;
	}
	public void settoana1(double toana1) {
		this.toana1=toana1;
	}
	public double gettoana3() {
		return toana3;
	}
	public void settoana3(double toana3) {
		this.toana3=toana3;
	}
	public double getnguyenli() {
		return nguyenli;
	}
	public void setnguyenli(double nguyenli) {
		this.nguyenli=nguyenli;
	}
	
	//Paramater
	public SinhVien()
    {
        this("", "", "", 0, 0, 0);
    }
	public SinhVien(String maSV, String tenSV, String que, double toana1, double toana3, double nguyenli) {
		this.maSV=maSV;
		this.tenSV=tenSV;
		this.que=que;
		this.toana1=toana1;
		this.toana3=toana3;
		this.nguyenli=nguyenli;
	
	}
	
	public void inputSinhVien()throws Exception
	{
		Scanner scanner=new Scanner(System.in);
	
		try
		{
			do
			{
				System.out.print("\nNhập vào mã sinh viên (mã không được trùng,không được để trống, nhỏ hơn hoặc bằng 10 ký tự và không chứa các ký tự đặc biệt): ");
				setmaSV(scanner.nextLine());
			}while(!ThaoTac.checkID(maSV));
			do
			{
				System.out.print("Nhập vào họ và tên sinh viên (không được để trống,lớn hơn hoặc bằng 5 ký tự chữ cái không dấu): ");
                settenSV(scanner.nextLine());
			}while(!ThaoTac.checkFullName(tenSV));
			do
			{
				System.out.print("Nhập vào quê quán của sinh viên (không được để trống, lớn hơn hoặc bằng 5 ký tự): ");
				setque(scanner.nextLine());
			}while(!ThaoTac.checkQue(que));
			do
			{
				System.out.println("Nhập vào điểm toán A1 của sinh viên (điểm toán phải >=0 và <=10): ");
				settoana1(scanner.nextDouble());
			}while(!ThaoTac.checkPoint(toana1));
			do
			{
				System.out.println("Nhập vào điểm toán A3 của sinh viên (điểm toán phải >=0 và <=10): ");
				settoana3(scanner.nextDouble());
			}while(!ThaoTac.checkPoint(toana3));
			do
			{
				System.out.println("Nhập vào điểm nguyên lí của sinh viên (điểm nguyên lí phải >=0 và <=10): ");
				setnguyenli(scanner.nextDouble());
			}while(!ThaoTac.checkPoint(nguyenli));
			System.out.flush();
		}
		catch(Exception ex)
        {
            throw ex;
        }
	}
	public void displaySinhVien() throws Exception
	{
		try
		{
			System.out.printf(" %-10s | %-35s | %-15s | %-15.2f | %-15.2f | %-15.2f ",maSV,tenSV,que,toana1,toana3,nguyenli);
		}
		catch(Exception ex)
		{
			throw ex;
		}
	
	}
}

