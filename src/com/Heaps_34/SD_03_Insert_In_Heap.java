package com.Heaps_34;
import java.util.*;

public class SD_03_Insert_In_Heap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) { // O(logn)
            // Add at last idx
            arr.add(data);

            int x = arr.size() - 1; // X is child index
            int par = (x - 1) / 2; /// Par index

            while (arr.get(x) < arr.get(par)) { // O(logn)
                // Swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }

            if(minIdx != i){
                // Swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove(){
            int data = arr.get(0);

            // Step1 - swap first & last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // Step2 - delete last
            arr.remove(arr.size()-1);

            // Step3 - heapify
            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return arr.size() == 0;

        }
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()){ // Heap sort
            System.out.println(h.peek());
            h.remove();
        }
    }
}

/*
        Heap pq = new Heap();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);

        while(!pq.isEmpty()){ // Heap sort
            System.out.println(pq.peek());
            h.remove();
        } We will direct use jcf using pq they work also same in heap we write insert and remove function but in pq we direct implements all via jcf pq also use instead of h infact p w x t anyone can use instead of h but pq direct implements as jcf
    }
}
 */