import java.util.Scanner;

public class prime{
    public static void Prime(int n) {
        int m = 0, flag = 0, i;
        m = n / 2;

        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
            return;
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
        }



        if (flag == 0) {
            System.out.println(n + " is a prime number");
        }
    }


    public static void main(String[] args)
    {
        System.out.print("Enter number:");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        Prime(n);

    }
}