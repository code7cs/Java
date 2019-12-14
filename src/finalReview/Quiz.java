package finalReview;

public class Quiz {
    public static double average(int[] a) {
        double sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum/a.length;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println(average(a));
    }
}

//package + outerclass + $innerclass