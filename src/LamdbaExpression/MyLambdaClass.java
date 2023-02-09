package LamdbaExpression;

public class MyLambdaClass {
    public static void main(String[] args) {
        Drawable d=()->{
            System.out.println("sagar");
        };
        d.draw();

        Nameable n=(p)->{
            return "Mr."+p;
        };
        Nameable n1=(p)->("Mr."+p);


      System.out.println(  n.name("Sagar"));
        System.out.println(  n1.name("Sagar"));
    }
}
