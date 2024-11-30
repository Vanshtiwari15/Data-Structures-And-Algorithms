package com.Hashing_35;

import java.util.HashSet;

public class SD_08_Hash_Set{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);
        // set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());

        if(set.contains(2)){
            System.out.println("set contains 2");
        }
//        if(set.contains(3)){
//            System.out.println("set contains 3"); // This line cannot print because 3 is not in a set
//        }

        set.remove(2);
        System.out.println(set.size());
        if(set.contains(2)){
            System.out.println("set contains 2"); // They also not print upper 2 is print they do not print because we remove 2 in just upper line
        }
    }
}
