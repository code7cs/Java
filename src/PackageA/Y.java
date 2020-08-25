package PackageA;

class X
{
	int a=10;
    protected void f1()
	{
		System.out.println("In X Class");		
	}
}
public class Y extends X
{
	public static void main(String[] args) 
	{
		Y obj=new Y();
		obj.f1();
		System.out.println(obj.a);
	}
}
