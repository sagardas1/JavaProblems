package Example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test implements Predicate{

    public List n1(List<Integer> l, Predicate<Integer> p) {
        return l.stream().filter(p).collect(Collectors.toList());


    }

    public static void main(String[] args) {
        var i=10;

        Predicate<Integer> p1=(p)->p>2;
        Predicate<Integer> p2=(p)->p%2==0;
        //Predicate<Integer> p3=(p)->10;


        Test t=new Test();
        t.n1(Arrays.asList(1,2,3,4),p1.or(p2));
    }

    @Override
    public boolean test(Object o) {
        return false;
    }
}
