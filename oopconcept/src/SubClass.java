public class SubClass extends ClassA
{
    public static void main(String[] args)
    {
        SubClass s = new SubClass();
        System.out.println("Programmer Salary is :"+s.a);
        System.out.println("Bonus of programmer is :"+s.add(5,4));
    }
}
