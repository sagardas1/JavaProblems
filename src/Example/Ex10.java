package Example;


class P{
    public void run(){
        walk();
    }
    public void walk(){
        System.out.println("walking p");
    }
}

class C1 extends P{
    public void run(){
       super.run();
    }
    public void walk(){
        System.out.println("walking c");
    }
}
public class Ex10 {
    public static void main(String[] args) {
        P p=new C1();
        p.run();
    }
}
