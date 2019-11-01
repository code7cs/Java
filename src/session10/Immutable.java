package session10;

public class Immutable {
    public static void main(String[] args) {
        String s = "abc";
        s += "def";
//        for (int i = 0; i < 1000; i++) {
//            s += i;
//        }
        Integer i1 = new Integer(4);
        Integer i2 = 5;
        i2 = i2 + 3; // i2 = new Integer(i2.intValue() + 3);

        // identity
        int x = 2;
        int y = 3;
        System.out.println(x == y);
        Integer j = i1;

        System.out.println(j == i1);    // same object
        j = new Integer(4);
        System.out.println(j == i1);    // false.  because check the identity
        System.out.println(j.equals(i1));   // true


        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);   // true
        String s3 = "ab" + "c";         //  ---> "abc"
        System.out.println(s1 == s3);   // true
        String s4 = "ab";
        s4 += "c";
        System.out.println(s1 == s4);   // false
        System.out.println(s1.equals(s4));   // true
        String s5 = new String("abc");
        System.out.println(s1 == s5);   // false

    }
}
