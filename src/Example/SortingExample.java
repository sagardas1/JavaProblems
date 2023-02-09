package Example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingExample {

    public static void main(String[] args) {
        Employee employee=new Employee("sagar",20,2000);
        Employee employee1=new Employee("ram",22,1000);
        Employee employee2=new Employee("sid",10,2333);
        Employee employee3=new Employee("z",33,11);
        Employee employee4=new Employee("y",11,34);
        List<Employee> list=new ArrayList<>();
        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        List<Employee> list1=list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());


       // List<Employee> list1=list.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());

        for(Employee e:list1){
            System.out.println(e.getName());
        }


    }
}
