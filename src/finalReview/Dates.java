package finalReview;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Dates {

    public static void main(String[] args) {
        String[] mon = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

        HashMap<String, Integer> monMap = new HashMap<>();
        for (int i = 0; i < mon.length; i++) {
            monMap.put(mon[i], i + 1);
        }

        for (String s : monMap.keySet()) {
            System.out.println(s + monMap.get(s));
        }

//        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
//        for (int i = 0; i < monMap.size(); i++) {
//            lhm.put(mon[i],i + 1);
//        }
//        System.out.println(lhm);
//        System.out.println(monMap);


        String date = "13   JAN 1998";
        String[] d = date.split("\\s+");
        System.out.println(d[2] + "-" + monMap.get(d[1]) + "-" + d[0]);


    }
}
