package session10;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class javaQuiz {
    public static void main(String[] args) {
//        double[] a = new double[6];

//        int[][] b = {{1,2,3},{2,3,1},{3,1,2}};

//        int[] a = new int[ 20 ];

//        int b[] = new int[ 4 ];
//
//        double[] c = new double[ 10 ];
//
//        double[] d = {1,2,9};
//
//        boolean[] e = new boolean[ 1024 ];
//
//        char f = new char[ 5 ];
//
//        double e[ 10 ];
//
//        char[] x = {'a', 'm', 'z'};
//
//        int[] j = new int[ 5 ][ 4 ];
//
//        int[][] y = new int[ 5 ][ 4 ];
//
//        float[][][] x = new float[ 2 ][ 2 ][ 2 ];
//        int a = new int[ 1000000 ];


//        int[] x = {5, 3, 6};
//
//        int sum = 0;
//
//        for (int i = 0; i < x.length; i++) {
//
//            sum += x[i];
//
//        }
//        System.out.println(0.0 + x.length);
//        System.out.println(sum / x.length);
//        System.out.println();


//        int a = 3;
//
//        if (a < 7) {
//            System.out.printf("a is %d", a);
//        }
//        int a = 16;
//        int b = 9;
//        if (a <= b) {
//            System.out.printf("%d", b);
//        } else {
//            System.out.printf("%d", a);
//        }

//        int x = 3;
//        if (x <= 3) {
//            System.out.printf("less ");
//        }
//        if (x > 3) {
//            System.out.printf("greater ");
//        } else {
//            System.out.printf("equal");
//        }

//        int a = 4;
//        int b = 6;
//        boolean c = a < b;
//
//        boolean d = a > b;
//
//        boolean e = a < b && a + 1 > b - 1;
//
//        boolean f = a > 3 && a < 3;
//
//        boolean g = b < 10 && b > 5;
//
//        boolean h = !c;
//
//        boolean i = a < b || a > b;


//        int a = 3;
//        int b = 17;
//        if (a * 5 < b) {
//            System.out.print((b - a * 4));
//            b -= 4;
//        }
//        if (a * 4 < b - 1) {
//            System.out.print("yes");
//            b += 2;
//        } else {
//            System.out.print("no");
//            b -= 2;
//        }
//        System.out.print(a + b);

        for (int i = 5; i < 5; i--)
            System.out.printf("%d", i);
    }

}

class A {

    public static int max(int[] a) {

        int maxVal = a[0];

        for (int i = 1; i < a.length; i++)

            if (maxVal < a[i]) {

                maxVal = a[i];

            }
        return maxVal;
    }

}