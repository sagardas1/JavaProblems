package Example;

import java.util.*;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Anargram {
    public static void main(String[] args) {
       // Function
List l=new ArrayList<Integer>();
        ( (Map<Object, Integer>) l.stream().collect(Collectors.groupingBy(p->p,Collectors.counting())))
               .entrySet().stream().filter(k->k.getValue()>1).map(j->j.getKey()).collect(Collectors.toList());
//        String s1="sagar";
//        String s2="agars";
//
//        if(s1.length()!=s2.length()){
//            System.out.println("not anargram");
//
//        }
//char c1[]=s1.toCharArray();
//        char c2[]=s2.toCharArray();
//        Arrays.sort(c1);
//        Arrays.sort(c2);
//
//
//      String s11= String.valueOf (c1);
//        String s13= String.valueOf (c2);
//if(s11.equals(s13)){
//    System.out.println(" anargram");
//
//}
        Anargram anargram
                =new Anargram();
        anargram.m1();

    }
    public void m1() throws NullPointerException{
        throw new NullPointerException();
    }
}
