package CountdownLatchExample;

import java.util.concurrent.CountDownLatch;

public class Dev extends Thread{
    CountDownLatch countDownLatch;

    Dev(CountDownLatch countDownLatch,String name){
        super(name);
        this.countDownLatch=countDownLatch;
    }
    @Override
    public void run(){

        System.out.println("Developing is going on by "+ Thread.currentThread().getName());
try{Thread.sleep(1000);} catch (InterruptedException e) {
    throw new RuntimeException(e);
}
        System.out.println("Developing is done on by "+ Thread.currentThread().getName());

countDownLatch.countDown();

    }
}
