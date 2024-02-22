import java.util.Scanner;

public class fibonacci{
     public static void fibo(int n){
        int a=0,b=1, temp,i;
        System.out.print(a+" "+b);

        for( i=2;i<=n;++i){
            temp=a+b;
            System.out.print(" "+temp);
            a=b;
            b=temp;
        }

    }

    public static void main(String[] args){
        System.out.print("Enter number: ");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        fibo(n);

    }
}