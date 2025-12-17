package composition;

public class EmployeeTest {
    public static void main(String[] args) {

        Date birthdate = new Date(11, 6, 1989);
        Date hiredate = new Date(1, 10, 2015);

        Employee hired = new Employee("James", "Brown", hiredate, birthdate);

        System.out.println(hired);
    }
}
