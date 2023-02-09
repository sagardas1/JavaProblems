import Example.Employee;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AAA {

    public static void m1(String a){
        a=null;
    }
    public static void m1(int a){
        a=0;
    }
    public static void m1(Employee a){
        a.setAge(10);

    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(20);
        list.add(30);
        BiPredicate<Integer,Integer> p=(o1, p1)->{return ((o1%2)+(p1%2) %2)==0;};

        //list.stream().filter.test
//    List<Integer> llll= list.stream().collect(Collectors.groupingBy(i->i,Collectors.counting())).entrySet().stream().filter(p->p.getValue()==1).map(k->k.getKey()).collect(Collectors.toList());
//        System.out.println(llll);

//        Employee employee
//                =new Employee("Sagar",1,1);
//        String s=new String("Sagar");
//        int i=20;
//        AAA.m1(s);
//        AAA.m1(i);
//        AAA.m1(employee);
//        System.out.println(s);
//        System.out.println(i);
//        System.out.println(employee.getAge());
    }
}
