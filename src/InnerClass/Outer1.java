package InnerClass;

public class Outer1
{
	int a=1000; // Instance Variable of Outer class
	class Inner1
	{
		int a=2000;   // Instance Variable of Inner class
		public void f1()
		{
			int a=500;   // Local Variable inside a method "f1()".
			System.out.println(a);   // 500
			System.out.println(this.a);  // 2000
			System.out.println(Outer1.this.a);  // 1000
		}
	}
	public static void main(String[] args) 
	{
		new Outer1().new Inner1().f1();
	}
}
