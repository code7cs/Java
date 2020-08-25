package Polymorphism;
class A
{
	void f1(String a)
	{
		System.out.println(a);
		System.out.println("Siddarth Father Class");
	}
}
public class MethodOverridingEx extends A
{
	void f1(String a)
	{
		// super.f1(a);
		System.out.println(a);
		System.out.println("Siddarth Class");
	}
	public static void main(String[] args) 
	{
		MethodOverridingEx m=new MethodOverridingEx();
		m.f1("Smily Nature");
	}
}
