package operator;
/*Java Ternary operator is used as one liner replacement for if-then-else statement
and used a lot in java programming. 
it is the only conditional operator which takes three operands.*/
public class TernaryOperator 
{
	public static void main(String args[])
	{  
		int a=20;  
		int b=15;  
		int c=(a>b)?a:b;  // Max
		int d=(a<b)?a:b;  // Min
		System.out.println(c);  
		System.out.println(d);
    }
}  
