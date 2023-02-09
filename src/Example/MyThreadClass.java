package Example;


class MyThread {
    volatile  int i;


    public void even() throws InterruptedException {
        synchronized (this) {
            for (i = 0; i < 100; i++) {
                if (i % 2 == 0) {
                    System.out.println("even");

                }
            }
            notify();
        }
    }
    public void odd() throws InterruptedException {
        synchronized (this) {
            for (i = 0; i < 100; i++) {
                if (i % 2 == 0) {
                    System.out.println("odd");

                }
            }
            notify();
        }
    }
}
public class MyThreadClass {
    public static void main(String[] args) {
        MyThread obj=new MyThread();
       Thread thread1=new Thread(new Runnable() {
           @Override
           public void run() {
               try {
                   obj.even();
                   wait();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }

           }
       });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    obj.odd();
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });

    }
}
