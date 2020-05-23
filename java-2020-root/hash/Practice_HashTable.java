package hash;

import java.util.*;

public class Practice_HashTable {
    public static void main(String[] args) {
        Enumeration names;
        String key;

        // Creating a Hashtable
        Hashtable<String, String> hashtable = new Hashtable<>();

        // Adding Key and Value pairs to Hashtable
        hashtable.put("Key1", "Chaitanya");
        hashtable.put("Key2", "Ajeet");
        hashtable.put("Key3", "Peter");
        hashtable.put("Key4", "Ricky");
        hashtable.put("Key5", "Mona");

        names = hashtable.keys();
        while (names.hasMoreElements()) {
            key = (String) names.nextElement();
            System.out.println("Key: " + key + " & Value: " + hashtable.get(key));
        }

        //1、使用keys()
        Enumeration<String> en1 = hashtable.keys();
        while (en1.hasMoreElements()) {
            en1.nextElement();
        }

        //2、使用elements()
        Enumeration<String> en2 = hashtable.elements();
        while (en2.hasMoreElements()) {
            en2.nextElement();
        }

        //3、使用keySet()
        Iterator<String> it1 = hashtable.keySet().iterator();
        while (it1.hasNext()) {
            it1.next();
        }

        //4、使用entrySet()
        Iterator<Map.Entry<String, String>> it2 = hashtable.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }
}
