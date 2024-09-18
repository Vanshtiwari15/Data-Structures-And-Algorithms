package com.ArrayList_23;

import java.util.ArrayList;

public class SD_02_Operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1); // O(1)
        list.add(2); // O(1)
        list.add(3); // O(1)
        list.add(4); // O(1)
        list.add(5); // O(1)

        System.out.println(list);

        list.add(1, 9); // O(n)
        System.out.println(list);

        // Get Operations - O(1)
//        int element = list.get(2);
//        System.out.println(element);

        // Delete
//        list.remove(2);
//        System.out.println(list);

        // Set
//        list.set(2, 10);
//        System.out.println(list);

        // Contains
//        System.out.println(list.contains(1));
//        System.out.println(list.contains(11));
    }
}
