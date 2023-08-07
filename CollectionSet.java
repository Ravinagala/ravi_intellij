package ravi_intellij;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {
    public static void main(String[] args){
        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        System.out.println(s.contains(2));
        System.out.println(s);
    }
}
