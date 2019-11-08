package session10;

public class TestPersonBean {
    public static void main(String[] args) {
        PersonBean person = new PersonBean();

        person.setFirstName("Hanfan");
        person.setAge(23);

        System.out.println(person.getFirstName());
        System.out.println(person.getAge());
    }
}
