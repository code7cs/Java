package hw01;

//import static hw01.B.print;

public class Q8 {
    public static void main(String[] args) {
        A obj = new B();
        obj.print();

//        Write a program to find the length of the string "refrigerator".
        System.out.println("refrigerator".length());

// Write a program to check if the letter 'e' is present in the word 'Umbrella'.
        System.out.println("Umbrella".contains("e"));

//        Write a program to check if the word 'orange' is present in the "This is orange juice".
        System.out.println("This is orange juice".contains("orange"));
    }
}

class A {
    static void print() {
        System.out.println("Parent");
    }
}

class B extends A {
    static void print() {
        System.out.println("Child");
    }
}

