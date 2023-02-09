package ForEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MyForEach implements Consumer {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.forEach(n->{System.out.println(n);});
        Map<String,String> map=new HashMap<>();
        map.put("sagar","1");
        map.put("ram","2");
        map.forEach((a,b)->System.out.println(a+"->>>>"+b));
        map.entrySet().stream().forEach((a->System.out.println(a)));
    }

    @Override
    public void accept(Object o) {

    }
}
