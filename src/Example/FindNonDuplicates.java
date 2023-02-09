package Example;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class P1{
    final void m1(){}
    private void m2(){}
}
class C11 extends P1{
    void m4(){}

}
public class FindNonDuplicates {
    public static void main(String[] args) {
        int[] a={10,120,30};
       List<Integer> l=  Arrays.asList(1,2);
l.stream().collect(Collectors.toList());

        P1 p1
                =new P1();
        p1.m1();

        List<Integer> list=new ArrayList<>();
        list.add(10);

        list.add(300);
        list.add(0);

      Optional<Integer> i=  list.stream().findAny();
        System.out.println(i.get());

        Optional<Integer> k=  list.stream().findFirst();
        System.out.println(k.get());
//        Set<Integer> set=new HashSet<>();
//        for(int i=0;i<list.size();i++){
//            if(!set.add(list.get(i))){
//                set.remove(list.get(i));
//
//
//
//            }
//        }
//
//        System.out.println(set);
    }
}
