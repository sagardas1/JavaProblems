package Example;

public class SingletonMy {
    private static SingletonMy singletonMy=null;

    private SingletonMy(){}

    public static SingletonMy getInstance(){
        synchronized (SingletonMy.class) {
            if (singletonMy == null) {
                singletonMy = new SingletonMy();
            }
        }
        return singletonMy;
    }

}
