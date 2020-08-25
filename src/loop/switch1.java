package loop;

import java.util.Scanner;

public class switch1 {

	public static void main(String[] args)
	{
		int age;
		System.out.println("Enter the age :");
		Scanner s=new Scanner(System.in);
		age=s.nextInt();
		switch(age)
		{
		case 18:
			System.out.println("Age is 18");
			break;
		case 19:
			System.out.println("Age is 19");
			break;
		case 30:
			System.out.println("Age is 30");
			break;
		default:
			System.out.println("Age not matched");
			break;
		}
	}

}
