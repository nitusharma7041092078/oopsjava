import java.util.Scanner;
public class array{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter value if you want to enter: ");
        int n = sc.nextInt();
        int[] arr = new int[10];
        int i;
        for(i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }

        System.out.print("Array values: ");
        for(i=0;i<n;i++)
        {
            if(i%2==0)
            {
                System.out.println(arr[i]);
            }

        }
    }
}