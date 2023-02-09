package sortUsingJava8;

public class Employee {
   private String name;
   private int id;
     private long salary;
    private String dept;

    public Employee(String name, int id, long salary, String dept) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.dept = dept;
    }
    public Employee() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
