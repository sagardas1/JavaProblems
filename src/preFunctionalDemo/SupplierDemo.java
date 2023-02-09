package preFunctionalDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {
    @Override
    public String get() {
        return "sagar";
    }

    public static void main(String[] args) {
        Supplier supplier=new SupplierDemo();
       // System.out.println(supplier.get());

        List<String > list=new ArrayList<>();

//        list.add("Sagar");
//        list.add("sidharth111");
//        list.add("sidharth111");


     System.out.println(   list.stream().findAny().orElseGet(()->"hi java"));

    }
}
