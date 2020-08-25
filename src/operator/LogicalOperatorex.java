package operator;

import java.util.Scanner;

/*The logical && operator doesn't check second condition if first condition is false. 
It checks second condition only if first one is true.*/
/*Conditional operators are-
&&, Logical AND : returns true when both conditions are true.
||, Logical OR : returns true if at least one condition is true.*/
public class LogicalOperatorex {

	public static void main(String[] args) 
    { 
        String x="Nagendra"; 
        String y="Marlabs"; 
  
        Scanner s = new Scanner(System.in); 
        System.out.print("Enter username:"); 
        String id = s.next();
        System.out.print("Enter password:"); 
        String pwd = s.next(); 
  
        // Check if user-name and password match or not. 
        if ((id.equals(x) && pwd.equals(y)) 
            || (id.equals(y) && pwd.equals(x))) { 
            System.out.println("Welcome user."); 
        } 
        else { 
            System.out.println("Wrong uid or password"); 
        } 
    } 
} 
