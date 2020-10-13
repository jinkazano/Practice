package Bai3_2;


import java.util.Scanner;

public class SanPham {

	// Field
	private String maSP;
	private String tenSP;
	private int giamua;
	private int giaban;
	private int soluong;
	
	// Proverty
	public String getmaSP(){
		return maSP;
	}
	public void setmaSP(String maSP){
		this.maSP=maSP;
	}
	
	public String gettenSP(){
		return tenSP;
	}
	public void settenSP(String tenSP){
		this.tenSP=tenSP;
	}
	
	public int getgiamua(){
		return giamua;
	}
	public void setgiamua(int giamua){
		this.giamua=giamua;
	}
	
	public int getgiaban(){
		return giaban;
	}
	public void setgiaban(int giaban){
		this.giaban=giaban;
	}
	
	public int getsoluong(){
		return soluong;
	}
	public void setsoluong(int soluong){
		this.soluong=soluong;
	}
	
	// Paramater
	public SanPham(){
		this("","",0,0,0);
	}
	
	public SanPham(String maSP, String tenSP, int giamua, int giaban, int soluong) {
		this.maSP=maSP;
		this.tenSP=tenSP;
		this.giamua=giamua;
		this.giaban=giaban;
		this.soluong=soluong;
		
	}
	
	public void inputSP()throws Exception
	{
		Scanner scanner = new Scanner(System.in);
		
		try
		{
			do
			{
				System.out.print("\nNhập vào mã sản phẩm (mã không được trùng, không được để trống, nhỏ hơn hoặc bằng 10 ký tự và không chứa ký tự đặc biệt): ");
				setmaSP(scanner.nextLine());				
			}while(!ThaoTac.checkID(maSP));
			do
			{
				System.out.print("Nhập vào tên sản phẩm (không được để trống,lớn hơn hoặc bằng 2 kí tự) :");
				settenSP(scanner.nextLine());
			}while(!ThaoTac.checkName(tenSP));
			do
			{
				System.out.print("Nhập vào giá mua (giá mua phải là số nguyên dương) :");
				setgiamua(scanner.nextInt());
			}while(!ThaoTac.checkPoint(giamua));
			do
			{
				System.out.print("Nhập vào giá bán (giá bán phải là số nguyên dương và lớn hơn giá mua) :");
				setgiaban(scanner.nextInt());
			}while(!ThaoTac.checkPoint(giaban) || giaban<giamua);
			do
			{
				System.out.print("Nhập vào số lượng (số lượng phải là số nguyên dương) :");
				setsoluong(scanner.nextInt());
			}while(!ThaoTac.checkPoint(soluong));
		}
		catch(Exception ex)
		{
			throw ex;
		}
	}
	
	public void displaySP() throws Exception
	{
		try
		{
			System.out.printf(" %-10s | %-35s | %-15d | %-15d | %-15d ",maSP,tenSP,giamua,giaban,soluong);
		}
		catch(Exception ex)
		{
			throw ex;
		}
	}
	
	

}
