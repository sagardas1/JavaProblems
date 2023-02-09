package CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class CabManager {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier=new CyclicBarrier(4);
        Passanger passanger
                =new Passanger(1000,cyclicBarrier,"pass-1");
        Passanger passanger2
                =new Passanger(2000,cyclicBarrier,"pass-2");
        Passanger passanger3
                =new Passanger(3000,cyclicBarrier,"pass-3");
        Passanger passanger4
                =new Passanger(4000,cyclicBarrier,"pass-4");

        Passanger passanger5
                =new Passanger(5000,cyclicBarrier,"pass-5");
        Passanger passanger6
                =new Passanger(6000,cyclicBarrier,"pass-6");
        Passanger passanger7
                =new Passanger(7000,cyclicBarrier,"pass-7"); Passanger passanger8
                =new Passanger(8000,cyclicBarrier,"pass-8"); Passanger passanger9
                =new Passanger(9000,cyclicBarrier,"pass-9");


        passanger.start();
        passanger2.start();
        passanger3.start();

        passanger4.start(); passanger5.start();
        passanger6.start();
        passanger7.start();
        passanger8.start();

        passanger9.start();



    }
}
