package ravi_intellij;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {
    public static void main(String[] args){
        List<String> l = new ArrayList<>();
        l.add("Ravi");
        l.add("Niranjan");
        l.add("Teja");
        for(String st : l){

            System.out.println(st);


        }

        System.out.println(l.remove("Teja"));

    }
}
