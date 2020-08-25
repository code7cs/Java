package operator;

public class RelationalOperatorex 
{
	public static void main(String[] args) 
    { 
        int a = 20, b = 10; 
        String x = "Hello", y = "Hello"; 
        int a1[] = { 1, 2, 3 }; 
        int b1[] = { 1, 2, 3 }; 
        boolean condition = true; 
  
        // various conditional operators 
        System.out.println("a == b :" + (a == b)); // false
        System.out.println("a < b :" + (a < b));  // false
        System.out.println("a <= b :" + (a <= b)); // false
        System.out.println("a > b :" + (a > b));  // true
        System.out.println("a >= b :" + (a >= b)); // true
        System.out.println("a != b :" + (a != b)); // true
  
        // Arrays cannot be compared with 
        // relational operators because objects 
        // store references not the value 
       System.out.println("a1 == b1 : " + (a1 == b1)); 
        System.out.println("x == y : " + (x == y)); 
        System.out.println("condition==true :"
                           + (condition == true)); 
    } 
}