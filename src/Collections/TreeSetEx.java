package Collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx 
{
	public static void main(String[] args)
	{
		Set<Integer> ts=new TreeSet<>();
		ts.add(23);
		ts.add(35);
		ts.add(13);
		ts.add(-43);
		ts.add(50);
		ts.add(27);
		System.out.println(ts);
		for(int a:ts)
		{
			System.out.println(a);
		}
	}
}
