package finalReview;

class A {
    private static int count = 0;

    public A() {
        System.out.print('d');
        count++;
    }

    public void A() {
        System.out.print(count);
        count++;
    }

    public String toString() {
        return "b";
    }

    public void f() {
        System.out.print('a');
    }

    public static int getCount() {
        return count;
    }
}

class B extends A {
    public B() {
        System.out.print('h');
    }

    public B(int r) {
        this();
        System.out.print('f');
        System.out.println(getCount());
    }

    public void B() {
        System.out.print('g');
        super.A();
    }
}

public class Final {
    public static void f() {
        A a1 = new A();
        B b1 = new B(3);
        System.out.println(a1 + "+");
    }

    public static void main(String[] args) {
        System.out.println(A.getCount());
        f();
        System.out.println(A.getCount());
    }

}

