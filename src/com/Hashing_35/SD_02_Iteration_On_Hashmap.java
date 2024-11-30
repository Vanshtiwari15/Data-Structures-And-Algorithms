package com.Hashing_35;

import java.util.*;
import java.util.Set;

public class SD_02_Iteration_On_Hashmap{
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        // Iterate
        // Hm.entrySet()
        Set<String> Keys = hm.keySet();
        System.out.println(Keys);

        for(String k : Keys){
            System.out.println("key="+k+ ",value="+hm.get(k));
        }
    }
}
