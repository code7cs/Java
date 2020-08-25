package Static;

public class Static2 
{
    int x=10;
    float y=20.5f;
    static String z="XYZ";
    void f1(int x,float y)
    {
    	this.x=x;
    	this.y=y;
    }
    void f2()
    {
    	System.out.println(x+" "+y+" "+z);
    }
    static void f3()
    {
    	z="ABCD";
    }
	public static void main(String[] args) 
	{
		Static2.f3();
		Static2 s=new Static2();
		s.f1(30, 45.7f);
		s.f2();
	}
}
