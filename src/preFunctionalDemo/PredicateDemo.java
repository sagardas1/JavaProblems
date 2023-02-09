package preFunctionalDemo;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo implements Predicate<String> {

    @Override
    public boolean test(String s) {

        return s.length()>10;
    }

    public static void main(String[] args) {
        PredicateDemo predicateDemo=new PredicateDemo();


        List<String > list=new ArrayList<>();

        list.add("Sagar");
        list.add("sidharth111");
        list.add("sidharth111");

        list.stream().filter(p->(p.length()>10)).forEach(p->System.out.println(p));



    }
}
