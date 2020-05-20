package hw01;

public class Palindrome {
    //        Write a program to check if a given string is a Palindrome.
//A palindrome reads same from front and back e.g.- aba, ccaacc, mom, etc.

    private static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i< j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "ccaacc";
        System.out.println(isPalindrome(str) ? "Yes" : "No");
    }
}
