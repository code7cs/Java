package operator;
/*Unary Operators: Unary operators need only one operand. 
 * They are used to increment, decrement or negate a value.
– :Unary minus, used for negating the values.
+ :Unary plus, used for giving positive values. 
Only used when deliberately converting a negative value to positive.
++ :Increment operator, used for incrementing the value by 1. 
There are two varieties of increment operator.
Post-Increment : Value is first used for computing the result and then incremented.
Pre-Increment : Value is incremented first and then result is computed.
— : Decrement operator, used for decrementing the value by 1. 
There are two varieties of decrement operator.
Post-decrement : Value is first used for computing the result and then decremented.
Pre-Decrement : Value is decremented first and then result is computed.
! : Logical not operator, used for inverting a boolean value.*/
public class UnaryOperatorex 
{
		public static void main(String args[])
		{  
			 int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30; 
		        int g=10; // -11
		        int h=-10;  // 9
		        boolean i=true;  
		        boolean j=false;
		  
		        // pre-increment operator 
		        // a = a+1 and then c = a; 
		        c = ++a; // 21
		        System.out.println("Value of c (++a) = " + c); 
		  
		        // post increment operator 
		        // c=b then b=b+1 
		        c = b++; // 10
		        System.out.println("Value of c (b++) = " + c); 
		  
		        // pre-decrement operator 
		        // d=d-1 then c=d 
		        c = --d; // 19
		        System.out.println("Value of c (--d) = " + c); 
		  
		        // post-decrement operator 
		        // c=e then e=e-1 
		        c = e--; //40
		        System.out.println("Value of c (e--) = " + c); 
		   
		          
		System.out.println(~g);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~h);//9 (positive of total minus, positive starts from 0) 
		   // Logical not operator 
		System.out.println(!i);//false (opposite of boolean value)  
		System.out.println(!j);//true  
	}
}  
