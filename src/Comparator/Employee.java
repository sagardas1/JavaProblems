package Comparator;

public class Employee {
    public Employee(String name, int age, int salary) {

        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    private String name;
    private int age;
    private int salary;

    final String a="sagar";

final void m1(){
    System.out.println("method sagar");
}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

//    @Override
//    public boolean equals(Object obj) {
//        Employee em= (Employee) obj;
//        return this.getName().equals(em.getName());
//
//    }

}
