package session05;

public class A {
    private int x;

    public A(int x) {
        this.x = x + 1;
        System.out.println("session05.A" + x);
    }

    public static void main(String[] args) {
        B b1 = new B();
        B b2 = new B(4);
    }
}

// B继承A
class B extends A {
    public B() {
        super(3);
        System.out.println("session05.B");
    }

    public B(int x) {
        super(x);
        System.out.println("C");
    }
}
