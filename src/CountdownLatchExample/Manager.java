package CountdownLatchExample;

import java.util.concurrent.CountDownLatch;

public class Manager {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch=new CountDownLatch(2);
        Dev dev1
                =new Dev(countDownLatch,"Dev-1");

        Dev dev2
                =new Dev(countDownLatch,"Dev-2");

        dev1.start();
        dev2.start();

        countDownLatch.await();

        Dev dev3
                =new Dev(countDownLatch,"Dev-3");
        dev3.start();

        QA qa
                =new QA();
        qa.start();

    }
}
