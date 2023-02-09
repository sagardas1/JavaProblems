package multithreadinf;

public class MyThread extends  Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("thread");
    }

    public static void main(String[] args) {

        MyThread thread=new MyThread();
        thread.start();

    }
}

