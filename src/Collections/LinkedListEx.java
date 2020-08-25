package Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx 
{
	public static void main(String[] args) 
	{
		List<String> l=new LinkedList<>();
		l.add("India");
	    l.add("China");
	    l.add("USA");
	    l.add("UK");
	    System.out.println(l);
	    System.out.println(l.isEmpty());
	    System.out.println(l.size());
	    System.out.println(l.get(1));
	    for(String a:l)
	    {
	    	System.out.println(a);
	    }
	}
}
