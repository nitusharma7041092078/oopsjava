import java.util.Scanner;

public class Reverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int  n = sc.nextInt();
        int r,result=0;
        while(n>0)
        {
            r=n%10;
            result = result * 10 +r;
            n=n/10;
        }
        System.out.println(result );

    }
}