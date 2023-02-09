package defaultMethodConcept;

public class Example1 implements A,B{
    @Override
    public void m2() {
        System.out.println("example");
    }

    @Override
    public void m1() {
        A.super.m1();
    }

    public static void main(String[] args) {
        Example1 example1
                =new Example1();
        example1.m2();
    }
}
