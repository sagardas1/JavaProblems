package immutablepart2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address
                =new Address();
        address.setName("maitree viahr");
        address.setCity("Bhubaneswar");
        List<String> l=new ArrayList<>();
        l.add("min");
        l.add("max");
        Employee employee
                =new Employee(address,"sagar",l);

        System.out.println(employee.getA().getCity());
        address.setCity("xxx");
        System.out.println(employee.getA().getCity());
        System.out.println(employee.getCompanies().add("hhhh"));
        l.add("jjj");
        System.out.println(employee.getCompanies().size());
    }
}
