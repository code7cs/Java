package hw01;
//Create a class named 'Member' having the following members:
//        Data members
//        1 - Name
//        2 - Age
//        3 - Phone number
//        4 - Address
//        5 - Salary
//        It also has a method named 'printSalary' which prints the salary of the members.
//        Two classes 'Employee' and 'Manager' inherits the 'Member' class.
//        The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
//        Now, assign name, age, phone number, address and salary to an employee and a manager
//        by making an object of both of these classes and print the same.


public class Member {
    String name, phone_number, address;
    int age;
    double salary;

    public Member(String name, String phone_number, String address, int age, double salary) {
        this.name = name;
        this.phone_number = phone_number;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }


    void printSalary() {
        System.out.println(this.salary);
    }

    public static void main(String[] args) {
        Member e = new Employee("HW", "123456789", "1 St.", 20, 100000, "Engineer");
        e.printSalary();

        Member manager = new Manager("HW", "123456789", "1 St.", 20, 1000000, "A");
        manager.printSalary();
    }
}

class Employee extends Member {
    String specialization;

    Employee(String name, String phone_number, String address, int age, double salary, String specialization) {
        super(name, phone_number, address, age, salary);
        this.specialization = specialization;
    }
}

class Manager extends Member {
    String department;

    Manager(String name, String phone_number, String address, int age, double salary, String department) {
        super(name, phone_number, address, age, salary);
        this.department = department;
    }
}