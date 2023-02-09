package callable;

import java.util.concurrent.Callable;

public class MyCallableInteface implements Callable {
    @Override
    public String call() throws Exception {
        return "sagar";
    }
}
