package defaultMethodConcept;

public interface A {
    void m2();
    default void m1(){
        System.out.println("in A");
    }
}
