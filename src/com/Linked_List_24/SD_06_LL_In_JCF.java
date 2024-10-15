package com.Linked_List_24;
import java.util.LinkedList; // JCF - optimized best time and space complexity

public class SD_06_LL_In_JCF {
    public static void main(String[] args) {
        // Create - objects int, float, boolean -> Integer, Float, Character
        LinkedList<Integer> ll = new LinkedList<>();

        // Add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        // 0->1->2
        System.out.println(ll);

        // Remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}

