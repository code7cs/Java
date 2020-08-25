package String;

public class IsEmptyex 
{
	public static void main(String[] args) 
	{
		String s1="";
		String s2="Hello Folks";
		if(s1.length()==0 || s1.isEmpty())
		{
			System.out.println("String is Empty");
		}
		else
			System.out.println(s1);
		if(s2.length()==0 || s2.isEmpty())
		{
			System.out.println("String is Empty");
		}
		else
			System.out.println(s2);
	}
}
