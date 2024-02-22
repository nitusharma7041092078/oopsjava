
import java.util.Scanner;

public class UserInput
{
   static int id , age;
    static String name , city;
    static void input()
    {

        System.out.println("Enter your information.....");
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter your no: ");


            System.out.print("ID : ");
            id = sc.nextInt();

            System.out.print("NAME : ");
            String name = sc.next();

            System.out.print("AGE : ");
            age = sc.nextInt();

            System.out.print("CITY : ");
            String city = sc.next();



            System.out.print("\nID " + id);
            System.out.print("\nNAME " + name);
            System.out.print("\nAGE " + age);
            System.out.print("\nCITY " + city);

    }



    public static void main(String[] args)
    {

        input();

    }
}