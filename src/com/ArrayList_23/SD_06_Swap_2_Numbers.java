package com.ArrayList_23;

import java.util.ArrayList;

public class SD_06_Swap_2_Numbers {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2); // O(1)
        list.add(5); // O(1)
        list.add(9); // O(1)
        list.add(3); // O(1)
        list.add(6); // O(1)

        int idx1 = 1, idx2 = 3;
        System.out.println(list);
        swap(list, idx1, idx2);
        System.out.println(list);
    }
}
