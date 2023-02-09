package Example;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args) {
        int sum=0;
for(int l=0;l<=10;l++)
    sum+=l;





        System.out.println();
        System.out.println(sum);

        System.out.println("----------------------------------");
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i+1);
        }

        String s="ram";
        Optional<String> o= Optional.ofNullable(s);

        String oo= o.orElse("string is empty");
        System.out.println(oo);
        list.stream().map(p->p*p*p).forEach(k-> System.out.println(k));
//Set<Integer> set =new HashSet<>();
//        set.add(null);
//        set.add(null);
//        System.out.println(set.size());
//
//        Map<String ,Integer> map= Collections.synchronizedMap(new HashMap<>());
//        int count=list.stream().filter(p->p%2!=0).map(q->q*q).mapToInt(o->o).sum();
//        OptionalDouble dou=list.stream().filter(p->p%2!=0).map(q->q*q).mapToInt(o->o).average();
//        System.out.println(count);
//        System.out.println(dou);
//        String s=null;
//        s=s.concat("sagar");
//        System.out.println(s);


    }
}
