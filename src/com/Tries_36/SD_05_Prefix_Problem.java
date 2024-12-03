package com.Tries_36;

import java.security.PublicKey;

public class SD_05_Prefix_Problem{
    static  class Node{
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;

        public Node(){
            for(int i=0; i<children.length; i++){
                children[i] = null;
            }
            freq = 1;
        }
    }

    public Node root = new Node();

    public void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            } else{
                curr.children[idx].freq++;
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }
    public static void main(String[] args) {
        String arr[] = {"zebra", "dog", "duck", "dove"};
        for(int i=0; i< arr.length; i++){

        }
    }
}
