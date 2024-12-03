package com.Tries_36;

public class SD_06_Starts_With_Problem{
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

    public static boolean search(String key){
        Node curr = root;
        for(int level=0; level<key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.eow = true;
    }

    public static boolean startsWith(String prefix){ // O(L)
        Node curr = root;

        for(int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }
    public static void main(String[] args) {
        String words[] = {"apple", "app", "mango", "man", "woman"};
        String prefix1 = "app"; // True
        String prefix2 = "moon"; // False

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(startsWith(prefix1));
        System.out.println(startsWith(prefix2));
    }
}
