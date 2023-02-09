package Example;

public class MySingle extends Object implements Cloneable{

    private static  MySingle mySingle= null;

    private MySingle(){}

    protected static MySingle getInstance(){
        synchronized (MySingle.class){
        if(mySingle==null){
            mySingle=new MySingle();

        }}
        return mySingle;
    }
}
