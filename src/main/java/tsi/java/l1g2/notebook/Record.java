package tsi.java.l1g2.notebook;

public class Record {
    private static int counter = 0;
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;


    public Record() {
        counter++;
        id = counter;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", e-mail='" + email + '\'' +
                '}';
    }
}
