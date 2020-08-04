
#include<stdio.h>
#include<conio.h>
#include<math.h>


int isPrime(int n,int d,int c)
{
    if(c<d) return 1;

    return(n%d==0)?0:isPrime(n,d+1,c);
    /*  if (n%d==0) return 0;
    else return  isPrime    (n,d+1,c)*/
}

void printPrime(int n)
{
    if (n==2)
    {
        printf("2");
        return;
    }
    if(isPrime(n,2,sqrt(n))) printf("%d ",n);
    printPrime(n-1);


}
int sumPrimes(int n)
{
     int sum =0 ;
	if(n==2 ) return sum = 2;
	else
	{

		if(isPrime(n,2,sqrt(n))== 1)
			sum = ( n + sumPrimes(n-1));
		else
		if (isPrime(n,2,sqrt(n))==0)
			sum = sumPrimes(n-1);
	}
	return sum;
}

void main()
{
    int x;
    printf("Nhap so nguyen x:");
    scanf("%d",&x);
    if(isPrime(x,2,sqrt(x))) printf("\n x la so nguyen to");
    else printf("\n x khong la so nguyen to");

    printf("\n\nCac so nguyen to nho hon x:");
    printPrime(x-1);
    printf("\n\nTong cac so nguyen to nho hon x: %d",sumPrimes(x-1));
}
