package Example;

import java.util.ArrayList;
import java.util.List;

public  class immutableClaassss
{

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        list.add(1);list.add(2);list.add(2);list.add(3);list.add(2);list.add(4);list.add(4);list.add(5);list.add(6);list.add(6);list.add(7);list.add(7);list.add(7);list.add(2);




        for(int i=0;i<list.size();i++){
            if(i+1< list.size()){

                if(i==0){
                    if(list.get(i)==list.get(i+1)){}else{list1.add(list.get(i));}
                }else{
                    if(list.get(i)==list.get(i-1) || list.get(i)==list.get(i+1)){}else{
                        list1.add(list.get(i));
                    }
                }
            }
        }
        if(list.get(list.size()-1)==list.get(list.size()-2)){}else{
            list1.add(list.get(list.size()-1));
        }
        System.out.println(list);
        System.out.println(list1);



    }
}
