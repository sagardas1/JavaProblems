package superpackage;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
import java.util.stream.Collectors;

public class MainClass {











final List list;
    MainClass(List l){
   this.list=l;

    }
    //0 1 1 2 3
public static int febo(int i){

        if(i<=1){
            return i;
        }
      return  febo(i-1)+febo(i-2);
}

public static void reverse(String s ,int i ){
        if(i>=s.length()){
            return ;
        }
         reverse(s,i+1);
    System.out.print(s.charAt(i));




}

public static int power(int a,int b){

        if(b==1){return a;}
        return a*power(a,b-1);
}

public static void reverse(int n){
        if(n==0){
            return;
        }

        reverse(n/10);
    System.out.print(n%10);

}
public static void countDown(int i, int k){
        if(k>i){
            return;
        }
        countDown(i,k+1);
    System.out.println(k);
}
public static int findFact(int n){
        if(n<=1){
            return 1;
        }
        return n*findFact(n-1);

}



    public static int power1(int a,int b){

        if(b==1){return a;}

        return a* power1(a,b-1);
    }


    public static void main(String[] args) throws ClassNotFoundException {


        int arr[]={1,2,34,5,6};
        Arrays.stream(arr).boxed().filter(p->p!=2);
        System.out.println(power1(2,3));
         System.out.println("-----------------");
        reverse(10);
 countDown(5,0);
        System.out.println("-----------------");
        System.out.println(findFact(3));
        int a[]={10,2,3,5,12,13};
        System.out.println( febo(5));
 reverse("sagar",0);

        System.out.println();

//
//        String s="34256119";
//
//       for(int i=0;i<s.length();i++){
//           if(s.indexOf(s.charAt(i))!=s.lastIndexOf(s.charAt(i))){
//               System.out.println(s.charAt(i));
//               break;
//           }
//
//       }


//String S1="ABC";
//String S2=new String("ABC");
//
//        EmployeeDetails -
//        int id,
//        String name,
//        double salary,
//        String gender,
//        List<String> hobbies
//
//
//
//        filter employees having salary greater than 10000 and hobby is Music
//
//
//
//




//        String str = "s@%#$r";
//        String s=""; //sr
//
//        for(int i=0;i<str.length();i++){
//            if((str.charAt(i)>=65 && str.charAt(i)<=90 )|| str.charAt(i)>=97 && str.charAt(i)<=122){
//
//                s+=str.charAt(i);
//            }
//        }
//int size=s.length()-1;
//       char c[]=str.toCharArray();
//      //  s @ % # $ r
//
//        for(int i=0;i<c.length;i++){
//            if((c[i]>=65 && c[i]<=90 )|| c[i]>=97 && c[i]<=122){
//
//                c[i]=s.charAt(size);
//                size-=1;
//            }
//        }
//
//        System.out.println(String.valueOf(c));
//
//




      //  System.out.println(occ("AB","ABA BABCABA"));
//        Map<String,Integer> map=new HashMap<>();
//        map.put("s",10);
//        map.put("u",20);
//        map.put("a",20);
//
//        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry.comparingByKey()).thenComparing(Map.Entry.comparingByValue())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(o1,o2)->o1,LinkedHashMap::new));


       // {1,3,4,7,8,}  {9,2,4,6,5}

//
//        int a[]={1,3,4,7,8};
//        int b[]={9,2,4,6,5};
//
//        int c[]=new int[a.length+b.length];
//int j=0;
//
//        for(int i=0;i< a.length;i++){
//            c[j]=a[i];
//            j+=1;
//        }
//
//        for(int i=0;i< b.length;i++){
//            c[j]=b[i];
//            j+=1;
//        }
//
//
//        for(int i=0;i<c.length;i++){
//            for(int k=0;k<c.length;k++){
//                if(c[i]<c[k]){
//                    int temp=c[i];
//                    c[i]=c[k];
//                    c[k]=temp;
//                }
//            }
//        }
//
//        for(int i:c){
//            System.out.print(i+" ");
//        }
int a11[][]={ {1,4,0},
        {0,0,0},
        {4,0,0}};
        int count=0;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                if(a11[i][j]==0){
                    count+=1;
                }
            }
        }
if(count>5){
    System.out.println("given matrix is a sparse matrix.");
}else {
    System.out.println("given matrix is not a sparse matrix.");
}

//
//
//      String s=  "My name is Sagar";
//       //
//        //ym eman si Ragas
//
//        String arr[]=s.split(" ");
//        String s2="";
//        for(int i=0;i< arr.length;i++){
//            String k=arr[i];
//            String rev="";
//
//            for(int j=k.length()-1;j>=0;j--){
//                rev+=k.charAt(j);
//
//            }
//            s2+= rev+" ";
//
//        }
//        System.out.println(s2);


        /*
//Map<Integer,String> map=new HashMap<>();
//map.put(new Integer(0),"B");
//        map.put(new Integer(1),"R");
//        map.put(new Integer(2),"G");
//
//        System.out.println(map.get(1));
//
//
//        System.out.println(Class.forName("String").getName());
//
//        Integer i=200;
//        Integer j=200;
//        System.out.println(i==j);
//        System.out.println(i.equals(j));
//Boolean b1=new Boolean(true);
//        Boolean b2=new Boolean(false);
//        Boolean b3=new Boolean("false");
//        Boolean b4=new Boolean(b1);
//
//        System.out.println(b1.equals(b4));
//
//        System.out.println(b1==b3);
//        System.out.println(b1==b4);

//
//
//
//
//Map<String,Integer> map=new HashMap<>();
//        map.entrySet().stream().sorted(Comparator.comparing(p->p.getValue())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (o1,o2)->o1,LinkedHashMap::new));
//
//        List<Integer> l=new ArrayList();
//        l.stream().mapToInt(p->p).sum();
//
//        try{
//
//            m1();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//
//        }
//
//
//
//    public static void m1(){
//
//        int i=10/0;
//
//        System.out.println("sagar");
//        System.out.println("sagar");
//
//        System.out.println("sagar");
//    }


        MainClass mainClass=new MainClass();
        System.out.println(mainClass.fact(10));


    }






    int fact(int n)
    {
        if (n <= 1) {// base case
            return 1;
        }
        else
            return n*fact(n-1);
    }
*/
    }
}

