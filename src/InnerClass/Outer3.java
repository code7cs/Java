package InnerClass;

public class Outer3 
{
	int a=200;
    static class Inner3
    {
    	int a=300;
    	public void f1()
    	{
    		System.out.println(a);
    	}
    }
	public static void main(String[] args) 
	{
		/*Outer3 obj=new Outer3();
		System.out.println(obj.a);*/
		Outer3.Inner3 obj=new Outer3.Inner3();
		obj.f1();
	}
}
