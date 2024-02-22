
import java.util.Scanner;

public class FindPrime
{
    public static void main(String[] args)
    {
        int i,j,flag=0;
        System.out.print("Enter first no:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter last no:");
        int b = sc.nextInt();

        for(i=a;i<=b;i++)
        {
            if(i==1||i==0)
                continue;
            flag=1;

            for(j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag=0;
                }
            }

            if(flag==1)
            {
                System.out.print(" "+i);
            }
        }


    }
}