package Collections;

import java.util.List;
import java.util.Vector;

public class VectorEx
{
	public static void main(String[] args)
	{
		List<Integer> v=new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		System.out.println(v);
		/*v.remove(2);
		System.out.println(v);*/
		System.out.println(v.size());
		System.out.println(v.get(3));
		for(int a:v)
		{
			System.out.println(a);
		}
	}
}
