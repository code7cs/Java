package session10;

public class Cloning implements Cloneable {


//    public static void cloneMe(Cloneable c) {
//        Object obj = c.clone();
//
//    }
    public static void main(String[] args) {
        Person p = new Person("Dov", "Kruger", 52);
        Person p2 = p.clone();
//        cloneMe(P2);
    }


}
