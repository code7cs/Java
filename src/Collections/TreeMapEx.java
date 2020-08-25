package Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx
{
	public static void main(String[] args)
	{
		Map<String,Integer> tm=new TreeMap<>();
		tm.put("AB", 10);
		tm.put("AC", 10);
		tm.put("AZ", 20);
		tm.put("AD", 30);
		tm.put("AF", 50);
		System.out.println(tm);
		for(String x:tm.keySet())
		{
			System.out.println(x+" "+tm.get(x));
		}
	}
}
