package Example;
 class PrintSequenceRunnable implements Runnable{

    public int PRINT_NUMBERS_UPTO=10;
    static int  number=1;
    int remainder;
    static Object lock=new Object();

    PrintSequenceRunnable(int remainder)
    {
        this.remainder=remainder;
    }

    @Override
    public void run() {
        while (number < PRINT_NUMBERS_UPTO-1) {
            synchronized (lock) {
                while (number % 3 != remainder) { // wait for numbers other than remainder
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + number);
                number++;
                lock.notifyAll();
            }
        }
    }
}
class MyProg extends Thread{
   // public int PRINT_NUMBERS_UPTO=10;
    static int  number=1;
    int remainder;
    static Object o=new Object();

    MyProg(int reminder){
        this.remainder=reminder;


    }
    @Override
    public void run(){
//        while(i<10){
//            synchronized (object){
//                while (i % 3 != reminder) {
//                    try {
//                        object.wait();
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//                    System.out.println(i);
//                    i+=1;
//                    object.notifyAll();
//
//
//            }
//        }

        while (number < 10) {
            synchronized (o) {
                while (number % 3 != remainder) { // wait for numbers other than remainder
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + number);
                number+=1;
                o.notifyAll();
            }
        }
    }
}
public class PrintingSecuence {
    public static void main(String[] args) {
        MyProg myProg1=new MyProg(1);
        MyProg myProg2=new MyProg(2);
        MyProg myProg3=new MyProg(0);
        myProg1.start();
        myProg2.start();
        myProg3.start();



    }


}
