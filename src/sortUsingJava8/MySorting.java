package sortUsingJava8;

import java.util.*;
import java.util.stream.Collectors;

public class MySorting {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(100);
//natural sorting order
        list.stream().sorted().forEach(p->System.out.println(p));
//reverse sorting order
        list.stream().sorted(Comparator.reverseOrder()).forEach(p->System.out.println(p));

      List<Employee> employeeList=  DataBase.employeeList();

//        Collections.sort(employeeList,new Comparator<Employee>(){
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                if(o1.getSalary()>o2.getSalary()) return -1;
//                else if(o1.getSalary()<o2.getSalary()) return 1;
//                else return 0;
//
//            }
//
//
//        });

        employeeList.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).forEach(p->System.out.println(p.getSalary()));
        System.out.println("------------------------");
        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
        Map<Integer,Employee> map=DataBase.employeeMap().entrySet().stream().sorted(Map.Entry.<Integer,Employee>comparingByValue(Comparator.comparing(Employee::getSalary)).reversed()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        for(Map.Entry<Integer,Employee> entry:map.entrySet()){
       System.out.println(entry.getKey()+"---"+entry.getValue().getSalary());
   }


    }
}
