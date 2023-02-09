package Example;

import java.util.ArrayList;
import java.util.List;

public class StringExample {
    public static void main(String[] args) {
        String s="sag@h$k^";
       char k[]= s.toCharArray();

       List<Character> list=new ArrayList<>();
       for(int i=0;i<s.length();i++){
if(k[i]>=97 &&k[i]<=125){
    list.add(k[i]);
}
       }
       int j=list.size()-1;
for(int i=0;i<k.length;i++){
    if(k[i]>=97 &&k[i]<=125){
        k[i]=list.get(j);
        j--;
    }
}
        System.out.println(s);
        System.out.println(String.valueOf(k));
    }
}
