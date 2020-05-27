package hw02;

abstract class Parent {
    abstract void message();
}
class ChildOne extends Parent {
    @Override
    void message() {
        System.out.println("This is first subclass");
    }
}
class ChildTwo extends Parent {
    @Override
    void message() {
        System.out.println("This is second subclass");
    }
}
