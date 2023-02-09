package upcasting2;

public class MainClass {
    public static void main(String[] args) {
        Parent parent=new Child();
        parent.run();
        parent.walk();
      //  parent.a1();
    }
}
