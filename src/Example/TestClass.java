package Example;

import java.util.*;
import java.util.stream.Collectors;

public class TestClass{
    private static TestClass o1 = null;

    private TestClass(){}
    public static TestClass testPrint() {
        synchronized (MySingle.class){
            if(o1==null){
                o1=new TestClass();

            }}

        return o1;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
String s="sagar";
for(int i=0;i<s.length();i++){

    if(s.indexOf(s.charAt(i)+"")!=s.lastIndexOf(s.charAt(i)+"")){
        System.out.println(s.charAt(i));
        break;
    }
}
        List<Integer> list=new ArrayList<>();
     Map<Object,Long> m=  list.stream().collect(Collectors.groupingBy((o->o),Collectors.counting()));

        TestClass testClass= (TestClass) TestClass.testPrint().clone();

        Map<String,String> map=new HashMap<>();
    // Map<String ,String> m=   map.entrySet().stream().sorted(Comparator.comparing(p->p.getKey())).map().collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(o1,o2)->o1,LinkedHashMap::new));
    }


    public StringBuffer reverse(String s1)
    {
        StringBuffer s=new StringBuffer();
        for(int i=s1.length()-1;i>=0;i--){
        s.append(s1.charAt(i)+"");
    }
        return s;

    }
}