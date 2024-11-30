package com.Hashing_35;

import java.util.HashSet;
import java.util.Set;

public class SD_13_Union_And_Intersection_Of_2_Array{
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        HashSet<Integer> set = new HashSet<>();

        // Union
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }

        System.out.println("Union = " + set.size());
        System.out.println(set); // Elements of union and we will also find it via loop

        // Intersection
        set.clear();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        int count = 0;
        for(int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove((arr2[i])); // Alongside of remove we will run the loop and print the element of intersection
            }
        }

        System.out.println("Intersection = " + count);
    }
}
