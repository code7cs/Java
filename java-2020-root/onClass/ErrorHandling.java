package onClass;

import java.io.File;

public class ErrorHandling {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        System.out.println("line one");
//        try {
//            System.out.println(a / b);
//        } catch (ArithmeticException e) {
//            System.out.println("num is divided by zero" + e.getMessage());
//        } finally {
//            System.out.println("finally");
//        }

        /*
        line one
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	    at onClass.ErrorHandling.main(ErrorHandling.java:9)
        */

        File file = new File("");
//        file.createNewFile();

    }
}
