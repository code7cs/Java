package practiceMid;

import java.awt.*;

public class Drawing {
    public static void main(String[] args) {
        Line line = new Line(25.0, 50.0, 200.0, 100.0);
        Rect r = new Rect(30.0, 32.0, 10.0, 5.0);
        System.out.println(line);
        System.out.println(r);

        double a = r.area();
        System.out.println(a);

        Shapes[] shapes = new Shapes[2];
        shapes[0] = line;
        shapes[1] = r;
        System.out.println(shapes[0].area());
        System.out.println(shapes[1].area());

        // Question 7
        System.out.println(r.containsPoint(33, 34));

    }
}

abstract class Shapes {
    private double x, y;

    public Shapes(double x, double y) {
        this.x = x;
        this.y = y;
    }

    abstract double area();

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Rect extends Shapes {
    private double w, h;

    public Rect(double x, double y, double w, double h) {
        super(x, y);
        this.w = w;
        this.h = h;
    }

    public double area() {
        return w * h;
    }

    public boolean containsPoint(double a, double b) {
        return (a > getX() && a < (getX() + w) && b > getY() && b < (getY() + h));
    }

    public String toString() {
        return "Rect ===> X:" + getX() + ", Y: " + getY() + ", W: " + w + ", H: " + h;
    }
}

class Line extends Shapes {
    private double x, y;

    public Line(double x1, double y1, double x2, double y2) {
        super(x1, y1);
        this.x = x2;
        this.y = y2;
    }

    public double area() {
        return 0.0;
    }

    public String toString() {
        return "Line ===> X1:" + getX() + ", Y1: " + getY() + ", X2: " + x + ", Y2: " + y;
    }
}

