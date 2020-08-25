package DataType;
// TypeCasting ---> DataType Conversion

public class Typecastex 
{
    void f1(int x)
    {
    	float y=x;             // Widening Conversion (Low ---> High)
    	System.out.println(y);
    }
    void f2(float a)
    {
    	int b=(int) a;              // Narrowing Conversion (High ---> Low)
    	// Casting Operator---> ()
    	System.out.println(b);
    }
	public static void main(String[] args) 
	{
		Typecastex t=new Typecastex();
		t.f1(100);
		t.f2(200.0f);
	}
}
