package Collections;

import java.util.Stack;

public class StackEx
{
	public static void main(String[] args) 
	{
		Stack<Integer> s=new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s);
		/*s.pop();
		System.out.println(s);*/
		System.out.println(s.peek());
		System.out.println(s.size());
		for(int a:s)
		{
			System.out.println(a);
		}
	}
}
