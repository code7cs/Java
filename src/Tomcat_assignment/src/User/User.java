package User;

public class User {
    private String firstName;
    private String lastName;
    private String id;
    private String password;

    public User() {
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        return "firstName: " + firstName + "\nlastName: " + lastName + "\nid: " + id + "\npassword: " + password;
    }
}
