package Example;

import java.util.*;
import java.util.stream.Collectors;

public class Main10 {
    public static void main(String[] args) {
Integer.valueOf("");
Integer.parseInt("10");
        Runnable r=()->{
            System.out.println("run method executed");
        };
        Thread thread
                =new Thread(r);
        thread.start();
        r.run();
        String[] array = {"a", "b", "c", "d", "e"};

List<List<Integer>> list=new ArrayList();
        List<Integer> list1=new ArrayList();
        list1.add(10);
        list1.add(10);
       // list1.stream()
        List<Integer> list2=new ArrayList();
        list2.add(20);
        list2.add(20);
        list.add(list1);
        list.add(list2);
        System.out.println(list.stream().flatMap(p->p.stream()).collect(Collectors.toList()));
//        int i=10;
//        Integer t=i;
//        int k=t;
//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(10);list.add(20);
//        ImmutableX immutableX=new ImmutableX("sagar",list);
//
//        immutableX.getName();
//
//        System.out.println(immutableX.getDegree());
//        list.add(90);
//        immutableX.getDegree().add(11);
//        System.out.println(immutableX.getDegree());
    }


}
