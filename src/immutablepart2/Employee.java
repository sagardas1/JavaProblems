package immutablepart2;
import java.util.*;
public final class Employee {
   final private Address a;
   final private  String name;
   final private ArrayList<String> companies;

    public Employee(Address a, String name, List<String> companies) {
        Address address=new Address();
        address.setCity(a.getCity());
        address.setName(a.getName());
        this.a = address;
        this.name = name;

        ArrayList<String> list=new ArrayList<>();
        for(String s:companies){
            list.add(s);
        }
        this.companies = list;
    }

    public Address getA() throws CloneNotSupportedException {
        return (Address) a.clone();
    }

    public String getName() {
        return name;
    }

    public List<String> getCompanies() throws CloneNotSupportedException {
        return (List<String>) companies.clone();
    }
}
