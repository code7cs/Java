package session05;

import java.awt.*;

/**
 * https://bbs.csdn.net/topics/350150672
 */

public class ConcreteClass {
    private int x;
    private float y;
    private String name;

    public ConcreteClass() {
        x = 0;
        y = 2.5f;
        name = "Fred";
    }

    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass(); // instantiate
        System.out.println(concreteClass.x);
        System.out.println(concreteClass.y);
        System.out.println(concreteClass.name);

        Car car1 = new Car(120, "Red");
        car1.payToll();
    }
}
// 抽象类 里可以没有 抽象方法，但 有抽象方法的类 只能定义为 抽象类 ！！！
// 抽象类 不能被实例化，instantiate

abstract class Vehicle {
    private int speed;

    public Vehicle() {
    }

    public Vehicle(int s) {
        speed = s;
    }

    public abstract void payToll(); // 抽象方法，没有{}，即 没有方法体 !!!
}

class Car extends Vehicle {
    private int speed;

    public Car(int speed, String color) {
        this.speed = speed;
    }

    // 普通类，必须实现Vehicle类里的所有抽象方法 ！！！
    // 重写Vehicle类的payToll方法
    public void payToll() {
        if (speed > 100) {
            System.out.println("pay $25");
        } else {
            System.out.println("pay $15");
        }
    }
}

class Bus extends Vehicle {
    private int speed;

    public Bus(int speed, int passengerNum) {
        this.speed = speed;
    }

    public void payToll() {
        System.out.println("pay $4");
    }

    public class inner {

    }

    public static class inner2 {

    }
}

//interface Professor {
//    public void lecture();
//
//    public void officeHours();
//}