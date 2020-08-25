package Polymorphism;

public class MethodOverloadingEx 
{
    void f1(int x,int y)
    {
    	System.out.println("Result is : "+(x+y));
    }
    void f1(String a,String b)
    {
    	System.out.println(a+" "+b);
    }
    void f1(int c,int d,int e)
    {
    	System.out.println(c+" "+d+" "+e);
    }
	public static void main(String[] args)
	{
		MethodOverloadingEx m=new MethodOverloadingEx();
		m.f1(10, 20, 30);
		m.f1(100, 200);
		m.f1("Hi Folks !", "Welcome to Marlabs.");
	}
}
