package OverloadingAndOverridding;

import java.io.FileNotFoundException;
import java.nio.channels.FileLockInterruptionException;
import java.sql.SQLClientInfoException;

public class ClassB extends ClassA{
    int b=10;
    @Override
    public void m1() throws   FileLockInterruptionException,SQLClientInfoException,RuntimeException {
        System.out.println("i am from child class");
    }

    public void m2() throws Exception{
      // Object

    }
}
