package hash;

import java.util.*;

public class Practice_HashMap {

    public static void main(String[] args) {

        // HashMap
        HashMap<String, String> capitalCities = new HashMap<>();
        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // access an item
        capitalCities.get("England");
        // remove an item
        capitalCities.remove("England");

        // remove all items
//        capitalCities.clear();

        // how many items
        capitalCities.size();

        // loop through a hashmap
        // print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        // print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }

        // =========== another example =============
        // loop through
        Map hmap = new HashMap();
        // Set set = hmap.entrySet();
        Iterator iter = hmap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Object key = entry.getKey();
            Object val = entry.getValue();
        }
    }
}
