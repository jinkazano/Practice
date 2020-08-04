#include<stdio.h>
#include<conio.h>
#define NMAX 100
#define MAX(x1,x2)((x1 > x2) ? x1 : x2)
#define MIN(x1,x2)((x1 < x2) ? x1 : x2)

int sumArr(int a[],int n)
{
    if(n==0) return a[0];



    return a[n-1]+ sumArr(a,n-1);


}
int mulArr(int a[],int n)
{
    if(n==0) return a[0];
    return a[n-1]*mulArr(a,n-1);
}
int max(int a[],int n)
{
    if(n==2) return MAX(a[0],a[1]);
    return MAX(a[n-1],max(a,n-1));

}
int min(int a[],int n)
{
    if(n==2) return MIN(a[0],a[1]);
    return MIN(a[n-1],max(a,n-1));

}
int isPrime(int n,int d,int c)
{
    if(c<d) return 1;

    return(n%d==0)?0:isPrime(n,d+1,c);
    /*  if (n%d==0) return 0;
    else return  isPrime    (n,d+1,c)*/
}
int countPrime(int a[],int n)
{
    if(n==0) return 0;
    if(isPrime(a[n-1],2,sqrt(a[n-1]))==1) return 1 + countPrime(a, n - 1);
    return countPrime(a,n-1);
}
void main()
{
    int i,n;
    int a[NMAX];
    printf("Nhap so phan tu cua day: ");scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        printf("\nNhap phan tu a[%d]: ",i);scanf("%d",&a[i]);
    }
    printf("\nTong mang: %d",sumArr(a,n-1));
    printf("\nTich mang: %d",mulArr(a,n-1));
    printf("\nSo lon nhat: %d",max(a,n));
    printf("\nSo be nhat: %d",min(a,n));
    printf("\nSo luong so nguyen to trong mang: %d",countPrime(a,n));

}
