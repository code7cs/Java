package hw01;

import java.util.Scanner;
// Write a program to print a string entered by user.

public class PrintUserInput {
    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter anything you want: ");
        string = scanner.nextLine();
        System.out.println("Here is your typing: " + string);
    }
}
