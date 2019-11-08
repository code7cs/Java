package session10;

import practiceMid.Test;

import java.io.Serializable;

public class Person implements Serializable {
    private long id;
    private String firstName, lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public boolean equals(Object other) {
        Person p = (Person) other;
        return firstName.equals(p.firstName) && lastName.equals(p.lastName) && age == p.age;
    }

    @Override
    public Person clone() {
        return new Person(firstName, lastName, age);
    }

    public static void main(String[] args) {
        Person p = new Person("Dov", "Kruger", 52);
        Person p2 = new Person("Hanfn", "Wang", 24);
        if (p.equals(p2)){

        }

//        Test for quiz  11.01.2019
//        float f = 7.5;
//        double d = 5.6f;
//        System.out.println(d);
//        long x = (int) 3.0;
//        System.out.println(x);
//        double a = 1.5;
//        float z = a;
//        int i = 9.0 / 4.5;
//        int i = (int) 3.5 * 4;
//        System.out.println(i);
//        int i = (int) (1.2 * 5);
//        System.out.println(i);
//        double d = (int) 4.6 + 5;
//        System.out.println(d);
//        double d = 100 + 0.1;
//        System.out.println(d);
//        double d = 5 / 2;
//        System.out.println(d);
//        System.out.println(factorial(10));
//        int i = 6.0;
//        double d = 1.5f;
//        System.out.println(d);
//        double sum = 0;
//
//        for (int i = 1; i <= 3; i++) {
//            sum += 1.0/i;
//        }
//        System.out.println(sum );
//        short i = 1;
//        System.out.println(i);

    }


//    private static double factorial(int n) {
//        short f = 1;
//        for (int i = 1; i <= n; i++)
//            f *= i;
//        return f;
//    }
}
