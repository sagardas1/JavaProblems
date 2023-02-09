package demo;

import Example.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Test {List<String> stringList = new ArrayList<>();

    public static void main(String[] args) {


      //  Employee
         Map<String, Integer> wordCounts = new HashMap<>();
        wordCounts.put("USA", 100);
        wordCounts.put("jobs", 200);
        wordCounts.put("software", 50);
        wordCounts.put("technology", 70);
        wordCounts.put("opportunity", 200);



        HashMap<String ,String> map=new HashMap<>();


     HashMap<String, Integer> sort=   wordCounts.entrySet().stream().sorted(Comparator.comparing(p->p.getValue())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(o1,o2)->o1,LinkedHashMap::new));
        for(Map.Entry<String, Integer> en:sort.entrySet()){
            System.out.println(en.getKey()+" --->> "+en.getValue());
        }

    }
}
