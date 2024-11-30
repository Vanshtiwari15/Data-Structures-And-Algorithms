package com.Hashing_35;

import java.util.HashMap;
import java.util.TreeMap;

public class SD_05_Tree_Map{
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50); // Sorting are basis on key not in basis of value
        tm.put("Indonesia", 6);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);
        System.out.println(tm);
    }
}
