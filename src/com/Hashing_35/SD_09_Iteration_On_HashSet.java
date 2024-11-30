package com.Hashing_35;

import java.util.HashSet;
import java.util.Iterator;

public class SD_09_Iteration_On_HashSet{
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai"); // Print in unordered way
        cities.add("Noida");
        cities.add("Bengaluru");

//        Iterator it = cities.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        // Advance Loop
        for(String city : cities){
            System.out.println(city);
        }
    }
}
