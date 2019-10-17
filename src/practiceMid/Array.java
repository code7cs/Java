package practiceMid;

public class Array {

    public static void print(int[] x) {
        for (int i = 0; i < x.length; i ++ ) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    public static int dot(int[] x, int[] y) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i] * y[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 2, 1, 0, 5};
        int[] b = {1, 2, 5, 4, 1, 0};
        print(a);
        print(b);
        System.out.println(dot(a, b));
    }
}
