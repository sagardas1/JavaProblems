package OverloadingAndOverridding;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileLockInterruptionException;
import java.nio.file.FileAlreadyExistsException;
import java.sql.SQLClientInfoException;

public class ClassA extends Thread{
    @Override
    public void run(){
        System.out.println("running");
    }
int a=10;

static{
    System.out.println("am in static");
}
    {
        System.out.println("am in non -static");
    }
     void m1() throws FileNotFoundException,NullPointerException, FileLockInterruptionException, IOException, SQLClientInfoException {
        System.out.println("i am from parent class");
    }

    private void m2(){

    }
}
