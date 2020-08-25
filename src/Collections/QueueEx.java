package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx 
{
	public static void main(String[] args) 
	{
		Queue<String> q=new LinkedList<>();
		q.add("A");
		q.add("B");
		q.add("C");
		q.add("D");
		q.add("E");
		q.add("F");
		System.out.println(q);
		/*System.out.println(q.remove());
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);*/
		System.out.println(q.element());
		System.out.println(q.size());
		for(String x:q)
		{
			System.out.println(x);
		}
	}
}
