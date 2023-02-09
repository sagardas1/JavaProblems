package MySingletonClass;

import java.util.Objects;

public class MySingleton {

    private static   MySingleton mySingleton=null;

    private MySingleton(){}

    public static MySingleton getInstance(){
        synchronized (MySingleton.class) {
            if (Objects.isNull(mySingleton)) {
                mySingleton = new MySingleton();
            }

        }
        return mySingleton;
    }


}
