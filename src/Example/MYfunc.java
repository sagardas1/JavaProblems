package Example;

import java.io.IOException;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class MYfunc {


    public static void ex(Predicate<Integer> p, List<Integer> list) {
        list.stream().filter(p).forEach(o -> System.out.println(o));

    }

    public boolean equals(Object obj) {
        return (this == obj);
    }


    public Integer get(Integer i) {
        System.out.println("integer");
        return i;
    }

    public String get(String i) {
        System.out.println("String");
        return i;
    }

    public static void longestSubsTRING(String s) {
        String s1 = "";
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (s1.contains(s.charAt(j) + "")) {
                    map.put(s1, s1.length());
                    s1 = "";
                } else {
                    s1 += s.charAt(j) + "";
                }
            }
        }

        Optional<Map.Entry<String, Integer>> m =
                map.entrySet().stream().sorted(Collections.reverseOrder(Comparator.comparing(p -> p.getValue()))).findFirst();
        System.out.println(m.get().getKey());
        System.out.println(m.get().getValue());
    }

    static public void main(String[] args) {

       PriorityQueue<Integer> pq=new PriorityQueue<>();
       pq.add(10);
       pq.add(11);
        pq.add(100);
        pq.add(99);
        pq.add(33);
        pq.add(55);
        pq.add(22);
        pq.add(66);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());














        /*





        // ObjectMapper mapper = new ObjectMapper();
         MYfunc.longestSubsTRING("Sagarqwety");
         Predicate<Integer> p1=(o)->{return o%2==0;};
         List<Integer> list=new ArrayList<>();
         list.add(2);
         list.add(4);
         list.add(6); list.add(2); list.add(1); list.add(1); list.add(1);


         MYfunc.ex(p1,list);

         int a1[] = {2, 4, 6, 5, 4, 3, 7, 8};


//        List<Integer> list=new ArrayList<>();
//        list.add(2);
//         list.add(4);
//         list.add(6); list.add(2); list.add(1); list.add(1); list.add(1);
//
//




//         Map<Integer,Integer> map= (Map<Integer, Integer>) l1.stream().collect(Collectors.groupingBy(o->o,Collectors.counting()));
//
  Map<Integer,Long>  map11=   (  (Map<Integer, Long>) list.stream().collect(Collectors.groupingBy(o->o,Collectors.counting())))
          .entrySet().stream().filter(l->l.getValue()>1).sorted(Comparator.comparing(p->p.getValue()))
              .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(o1,o2)->o1,LinkedHashMap::new));
         for(Map.Entry<Integer,Long> en:map11.entrySet()){
             System.out.println(en.getKey()+" --> "+en.getValue());
         }
    }*/

    }
}

