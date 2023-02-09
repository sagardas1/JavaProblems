package LamdbaExpression;

public class LambdawithTread {

    public static void main(String[] args) {

        Runnable r=()->{System.out.println("thread is running");};


        Thread thread=new Thread(r);
        thread.start();
    }
}
