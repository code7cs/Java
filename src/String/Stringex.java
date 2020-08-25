package String;

public class Stringex 
{
	public static void main(String[] args) 
	{
		String s1="Hello Folks";  // Creating a String by JAVA Literal
		char ch[]= {'m','a','r','l','a','b','s'};
		String s2=new String(ch); // Converting Char Array into the String
		String s3=new String("Welcome Folks"); // Creating a String by new Operator
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
