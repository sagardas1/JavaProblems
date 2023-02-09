package Example;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
class Parent {


        public void m1( ){
        }


        }


        class Chiled  extends Parent{

        public void m2(){
        }

        }

public class Test2 {
    private static boolean isPrime(int a){

        if(a==0 ||a==1){
            return false;}
        int count=0;
        for(int i=1;i<a;i++){
            if(a%i==0){count++;}}

        if(count==1){
            return true;}else{return false;}
    }


    public static int m1(){
        try{
            int k=10/0;
        }catch(Exception e){
         return 1000;

        }finally {
            return 100;
        }


    }
    public static void main(String[] args) {
HashMap<String,Integer> map=new HashMap<>();
map.put(null,1);
        map.put(null,1);

        System.out.println(map.size());
       HashSet<String> tree=new HashSet<>();
        tree.add(null);
        tree.add(null);
        System.out.println(tree.size());
        System.out.println(isPrime(2));
        Chiled chiled
                =new Chiled();
        chiled.m1();




    }
}
