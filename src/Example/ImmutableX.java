package Example;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableX {
    private final String name;
    private ArrayList<Integer> degree;

    ImmutableX(String s,ArrayList<Integer> d){
        this.name=s;
        List< Integer> k=new ArrayList<>();

        for(Integer i:d){
            k.add(i);
        }
        degree= (ArrayList<Integer>) k;
    }


    public String getName(){return name;}
    public List<Integer> getDegree(){return (List<Integer>) degree.clone();}

}
