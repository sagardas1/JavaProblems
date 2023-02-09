package CountdownLatchExample;

import java.util.concurrent.CountDownLatch;

public class QA extends Thread{

    @Override
    public void run(){

        System.out.println("testing  is started on by "+ Thread.currentThread().getName());

        System.out.println("testing is done on by "+ Thread.currentThread().getName());



    }
}
