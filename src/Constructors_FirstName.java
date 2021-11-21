import java.util.ArrayList;
import java.util.List;

public class Constructors_FirstName {
    public static void main(String[] args) {


        Constructors_Employee employee = new Constructors_Employee("Parviz", 3500);
        Constructors_Employee employee1 = new Constructors_Employee("Paul", 2500);

        List<Object> list = new ArrayList<>();
        list.add(employee);
        list.add(employee1);

        System.out.println(list);



    }
}
