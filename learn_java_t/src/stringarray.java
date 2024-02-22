import java.util.Scanner;
/*public class stringarray{
    public static void main(String[] args)
    {
//        String fruit;
        int i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = sc.nextInt();
        String[] fruits = new String[10];
        System.out.println("Enter Fruits name: ");
        for(i=0;i<n;i++)
        {
            fruits[i]= sc.next();
        }

        for(i=0;i<n;i++)
        {
            System.out.print(fruits[i]+", ");
        }
    }
}*/


public class stringarray
{
    public static void main(String[] args)
    {
        int[] n = {10,20,31,40,13};
        for(int b:n)
        {
            if(b%2==0)
            {
                System.out.print(b+" ");
            }

        }
    }
}