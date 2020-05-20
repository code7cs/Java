package hw01;

// Create a class 'Student' with three data members which are name, age and address.
// The constructor of the class assigns default values name as "unknown", age as '0' and address as "not available".
// It has two members with the same name 'setInfo'.
// First method has two parameters for name and age and assigns the same
// whereas the second method takes has three parameters which are assigned to name, age and address respectively.
// Print the name, age and address of 10 students.
// Hint - Use array of objects
public class Student {
    private String name;
    private int age;
    private String address;

    public Student() {
        this.name = "unknown";
        this.age = 0;
        this.address = "not available";
    }

    private void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String toString() {
        return "name: " + this.name + " age: " + this.age + " address: " + this.address;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            Student student = new Student();
            student.setInfo("Hans" + i, 20 + i, i + "blvd");
            System.out.println(student);
        }
    }

}
