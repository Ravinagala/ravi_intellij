package ravi_intellij;

import java.util.Arrays;
import java.util.Comparator;

class People implements Comparable<People>{
    private String name;
    private int age;

    public People(String name, int age){
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo(People other) {
        return this.name.compareTo(other.name);
    }


}

class CompareAges implements Comparator<People>{
    @Override
    public int compare(People p1, People p2){
        return p1.getAge()-(p2.getAge());
    }


}

public class TestPerson {
    public static void main(String[] args) {
        People[] people = {new People("Andy", 23),
                new People("Mark", 23),
                new People("Scott", 50),
                new People("Bill", 25)};

        Arrays.sort(people);    // by using comparable interface in sorted names

        for (var p : people)
            System.out.println(p);


        System.out.println();
        Arrays.sort(people, new CompareAges());    // by using comparator interface in sorted ages
        for(var p : people){
            System.out.println(p);

        }



//        Arrays.sort(people,(p1,p2) -> p1.getAge()-p2.getAge());
//        for(var p : people){
//            System.out.println(p);
//        }
    }
}
