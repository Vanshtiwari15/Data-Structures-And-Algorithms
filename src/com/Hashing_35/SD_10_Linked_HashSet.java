package com.Hashing_35;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class SD_10_Linked_HashSet{
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai"); // Print in unordered way
        cities.add("Noida");
        cities.add("Bengaluru");
        // System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai"); // Print in ordered way
        lhs.add("Noida");
        lhs.add("Bengaluru");
        // System.out.println(lhs);

//        lhs.remove("Delhi");
//        System.out.println(lhs);

        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Iterator it2 = lhs.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
    }
} // We will use iterator and for loop in Linked hashset same as we use in hashset or hashmap in fact all functions we will use like remove add etc
