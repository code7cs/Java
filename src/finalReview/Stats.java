package finalReview;

public class Stats {
    private double x[];
//    private double mean;
    public Stats(double x[]) {
        this.x = x;
//        mean = getMean();
    }

    public double getMean() {
        double sum = 0.0;
//        for (int i = 0; i< x.length; i++) {
//            sum += x[i];
//        }
        for (double i : x) {
            sum += i;
        }
        return sum/x.length;
    }

    public static void main(String[] args) {
        double a[] = {1.0, 2.0};
        Stats stats = new Stats(a);
        System.out.println(stats.getMean());
    }
}
