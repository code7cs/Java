package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx 
{
	public static void main(String[] args)
	{
		Map<String,Integer> hm=new LinkedHashMap<>();
		hm.put("AB", 10);
		hm.put("AC", 10);
		hm.put("AZ", 20);
		hm.put("AD", 30);
		hm.put("AF", 50);
		System.out.println(hm);
		for(Map.Entry<String,Integer> x:hm.entrySet())
		{
			System.out.println(x.getKey()+" "+x.getValue());
		}
	}

}
