#include<stdio.h>
#include<conio.h>
#include<math.h>
#define NMAX 100


typedef struct {
    char MaSV[10], HoTen[30];
    float Toan;
    float Ly;
    float Hoa;
} SinhVien;


float dtb (SinhVien x)
{
    return round(x.Hoa+x.Toan+x.Ly)*100/300;
}
void input(SinhVien x[])
{
    printf("\nNhap MSSV:");
    fflush(stdin);
    gets(x->MaSV);
    printf("\nNhap Ten:");
    fflush(stdin);
    gets(x->HoTen);
    printf("\nNhap Toan, Ly , Hoa: ");
    scanf("%f %f %f",&x->Toan,&x->Ly,&x->Hoa);

}
void khoitao (SinhVien x[],int *n)
{
    int i=0;
    char check;
    printf("\n Nhan phim bat ki de bat dau khoi tao");
    do {
        check=getch();
        if(check=='0') break;
        input(&x[i]);
        i++;
        printf("\n\n~~Nhan phim bat ki de tiep tuc nhap hoac nhan 0 de dung");
    } while (1);
    *n=i;



}
void them(SinhVien x[],int *n)
{
    int k,i;
    printf("\nNhap so sv muon them: ");
    scanf("%d",&k);
    for (i=*n; i<*n+k; i++) {
        printf("\nSv thu %d: ",i+1);
        input(&x[i]);
    }
    *n=i;

}
void output(SinhVien x)
{
    printf("\n%10s %15s %6.2f %6.2f %6.2f %6.2f",x.MaSV,x.HoTen,x.Toan,x.Ly,x.Hoa,dtb(x));
}
void outputAll(SinhVien x[],int n)
{
    printf("\n%10s %15s %6s %6s %6s %6s","MSSV","Hoten","Toan","Ly","Hoa","DTB");
    int i;
    for(i=0; i<n; i++) {
        output(x[i]);
    }
}


void selectionSort(SinhVien x[], int n)
{

    int i,j,min_index;
    for (i=0; i<n-1; i++) {
        min_index=i;
        for(j=i+1; j<n; j++) {
            if (dtb(x[j])<dtb(x[min_index])) min_index=j;

            SinhVien temp= x[i];
            x[i]=x[min_index];
            x[min_index]=temp;
        }
    }
    printf("\nDa sap xep!");
    outputAll(x,n);
}
int isSorted(SinhVien x[],int n)
{
    int i,j;
    for (i=0; i<n-1; i++) {


        if(dtb(x[i])>=dtb(x[i+1])) return 0;







    }
    return 1;

}
void checkIsSorted(SinhVien x[],int n)
{
    if(isSorted(x,n))
        printf("\nDs da duoc sap xep");
    else printf("\nDs chua duoc sap xep");
}
void linearSearchByName(SinhVien x[],int n)
{
    int i,check=0;
    char kt[30];
    printf("\nNhap ten muon tim: ");
    fflush(stdin);
    gets(kt);
    for (i=0; i<n; i++) {


        if(strcmp(x[i].HoTen,kt)==0) {
            printf("\nSv %s",kt);
            printf("\n%10s %15s %6s %6s %6s %6s","MSSV","Hoten","Toan","Ly","Hoa","DTB");
            output(x[i]);
            check++;
            break;
        }


    }
    if(check==0) printf("\nKhong ton tai sv ten nay!");
}

int binarySearch(SinhVien a[], int n, float x)
{
    int right= n-1;
    int left= 0;

    while(left<=right) {
        int mid=(left+right)/2;

        if(dtb(a[mid])==x) return mid;
        if(dtb(a[mid])>x) right=mid-1;
        if(dtb(a[mid])<x) left=mid+1;
    }
    return -1;
}

void binarySearchByDTB(SinhVien x[],int n)
{
    float kt;
    printf("\nNhap so dtb can tim: ");
    scanf("%f",&kt);

    int ketqua=binarySearch(x,n,kt);
    if(ketqua==-1) printf("\nKhong tim thay");
    else {
        printf("\nSv co dtb: %6.2f",kt);
        printf("\n%10s %15s %6s %6s %6s %6s","MSSV","Hoten","Toan","Ly","Hoa","DTB");
        output(x[ketqua]);
    }


}
void xoa(SinhVien x[],int *n)
{
    int i,pos, check=0;
    char kt[30];
    printf("\nNhap ma so sv muon xoa");
    fflush(stdin);
    gets(kt);
    for (i=0; i<*n; i++) {
        if(strcmp(x[i].MaSV,kt)==0) {
            check++;
            pos=i;
            break;

        }

    }
    if(check!=0) {
        for (i=pos; i<*n; i++) {
            x[i]=x[i+1];
        }
        --*n;
    } else printf("\nKhong co MSSV tren!");

}
void add(SinhVien x[], int *n)
{
    input(&x[*n]);
    ++*n;
    selectionSort(x,*n);

}

void writeFile(SinhVien x[], int n)
{
    int i;
    FILE *f;
    f=fopen("DSSV.text","ab");
    for (i=0; i<n; i++) {

        fwrite(&x[i],sizeof(x[i]),1,f);
    }
    fclose(f);
    printf("\nDa ghi vao tap tin van ban\n");
}
void readFile(char *FileName)
{
    FILE *f;
    SinhVien x;
    f=fopen(FileName,"rb");
    printf("\n%10s %15s %6s %6s %6s %6s","MSSV","Hoten","Toan","Ly","Hoa","DTB");

    fread(&x,sizeof(x),1,f);
    while (!feof(f)) {
        printf("\n%10s %15s %6.2f %6.2f %6.2f %6.2f",x.MaSV,x.HoTen,x.Toan,x.Ly,x.Hoa,dtb(x));
        fread(&x,sizeof(x),1,f);
    }
    fclose(f);


}
void menu()
{
    SinhVien x[NMAX];
    char selected;
    int n;

    do {
        printf("\n\n\t\t MENU");
        printf("\n1. Khoi tao");
        printf("\n2. Nhap them sv ");
        printf("\n3. Xem ds");
        printf("\n4. Sap xep theo dtb tang dan");
        printf("\n5. Kiem tra ds da sap xep chua");
        printf("\n6. Tim kiem tuyen tinh theo ten");
        printf("\n7. Tim kiem nhi phan theo dtb");
        printf("\n8. Xoa theo MSSS ");
        printf("\n9. Them 1 sv ");
        printf("\nS. Luu ds ra file ");
        printf("\nL. Doc ds tu file va hien thi ");

        printf("\n0. Ket thuc chuong trinh ");
        selected=getch();
        switch(selected) {
        case '1':
            khoitao(x,&n);

            break;
        case '2':
            them(x,&n);

            break;
        case '3':
            if(n!=0) outputAll(x,n);
            else printf("\nDs trong hoac chua duoc khoi tao");
            break;
        case '4':
            if(n!=0) selectionSort(x,n);
            else printf("\nDs trong hoac chua duoc khoi tao");
            break;
        case '5':
            if(n!=0) checkIsSorted(x,n);
            else printf("\nDs trong hoac chua duoc khoi tao");
            break;
        case '6':
            if(n!=0) linearSearchByName(x,n);
            else printf("\nDs trong hoac chua duoc khoi tao");
            break;
        case '7':
            if(n!=0) {
                if(isSorted(x,n))binarySearchByDTB(x,n);
                else printf("\nDs phai duoc sap xep truoc khi tim!");
            } else printf("\nDs trong hoac chua duoc khoi tao");
            break;
        case '8':
            if(n!=0) xoa(x,&n);
            else printf("\nDs trong hoac chua duoc khoi tao");
            break;
        case '9':
            if(n!=0) add(x,&n);
            else printf("\nDs trong hoac chua duoc khoi tao");
            break;
        case 'S':
            if(n!=0) writeFile(x,n);
            else printf("\nDs trong hoac chua duoc khoi tao");
            break;
        case 's':
            if(n!=0) writeFile(x,n);
            else printf("\nDs trong hoac chua duoc khoi tao");
            break;
        case 'l':
            readFile("DSSV.text");

            break;
        case 'L':
            readFile("DSSV.text");

            break;

        case '0':
            printf("\nKet thuc!");
            exit(0);
            break;
        default:
            printf("\nKhong co lua chon nay moi nhap lai ");

        }

    } while(selected!='0');
}
void main()
{
    while(1) {
        menu();
        getch();
    }
}

