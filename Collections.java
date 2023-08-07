package ravi_intellij;

import java.util.TreeMap;

public class Collections {
    public static void main(String[] args){
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(1,"ravi");
        tm.put(2,"teja");
        tm.put(3,"Niranjan");
        tm.put(4,"img");
        System.out.println("TreeMap Output");
        System.out.println(tm.get(1));
        for(int key : tm.keySet()){
            System.out.printf("%s : %s\n", key, tm.get((key)));
        }

    }
}
