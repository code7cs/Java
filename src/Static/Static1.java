package Static;

public class Static1 
{
    static int x=0;
    Static1()
    {
    	x++;
    	System.out.println(x);
    }
	public static void main(String[] args)
	{
		Static1 s1=new Static1();
		Static1 s2=new Static1();
		Static1 s3=new Static1();
		Static1 s4=new Static1();
		Static1 s5=new Static1();
	}
}
