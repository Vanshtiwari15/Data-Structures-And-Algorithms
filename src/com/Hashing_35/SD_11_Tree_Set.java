package com.Hashing_35;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SD_11_Tree_Set{
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai"); // Print in unordered way
        cities.add("Noida");
        cities.add("Bengaluru");
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai"); // Print in ordered way
        lhs.add("Noida");
        lhs.add("Bengaluru");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai"); // Print in ascending order
        ts.add("Noida");
        ts.add("Bengaluru");
        System.out.println(ts);
    }
} // In this also all the Same function will use
