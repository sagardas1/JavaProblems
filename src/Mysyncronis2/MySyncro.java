package Mysyncronis2;

public class MySyncro {

    private  static MySyncro mySyncro=null;


    private MySyncro(){}

    public static MySyncro getInstance(){
        if(mySyncro==null){
            synchronized (MySyncro.class){
                if(mySyncro==null) {
                    mySyncro = new MySyncro();
                }
            }
        }
        return mySyncro;
    }
}
