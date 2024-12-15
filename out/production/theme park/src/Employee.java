//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package src;

public class Employee extends Person {
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int age, String id, String position, double salary) {
        super(name, age, id);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
