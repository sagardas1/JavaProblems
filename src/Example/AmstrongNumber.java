package Example;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class AmstrongNumber {

    public static void main(String[] args) {
Map<String,Object> map=new HashMap<>();
        Object Object=new Object();
        map.getOrDefault("k",Object);
        String s="**";

    }

    public static void m1(Predicate p){

    }

    public static void m2(Employee e){

    }

    public static String removeStars(String s) {
        String s1="";
        int count=-1;
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='-' && i!=0){

                s1=s1+ "-";
                if(count==-1){
                    count=i-1;
                }


            }else
            {
if(s1.length()>0) {
    int k = i - 1;
    int l = count-s1.length()+1;
    String jj=s.substring(l , i );
   s= s.replaceAll(jj, "");
    s1 = "";
    i=0;

}
            }
        }
        return s;
    }
}
