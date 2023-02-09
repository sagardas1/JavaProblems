import java.util.*;

public class GroupAnargram {
    public static void main(String[] args) {
        String s[]={"cat","dog","god","ogd","act","tac"};

        Map<String,List<String>> map=new HashMap<>();

        for(int i=0;i<s.length;i++){
            char arr[]=s[i].toCharArray();
            Arrays.sort(arr);

         String k=   String.valueOf(arr);
            System.out.println(k);
            if(map.containsKey(k)){
                List<String> l=map.get(k);
                l.add(s[i]);
                map.put(k,l);

            }else{
                List<String> list=new ArrayList<>();
                list.add(s[i]);
                map.put(k,list);
            }
        }

        for(Map.Entry<String,List<String>> en:map.entrySet()){
            System.out.println(en.getKey()+" --->>> "+en.getValue());
        }
    }

}
