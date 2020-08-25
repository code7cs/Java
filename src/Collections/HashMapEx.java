package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx 
{
	public static void main(String[] args) 
	{
		Map<String,Integer> hm=new HashMap<>();
		// Map is not Synchronized
		hm.put("AB", 10);
		hm.put("AC", 10);
		hm.put("AZ", 20);
		hm.put("AD", 30);
		hm.put("AF", 50);
		System.out.println(hm);
		System.out.println(hm.get("AC"));
	}
}
