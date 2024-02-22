
public class addcomplexnumber
{
    int real,image;
    public addcomplexnumber(int r,int i)
    {
        this.real=r;
        this.image=i;
    }

    public void showc()
    {
        System.out.print(this.real+" +i "+this.image);
    }

    public static addcomplexnumber add(addcomplexnumber n1, addcomplexnumber n2)
    {
        addcomplexnumber res= new addcomplexnumber(0, 0);
        res.real = n1.real+n2.real;

        res.image = n1.image+ n2.image;

        return res;
    }

    public static void main(String[]  args)
    {
        addcomplexnumber c1 = new addcomplexnumber(4,5);
        addcomplexnumber c2 = new addcomplexnumber(10,5);

        System.out.print("first complex number:");
        c1.showc();
        System.out.print("\n Second complex number:");
        c2.showc();

        addcomplexnumber res = add(c1,c2);

        System.out.println("\nAddition is : ");
        res.showc();

    }
}