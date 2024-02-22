import java.sql.SQLOutput;
import java.util.Scanner;
public class matrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of m and n:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i,j;

        int[][] a  = new int[n][m];
        int[][] b = new int[n][m];
        int[][] c = new int[n][m];
        System.out.print("Enter array values a:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Here is the array values a:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print( a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Enter array values b:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Here is the array values a:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print( b[i][j]+" ");
            }
            System.out.println();
        }

        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                c[i][j]= a[i][j]+b[i][j];
            }
        }
        System.out.println("Here is addition of two matrix:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}