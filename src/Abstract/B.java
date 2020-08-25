package Abstract;

abstract class A
{
	int a=100;
	abstract void f1();
	abstract void f2();
	void f3()
	{
		System.out.println("In f3 method");
	}
}
public class B extends A
{
	void f1() 
	{
	    System.out.println("In f1 method");
	}

	void f2() 
	{
		System.out.println("In f2 method");
	}
	public static void main(String[] args)
	{
		A obj=new B();
		obj.f1();
		obj.f2();
		obj.f3();
		System.out.println(obj.a);
	}
}
