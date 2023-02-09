package Example;

import java.util.*;
import java.util.stream.Collectors;

public class Human {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        Employee emp=new Employee("sagar",10,101);
        Employee emp1=new Employee("sagar1",10,99);
        Employee emp2=new Employee("sagar2",20,105);Employee emp3=new Employee("sagar3",20,1);
Map<Integer,Employee> map=new HashMap<>();




map.put(1,emp);
        map.put(2,emp1);
        map.put(3,emp2);
        map.put(4,emp3);
        map.entrySet().stream().sorted(Comparator.comparing(p->p.getValue().getSalary()))
                .collect(Collectors.toMap(e->e.getKey(),e->e.getValue(),(e1,e2)->e2,LinkedHashMap::new));
        
//        
//        
//        
//        list.add(emp);
//        list.add(emp1);
//        list.add(emp2);  list.add(emp3);
//
//     Map<Object, Integer> m= list.stream().collect(Collectors.groupingBy(p->p.getAge(),Collectors.summingInt(x->x.getSalary())));
//        System.out.println(m);


//
//        list.add("Sagar");
//        list.add("ram");
//        list.add("ram");
//        List<String> lis=new ArrayList<>();
//
//        lis.add("Sagar");
//        lis.add("ram");
//        lis.add("ram");
//        lis.add("ram");
//        System.out.println(list.equals(lis));
//        Set<String> list1=new HashSet<>();
//        System.out.println( list.stream().filter(p->!list1.add(p)).collect(Collectors.toList()));
//
//
//        Object obj1=new Object();
//        Object obj2=new Object();
//        System.out.println(obj1.equals(obj2));
//        System.out.println(obj1==obj2);
//
//
//        Map<String,Integer> map=new HashMap<>();
//        map.put("sagar",10);
//
//       List<Integer> l= map.entrySet().stream().map(p->p.getValue()).collect(Collectors.toList());
//        System.out.println(l);
    }
}
