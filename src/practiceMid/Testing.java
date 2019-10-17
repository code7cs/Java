package practiceMid;

public class Testing {

    public static int fact(int num) {
        if (num < 3) return num;
        int res = num;
        for (int i = num - 1; i > 0; i--) {
            res *= i;
        }
        return res;
    }

    public static int fact2(int num) {
        if (num == 1 || num == 2) {
            return num;
        }
        return num * fact2(num - 1);
    }

    public static int sum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(fact2(15));
        System.out.println(sum(3, 6));
    }
}
