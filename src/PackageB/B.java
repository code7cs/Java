package PackageB;

// import PackageA.*;
// import PackageA.A;
public class B 
{
	public static void main(String[] args) 
	{
		PackageA.A obj=new PackageA.A();
		// Fully Qualified Name
		obj.f1();
	}
}
