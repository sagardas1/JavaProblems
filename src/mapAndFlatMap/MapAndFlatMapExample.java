package mapAndFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMapExample {
    public static void main(String[] args) {
        List<Employee> list= DataBase.employeeList();
       List<String> s= list.stream().map(e->e.getName()).collect(Collectors.toList());
       System.out.println(s);
       // list.stream().flatMap(e->e.getName().stream()).collect(Collectors.toList());

    }
}
