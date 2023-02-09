package Example;


class A{
    A(){
        super();
        System.out.println("A------>>>");
    }
}

class B extends A{
    B(){
        super();
        System.out.println("B------>>>");
    }
}
class C extends B{
    C(){
        super();
        System.out.println("c------>>>");
    }
}
public class InHeritanceClass {
    public static void main(String[] args) {
        C a=new C();
    }
}
