package myHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyHashMapEx {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
      System.out.println( map.put(null,"sagar"));



      System.out.println(map.put(null,"sid"));

        System.out.println(map);
        Map<String,String> map1=new ConcurrentHashMap<>();
        map1.put(null,"sagar");
        map1.put(null,"sidharth");

    }
}
