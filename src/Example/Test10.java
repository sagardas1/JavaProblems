package Example;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


class ABC{
    int i=10;



}
public class Test10 {
    public static void main(String[] args) {
//        Employee employee=new Employee("sagar",20,2000);
//        Employee employee1=new Employee("ram11",22,1000);
//        Employee employee10=new Employee("ram11",22,1000);
//        Employee employee2=new Employee("sid",10,2333);
//
//        if (employee1.equals(employee10)) {
//            System.out.println(true);
//        }else {
//            System.out.println(false);
//        }
//String s=new String("sagar");
//        String s2=new String("sagar");
//        System.out.println( s.equals(s2));
//
//
        Employee employee3=new Employee("z",33,11);
        Employee employee4=new Employee("y",11,34);
        List<Employee> list=new ArrayList<>();
        Predicate<Employee> p=(o->o.getAge()==30);
        Predicate<Employee> l=(o->o.getSalary()==30);
list.stream().filter(p.and(l) ).collect(Collectors.toList());

        list.add(employee3);
        list.add(employee4);
     List a=   list.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
    // list.stream().sorted(Collections.sort(l,Comparator.comparing(Emp));)
//
//        list.stream().collect(Collectors.groupingBy((p->p.getName()),Collectors.counting()));
//       List<String> l= list.stream().filter(p->p.getName().length()==5).map(q->q.getName()).distinct().collect(Collectors.toList());
//      //  System.out.println(l);
        Map<Integer,Employee> map=new HashMap<>();

        //map.entrySet().stream().sorted(Collections.reverseOrder(Comparator.comparing(p->p.getValue().getSalary())))
         //       .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(o1,o2)->o1,LinkedHashMap::new));
//
//        map.put(1,1);
//        map.put(0,0);
//        map.put(2,2);
//      Map<Integer,Integer> m= map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(o1,o2)->o1,LinkedHashMap::new));
//        System.out.println(m);
//
//
//
//List<String> list=new ArrayList<>();
//list.add("sagar");
//list.add("sid");
//list.add("ram");
//        list.add("Sagar");
//
//      Set<String> l=  list.stream().map(p->p.toLowerCase()).collect(Collectors.toSet());
//        System.out.println(l);
//
//
//        String s="Sagar";
//        List<Character> ch=new ArrayList<>();
//     int   j=0;
//char[] c=new char[s.length()];
//        for(int i=s.length()-1;i>=0;i--){
//            ch.add(s.charAt(i));
//            c[j]=s.charAt(i);
//            j++;
//        }
//
//        System.out.println(ch.toString());  System.out.println(String.valueOf(c));
        System.out.println("main");
    }
    static{
        System.out.println("static block");
    }
    ABC abc
            =new ABC();
  //  abc.clone();
}
