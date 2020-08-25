package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("India");
		l.add("China");
		l.add("USA");
		l.add("UK");
		System.out.println(l);
		System.out.println(l.isEmpty());
		/*
		 * l.remove(3); System.out.println(l);
		 */
		// Ctrl+Shift+/ ---> Comment
		System.out.println(l.size());
		System.out.println(l.get(1));
		for (String a : l) {
			System.out.println(a);
		}

		Object[] obj = l.toArray();
		
		for (Object a : obj) {
			System.out.println(a);
		}

	}
}
