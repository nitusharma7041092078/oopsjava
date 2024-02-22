import java.sql.SQLOutput;
import java.util.Scanner;
public class switchcase
{
    public static void main(String[] args)
    {
        System.out.println("manu\n1: Addition\n2: Subtraction\n3: Multiplication\n4: Division ");
        System.out.println("Enter your choice:");
        int sum,sub,mul,div;
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.print("Enter value of a:");
        int a = sc.nextInt();
        System.out.print("Enter value of b:");
        int b = sc.nextInt();

        switch(choice)
        {
            case 1:
                sum = a+b;
                System.out.println("Addition of two Number: "+sum);
                break;
            case 2:
                sub = a-b;
                System.out.println("Subtraction of two Number: "+sub);
                break;
            case 3:
                mul = a*b;
                System.out.println("Multiplication of two Number: "+mul);
                break;
            case 4:
                div = a/b;
                System.out.println("Division of two Number: "+div);
                break;
            default:
                System.out.println("Invalid input.");

        }

    }
}