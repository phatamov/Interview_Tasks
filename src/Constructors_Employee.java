public class Constructors_Employee {

    String firstName;
    double salary;

    Constructors_Employee(String firstName, double salary){
        this.firstName = firstName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
