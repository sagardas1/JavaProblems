package Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sum {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,2,3,4,5,6);
      int y=  list.stream().filter(k->k%2==0).mapToInt(i->i).sum();
      System.out.println(y);


       int a[]=new int[3];
       a[0]=1;
       a[1]=2;
       a[2]=3;

//       Arrays.stream(a).st
//        Stream.of(a).filter(a->a%2==0).collect(Collectors.toList());
    }
}
