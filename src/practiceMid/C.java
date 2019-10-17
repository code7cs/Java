package practiceMid;

interface A {
    public void f();
}

class B implements A {
    private int x;

    public B(int x) {
        this.x = x;
    }

    public void f() {
        System.out.println("B");
    }

    public String toString() {  // should print "B x=5" whatever x is
        return "B x=" + x;
    }
}

public class C extends B {
    private int y;

    public C(int x, int y) {
        super(x);
        this.y = y;
    }

    public void f() {
        super.f();
        System.out.println("C");
    }

    public String toString() {
        return super.toString() + " C y=" + y;
    }

    public static void main(String[] args) {
        C c1 = new C(10, 4);
        System.out.println(c1);
        c1.f();

        B b = new B(3);
        System.out.println(b);
        b.f();
    }
}
