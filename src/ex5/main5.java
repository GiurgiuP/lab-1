package ex5;

import java.util.Random;

public class main5
{

    public static  boolean patrat(int m)
    {
        int n=(int)Math.sqrt(m);
        return (n*n==m);
    }
    public static boolean fibbonaci(int n)
    {
        return patrat(5*n*n+4)||patrat(5*n*n-4);
    }


    public static void main(String[] args)
    {
        Random random = new Random();
        int nr=random.nextInt(21);
        System.out.println("Numarul generat este: "+nr);
        if(fibbonaci(nr))
        {
            System.out.println("Apartine");
        }
        else
        {
            System.out.println("Nu apartine");
        }
    }
}
