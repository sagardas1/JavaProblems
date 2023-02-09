package Example;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass implements Cloneable{
   final  String name;
   final List<String> degree;


    public ImmutableClass(String name, List<String> degree) {
        this.name = name;
        this.degree = degree;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
       ImmutableClass immutableClass= (ImmutableClass) super.clone();
       // immutableClass.degree=degree;
return immutableClass;
    }
}
