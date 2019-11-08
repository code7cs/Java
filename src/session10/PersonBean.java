package session10;

/**
 * @author dkruger
 */
public class PersonBean { // MUST BE PUBLIC
    private String firstName, lastName;
    private int age;
    private int ssn;

    // 有一个public的无参数构造器
    public PersonBean() { // default constructor
    }

    // 属性可以通过get、set、is（可以替代get，用在布尔型属性上）方法或遵循特定命名规范的其他方法访问
    public void setFirstName(String v) {
        firstName = v;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String v) {
        lastName = v;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int v) {
        age = v;
    }

    public int getAge() {
        return age;
    }

    public Person[] getChildren() {
        return null;
    }

    public void setChildren(Person[] children) {
    }

    public void setChild(int i, Person p) {
        //children[i] = p;
    }

    public Person getChild(int i) {
        return null;
    }
}
