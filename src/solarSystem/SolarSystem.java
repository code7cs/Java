package solarSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class SolarSystem {

    public SolarSystem() {
    }

    public static void main(String[] args) {
        final double G = 6.754;
        ArrayList<BodyBean> stars = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("solarsystem.dat"));
            br.readLine();
            String line = br.readLine();
            while (line != null) {
                String[] arr = line.split("\\s+");
                BodyBean star = new BodyBean();
                star.setName(arr[0]);
                star.setOrbits(arr[1]);
                star.setMass(Double.valueOf(arr[2]));
                star.setDiameter(Double.valueOf(arr[3]));
                star.setPerihelion(Double.valueOf(arr[4]));
                star.setAphelion(Double.valueOf(arr[5]));
                star.setRotationalPeriod(arr[6]);
                star.setAxialtilt(arr[7]);
                star.setOrbinclin(arr[8]);
                star.setMeanDistance();
                star.setVec3d();

                stars.add(star);
                line = br.readLine();
            }

            for (BodyBean star : stars) {
                System.out.println(star);
            }

            // Acceleration
            for (BodyBean star : stars) {
                double accelerations = 0;
                for (BodyBean star1 : stars) {
                    if (star != star1) {
                        double R = Vec3d.dis(star.getVec3d(), star1.getVec3d());
                        accelerations += G * star1.getMass() / Math.pow(R, 2);
                    }
                }
                star.setAccelerations(accelerations);
            }

            for (BodyBean star : stars) {
                System.out.println("The accelerations of " + star.getName() + " is:" + star.getAccelerations());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}