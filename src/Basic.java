public class Basic 
{
    int a=10; // Instance Variable
    int d;
    float e;
    String f;
    void f1(int b,int c)  // Local Variable   or Formal Parameters
    {
    	// System.out.println(a);
    	System.out.println(b+" "+c);
    }
    Basic()
    {
    	System.out.println("Default Constructor");
    }
    Basic(int x,String y)
    {
    	System.out.println("Parameterized Constructor");
    	System.out.println(x+" "+y);
    }
    public static void main(String[] args) 
	{
		Basic obj1=new Basic(),obj2=new Basic(),obj3=new Basic(),
			  obj4=new Basic(500,"Nagendra"); // Multiple Instance
		// Object Creation or Single Instance
		obj1.f1(20, 30);  // Method Call
		// Actual or Original Parameters
		System.out.println(obj1.a+" "+obj1.d+" "+obj1.e+" "+obj1.f);
		obj2.a=100;
		System.out.println(obj2.a);
		obj3.a=1000;
		System.out.println(obj3.a);
	}
}
