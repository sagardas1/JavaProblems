package Example;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
//        for(int i=0;i<10;i++){
//            list.add(i+1);
//        }
//
//        List<Integer> list1=list.stream().map(p->p*2).collect(Collectors.toList());
//        System.out.println(list1);


        String s="sagar 123456das";
      for(int i=0;i<s.length();i++){
          if(s.charAt(i)>=48 && s.charAt(i)<=57){
              list.add(Integer.valueOf(s.charAt(i)+""));
          }
      }

     OptionalInt sum= list.stream().mapToInt(p->p).max();
        System.out.println(sum.getAsInt());
    }
}
