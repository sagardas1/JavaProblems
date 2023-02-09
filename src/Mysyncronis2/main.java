package Mysyncronis2;

public class main {
    public static void main(String[] args) {
        MySyncro mySyncro=MySyncro.getInstance();
        MySyncro mySyncro1=MySyncro.getInstance();

        System.out.println(mySyncro1);
        System.out.println(mySyncro);

    }
}
