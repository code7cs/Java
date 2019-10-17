package session03;

import java.io.FileReader;
import java.util.Scanner;

public class OpenFile {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new FileReader("data/solarsystem.dat"));
            while (s.hasNext()) {
//                int v = s.nextInt();
//                double v2 = s.nextDouble();
                String t = s.next();
//                System.out.println(v);
//                System.out.println(v2);
                System.out.println(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
