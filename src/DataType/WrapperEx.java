package DataType;

public class WrapperEx 
{
	void f1(String x)
	{
		// int y=Integer.parseInt(x);
		float y=Float.parseFloat(x);
		System.out.println(y);
	}
	public static void main(String[] args) 
	{
		WrapperEx w=new WrapperEx();
		w.f1("200");
	}
}
