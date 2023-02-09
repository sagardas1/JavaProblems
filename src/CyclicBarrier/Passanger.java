package CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Passanger extends Thread{


    long mills;
    CyclicBarrier cyclicBarrier;
    Passanger(long mills,CyclicBarrier cyclicBarrier,String name){
        super(name);
        this.mills=mills;
        this.cyclicBarrier=cyclicBarrier;

    }
    @Override
    public void run(){
        int count;
        try {
            Thread.sleep(mills);
             count=cyclicBarrier.await();
            if(count==0) {
                System.out.println("passanger ends");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }

            System.out.println("passengers--->>> " + Thread.currentThread().getName());


        }
}
