package upcasting2;

public class Child extends Parent{
    @Override
    void run(){
        super.run();
        System.out.println("child run");
    }

    void a1(){
        System.out.println("SAgar");
    }


}
