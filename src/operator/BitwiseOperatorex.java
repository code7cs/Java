package operator;
/*The bitwise & operator always checks both conditions
whether first condition is true or false.*/
public class BitwiseOperatorex
{
	public static void main(String args[])
	{  
		int a=10;  
		int b=5;  
		int c=20;  
		System.out.println(a<b&a<c);//false & true = false  
		System.out.println(a<b&a++<c);//false && true = false  
		System.out.println(a);//10+1=11 because second condition is checked  
	}
}  
