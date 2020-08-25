package Polymorphism;

public class WithoutThis 
{
    int a=10;
    int b=20;     // Instance Variable
    void f1(int a,int b) // Local Variable
    {
    	this.a=a;
    	this.b=b;
    }
    void f2()
    {
    	System.out.println(a);
    	System.out.println(b);
    }
	public static void main(String[] args)
	{
		WithoutThis w=new WithoutThis();
		w.f1(100, 200); 
		w.f2();
	}
}
