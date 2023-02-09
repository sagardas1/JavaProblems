package compaeablee;

public class Employee implements Comparable<Employee>{
    String name;
    Integer rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }



    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
