package ravi_intellij;

abstract class Employee {

    protected String name, desg;

    public Employee(String name, String desg) {
        this.name = name;
        this.desg = desg;

    }

    final public String getDesg() {
        return desg;
    }

    final public void setDesg(String desg) {
        this.desg = desg;

    }

    final public String getName() {
        return name;
    }

    public abstract int getPay(); // abstract method
}
class RegularEmployee extends Employee {

    protected int salary;

    public RegularEmployee(String name, String desg,
                           int salary) {

        super(name, desg);
        this.salary = salary;
    }
    @Override
    public int getPay() {
        return salary;
    }
}
class Consultant extends Employee {

    protected int nohours, hourrate;
    public Consultant(String name, String desg,

                      int nohours, int hourrate) {
        super(name, desg);
        this.nohours = nohours;
        this.hourrate = hourrate;
    }
    @Override
    public int getPay() {
        return nohours * hourrate;
    }



}
public class TestEmployee {
    public static void main(String[] args) {
        Employee e = new RegularEmployee("ravi", "developer", 30000); // upcasting
        System.out.printf("%s  -%s  -%d", e.getName(), e.getDesg(), e.getPay());  // run-time polymorphism

        System.out.println();


        Employee e1 = new Consultant("jai", "system analyst", 8, 400); // upcasting
        System.out.printf("%s  -%s -%d", e1.getName(), e1.getDesg(), e1.getPay());// run-time polymorphism
    }
}
