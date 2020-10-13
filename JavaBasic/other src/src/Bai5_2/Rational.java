package Bai5_2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Rational {
    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational() {}


    public int USCLN(int a, int b) {
        return(b==0)?a:USCLN(b,a%b);
    }

    public void toigianphanso() {
        int i = USCLN(this.getNumerator(), this.getDenominator());
        this.setNumerator(this.getNumerator() / i);
        this.setDenominator(this.getDenominator() / i);
    }

    public Rational ngichdaophanso() {
        int tg=this.getNumerator();
        this.setNumerator(this.getDenominator());
        this.setDenominator(tg);
        return this;
    }

    public Rational Tong(Rational f)
    {
        Rational p = new Rational();
        p.setNumerator(this.getNumerator() * f.getDenominator() + this.getDenominator()*f.getNumerator());
        p.setDenominator(this.getDenominator()*f.getDenominator());

        return p;

    }

    public Rational Hieu(Rational f)
    {
        Rational p = new Rational();
        p.setNumerator(this.getNumerator() * f.getDenominator() - this.getDenominator()*f.getNumerator());
        p.setDenominator(this.getDenominator()*f.getDenominator());

        return p;

    }

    public  Rational Tich(Rational f)
    {
        Rational p = new Rational();
        p.numerator= this.getNumerator()*f.numerator;
        p.denominator=this.getDenominator()*f.denominator;

        return p;

    }

    public  Rational Thuong(Rational f)
    {
        Rational p = new Rational();
        p.numerator= this.getNumerator()*f.denominator;
        p.denominator=this.getDenominator()*f.numerator;

        return p;

    }

    public void SoSanh(Rational f)
    {
        float ps1=(float)this.numerator/this.denominator;
        float ps2=(float)f.numerator/f.denominator;
        if(ps1>ps2) System.out.print("\nPhân số 1 lớn hơn phân số 2");
        else if(ps1<ps2) System.out.print( "\nPhân số 2 lớn hơn phân số 1");
        else System.out.print("\nHai phân số bằng nhau");
    }




    public void inputps()
    {

        Scanner scanner = new Scanner(System.in);


                System.out.print("Nhập tử số (số nguyên): ");
                setNumerator(scanner.nextInt());


            do {
                System.out.print("Nhập mẫu số (số nguyên khác 0): ");
                setDenominator(scanner.nextInt());

            }while(denominator==0);

    }

    public void outputps(String s)
    {
        toigianphanso();
        if(numerator==0) System.out.printf("%s 0",s);
        else if(numerator%denominator==0) System.out.printf("%s %d",s,numerator/denominator);
        else System.out.printf("%s %d/%d",s,numerator,denominator);

    }




}
