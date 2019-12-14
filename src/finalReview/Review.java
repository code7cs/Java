package finalReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Review {
    public static void main(String[] args) {
        ArrayList<String> aL1 = new ArrayList<>(20);
        aL1.add("Sue");
        ArrayList<Integer> aL2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        for (Integer x : aL2) {
            System.out.print(x);
        }
        System.out.println(aL2.get(1));
        aL2.set(1, 5);
        aL2.remove(3);
        System.out.println(aL2);

        Iterator it = aL2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
