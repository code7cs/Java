package Polymorphism;

public class ConstructorOverloadingEx 
{
	ConstructorOverloadingEx(int x,int y)
    {
    	System.out.println("Result is : "+(x+y));
    }
	ConstructorOverloadingEx(String a,String b)
    {
    	System.out.println(a+" "+b);
    }
	ConstructorOverloadingEx(int c,int d,int e)
    {
    	System.out.println(c+" "+d+" "+e);
    }
	ConstructorOverloadingEx()
	{
		System.out.println("Default Constructor");
	}
	public static void main(String[] args) 
	{
		ConstructorOverloadingEx c1=new ConstructorOverloadingEx(),
				c2=new ConstructorOverloadingEx("Hi","Hello"),
				c3=new ConstructorOverloadingEx(100,200,300),
				c4=new ConstructorOverloadingEx(1000,2000);
	    // Multiple Instance		
	}
}
