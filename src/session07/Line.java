package session07;

public class Line {
    public static void main(String[] args) {
        Circle circle = new Circle(1, 1, 1);
        System.out.println(circle.area());
    }
}

class Circle extends Shape {
    private double radius;
    private double x, y;

    public Circle(double x, double y, double r) {
        super(x, y);
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    void draw() {

    }
}

class Rect {

}

abstract class Shape {
    private double x, y;

    // constructor
    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    abstract double area();

    abstract void draw();


}

