package com.Hashing_35;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Set;

public class SD_03_Hashmap_Implementation{
    static class Hashmap<K, V>{
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n; // n
        private int N;
        private LinkedList<Node> buckets[]; // N = bucket.length

        @SuppressWarnings("unchecked")
        public Hashmap(){
            this.N = N;
            this.buckets = new LinkedList[4];
            for(int i=0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hc = key.hashCode();
            // 1234567; -1234567
            return Math.abs(hc) % N;
        }

        private int SearchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for(int i=0; i<ll.size(); i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBbuck[] = buckets;
            buckets = new LinkedList[N*2];
            N = 2*N;
            for(int i=0; i< buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }

            // Nodes -> add in bucket
            for(int i=0; i<oldBbuck.length; i++){
                LinkedList<Node> ll = oldBbuck[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }
        public void put(K key, V value){ // O(lambda) -> O(1)
            int bi = hashFunction(key); // idx -> 0 to size-1 size-1 = 3
            int di = SearchInLL(key, bi); // Valid; or not Valid -> -1

            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            } else{
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double)n/N;
            if(lambda > 2.0){
                rehash();
            }
        }

        public boolean containsKey(K key){ // O(1)
            // return false;
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if(di != -1){
                return true;
            } else{
                return false;
            }
        }

        public V remove(K key) { // O(1)
            // return null;
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if(di != -1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else{
                return null;
            }
        }
        public V get(K key){ // O(1)
            // return null;
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if(di != -1){
                Node node = buckets[bi].get(di);
                return node.value;
            } else{
                return null;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(Node node : ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n == 0;
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);

        Set<String> Keys = hm.keySet(); // Original way to get the keys
        ArrayList<String> keysList = new ArrayList<>(Keys); // Convert Set to ArrayList

        // ArrayList<String> Keys = hm.keySet();
        for(String Key : Keys){
            System.out.println(Key);
        }
        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));
    }
}
