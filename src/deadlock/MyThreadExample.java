package deadlock;

import Example.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyThreadExample {

//sagaedas


    public static void main(String[] args) {

        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        int min=Integer.MIN_VALUE;
        int max=0;
        for(int i=0;i<a.length;i++){
            max+=a[i];
            if(max>min){
                min=max;
            }
            if(max<0){
                max=0;
            }
        }
        System.out.println(max);

        ArrayList<Employee> list=new ArrayList<>();
        Employee emp1=new Employee("Sagar",10,100);
        Employee emp2=new Employee("Sagar11",10,10110);
        Employee emp3=new Employee("ZZZZ",20,100);
        Employee emp4=new Employee("WWW",20,10110);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);




      Map<Object, List<Employee>> map=  list.stream().collect(Collectors.groupingBy(o->o.getAge()));

      for(Map.Entry<Object,List<Employee>> en:map.entrySet()){
          System.out.println(en.getKey()+"---->>"+en.getValue());
      }
        final Object resource1="xyz";
        final Object resource2="abc";
        Thread thread1=new Thread(){
            public void run(){
                synchronized (resource1){
                    System.out.println("Thread 1: locked resource 1");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                synchronized (resource2){
                    System.out.println("Thread 1: locked resource 2");


                }
            }
        };


        Thread thread2 =new Thread(){
            public void run(){
                synchronized (resource2){
                    System.out.println("Thread 2: locked resource 2");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                synchronized (resource1){
                    System.out.println("Thread 2: locked resource 1");


                }
            }

        };
        thread1.start();
        thread2.start();
    }
}
