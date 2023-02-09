package preFunctionalDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<String> {


    @Override
    public void accept(String s) {
        System.out.println("s");
    }

    public static void main(String[] args) {


        Consumer<String> consumer=(t)->{System.out.println(t);};
        //consumer.accept("Sagar");

        List<String > list=new ArrayList<>();

        list.add("Sagar");
        list.add("sidharth");

        list.forEach(consumer);

    }
}
