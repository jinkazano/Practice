#include<stdio.h>
#include<conio.h>>
#include<math.h>
#define MAX 100

/*Ham nhap vao ma tran*/
void nhapMaTran(int a[MAX][MAX], int hang, int cot)
{
    int i, j;

    for (i = 0; i<hang; i++)
        for (j = 0; j<cot; j++) {
            printf("Nhap vao phan tu [%d][%d]:", i, j );
            scanf("%d", &a[i][j]);
        }
}

/*Ham in ra ma tran*/
void xuatMaTran(int a[MAX][MAX], int hang, int cot)
{
    int i, j;
    for (i = 0; i<hang; i++) {
        for (j = 0; j<cot; j++)
            printf("\t%d", a[i][j]);
        printf("\n");
    }
}

void xuatDuongCheoChinh(int a[MAX][MAX], int n)
{
    int i,j;
    printf("\nCac phan tu tren duong cheo chinh: \n");
    for (i=0; i<n; i++) {
        for (j=0; j<n; j++) {
            if(i==j) printf("\t%d",a[i][j]);
            else printf("\t*");
        }
        printf("\n");
    }
}

void printMax(int a[MAX][MAX], int n)
{
    int i,j;
    int max=a[0][0];
    for(i=0; i<n; i++) {


        for(j=0; j<n; j++) {
            if(max<a[i][j]) max=a[i][j];
        }
    }
    printf("\nGia tri lon nhat: %d",max);

}
void printMin(int a[MAX][MAX], int n)
{
    int i,j;
    int min=a[0][0];
    for(i=0; i<n; i++) {


        for(j=0; j<n; j++) {
            if(min>a[i][j]) min=a[i][j];
        }
    }
    printf("\nGia tri nho nhat: %d",min);

}
void sapxeptangtheohang(int a[MAX][MAX],int d,int c)
{
    for(int i=0; i<d; i++)
        for(int j=0; j<c; j++)
            for(int k=0; k<d; k++)
                for(int l=0; l<c; l++)
                    if(a[i][j]<a[k][l]) {
                        int temp=a[i][j];
                        a[i][j]=a[k][l];
                        a[k][l]=temp;
                    }
    xuatMaTran(a,d,c);

}
void sapxeptangtheocot(int a[MAX][MAX],int d,int c)
{
    for(int i=0; i<c; i++)
        for(int j=0; j<d; j++)
            for(int k=0; k<c; k++)
                for(int l=0; l<d; l++)
                    if(a[j][i]<a[l][k]) {
                        int temp=a[j][i];
                        a[j][i]=a[l][k];
                        a[l][k]=temp;
                    }
    xuatMaTran(a,d,c);
}
void printMax2nd(int a[MAX][MAX],int n)
{
    int i,j;
    int max=a[0][0];
    int max2=a[0][0];
    for(i=0; i<n; i++) {


        for(j=0; j<n; j++) {
            if(max<a[i][j]) max=a[i][j];
        }
    }
    for(i = 0; i < n; i++) {
        for(j=0; j<n; j++) {
            if(max == a[i][j]) {
                continue;
            } else if(max2 < a[i][j]) {
                max2 = a[i][j];
            }
        }
    }
    printf("\nPhan tu lon thu hai cua mang: %d",max2);
}

int isPrime(n)
{
    if(n<2) return 0;
    for(int i=2; i<=sqrt(n); i++)
        if (n%i == 0) return 0;
    return 1;
}
void sumPrimes(int a[MAX][MAX], int n)
{
    int i,j;
    int sum=0;
    for(i = 0; i < n; i++) {
        for(j=0; j<n; j++) {
            if(isPrime(a[i][j])) sum+=a[i][j];
        }
    }
    printf("\nTong cac so nguyen to trong mang: %d",sum);
}
void main()
{
    int A[MAX][MAX];
    int n,tong,tich;
    int chon;
    int daNhap=0;
    while(1) {
        system("cls");
        printf("*******************MENU***********************\n");
        printf("** 1. Nhap n                                **\n");
        printf("** 2. Xuat ma tran vuong cap n              **\n");
        printf("** 3. In cac phan tu tren duong cheo chinh  **\n");
        printf("** 4. Tim phan tu lon nhat                  **\n");
        printf("** 5. Tim phan tu nho nhat                  **\n");
        printf("** 6. Sap xep tang dan theo hang            **\n");
        printf("** 7. Sap xep tang dan theo cot             **\n");
        printf("** 8. Tim phan tu lon thu hai               **\n");
        printf("** 9. Tinh tong so nguyen to                **\n");
        printf("** 0.Thoat                                  **\n");
        printf("**********************************************\n");
        printf("\t\tNhap lua chon: ");
        scanf("%d",&chon);
        switch(chon) {
        case 1:
            do {
                printf("\nNhap so n: ");
                scanf("%d", &n);
                if (n <= 0 || n > 100)
                    printf("\nSo khong hop le. Xin nhap lai");

            } while (n <= 0 || n > 100);
            nhapMaTran(A, n, n);
            daNhap=1;
            printf("Bam phim bat ki de tiep tuc chuong trinh");
            getch();
            break;
        case 2:
            if(daNhap) {
                printf("Ma tran vuong A cap %d: \n", n);
                xuatMaTran(A, n, n);
            } else printf("Moi nhap ma tran truoc");
            printf("\nBam phim bat ki de tiep tuc chuong trinh");
            getch();
            break;
        case 3:
            if (daNhap) xuatDuongCheoChinh(A,n);
            else printf("Moi nhap ma tran truoc");
            printf("\nBam phim bat ki de tiep tuc chuong trinh");
            getch();
            break;
        case 4:
            if (daNhap) printMax(A,n);
            else printf("Moi nhap ma tran truoc");
            printf("\nBam phim bat ki de tiep tuc chuong trinh");
            getch();
            break;
        case 5:
            if (daNhap) printMin(A,n);
            else printf("Moi nhap ma tran truoc");
            printf("\nBam phim bat ki de tiep tuc chuong trinh");
            getch();
            break;
        case 6:
            if (daNhap) sapxeptangtheohang(A,n,n);
            else printf("Moi nhap ma tran truoc");
            printf("\nBam phim bat ki de tiep tuc chuong trinh");
            getch();
            break;
        case 7:
            if (daNhap) sapxeptangtheocot(A,n,n);
            else printf("Moi nhap ma tran truoc");
            printf("\nBam phim bat ki de tiep tuc chuong trinh");
            getch();
            break;

        case 8:
            if (daNhap) printMax2nd(A,n);
            else printf("Moi nhap ma tran truoc");
            printf("\nBam phim bat ki de tiep tuc chuong trinh");
            getch();
            break;
        case 9:
            if (daNhap) sumPrimes(A,n);
            else printf("Moi nhap ma tran truoc");
            printf("\nBam phim bat ki de tiep tuc chuong trinh");
            getch();
            break;



        case 0:
            printf("\nBan da chon thoat chuong trinh");
            getch();
            exit(0);
        default:
            printf("\nKhong co chuc nang nay");
            printf("\nBam phim bat ki de tiep tuc chuong trinh");
            getch();
            break;

        }
    }
}
