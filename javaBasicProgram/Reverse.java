

public class Reverse {
    public static void main(String[] args){
		String str = "Hello";
		String s = " ";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch = str.charAt(i);
            s = ch + s;

        }
		System.out.println("Reverse string: "+s);
	}
}