package com.ArrayList_23;

import java.util.ArrayList;
import java.util.Collections;

public class SD_07_Sorting_An_AL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2); // O(1)
        list.add(5); // O(1)
        list.add(9); // O(1)
        list.add(3); // O(1)
        list.add(6); // O(1)

        System.out.println(list);
        Collections.sort(list); // Ascending
        System.out.println(list);

        // Descending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
