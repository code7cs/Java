package session10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) {
        try {
            Person p = new Person("Dov", "Kruger", 52);
            Person p2 = new Person("Dov", "Kruger", 52);
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
            oos.writeObject(p);
            oos.writeObject(p2);
            oos.close();



        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
