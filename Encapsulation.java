package ravi_intellij;

public class Encapsulation {

    // instance variables
    private String name;
    private double salary;

    private static final double hraper = 20;

    //constructor

    public Encapsulation(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    // setter and getter methods

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary+
               this.salary * Encapsulation.hraper / 100;
    }

//    public static void setHraper(double hraper){
//        Encapsulation.hraper = hraper;
//    }

    public static double getHraper(){
        return Encapsulation.hraper;
    }
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation("ravi",30000);
        System.out.println(e.getSalary());
        //Encapsulation.setHraper(25);
        System.out.println(e.getSalary());

    }
}
