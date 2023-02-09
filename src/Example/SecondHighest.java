package Example;
import java.util.*;
import java.util.stream.Collectors;

public class SecondHighest {

    public void n1(Object o){
        System.out.println("object");
    }

    public static void n1(String o){
        System.out.println("str");
    }
    public static void main(String[] args) {
n1(null);

        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};

        int firstIndex=-1;
        int lastIndex=0;
        int check=0;
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(sum==0 && a[i]<0){}else{
                check=sum;

               sum+=a[i];
               if(sum<0){
                   firstIndex=0;
                   lastIndex=0;
                   sum=0;
               }else{
                   if(firstIndex==-1){
                       firstIndex=i;
                   }
                   lastIndex=i;
               }
            }

        }

        System.out.println(sum);
        System.out.println(firstIndex);
        System.out.println(lastIndex);


        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,0,1,2,3,4,3,2,3,2,10,3,6,8,9,10));
        int smallest=list.get(0);
        int largest=list.get(0);
int j=list.size()-1;
for(int i=0;i<list.size()/2;i++){

    if(list.get(i)>largest){
        largest=list.get(i);
        if(list.get(j)>largest){
            largest=list.get(j);
        }
    }
    if(list.get(i)<smallest){
        smallest=list.get(i);
        if(list.get(j)<smallest){
            smallest=list.get(j);
        }
    }
}
        System.out.println(largest);
        System.out.println(smallest);
        //get unique numbers ,get odd numbers from list ,squre them ,sort them in desc

        List<Integer> l=list.stream()
                .distinct()
                .filter(p->p%2!=0)
                .map(k->k*k)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

//        int a[]={6,8,9,100,88,99,1001,901};
//        int min=0;int max=0;
//
//        for(int i=0;i<a.length;i++){
//            if(i==0){
//                max=i;
//                min=i;
//
//            }else{
//                if(a[i]>max){
//                    min=max;
//                    max=a[i];
//                }else if(a[i]<max && a[i]>min){
//                    min=a[i];
//                }
//            }

        //    }
      //  System.out.println(min);
    }
}
