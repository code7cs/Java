package session03;

import java.io.FileReader;
import java.util.Scanner;

public class ReadInSolarSystemData {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new FileReader("data/solarsystem.dat"));
            scanner.nextLine();
            while (scanner.hasNext()) {
                String[] arr = scanner.nextLine().split("\\s+");
                Stars s = new Stars(arr);
                String name = s.name;

                String[] stars = {"Sun", "Venus", "Earth", "Moon"};
                for (String star : stars) {
                    if (name.equals(star)) System.out.println(s);
                }
//                if (name.equals("Sun") || name.equals("Venus") || name.equals("Earth") || name.equals("Moon")) {
//                    System.out.println(s);
//                }
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Stars {
    String name;
    private String orbits;
    private Double mass;
    private Double diam;
    private Double perihelion;
    private Double aphelion;
    private Double meanDistance;

    Stars(String[] arr) {
        name = arr[0];
        orbits = arr[1];
        mass = Double.valueOf(arr[2]);
        diam = Double.valueOf(arr[3]);

        perihelion = Double.valueOf(arr[4]);
        aphelion = Double.valueOf(arr[5]);
        meanDistance = (perihelion + aphelion) / 2;
    }

    @Override
    public String toString() {
        return "{ " + "Name = " + name + ", Orbits = " + orbits + ", Mass = " + mass
                + ", Diameter = " + diam + ", Mean distance from orbits = " + meanDistance + " }";
    }
}