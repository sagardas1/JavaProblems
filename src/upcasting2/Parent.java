package upcasting2;

public class Parent {
    void run(){
        walk();
        System.out.println("parent run");
    }

    void walk(){
        System.out.println("parent walk");
    }
}
