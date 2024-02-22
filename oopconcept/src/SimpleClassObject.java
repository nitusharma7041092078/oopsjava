public class SimpleClassObject {

    int a,b,c;//none static variable//instance variable
    static String name;//static variable
    public static void main(String[] args)
    {
        SimpleClassObject obj = new SimpleClassObject();//object creation
        obj.a=10;
        obj.b=20;
        obj.c=obj.a+obj.b;
        System.out.println("Sum of two numbers : "+obj.c);
        name="Nitu sharma";
        System.out.println(name);
    }
}
