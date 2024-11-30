package com.Hashing_35;
import java.util.*;

public class SD_01_Hashmap_Operation{
    public static void main(String[] args){
        // Create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        // Get - O(1)
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia")); // They give null value because they do not present in our map

        // Containskey - O(1)
        System.out.println(hm.containsKey("India")); // True
        System.out.println(hm.containsKey("Indonesia")); // False

        // Remove - O(1)
        System.out.println(hm.remove("China"));
        System.out.println(hm);
        System.out.println(hm.remove("Indonesia"));

        // Size
        System.out.println(hm.size());

//        // Clear Function
//        hm.clear();

        // Is Empty
        System.out.println(hm.isEmpty()); // Is empty give false because after is empty the function will clear if we comment in the option clear before is empty then is empty shows true value because the map is clear and empty so is empty give true

        // Clear Function
        hm.clear();
    }
}
