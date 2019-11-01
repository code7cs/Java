package session10;

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
//        Perosn p = new Person("Dov", "Kruger", 52);
//        Perosn p2 = new Person("Hanfn", "Wang", 24);
//        if (p.equals(p2)){
//
//        }
    }

}
