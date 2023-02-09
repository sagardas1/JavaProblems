package Example;


import java.io.FileNotFoundException;

class Parent11{
    public void  m1() throws FileNotFoundException{
        System.out.println("sagar");
    }
    static{
        System.out.println("static block of p");
    }
    {
        System.out.println("non-static block of p");
    }
}
class Child extends Parent11{
    static{
        System.out.println("static block of c");
    }
    {
        System.out.println("non-static block of c");
    }
     public void  m1() {
        System.out.println("sagar");
    }
}
public class RRR {
    public static void main(String[] args) {
        System.out.println(10+20+"sagar");
        System.out.println("sagar"+10+20);

    }
}
