package Example;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex10000 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService= Executors.newFixedThreadPool(10);
    Future<Integer> f= executorService.submit(()-> {return 10;});
    f.get();
        System.out.println(f.get());

        CompletableFuture<Void> c=CompletableFuture.runAsync(()->{for(int i = 0; i<10; i++){
            System.out.println(i);
        }});
        c.get();

//
//       List<Integer> list=new ArrayList<>();
//       list.add(10);
//       list.add(20);
//       list.add(33);
//       list.add(100);
//       list.add(-10);
//        list.add(-10);
//
//        list.stream().collect(Collectors.groupingBy(o->o,Collectors.counting())).entrySet().stream().filter(p->p.getValue()>1).map(o->o.getKey()).forEach(y-> System.out.println(y));
//


//        Predicate<Integer> u=k->k%2==0;
//        System.out.println(l(list,u));
//       list.stream().filter(p->p>0).filter(o->o%2==0).map(k->k*k).sorted(Collections.reverseOrder()).forEach(d-> System.out.println(d));
    }
    public static List<Integer> l(List<Integer> l,Predicate<Integer> p){
        return l.stream().filter(p).collect(Collectors.toList());
    }



}
