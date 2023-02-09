package Example;

public class MyCLaaa {
    public static void main(String[] args) throws UnderAgeException {
        Employee e=new Employee("Sagar",18,19);
        MyCLaaa myCLaaa=new MyCLaaa();
        myCLaaa.m1(e);

        String s="sagar";
      //  s.split("")

    }

    public void m1(Employee e) throws UnderAgeException {
        if(e.getAge()<18){throw new UnderAgeException("age is not above +18");}

        System.out.println("valid age");
    }
}


