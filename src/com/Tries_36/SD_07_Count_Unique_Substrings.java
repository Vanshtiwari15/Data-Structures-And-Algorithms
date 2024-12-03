package com.Tries_36;

public class SD_07_Count_Unique_Substrings{
    static class Node{
        Node children[] = new Node[26]; // 'a' - 'z'
        boolean eow = false; // First always initialization as false

        public Node(){
            for(int i=0; i<26; i++){
                children[i] = null; // False is not in constructor they define in upper in eow
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word){ // O(L)
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }

        int count = 0;
        for(int i=0; i<26; i++){
            if(root.children[i] != null){
                count += countNodes(root.children[i]);
            }
        }

        return count+1;
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.eow = true;
    }
    public static void main(String[] args) {
        String str = "ababa"; // Ans = 10;

        // Suffix -> insert in trie
        for(int i=0; i<str.length(); i++){
            String suffix = str.substring(i);
            insert(suffix);
        }

        System.out.println(countNodes(root));
    }
}
