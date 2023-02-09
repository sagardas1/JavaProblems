package LamdbaExpression;

public final class MyImmutableClass {

    private String name;

    MyImmutableClass(String name){
        this.name=name;

    }

    public String getName(){
        return name;
    }

}
class A{
    public static void main(String[] args) {
        MyImmutableClass myImmutableClass=new MyImmutableClass("Sagar");
    }
}