package Example;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
import java.util.stream.Collectors;
 final class k{
static  int i=0;
        }
public class Test11 extends Thread{

    public static void main(String[] args) {

        Employee e1=new Employee("sagar",1,1);
        Employee e2=new Employee("sagar",1,1);
        System.out.println(e1.equals(e2));
        Test11 test11
                =new Test11();
        Thread thread=new Thread(test11);
        thread.start();
        thread.start();


String s="Sagar";
Optional<String> o=Optional.ofNullable(s);
        int[] arr = new int[7];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 2;
        arr[5]=3;
        arr[6]=9;
        Arrays.sort(arr);
        int j = arr.length;
        for (int i = 0; i < j; i++) {
            if (i != 0) {
                if (arr[i - 1] == arr[i]) {
                    int l = arr[i];
                    for (int b = i; b < j ; b++) {

                        arr[b - 1] = arr[b];

                    }
                    arr[j-1 ] = l;
                    j--;
                }
            }

        }

        for (int i = 0; i < j; i++) {
            System.out.println(arr[i]);
        }
//
//        List<Integer> list=new ArrayList<>();
//
//
////        System.out.println(list.add(10));
////        System.out.println(list.add(10));
//        list.add(2);
//        list.add(200);
////        list.add(200);
////        list.add(12);
////        list.add(22); list.add(11);
////        list.add(10); list.add(100); list.add(100); list.add(15); list.add(19);
//
//
////      List<Integer> l=  list.stream().filter(p-> (String.valueOf(p).charAt(0)!='1')).sorted().distinct().collect(Collectors.toList());
////        System.out.println(l);
//
//int a=10;
//        System.out.println((a+"").getClass());
//
//
//list.stream().mapToInt(p->p).sum();
//
//    }
//
        List<String> list=new ArrayList<>();

        list.add("sagar");
        list.add("sagarkumar");

        System.out.println( list.stream().filter(p->p.contains("kumar")).collect(Collectors.toList()));

    }
}
