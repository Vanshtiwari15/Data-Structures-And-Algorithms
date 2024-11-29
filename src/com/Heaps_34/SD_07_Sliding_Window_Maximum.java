package com.Heaps_34;

import java.util.*;

public class SD_07_Sliding_Window_Maximum{
    static class Pair implements Comparable<Pair>{
        int val;
        int idx;

        public Pair(int val, int idx){
        this.val = val;
        this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2){
            // Ascending order
            // Return this.val - p2.val
            // Descending
            return p2.val - this.val;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3; // Window size
        int res[] = new int[arr.length-k+1]; // N-k+1

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // 1st window
        for(int i=0; i<k; i++){
            pq.add(new Pair(arr[i], i));
        }

        res[0] = pq.peek().val;

        for(int i=k; i< arr.length; i++){
            while(pq.size() > 0 && pq.peek().idx <= (i-k)){
                pq.remove();
            }

            pq.add(new Pair(arr[i], i));
            res[i-k+1] = pq.peek().val;
        }

        // Print result
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
        System.out.println( );
    }
}