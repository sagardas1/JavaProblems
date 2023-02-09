package OverloadingAndOverridding;

public class Main {
    public static void main(String[] args) {
ClassA a=new ClassB();
        System.out.println(a.a);


        Thread thread=new Thread(new ClassA());
        thread.run();
        thread.run();
        thread.start();
        thread.start();


    }
}
