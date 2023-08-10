package ravi_intellij;

import java.util.*;

class Persons implements Comparable<Persons>{
    private String name;
    private int age;

    public Persons(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int compareTo(Persons other){
        return this.name.compareTo(other.name);
    }

    public String toString(){
        return name +"-"+age;
    }

//    public int compareTo(Persons other){
//        return this.age - other.age;
//    }

}


public class SortPersons {
    public static void main(String[] args) {
        var people = new TreeSet<Persons>();

        people.add(new Persons("Virat",35));
        people.add(new Persons("Sachin",45));
        people.add(new Persons("Virat",39));
        people.add(new Persons("Roger",42));


        for(var p : people){
            System.out.println(p);
        }

        System.out.println();


    }


}
