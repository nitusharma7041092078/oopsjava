import java.util.Scanner;

public class oddeven
{
    public static void main(String[] args)
    {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
         n = sc.nextInt();
        System.out.print("Even:");
         for(i=0;i<=n;i++)
         {
             if(i%2==0)
             {
                 System.out.print(" "+i);
             }

         }


        System.out.print("\nOdd:");
        for(i=0;i<=n;i++)
        {
            if(i%2!=0)
            {
                System.out.print(" "+i);
            }
        }
        
    }
}
