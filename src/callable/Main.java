package callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(1000);
      Future<String> f= executorService.submit(new MyCallableInteface());
      String s=(String)f.get();
        System.out.println(s);

    }
        }
