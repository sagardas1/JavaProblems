package Example;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.*;
import java.util.concurrent.ExecutorService;

public class MyCompletableFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Void> c= CompletableFuture.runAsync(()->{for(int i=0;i<10;i++){
            System.out.println(i);
        }});
        c.get();

        ExecutorService ex= Executors.newFixedThreadPool(10);
      Callable<String> s=()->{return "Sagar das";};
        Runnable  r=()->{
            System.out.println("sagar");
        };
      Future<String> f=  ex.submit(s);
        System.out.println(f.get());

//       Future<String> f1= (Future<String>) ex.execute(r);
//        System.out.println(f1.get());


    }
}
