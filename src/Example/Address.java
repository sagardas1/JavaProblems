package Example;

public class Address extends Employee{
    private String lane1;

    public Address(String name, int age, int salary) {
        super(name, age, salary);
    }

    public String getLane1() {
        return lane1;
    }

    public void setLane1(String lane1) {
        this.lane1 = lane1;
    }
}
