package Example;
class Cricket{
    Cricket(){
        System.out.println("object is created");
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("in finalize method");
    }
}
public class TheGarbageCollectorprogram {
    public static void main(String[] args) {
        Cricket cricket
                =new Cricket();
        cricket=null;
        System.gc();
        System.out.println("main ended...");


    }

}
