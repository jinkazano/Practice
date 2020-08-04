#include<stdio.h>
#include<conio.h>

 int decToBin (int n)
{
    return (n==0)?0:(n%2+10*decToBin(n/2));
}
int decToOct (int n)
{
    return (n==0)?0:(n%8+10*decToOct(n/8));
}
void decToHex (int n)
{
    int rem;
    if(n==0) return;
    else
    {
        rem=n%16;
        decToHex(n/16);
        if(rem>=10) printf("%c",rem+55);
        else printf("%d",rem);
    }

}
void main()
{

    int n;
    printf("Nhap n: ");scanf("%d",&n);
    printf("\nHe 2: %d",decToBin(n));
    printf("\nHe 8: %d",decToOct(n));
    printf("\nHe 16: "); decToHex(n);

}
