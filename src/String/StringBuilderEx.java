package String;

public class StringBuilderEx 
{
	public static void main(String[] args)
	{
		StringBuilder sbd=new StringBuilder();
		sbd.append("marlabs");
		System.out.println(sbd);
		StringBuilder sbd1=new StringBuilder("WELCOME");
		System.out.println(sbd1);
		StringBuilder sbd2=new StringBuilder(17);
		System.out.println(sbd2.capacity());
		StringBuilder sbd3=new StringBuilder(sbd1);
		System.out.println(sbd3);
	}
}
