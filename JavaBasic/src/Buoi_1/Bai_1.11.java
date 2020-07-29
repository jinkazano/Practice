package Buoi_1;

 class Bai_11 {
public static void main(String[] args) {
	System.out.println("Tất cả các số lẻ nhỏ hơn 100 trừ 5,7,93");
	for(int i=1;i<100;i+=2)
	{
		if (i==5||i==7||i==93) continue;
		System.out.println(""+i);
	}
}
}
