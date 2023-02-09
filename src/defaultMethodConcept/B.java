package defaultMethodConcept;

public interface B {
    void m2();
    default void m1(){
        System.out.println("in B");
    }
}
