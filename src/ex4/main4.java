package ex4;

import java.util.Random;

public class main4
{
    public  static  int calculare(int a,int b)
    {
        while (b!=0)
        {
            int i=b;
            b=a%b;
            a=i;
        }
        return a;
    }

    public static void main(String[] args)
    {
        Random random = new Random();
        int nr1=random.nextInt(30)+1;
        int nr2=random.nextInt(30)+1;
        int cmmdc=calculare(nr1,nr2);
        System.out.println("CMMDC dintre "+nr1+" si "+nr2+" este: "+cmmdc);
    }
}
