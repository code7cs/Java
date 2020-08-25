package loop;

public class return1 
{
    int abc()
    {
    	return 30;
    }
	public static void main(String[] args) 
	{
		return1 r=new return1(); // Single Instance
		System.out.println("Value is:"+r.abc());
	}

}
