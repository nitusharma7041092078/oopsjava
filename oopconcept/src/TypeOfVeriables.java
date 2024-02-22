public class TypeOfVeriables {
    int a,b;//none static variable//instance variable
    int sum()//method of a class with return value
    {
        a=10;
        b=20;
        return (a+b);

    }
    public static void main(String[] args)
    {
        TypeOfVeriables obj = new TypeOfVeriables();

        System.out.println("sum of local variable: "+obj.sum());

    }
}
