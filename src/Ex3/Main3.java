package Ex3;

import java.util.Scanner;

public class Main3
{
    public static void main(String[] args)
    {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Dati numarul:");
        int nr=scanner1.nextInt();
        System.out.println("Divizori numarului " +nr+ " sunt:");
        int div=0;
        int i;
        for(i=1;i<=nr;i++)
        {
            if(nr%i==0)
            {
                System.out.println(i);
                div++;
            }
        }
        if(div==2)
        {
            System.out.println(nr+" este prim");
        }
        else
        {
            System.out.println(nr+" nu este prim");
        }
    }
}
