package com.ArrayList_23;

import java.util.ArrayList;

public class SD_04_Reverse_Of_An_AL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // O(1)
        list.add(2); // O(1)
        list.add(3); // O(1)
        list.add(4); // O(1)
        list.add(5); // O(1)

        // Reverse print - O(n)
        for(int i= list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
