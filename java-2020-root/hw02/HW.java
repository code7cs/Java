package hw02;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;

class HW {
    static void getIndex(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println("The character at position " + i + " is " + str.charAt(i));
        }
    }

    static void convertCase(StringBuffer str) {
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char character = str.charAt(i);
            if (Character.isLowerCase(character)) {
                str.replace(i, i + 1, Character.toUpperCase(character) + "");
            } else {
                str.replace(i, i + 1, Character.toLowerCase(character) + "");
            }

        }
    }

    // Write a program to get a character array from String?
    static void toCharArray(String str) {
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        for (char c : ch) {
            System.out.println(c);
        }
    }

    // remove duplicate characters
    static String removeDuplicate(String str) {
        char[] chs = str.toCharArray();
        Set<Character> characterSet = new LinkedHashSet<>();
        for (char c : chs) {
            characterSet.add(c);
        }
//        System.out.println(characterSet);
        StringBuilder sb = new StringBuilder();
        for (Character c : characterSet) {
            sb.append(c);
        }
        return sb.toString();
    }

    // throw
    static void checkEligibilty(int stuage, int stuweight) {
        if (stuage < 12 && stuweight < 40) {
            throw new ArithmeticException("Student is not eligible for registration");
        } else {
            System.out.println("Student Entry is Valid!!");
        }
    }

    static class ThrowExample {
        // throws
        void myMethod(int num) throws IOException, ClassNotFoundException {
            if (num == 1)
                throw new IOException("IOException Occurred");
            else
                throw new ClassNotFoundException("ClassNotFoundException");
        }
    }


    public static void main(String[] args) {
//        getIndex("Java Exercises");

//        StringBuffer str = new StringBuffer("Hello World!");
//        convertCase(str);
//        System.out.println(str);

//        toCharArray("Hello World!");

//        System.out.println(removeDuplicate("Programming"));

//        checkEligibilty(10, 39);

        try {
            ThrowExample obj = new ThrowExample();
            obj.myMethod(1);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
