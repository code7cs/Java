package Static;

public class Static3 
{
	static
	{
		System.out.println("Static Block");
	}
	Static3()
	{
		System.out.println("Local class Constructor");
	}
	{
	    System.out.println("Init Block");	
	}
	public static void main(String[] args) 
	{
		System.out.println("In Main Method");
		Static3 s=new Static3();
	}
}
