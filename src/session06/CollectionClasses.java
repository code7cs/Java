package session06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionClasses {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = i + 3;
        int[] old = a;
        a = new int[11];
        for (int i = 0; i < old.length; i++)
            a[i] = old[i];
        a[10] = 99;

        ArrayList<Integer> list = new ArrayList<>(100);
//        list.add(1);
        System.out.println(list.size());
        for (int i = 0; i < 100; i++)
            list.add(i);
        System.out.println(list.size());

        //        list.remove(0); // slow!

        System.out.println(list);   // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, ...


        Integer x = 2;

        for (int i = 0; i < list.size(); i++)
            list.set(i, list.get(i) * 2);
//            list.set(i, new Integer(list.get(i).intValue()*2));
        System.out.println(list);   // [0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, ...


        ArrayList<String> b = new ArrayList<>();
        b.add("Hello");
        b.add("test");
        System.out.println(b);
        for (int i = 0; i < b.size(); i++)
            System.out.println(b.get(i));

        //ITERATORS ARE THE BEST way to traverse a list
        for (Iterator<String> i = b.iterator(); i.hasNext(); ) {
            System.out.println(i);
            String s = i.next();
            System.out.print(s + "\t");
        }

        LinkedList<String> b2 = new LinkedList<>();

        //o(N^2)
        for (int i = 0; i < b2.size(); i++)
            System.out.println(b2.get(i)); // SLOW for linkedlist

        for (Iterator<String> i = b2.iterator(); i.hasNext(); ) {
            String s = i.next();
            System.out.println(s);
        }

        for (String s : b2) {
            System.out.println(s);
        }
    }
}

