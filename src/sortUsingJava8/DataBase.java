package sortUsingJava8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase {

    public static List<Employee> employeeList(){
        List<Employee> list=new ArrayList<>();
        list.add(new Employee("RAM",1,10000,"SOFTEARE"));
        list.add(new Employee("SHYAM",2,20000,"GOVT."));
        list.add(new Employee("X",3,5000,"CLERK"));
        list.add(new Employee("Y",4,2000,"OFFICE BOY"));
        list.add(new Employee("Z",5,1000,"PEON"));
return list;
    }


    public static Map<Integer,Employee> employeeMap(){
        Map<Integer,Employee> list=new HashMap<>();
        list.put(1,new Employee("RAM",1,10000,"SOFTEARE"));
        list.put(2,new Employee("SHYAM",2,20000,"GOVT."));
        list.put(3,new Employee("X",3,5000,"CLERK"));
        list.put(4,new Employee("Y",4,2000,"OFFICE BOY"));
        list.put(5,new Employee("Z",5,1000,"PEON"));
        return list;
    }
}
