package Comparator;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Employee employee
                =new Employee("sagar",300,100);
    employee.m1();
        Employee employee1=new Employee("sid",500,300);

        List<Employee> list=new ArrayList<>();
        list.add(employee);
        list.add(employee1);
//MyComparator myComparator=new MyComparator();
//        Collections.sort(list, myComparator);
//        System.out.println(list);
//for(Employee e:list){
//    System.out.println(e.getAge());
//}
list.parallelStream().filter(p->p.getAge()>10).collect(Collectors.toList());

//
//list.stream().sorted(Collections.reverseOrder(Comparator.comparing(p->p.getAge()))).collect(Collectors.toList());
//list.stream().sorted(Comparator.comparing(p->p.getAge())).collect(Collectors.toList());
    }
}
