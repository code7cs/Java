package onClass;

public class StringDemo {

    public static void main(String[] args) {
        // ================================================
        // String
        // immutable - cannot changed
        // heap vs method area

        String str = new String("hello");
        System.out.println(str.hashCode()); // 99162322
        str = new String("hi");
        System.out.println(str.hashCode()); // 3329
        str = new String("hello");
        System.out.println(str.hashCode()); // 99162322

        String s1 = "hello";
        System.out.println(s1.hashCode());
        String s2 = s1.intern();
        System.out.println(s2.hashCode());
    }

}
