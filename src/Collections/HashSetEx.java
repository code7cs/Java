package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx 
{
	public static void main(String[] args) 
	{
		Set<String> s=new HashSet<>();
		s.add("ab");
		s.add("ad");
		s.add("ab");
		s.add("az");
		s.add("ae");
		s.add("ac");
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.contains("ac"));
		// System.out.println(s.remove(1));
		for(String x:s)
		{
			System.out.println(x);
		}
	}
}
