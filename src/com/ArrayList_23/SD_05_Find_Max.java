package com.ArrayList_23;

import java.util.ArrayList;

public class SD_05_Find_Max {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2); // O(1)
        list.add(5); // O(1)
        list.add(9); // O(1)
        list.add(3); // O(1)
        list.add(6); // O(1)

        // O(n)
        int max = Integer.MIN_VALUE;
        for(int i=0; i< list.size(); i++){
//            if(max < list.get(i)){
//                max = list.get(i);
//            }
            max = Math.max(max, list.get(i));
        }
        System.out.println("Max Element = " + max);
    }
}
