package composition;

public class Employee {

    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private Date hireDate;

    public Employee(String firstName, String lastName, Date dateOfBirth, Date hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.hireDate = hireDate;
    }

    public String toString() {
        return String.format("%s %s Hired: %s Birthday: %s", firstName, lastName, hireDate, dateOfBirth);
    }
}
