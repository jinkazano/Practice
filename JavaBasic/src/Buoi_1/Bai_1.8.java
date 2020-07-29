package Buoi_1;



class Bai_8 {
public static void main(String[] args) {
	int n=1;
	int S=0;
	
	while(S<10000) {
		S+=n;
		n++;
	}
	System.out.println("Số nguyên dương cần tìm n = "+(n-1));
}
}
