package Example;

import java.util.Objects;

public class Example3 {
    public void m1(String i){
        System.out.println("String");
    }
    public void m1(Integer i){
        System.out.println("Integer");
    }
    public void m1(int i){
        System.out.println("int");
    }

    public static void main(String[] args) {
        String s=null;

        if(!Objects.isNull(s)){
            s.equals("");
        }

        Example3 example3
                =new Example3();
        example3.m1((Integer)10);
    }
}
