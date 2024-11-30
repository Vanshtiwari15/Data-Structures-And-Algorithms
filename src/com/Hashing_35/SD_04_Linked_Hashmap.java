package com.Hashing_35;

import java.util.LinkedHashMap;
import java.util.HashMap;

public class SD_04_Linked_Hashmap{
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);  // They give in ordered sequence
        lhm.put("US", 50);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);  // They give in inordered sequence
        hm.put("US", 50);

        System.out.println(hm);
        System.out.println(lhm);
    }
}
