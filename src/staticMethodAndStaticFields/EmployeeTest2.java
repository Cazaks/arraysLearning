package staticMethodAndStaticFields;

public class EmployeeTest2 {
    public static void main(String[] args) {

        System.out.printf("Employees before instantiation: %d%n", Employee2.getCount());

        Employee2 empl1 = new Employee2("Adam", "Eve");
        Employee2 empl2 = new Employee2("John", "Smith");
        Employee2 empl3 = new Employee2("Abraham", "Sarah");
        Employee2 empl4 = new Employee2("Isaac", "Rebeka");
        Employee2 empl5 = new Employee2("Jacob", "Esau");

        System.out.printf("Employees after instantiation: %n");
        System.out.printf("via e1.getCount(): %d%n",  empl1.getCount());
        System.out.printf("via e2.getCount(): %d%n",  empl2.getCount());
        System.out.printf("via e3.getCount(): %d%n",  empl3.getCount());
        System.out.printf("via e4.getCount(): %d%n",  empl4.getCount());
        System.out.printf("via e5.getCount(): %d%n",  empl5.getCount());
        System.out.printf("via Employee.getCount(): %d%n",  Employee2.getCount());

        System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%nEmployee 3: %s %s%nEmployee 4: %s %s%nEmployee 5: %s %s%n",
                empl1.getFirstName(), empl1.getLastName(),
                empl2.getFirstName(), empl2.getLastName(),
                empl3.getFirstName(), empl3.getLastName(),
                empl4.getFirstName(), empl4.getLastName(),
                empl5.getFirstName(), empl5.getLastName());
    }
}
