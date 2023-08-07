package ravi_intellij;

import java.util.TreeMap;

public class Map {
    public static void main(String[] args){
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(1,"Ravi");
        tm.put(2,"Niranjan");
        tm.put(3,"Teja");
        for(int k : tm.keySet()){
            System.out.printf("%s:%s\n",k,tm.get(k));
        }
    }
}
