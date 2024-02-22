import java.util.Scanner;

public class CheckPrime
{
    public static void main(String[] args)
    {
        int n, i ,m ,flag=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number if want to check prime or not:");
        n = sc.nextInt();
        m = n/2;


        if(n==1||n==0)
        {
            System.out.println("Not prime number.");
            return;
        }
        else
        {
            for(i=2;i<=m;i++)
            {
                if(n % i==0)
                {
                    System.out.println("Not prime number.");
                    flag=1;
                    break;
                }
            }
        }

       if(flag==0)
       {
           System.out.println("It is prime number.");
       }
    }
}