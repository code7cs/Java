package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingusingCollections 
{
	public static void main(String[] args)
	{
		List<Integer> l=new ArrayList<>();
		l.add(69);
		l.add(49);
		l.add(29);
		l.add(39);
		l.add(19);
		l.add(59);
		System.out.println(l);
		Collections.sort(l);
		for(int x:l)
		{
			System.out.println(x);
		}
	}
}
