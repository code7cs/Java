package InnerClass;

public class Outer2 
{
	public void f1()
	{
		class Inner2
		{
			public void f2(int a,int b)
			{
				System.out.println("Result is : "+(a+b));
			}
		}
		Inner2 i=new Inner2();
		i.f2(10, 20);
		i.f2(100, 200);
		i.f2(1000, 2000);
	}
	public static void main(String[] args) 
	{
		Outer2 obj=new Outer2();
		obj.f1();
	}
}
