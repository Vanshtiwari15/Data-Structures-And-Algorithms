package com.Tries_36;

public class SD_01_Creation_A_Tries{
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false; // First always initialization as false

        Node(){
            for(int i=0; i<26; i++){
                children[i] = null; // False is not in constructor they define in upper in eow
            }
        }
    }

    public static Node root = new Node();

    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};
    }
}
