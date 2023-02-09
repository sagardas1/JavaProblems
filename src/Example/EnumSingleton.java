package Example;

 enum MYEnumSingleton {

    INSTANCE;

}

public class EnumSingleton{
    public static void main(String[] args) {
        System.out.println(  MYEnumSingleton.INSTANCE);
    }
}
