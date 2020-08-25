package loop;

import java.util.Scanner;

public class ifex
{

	public static void main(String[] args)
	{
		int age;
		System.out.println("Enter the Age :");
		Scanner s=new Scanner(System.in);
		age=s.nextInt();
		if(age>18 && age<30)
		{
			System.out.println("Age inbetween 18 to 30");
		}
		else if(age>31 && age<50)
			System.out.println("Age inbetween 31 to 50");
		else
			System.out.println("Age Not Matched");

	}

}
