package ravi_intellij;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<>();
        al.add("Ravi");
        al.add("Niranjan");
        al.add("Teja");
        al.add(1,"imaginnovate");
        System.out.println(al.get(0));
        System.out.println(al);
    }
}
