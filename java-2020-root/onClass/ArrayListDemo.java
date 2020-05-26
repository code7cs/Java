package onClass;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListDemo {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(20);
        System.out.println(l1);

        l1.remove(1);
        System.out.println(l1);
        Iterator it1 = l1.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        HashSet hs = new HashSet<>();
        hs.add(10);
        hs.add(10);
        hs.add(20);
        hs.add(30);
        System.out.println(hs);
        hs.remove(30);
        System.out.println(hs);
        Iterator it3 = hs.iterator();
        while (it3.hasNext()) {
            System.out.println(it3.next());
        }

    }
}
